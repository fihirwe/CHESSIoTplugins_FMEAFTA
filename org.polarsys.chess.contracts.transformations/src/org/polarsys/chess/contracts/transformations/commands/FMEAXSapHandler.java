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

import java.util.StringJoiner;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
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
import eu.fbk.tools.adapter.xsap.ComputeFmeaTable;

/**
 * This command permits the execution of FMEA using the xSAP tool.
 * @author cristofo
 *
 */
public class FMEAXSapHandler extends AbstractXSapHandler {
	
	private Class umlSelectedComponent;
	private InstantiatedArchitectureConfiguration selectedInstantiatedArchitectureConfiguration ;
	private SelectionUtil selectionUtil = SelectionUtil.getInstance();
	/**
	 * Returns the string of expressions, formatted as requested by xSAP.
	 * @param conditions the string of conditions as reported to the user
	 * @return
	 */
	private String processConditions(String conditions) {
		StringJoiner arguments = new StringJoiner(" ");
		for (String condition : ftaFmeaCond.split(",")) {
			arguments.add("\"" + condition + "\"");
		}
		return arguments.toString();
	}
	
	public Object execute(ExecutionEvent event) throws ExecutionException {
		//final String storeResultParam = "store_result";
		
		try {
			umlSelectedComponent = selectionUtil.getUmlComponentFromSelectedObject(event);
		} catch (NoComponentException e) {
			umlSelectedComponent = analysisResultUtil.getSystemComponentFromEvent(event);
		}

		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		EList<InstantiatedArchitectureConfiguration> instantiatedArchitecures = EntityUtil.getInstance().getInstantiatedArchitecureConfigurations(umlSelectedComponent);
		if((instantiatedArchitecures!=null)&&(!instantiatedArchitecures.isEmpty())){
				SelectArchitectureConfigurationDialog dialog = new SelectArchitectureConfigurationDialog(shell,ChessSystemModel.getInstance(), instantiatedArchitecures);
			dialog.open();
		if (dialog.goAhead()) {
			selectedInstantiatedArchitectureConfiguration =(InstantiatedArchitectureConfiguration)dialog.getSelectedAchitectureConfiguration();
		}
		}
		
		// Compute all the required files for the analysis
		if (!prepareExpandedFiles(event,umlSelectedComponent,selectedInstantiatedArchitectureConfiguration,Analysis.FMEA_ANALYSIS)) {
			return null;
		}
			
	//	final boolean storeResult = (event.getParameter(storeResultParam) != null && 
	//			event.getParameter(storeResultParam).equals("true")) ? true : false;

		final String fmeaFileName = fileNamesUtil.computeFmeaFileName(editor, modelName);
		
		// Compute FMEA and show results in a dedicated view
		if (xSapExecService.computeFmea(extendedSmvFileName, fmsFileName, processConditions(ftaFmeaCond), 
				fmeaFileName, true)) {
			
			EList<String> props= new BasicEList<String>();
			StringArrayUtil.addConditionKeyValue(props, AnalysisResultUtil.PROPERTY, ftaFmeaCond);
			
			// If requested, store the result
			//if (storeResult) {
				analysisResultUtil.createOrUpdateAnalysisContext(Analysis.FMEA_ANALYSIS,props , 
					fmeaFileName, false,umlSelectedComponent,selectedInstantiatedArchitectureConfiguration, analysisContext);
			//}

			// Visualize the result
			analysisResultUtil.showResult(ComputeFmeaTable.FUNCTION_NAME, fmeaFileName);
		}
		return null;
	}
}

