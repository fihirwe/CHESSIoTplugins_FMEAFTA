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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.OpaqueBehavior;
import org.eclipse.uml2.uml.Transition;
import org.polarsys.chess.core.constraint.PreferenceProperties;

public class OpaqueBehavChecker extends AbstractModelConstraint {

	private static final String CLEAN_C_LANGUAGE = "CleanC";

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext ctx) {

		OpaqueBehavior opaqueBehavior = (OpaqueBehavior) ctx.getTarget();
		String thisElement = opaqueBehavior.getName();

		IStatus success = ctx.createSuccessStatus();

		Boolean checkOpaqueBehavior = org.polarsys.chess.core.Activator.getDefault().getPreferenceStore()
				.getBoolean(PreferenceProperties.OPAQUE_BEHAV);

		if (checkOpaqueBehavior) {
			if (belongsToTransitionEffect(opaqueBehavior)) {
				if (!opaqueBehavior.getLanguages().contains(CLEAN_C_LANGUAGE)) {
					String errorMsg = "The behaviour is not defined with the language '" + CLEAN_C_LANGUAGE + "'.";
					IStatus failure = ctx.createFailureStatus(thisElement, errorMsg);
					return failure;
				} else {
					return success;
				}
			} if (belongsToClass(opaqueBehavior)) {
				if (!opaqueBehavior.getLanguages().contains(CLEAN_C_LANGUAGE)) {
					String errorMsg = "The behaviour is not defined with the language '" + CLEAN_C_LANGUAGE + "'.";
					IStatus failure = ctx.createFailureStatus(thisElement, errorMsg);
					return failure;
				} else {
					return success;
				}
			}else {
				String errorMsg = "The behaviour with this owner is not supported.";
				IStatus failure = ctx.createFailureStatus(thisElement, errorMsg);
				return failure;
			}

		}
		return success;
	}

	private boolean belongsToClass(OpaqueBehavior expr) {
		Element owner = expr.getOwner();
		return (owner instanceof org.eclipse.uml2.uml.Class);
	}

	private boolean belongsToTransitionEffect(OpaqueBehavior expr) {
		Element owner = expr.getOwner();
		return (owner instanceof Transition);
	}

}
