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
package org.polarsys.chess.diagramsCreator.commands;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;

import eu.fbk.eclipse.standardtools.utils.ui.commands.AbstractJobCommand;
import eu.fbk.eclipse.standardtools.utils.ui.utils.CommandBuilder;

/**
 * Class that creates multiple IBDs by calling different handlers. 
 * It is triggered by the contextual menu item on an entire package.
 * @author cristofo
 *
 */
public class CreateIBDMultipleCommand extends AbstractJobCommand {

	public CreateIBDMultipleCommand() {
		super("Create IBD Multiple");
	}

	@Override
	public void execPreJobOperations(ExecutionEvent event, IProgressMonitor monitor) throws Exception {
	}

	@Override
	public void execJobCommand(ExecutionEvent event, IProgressMonitor monitor) throws Exception {

		// Call the command to create all the diagrams and populate them
		final String BDD_CREATOR_COMMAND = "org.polarsys.chess.diagramsCreator.commands.createAllIBDsHandler";
		try {
			final CommandBuilder diagramBDDCreator = CommandBuilder.build(BDD_CREATOR_COMMAND);
			diagramBDDCreator.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void execPostJobOperations(ExecutionEvent event, NullProgressMonitor nullProgressMonitor) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
