/*******************************************************************************
 * Copyright (C) 2020 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 ******************************************************************************/
package org.polarsys.chess.checkers.core.checkerManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.views.modelexplorer.ModelExplorerPage;
import org.eclipse.papyrus.views.modelexplorer.ModelExplorerPageBookView;
import org.eclipse.papyrus.views.modelexplorer.ModelExplorerView;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.IPage;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.xtext.nodemodel.INode;
import org.polarsys.chess.service.gui.utils.ReportProblemsUtil;

public class CheckerManager {

	private static final Logger logger = Logger.getLogger(CheckerManager.class);

	private static final String CHECKER_NAME = "checkerName";
	List<CheckersContainer> checkersContainers;
	
	List<CheckerMessage> messages;
	HashMap<String, Boolean> checkerStatus;

	// ModelExplorerPageBookView modelExplorerPageBookView;
	// ModelExplorerView modelExplorerView ;
	// test test;
	public CheckerManager() {
		logger.debug("Instantiate CheckerManager");
		this.checkersContainers = new ArrayList<CheckersContainer>();
		new CheckersContainer(this);
		// checkersContainers.add(checkersContainer);
	}

	/**
	 * Runs the checkers in an asynchronous way.
	 * @param selectedCheckersTags
	 * @throws Exception
	 */
	public void run(Set<String> selectedCheckersTags) throws Exception {
		logger.debug("run");
		checkerStatus = new HashMap<String, Boolean>();
		messages = new ArrayList<CheckerMessage>();
		// modelExplorerPageBookView = getModelExplorerPageBookView();
		// modelExplorerView = getModelExplorerView();
		// test = new test(modelExplorerView);
		for (CheckersContainer checkersContainer : checkersContainers) {
			logger.debug("run checkersContainer");
			checkersContainer.run(selectedCheckersTags);
		}
	}

	/**
	 * Launches the initSync() of the various CheckerContainers.
	 * @param selectedCheckersTags
	 * @param systemViewPackage the SystemViewPackage
	 * @throws Exception
	 */
	public void initSync(Set<String> selectedCheckersTags, Package systemViewPackage) throws Exception {
		logger.debug("initSync");
		for (CheckersContainer checkersContainer : checkersContainers) {
			logger.debug("initSync checkersContainer");
			checkersContainer.initSync(selectedCheckersTags, systemViewPackage);
		}
	}

	/**
	 * Launches the check() of the various checkerContainers and waits for their finish.
	 * @param selectedCheckersTags
	 * @param pkg
	 * @return 
	 */
	public List<Exception> checkSync(Set<String> selectedCheckersTags, Package pkg, IProgressMonitor monitor) {
		logger.debug("runSync");
		final List<Exception> errors = new ArrayList<Exception>();
		checkerStatus = new HashMap<String, Boolean>();
		messages = new ArrayList<CheckerMessage>();
		final List<Job> jobs = new ArrayList<Job>();
		
		// Start all the checks()
		for (CheckersContainer checkersContainer : checkersContainers) {
			logger.debug("run checkersContainer");
			jobs.addAll(checkersContainer.checkSync(selectedCheckersTags, pkg));
		}
		
		// Wait for the checks to finish
		try {
			Job.getJobManager().join(Checker.FAMILY, monitor);
		} catch (OperationCanceledException | InterruptedException e1) {
			logger.debug("Checker execution interrupted");
			for (Job job : jobs) {
				job.cancel();
			}
			errors.add(new Exception("Esecuzione checker interrotta"));
			e1.printStackTrace();
		}
		return errors;
	}
	
	public void register(CheckersContainer checkersContainer) {
		logger.debug("register CheckersContainer");
		this.checkersContainers.add(checkersContainer);
	}

	public Set<String> getTags() {
		Set<String> tags = new HashSet<String>();

		for (CheckersContainer containter : checkersContainers) {
			tags.addAll(containter.getTags());
		}

		return tags;
	}

	public CheckersContainer getCheckersContainter() {
		return checkersContainers.get(0);
	}

	public List<CheckersContainer> getCheckersContainers() {
		return checkersContainers;
	}

