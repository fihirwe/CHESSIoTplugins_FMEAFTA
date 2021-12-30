/*******************************************************************************
 * Copyright (C) 2017 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Alberto Debiasi - initial API and implementation
 ******************************************************************************/

package org.polarsys.chess.fla.faultTreeAnalysis.visualization;

import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.dialect.command.CreateRepresentationCommand;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.DefaultLocalSessionCreationOperation;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionCreationOperation;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.tools.api.command.semantic.AddSemanticResourceCommand;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelection;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallbackWithConfimation;

import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

import eu.fbk.eclipse.standardtools.faultTreeViewer.emfta.FTAModel;
import eu.fbk.eclipse.standardtools.faultTreeViewer.emfta.impl.EmftaFactoryImpl;
import eu.fbk.eclipse.standardtools.faultTreeViewer.xSAP.FaultTreeBuilder;
import eu.fbk.eclipse.standardtools.faultTreeViewer.xSAP.generated.FaultTree;
//import eu.fbk.eclipse.standardtools.faultTreeViewer.xSAP.FaultTreeBuilder;
//import eu.fbk.eclipse.standardtools.faultTreeViewer.xSAP.generated.FaultTree;
import eu.fbk.eclipse.standardtools.logger.Console;
//import eu.fbk.eclipse.standardtools.utils.core.utils.DirectoryUtil;
import eu.fbk.eclipse.standardtools.utils.ui.utils.*;
import eu.fbk.eclipse.standardtools.utils.ui.utils.DialogUtil;

/**
 * The Class FaultTreeVisualizer.
 */
public class FaultTreeVisualizer {

	/** The fault tree T viewer util. */
	private static FaultTreeVisualizer faultTreeTViewerUtil;

	/**
	 * Gets the single instance of FaultTreeVisualizer.
	 *
	 * @return single instance of FaultTreeVisualizer
	 */
	public static FaultTreeVisualizer getInstance() {
		if (faultTreeTViewerUtil == null) {
			faultTreeTViewerUtil = new FaultTreeVisualizer();
		}
		return faultTreeTViewerUtil;
	}

	/** The Constant logger. */
	private static final Logger logger = Logger.getLogger(FaultTreeVisualizer.class);
	
	/** The directory util. */
	private static DirectoryUtil directoryUtil = DirectoryUtil.getInstance();
	
	/** The dialog util. */
	private static DialogUtil dialogUtil = DialogUtil.getInstance();

	/** The file extension. */
	//private String AIRD_FILE = "representations.aird";
	private String FILE_EXTENSION = "emfta";
	
	/** The viewpoint. */
	private String VIEWPOINT = "EMFTA";

	/**
	 * Open FTA viewer from emfta file.
	 *
	 * @param file the file
	 * @param monitor the monitor
	 * @throws Exception the exception
	 */
	//Metado cambiado por mi
	public void openFTAViewerFromEmftaFile(IFile file, IProgressMonitor monitor) throws Exception {

		/*if (selection.getFirstElement() instanceof IFile) {
			IFile file = (IFile) selection.getFirstElement();*/

			if (file.getFileExtension().compareTo("emfta") == 0) {
				IProject project = file.getProject();
				String name = file.getName().replaceAll(".emfta", "");
				Session session = createAirdSessionFromCurrentProject2(project, monitor,name);
				session.open(monitor);

				String pathName = file.getFullPath().toOSString();
				URI ftaResourceFileURI = URI.createPlatformResourceURI(pathName, true);
				FTAModel ftaModel = createFTAModel();
				Resource emftaResource = openExistingFTAResourceFile(ftaResourceFileURI, ftaModel);
				openFTAViewer(emftaResource, session, ftaModel, monitor);
			} else {
				throw new Exception("No .emfta file selected");
			}/*
		} else {
			throw new Exception("No file selected");
		}*/

	}

	/**
	 * Open FTA viewer from selected xml file.
	 *
	 * @param selection the selection
	 * @param monitor the monitor
	 * @throws Exception the exception
	 */
	public void openFTAViewerFromSelectedXmlFile(IStructuredSelection selection, IProgressMonitor monitor)
			throws Exception {

		if (selection.getFirstElement() instanceof IFile) {
			IFile file = (IFile) selection.getFirstElement();
			if (file.getFileExtension().compareTo("xml") == 0) {
				 openXmlIFileInFTAViewer(file, monitor);
			} else {
				throw new Exception("No .xml file selected");
			}
		} else {
			throw new Exception("No file selected");
		}
	}

