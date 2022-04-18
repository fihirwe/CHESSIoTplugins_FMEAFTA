/*******************************************************************************
 * Copyright (C) 2017 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Alberto Debiasi - initial API and implementation
 *     Luca Cristoforetti - added some functionalities
 ******************************************************************************/
package org.polarsys.chess.diagram.ui.commands;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.polarsys.chess.diagram.ui.services.CHESSDiagramsGeneratorService;
import org.polarsys.chess.diagram.ui.services.ResultsGeneratorService;
import org.polarsys.chess.service.core.exceptions.NoComponentException;
import org.polarsys.chess.service.core.model.ChessSystemModel;
import org.polarsys.chess.service.core.utils.AnalysisResultUtil;
import org.polarsys.chess.service.gui.utils.DialogUtils;
import org.polarsys.chess.service.gui.utils.SelectionUtil;

import eu.fbk.eclipse.standardtools.ModelTranslatorToOcra.core.services.OSSTranslatorServiceAPI;
import eu.fbk.eclipse.standardtools.diagram.DiagramDescriptor;
import eu.fbk.eclipse.standardtools.diagram.DocumentGenerator;
import eu.fbk.eclipse.standardtools.diagram.ui.docGenerators.DocumentGeneratorServiceFromOssModel;
import eu.fbk.eclipse.standardtools.diagram.ui.wizard.DocumentationWizard;
import eu.fbk.eclipse.standardtools.utils.ui.commands.AbstractJobCommand;
import eu.fbk.eclipse.standardtools.utils.ui.dialogs.MessageTimeModelDialog;
import eu.fbk.eclipse.standardtools.utils.ui.utils.DirectoryUtil;
import eu.fbk.tools.editor.oss.oss.OSS;

public class GenerateDocumentCommand extends AbstractJobCommand {

	private SelectionUtil selectionUtil = SelectionUtil.getInstance();
	private ChessSystemModel chessToOCRAModelTranslator = ChessSystemModel.getInstance();
	private OSSTranslatorServiceAPI ocraTranslatorService = OSSTranslatorServiceAPI.getInstance(chessToOCRAModelTranslator);
	//private ExportDialogUtils exportDialogUtils = ExportDialogUtils.getInstance();
	private DialogUtils dialogUtils = DialogUtils.getInstance();
	private CHESSDiagramsGeneratorService chessDiagramsGeneratorService = CHESSDiagramsGeneratorService
			.getInstance();//CHESSInternalBlockDiagramModel.getInstance(), CHESSBlockDefinitionDiagramModel.getInstance()
	private DirectoryUtil directoryUtils = DirectoryUtil.getInstance();

	private DocumentGeneratorServiceFromOssModel documentGeneratorService;

	/**
	 * @param commandName
	 */
	public GenerateDocumentCommand() {
		super("Generate Documentation");
	}

	private Class umlSelectedComponent;
	private boolean isDiscreteTime;
//	private ModelToDocumentDialog parameterDialog;
	private String outputDirectoryName;
	private String currentProjectName;
	private Collection<Diagram> chessDiagrams;
	private String imageExtension;
	private String docFormat;
	private Package activePackage;
	private boolean goAhead;

	/**
	 * Returns the nearest package containing the diagram.
	 * @param diagram the Diagram
	 * @return the containing Package
	 */
	private Package getDiagramPackage(Diagram diagram) {
		Package diagramPackage = null;
		
		final EObject diagramElement = diagram.getElement();
		if (diagramElement instanceof Package) {
			diagramPackage = (Package) diagramElement;
		} else if (diagramElement instanceof Class) {
			diagramPackage = ((Class) diagramElement).getNearestPackage();
		}
		return diagramPackage;
	}
	
