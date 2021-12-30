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
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Transition;
import org.polarsys.chess.contracts.profile.chesscontract.util.EntityUtil;
import org.polarsys.chess.core.constraint.PreferenceProperties;

public class OpaqueExprChecker extends AbstractModelConstraint {

	private static final String CLEAN_C_LANGUAGE = "CleanC";
	private static final String OCRA_LANGUAGE = "OCRA";

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext ctx) {

		OpaqueExpression opaqueExpression = (OpaqueExpression) ctx.getTarget();
		String thisElement = opaqueExpression.getName();

		IStatus success = ctx.createSuccessStatus();

		Boolean checkOpaqueExpression = org.polarsys.chess.core.Activator.getDefault().getPreferenceStore()
				.getBoolean(PreferenceProperties.OPAQUE_EXPR);

		if (checkOpaqueExpression) {
			if (belongsToTransitionGuard(opaqueExpression)) {
				if (!opaqueExpression.getLanguages().contains(CLEAN_C_LANGUAGE)) {
					String errorMsg = "The transition guard must be defined with the language '" + CLEAN_C_LANGUAGE
							+ "'.";
					IStatus failure = ctx.createFailureStatus(thisElement, errorMsg);
					return failure;
				} else {
					return success;
				}
			} else if (belongsToDelegationConstraints(opaqueExpression)) {
				if (!opaqueExpression.getLanguages().contains(OCRA_LANGUAGE)) {
					String errorMsg = "The delegation constraint must be defined with the language '" + OCRA_LANGUAGE
							+ "'.";
					IStatus failure = ctx.createFailureStatus(thisElement, errorMsg);
					return failure;
				} else {
					return success;
				}
			} else if (belongsToFormalProperty(opaqueExpression)) {
				if (!opaqueExpression.getLanguages().contains(OCRA_LANGUAGE)) {
					String errorMsg = "The formal property must be defined with the language '" + OCRA_LANGUAGE + "'.";
					IStatus failure = ctx.createFailureStatus(thisElement, errorMsg);
					return failure;
				} else {
					return success;
				}
			} else {
				String errorMsg = "The expression with this owner is not supported.";
				IStatus failure = ctx.createFailureStatus(thisElement, errorMsg);
				return failure;
			}
		}
		return success;

	}

	private boolean belongsToFormalProperty(OpaqueExpression expr) {
		Element owner = expr.getOwner();
		return EntityUtil.getInstance().isFormalProperty(owner);
	}

	private boolean belongsToDelegationConstraints(OpaqueExpression expr) {
		Element owner = expr.getOwner();
		return EntityUtil.getInstance().isDelegationConstraint(owner);
	}

	private boolean belongsToTransitionGuard(OpaqueExpression expr) {
		Element owner = expr.getOwner();
		return (owner instanceof Constraint) && (owner.getOwner() instanceof Transition);
	}
}
