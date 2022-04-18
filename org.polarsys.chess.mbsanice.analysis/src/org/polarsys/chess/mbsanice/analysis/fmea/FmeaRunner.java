/*******************************************************************************
 *                  CHESS core plugin
 *
 *               Copyright (C) 2011-2015
 *            Mälardalen University, Sweden
 *
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License
 *  v1.0 which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.polarsys.chess.mbsanice.analysis.fmea;

import static org.polarsys.chess.core.util.CHESSProjectSupport.printlnToCHESSConsole;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.xssf.streaming.SXSSFCell;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Slot;
import org.polarsys.chess.core.util.CHESSProjectSupport;
import org.polarsys.chess.fla.common.FlaAnalysisException;
import org.polarsys.chess.fla.common.FlaLogger;
import org.polarsys.chess.fla.common.TransformationException;
import org.polarsys.chess.fla.flamm.Component;
import org.polarsys.chess.fla.flamm.CompositeComponent;
import org.polarsys.chess.fla.flamm.Expression;
import org.polarsys.chess.fla.flamm.Failure;
import org.polarsys.chess.fla.flamm.FlammPackage;
import org.polarsys.chess.fla.flamm.Port;
import org.polarsys.chess.fla.flamm.Rule;
import org.polarsys.chess.fla.flamm.SimpleComponent;
import org.polarsys.chess.fla.flamm.FailureTypes.FailureType;
import org.polarsys.chess.fla.flamm.analysis.FlaSystem;
import org.polarsys.chess.fla.preferences.FlaParameters;
import org.polarsys.chess.fla.transformations.QVToTransformation;
import org.polarsys.chess.fla.transformations.utilities.UtilitiesLibrary;
import org.polarsys.chess.mbsanice.analysis.Activator;
import org.polarsys.chess.mbsanice.analysis.preferences.MBSANICEPreferencePage;
import org.polarsys.chess.mbsanice.analysis.utils.Utils;

import fmea.Fmea;
import fmea.FmeaFactory;
import fmea.InterPort;
import fmea.Row;

public class FmeaRunner implements IRunnableWithProgress{

	protected static final String FLA_MM_EXTENSION = "flamm";
	protected static final String FLA_XML_EXTENSION = "flaxml";

	protected IContainer targetFolder;
	protected FlaSystem analyzedSystem;
	protected URI chessModelUri;
	protected Resource chessResource;
	protected Resource flaResource;
	protected String rootComponentQualifiedName = "";
	protected DiagramEditPart diagramEditPart;

	//if not null, specifies the list of leaf components to be considered as sources. if empty, all the leaf components will be considered as sources of failure. 
	protected List<InstanceSpecification> componentAsSource = null;
	protected String analysisContext = null;

	protected List <Slot> umlPortsAsColumnInFMEA;

	private ArrayList<Port> interPorts = null;

	//FMEA Excel table data
	private FileOutputStream fileOut = null;
	private SXSSFWorkbook  workbook = null;
	private SXSSFSheet worksheet = null;
	private SXSSFRow row = null;
	private int rowindex=1;
	private CellStyle textStyle=null;
	private final int END_EFFECT_COLUMN = 4;
	private final int START_CLOUMN_INDEX_FOR_INTERMEDIATE_PORTS = 5;

	public void setUmlPortsAsColumnInFMEA(List<Slot> ports){
		umlPortsAsColumnInFMEA = ports;
	}

	public void setAnalysisContext(String context){
		analysisContext = context;
	}

	public void setSourceComponent(List<InstanceSpecification> list){
		componentAsSource = list;
	}

	public IContainer getTargetFolder() {
		return targetFolder;
	}

	public void setTargetFolder(IContainer targetFolder) {
		this.targetFolder = targetFolder;
	}

	public URI getModelURI() {
		return chessModelUri;
	}

	public void setModelURI(URI modelURI) {
		this.chessModelUri = modelURI;
	}

	public void setRootComponent(String rootComponentQualifiedName) {
		this.rootComponentQualifiedName = rootComponentQualifiedName;
	}

	public Resource getChessResource() {
		return chessResource;
	}

	public void setChessResource(Resource chessResource) {
		this.chessResource = chessResource;
	}

	public void setDiagramEditPart(DiagramEditPart diagramEditPart) {
		this.diagramEditPart = diagramEditPart;
	}

	@Override
	public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
		final int numSubTasks = 4;

		monitor.beginTask("Running Failure Logic Analysis...",numSubTasks );
		if (monitor.isCanceled()) {
			throw new InterruptedException();
		}

		Fmea fmeaModel = runFLA(monitor, null);

		if (fmeaModel == null) {
			printlnToCHESSConsole("*** ERROR during analysis execution ***");
			monitor.done();
			throw new InterruptedException();
		}

		printlnToCHESSConsole("*** Concerto-FLA analysis was performed successfully ***");

		printlnToCHESSConsole("FMEA model created with "+fmeaModel.getRow().size()+" row.");

		//create file table from fmea model
		String filepath = targetFolder.getLocation().append(analysisContext + ".xlsx").toString();
		createFMEAFile(fmeaModel, interPorts, filepath);
		ArrayList<Port> bkpInterPort = interPorts;

		//enable the code below to save the FMEA model
		//			final ResourceSet resourceSet = new ResourceSetImpl();
		//			String filemodelpath = targetFolder.getLocation().append(analysisContext + ".xmi").toString();    
		//	        Resource xmiResource = resourceSet.createResource(URI.createFileURI(filemodelpath));
		//	        xmiResource.getContents().add(fmeaModel);
		//	        try {
		//				xmiResource.save(null);
		//			} catch (IOException e) {
		//				e.printStackTrace();
		//			}

		Boolean cleanFMEA = Activator.getDefault().getPreferenceStore().getBoolean(MBSANICEPreferencePage.FILTERFMEA);
		if (cleanFMEA){
			//TODO cleaning is a work in progress...
			removeBadRows(monitor, fmeaModel);
			CHESSProjectSupport.printlnToCHESSConsole("Filter FMEA model with "+fmeaModel.getRow().size()+" row.");
			//create file table from fmea model
			filepath = targetFolder.getLocation().append(analysisContext + "_filtered.xlsx").toString();
			createFMEAFile(fmeaModel, bkpInterPort, filepath);
		}

		monitor.done();
	}


	/**
	 * execute FLA, performing n FLAs in case of single component as source with n FLA rules
	 * 
	 * @param monitor
	 * @param fmeaRow the row can be used to pass constraints for interPorts... it can be null
	 * @return the FMEA model resulting from the FLA execution
	 * @throws InvocationTargetException
	 * @throws InterruptedException
	 */
	private Fmea runFLA(IProgressMonitor monitor, Row fmeaRow) throws InvocationTargetException, InterruptedException{

		final int numSubTasks = 4;
		//Init FMEA model
		Fmea fmeaModel = FmeaFactory.eINSTANCE.createFmea();

		try {
			monitor.beginTask("Running Failure Logic Analysis...",numSubTasks );
			if (monitor.isCanceled()) {
				throw new InterruptedException();
			}

			//ASSUMPTION componentAsSource.size<=1 ... work in progress
			if(componentAsSource!= null && componentAsSource.size()==1){
				List<Rule> faultInjectionsRules = new ArrayList<Rule>();

				//Create FLA model
				runInput2FlaTransformation(monitor);

				//get FPTC specification for the fault injector component 
				CompositeComponent flaRootComp = ((org.polarsys.chess.fla.flamm.CompositeComponent) flaResource.getContents().get(0));
				SimpleComponent faultInjector = Utils.getFLAMMComponent(flaRootComp, componentAsSource.get(0), "");
				List<Rule> faultInjectorRules = faultInjector.getRules();
				for (Rule r : faultInjectorRules){
					if (r.isSourceRule())
						faultInjectionsRules.add(r);
				}

				//perform one FLA analysis for each faultInjectionsRule, and merge the results into a single table
				for (Rule faultInjectionRule : faultInjectionsRules){

					printlnToCHESSConsole("Injecting rule : " + UtilitiesLibrary.rule2String(faultInjectionRule));

					//Create FLA model
					monitor.subTask("Performing model transformations...");
					runInput2FlaTransformation(monitor);
					monitor.worked(1);

					if (monitor.isCanceled()) {
						throw new InterruptedException();
					}

					flaRootComp = ((org.polarsys.chess.fla.flamm.CompositeComponent) flaResource.getContents().get(0));

					faultInjector = Utils.getFLAMMComponent(flaRootComp, componentAsSource.get(0), "");

					List<Rule> rulesToRemove  = new ArrayList<Rule>();
					for (Rule r : faultInjector.getRules()){
						if(!UtilitiesLibrary.rule2String(r).equals(UtilitiesLibrary.rule2String(faultInjectionRule)) && r.isSourceRule())
							rulesToRemove.add(r);
					}
					for (Rule r : rulesToRemove){
						faultInjector.getRules().remove(r);
					}		

					//TODO work in progress to solve bad rows issue
					//remove rule from intermediate components... 
					if (fmeaRow != null){
						SimpleComponent compToCheck = null;
						String portFailure;
						rulesToRemove.clear();

						for (InterPort interPort: fmeaRow.getInterPorts()){
							compToCheck = (SimpleComponent) interPort.getPort().getOwner();
							String path = Utils.getNamespace(compToCheck)+"."+compToCheck.getName()+"."+interPort.getPort().getName();
							String[] parts = path.split("\\.");
							Port actualPort = getPort(flaRootComp, parts, 1);
							SimpleComponent acualComponent = (SimpleComponent) actualPort.getOwner();


							for (Rule r : acualComponent.getRules()){
								portFailure = interPort.getPort().getName()+"."+interPort.getFailure().getId();
								if(!UtilitiesLibrary.rule2String(r).contains(portFailure))
									rulesToRemove.add(r);
							}
							for (Rule r : rulesToRemove){
								acualComponent.getRules().remove(r);
							}

						}
					}
					//end remove rule from intermediate components

					monitor.subTask("Applying failure propagation...");
					analyzeModel(flaResource);
					monitor.worked(1);

					if (monitor.isCanceled()) {
						throw new InterruptedException();
					}

					monitor.subTask("Propagating analysis results to the model...");
					backpropagateAnalysisResults(this.analyzedSystem, monitor);
					createOutputXmlFile(this.analyzedSystem, monitor);
					monitor.worked(1);

					//create FMEA model
					createFMEAmodel(analyzedSystem, fmeaModel);

					monitor.worked(1);

					Thread.sleep(1000);
				}

			}else{
				//no specific fault injector component specified...
				monitor.subTask("Performing model transformations...");
				runInput2FlaTransformation(monitor);
				monitor.worked(1);

				if (monitor.isCanceled()) {
					throw new InterruptedException();
				}

				monitor.subTask("Applying failure propagation...");
				analyzeModel(flaResource);
				monitor.worked(1);

				if (monitor.isCanceled()) {
					throw new InterruptedException();
				}

				monitor.subTask("Propagating analysis results to the model...");
				backpropagateAnalysisResults(this.analyzedSystem, monitor);
				createOutputXmlFile(this.analyzedSystem, monitor);
				monitor.worked(1);

				//create FMEA model
				createFMEAmodel(analyzedSystem, fmeaModel);

				//TODO FTA is a work in progress... COMMENTED AS WE HAVE A NEW FTA GENERATION APPROACH
				//				ComputeIsographFTA computeIsoFTA = new ComputeIsographFTA(this.analyzedSystem);
				//				computeIsoFTA.computeFTA();
				//				computeIsoFTA.saveFTAmodels(targetFolder);
				//				
				//				ComputeFTA  computeFTA = new ComputeFTA(this.analyzedSystem);
				//				computeFTA.computeFTA();
				//				computeFTA.saveFTAmodels(targetFolder);


				Thread.sleep(1000);
			}


		} catch (TransformationException e) {
			printlnToCHESSConsole("*** Error running FLA transformation ***");
			showErrorMessage("FLA Analysis", "Error during FLA transformation");
			return null;
		} catch (FlaAnalysisException e) {
			printlnToCHESSConsole("*** Error running FLA Analysis ***");
			printlnToCHESSConsole(e.toString());
			showErrorMessage("FLA Analysis", "Error during FLA analysis");
			return null;
		}

		return fmeaModel;
	}


	protected void analyzeModel(Resource resource) throws FlaAnalysisException {
		analyzeModel((org.polarsys.chess.fla.flamm.Component) resource.getContents().get(0));
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			throw new FlaAnalysisException(e);
		}
	}

	protected void analyzeModel(Component component) throws FlaAnalysisException {
		FlaSystem system = new FlaSystem(component);

		//TODO
		if (componentAsSource != null && componentAsSource.size()>0)
			intializeSources((CompositeComponent)component, componentAsSource.get(0), "");

		analyzeModel(system);
	}

	protected void analyzeModel(FlaSystem system) throws FlaAnalysisException {
		setPreferences(system);

		org.polarsys.chess.fla.flamm.analysis.FlaLogger logger = new FlaLogger();
		system.performAnalysis(logger);
		if (!logger.getWarnings().isEmpty()) {
			showErrorMessages("Warnings during analysis", logger.getWarnings());
		}
		analyzedSystem = system;
	}

	protected void setPreferences(FlaSystem system) {
		FlaParameters params = FlaParameters.getCurrentParameters();
		system.initializeNoFailure(params.getInitNoFailure());

		//in case of single component as source of failure/fault injection, then initialize its ports...
		if (!params.getInitNoFailure() && componentAsSource != null && componentAsSource.size()>0){
			SimpleComponent faultInjector = Utils.getFLAMMComponent((CompositeComponent) system.getRootComponent(), componentAsSource.get(0), "");
			faultInjector.initialize(true);
		}

		system.propagateUnmatchedFailures(params.getPropagateUnmatchedFailures());
		system.treatUnmentionedPortsAsWildcards(params.getTreatUnmentionedPortsAsWildcards());
	}

	protected void createOutputXmlFile(FlaSystem system, IProgressMonitor monitor) {
		String xmlPath = getOutputXmlPath();
		File outputFile = new File(xmlPath);
		outputFile.delete();

		//		FlaXmlWriter writer = new FlaXmlWriter(outputFile);
		//		writer.printSystem(system);

		try {
			runFla2XmlTransformation(monitor);
		} catch (TransformationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void backpropagateAnalysisResults(FlaSystem system, IProgressMonitor monitor) {
		try {
			runBackpropagationTransformation(monitor);
		} catch (TransformationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void runInput2FlaTransformation(IProgressMonitor monitor) throws TransformationException{
		FlammPackage.eINSTANCE.getClass();
		ResourceSet resourceSet = new ResourceSetImpl();
		URI flaMMuri = createFlaModelUri().appendFileExtension(FLA_MM_EXTENSION);
		new File(flaMMuri.path()).delete();
		flaResource = resourceSet.createResource(flaMMuri);

		QVToTransformation transformation = new QVToTransformation();

		Display.getDefault().syncExec(new Runnable() {
			public void run() {

				transformation.performChess2ConcertoFlaTransformation(chessResource, flaResource, monitor, rootComponentQualifiedName + "_instSpec");
			}
		});

		if (flaResource.getContents() == null || flaResource.getContents().isEmpty()) {
			throw new TransformationException();
		}

	}

	protected void runFla2XmlTransformation(IProgressMonitor monitor) throws TransformationException{
		ResourceSet resourceSet = new ResourceSetImpl();

		URI xmlUri = createFlaModelUri().appendFileExtension(FLA_XML_EXTENSION);

		Resource xmlResource = resourceSet.createResource(xmlUri);
		xmlResource.setURI(xmlUri.trimFileExtension().appendFileExtension("xml"));
		QVToTransformation transformation = new QVToTransformation();
		transformation.performConcertoFla2ConcertoFlaXMLTransformation(flaResource, xmlResource, monitor);
	}

	protected void runBackpropagationTransformation(IProgressMonitor monitor) throws TransformationException{
		QVToTransformation transformation = new QVToTransformation();
		transformation.performConcertoFla2ChessBackPropagation(flaResource, chessResource, monitor, rootComponentQualifiedName + "_instSpec", diagramEditPart);
	}

	protected URI createFlaModelUri() {
		String modelName = getModelName();
		String flaPath = targetFolder.getFullPath().toString() + "/" + modelName + "." + rootComponentQualifiedName.replaceAll("::", ".") + "_result";
		return URI.createPlatformResourceURI(flaPath, false);
	}

	protected String getOutputXmlPath() {
		String modelName = getModelName();
		return targetFolder.getLocation().append(modelName + "_result.xml").toString();
	}

	protected String getModelName() {
		return chessModelUri.lastSegment().substring(0, chessModelUri.lastSegment().lastIndexOf('.'));
	}

	protected void showErrorMessages(String title, List<String> messages) {
		StringBuilder sb = new StringBuilder();
		for (String message : messages) {
			sb.append(message + "\n");
		}
		showErrorMessage(title, sb.toString());
	}

	protected void showErrorMessage(String title, String message) {
		JOptionPane.showMessageDialog(
				new JFrame(),
				message,
				title, JOptionPane.ERROR_MESSAGE);

	}


	private void closeFMEATable(){
		try {
			workbook.write(fileOut);
			fileOut.close();
			workbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		workbook.dispose();
		fileOut = null;
		workbook = null;
		worksheet = null;
		row = null;
		rowindex=1;
		textStyle=null;
	}


	/**
	 * Returns the leaf components to be considered for the FMEA analysis
	 * 
	 * @param comp
	 * @return
	 */
	public ArrayList<SimpleComponent> getSimpleComponentsForFMEA(Component comp){
		ArrayList<SimpleComponent> arr = new ArrayList<SimpleComponent>();
		if (componentAsSource != null && componentAsSource.size()>0){
			SimpleComponent faultInjector = Utils.getFLAMMComponent((CompositeComponent) comp, componentAsSource.get(0), "");
			arr.add(faultInjector);
		}else
			arr = Utils.getSimpleComponents(comp);
		return arr;
	}


	private ArrayList<Failure> failureAlreadyProcessed = null;

	/**
	 * checks if the two failures are in a chain
	 * @param f1
	 * @param f2
	 * @return true if the failures are linked
	 */
	public boolean areInChain(Failure f1, Failure f2){

		if (f1.equals(f2)){
			return true;
		}

		failureAlreadyProcessed = new  ArrayList<Failure>();
		return areInChain_internal(f1, f2);
	}

	/**
	 * see areInChain
	 * @param f1
	 * @param f2
	 * @return
	 */
	private boolean areInChain_internal(Failure f1, Failure f2){

		for (Failure prev : f1.getPreviousFailures()){
			if (prev.equals(f2)){
				return true;
			}
		}

		boolean res = false;
		failureAlreadyProcessed.add(f1);
		for (Failure prev : f1.getPreviousFailures()){

			//skip noFailure in input, no needs to navigate it (we are not interested in propagation of noFailure)
			Port prevPort = (Port) prev.eContainer();
			if (prev.getId().equals(FailureType.NO_FAILURE.getName()) && prevPort.getOwner().getInputPorts().contains(prevPort)){
				continue;
			}

			//we have reached the same port, no needs to navigate further
			//			if (prevPort.equals(f2.eContainer()))
			//				continue;
			//			//we have reached the same component, no needs to navigate further
			//			if (prevPort.getOwner().equals(((Port)f2.eContainer()).getOwner()))
			//				continue;

			if (!failureAlreadyProcessed.contains(prev)){ //to avoid infinite loop while processing failures in a closed chain
				res = areInChain_internal(prev, f2);
				if (res)
					return true;
			}
		}
		return false;
	}


	private void intializeSources(CompositeComponent comp, InstanceSpecification source, String path){
		if (source == null)
			return;
		path = path + comp.getName();
		String temp="";
		for (Component child : comp.getComponents()){
			if (child instanceof SimpleComponent){

				temp = path+"."+child.getName();
				if (temp.compareTo(source.getName())==0){
					((SimpleComponent) child).setCanBeSourceOfFailure(true);
				}else{
					((SimpleComponent) child).setCanBeSourceOfFailure(false);
				}
			}
			else{
				intializeSources((CompositeComponent)child, source, path+".");
			}
		}
	}


	private ArrayList<Port> getPortToCheckWRTFailureMode (FlaSystem system){
		ArrayList<Port> list = new ArrayList<Port>();

		if (umlPortsAsColumnInFMEA == null || umlPortsAsColumnInFMEA.isEmpty())
			return list;

		for (Slot umlport : umlPortsAsColumnInFMEA){
			String path = umlport.getOwningInstance().getName()+"."+umlport.getDefiningFeature().getName();
			String[] parts = path.split("\\.");
			list.add(getPort(system.getRootComponent(), parts,1));
		}
		return list;
	}


	private Port getPort(Component comp, String[] path, int index){


		if (index == path.length-1){
			for (Port flaport: comp.getOutputPorts()){
				if (flaport.getName().equals(path[index]))
					return flaport;
			}
		}else{
			//assumption: comp is composite
			for (Component c : ((CompositeComponent) comp).getComponents()){
				if (c.getName().equals(path[index])){
					return getPort(c, path, index+1);
				}
			}
		}

		return null;
	}	

	/***
	 * Derive a FMEA model starting from the given FlaSystem
	 * @param system : the FlaSystem in input
	 * @param fmeaModel : the FMEA model where the FMEA rows will be added
	 */
	private void createFMEAmodel(FlaSystem system, Fmea fmeaModel){

		interPorts = getPortToCheckWRTFailureMode(analyzedSystem);

		Component root = system.getRootComponent();

		ArrayList<SimpleComponent> arrComp = getSimpleComponentsForFMEA(root);
		for (SimpleComponent simpleComp : arrComp){

			//check failures
			for (Port p : simpleComp.getOutputPorts()){

				for (Failure localFailure : p.getFailures()){

					//TODO
					if (localFailure.getRaisedByRule().isEmpty()){
						//TODO it can happen that no_Failure is associated to a port but it is not raised by any rule (maybe due to the no-failure initialization feature on each port, to be investigated), in this case it is skipped
						String msg = "WARNING: failure "+ localFailure.getId()+" on component port "+p.getOwner().getName()+"."+p.getName()+" has not been raised by any component's rule.";
						Activator.getDefault().getLog().log(new Status(Status.WARNING, Activator.PLUGIN_ID, Status.WARNING, msg, null));
						CHESSProjectSupport.printlnToCHESSConsole(msg);
						continue;
					}


					//one row for each failure
					Row fmearow =  FmeaFactory.eINSTANCE.createRow();
					fmeaModel.getRow().add(fmearow);

					fmearow.setLocalPort(p);
					fmearow.setLocalEffect(localFailure);

					fmearow.getFailureMode().addAll(localFailure.getRaisedByRule());

					//CHECK END EFFECTS
					Boolean first = true;


					Port endEffectPort;

					for (Port rootp: system.getRootComponent().getOutputPorts()){
						for (Failure rootFailure : rootp.getFailures()){
							if (areInChain(rootFailure, localFailure)){
								//one row for each end effect
								if (first){
									first = false;
								}else{
									//create a new row as copy
									fmearow = EcoreUtil.copy(fmearow); 
									fmeaModel.getRow().add(fmearow);
									fmearow.getInterPorts().clear();

								}
								endEffectPort = ((Port)rootFailure.eContainer());
								fmearow.setEndPort(endEffectPort);
								fmearow.setEndEffect(rootFailure);

								//TODO
								//assumption: ports are in chain (wrt failure propagation) and appear in the list in a bottom-up order, from startingFailure to rootFailure

								if (interPorts.size()>0) {

									addInterPort(fmearow, localFailure, 0, rootFailure, fmeaModel);

								}
							}
						}

						//Activator.getDefault().getLog().log(new Status(Status.WARNING, Activator.PLUGIN_ID, Status.WARNING, cell.getStringCellValue(), null));
						//CHESSProjectSupport.printlnToCHESSConsole("FMEA model created with "+table.getRow().size()+" row.");

					}
				}
			}
		}
	}


	private void addInterPort(Row fmearow, Failure startingFailure, int interPortIndex, Failure rootFailure, Fmea fmeaModel){
		//assumption: ports are in chain (wrt failure propagation) and appear in the list in a bottom-up order, from startingFailure to rootFailure

		Port interPort = interPorts.get(interPortIndex);
		Boolean first = true;

		for (Failure f : interPort.getFailures()){

			if (f.getType().equals(FailureType.NO_FAILURE) && f.getRaisedByRule().isEmpty()){
				//TODO it can happen that no_Failure is associated to a port but it is not raised by any rule (due to the no-failure initialization feature on each port, to be investigated), in this case it is skipped
				continue;
			}


			if (areInChain(rootFailure, f) && areInChain(f, startingFailure)){

				if (!first){
					//create a new row as copy, with cleared interPorts attribute
					fmearow = EcoreUtil.copy(fmearow); 
					fmeaModel.getRow().add(fmearow);
					if (interPortIndex == 0)
						fmearow.getInterPorts().clear();
					else{
						int size = fmearow.getInterPorts().size();
						while (size > interPortIndex){
							fmearow.getInterPorts().remove(size-1);
							size--;
						}
					}
				}

				first = false;

				InterPort interport = FmeaFactory.eINSTANCE.createInterPort();

				fmearow.getInterPorts().add(interport);
				interport.setPort(interPort);
				interport.setFailure(f);

				if (interPorts.size() > interPortIndex+1){
					addInterPort(fmearow, f, interPortIndex+1, rootFailure, fmeaModel);
				}
			}else{
				if (interPorts.size() > interPortIndex+1){
					addInterPort(fmearow, startingFailure, interPortIndex+1, rootFailure, fmeaModel);
				}
			}

		}

	}

	/**
	 * transform and store the FMEA model into an Excel file
	 * @param fmea
	 * @param interPorts
	 * @param filepath
	 */
	private void createFMEAFile(Fmea fmea, List<Port> interPorts, String filepath){

		FileOutputStream fileOut = null;
		if (fileOut == null)
			try {
				fileOut = new FileOutputStream(filepath);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		SXSSFWorkbook fmeaWorkbook = null;;
		if (fmeaWorkbook == null) {

			workbook = new SXSSFWorkbook (100);
			worksheet = workbook.createSheet("FLA");


			// create 2 cell styles
			CellStyle cs1 = workbook.createCellStyle();
			CellStyle cs2 = workbook.createCellStyle();

			// create 2 fonts objects
			Font f = workbook.createFont();
			Font f2 = workbook.createFont();

			//set font 1 to 12 point type
			f.setFontHeightInPoints((short) 12);
			//make it blue
			f.setColor( (short)0xc );
			// make it bold
			//arial is the default font
			f.setBoldweight(Font.BOLDWEIGHT_BOLD);

			//set font 2 to 10 point type
			f2.setFontHeightInPoints((short) 12);
			//make it red
			f2.setColor( (short)0xc );
			//make it bold
			f2.setBoldweight(Font.BOLDWEIGHT_BOLD);

			//set cell stlye
			cs1.setFont(f);
			//set the cell format 
			//cs.setDataFormat(df.getFormat("#,##0.0"));

			//set a thin border
			cs1.setBorderBottom(CellStyle.BORDER_THIN);
			//fill w fg fill color
			cs1.setFillPattern((short) CellStyle.SOLID_FOREGROUND);
			//set the cell format to text see DataFormat for a full list
			cs1.setDataFormat(HSSFDataFormat.getBuiltinFormat("text"));

			// set the font
			cs2.setFont(f2);
			cs2.setWrapText(true);
			cs2.setShrinkToFit(true);

			DataFormat fmt = workbook.createDataFormat();
			textStyle = workbook.createCellStyle();
			textStyle.setDataFormat(fmt.getFormat("@"));
			textStyle.setShrinkToFit(true);
			textStyle.setWrapText(true);

			workbook.setSheetName(0, analyzedSystem.getRootComponent().getName());

			// index from 0,0... cell A1 is cell(0,0)
			rowindex=1;
			//create column names
			row = worksheet.createRow(0);
			// make the row height bigger  (in twips - 1/20 of a point)
			row.setHeight((short) 0x249);

			SXSSFCell cell = row.createCell(0);

			//cell.setCellValue("LRU");
			cell.setCellValue("SYSTEM PATH");
			cell.setCellStyle(cs2);
			cell = row.createCell(1);
			cell.setCellValue("FUNCTION");
			cell.setCellStyle(cs2);
			cell = row.createCell(2);
			cell.setCellValue("FAILURE MODES");
			cell.setCellStyle(cs2);
			cell = row.createCell(3);
			cell.setCellValue("LOCAL EFFECTS");
			cell.setCellStyle(cs2);
			//		cell = row.createCell(4);
			//		cell.setCellValue("NEXT HIGHER EFFECTS");
			//		cell.setCellStyle(cs2);
			cell = row.createCell(4);
			cell.setCellValue("END EFFECTS");
			cell.setCellStyle(cs2);

			int col = 5;
			//

			for (Port p : interPorts){
				cell = row.createCell(col);
				cell.setCellValue(Utils.getNamespace(p.getOwner())+"."+p.getOwner().getName()+"."+p.getName());
				cell.setCellStyle(cs2);
				col++;
			}
			//

			cell = row.createCell(col);
			cell.setCellValue("COMPENSATING PROVISION\n (SAFETY EXPERT)");
			cell.setCellStyle(cs2);

			cell = row.createCell(++col);
			cell.setCellValue("SEVERITY\n (SAFETY EXPERT)");
			cell.setCellStyle(cs2);

			cell = row.createCell(++col);
			cell.setCellValue("FAILURE RATE\n (SAFETY EXPERT)");
			cell.setCellStyle(cs2);


			for (int i=0; i<9; i++){
				worksheet.setColumnWidth((short) (i), (short) ((50 * 8) / ((double) 1 / 20)));
				worksheet.setDefaultColumnStyle(i, textStyle);
			}

		}

		SXSSFCell cell = null;

		for (Row fmeaRow : fmea.getRow()){

//			if(fmeaRow.getEndPort() != null){
			if(true){
				row = worksheet.createRow(rowindex);


				cell = row.createCell(0);
				cell.setCellValue(Utils.getNamespace(fmeaRow.getLocalPort().getOwner()));

				//FUNCTION
				cell = row.createCell(1);
				cell.setCellValue(fmeaRow.getLocalPort().getOwner().getName().substring(0, 1).toUpperCase()+fmeaRow.getLocalPort().getOwner().getName().substring(1));

				//LOCAL EFFECTS
				cell = row.createCell(3);
				cell.setCellValue(fmeaRow.getLocalEffect().getId().toUpperCase()+" failure at "+fmeaRow.getLocalPort().getName()+" port");

				//FAILURE MODE
				cell = row.createCell(2);
				boolean empty= true;
				String temp = "";
				//derive rule which propagated the failure
				//if (!failure.getRaisedByRule().isEmpty()){
				for (Rule rule : fmeaRow.getFailureMode()){
					if (empty){
						cell.setCellValue(cell.getStringCellValue()+"{");
						empty = false;
					}else{
						try{
							cell.setCellValue(cell.getStringCellValue()+"\n{");
						}catch(Exception ex){
							ex.printStackTrace();
						}
					}
					boolean first = true;
					for (Expression exp: rule.getInputExpression()){

						for (Failure fail : exp.getFailures()){
							if (first){
								try{
									cell.setCellValue(cell.getStringCellValue()+exp.getPort().getName()+"."+fail.getId()+";");
								}catch(Exception ex){
									ex.printStackTrace();
								}
								first = false;
							}else
								try{
									cell.setCellValue(cell.getStringCellValue()+"\n "+exp.getPort().getName()+"."+fail.getId()+";");
								}catch(Exception ex){
									ex.printStackTrace();
								}
						}

					}
					temp =cell.getStringCellValue();
					cell.setCellValue(temp.substring(0,  temp.length()-1)+"}");

				}
				cell.setCellStyle(textStyle);

				cell = row.createCell(END_EFFECT_COLUMN);
				if (fmeaRow.getEndPort() != null && fmeaRow.getEndEffect() != null)
					cell.setCellValue(fmeaRow.getEndPort().getOwner().getName()+"."+fmeaRow.getEndPort().getName()+"."+fmeaRow.getEndEffect().getId());



				for (InterPort interPort: fmeaRow.getInterPorts()){

					int index = interPorts.indexOf(interPort.getPort());	
					cell = row.createCell(START_CLOUMN_INDEX_FOR_INTERMEDIATE_PORTS+index);
					cell.setCellValue(interPort.getPort().getName()+"."+interPort.getFailure().getId());
				}

				cell.setCellStyle(textStyle);
				rowindex++;
			}
		}

		try {
			workbook.write(fileOut);
			fileOut.close();
			workbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * EXPERIMENTAL
	 * @param monitor
	 * @param originalFmeaModel
	 */
	private void removeBadRows(IProgressMonitor monitor, Fmea originalFmeaModel){
		//for each row, check intermediate ports, i.e. consider the failure of intermediate ports and rerun an analysis by freezing the failures of the intermediate ports

		Fmea tempFmeaModel = null;
		List<Row> toRemove = new ArrayList<Row>();
		for (Row originalFmeaRow : originalFmeaModel.getRow()){

			if (originalFmeaRow.getInterPorts().isEmpty())
				continue; //nothing to check

			try {
				//run the analysis with the constraints given by the interports referred by the current row
				tempFmeaModel = runFLA(monitor, originalFmeaRow);

				//check if in the new analysis we have the same end effect
				boolean found = false;
				for (Row tempRow : tempFmeaModel.getRow()){
					if (originalFmeaRow.getLocalEffect().getId().equals(tempRow.getLocalEffect().getId())){
						//check interports
						if (!originalFmeaRow.getInterPorts().isEmpty() && ! tempRow.getInterPorts().isEmpty()){
							//check end effect
							if (originalFmeaRow.getEndEffect().getId().equals(tempRow.getEndEffect().getId())){
								found = true;
								break;
							}
						}

					}
				}
				if (!found){
					//remove row
					toRemove.add(originalFmeaRow);
				}

			} catch (InvocationTargetException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		for (Row row : toRemove){
			originalFmeaModel.getRow().remove(row);
		}

	}

}