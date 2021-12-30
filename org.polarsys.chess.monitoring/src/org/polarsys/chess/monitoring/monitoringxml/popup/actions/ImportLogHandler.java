/*
-----------------------------------------------------------------------
--                    CHESS monitoring plugin                        --
--                                                                   --
--                    Copyright (C) 2020                             --
--                     Intecs - Italy                                --
--                                                                   --                      --
--                                                                   --
-- All rights reserved. This program and the accompanying materials  --
-- are made available under the terms of the Eclipse Public License  --
-- v1.0 which accompanies this distribution, and is available at     --
-- http://www.eclipse.org/legal/epl-v20.html                         --
-----------------------------------------------------------------------
  */ 

package org.polarsys.chess.monitoring.monitoringxml.popup.actions;
import java.net.URI;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.filesystem.URIUtil;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.EObjectTreeElement;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Class;

//invoked on an AnalysisContext, performs the trace analysis and back propagation
public class ImportLogHandler extends AbstractHandler {


	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
		
		ISelectionService selectionService = window.getSelectionService();
		ISelection selectionX = selectionService.getSelection();
		if (!(selectionX instanceof ITreeSelection)){
			//ResourceNotification.showOk("Please invoke the command on a single selection on the ModelExplorer");
			return null;
		}
		ITreeSelection treesel = (ITreeSelection)selectionX;
		if (treesel.getPaths().length == 0 ||  treesel.getPaths().length > 1){
			//ResourceNotification.showError("Please invoke command on a single selection on the ModelExplorer");
			return null;
		}
		
		Object obj = treesel.getFirstElement();
		if (!(obj instanceof EObjectTreeElement)){
			//ResourceNotification.showError("Please invoke the Build Instance command on a single selection on the ModelExplorer");
			return null;
		}
		EObject eobj = ((EObjectTreeElement) obj).getEObject();
		final Class umlClass = (Class) eobj;
				
		//get the current project
		umlClass.eResource().getResourceSet();
		
		IWorkbenchPage activePage = window.getActivePage();
		IEditorPart activeEditor = activePage.getActiveEditor();

		if (activeEditor != null) {
		   IEditorInput input = activeEditor.getEditorInput();

		   IProject project = input.getAdapter(IProject.class);
		   if (project == null) {
		      IResource resource = input.getAdapter(IResource.class);
		      if (resource != null) {
		         project = resource.getProject();
		         
		      }
		   }
		   IFile monitorinFile = project.getFile("\\src-gen_model\\monitoring.xml");
		   if (monitorinFile.exists()){
			   //ask for log file
			   Shell activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			   FileDialog dialog = new FileDialog(activeShell, SWT.OPEN);
			   dialog.setFilterExtensions(new String [] {""});
			   String logPath = dialog.open();
			   
			   IWorkspace workspace = ResourcesPlugin.getWorkspace();
			   IWorkspaceRoot root = workspace.getRoot();
			 
			   URI logURI = URIUtil.toURI(logPath);
			   IFile[] logfiles = root.findFilesForLocationURI(logURI);
			  
			   //first let's analyze the trace
			   LaunchTraceAnalysis traceAnalysis = new LaunchTraceAnalysis(activeShell, logfiles[0], null, monitorinFile, false);
			   traceAnalysis.run(null);
			   
			   //now back propagation...
			   IFile analyzedTraceFile = project.getFile("\\src-gen_model\\"+umlClass.getName()+"_monitoring.xml");
			   IFile umlFile = project.getFile(umlClass.eResource().getURI().lastSegment());
			   if (umlFile.exists() && analyzedTraceFile.exists()){
				   LaunchBackpropagation back = new LaunchBackpropagation(activeShell, analyzedTraceFile, umlFile, null);
				   back.run(null);
			   }
			  
		   }
		}
		
		return null;
		
	}

}