	/**
	 * Open XMLI file in FTA viewer from dialog.
	 *
	 * @param monitor the monitor
	 * @throws Exception the exception
	 */
	public void openXMLIFileInFTAViewerFromDialog(IProgressMonitor monitor) throws Exception {

		IFile xmlIFile = dialogUtil.getIFileFromFileDialog(directoryUtil.getCurrentProjectDir(), "*.xml");
		 openXmlIFileInFTAViewer(xmlIFile, monitor);

	}

	/**
	 * Open xml I file in FTA viewer.
	 *
	 * @param xmlFilePath the xml file path
	 * @param monitor the monitor
	 * @throws Exception the exception
	 */
	public void  openXmlIFileInFTAViewer(String xmlFilePath, IProgressMonitor monitor) throws Exception {
		
		logger.debug("in openXmlIFileInFTAViewer, xmlFilePath: "+xmlFilePath);
		
		File file = new File(xmlFilePath);
		IFile xmlIFile = dialogUtil.getIFile(file);
		if(xmlIFile==null){
			throw new Exception("The file "+file.getPath()+" is not inside the workspace.");
		}
		openXmlIFileInFTAViewer(xmlIFile, monitor);
		
	}
	
	/**
	 * Open xml I file in FTA viewer.
	 *
	 * @param xmlIFile the xml I file
	 * @param monitor the monitor
	 * @throws Exception the exception
	 */
	public void  openXmlIFileInFTAViewer(IFile xmlIFile, IProgressMonitor monitor) throws Exception {

		
		
		if (xmlIFile != null) {
			FTAModel ftaModel = getFTAModelFromXmlFile(xmlIFile);

			IProject project = xmlIFile.getProject();
			Session aird_session = createAirdSessionFromCurrentProject(project, monitor);
			aird_session.open(monitor);

			String pathName = "/" + project.getName() + "/temp/" + xmlIFile.getName() + "." + FILE_EXTENSION;
			Console.write("pathName: "+pathName);
			Resource emftaResource = createEMFTAResourceFile(pathName, ftaModel);

			logger.debug("emftaResource.getURI(): " + emftaResource.getURI());
			Console.write("emftaResource.getURI(): " + emftaResource.getURI());

			openFTAViewer(emftaResource, aird_session, ftaModel, monitor);
		}else{
			throw new Exception("The file that contains the fault tree is null.");
		}
	}

	/**
	 * Open FTA viewer from FTA resource.
	 *
	 * @param ftaResource the fta resource
	 * @param monitor the monitor
	 * @throws Exception the exception
	 */
	public void openFTAViewerFromFTAResource(Resource ftaResource, IProgressMonitor monitor) throws Exception {

		FTAModel ftaModel = (FTAModel) ftaResource.getContents().get(0);

		IProject project = directoryUtil.getCurrentProject();

		Session aird_session = createAirdSessionFromCurrentProject(project, monitor);
		aird_session.open(monitor);

		String pathName = "/" + project.getName() + "/temp/" + ftaModel.getName() + "." + FILE_EXTENSION;
		Resource emftaResource = createEMFTAResourceFile(pathName, ftaModel);

		openFTAViewer(emftaResource, aird_session, ftaModel, monitor);

	}

	/**
	 * Adds the emfta resource in aird session.
	 *
	 * @param emftaResource the emfta resource
	 * @param aird_session the aird session
	 * @param monitor the monitor
	 * @return the resource
	 */
	private Resource addEmftaResourceInAirdSession(Resource emftaResource, Session aird_session,
			IProgressMonitor monitor) {
		URI emftaURI = emftaResource.getURI();
		addURIResourceAsSemanticResource(emftaURI, aird_session, monitor);
		Resource emftaSemanticResource = getSemanticResource(aird_session, emftaURI);
		return emftaSemanticResource;
	}

