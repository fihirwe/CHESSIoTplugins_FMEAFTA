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

import org.eclipse.core.resources.IMarker;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.papyrus.views.modelexplorer.ModelExplorerView;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.navigator.CommonViewer;

import com.google.common.collect.Lists;

public class test implements IGotoMarker {

	ModelExplorerView  modelExplorerView;
	
	
	public test(ModelExplorerView modelExplorerView) {
		super();
		this.modelExplorerView = modelExplorerView;
	}


	@Override
	public void gotoMarker(IMarker marker) {
		
		String uriAttribute = marker.getAttribute(EValidator.URI_ATTRIBUTE, null);
		if (uriAttribute != null) {
			URI uri = URI.createURI(uriAttribute);
			
				EditingDomain domain = modelExplorerView.getEditingDomain();
				EObject eObject = domain.getResourceSet().getEObject(uri, false);
				if (eObject != null) {
					
					modelExplorerView.revealSemanticElement(Lists.newArrayList(eObject));
					//CommonViewer treeViewer = modelExplorerView.getCommonViewer();
					// The common viewer is in fact a tree viewer
					// bug enhancement: use function in ModelExplorerView instead of findElementForEObject
					//ModelExplorerView.reveal(Lists.newArrayList(eObject), treeViewer);
				}
			}
		
	}

	
	
}
