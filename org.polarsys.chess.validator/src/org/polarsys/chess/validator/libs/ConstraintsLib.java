/*
-----------------------------------------------------------------------
--          			CHESS validator plugin					     --
--                                                                   --
--                    Copyright (C) 2016                             --
--                 University of Padova, ITALY                       --
--                                                                   --
-- Authors: Alessandro Zovi          azovi@math.unipd.it             --
--          Laura Baracchi           laura.baracchi@intecs.it        --
--          Stefano Puri             stefano.puri@intecs.it          --
--                                                                   --
-- All rights reserved. This program and the accompanying materials  --
-- are made available under the terms of the Eclipse Public License  --
-- v1.0 which accompanies this distribution, and is available at     --
-- http://www.eclipse.org/legal/epl-v20.html                         --
-----------------------------------------------------------------------
*/

package org.polarsys.chess.validator.libs;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.polarsys.chess.validator.dinamicConstraints.AddRemoveDependency;
import org.polarsys.chess.validator.dinamicConstraints.C_A_1;
import org.polarsys.chess.validator.dinamicConstraints.CheckModifiedOperation;
import org.polarsys.chess.validator.dinamicConstraints.E_S_1_NEW;
import org.polarsys.chess.validator.dinamicConstraints.M_A_1;
import org.polarsys.chess.validator.dinamicConstraints.O_S_1;
import org.polarsys.chess.validator.dinamicConstraints.P_A_1;
import org.polarsys.chess.validator.dinamicConstraints.P_T_1;
import org.polarsys.chess.validator.dinamicConstraints.R_S_1;
import org.polarsys.chess.validator.dinamicConstraints.S_S_1;
import org.polarsys.chess.validator.dinamicConstraints.V_SR_1;

// TODO: Auto-generated Javadoc
/*
 * Framework usage:
 * 
 * In a Library of constraints: 
 * 
 * public static DynamicConstraint c1 = new DynamicConstraint(1, "c1", IConstraint.WARNING, "c1 message") {
 *   @Override
 *   public boolean checkConstraint(Notification notification, Package currentView){
 *      boolean successfullyVerifiedConstraint = false;
 *      ... //check conditionsEObject
 *      return successfullyVerifiedConstraint;
 *   }
 * }
 * 
 * In the listener:
 *   if (!Library.constraint1.check(notification).isOK()){
 *     //Library.constraint1.showUserNotification();  // NO
 *     throw new RollbackException(Library.constraint1.getStatus())
 *   }
 * */

/**
 * The Class ConstraintsLib contains the implementation of Dynamic Constraints
 */
public class ConstraintsLib {

	/** The Constant CSPORT. */
	protected static final String CSPORT = "MARTE::MARTE_DesignModel::GCM::ClientServerPort";

	/** The successfully verified. */
	static boolean successfullyVerified;

	/** The diagram. */
	static Diagram diagram = null;

	/** The notifier. */
	static Object notifier;

	// ResourceListener Constraints:
	/*
	 * @DynamicConstraint R_S_1
	 * 
	 */
	/** The R_ s_1. */
	//not used
	//public static R_S_1 R_S_1 = new R_S_1();

	/*
	 * @DynamicConstraint V_SR_1
	 */
	/** The V_ s r_1. */
	//not used
	//public static V_SR_1 V_SR_1 = new V_SR_1();
	
	// ModelManager Constraints:
	//not used
	//public static S_S_1 S_S_1 = new S_S_1();
	/*
	 * @DynamicConstraint M_A_1 cannot apply profiles
	 */
	/** The M_ a_1. */
	//not used
	//public static M_A_1 M_A_1 = new M_A_1();

	/*
	 * @DynamicConstraint C_A_1 Interface realization is not allowed because
	 * owned operations does not match.
	 */
	/** The C_ a_1. */
	//not used
	//public static C_A_1 C_A_1 = new C_A_1();

	/*
	 * DynamicConstraint O_S_1 Interface operations in the Functional View must
	 * have public visibility.
	 */
	/** The O_ s_1. */
	//not used
	//public static O_S_1 O_S_1 = new O_S_1();

	/** The Add remove dependency. */
	//not used
	//public static AddRemoveDependency AddRemoveDependency = new AddRemoveDependency();

	/*
	 * @DynamicConstraint P_T_1 view stereotype cannot be applied
	 */
	/** The P_ t_1. */
	//not used
	//public static P_T_1 P_T_1 = new P_T_1();

	/*
	 * @DynamicConstraint P_A_1 an interface can be added only in functionalView
	 * or deploymentView
	 */
	/** The P_ a_1. */
	//not used
	//public static P_A_1 P_A_1 = new P_A_1();

	/** The E_ s_1_ new. */
	public static E_S_1_NEW E_S_1_NEW = new E_S_1_NEW();

	/** The check modified operation. */
	//not used
	//public static CheckModifiedOperation checkModifiedOperation = new CheckModifiedOperation();

}