/*******************************************************************************
 * Copyright (C) 2017 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Alberto Debiasi - initial API and implementation
 ******************************************************************************/
package org.polarsys.chess.verificationService.ui.commands;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Class;

import eu.fbk.eclipse.standardtools.ExecOcraCommands.ui.services.OCRAExecService;
import eu.fbk.eclipse.standardtools.utils.ui.commands.AbstractJobCommand;
import eu.fbk.eclipse.standardtools.utils.ui.dialogs.MessageTimeModelDialog;
import eu.fbk.eclipse.standardtools.utils.ui.dialogs.SelectArchitectureConfigurationDialog;
import eu.fbk.eclipse.standardtools.utils.ui.utils.OCRADirectoryUtil;
import eu.fbk.tools.adapter.ocra.CheckContractRefinement;

import org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Analysis;
import org.polarsys.chess.chessmlprofile.ParameterizedArchitecture.InstantiatedArchitectureConfiguration;
import org.polarsys.chess.contracts.profile.chesscontract.util.EntityUtil;
import org.polarsys.chess.service.core.exceptions.NoComponentException;
import org.polarsys.chess.service.core.model.ChessSystemModel;
import org.polarsys.chess.service.core.utils.AnalysisResultUtil;
import org.polarsys.chess.service.core.utils.FileNamesUtil;
import org.polarsys.chess.service.gui.utils.SelectionUtil;

public class ContractRefinementCommand extends AbstractJobCommand {

	private OCRAExecService ocraExecService = OCRAExecService.getInstance(ChessSystemModel.getInstance());
	private SelectionUtil selectionUtil = SelectionUtil.getInstance();
	private OCRADirectoryUtil ocraDirectoryUtil = OCRADirectoryUtil.getInstance();
	private AnalysisResultUtil analysisResultUtil = AnalysisResultUtil.getInstance();

	public ContractRefinementCommand() {
		super("Contract Refinement");
	}

	private Class umlSelectedComponent;
	private InstantiatedArchitectureConfiguration selectedInstantiatedArchitectureConfiguration;
	private Resource umlSelectedResource;
	private boolean isDiscreteTime;
	private boolean showPopups;
	private boolean usexTextValidation;
	private String ossFilepath;
	private String resultFilePath;
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
		isDiscreteTime = MessageTimeModelDialog.openQuestion(false);
		showPopups = false;
		usexTextValidation = true;
		ossFilepath = ocraDirectoryUtil.getOSSDirPath();
		resultFilePath = FileNamesUtil.getInstance().computeContractRefinementFileName(umlSelectedComponent);
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		EList<InstantiatedArchitectureConfiguration> instantiatedArchitecures = EntityUtil.getInstance().getInstantiatedArchitecureConfigurations(umlSelectedComponent);
		if((instantiatedArchitecures!=null)&&(!instantiatedArchitecures.isEmpty())){
				SelectArchitectureConfigurationDialog dialog = new SelectArchitectureConfigurationDialog(shell,ChessSystemModel.getInstance(), instantiatedArchitecures);
			dialog.open();
		if (dialog.goAhead()) {
			selectedInstantiatedArchitectureConfiguration =(InstantiatedArchitectureConfiguration)dialog.getSelectedAchitectureConfiguration();
			final String configurationName = ChessSystemModel.getInstance()
					.getInstantiatedArchitectureConfigurationName(selectedInstantiatedArchitectureConfiguration);
			resultFilePath = ocraDirectoryUtil.getCommandCheckRefinementResultPath(configurationName);
		}
		}
	}

	@Override
	public void execJobCommand(ExecutionEvent event, IProgressMonitor monitor) throws Exception {
		
		commandExecuted = ocraExecService.executeCheckContractRefinement(umlSelectedComponent,selectedInstantiatedArchitectureConfiguration, umlSelectedResource,
				isDiscreteTime, usexTextValidation, showPopups, ossFilepath, resultFilePath, monitor, true);

	}

	@Override
	public void execPostJobOperations(ExecutionEvent event, NullProgressMonitor nullProgressMonitor) throws Exception {
		// If requested to store the data, execute the command here, cannot be
		// called later
		if (commandExecuted) {
			// Store the result
			analysisResultUtil.createOrUpdateAnalysisContext(Analysis.CONTRACT_REFINEMENT_ANALYSIS, ECollections.emptyEList() , resultFilePath,false,
					umlSelectedComponent,selectedInstantiatedArchitectureConfiguration, null);

			// Visualize the result
			analysisResultUtil.showResult(CheckContractRefinement.FUNCTION_NAME, resultFilePath);
		}

	}
}
