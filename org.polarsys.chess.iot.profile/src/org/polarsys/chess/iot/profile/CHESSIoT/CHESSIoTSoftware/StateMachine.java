/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateMachine#getBase_StateMachine <em>Base State Machine</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateMachine#getIotstate <em>Iotstate</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Base State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base State Machine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base State Machine</em>' reference.
	 * @see #setBase_StateMachine(org.eclipse.uml2.uml.StateMachine)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getStateMachine_Base_StateMachine()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.StateMachine getBase_StateMachine();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateMachine#getBase_StateMachine <em>Base State Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base State Machine</em>' reference.
	 * @see #getBase_StateMachine()
	 * @generated
	 */
	void setBase_StateMachine(org.eclipse.uml2.uml.StateMachine value);

	/**
	 * Returns the value of the '<em><b>Iotstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iotstate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iotstate</em>' reference.
	 * @see #setIotstate(IoTState)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getStateMachine_Iotstate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IoTState getIotstate();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateMachine#getIotstate <em>Iotstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iotstate</em>' reference.
	 * @see #getIotstate()
	 * @generated
	 */
	void setIotstate(IoTState value);

} // StateMachine
