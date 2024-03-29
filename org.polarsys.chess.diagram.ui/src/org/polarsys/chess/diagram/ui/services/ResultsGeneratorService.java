/*******************************************************************************
 * Copyright (C) 2018 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *  
 * Contributors:
 *     Luca Cristoforetti - initial API and implementation
 ******************************************************************************/
package org.polarsys.chess.diagram.ui.services;

import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Class;
import org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Analysis;
import org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement;
import org.polarsys.chess.contracts.profile.chesscontract.util.EntityUtil;
import org.polarsys.chess.service.core.utils.AnalysisResultUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
//import org.eclipse.core.resources.IFile;
//import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.factory.SessionFactory;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.dialect.ExportFormat;
import org.eclipse.sirius.ui.business.api.dialect.ExportFormat.ExportDocumentFormat;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;
import org.eclipse.sirius.ui.tools.api.actions.export.SizeTooLargeException;
import org.eclipse.sirius.viewpoint.DRepresentation;
//import org.eclipse.ui.IEditorPart;
//import org.eclipse.ui.IFileEditorInput;
//import org.eclipse.ui.IWorkbench;
//import org.eclipse.ui.IWorkbenchPage;
//import org.eclipse.ui.IWorkbenchWindow;
//import org.eclipse.ui.PlatformUI;
import org.eclipse.sirius.common.tools.api.resource.ImageFileFormat;

import eu.fbk.eclipse.standardtools.diagram.ContainerDescriptor;
import eu.fbk.eclipse.standardtools.diagram.ContractFtaResultDescriptor;
import eu.fbk.eclipse.standardtools.diagram.ContractImplementationResultDescriptor;
import eu.fbk.eclipse.standardtools.diagram.ContractRefinementResultDescriptor;
import eu.fbk.eclipse.standardtools.diagram.DocumentGenerator;
import eu.fbk.eclipse.standardtools.diagram.FmeaResultDescriptor;
import eu.fbk.eclipse.standardtools.diagram.FtaResultDescriptor;
import eu.fbk.eclipse.standardtools.diagram.ModelCheckingResultDescriptor;
import eu.fbk.eclipse.standardtools.diagram.PropertyValidationResultDescriptor;
import eu.fbk.eclipse.standardtools.utils.core.utils.StringArrayUtil;
import eu.fbk.eclipse.standardtools.utils.ui.utils.DirectoryUtil;
import eu.fbk.tools.adapter.nusmv.CounterExample;
import eu.fbk.tools.adapter.nuxmv.CheckBehaviourResultBuilder;
import eu.fbk.tools.adapter.ocra.CheckContractResultBuilder;
import eu.fbk.tools.adapter.results.CheckResult;
import eu.fbk.tools.adapter.ocra.OcraOutput;
import eu.fbk.tools.adapter.results.ContractCheckResult;
import eu.fbk.tools.adapter.results.ContractPropertyValidationResult;
import eu.fbk.tools.adapter.results.ModelCheckResult;
import eu.fbk.tools.adapter.xsap.ComputeFmeaTableResultBuilder;
import eu.fbk.tools.adapter.xsap.table.FmeaTable;
import eu.fbk.tools.adapter.xsap.table.FmeaTable.Row;

/**
 * This class creates and stores the result descriptors needed by the document generation.
 * @author cristofo
 *
 */
public class ResultsGeneratorService {
	private static final Logger logger = Logger.getLogger(ResultsGeneratorService.class);
	private AnalysisResultUtil analysisResultUtil = AnalysisResultUtil.getInstance();
	private boolean showAnalysisResults;
	private String outputDirectoryName;
	private String imageExtension;
	
	public void setParametersBeforeDocumentGeneration(String outputDirectoryName, boolean showAnalysisResults,
			String imageExtension) {
		this.outputDirectoryName = outputDirectoryName;
		this.showAnalysisResults = showAnalysisResults;
		this.imageExtension = imageExtension;
	}
	
