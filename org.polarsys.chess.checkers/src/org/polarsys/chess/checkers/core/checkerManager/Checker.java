/*******************************************************************************
 * Copyright (C) 2020 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 ******************************************************************************/

package org.polarsys.chess.checkers.core.checkerManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.polarsys.chess.contracts.profile.chesscontract.util.EntityUtil;

import org.eclipse.uml2.uml.Package;

public abstract class Checker {

	private static final Logger logger = Logger.getLogger(Checker.class);
	public static String FAMILY = "checkers";

//	private static String pluginID = "org.polarsys.chess.checkers";

	public final String unifiedName;
	protected final Set<String> checkerTags;
	protected final int registerPriority;
	private ArrayList<Exception> errors = new ArrayList<Exception>();

	protected Checker(String unifiedName, Set<String> checkerTags) {
		this(unifiedName, checkerTags, 0);
	}

	public Checker(String unifiedName, Set<String> checkerTags, int registerPriority) {

		this.unifiedName = unifiedName;
		this.checkerTags = checkerTags;
		this.registerPriority = registerPriority;

		CheckerManager checkerManager = org.polarsys.chess.checkers.Activator.getCheckerManager();
		logger.debug("register " + unifiedName);
		checkerManager.getCheckersContainter().register(this);
	}

	/**
	 * This contains the core of the processing. 
	 * @param monitor
	 * @return
	 * @throws Exception
	 */
	public abstract List<CheckerMessage> check(IProgressMonitor monitor) throws Exception;

	/**
	 * This init is used when the checker runs in tests or in a synchronous way.
	 * Checkers should use the provided package and not trying to detect the current
	 * active project.
	 * @param systemViewPackage the SystemView package
	 * @throws Exception
	 */
	public abstract void initSync(Package systemViewPackage) throws Exception;

	/**
	 * This init is used when the checker runs in an asynchronous way. It is used
	 * to setup variables that cannot be detected in a running environment.
	 * @throws Exception
	 */
	public abstract void init() throws Exception;

	/**
	 * Runs the checker in an asynchronous way. Both init() and check() are called.
	 * @param isFirstChecker
	 * @throws Exception
	 */
	public void asyncCheck(boolean isFirstChecker) throws Exception {
		CheckerManager checkerManager = org.polarsys.chess.checkers.Activator.getCheckerManager();
		org.eclipse.uml2.uml.Package pack = EntityUtil.getInstance().getCurrentSystemView();
		if(pack == null) {
			IFile file = EntityUtil.getInstance().getCurrentIFile();
			logger.debug("file: "+file);
			EntityUtil.getInstance().openCurrentModelIntoEditor(file);			
		}
		
		IFile iFile = WorkspaceSynchronizer.getFile(EntityUtil.getInstance().getCurrentSystemView().eResource());
		init();

		logger.debug("running checker: "+unifiedName);
		Job job = new Job("Checker Manager: " + unifiedName) {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					errors = new ArrayList<Exception>();
					List<CheckerMessage> messages = check(monitor);
					if (messages != null) {
//						checkerManager.deleteMarkers(iFile, unifiedName);							
						checkerManager.deleteProjectMarkers(iFile.getProject(), unifiedName);
						checkerManager.addMessages(unifiedName, messages);
					}
				} catch (Exception e) {
					e.printStackTrace();
					logger.error("Checker '"+unifiedName+"' exception: "+e.getMessage());
					return Status.CANCEL_STATUS;
				}
				if (monitor.isCanceled()) {
					logger.warn("checker '" + unifiedName + "' isCanceled");
					return Status.CANCEL_STATUS;
				}
				// use this to open a Shell in the UI thread
				return Status.OK_STATUS;
			}
		};
		
		job.setUser(isFirstChecker);
		job.schedule();
	}
	
	/**
	 * Only runs the check() method and returns the scheduled job.
	 * @param pack
	 * @return
	 */
	public Job syncCheck(Package pack) {
		CheckerManager checkerManager = org.polarsys.chess.checkers.Activator.getCheckerManager();
		IFile iFile = WorkspaceSynchronizer.getFile(pack.eResource());

		logger.debug("running checker: " + unifiedName);
		Job job = new Job("Checker Manager: " + unifiedName) {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					errors = new ArrayList<Exception>();
					List<CheckerMessage> messages = check(monitor);
					checkerManager.updateCheckerStatus(unifiedName, true);
					if (messages != null) {
						checkerManager.deleteProjectMarkers(iFile.getProject(), unifiedName);
						checkerManager.addMessages(unifiedName, messages);
					}
				} catch (Exception e) {
					checkerManager.updateCheckerStatus(unifiedName, true);
					e.printStackTrace();
					logger.error("Checker '" + unifiedName + "' exception: " + e.getMessage());
					return Status.CANCEL_STATUS;
				}
				if (monitor.isCanceled()) {
					checkerManager.updateCheckerStatus(unifiedName, true);
					logger.warn("checker '" + unifiedName + "' isCanceled");
					return Status.CANCEL_STATUS;
				}
				// use this to open a Shell in the UI thread
				return Status.OK_STATUS;
			}
			
			@Override
			public boolean belongsTo(Object family) {
				if (Checker.FAMILY.equals(family)) {
					return true;
				} else {
					return false;
				}
			}
		};
		job.schedule();
		return job;
	}
	
//	/**
//	 * Recursively returns all the files in the given container
//	 * @param container the IContainer
//	 * @return
//	 */
//	private List<IFile> getProjectFiles(IContainer container) {
//		final List<IFile> files = new ArrayList<IFile>();
//		try {
//			for (IResource member : container.members()) {
//				if (member instanceof IContainer) {
//					files.addAll(getProjectFiles((IContainer) member));
//				} else if (member instanceof IFile) {
//					files.add((IFile) member);
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return files;
//	}

	/*
	 * private void syncWithUI(Shell shell) { Display.getDefault().asyncExec(new
	 * Runnable() { public void run() { MessageDialog.openInformation(shell,
	 * "message", "completed!"); } }); }
	 */

	public boolean belongsTo(Set<String> checkersTags) {
		for (String tag : checkersTags) {
			if (checkerTags.contains(tag))
				return true;
		}
		return false;
	}

	public String getUnifiedName() {
		return unifiedName;
	}

	public Set<String> getCheckerTags() {
		return checkerTags;
	}

	public void addError(Exception e){
		errors.add(e);
	}
}