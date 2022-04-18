/*
-----------------------------------------------------------------------
--                CHESS Live/Batch Validator plugin                  --
--                                                                   --
--                    Copyright (C) 2011-2012                        --
--                 University of Padova, ITALY                       --
--                                                                   --
-- Author: Nicholas Pacini         									 --
--                                                                   --
-- All rights reserved. This program and the accompanying materials  --
-- are made available under the terms of the Eclipse Public License  --
-- v1.0 which accompanies this distribution, and is available at     --
-- http://www.eclipse.org/legal/epl-v20.html                         --
-----------------------------------------------------------------------
*/

package org.polarsys.chess.validator.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.sysml.portandflows.FlowDirection;
import org.eclipse.papyrus.sysml.portandflows.FlowPort;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Stereotype;
import org.polarsys.chess.chessmlprofile.util.Constants;
import org.polarsys.chess.core.constraint.PreferenceProperties;

/**
 * The Class Connector_02. Check that flow ports on the ends of a connection
 * have compatible directions
 */
public class Connector_02 extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext ctx) {

		Connector con = (Connector) ctx.getTarget();

		String thisElement = con.getName();

		IStatus success = ctx.createSuccessStatus();
		

		Boolean checkPortDirections = org.polarsys.chess.core.Activator.getDefault().getPreferenceStore()
				.getBoolean(PreferenceProperties.PORT_DIRECTIONS);

		if (checkPortDirections) {
			
			if (!ctx.getEventType().equals(EMFEventType.SET)) {
				return success;
			}

			ConnectorEnd firstEnd = con.getEnds().get(0);
			if (!(firstEnd.getRole() instanceof Port)) {
				String errorMsg = "First end is not instance of Port.";
				IStatus failure = ctx.createFailureStatus(thisElement, errorMsg);
				return failure;
			}

			Port firstPort = (Port) firstEnd.getRole();
			Stereotype firstStereo = firstPort.getAppliedStereotype(Constants.FLOW_PORT);
			if (firstStereo == null) {
				return success;
			}
			FlowPort firstFlowPort = (FlowPort) firstPort.getStereotypeApplication(firstStereo);

			ConnectorEnd secondEnd = con.getEnds().get(1);
			if (!(secondEnd.getRole() instanceof Port)) {
				String errorMsg = "Second end is not instance of Port.";
				IStatus failure = ctx.createFailureStatus(thisElement, errorMsg);
				return failure;
			}

			Port secondPort = (Port) secondEnd.getRole();
			Stereotype secondStereo = secondPort.getAppliedStereotype(Constants.FLOW_PORT);
			if (secondStereo == null) {
				return success;
			}
			FlowPort secondFlowPort = (FlowPort) secondPort.getStereotypeApplication(secondStereo);

			// check directions:
			// out -> in; in -> out; inout -> whatever			/
			FlowDirection firstDir = firstFlowPort.getDirection();
			FlowDirection secondDir = secondFlowPort.getDirection();

			if (firstDir.equals(FlowDirection.INOUT) || secondDir.equals(FlowDirection.INOUT)){
				return success;
			}
			
			if (firstDir.equals(FlowDirection.IN) && firstEnd.getPartWithPort() == null && secondDir.equals(FlowDirection.IN) && secondEnd.getPartWithPort() != null){
				return success;
			}
			
			if (firstDir.equals(FlowDirection.OUT) && firstEnd.getPartWithPort() != null && secondDir.equals(FlowDirection.IN) && secondEnd.getPartWithPort() != null){
				return success;
			}
			
			if (firstDir.equals(FlowDirection.OUT) && firstEnd.getPartWithPort() != null && secondDir.equals(FlowDirection.OUT) && secondEnd.getPartWithPort() == null){
				return success;
			}
						
			String errorMsg = "The ports '"+firstPort.getName()+"' and '"+secondPort.getName()+"' have incompatible directions.";
			IStatus failure = ctx.createFailureStatus(thisElement, errorMsg);
			return failure;
			
			/*if (!firstDir.equals(FlowDirection.INOUT) && !(secondDir.equals(FlowDirection.INOUT))
					&& firstDir.equals(secondDir)) {
				System.out.println("checking");
				// it's not an automatic failure if it's port delegation between
				// parent and child
				if (firstEnd.getPartWithPort() == null || secondEnd.getPartWithPort() == null) {
					System.out.println("PartWithPort null");
					return success;
				}
				if (firstEnd.getPartWithPort() instanceof Property || secondEnd.getPartWithPort() instanceof Property) {
					Property prFirst = firstEnd.getPartWithPort();
					Property prSec = secondEnd.getPartWithPort();
					// check that the one of the properties contains the other
					if (prFirst.getType().getOwnedElements().contains(prSec)
							|| prSec.getType().getOwnedElements().contains(prFirst)) {
						System.out.println("one of the properties contains the other: "+prFirst.getName()+" - "+prSec.getName());
						return success;
					}
				}
				failure = ctx.createFailureStatus(thisElement, errorMsg);
				return failure;
			}*/

		}
		return success;
	}

}