	/**
	 * Open FTA viewer.
	 *
	 * @param emftaResource the emfta resource
	 * @param aird_session the aird session
	 * @param ftaModel the fta model
	 * @param monitor the monitor
	 * @throws Exception the exception
	 */
	private void openFTAViewer(Resource emftaResource, Session aird_session, FTAModel ftaModel,
			IProgressMonitor monitor) throws Exception {

		Resource emftaSemanticResource = addEmftaResourceInAirdSession(emftaResource, aird_session, monitor);

		applySelectedViewpoints(aird_session, monitor);

		DRepresentation representation = getCreatedRepresentation(aird_session, emftaSemanticResource, monitor);

		openTFAViewer(aird_session, representation, monitor);
	}

	/**
	 * Creates the aird session from current project 2.
	 *
	 * @param project the project
	 * @param monitor the monitor
	 * @param name the name
	 * @return the session
	 * @throws Exception the exception
	 */
	private Session createAirdSessionFromCurrentProject2(IProject project, IProgressMonitor monitor, String name) throws Exception {
		IFile airdFile = project.getFile("representations-" + name + ".aird");
		return getSessionFromAirdFile(project, airdFile, monitor);
	}
	
	/**
	 * Creates the aird session from current project.
	 *
	 * @param project the project
	 * @param monitor the monitor
	 * @return the session
	 * @throws Exception the exception
	 */
	private Session createAirdSessionFromCurrentProject(IProject project, IProgressMonitor monitor) throws Exception {
		IFile airdFile = project.getFile("representations.aird");
		return getSessionFromAirdFile(project, airdFile, monitor);
	}

	/**
	 * Creates the aird.
	 *
	 * @param project the project
	 * @param representationsURI the representations URI
	 * @param monitor the monitor
	 * @return the session
	 * @throws CoreException the core exception
	 */
	private Session createAird(IProject project, URI representationsURI, IProgressMonitor monitor)
			throws CoreException {
		final Session session;
		Option<ModelingProject> modelingProject = ModelingProject.asModelingProject(project);
		if (modelingProject.some()) {
			session = modelingProject.get().getSession();
		} else {
			Session tempSession = null;
			SessionCreationOperation sessionCreationOperation = new DefaultLocalSessionCreationOperation(
					representationsURI, monitor);
			sessionCreationOperation.execute();
			tempSession = sessionCreationOperation.getCreatedSession();
			if (tempSession != null) {
				session = tempSession;
			} else {
				session = null;
			}
		}
		return session;
	}

	/**
	 * Gets the session from aird file.
	 *
	 * @param project the project
	 * @param airdFile the aird file
	 * @param monitor the monitor
	 * @return the session from aird file
	 * @throws Exception the exception
	 */
	private Session getSessionFromAirdFile(IProject project, IFile airdFile, IProgressMonitor monitor)
			throws Exception {

		URI airdFileURI = URI.createPlatformResourceURI(airdFile.getFullPath().toOSString(), true);

		if (!airdFile.exists()) {
			Console.write("!airdFile.exists(): "+airdFileURI.path());
			return createAird(project, airdFileURI, monitor);
		} else {
			Console.write("airdFile.exists(): "+airdFileURI.path());
			Session session = SessionManager.INSTANCE.getSession(airdFileURI, monitor);
			return session;
		}
	}

	/**
	 * Adds the URI resource as semantic resource.
	 *
	 * @param emftaURI the emfta URI
	 * @param aird_session the aird session
	 * @param monitor the monitor
	 */
	private void addURIResourceAsSemanticResource(URI emftaURI, Session aird_session, IProgressMonitor monitor) {
		// adding the resource to Sirius session
		AddSemanticResourceCommand addCommandToSession = new AddSemanticResourceCommand(aird_session, emftaURI,
				monitor);
		aird_session.getTransactionalEditingDomain().getCommandStack().execute(addCommandToSession);

	}

	/**
	 * Creates the FTA model.
	 *
	 * @return the FTA model
	 */
	private FTAModel createFTAModel() {
		EObject rootObject = EmftaFactoryImpl.eINSTANCE.createFTAModel();
		((FTAModel) rootObject).setName("FTA model root");
		return (FTAModel) rootObject;
	}

