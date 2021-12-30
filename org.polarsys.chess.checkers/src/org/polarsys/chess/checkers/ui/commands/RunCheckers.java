/*******************************************************************************
 * Copyright (C) 2020 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 ******************************************************************************/
package org.polarsys.chess.checkers.ui.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.polarsys.chess.checkers.Activator;
import eu.fbk.eclipse.standardtools.utils.ui.utils.DialogUtil;

import org.apache.log4j.Logger;

public class RunCheckers extends AbstractHandler {

	private static final Logger logger = Logger.getLogger(RunCheckers.class);

	public RunCheckers() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			Activator.getCheckerManager().run(Activator.getDefault().getTags());
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e);
			DialogUtil.getInstance().showMessage_ExceptionError(e);
		}

		return null;
	}

}