	/**
	 * Creates a FmeaResultDescriptor from the given ResultElement.
	 * @param resultElement the element containing the data
	 * @return the newly created descriptor
	 */
	private FmeaResultDescriptor createFmeaResultDescriptor(AnalysisContextElement resultElement) {
		final FmeaResultDescriptor fmeaResultDescriptor = new FmeaResultDescriptor();
		
		fmeaResultDescriptor.conditions = resultElement.getConditions().get(0);
		fmeaResultDescriptor.rootClass = EntityUtil.getInstance().getName(resultElement.getRoot());
		
		
		final ComputeFmeaTableResultBuilder resultBuilder = new ComputeFmeaTableResultBuilder();
		final FmeaTable fmeaTable = resultBuilder.unmarshalResult(resultElement.getResult());
		if( fmeaTable == null || fmeaTable.getRow() == null || fmeaTable.getRow().isEmpty() ) {
			logger.debug("Internal error while unmarshalling the result. For more info see the console");
			return null;
		}

		// Parse the rows and store them
		final List<Row> rows = fmeaTable.getRow();
		for (Row row : rows) {
			final String[] line = new String[3];
			line[0] = row.getEntry();
			line[1] = row.getFailureMode();
			line[2] = row.getFailureEffects();
			fmeaResultDescriptor.lines.add(line);
		}
				
		return fmeaResultDescriptor;
	}
	
	/**
	 * Creates a ContractRefinementResultDescriptor from the given ResultElement.
	 * @param resultElement the element containing the data
	 * @return the newly created descriptor
	 */
	private ContractRefinementResultDescriptor createContractRefinementResultDescriptor(AnalysisContextElement resultElement) {
		final ContractRefinementResultDescriptor contractRefinementResultDescriptor = 
				new ContractRefinementResultDescriptor();
		
		contractRefinementResultDescriptor.rootClass = EntityUtil.getInstance().getName(resultElement.getRoot());
		
	
		final CheckContractResultBuilder resultBuilder = new CheckContractResultBuilder();
		final OcraOutput ocraOutput = resultBuilder.unmarshalResult(resultElement.getResult());
		if(ocraOutput == null || ocraOutput.getOcraResult() == null || ocraOutput.getOcraResult().isEmpty()) {
			logger.debug("Error while unmarshalling the result. For more info see the console");
			return null;
		}

		final ModelCheckResult contractCheckResult = resultBuilder.buildResult(ocraOutput);
		if(contractCheckResult == null) {
			logger.debug("Internal error while building the result. For more info see the console");
			return null;
		}

		final List<ContractCheckResult> contractCheckResults = contractCheckResult.getContractCheckResults();
		for (ContractCheckResult result : contractCheckResults) {
			if (result.getCheckType().equals("ocra_check_refinement")) {
				final String[] line = new String[2];
				line[0] = "[" + result.getComponentType() + "] " + result.getContractName();
				line[1] = result.getFailed()? "NOT OK": "Success";
				contractRefinementResultDescriptor.lines.add(line);
			}

//			System.out.println("\nresult.getCheckType() = " + result.getCheckType());
//			System.out.println("result.getComponentName() = " + result.getComponentName());
//			System.out.println("result.getComponentType() = " + result.getComponentType());
//			System.out.println("result.getContractName() = " + result.getContractName());
//
//			System.out.println("result.getFailed() = " + result.getFailed());
//
//			EList<CheckResult> checkResults = result.getCheckResults();
//			for (CheckResult checkResult : checkResults) {
//				checkResult.getContractName();
//				System.out.println("\tcheckResult.getContractName() = " + checkResult.getContractName());
//				System.out.println("\tcheckResult.getProofType() = " + checkResult.getProofType());
//				System.out.println("\tcheckResult.getValue() = " + checkResult.getValue());
//			}
		}

		return contractRefinementResultDescriptor;
	}
	