	/**
	 * Open existing FTA resource file.
	 *
	 * @param fileURI the file URI
	 * @param ftaModel the fta model
	 * @return the resource
	 * @throws Exception the exception
	 */
	private Resource openExistingFTAResourceFile(URI fileURI, FTAModel ftaModel) throws Exception {

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(fileURI);

		resource.getContents().add(ftaModel);

		return resource;
	}

	/**
	 * Gets the FTA model from xml file.
	 *
	 * @param xmlFile the xml file
	 * @return the FTA model from xml file
	 * @throws Exception the exception
	 */
	private FTAModel getFTAModelFromXmlFile(IFile xmlFile) throws Exception {
		FTAModel ftaModel = null;

		FaultTree xsapFaultTree = FaultTreeBuilder.getInstance()
				.populateFaultTreeClassesFromXml(xmlFile.getRawLocation().makeAbsolute().toFile());
		ftaModel = FaultTreeBuilder.getInstance().convertFaultTreeTypeInFTAModel(xsapFaultTree);

		return ftaModel;
	}

	/**
	 * Creates the EMFTA resource file.
	 *
	 * @param pathName the path name
	 * @param ftaModel the fta model
	 * @return the resource
	 * @throws Exception the exception
	 */
	private Resource createEMFTAResourceFile(String pathName, FTAModel ftaModel) throws Exception {

		URI ftaResourceFileURI = URI.createPlatformResourceURI(pathName, true);
		Console.write("ftaResourceFileURI: "+ftaResourceFileURI);
		ResourceSet resourceSet = new ResourceSetImpl();

		Resource resource = resourceSet.createResource(ftaResourceFileURI);

		resource.getContents().add(ftaModel);

		Map<Object, Object> options = new HashMap<Object, Object>();
		resource.save(options);

		return resource;

	}

	/**
	 * Gets the semantic resource.
	 *
	 * @param session the session
	 * @param resourceURI the resource URI
	 * @return the semantic resource
	 */
	private Resource getSemanticResource(Session session, URI resourceURI) {
		Resource semanticResource = null;
		for (Resource currSemanticResource : session.getSemanticResources()) {

			if (currSemanticResource.getURI() == resourceURI) {
				semanticResource = currSemanticResource;
				break;
			}
		}
		return semanticResource;
	}

	/**
	 * Open TFA viewer.
	 *
	 * @param session the session
	 * @param representation the representation
	 * @param monitor the monitor
	 */
	private void openTFAViewer(Session session, DRepresentation representation, IProgressMonitor monitor) {
		logger.debug("openTFAViewer");
		Console.write("openTFAViewer");
		DialectUIManager.INSTANCE.openEditor(session, representation, monitor);
	}

	/**
	 * Gets the diagram name from URI.
	 *
	 * @param fileURI the file URI
	 * @return the diagram name from URI
	 */
	private String getDiagramNameFromURI(URI fileURI) {
		String[] splittedUri = fileURI.toString().split("/");
		return splittedUri[splittedUri.length - 1];
	}

	/**
	 * Creates the representations.
	 *
	 * @param session the session
	 * @param diagramName the diagram name
	 * @param rootObject the root object
	 * @param monitor the monitor
	 * @throws Exception the exception
	 */
	private void createRepresentations(Session session, String diagramName, EObject rootObject,
			IProgressMonitor monitor) throws Exception {

		
		// create representation
		Collection<RepresentationDescription> descriptions = DialectManager.INSTANCE
				.getAvailableRepresentationDescriptions(session.getSelectedViewpoints(false), rootObject);
		if (descriptions.isEmpty())
			throw new Exception("Could not found representation description for object: " + rootObject);

		Iterator<RepresentationDescription> it = descriptions.iterator();

		while (it.hasNext()) {
			RepresentationDescription description = it.next();
			Console.write("CreateRepresentationCommand");
			Command createViewCommand = new CreateRepresentationCommand(session, description, rootObject, diagramName,
					monitor);
			session.getTransactionalEditingDomain().getCommandStack().execute(createViewCommand);
		}
	}

