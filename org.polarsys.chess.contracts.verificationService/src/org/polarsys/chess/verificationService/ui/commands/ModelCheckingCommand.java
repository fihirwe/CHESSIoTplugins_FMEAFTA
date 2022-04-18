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


import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
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
import org.polarsys.chess.service.core.model.UMLStateMachineModel;
import org.polarsys.chess.service.core.utils.AnalysisResultUtil;
import org.polarsys.chess.service.core.utils.FileNamesUtil;
import org.polarsys.chess.service.gui.utils.CHESSEditorUtils;
import org.polarsys.chess.service.gui.utils.SelectionUtil;

import eu.fbk.eclipse.standardtools.ExecOcraCommands.ui.services.OCRAExecService;
import eu.fbk.eclipse.standardtools.StateMachineTranslatorToSmv.ui.services.SmvExportServiceUI;
import eu.fbk.eclipse.standardtools.nuXmvService.ui.services.NuXmvExecService;
import eu.fbk.eclipse.standardtools.nuXmvService.ui.utils.NuXmvDirectoryUtil;
import eu.fbk.eclipse.standardtools.utils.core.utils.StringArrayUtil;
import eu.fbk.eclipse.standardtools.utils.ui.commands.AbstractJobCommand;
import eu.fbk.eclipse.standardtools.utils.ui.dialogs.MessageTimeModelDialog;
import eu.fbk.eclipse.standardtools.utils.ui.dialogs.SelectArchitectureConfigurationDialog;
import eu.fbk.eclipse.standardtools.utils.ui.utils.OCRADirectoryUtil;
import eu.fbk.tools.adapter.nuxmv.CheckModel;

/**
 * 
 *
 */
public class ModelCheckingCommand extends AbstractJobCommand {

	private static final Logger logger = Logger.getLogger(ModelCheckingCommand.class);

	private SelectionUtil selectionUtil = SelectionUtil.getInstance();
	private SmvExportServiceUI smvExportService = SmvExportServiceUI.getInstance(ChessSystemModel.getInstance(),
			UMLStateMachineModel.getInstance());
	private NuXmvExecService nuXmvExecService = NuXmvExecService.getInstance(ChessSystemModel.getInstance());
	private static NuXmvDirectoryUtil nuXmvDirectoryUtil = NuXmvDirectoryUtil.getInstance();
	private OCRADirectoryUtil ocraDirectoryUtil = OCRADirectoryUtil.getInstance();
	private OCRAExecService ocraExecService = OCRAExecService.getInstance(ChessSystemModel.getInstance());
	private EntityUtil entityUtil = EntityUtil.getInstance();
	private AnalysisResultUtil analysisResultUtil = AnalysisResultUtil.getInstance();

	public ModelCheckingCommand() {
		super("Model Checking");
	}

	private boolean isProgrExec;
	private Class umlSelectedComponent;
	private InstantiatedArchitectureConfiguration selectedInstantiatedArchitectureConfiguration;	
	private boolean showPopups;
	private boolean usexTextValidation;
	private String smvFileDirectory;
	private boolean isDiscreteTime;
	private String monolithicSMVFilePath;
	private String resultFilePath;
	private String smvMapDirPath;
	private Resource umlSelectedResource;
	private String ossDirPath;
	private boolean commandExecuted;
	private EList<String> conditions;
	private List<AnalysisContextElement> contextList;
	 String generatedSmvFilePath;
	 boolean internalExecution = true;
	
	@Override
	public void execPreJobOperations(ExecutionEvent event, IProgressMonitor monitor) throws Exception {

		isProgrExec = isProgrExec(event);
		if (!isProgrExec) {
			logger.debug("!isProgrammaticallyExecution(event)");

			// The user could select a component or a package containing an
			// architecture
			// In the latter case, extract the system component from that
			// package
			try {
				umlSelectedComponent = selectionUtil.getUmlComponentFromSelectedObject(event);
			} catch (NoComponentException e) {
				umlSelectedComponent = analysisResultUtil.getSystemComponentFromEvent(event);
			}
			isDiscreteTime = MessageTimeModelDialog.openQuestion(true);
			smvFileDirectory = nuXmvDirectoryUtil.getSmvFileDirectory();
			monolithicSMVFilePath = nuXmvDirectoryUtil.getMonolithicSMVFilePath(umlSelectedComponent.getName());
			//resultFilePath = nuXmvDirectoryUtil.getModelCheckingResultPath(umlSelectedComponent.getName());
			smvMapDirPath = nuXmvDirectoryUtil.getSmvFileDirectory();
			ossDirPath = ocraDirectoryUtil.getOSSDirPath();
			umlSelectedResource = umlSelectedComponent.eResource();
			showPopups = false;
			usexTextValidation = true;
			resultFilePath = FileNamesUtil.getInstance().computeModelCheckingFileName(umlSelectedComponent);

			Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			EList<InstantiatedArchitectureConfiguration> instantiatedArchitecures = EntityUtil.getInstance().getInstantiatedArchitecureConfigurations(umlSelectedComponent);
			if((instantiatedArchitecures!=null)&&(!instantiatedArchitecures.isEmpty())){
				SelectArchitectureConfigurationDialog dialog = new SelectArchitectureConfigurationDialog(shell,ChessSystemModel.getInstance(), instantiatedArchitecures);
				dialog.open();
			if (dialog.goAhead()) {
				selectedInstantiatedArchitectureConfiguration =(InstantiatedArchitectureConfiguration)dialog.getSelectedAchitectureConfiguration();
			}
			}
			
			PapyrusMultiDiagramEditor editorPapyrus = CHESSEditorUtils.getCHESSEditor();
			Resource res = ResourceUtils.getUMLResource(editorPapyrus.getServicesRegistry());
			Model model = ResourceUtils.getModel(res);
			
			contextList = AnalysisResultUtil.getInstance().getAnalysisContexts(umlSelectedComponent,selectedInstantiatedArchitectureConfiguration, Analysis.MODEL_CHECKING_ANALYSIS, model);
			
		} else {
			setParamsForProgrExec(event);
		}

		// umlSelectedResource = umlSelectedComponent.eResource();
		// showPopups = false;
		// usexTextValidation=true;
	}