	/**
	 * Creates a ContractImplementationResultDescriptor from the given ResultElement.
	 * @param resultElement the element containing the data
	 * @return the newly created descriptor
	 */
	private ContractImplementationResultDescriptor createContractImplementationResultDescriptor(AnalysisContextElement resultElement) {
		final ContractImplementationResultDescriptor contractImplementationResultDescriptor = 
				new ContractImplementationResultDescriptor();
		
		contractImplementationResultDescriptor.rootClass = EntityUtil.getInstance().getName(resultElement.getRoot());
		
		final CheckContractResultBuilder resultBuilder = new CheckContractResultBuilder();
		final OcraOutput ocraOutput = resultBuilder.unmarshalResult(resultElement.getResult());
		if(ocraOutput == null || ocraOutput.getOcraResult() == null || ocraOutput.getOcraResult().isEmpty()) {
			logger.error("Error while unmarshalling the result. For more info see the console");
			return null;
		}

		final ModelCheckResult contractCheckResult = resultBuilder.buildResult(ocraOutput);
		if(contractCheckResult == null) {
			logger.error("Internal error while building the result. For more info see the console");
			return null;
		}

		final List<ContractCheckResult> contractCheckResults = contractCheckResult.getContractCheckResults();
		for (ContractCheckResult result : contractCheckResults) {
			if (result.getCheckType().equals("ocra_check_refinement") || 
					result.getCheckType().equals("ocra_check_implementation")) {

				final String[] line = new String[2];
				line[0] = "[" + result.getComponentType() + "] " + result.getContractName();
				line[1] = result.getFailed()? "NOT OK": "Success";
				contractImplementationResultDescriptor.lines.add(line);

//				System.out.println("\nresult.getCheckType() = " + result.getCheckType());
//				System.out.println("result.getComponentName() = " + result.getComponentName());
//				System.out.println("result.getComponentType() = " + result.getComponentType());
//				System.out.println("result.getContractName() = " + result.getContractName());
//
//				System.out.println("result.getFailed() = " + result.getFailed());
//
//				EList<CheckResult> checkResults = result.getCheckResults();
//				for (CheckResult checkResult : checkResults) {
//					checkResult.getContractName();
//					System.out.println("\tcheckResult.getContractName() = " + checkResult.getContractName());
//					System.out.println("\tcheckResult.getProofType() = " + checkResult.getProofType());
//					System.out.println("\tcheckResult.getValue() = " + checkResult.getValue());
//				}
			}
		}

		return contractImplementationResultDescriptor;
	}
	
	/**
	 * Creates a PropertyValidationResultDescriptor from the given ResultElement.
	 * @param resultElement the element containing the data
	 * @return the newly created descriptor
	 */
	private PropertyValidationResultDescriptor createPropertyValidationResultDescriptor(AnalysisContextElement resultElement) {
		final PropertyValidationResultDescriptor propertyValidationResultDescriptor = 
				new PropertyValidationResultDescriptor();
		
		propertyValidationResultDescriptor.rootClass = EntityUtil.getInstance().getName(resultElement.getRoot());
		
		// Parse the string containing the analysis details
		final EList<String> conditions = resultElement.getConditions();	
		propertyValidationResultDescriptor.validationType = StringArrayUtil.getConditionValue(conditions, AnalysisResultUtil.CHECK_TYPE);
		if (StringArrayUtil.getConditionValue(conditions, AnalysisResultUtil.SELECTED_COMPONENTS)!=null) {
			propertyValidationResultDescriptor.selectedComponent = StringArrayUtil.getConditionValue(conditions, AnalysisResultUtil.SELECTED_COMPONENTS);
		}
		if (StringArrayUtil.getConditionValue(conditions, AnalysisResultUtil.SELECTED_PROPERTIES)!=null) {
			propertyValidationResultDescriptor.selectedProperties = StringArrayUtil.getConditionValue(conditions, AnalysisResultUtil.SELECTED_PROPERTIES).replace(",", ", ");
		}
		if (StringArrayUtil.getConditionValue(conditions, AnalysisResultUtil.PROPERTY)!=null) {
			propertyValidationResultDescriptor.conditions = StringArrayUtil.getConditionValue(conditions, AnalysisResultUtil.PROPERTY);
		}
				
		
		final CheckContractResultBuilder resultBuilder = new CheckContractResultBuilder();
		final OcraOutput ocraOutput = resultBuilder.unmarshalResult(resultElement.getResult());
		if(ocraOutput == null || ocraOutput.getOcraResult() == null || ocraOutput.getOcraResult().isEmpty()) {
			logger.error("Error while unmarshalling the result. For more info see the console");
			return null;
		}

		final ModelCheckResult contractCheckResult = resultBuilder.buildResult(ocraOutput);
		if(contractCheckResult == null) {
			logger.error("Internal error while building the result. For more info see the console");
			return null;
		}

		final List<ContractPropertyValidationResult> propertyValidationResults = 
				contractCheckResult.getPropertyValidationResults();
		for (ContractPropertyValidationResult result : propertyValidationResults) {
			if (result.getCheckType().contains("ocra_check_validation_prop")) {
				final EList<CheckResult> checkResults = result.getCheckResults();
				if (checkResults.size() > 0) {
					final String[] line = new String[2];
					line[0] = "[" + result.getName() + "]";
					final String checkValue = checkResults.get(0).getValue();
					if (checkValue.equals("OK")) {
						line[1] = "Success";
					} else if (checkValue.equals("NOT_OK")) {
						line[1] = "NOT OK";
					} else if (checkValue.equals("UNKNOWN")) {
						line[1] = "Unknown";
					} else {
						line[1] = checkValue;
					}					
					propertyValidationResultDescriptor.lines.add(line);
				}
			}
//			System.out.println("\nresult.getCheckType() = " + result.getCheckType());
//			System.out.println("result.getModelName() = " + result.getModelName());
//			System.out.println("result.getName() = " + result.getName());
//
//			System.out.println("result.getFailed() = " + result.getFailed());
//
//			EList<CheckResult> checkResults = result.getCheckResults();
//			for (CheckResult checkResult : checkResults) {
//				checkResult.getContractName();
//				System.out.println("\tcheckResult.getContractName() = " + checkResult.getContractName());
//				System.out.println("\tcheckResult.getProofType() = " + checkResult.getProofType());
//				System.out.println("\tcheckResult.getValue() = " + checkResult.getValue());
//			}
		}

		return propertyValidationResultDescriptor;
	}
	
