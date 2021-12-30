/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage
 * @generated
 */
public interface CHESSIoTSoftwareFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CHESSIoTSoftwareFactory eINSTANCE = org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwareFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Virtual Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Entity</em>'.
	 * @generated
	 */
	VirtualEntity createVirtualEntity();

	/**
	 * Returns a new object of class '<em>Virtual Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Element</em>'.
	 * @generated
	 */
	VirtualElement createVirtualElement();

	/**
	 * Returns a new object of class '<em>Io TPort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Io TPort</em>'.
	 * @generated
	 */
	IoTPort createIoTPort();

	/**
	 * Returns a new object of class '<em>Payload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payload</em>'.
	 * @generated
	 */
	Payload createPayload();

	/**
	 * Returns a new object of class '<em>Message Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Parameters</em>'.
	 * @generated
	 */
	MessageParameters createMessageParameters();

	/**
	 * Returns a new object of class '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Machine</em>'.
	 * @generated
	 */
	StateMachine createStateMachine();

	/**
	 * Returns a new object of class '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region</em>'.
	 * @generated
	 */
	Region createRegion();

	/**
	 * Returns a new object of class '<em>Io TState</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Io TState</em>'.
	 * @generated
	 */
	IoTState createIoTState();

	/**
	 * Returns a new object of class '<em>Io TEvent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Io TEvent</em>'.
	 * @generated
	 */
	IoTEvent createIoTEvent();

	/**
	 * Returns a new object of class '<em>Incoming Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Incoming Event</em>'.
	 * @generated
	 */
	IncomingEvent createIncomingEvent();

	/**
	 * Returns a new object of class '<em>Receive Payload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receive Payload</em>'.
	 * @generated
	 */
	ReceivePayload createReceivePayload();

	/**
	 * Returns a new object of class '<em>Io TAction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Io TAction</em>'.
	 * @generated
	 */
	IoTAction createIoTAction();

	/**
	 * Returns a new object of class '<em>Outgoing Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outgoing Event</em>'.
	 * @generated
	 */
	OutgoingEvent createOutgoingEvent();

	/**
	 * Returns a new object of class '<em>Send Payload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Payload</em>'.
	 * @generated
	 */
	SendPayload createSendPayload();

	/**
	 * Returns a new object of class '<em>State Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Transition</em>'.
	 * @generated
	 */
	StateTransition createStateTransition();

	/**
	 * Returns a new object of class '<em>Generic Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Event</em>'.
	 * @generated
	 */
	GenericEvent createGenericEvent();

	/**
	 * Returns a new object of class '<em>Generic Io TAction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Io TAction</em>'.
	 * @generated
	 */
	GenericIoTAction createGenericIoTAction();

	/**
	 * Returns a new object of class '<em>Vitual Computing Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vitual Computing Node</em>'.
	 * @generated
	 */
	VitualComputingNode createVitualComputingNode();

	/**
	 * Returns a new object of class '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor</em>'.
	 * @generated
	 */
	Sensor createSensor();

	/**
	 * Returns a new object of class '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actuator</em>'.
	 * @generated
	 */
	Actuator createActuator();

	/**
	 * Returns a new object of class '<em>SYSTEM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SYSTEM</em>'.
	 * @generated
	 */
	SYSTEM createSYSTEM();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CHESSIoTSoftwarePackage getCHESSIoTSoftwarePackage();

} //CHESSIoTSoftwareFactory
