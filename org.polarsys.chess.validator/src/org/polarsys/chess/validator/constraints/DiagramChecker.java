/*******************************************************************************
 * Copyright (C) 2020 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Alberto Debiasi - initial API and implementation
 ******************************************************************************/
package org.polarsys.chess.validator.constraints;

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.uml2.uml.StateMachine;
import org.polarsys.chess.contracts.profile.chesscontract.util.EntityUtil;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;

public class DiagramChecker extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx) {
		
		IStatus success = ctx.createSuccessStatus();
		
		return success;
	}



}