	@Override
	public void execJobCommand(ExecutionEvent event, IProgressMonitor monitor) throws Exception {
		if (!isProgrExec) {

		

			if (isLeafComponent(umlSelectedComponent)) {
				generatedSmvFilePath = smvExportService.exportSingleSmv(umlSelectedComponent, showPopups,
						smvFileDirectory, monitor);
			} else {
				logger.debug("exportSmv");
				HashMap<String, String> smvPathComponentNameMap = smvExportService.exportSmv(umlSelectedComponent,
						showPopups, smvFileDirectory, monitor);
				logger.debug("createMonolithicSMV");
				ocraExecService.createMonolithicSMV(umlSelectedComponent, umlSelectedResource, smvPathComponentNameMap,
						isDiscreteTime, usexTextValidation, showPopups, ossDirPath, smvMapDirPath,
						monolithicSMVFilePath, internalExecution, monitor);

				generatedSmvFilePath = monolithicSMVFilePath;
				logger.debug("createMonolithicSMV done");
			}

			
		}

	}

	private EList<String> createConditions(String[] expression) {
		BasicEList<String> conditions = new BasicEList<String>(); // It will be
																	// filled by
																	// the
																	// method

		// Set the expression to be stored in the result
		if (expression != null) {

			// Store the type of check
			StringArrayUtil.addConditionKeyValue(conditions, AnalysisResultUtil.CHECK_TYPE, expression[0]);

			StringArrayUtil.addConditionKeyValue(conditions, AnalysisResultUtil.PROPERTY, expression[1]);

		}
		return conditions;
	}

	@Override
	public void execPostJobOperations(ExecutionEvent event, NullProgressMonitor nullProgressMonitor) throws Exception {
		
		// Compose the conditions
					String[] expression = new String[1]; // It will be filled by the
															// method
					commandExecuted = nuXmvExecService.executeModelChecking(generatedSmvFilePath, resultFilePath,
							event.getParameter("algorithm_type"), event.getParameter("check_type"),
							event.getParameter("property"), isProgrExec, internalExecution, expression,contextList);
					conditions = createConditions(expression[0].split("#"));
		// If requested to store the data, execute the command here, cannot be
		// called later
		if (commandExecuted) {
			// Store the result
			analysisResultUtil.createOrUpdateAnalysisContext(Analysis.MODEL_CHECKING_ANALYSIS, conditions, resultFilePath,false,
					umlSelectedComponent,selectedInstantiatedArchitectureConfiguration, null);

			// Visualize the result
			analysisResultUtil.showResult(CheckModel.FUNCTION_NAME, resultFilePath);
		}

	}

	private boolean isLeafComponent(Class umlSelectedComponent) {
		EList<org.eclipse.uml2.uml.Property> subComponents = ChessSystemModel.getInstance()
				.getSubComponentsInstances(umlSelectedComponent);
		return ((subComponents == null) || (subComponents.size() == 0));
	}

	public boolean isProgrExec(ExecutionEvent event) {
		String paramisProgrExec = event.getParameter("isProgrExec");
		if (paramisProgrExec != null) {
			return Boolean.valueOf(paramisProgrExec);
		}
		return false;
	};

	private void setParamsForProgrExec(ExecutionEvent event) throws Exception {
		String elementURI = event.getParameter("elementURI");
		String projectName = event.getParameter("projectName");
		String modelName = event.getParameter("modelName");
		String projectPath = event.getParameter("projectPath");
		resultFilePath = event.getParameter("resultFilePath");

		logger.debug(elementURI);
		logger.debug(projectName);
		logger.debug(modelName);
		logger.debug(projectPath);
		logger.debug("isProgrammaticallyExecution(event)");
		umlSelectedComponent = (Class) entityUtil.getElement(projectName, modelName, elementURI);
		String paramIsDiscrete = event.getParameter("isDiscrete");
		isDiscreteTime = Boolean.valueOf(paramIsDiscrete);
		smvFileDirectory = nuXmvDirectoryUtil.getSmvFileDirectory(projectPath);
		monolithicSMVFilePath = nuXmvDirectoryUtil.getMonolithicSMVFilePath(projectPath,
				umlSelectedComponent.getName());

		smvMapDirPath = nuXmvDirectoryUtil.getSmvFileDirectory(projectPath);
		ossDirPath = ocraDirectoryUtil.getOSSDirPath(projectPath);
	}
}
