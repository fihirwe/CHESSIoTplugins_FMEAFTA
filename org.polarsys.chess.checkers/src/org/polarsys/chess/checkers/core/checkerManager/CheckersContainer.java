/*******************************************************************************
 * Copyright (C) 2020 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 ******************************************************************************/
package org.polarsys.chess.checkers.core.checkerManager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.uml2.uml.Package;

public class CheckersContainer {

	private static final Logger logger = Logger.getLogger(CheckersContainer.class);
	
	List<Checker> checkers;
	CheckerManager checkerManager;
	
	public CheckersContainer(CheckerManager checkerManager) {
		this.checkers = new ArrayList<Checker>();
		this.checkerManager = checkerManager;
		checkerManager.register(this);
	}

	/**
	 * Runs the selected checkers in an asynchronous way.
	 * @param checkersTags
	 * @throws Exception
	 */
	public void run(Set<String> checkersTags) throws Exception {
		boolean isFirstChecker = true;

		for (Checker checker : checkers) {
			checkerManager.updateCheckerStatus(checker.unifiedName, false);
			if (checker.belongsTo(checkersTags)) {
				logger.debug("run " + checker.getUnifiedName());
				checker.asyncCheck(isFirstChecker);
				isFirstChecker=false;
			}
		}
	}

	/**
	 * Launches the initSync() of the selected checkers.
	 * @param checkersTags
	 * @param systemViewPackage the SystemViewPackage
	 * @throws Exception
	 */
	public void initSync(Set<String> checkersTags, Package systemViewPackage) throws Exception {
		for (Checker checker : checkers) {
			if (checker.belongsTo(checkersTags)) {
				logger.debug("init " + checker.getUnifiedName());
				checker.initSync(systemViewPackage);
			}
		}
	}

	/**
	 * Runs the check() of the selected checkers and returns the scheduled jobs.
	 * @param checkersTags
	 * @return the list of scheduled jobs 
	 */
	public List<Job> checkSync(Set<String> checkersTags, Package pkg) {
		final List<Job> jobs = new ArrayList<Job>();
		for (Checker checker : checkers) {
			checkerManager.updateCheckerStatus(checker.unifiedName, false);
			if (checker.belongsTo(checkersTags)) {
				logger.debug("run " + checker.getUnifiedName());
				jobs.add(checker.syncCheck(pkg));
			}
		}
		return jobs;
	}

	public void register(Checker checker) {
		Optional<Checker> alreadyRegisteredChecker = find(this.checkers,checker.unifiedName);
		if(!alreadyRegisteredChecker.isPresent()){
			logger.debug("register checker not present: "+checker.registerPriority);
			this.checkers.add(checker);
		}else if((alreadyRegisteredChecker.get().registerPriority < checker.registerPriority)){	
			logger.debug("register checker already registered with priority: "+alreadyRegisteredChecker.get().registerPriority);
			logger.debug("checker to register with priority: "+checker.registerPriority);
			
			this.checkers.remove(alreadyRegisteredChecker.get());
			this.checkers.add(checker);
			//return;
		}
		//this.checkers.add(checker);
	}

	public Optional<Checker> find(final List<Checker> list, final String name){
	    return list.stream().filter(o -> o.unifiedName.equals(name)).findFirst();
	}
	
	public Collection<? extends String> getTags() {
		Set<String> tags = new HashSet<String>();
		for (Checker checker : checkers) {
			tags.addAll(checker.getCheckerTags());
		}
		return tags;
	}

	public List<Checker> getCheckers() {
		return checkers;
	}

}