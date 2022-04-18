/*******************************************************************************
 * Copyright (C) 2020 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 ******************************************************************************/
package org.polarsys.chess.checkers.core.checkerManager;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;

public class CheckerMessage {

	protected IFile file;
	protected int severity;
	protected String message;
	protected Object object;
	protected String checkerName;
	
	public CheckerMessage(String message, int severity ,Object object, String checkerName ) {
			this((object instanceof EObject) ? WorkspaceSynchronizer.getFile(((EObject) object).eResource()) : null, 
					severity, message, object, checkerName);
	}

	public CheckerMessage(IFile file, int severity, String message, Object object, String checkerName) {
		super();
		this.file = file;
		this.severity = severity;
		this.message = message;
		this.object = object;
		this.checkerName = checkerName;
	}

	public String getMessage() {
		return message;
	}
	
	public IFile getFile() {
		return file;
	}

	public int getSeverity() {
		return severity;
	}

	public Object getObject() {
		return object;
	}

	public String getCheckerName() {
		return checkerName;
	}

}