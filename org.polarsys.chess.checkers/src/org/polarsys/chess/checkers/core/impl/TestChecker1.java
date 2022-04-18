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
import org.eclipse.core.runtime.Path;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.uml2.uml.Package;
import org.polarsys.chess.checkers.core.checkerManager.Checker;
import org.polarsys.chess.checkers.core.checkerManager.CheckerMessage;
import org.polarsys.chess.contracts.profile.chesscontract.util.EntityUtil;


public class TestChecker1 extends Checker {

	org.eclipse.uml2.uml.Package systemViewPackage;
	IResource resource;
	IFile file;
	public TestChecker1(String unifiedName, Set<String> checkerTags, int priority) {
		super(unifiedName, checkerTags,priority);
	}

	@Override
	public List<CheckerMessage> check(IProgressMonitor monitor) throws Exception {

		monitor.beginTask(unifiedName, 3);
		System.out.println("systemViewPackage: "+systemViewPackage);
		//Resource resource = systemViewPackage.eResource();
		
		//IResource resource = getResourceForModel(systemViewPackage);
		List<CheckerMessage> res = new ArrayList<CheckerMessage>();
		long time = 0;
		while(time<10){
		res.add(new CheckerMessage("StateMachineChecker2 "+time+" priority "+registerPriority, IMarker.SEVERITY_ERROR, systemViewPackage,unifiedName));
		TimeUnit.SECONDS.sleep(1);
		time++;
		monitor.worked(1);
		}
		return res;
	}

	
	
	public IResource getResourceForModel(EObject obj) {
		//org.eclipse.emf.common.util.URI uri = obj.eResource().getURI();
		org.eclipse.emf.common.util.URI uri = EcoreUtil.getURI(obj);
		System.out.println("uri: "+uri);
	        // assuming platform://resource/project/path/to/file
		String projectStr = uri.segment(1);
		IPath path = new Path(uri.path()).removeFirstSegments(2);
		System.out.println("path: "+path);
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectStr);
		System.out.println("project: "+project);
		return project.findMember(path);
	}
	
	@Override
	public void init() throws Exception {
		systemViewPackage = EntityUtil.getInstance().getCurrentSystemView();
		//resource = ResourcesPlugin.getWorkspace().getRoot();
		resource = getResourceForModel(systemViewPackage);
		file = WorkspaceSynchronizer.getFile(systemViewPackage.eResource());
		System.out.println("resource: "+resource);
		
	}

	@Override
	public void initSync(Package systemViewPackage) throws Exception {
		this.systemViewPackage = systemViewPackage;
		resource = getResourceForModel(systemViewPackage);
		file = WorkspaceSynchronizer.getFile(systemViewPackage.eResource());
	}
}
