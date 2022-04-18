/*******************************************************************************
 * Copyright (C) 2020 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 ******************************************************************************/
package org.polarsys.chess.checkers.core.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.uml2.uml.Package;
import org.polarsys.chess.checkers.core.checkerManager.Checker;
import org.polarsys.chess.checkers.core.checkerManager.CheckerMessage;
import org.polarsys.chess.contracts.profile.chesscontract.util.EntityUtil;


public class TestChecker2 extends Checker {

	org.eclipse.uml2.uml.Package systemViewPackage;
	private IFile file;
	
	public TestChecker2(String unifiedName, Set<String> checkerTags) {
		super(unifiedName,  checkerTags);
	}


	@Override
	public List<CheckerMessage> check(IProgressMonitor monitor) throws Exception {
	
		monitor.beginTask(unifiedName, 6);
	
		List<CheckerMessage> res = new ArrayList<CheckerMessage>();
		long time = 0;
		while(time<6){
		res.add(new CheckerMessage("SysMLChecker1 "+time, IMarker.SEVERITY_ERROR,systemViewPackage,unifiedName));
		if (monitor.isCanceled()) {
			System.out.println("monitor.isCanceled()");
	       throw new Exception();
	    }
		TimeUnit.SECONDS.sleep(1);
		time++;
		monitor.worked(1);
		}
		return res;
	}


	@Override
	public void init() throws Exception {
		systemViewPackage = EntityUtil.getInstance().getCurrentSystemView();
		file = WorkspaceSynchronizer.getFile(systemViewPackage.eResource());
	}


	@Override
	public void initSync(Package systemViewPackage) throws Exception {
		this.systemViewPackage = systemViewPackage;
		file = WorkspaceSynchronizer.getFile(systemViewPackage.eResource());
	}

}
