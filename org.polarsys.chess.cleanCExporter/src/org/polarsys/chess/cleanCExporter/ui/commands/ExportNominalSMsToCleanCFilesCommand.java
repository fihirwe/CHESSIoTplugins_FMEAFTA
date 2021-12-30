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
package org.polarsys.chess.cleanCExporter.ui.commands;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.papyrus.uml.tools.model.UmlUtils;
import org.polarsys.chess.cleanCExporter.ui.services.CleanCExportServiceUI;
import org.polarsys.chess.service.gui.utils.DialogUtils;

import eu.fbk.eclipse.standardtools.utils.ui.commands.AbstractJobCommand;

public class ExportNominalSMsToCleanCFilesCommand extends AbstractJobCommand {

	private DialogUtils exportDialogUtils = DialogUtils.getInstance();
	private CleanCExportServiceUI cleanCExportServiceUI = CleanCExportServiceUI.getInstance();

	public ExportNominalSMsToCleanCFilesCommand() {
		super("Export Nominal State Machines To .c Files");
	}

	private String outputDirectoryName;
	private boolean showPopups;
	private UmlModel umlModel;

	@Override
	public void execPreJobOperations(ExecutionEvent event, IProgressMonitor monitor) throws Exception {

		outputDirectoryName = exportDialogUtils.getDirectoryNameFromDialog();
		showPopups = true;
		umlModel = UmlUtils.getUmlModel();
	}

	@Override
	public void execJobCommand(ExecutionEvent event, IProgressMonitor monitor) throws Exception {
		cleanCExportServiceUI.exportAllNominalStateMachinesOfTheModel(umlModel, outputDirectoryName, showPopups, monitor);

	}

	@Override
	public void execPostJobOperations(ExecutionEvent event, NullProgressMonitor nullProgressMonitor) throws Exception {
		
		
	}

}