	/**
	 * Creates a ModelCheckingResultDescriptor from the given ResultElement.
	 * @param resultElement the element containing the data
	 * @return the newly created descriptor
	 */
	private ModelCheckingResultDescriptor createModelCheckingResultDescriptor(AnalysisContextElement resultElement) {
		final ModelCheckingResultDescriptor modelCheckingResultDescriptor = 
				new ModelCheckingResultDescriptor();
		
		modelCheckingResultDescriptor.rootClass = EntityUtil.getInstance().getName(resultElement.getRoot());

		// Parse the string containing the analysis details
		final EList<String> conditions = resultElement.getConditions();	
		
		modelCheckingResultDescriptor.checkType = StringArrayUtil.getConditionValue(conditions, AnalysisResultUtil.CHECK_TYPE);
		if (StringArrayUtil.getConditionValue(conditions, AnalysisResultUtil.PROPERTY)!=null) {
			modelCheckingResultDescriptor.conditions = StringArrayUtil.getConditionValue(conditions, AnalysisResultUtil.PROPERTY);
		}
		
	
		//FIXME: the handling of the results here is not safe. I assume that if no result
		// file is present, there are no counterexamples and the model check is successful.
		// This behavior could change in future releases.
		
		// If there is no result file, the analysis was successful
		if (resultElement.getResult()==null) {
			modelCheckingResultDescriptor.result = "Success";
			return modelCheckingResultDescriptor;
		}
		
		// Try to parse the result, if there is a counterexample, the model is not ok
		final CheckBehaviourResultBuilder resultBuilder = new CheckBehaviourResultBuilder();
			final CounterExample counterExample = resultBuilder.unmarshalResult(resultElement.getResult());
			if(counterExample == null || counterExample.getDesc() == null || 
					counterExample.getId() == null || counterExample.getNode() == null) {
				logger.error("Internal error while processing the result. For more info see the console");
				return null;
			}
			modelCheckingResultDescriptor.result = "NOT OK";
			return modelCheckingResultDescriptor;
		
		
	}

	/**
	 * Computes the EMFTA name from the given XML file.
	 * @param fullPath the full name of the XML file
	 * @return the name of the corresponding EMFTA file
	 */
	private String getEmftaFile(String fullPath) {
		String emftaFile = fullPath.substring(fullPath.lastIndexOf(File.separator) + 1, fullPath.length());
		
		return emftaFile + ".emfta";
	}
	
//	/**
//	 * Returns the full path of the current opened project.
//	 * @return
//	 */
//	private String getCurrentPath() {
//		final IWorkbench iworkbench = PlatformUI.getWorkbench();
//		final IWorkbenchWindow iworkbenchwindow = iworkbench.getActiveWorkbenchWindow();
//		final IWorkbenchPage iworkbenchpage = iworkbenchwindow.getActivePage();
//		final IEditorPart ieditorpart = iworkbenchpage.getActiveEditor();
//		final IFileEditorInput input = (IFileEditorInput) ieditorpart.getEditorInput();
//		final IFile inputfile = input.getFile();
//		final IProject project = inputfile.getProject();
//
//		logger.debug("current path = " + project.getLocation().toString());
//		
//		return project.getLocation().toString();
//	}
	
	/**
	 * Removes the extension from a file name, from the first dot onward.
	 * @param fileName the name to process
	 * @return the processed file name
	 */
	private String removeExtension(String fileName) {
		return fileName.substring(0, fileName.indexOf("."));
	}
	
