/*******************************************************************************
 * Copyright (C) 2020 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 ******************************************************************************/
/*------------------------------------------------------------------------------
  -
  - Copyright (c) 2015-2016 University of Padova, ITALY -  Intecs SpA 
  - All rights reserved. This program and the accompanying materials
  - are made available under the terms of the Eclipse Public License v2.0
  - which accompanies this distribution, and is available at
  - http://www.eclipse.org/legal/epl-v20.html
  -
  - Contributors:
  -
  - Alessandro Zovi azovi@math.unipd.it
  - Stefano Puri stefano.puri@intecs.it
  - Laura Baracchi laura.baracchi@intecs.it
  - Nicholas Pacini nicholas.pacini@intecs.it  
  -
  - Initial API and implementation and/or initial documentation
  ------------------------------------------------------------------------------*/package org.polarsys.chess.multicore.commands;

import org.polarsys.chess.core.util.uml.ModelError;


/**
 * The Class GenerateTask2CoreAssignmentsUsingRUNCommand.
 */
public class GenerateTask2CoreAssignmentsUsingRUNCommand extends GenerateTask2CoreAssignmentsCommand {
	
	/* (non-Javadoc)
	 * @see org.polarsys.chess.multicore.commands.GenerateTask2CoreAssignmentsCommand#execute()
	 */
	@Override
	public void execute() throws ModelError {
		queryContent(umlModel);
		executeTask2CoreCalculator(true);
		updateModel();
	}
}
