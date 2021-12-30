/*********************************************************************
* Copyright (c) 2019 Intecs Solutions SpA
*
* This program and the accompanying materials are made
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* SPDX-License-Identifier: EPL-2.0
*
* Contributors: 
*   Intecs Solutions - Initial API and implementation
*   
**********************************************************************/

package org.polarsys.chess.mobius.transformations;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.m2m.internal.qvt.oml.evaluator.QVTEvaluationOptions;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.Trace;
import org.eclipse.m2m.qvt.oml.util.WriterLog;
import org.polarsys.chess.core.util.CHESSProjectSupport;
import org.polarsys.chess.mobius.Activator;
import org.polarsys.chess.mobius.model.SAN.SANModelPackage;

/**
 * The Class QVToTransformation.
 */
public class QVToTransformation {
	
	/** The Constant SELECTED_PLATFORM_PROPERTY. */
	private static final String SELECTED_PLATFORM_PROPERTY = "selectedPlatformQName";
	
	/** The Constant SELECTED_ANALYSISCONTEXT_PROPERTY. */
	private static final String SELECTED_ANALYSISCONTEXT_PROPERTY = "analysisContextQName";
	
	/** The Constant CHESS2SAN. */
	private static final String CHESS2SAN = "platform:/plugin/org.polarsys.chess.mobius/transformations/CHESS2SAN.qvto";
	
	/** The is chess user action. */
	boolean isChessUserAction;
	
	/** The diagram edit part. */
	private DiagramEditPart diagramEditPart = null;
	
	/** The source resource. */
	private Resource sourceResource;
	
	/** The target resource. */
	private Resource targetResource;
	
	/** The create new model. */
	private boolean createNewModel = true;
	
	/** The monitor. */
	private IProgressMonitor monitor;
	
	/** The selected element. */
	private String selectedElement = null;
	
	/** The analysis context QN. */
	private String analysisContextQN = null;
	
	/**
	 * Perform CHESS 2 SAN transformation.
	 *
	 * @param chessResource the chess resource
	 * @param sanResource the san resource
	 * @param monitor the monitor
	 * @param selectedElement the selected element
	 * @param analysisContextQN the analysis context QN
	 */
	public void performCHESS2SANTransformation(
			Resource chessResource, Resource sanResource, IProgressMonitor monitor, String selectedElement, String analysisContextQN) {
		SANModelPackage.eINSTANCE.getClass();
		this.sourceResource = chessResource;
		this.targetResource = sanResource;
		this.monitor = monitor;
		this.selectedElement = selectedElement;
		this.analysisContextQN = analysisContextQN;
		performTransformation(CHESS2SAN);
	}
		
	
	/**
	 * Perform transformation.
	 *
	 * @param transformationPath the transformation path
	 */
	private void performTransformation(String transformationPath) {
		URI transformationURI = URI.createURI(transformationPath);
		final TransformationExecutor executor = new TransformationExecutor(transformationURI );
		
		EList<EObject> inObjects = sourceResource.getContents();
		final ModelExtent input = new BasicModelExtent(inObjects);
		ModelExtent output;
		if (createNewModel) {
			output = new BasicModelExtent();
		} else {
			output = new BasicModelExtent(targetResource.getContents());
		}
		
		final ExecutionContextImpl context = new ExecutionContextImpl();
		
		if (selectedElement != null) {
			context.setConfigProperty(SELECTED_PLATFORM_PROPERTY, selectedElement);
			context.setConfigProperty(SELECTED_ANALYSISCONTEXT_PROPERTY, analysisContextQN);
		}
		
		OutputStreamWriter s = new OutputStreamWriter(CHESSProjectSupport.CHESS_CONSOLE);
		context.setLog(new WriterLog(s));
		
		context.setProgressMonitor(monitor);
		
		Trace trace = Trace.createEmptyTrace();
		context.getSessionData().setValue(QVTEvaluationOptions.INCREMENTAL_UPDATE_TRACE, trace);
		
		ExecutionDiagnostic result = executor.execute(context, input, output);

		if(result.getSeverity() == Diagnostic.OK) {
			// the output objects got captured in the output extent
			final List<EObject> outObjects = output.getContents();
			// persist them using a resource 
			targetResource.getContents().clear();
			targetResource.getContents().addAll(outObjects);

			try {
				targetResource.save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			//save trace model
			URI uri = targetResource.getURI();
			String tracePath = uri.toString()+".qvtoTrace";
			URI traceURI = URI.createURI(tracePath);
	
			Resource traceResource = targetResource.getResourceSet().createResource(traceURI);
			traceResource.getContents().addAll(trace.getTraceContent());
			try {
				traceResource.save(Collections.emptyMap());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		} else {
			// turn the result diagnostic into status and send it to error log
			//TODO: Handle errors, abort analysis
			IStatus status = BasicDiagnostic.toIStatus(result);
			Activator.getDefault().getLog().log(status);
		}
		
	
		
	}
	
	/**
	 * Save chess resource.
	 *
	 * @param chessResource the chess resource
	 * @param outObjects the out objects
	 * @return true, if successful
	 */
	protected boolean saveChessResource(final Resource chessResource, final List<EObject> outObjects) {
		try {
			TransactionalEditingDomain editingDomain = diagramEditPart.getEditingDomain();
			editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {
            protected void doExecute() {
            	chessResource.getContents().clear();
            	chessResource.getContents().addAll(outObjects);
            }
			});
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