	@Override
	public void execPreJobOperations(ExecutionEvent event, IProgressMonitor monitor) throws Exception {
//		umlSelectedComponent = selectionUtil.getUmlComponentFromSelectedObject(event);

		// The user could select a component or a package containing an architecture
		// In the latter case, extract the system component from that package
		try {
			umlSelectedComponent = selectionUtil.getUmlComponentFromSelectedObject(event);
		} catch (NoComponentException e) {
			umlSelectedComponent = AnalysisResultUtil.getInstance().getSystemComponentFromEvent(event);
		}
		
		activePackage = umlSelectedComponent.getNearestPackage();
		isDiscreteTime = MessageTimeModelDialog.openQuestion(false);
		outputDirectoryName = dialogUtils.getDirectoryNameFromDialog();
		currentProjectName = directoryUtils.getCurrentProjectName();
		chessDiagrams = chessDiagramsGeneratorService.getDiagrams();
		
		goAhead = true;

		if ((outputDirectoryName == null) || outputDirectoryName.isEmpty()) {
			goAhead = false;
			return;
		}
		
		final Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		final DocumentationWizard docWizard = new DocumentationWizard();
		final WizardDialog wizardDialog = new WizardDialog(shell, docWizard);
		wizardDialog.setHelpAvailable(false);
		if (wizardDialog.open() == Window.OK) {
			System.out.println("Ok pressed");
			goAhead = true;
		} else {
			System.out.println("Cancel pressed");
			goAhead = false;
			return;
		}

		docFormat = docWizard.getDocumentFormat();
		imageExtension = ".svg";
		if (docFormat.equals("tex")) {
//			imageExtension = ".png";	// Not perfect images, some fonts are wrong
			imageExtension = ".pdf";
		}
		
		// All the code below was in the execJobCommand(), but since it now modifies the model,
		// I have to put it here otherwise an Invalid Thread Access exception will rise
		final OSS ossModel = 
				ocraTranslatorService.exportRootComponentToOssModel(umlSelectedComponent, isDiscreteTime, monitor);


		documentGeneratorService = new DocumentGeneratorServiceFromOssModel(ossModel, chessToOCRAModelTranslator, activePackage);
		documentGeneratorService.setParametersBeforeDocumentGeneration(outputDirectoryName, imageExtension,
				docWizard.getShowLeafComponents(), docWizard.getShowInputPorts(), 
				docWizard.getShowOutputPorts(),docWizard.getShowSubComponents(), 
				docWizard.getShowParameters(), docWizard.getShowUninterpretedFunctions(),
				docWizard.getShowConnections(), docWizard.getShowInterfaceAssertions(), 
				docWizard.getShowRefinementAssertions(), docWizard.getShowContracts(),
				docWizard.getShowContractRefinements(),docWizard.getShowParameterAssumptions(),
				docWizard.getShowDiagrams(), docWizard.getShowLocalAttributes(), docWizard.getShowDefines());
		
		final DocumentGenerator documentGenerator = documentGeneratorService.createDocumentFile(currentProjectName, docFormat,
				ossModel.getSystem(), monitor);
		
		documentGeneratorService.addLocalAttributeDescriptors(umlSelectedComponent, documentGenerator);

		final ResultsGeneratorService resultsGeneratorService = new ResultsGeneratorService();
		resultsGeneratorService.setParametersBeforeDocumentGeneration(outputDirectoryName, 
				docWizard.getShowCheckResults(), imageExtension);
		resultsGeneratorService.addResultsDescriptors(umlSelectedComponent, activePackage, documentGenerator);
				
		chessDiagramsGeneratorService.setParametersBeforeDiagramsGenerator(outputDirectoryName, imageExtension
				//parameterDialog.getShowPortLabels(), parameterDialog.getAutomaticPortLabelLayout()
				);

		final Display defaultDisplay = Display.getDefault();
		defaultDisplay.syncExec(new Runnable() {
			@Override
			public void run() {
				Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
				Set<DiagramDescriptor> diagramDescriptors = new HashSet<DiagramDescriptor>();
				for (Diagram diagram : chessDiagrams) {
					if (getDiagramPackage(diagram) == activePackage) {
						// chessDiagramsGeneratorService.createDiagram(diagram, monitor);
						DiagramDescriptor dd = chessDiagramsGeneratorService.createDiagramWithDescriptor(diagram, shell,
								monitor);
						if (dd != null) {
							diagramDescriptors.add(dd);
						}
					}
				}
				documentGeneratorService.addDiagramDescriptors(diagramDescriptors, documentGenerator);
				documentGeneratorService.generateDocument(documentGenerator);
			}
		});
	}

	@Override
	public void execJobCommand(ExecutionEvent event, IProgressMonitor monitor) throws Exception {

		if (!goAhead) {
			return;
		}
		
//		OSS ossModel = ocraTranslatorService.exportRootComponentToOssModel(umlSelectedComponent, isDiscreteTime, monitor);
//
//		Display defaultDisplay = Display.getDefault();
//
//		documentGeneratorService = new DocumentGeneratorServiceFromOssModel(ossModel, chessToOCRAModelTranslator, activePackage);
//		documentGeneratorService.setParametersBeforeDocumentGeneration(outputDirectoryName, imageExtension,
//				parameterDialog.getShowLeafComponents(), parameterDialog.getShowInputPorts(), 
//				parameterDialog.getShowOutputPorts(),parameterDialog.getShowSubComponents(), 
//				parameterDialog.getShowParameters(), parameterDialog.getShowUninterpretedFunctions(),
//				parameterDialog.getShowConnections(), parameterDialog.getShowInterfaceAssertions(), 
//				parameterDialog.getShowRefinementAssertions(), parameterDialog.getShowContracts(),
//				parameterDialog.getShowContractRefinements(),parameterDialog.getShowParameterAssumptions(),
//				parameterDialog.getShowDiagrams(), parameterDialog.getShowLocalAttributes());
//		DocumentGenerator documentGenerator = documentGeneratorService.createDocumentFile(currentProjectName, docFormat,
//				ossModel.getSystem(), monitor);
//		
//		documentGeneratorService.addLocalAttributeDescriptors(umlSelectedComponent, documentGenerator);
//
//		boolean showAnalysisResults = true;
//
//		final ResultsGeneratorService resultsGeneratorService = new ResultsGeneratorService();
//		resultsGeneratorService.setParametersBeforeDocumentGeneration(showAnalysisResults);
//		resultsGeneratorService.addResultsDescriptors(umlSelectedComponent, activePackage, documentGenerator);
//				
//		chessDiagramsGeneratorService.setParametersBeforeDiagramsGenerator(outputDirectoryName, imageExtension
//				//parameterDialog.getShowPortLabels(), parameterDialog.getAutomaticPortLabelLayout()
//				);
//
//		defaultDisplay.syncExec(new Runnable() {
//			@Override
//			public void run() {
//				Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
//				Set<DiagramDescriptor> diagramDescriptors = new HashSet<DiagramDescriptor>();
//				for (Diagram diagram : chessDiagrams) {
//					if (getDiagramPackage(diagram) == activePackage) {
//						// chessDiagramsGeneratorService.createDiagram(diagram, monitor);
//						DiagramDescriptor dd = chessDiagramsGeneratorService.createDiagramWithDescriptor(diagram, shell,
//								monitor);
//						if (dd != null) {
//							diagramDescriptors.add(dd);
//						}
//					}
//				}
//				documentGeneratorService.addDiagramDescriptors(diagramDescriptors, documentGenerator);
//				documentGeneratorService.generateDocument(documentGenerator);
//			}
//		});
	}

	@Override
	public void execPostJobOperations(ExecutionEvent event, NullProgressMonitor nullProgressMonitor) throws Exception {
		// TODO Auto-generated method stub
		
	}
}