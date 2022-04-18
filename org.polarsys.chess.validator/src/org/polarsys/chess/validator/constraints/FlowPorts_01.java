/*
-----------------------------------------------------------------------
--                CHESS Live/Batch Validator plugin                  --
--                                                                   --
--                    Copyright (C) 2011-2012                        --
--                 University of Padova, ITALY                       --
--                                                                   --
-- 							                 --
--                                                                   --
-- All rights reserved. This program and the accompanying materials  --
-- are made available under the terms of the Eclipse Public License  --
-- v1.0 which accompanies this distribution, and is available at     --
-- http://www.eclipse.org/legal/epl-v20.html                         --
-----------------------------------------------------------------------
 */

package org.polarsys.chess.validator.constraints;

import javax.jws.soap.SOAPBinding.Use;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Port;
import org.polarsys.chess.chessmlprofile.util.Constants;
import org.polarsys.chess.core.util.uml.UMLUtils;

/**
 * The Class FlowPorts_01.
 * This class implements the following constraint (invoked by the EMF validation framework):
 * The FlowPort must be mapped to a parameter of a required or provided operation
 */
public class FlowPorts_01 extends AbstractModelConstraint {

	/** The Constant FLOWPORT. */
	/**
     * @deprecated use {@link org.polarsys.chess.chessmlprofile.util.Constants.FLOWPORT}
     */
	public static final String FLOWPORT = "MARTE::MARTE_DesignModel::GCM::FlowPort";
	
	
	/** The Constant ALLOCATE. */
	/**
     * @deprecated use {@link org.polarsys.chess.chessmlprofile.util.Constants.MARTE_ALLOCATE}
     */
	public static final String ALLOCATE = "MARTE::MARTE_Foundations::Alloc::Allocate";
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext ctx) {

		IStatus success = ctx.createSuccessStatus();
		IStatus failure = ctx.createFailureStatus();
			
		Port port = (Port) ctx.getTarget();
		if(port.getAppliedStereotype(Constants.FLOW_PORT) == null){
			return success;
		}
		
		Element owner = port.getOwner();
		if(!UMLUtils.isComponentType(owner)){
			return success;
		}
		
		/* if it is a flow port of a component type it must have at least a mapping to a parameter 
		 * (the validity of such mapping is checked through other constraints)
		 */

		EList<Dependency> dependencies = port.getClientDependencies();
		for (Dependency dep : dependencies) {
			if (dep instanceof Abstraction && dep.getAppliedStereotype(Constants.MARTE_ALLOCATE) != null){
				return success;
			}
		}
		return failure;
	}

}