	public void addMessages(String unifiedName, List<CheckerMessage> newMessages) throws Exception {
		// this.messages.addAll(newMessages);
		checkerStatus.put(unifiedName, true);

		// logger.debug("addMessages '" + unifiedName + "' : " +
		// newMessages.size());

		/*
		 * for (Boolean value : checkerStatus.values()) { if
		 * (value.booleanValue() == false) return; }
		 */

		// IViewPart modelexplorer =
		// PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
		// .showView(ModelExplorerPageBookView.VIEW_ID);
		// modelExplorerView = getModelExplorerPageBookView();
		// System.out.println("modelexplorer: "+modelExplorerView);

		// Set<IFile> iFiles = extractIFiles(newMessages);

		// for (IFile iFile : iFiles) {
		// deleteMarkers(iFile, unifiedName);
		// }

		for (CheckerMessage msn : newMessages) {
			if (msn.object != null && msn.object instanceof EObject) {
				IMarker marker = msn.file.createMarker(EValidator.MARKER);
				marker.setAttribute(CHECKER_NAME, msn.checkerName);
				marker.setAttribute(IMarker.MESSAGE, msn.message);
				String location = EcoreUtil.getURI((EObject) msn.object).toString();
				if (msn.object instanceof NamedElement) {
					location = ((NamedElement) msn.object).getQualifiedName();
				}
				marker.setAttribute(IMarker.LOCATION, location);
				marker.setAttribute(IMarker.SEVERITY, msn.severity);
				marker.setAttribute(EValidator.URI_ATTRIBUTE, EcoreUtil.getURI((EObject) msn.object).toString());
			} else if (msn.object != null && msn.object instanceof INode) {
				try {
					final INode node = (INode) msn.object;
					if (msn.severity == IMarker.SEVERITY_INFO) {
						ReportProblemsUtil.reportInfo(msn.file, CHECKER_NAME, msn.checkerName, msn.message, node.getStartLine(), 
								node.getOffset(), node.getEndOffset());
					} else if (msn.severity == IMarker.SEVERITY_WARNING) {
						ReportProblemsUtil.reportWarning(msn.file, CHECKER_NAME, msn.checkerName, msn.message, node.getStartLine(), 
								node.getOffset(), node.getEndOffset());
					} else if (msn.severity == IMarker.SEVERITY_ERROR) {
						ReportProblemsUtil.reportError(msn.file, CHECKER_NAME, msn.checkerName, msn.message, node.getStartLine(), 
								node.getOffset(), node.getEndOffset());
					}
				} catch (NullPointerException | CoreException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private Set<IFile> extractIFiles(List<CheckerMessage> checkerMessages) {

		Set<IFile> iFiles = new HashSet<IFile>();
		if (checkerMessages != null) {
			for (CheckerMessage checkerMessage : checkerMessages) {
				if (checkerMessage.file != null) {
					iFiles.add(checkerMessage.file);
				}
			}
		}
		return iFiles;
	}

	void deleteMarkers(IFile file, String checkerName) throws CoreException {
		IMarker[] markers = file.findMarkers(EValidator.MARKER, false, IResource.DEPTH_ONE);
		for (IMarker marker : markers) {
			if (marker != null && marker.exists() && marker.getAttribute(CHECKER_NAME, "").equals(checkerName)) {
				marker.delete();
			}
		}
	}

	/**
	 * Deletes all the matching markers inside the given project.
	 * @param project the active project
	 * @param checkerName the name of the creating checker
	 * @throws CoreException
	 */
	void deleteProjectMarkers(IProject project, String checkerName) throws CoreException {
		IMarker[] markers = project.findMarkers(null, false, IResource.DEPTH_INFINITE);
		for (IMarker marker : markers) {
			if (marker != null && marker.exists() && marker.getAttribute(CHECKER_NAME, "").equals(checkerName)) {
				marker.delete();
			}
		}
	}

	private ModelExplorerPageBookView getModelExplorerPageBookView() {

		IWorkbench workbench = PlatformUI.getWorkbench();

		System.out.println("workbench: " + workbench);
		IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();

		System.out.println("window: " + window);

		IWorkbenchPage workbenchPage = window.getActivePage();

		System.out.println("workbenchPage: " + workbenchPage);

		IViewPart modelExplorerViewPart = null;

		for (IViewPart view : workbenchPage.getViews()) {
			System.out.println("view: " + view.getTitle());
		}

		try {
			modelExplorerViewPart = window.getActivePage().showView(ModelExplorerPageBookView.VIEW_ID);
		} catch (PartInitException ex) {
			ex.printStackTrace(System.out);
		}

		ModelExplorerPageBookView view = (ModelExplorerPageBookView) modelExplorerViewPart;
		return view;

	}

	private ModelExplorerView getModelExplorerView() {

		ModelExplorerPageBookView view = getModelExplorerPageBookView();
		IPage currentPage = view.getCurrentPage();
		ModelExplorerPage page = (ModelExplorerPage) currentPage;
		IViewPart viewer = page.getViewer();
		ModelExplorerView modelExplorerView = (ModelExplorerView) viewer;

		return modelExplorerView;

	}

	public void updateCheckerStatus(String unifiedName, boolean b) {
		checkerStatus.put(unifiedName, b);
	}

}
