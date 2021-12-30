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

import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Analysis;
import org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement;
import org.polarsys.chess.chessmlprofile.ParameterizedArchitecture.InstantiatedArchitectureConfiguration;
import org.polarsys.chess.contracts.profile.chesscontract.util.EntityUtil;
import org.polarsys.chess.core.util.uml.ResourceUtils;
import org.polarsys.chess.service.core.exceptions.NoComponentException;
import org.polarsys.chess.service.core.model.ChessSystemModel;
import org.polarsys.chess.service.core.utils.AnalysisResultUtil;
import org.polarsys.chess.service.core.utils.FileNamesUtil;
import org.polarsys.chess.service.gui.utils.CHESSEditorUtils;
import org.polarsys.chess.service.gui.utils.SelectionUtil;

import eu.fbk.eclipse.standardtools.ExecOcraCommands.ui.services.OCRAExecService;
import eu.fbk.eclipse.standardtools.utils.core.utils.StringArrayUtil;
import eu.fbk.eclipse.standardtools.utils.ui.commands.AbstractJobCommand;
import eu.fbk.eclipse.standardtools.utils.ui.dialogs.MessageTimeModelDialog;
import eu.fbk.eclipse.standardtools.utils.ui.dialogs.SelectArchitectureConfigurationDialog;
import eu.fbk.eclipse.standardtools.utils.ui.utils.OCRADirectoryUtil;
import eu.fbk.tools.adapter.ocra.CheckValidationProperty;

/**
 * 
 *
 */
public class CheckValidationContractPropertyCommand extends AbstractJobCommand {

	private ChessSystemModel chessToOCRAModelTranslator = ChessSystemModel.getInstance();
	private OCRAExecService ocraExecService = OCRAExecService.getInstance(chessToOCRAModelTranslator);
	private SelectionUtil selectionUtil = SelectionUtil.getInstance();
	private OCRADirectoryUtil ocraDirectoryUtil = OCRADirectoryUtil.getInstance();
	private AnalysisResultUtil analysisResultUtil = AnalysisResultUtil.getInstance();

	public CheckValidationContractPropertyCommand() {
		super("Check Validation Property");
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
	EList<String> conditions; // It will be filled by the method
	private List<AnalysisContextElement> contextList;

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
		resultFilePath = FileNamesUtil.getInstance().computeContractPropertyValidationFileName(umlSelectedComponent);
		
		PapyrusMultiDiagramEditor editorPapyrus = CHESSEditorUtils.getCHESSEditor();
		Resource res = ResourceUtils.getUMLResource(editorPapyrus.getServicesRegistry());
		Model model = ResourceUtils.getModel(res);
		
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		EList<InstantiatedArchitectureConfiguration> instantiatedArchitecures = EntityUtil.getInstance().getInstantiatedArchitecureConfigurations(umlSelectedComponent);
		if((instantiatedArchitecures!=null)&&(!instantiatedArchitecures.isEmpty())){
				SelectArchitectureConfigurationDialog dialog = new SelectArchitectureConfigurationDialog(shell,ChessSystemModel.getInstance(), instantiatedArchitecures);
			dialog.open();
		if (dialog.goAhead()) {
			selectedInstantiatedArchitectureConfiguration =(InstantiatedArchitectureConfiguration)dialog.getSelectedAchitectureConfiguration();
			final String configurationName = ChessSystemModel.getInstance()
					.getInstantiatedArchitectureConfigurationName(selectedInstantiatedArchitectureConfiguration);
			resultFilePath = ocraDirectoryUtil.getCommandCheckPropertyResultPath(configurationName);
		
		}
		}
		
		contextList = AnalysisResultUtil.getInstance().getAnalysisContexts(umlSelectedComponent,selectedInstantiatedArchitectureConfiguration, Analysis.CONTRACT_PROPERTY_VALIDATION_ANALYSIS, model);
	}

	@Override
	public void execJobCommand(ExecutionEvent event, IProgressMonitor monitor) throws Exception {
		
	}

	private EList<String> createConditions(String[] expression) {
		BasicEList<String> conditions = new BasicEList<String>(); // It will be filled by the method
		
		
		// Set the expression to be stored in the result
		if (expression != null) {

			// Store the type of check
			StringArrayUtil.addConditionKeyValue(conditions, AnalysisResultUtil.CHECK_TYPE, expression[0]);
			
			// Store the component on which it has been run
			StringArrayUtil.addConditionKeyValue(conditions, AnalysisResultUtil.SELECTED_COMPONENTS, expression[1]);
			
			// If no properties are selected, all of them are checked
			StringArrayUtil.addConditionKeyValue(conditions, AnalysisResultUtil.SELECTED_PROPERTIES, expression[2]);
			
			// Store the optional expression if present
			if (expression.length==4) {
				StringArrayUtil.addConditionKeyValue(conditions, AnalysisResultUtil.PROPERTY, expression[3]);
			}
		}
		return conditions;
	}

	@Override
	public void execPostJobOperations(ExecutionEvent event, NullProgressMonitor monitor) throws Exception {
		
		String[] expression = new String[1]; // It will be filled by the method
		commandExecuted = ocraExecService.executeValidationContractProperty(umlSelectedComponent, selectedInstantiatedArchitectureConfiguration, umlSelectedResource,
				isDiscreteTime, usexTextValidation, showPopups, ossFilepath, resultFilePath, monitor, true, expression,contextList);
		if(commandExecuted){
		conditions = createConditions(expression[0].split("#"));
		}
		
		if (commandExecuted) {

			// Store the result
			analysisResultUtil.createOrUpdateAnalysisContext(Analysis.CONTRACT_PROPERTY_VALIDATION_ANALYSIS, conditions,
					resultFilePath, false,umlSelectedComponent,selectedInstantiatedArchitectureConfiguration, null);

			// Visualize the result
			analysisResultUtil.showResult(CheckValidationProperty.FUNCTION_NAME, resultFilePath);
		}

	}
}
