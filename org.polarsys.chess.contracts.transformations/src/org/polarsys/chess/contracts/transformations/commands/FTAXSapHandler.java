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
package org.polarsys.chess.contracts.transformations.commands;

import org.eclipse.uml2.uml.Class;
import org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Analysis;
import org.polarsys.chess.chessmlprofile.ParameterizedArchitecture.InstantiatedArchitectureConfiguration;
import org.polarsys.chess.contracts.profile.chesscontract.util.EntityUtil;
import org.polarsys.chess.service.core.exceptions.NoComponentException;
import org.polarsys.chess.service.core.model.ChessSystemModel;
import org.polarsys.chess.service.core.utils.AnalysisResultUtil;
import org.polarsys.chess.service.gui.utils.SelectionUtil;

import eu.fbk.eclipse.standardtools.utils.core.utils.StringArrayUtil;
import eu.fbk.eclipse.standardtools.utils.ui.dialogs.SelectArchitectureConfigurationDialog;
import eu.fbk.tools.adapter.xsap.ComputeFaultTree;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

/**
 * This command permits the execution of FTA using the xSAP tool.
 * 
 * @author cristofo
 *
 */
public class FTAXSapHandler extends AbstractXSapHandler {

	private Class umlSelectedComponent;
	private InstantiatedArchitectureConfiguration selectedInstantiatedArchitectureConfiguration;
	private SelectionUtil selectionUtil = SelectionUtil.getInstance();

	public Object execute(ExecutionEvent event) throws ExecutionException {
		// final String storeResultParam = "store_result";

		// Get the root component of the package
		// FIXME: potrebbe diventare inutile se metto l'analysis context...
		// final Class systemComponent =
		// analysisResultUtil.getSystemComponentFromEvent(event);

		try {
			umlSelectedComponent = selectionUtil.getUmlComponentFromSelectedObject(event);
		} catch (NoComponentException e) {
			umlSelectedComponent = analysisResultUtil.getSystemComponentFromEvent(event);
		}
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		EList<InstantiatedArchitectureConfiguration> instantiatedArchitecures = EntityUtil.getInstance()
				.getInstantiatedArchitecureConfigurations(umlSelectedComponent);
		if ((instantiatedArchitecures != null) && (!instantiatedArchitecures.isEmpty())) {
			SelectArchitectureConfigurationDialog dialog = new SelectArchitectureConfigurationDialog(shell,
					ChessSystemModel.getInstance(), instantiatedArchitecures);
			dialog.open();
			if (dialog.goAhead()) {
				selectedInstantiatedArchitectureConfiguration = (InstantiatedArchitectureConfiguration) dialog
						.getSelectedAchitectureConfiguration();
			}
		}

		// Compute all the required files for the analysis
		if (!prepareExpandedFiles(event, umlSelectedComponent, selectedInstantiatedArchitectureConfiguration,
				Analysis.FTA_ANALYSIS)) {
			return null;
		}

		// final boolean storeResult = (event.getParameter(storeResultParam) !=
		// null &&
		// event.getParameter(storeResultParam).equals("true")) ? true : false;

		// Compute and display the FTA for each condition requested
		int index = 0;
		// for (String condition : ftaFmeaCond.split(", ")) {
		final String ftFileName = fileNamesUtil.computeFtFileName(editor, modelName, ++index);
		if (xSapExecService.computeFt(extendedSmvFileName, fmsFileName, ftaFmeaCond, ftFileName, true)) {

			// FIXME: ftaCond potrebbe diventare inutile se metto l'analysis
			// context...

			// If requested, store the result
			// if (storeResult) {
			EList<String> props = new BasicEList<String>();
			// props.add(ftaFmeaCond);
			StringArrayUtil.addConditionKeyValue(props, AnalysisResultUtil.PROPERTY, ftaFmeaCond);
			analysisResultUtil.createOrUpdateAnalysisContext(Analysis.FTA_ANALYSIS, props, ftFileName, true, umlSelectedComponent,
					selectedInstantiatedArchitectureConfiguration, analysisContext);
			// }

			// Visualize the result
			analysisResultUtil.showResult(ComputeFaultTree.FUNCTION_NAME, ftFileName);
		}
		// }
		return null;
	}
}