	/**
	 * Gets the created representation.
	 *
	 * @param aird_session the aird session
	 * @param emftaSemanticResource the emfta semantic resource
	 * @param monitor the monitor
	 * @return the created representation
	 * @throws Exception the exception
	 */
	//Metado cambiado por mi
	private DRepresentation getCreatedRepresentation(Session aird_session, Resource emftaSemanticResource,
			IProgressMonitor monitor) throws Exception {

		URI resourceURI = emftaSemanticResource.getURI();
		String diagramName = getDiagramNameFromURI(resourceURI);

		List<EObject> emftaObject = emftaSemanticResource.getContents();
		for(EObject obj : emftaObject){
			String name = "";
			EList<EAttribute> attrs = obj.eClass().getEAllAttributes();
			for(EAttribute a : attrs) {
				if(a.getName().equals("name")){
					name = obj.eGet(a).toString();
					break;
				}
			}

			createRepresentations(aird_session, name, obj, monitor);
		}
		

		//createRepresentations(aird_session, diagramName, emftaObject, monitor);
		return getRepresentation(resourceURI, emftaObject.get(0), aird_session);

	}

	/**
	 * Gets the representation.
	 *
	 * @param resourceURI the resource URI
	 * @param rootObject the root object
	 * @param session the session
	 * @return the representation
	 */
	private DRepresentation getRepresentation(URI resourceURI, EObject rootObject, Session session) {

		final DialectManager viewpointDialectManager = DialectManager.INSTANCE;
		Collection<DRepresentation> representations = viewpointDialectManager.getRepresentations(rootObject, session);

		URI reprURI = null;
		DRepresentation myDiagramRepresentation = null;
		for (DRepresentation currentRep : representations) {
			
			Console.write("currentRep: "+currentRep);
			
			@SuppressWarnings("restriction")
			boolean isInstanceOfDDsemanticDiagramSpec = (currentRep instanceof org.eclipse.sirius.diagram.business.internal.metamodel.spec.DSemanticDiagramSpec);

			if (isInstanceOfDDsemanticDiagramSpec) {
				
				Console.write("isInstanceOfDDsemanticDiagramSpec");
				
				@SuppressWarnings("restriction")
				org.eclipse.sirius.diagram.business.internal.metamodel.spec.DSemanticDiagramSpec currDiagram = (org.eclipse.sirius.diagram.business.internal.metamodel.spec.DSemanticDiagramSpec) currentRep;

				String diagramName = currDiagram.getDescription().getName();
				reprURI = ((DSemanticDiagram) currentRep).getTarget().eResource().getURI();

				if ((reprURI.equals(resourceURI)) && (diagramName.compareTo("Tree.diagram") == 0)) {
					myDiagramRepresentation = currentRep;
				}
			}
		}

		return myDiagramRepresentation;
	}

	/**
	 * Find in viewpoint in registry.
	 *
	 * @return the sets the
	 */
	private Set<Viewpoint> findInViewpointInRegistry() {
		final Set<Viewpoint> registry = ViewpointRegistry.getInstance().getViewpoints();
		Viewpoint candidateViewpoint = null;
		for (Viewpoint registeredViewpoint : registry) {
			if (registeredViewpoint.getName().equals(VIEWPOINT)) {
				candidateViewpoint = registeredViewpoint;
				Console.write("Viewpoint found: "+candidateViewpoint);
				break;
			}
		}
		final Set<Viewpoint> resultViewpoints = new HashSet<Viewpoint>();
		resultViewpoints.add(candidateViewpoint);
		return resultViewpoints;
	}

	/**
	 * Apply selected viewpoints.
	 *
	 * @param session the session
	 * @param monitor the monitor
	 */
	private void applySelectedViewpoints(final Session session, IProgressMonitor monitor) {

		Set<Viewpoint> viewpoints = findInViewpointInRegistry();

		ViewpointSelection.Callback callback = new ViewpointSelectionCallbackWithConfimation();

		@SuppressWarnings("restriction")
		RecordingCommand command = new org.eclipse.sirius.ui.business.internal.commands.ChangeViewpointSelectionCommand(
				session, callback, viewpoints, new HashSet<Viewpoint>(), true, monitor);
		TransactionalEditingDomain domain = session.getTransactionalEditingDomain();
		domain.getCommandStack().execute(command);
	}

}



