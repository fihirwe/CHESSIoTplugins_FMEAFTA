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
import org.eclipse.uml2.uml.Property;
import org.polarsys.chess.core.constraint.PreferenceProperties;


public class PropertyTypeChecker extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext ctx) {

		Property property = (Property) ctx.getTarget();
		String thisElement = property.getName();

		IStatus success = ctx.createSuccessStatus();
		

		Boolean checkPropertyType = org.polarsys.chess.core.Activator.getDefault().getPreferenceStore()
				.getBoolean(PreferenceProperties.PROPERTY_TYPE);

		if (checkPropertyType) {
						
			if(property.getType() == null){
			String errorMsg = "The type of '"+property.getName()+"' is null.";
			IStatus failure = ctx.createFailureStatus(thisElement, errorMsg);
			return failure;
			}

		}
		return success;
	}

}
