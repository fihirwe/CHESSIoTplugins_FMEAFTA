/*****************************************************************************
 * Copyright (c) 2021- Intecs Solutions
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *  Felicien Ihirwe
 *
 *****************************************************************************/

package org.polarsys.chess.iot.generator.ui.transformations;

import java.io.IOException;

import org.polarsys.chess.monitoring.monitoringxml.AnalysisContext;
import org.polarsys.chess.monitoring.monitoringxml.Monitoring;
import org.polarsys.chess.monitoring.monitoringxml.MonitoringxmlFactory;
import org.polarsys.chess.multicore.model.CHTask;
import org.polarsys.chess.multicore.utils.QueryUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.m2m.internal.qvt.oml.emf.util.ModelContent;
import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Model;
import org.polarsys.chess.core.util.CHESSProjectSupport;
import org.polarsys.chess.core.util.uml.UMLUtils;
import org.polarsys.chess.iot.generator.ui.thingml.action.AcceleoGenerateThingMLAction;
import org.polarsys.chess.m2m.transformations.TransUtil;

/**
 * The Class Transformations.
 */
@SuppressWarnings("restriction")
public class CHESSTransformation {


	/**
	 * Load the model, sets up the environment and performs the Ada code generation.
	 *
	 * @param editor the editor
	 * @param model the model
	 * @param monitor the monitor
	 * @throws Exception the exception
	 */
	public static boolean performCodeGeneration(final PapyrusMultiDiagramEditor editor, IFile model, IProgressMonitor monitor) throws Exception {
		Object modelURI = AcceleoGenerateThingMLAction.generateThingMLModel(model, monitor);
		
		if(modelURI!= null){
			return true;
		}
		return false;
	}
}