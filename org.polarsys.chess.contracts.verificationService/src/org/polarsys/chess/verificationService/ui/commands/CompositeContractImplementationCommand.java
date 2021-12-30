/*******************************************************************************
 * Copyright (C) 2018 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *  
 * Contributors:
 *   Alberto Debiasi - initial API and implementation
 ******************************************************************************/
package org.polarsys.chess.verificationService.ui.commands;

import java.util.HashMap;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Class;
import org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Analysis;
import org.polarsys.chess.chessmlprofile.ParameterizedArchitecture.InstantiatedArchitectureConfiguration;
import org.polarsys.chess.contracts.profile.chesscontract.util.EntityUtil;
import org.polarsys.chess.service.core.exceptions.NoComponentException;
import org.polarsys.chess.service.core.model.ChessSystemModel;
import org.polarsys.chess.service.core.model.UMLStateMachineModel;
import org.polarsys.chess.service.core.utils.AnalysisResultUtil;
import org.polarsys.chess.service.core.utils.FileNamesUtil;
import org.polarsys.chess.service.gui.utils.SelectionUtil;

import eu.fbk.eclipse.standardtools.ExecOcraCommands.ui.services.OCRAExecService;
import eu.fbk.eclipse.standardtools.StateMachineTranslatorToSmv.ui.services.SmvExportServiceUI;
import eu.fbk.eclipse.standardtools.nuXmvService.ui.utils.NuXmvDirectoryUtil;
import eu.fbk.eclipse.standardtools.utils.ui.commands.AbstractJobCommand;
import eu.fbk.eclipse.standardtools.utils.ui.dialogs.MessageTimeModelDialog;
import eu.fbk.eclipse.standardtools.utils.ui.dialogs.SelectArchitectureConfigurationDialog;
import eu.fbk.eclipse.standardtools.utils.ui.utils.OCRADirectoryUtil;
import eu.fbk.tools.adapter.ocra.CheckContractCompositeImplementation;

public class CompositeContractImplementationCommand extends AbstractJobCommand {

	private OCRAExecService ocraExecService = OCRAExecService.getInstance(ChessSystemModel.getInstance());
	private SelectionUtil selectionUtil = SelectionUtil.getInstance();
	private SmvExportServiceUI smvExportService = SmvExportServiceUI.getInstance(ChessSystemModel.getInstance(),
			UMLStateMachineModel.getInstance());
	private OCRADirectoryUtil ocraDirectoryUtil = OCRADirectoryUtil.getInstance();
	private NuXmvDirectoryUtil nuXmvDirectoryUtil = NuXmvDirectoryUtil.getInstance();
	private AnalysisResultUtil analysisResultUtil = AnalysisResultUtil.getInstance();

	public CompositeContractImplementationCommand() {
		super("Check Compositional Contract Implementation");
	}

	private Class umlSelectedComponent;
	private InstantiatedArchitectureConfiguration selectedInstantiatedArchitectureConfiguration;	
	private Resource umlSelectedResource;
	private boolean isDiscreteTime;
	private boolean showPopups;
	private boolean usexTextValidation;
	private String smvMapDirPath;
	private String smvFilePath;
	private String resultFilePath;
	private String ossDirPath;
	private boolean commandExecuted;

	@Override
	public void execPreJobOperations(ExecutionEvent event, IProgressMonitor monitor) throws Exception {

		// The user could select a component or a package containing an
		// architecture
		// In the latter case, extract the system component from that package
		try {
			umlSelectedComponent = selectionUtil.getUmlComponentFromSelectedObject(event);
		} catch (NoComponentException e) {
			umlSelectedComponent = analysisResultUtil.getSystemComponentFromEvent(event);
		}

		umlSelectedResource = umlSelectedComponent.eResource();
		isDiscreteTime = MessageTimeModelDialog.openQuestion(true);
		showPopups = false;
		usexTextValidation = true;
		ossDirPath = ocraDirectoryUtil.getOSSDirPath();
		smvMapDirPath = nuXmvDirectoryUtil.getSmvFileDirectory();
		smvFilePath = nuXmvDirectoryUtil.getSmvFileDirectory();
		resultFilePath = FileNamesUtil.getInstance().computeContractCompositeImplementationFileName(umlSelectedComponent);
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		EList<InstantiatedArchitectureConfiguration> instantiatedArchitecures = EntityUtil.getInstance().getInstantiatedArchitecureConfigurations(umlSelectedComponent);
		if((instantiatedArchitecures!=null)&&(!instantiatedArchitecures.isEmpty())){
				SelectArchitectureConfigurationDialog dialog = new SelectArchitectureConfigurationDialog(shell, ChessSystemModel.getInstance(),instantiatedArchitecures);
			dialog.open();
		if (dialog.goAhead()) {
			selectedInstantiatedArchitectureConfiguration =(InstantiatedArchitectureConfiguration)dialog.getSelectedAchitectureConfiguration();
		}
		}
	}

	@Override
	public void execJobCommand(ExecutionEvent event, IProgressMonitor monitor) throws Exception {

		HashMap<String, String> smvPathComponentNameMap = smvExportService.exportSmv(umlSelectedComponent, showPopups,
				smvFilePath, monitor);

		commandExecuted = ocraExecService.executeCheckCompositeContractImplementation(umlSelectedComponent,
				umlSelectedResource, smvPathComponentNameMap, isDiscreteTime, usexTextValidation, showPopups,
				ossDirPath, smvMapDirPath, resultFilePath, monitor, true);

	}

	@Override
	public void execPostJobOperations(ExecutionEvent event, NullProgressMonitor nullProgressMonitor) throws Exception {

		// If requested to store the data, execute the command here, cannot be
		// called later
		if (commandExecuted) {

			// Store the result
			analysisResultUtil.createOrUpdateAnalysisContext(Analysis.CONTRACT_COMPOSITE_IMPLEMENTATION_ANALYSIS, ECollections.emptyEList() , resultFilePath,false,
					umlSelectedComponent,selectedInstantiatedArchitectureConfiguration, null);

			// Visualize the result
			analysisResultUtil.showResult(CheckContractCompositeImplementation.FUNCTION_NAME, resultFilePath);
		}

	}
}
