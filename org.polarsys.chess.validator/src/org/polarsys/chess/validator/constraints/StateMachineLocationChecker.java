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
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.StateMachine;
import org.polarsys.chess.contracts.profile.chesscontract.util.EntityUtil;
import org.polarsys.chess.core.constraint.PreferenceProperties;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Class;

public class StateMachineLocationChecker extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx) {

		IStatus success = ctx.createSuccessStatus();

		Boolean checkStateMachines = org.polarsys.chess.core.Activator.getDefault().getPreferenceStore()
				.getBoolean(PreferenceProperties.STATE_MACHINE);

		if (checkStateMachines) {

			// if(ctx.getTarget() instanceof Sta){
			StateMachine sm = (StateMachine) ctx.getTarget();

			if (!ctx.getEventType().equals(EMFEventType.SET)) {
				return success;
			}

			if (!(sm.getOwner() instanceof Class)) {
				IStatus failure = createFailureStatus(ctx, null, sm);
				return failure;
			}

			List<Property> subComponents = EntityUtil.getInstance()
					.getSubComponentsInstances((org.eclipse.uml2.uml.Class) sm.getOwner());
			if (!subComponents.isEmpty()) {
				IStatus failure = createFailureStatus(ctx, ((Class) sm.getOwner()).getName(), sm);
				return failure;
			}

		}

		return success;
	}

	private IStatus createFailureStatus(IValidationContext ctx, String ownerName, StateMachine sm) {
		return ctx.createFailureStatus(sm.getName(),
				ownerName == null ? "The state machine must be associated only to the leaf component."
						: "The state machine must be associated only to the leaf component. '" + ownerName
								+ "' is not a leaf component.");
	}

}
