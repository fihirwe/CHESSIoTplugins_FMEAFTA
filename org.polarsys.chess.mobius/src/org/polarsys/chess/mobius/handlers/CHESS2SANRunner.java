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
package org.polarsys.chess.mobius.handlers;

import static org.polarsys.chess.core.util.CHESSProjectSupport.printlnToCHESSConsole;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.jface.operation.IRunnableWithProgress;

import org.polarsys.chess.mobius.model.SAN.SANModelPackage;
import org.polarsys.chess.mobius.transformations.QVToTransformation;

/**
 * The Class CHESS2SANRunner.
 */
public class CHESS2SANRunner implements IRunnableWithProgress{

	/** The Constant SAN_MM_EXTENSION. */
	protected static final String SAN_MM_EXTENSION = "sanmodel";
	
	/** The target folder. */
	protected IContainer targetFolder;
	
	/** The chess model uri. */
	protected URI chessModelUri;
	
	/** The chess resource. */
	protected Resource chessResource;
	
	/** The san resource. */
	private Resource sanResource;
	
	/** The root component qualified name. */
	protected String rootComponentQualifiedName = "";
	
	/** The diagram edit part. */
	protected DiagramEditPart diagramEditPart;
	
	/** The analysis context qualified name. */
	protected String analysisContextQualifiedName ="";
	
	/**
	 * Gets the target folder.
	 *
	 * @return the target folder
	 */
	public IContainer getTargetFolder() {
		return targetFolder;
	}

	/**
	 * Sets the target folder.
	 *
	 * @param targetFolder the new target folder
	 */
	public void setTargetFolder(IContainer targetFolder) {
		this.targetFolder = targetFolder;
	}

	/**
	 * Gets the model URI.
	 *
	 * @return the model URI
	 */
	public URI getModelURI() {
		return chessModelUri;
	}

	/**
	 * Sets the model URI.
	 *
	 * @param modelURI the new model URI
	 */
	public void setModelURI(URI modelURI) {
		this.chessModelUri = modelURI;
	}
	
	/**
	 * Sets the analysis context qualified name.
	 *
	 * @param analysisContextQN the new analysis context qualified name
	 */
	public void setAnalysisContextQualifiedName(String analysisContextQN){
		this.analysisContextQualifiedName = analysisContextQN;
	}
	
	/**
	 * Sets the root component.
	 *
	 * @param rootComponentQualifiedName the new root component
	 */
	public void setRootComponent(String rootComponentQualifiedName) {
		this.rootComponentQualifiedName = rootComponentQualifiedName;
	}

	/**
	 * Gets the chess resource.
	 *
	 * @return the chess resource
	 */
	public Resource getChessResource() {
		return chessResource;
	}

	/**
	 * Sets the chess resource.
	 *
	 * @param chessResource the new chess resource
	 */
	public void setChessResource(Resource chessResource) {
		this.chessResource = chessResource;
	}

	/**
	 * Sets the diagram edit part.
	 *
	 * @param diagramEditPart the new diagram edit part
	 */
	public void setDiagramEditPart(DiagramEditPart diagramEditPart) {
		this.diagramEditPart = diagramEditPart;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.operation.IRunnableWithProgress#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
		
			
		//monitor.beginTask("Running CHESS to SAN transformation...",numSubTasks );
		if (monitor.isCanceled()) {
			throw new InterruptedException();
		}

		runInput2SANTransformation(monitor);
		
		if (monitor.isCanceled()) {
			throw new InterruptedException();
		}
	
		printlnToCHESSConsole("*** CHESS to SAN transformation was performed successfully ***");
		//monitor.done();
	}

	
	/**
	 * Run input 2 SAN transformation.
	 *
	 * @param monitor the monitor
	 */
	protected void runInput2SANTransformation(IProgressMonitor monitor) {
		SANModelPackage.eINSTANCE.getClass();
		ResourceSet resourceSet = new ResourceSetImpl();
		URI flaMMuri = createFlaModelUri().appendFileExtension(SAN_MM_EXTENSION);
		new File(flaMMuri.path()).delete();
		setSANResource(resourceSet.createResource(flaMMuri));
		
		QVToTransformation transformation = new QVToTransformation();
		transformation.performCHESS2SANTransformation(chessResource, getSANResource(), monitor, rootComponentQualifiedName, analysisContextQualifiedName);
//		if (flaResource.getContents() == null || flaResource.getContents().isEmpty()) {
//			throw new TransformationException();
//		}
	}
	
	
	/**
	 * Creates the fla model uri.
	 *
	 * @return the uri
	 */
	protected URI createFlaModelUri() {
		String modelName = getModelName();
		String flaPath = targetFolder.getFullPath().toString() + "/" + modelName;// + "." + rootComponentQualifiedName.replaceAll("::", ".") + "_result";
		return URI.createPlatformResourceURI(flaPath, false);
	}

	/**
	 * Gets the output xml path.
	 *
	 * @return the output xml path
	 */
	protected String getOutputXmlPath() {
		String modelName = getModelName();
		return targetFolder.getLocation().append(modelName + "_result.xml").toString();
	}
	
	/**
	 * Gets the model name.
	 *
	 * @return the model name
	 */
	protected String getModelName() {
		return chessModelUri.lastSegment().substring(0, chessModelUri.lastSegment().lastIndexOf('.'));
	}
	
	/**
	 * Show error messages.
	 *
	 * @param title the title
	 * @param messages the messages
	 */
	protected void showErrorMessages(String title, List<String> messages) {
		StringBuilder sb = new StringBuilder();
		for (String message : messages) {
			sb.append(message + "\n");
		}
		showErrorMessage(title, sb.toString());
	}
	
	/**
	 * Show error message.
	 *
	 * @param title the title
	 * @param message the message
	 */
	protected void showErrorMessage(String title, String message) {
		JOptionPane.showMessageDialog(
				new JFrame(),
				message,
				title, JOptionPane.ERROR_MESSAGE);

	}

	/**
	 * Gets the SAN resource.
	 *
	 * @return the SAN resource
	 */
	public Resource getSANResource() {
		return sanResource;
	}

	/**
	 * Sets the SAN resource.
	 *
	 * @param sanResource the new SAN resource
	 */
	public void setSANResource(Resource sanResource) {
		this.sanResource = sanResource;
	}
	
}

	



