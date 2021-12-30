/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage
 * @generated
 */
public class CHESSIoTSoftwareSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CHESSIoTSoftwarePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTSoftwareSwitch() {
		if (modelPackage == null) {
			modelPackage = CHESSIoTSoftwarePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CHESSIoTSoftwarePackage.VIRTUAL_ENTITY: {
				VirtualEntity virtualEntity = (VirtualEntity)theEObject;
				T result = caseVirtualEntity(virtualEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT: {
				VirtualElement virtualElement = (VirtualElement)theEObject;
				T result = caseVirtualElement(virtualElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.IO_TPORT: {
				IoTPort ioTPort = (IoTPort)theEObject;
				T result = caseIoTPort(ioTPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.PAYLOAD: {
				Payload payload = (Payload)theEObject;
				T result = casePayload(payload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.MESSAGE_PARAMETERS: {
				MessageParameters messageParameters = (MessageParameters)theEObject;
				T result = caseMessageParameters(messageParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.STATE_MACHINE: {
				StateMachine stateMachine = (StateMachine)theEObject;
				T result = caseStateMachine(stateMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.REGION: {
				Region region = (Region)theEObject;
				T result = caseRegion(region);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.IO_TSTATE: {
				IoTState ioTState = (IoTState)theEObject;
				T result = caseIoTState(ioTState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.IO_TEVENT: {
				IoTEvent ioTEvent = (IoTEvent)theEObject;
				T result = caseIoTEvent(ioTEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.INCOMING_EVENT: {
				IncomingEvent incomingEvent = (IncomingEvent)theEObject;
				T result = caseIncomingEvent(incomingEvent);
				if (result == null) result = caseIoTEvent(incomingEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.RECEIVE_PAYLOAD: {
				ReceivePayload receivePayload = (ReceivePayload)theEObject;
				T result = caseReceivePayload(receivePayload);
				if (result == null) result = caseIoTAction(receivePayload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.IO_TACTION: {
				IoTAction ioTAction = (IoTAction)theEObject;
				T result = caseIoTAction(ioTAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT: {
				OutgoingEvent outgoingEvent = (OutgoingEvent)theEObject;
				T result = caseOutgoingEvent(outgoingEvent);
				if (result == null) result = caseIoTEvent(outgoingEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD: {
				SendPayload sendPayload = (SendPayload)theEObject;
				T result = caseSendPayload(sendPayload);
				if (result == null) result = caseIoTAction(sendPayload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.STATE_TRANSITION: {
				StateTransition stateTransition = (StateTransition)theEObject;
				T result = caseStateTransition(stateTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.GENERIC_EVENT: {
				GenericEvent genericEvent = (GenericEvent)theEObject;
				T result = caseGenericEvent(genericEvent);
				if (result == null) result = caseIoTEvent(genericEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.GENERIC_IO_TACTION: {
				GenericIoTAction genericIoTAction = (GenericIoTAction)theEObject;
				T result = caseGenericIoTAction(genericIoTAction);
				if (result == null) result = caseIoTAction(genericIoTAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.VITUAL_COMPUTING_NODE: {
				VitualComputingNode vitualComputingNode = (VitualComputingNode)theEObject;
				T result = caseVitualComputingNode(vitualComputingNode);
				if (result == null) result = caseVirtualElement(vitualComputingNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.SENSOR: {
				Sensor sensor = (Sensor)theEObject;
				T result = caseSensor(sensor);
				if (result == null) result = caseVirtualElement(sensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.ACTUATOR: {
				Actuator actuator = (Actuator)theEObject;
				T result = caseActuator(actuator);
				if (result == null) result = caseVirtualElement(actuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.SYSTEM: {
				SYSTEM system = (SYSTEM)theEObject;
				T result = caseSYSTEM(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualEntity(VirtualEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualElement(VirtualElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Io TPort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Io TPort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIoTPort(IoTPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePayload(Payload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageParameters(MessageParameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateMachine(StateMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegion(Region object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Io TState</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Io TState</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIoTState(IoTState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Io TEvent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Io TEvent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIoTEvent(IoTEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incoming Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incoming Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncomingEvent(IncomingEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receive Payload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive Payload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceivePayload(ReceivePayload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Io TAction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Io TAction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIoTAction(IoTAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outgoing Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outgoing Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutgoingEvent(OutgoingEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Payload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Payload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendPayload(SendPayload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateTransition(StateTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericEvent(GenericEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Io TAction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Io TAction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericIoTAction(GenericIoTAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vitual Computing Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vitual Computing Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitualComputingNode(VitualComputingNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuator(Actuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SYSTEM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SYSTEM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSYSTEM(SYSTEM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CHESSIoTSoftwareSwitch
