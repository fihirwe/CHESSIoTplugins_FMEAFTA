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
import org.polarsys.chess.cleanCExporter.ui.services.CleanCExportServiceUI;
import org.polarsys.chess.service.gui.utils.DialogUtils;
import org.polarsys.chess.service.gui.utils.SelectionUtil;

import eu.fbk.eclipse.standardtools.utils.ui.commands.AbstractJobCommand;

import org.eclipse.uml2.uml.Class;

public class ExportSelectedNominalSMsToCleanCFilesCommand extends AbstractJobCommand {

	private SelectionUtil selectionUtil = SelectionUtil.getInstance();
	private DialogUtils dialogUtils = DialogUtils.getInstance();
	private CleanCExportServiceUI cleanCExportServiceUI = CleanCExportServiceUI.getInstance();

	public ExportSelectedNominalSMsToCleanCFilesCommand() {
		super("Export Nominal State Machines To .c Files");
	}

	private Class umlSelectedComponent;
	private String outputDirectoryName;
	private boolean showPopups;

	@Override
	public void execPreJobOperations(ExecutionEvent event, IProgressMonitor monitor) throws Exception {

		umlSelectedComponent = selectionUtil.getUmlComponentFromSelectedObject(event);
		outputDirectoryName = dialogUtils.getDirectoryNameFromDialog();
		showPopups = true;

	}

	@Override
	public void execJobCommand(ExecutionEvent event, IProgressMonitor monitor) throws Exception {
		cleanCExportServiceUI.exportNominalStateMachines(umlSelectedComponent, outputDirectoryName, showPopups, monitor);
	}

	@Override
	public void execPostJobOperations(ExecutionEvent event, NullProgressMonitor nullProgressMonitor) throws Exception {

		
	}

}