	/**
	 * Exports the Sirius diagram on disk, in the same position as other diagrams.
	 * @param diagramPath the name of the .emfta diagram
	 * @return the path of the exported image
	 */
	private String exportSiriusDiagramToFile(String diagramPath) {
		
		// Save the active sessions, if any. Otherwise fresh diagrams won't be present in the file
		final Collection<IEditingSession> s = SessionUIManager.INSTANCE.getUISessions();
		for (IEditingSession iEditingSession : s) {
			final Session openSession = iEditingSession.getSession();
			openSession.save(new NullProgressMonitor());
		}
		
		String currentPath = "";
		try {
			currentPath = DirectoryUtil.getInstance().getCurrentProjectDir();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		final URI sessionResourceURI = URI.createFileURI(currentPath + File.separator + "representations.aird");
		Session session = null;
		try {
			session = SessionFactory.INSTANCE.createSession(sessionResourceURI, new NullProgressMonitor());
		} catch (CoreException e) {
			logger.error("Error in creating session for sirius diagram export");
			return "notFound.gif";
		}
		session.open(new NullProgressMonitor());
		
		// Get all the representations containing the requested diagram
		final String diagramName = getEmftaFile(diagramPath);
		final List<DRepresentation> myRepresentations = new ArrayList<DRepresentation>();
		final Collection<DRepresentation> allRepresentations = DialectManager.INSTANCE.getAllRepresentations(session);
		for (DRepresentation dRepresentation : allRepresentations) {
			if (dRepresentation.getName().equals(diagramName)) {
				logger.debug("\nfound the requested representation: " + diagramName);
				myRepresentations.add(dRepresentation);
			}
		}
		
		if (myRepresentations.size() != 0) {
			
			// PDF images are not handled, so export them in PNG
			String fileName = outputDirectoryName + File.separator + removeExtension(diagramName);
			final String extension = imageExtension.equals(".svg") ? imageExtension : ".png";
			fileName += extension;			
		
			// Export the first representation as SVG image
			ExportFormat exportFormat = null;
			if (extension.equals(".svg")) {
				exportFormat = new ExportFormat(ExportDocumentFormat.NONE, ImageFileFormat.SVG);
			} else {
				exportFormat = new ExportFormat(ExportDocumentFormat.NONE, ImageFileFormat.PNG);
			}
			try {
				//			representation = myRepresentations.get(1);
				DialectUIManager.INSTANCE.export(myRepresentations.get(0), session, new Path(fileName),
						exportFormat, new NullProgressMonitor());
			} catch (SizeTooLargeException e) {
				logger.error("Sirius diagram too large for export");
				return "notFound.gif";
			}
			return removeExtension(diagramName) + extension;	// Return the file name without path
		}
		logger.error("No sirius diagram found for export");
		return "notFound.gif";
	}
	
	/**
	 * Creates a FtaResultDescriptor from the given ResultElement.
	 * @param resultElement the element containing the data
	 * @return the newly created descriptor
	 */
	private FtaResultDescriptor createFtaResultDescriptor(AnalysisContextElement resultElement) {
		final FtaResultDescriptor ftaResultDescriptor = new FtaResultDescriptor();
		
		ftaResultDescriptor.conditions = resultElement.getConditions().get(0);
		ftaResultDescriptor.rootClass = EntityUtil.getInstance().getName(resultElement.getRoot());
		ftaResultDescriptor.url = "notFound.gif";	// Will be updated later
		ftaResultDescriptor.url = exportSiriusDiagramToFile(resultElement.getResult());

		return ftaResultDescriptor;
	}
	
	/**
	 * Creates a FtaResultDescriptor from the given ResultElement.
	 * @param resultElement the element containing the data
	 * @return the newly created descriptor
	 */
	private ContractFtaResultDescriptor createContractFtaResultDescriptor(AnalysisContextElement resultElement) {
		final ContractFtaResultDescriptor contractFtaResultDescriptor = new ContractFtaResultDescriptor();
		
		contractFtaResultDescriptor.rootClass = EntityUtil.getInstance().getName(resultElement.getRoot());
		contractFtaResultDescriptor.url = exportSiriusDiagramToFile(resultElement.getResult());
		
		return contractFtaResultDescriptor;
	}
	
	/**
	 * Creates and adds the result descriptors to the given component. Only if the component is the 
	 * System component.
	 * @param selectedComponent the selected component
	 * @param activePackage the package containing the results
	 * @param documentGenerator the documentGenerator
	 */
	public void addResultsDescriptors(Class selectedComponent, Package activePackage, DocumentGenerator documentGenerator) {
		
		// Check if the selected component is the system component. If not, don't add the result section
		if (selectedComponent != EntityUtil.getInstance().getSystemComponent(activePackage)) {
			logger.debug("The selected element is not the System element, results section won't be created");
			return;
		}
		
		if (!showAnalysisResults) {
			return;
		}

		final ContainerDescriptor rootContainer = documentGenerator.getRootContainerDescriptor();
		rootContainer.showAnalysisResults = showAnalysisResults;

		// Select the correct view where to find the results
		final Package dependabilityView = analysisResultUtil.getDependabilityViewFromPackage(activePackage);	
		if (dependabilityView == null) {
			return;
		}
		
		// Get the correct package containing the results
		final Package resultsPackage = dependabilityView.getNestedPackage(analysisResultUtil.getPackageName(activePackage));
		if (resultsPackage == null) {
			return;
		}
				
		final EList<NamedElement> members = resultsPackage.getOwnedMembers();
		boolean isRefinementPresent = false;
		for (NamedElement namedElement : members) {
			final AnalysisContextElement resultElement = analysisResultUtil.getAnalysisContextElementFromUmlElement(namedElement);

			if (resultElement != null) {
				final Analysis resultType = resultElement.getType();

				if (resultType.equals(Analysis.FMEA_ANALYSIS)) {
					final FmeaResultDescriptor fmeaResultDescriptor = createFmeaResultDescriptor(resultElement);				
					rootContainer.fmeaResultDescriptors.add(fmeaResultDescriptor);
					
				} else if (resultType.equals(Analysis.FTA_ANALYSIS)) {
					final FtaResultDescriptor ftaResultDescriptor = createFtaResultDescriptor(resultElement);
					rootContainer.ftaResultDescriptors.add(ftaResultDescriptor);
				} else if (resultType.equals(Analysis.CONTRACT_BASED_FTA_ANALYSIS)) {
					final ContractFtaResultDescriptor contractFtaResultDescriptor = 
							createContractFtaResultDescriptor(resultElement);					
					rootContainer.contractFtaResultDescriptors.add(contractFtaResultDescriptor);
				} else if (resultType.equals(Analysis.CONTRACT_REFINEMENT_ANALYSIS)) {
					final ContractRefinementResultDescriptor contractRefinementResultDescriptor = 
							createContractRefinementResultDescriptor(resultElement);
					rootContainer.contractRefinementResultDescriptors.clear(); // There can be only one of this kind
					rootContainer.contractRefinementResultDescriptors.add(contractRefinementResultDescriptor);
					isRefinementPresent = true;
				} else if (resultType.equals(Analysis.CONTRACT_COMPOSITE_IMPLEMENTATION_ANALYSIS)) {
					final ContractImplementationResultDescriptor contractImplementationResultDescriptor = 
							createContractImplementationResultDescriptor(resultElement);					
					rootContainer.contractImplementationResultDescriptors.add(contractImplementationResultDescriptor);

					// If no refinement has been seen so far, compute if from the composite implementation
					if (!isRefinementPresent) {
						final ContractRefinementResultDescriptor contractRefinementResultDescriptor = 
								createContractRefinementResultDescriptor(resultElement);
						rootContainer.contractRefinementResultDescriptors.clear(); // There can be only one of this kind
						rootContainer.contractRefinementResultDescriptors.add(contractRefinementResultDescriptor);						
					}
				} else if (resultType.equals(Analysis.PROPERTY_VALIDATION_ANALYSIS)) {
					final PropertyValidationResultDescriptor propertyValidationResultDescriptor = 
							createPropertyValidationResultDescriptor(resultElement);					
					rootContainer.propertyValidationResultDescriptors.add(propertyValidationResultDescriptor);
				} else if (resultType.equals(Analysis.CONTRACT_PROPERTY_VALIDATION_ANALYSIS)) {
					final PropertyValidationResultDescriptor contractPropertyValidationResultDescriptor = 
							createPropertyValidationResultDescriptor(resultElement);					
					rootContainer.contractPropertyValidationResultDescriptors.add(contractPropertyValidationResultDescriptor);
				} else if (resultType.equals(Analysis.MODEL_CHECKING_ANALYSIS)) {
					final ModelCheckingResultDescriptor modelCheckingResultDescriptor = 
							createModelCheckingResultDescriptor(resultElement);					
					rootContainer.modelCheckingResultDescriptors.add(modelCheckingResultDescriptor);
				}
			}
		}
	}
}
