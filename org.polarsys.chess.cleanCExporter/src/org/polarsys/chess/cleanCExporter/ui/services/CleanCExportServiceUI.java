/*******************************************************************************
 * Copyright (C) 2017 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *  
 * Contributors:
 *   Alberto Debiasi - initial API and implementation
 *   Ahmed Irfan
 ******************************************************************************/
package org.polarsys.chess.cleanCExporter.ui.services;

import java.io.File;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.polarsys.chess.service.core.model.ChessSystemModel;
import org.polarsys.chess.service.core.model.UMLStateMachineModel;

import eu.fbk.eclipse.standardtools.StateMachineTranslatorToCleanC.core.services.CleanCTranslatorServiceAPI;
import eu.fbk.eclipse.standardtools.utils.ui.utils.DialogUtil;

public class CleanCExportServiceUI {

	private static final Logger logger = Logger.getLogger(CleanCExportServiceUI.class);

	private static CleanCExportServiceUI instance;
	private ChessSystemModel chessSystemModel = ChessSystemModel.getInstance();

	private CleanCTranslatorServiceAPI cleanCTranslatorServiceAPI = CleanCTranslatorServiceAPI.getInstance(chessSystemModel,
			UMLStateMachineModel.getInstance());
	private DialogUtil dialogUtil = DialogUtil.getInstance();

	public static CleanCExportServiceUI getInstance() {
		if (instance == null) {
			instance = new CleanCExportServiceUI();
		}
		return instance;
	}

	public void exportAllNominalStateMachinesOfTheModel(UmlModel umlModel, String selectedDirectory, boolean showPopups,
			IProgressMonitor monitor) throws Exception {

		logger.debug("umlModel: " + umlModel);
		cleanCTranslatorServiceAPI.exportAllNominalStateMachinesOfTheModel(umlModel, selectedDirectory, null, monitor);

		if (showPopups) {
			dialogUtil.showMessage_ExportNominalStateMachinesDone(selectedDirectory);
		}

	}

	public void exportNominalStateMachines(Class umlSelectedComponent, String selectedDirectory, boolean showPopups,
			IProgressMonitor monitor) throws Exception {

		cleanCTranslatorServiceAPI.exportNominalStateMachines(umlSelectedComponent, selectedDirectory, null, monitor);

		if (showPopups) {
			dialogUtil.showMessage_ExportNominalStateMachinesDone(selectedDirectory);
		}

	}

	public String exportSingleCleanC(Class umlSelectedComponent, boolean showPopups, String selectedDirectory,
			IProgressMonitor monitor) throws Exception {

		File cFile = cleanCTranslatorServiceAPI.exportStateMachineOfComponentToCleanCFile(umlSelectedComponent, showPopups,
				selectedDirectory, monitor);

		//////////////////////////////////////
		// insert check errors method
		//////////////////////////////////////
		if (showPopups) {
			dialogUtil.showMessage_ExportBehaviourDone(cFile.getAbsolutePath());
		}

		return cFile.getPath();

	}

	public HashMap<String, String> exportCleanC(Class umlSelectedComponent, boolean showPopups, String selectedDirectory,
			IProgressMonitor monitor) throws Exception {

		HashMap<String, String> mapCFile_ComponentName = cleanCTranslatorServiceAPI
				.exportAllStateMachinesToCleanCFiles(umlSelectedComponent, selectedDirectory, monitor);

		//////////////////////////////////////
		// insert check errors method
		//////////////////////////////////////

		logger.debug("exportCleanC done");
		if (showPopups) {
			dialogUtil.showMessage_ExportBehaviourDone(selectedDirectory);
		}

		return mapCFile_ComponentName;

	}

	public boolean isLeafComponent(Class umlSelectedComponent) {
		EList<Property> subComponents = chessSystemModel.getSubComponentsInstances(umlSelectedComponent);
		return ((subComponents == null) || (subComponents.size() == 0));
	}

}
