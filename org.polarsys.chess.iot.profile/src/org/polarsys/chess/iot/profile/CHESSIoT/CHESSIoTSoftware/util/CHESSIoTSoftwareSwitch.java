/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Action;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Actuator;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Assignemt;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Condition;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.ConditionEvent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Event;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.External;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.FunctionCall;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Generic;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Guard;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.InternalEvent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTPort;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Loop;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.MQTTPort;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.PayloadParameters;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Print;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SYSTEM_Sw;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Send;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Sensor;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateMachine;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualElement;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity;

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
			case CHESSIoTSoftwarePackage.PAYLOAD_PARAMETERS: {
				PayloadParameters payloadParameters = (PayloadParameters)theEObject;
				T result = casePayloadParameters(payloadParameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.STATE_MACHINE: {
				StateMachine stateMachine = (StateMachine)theEObject;
				T result = caseStateMachine(stateMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.IO_TSTATE: {
				IoTState ioTState = (IoTState)theEObject;
				T result = caseIoTState(ioTState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.INTERNAL_EVENT: {
				InternalEvent internalEvent = (InternalEvent)theEObject;
				T result = caseInternalEvent(internalEvent);
				if (result == null) result = caseEvent(internalEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.SEND: {
				Send send = (Send)theEObject;
				T result = caseSend(send);
				if (result == null) result = caseAction(send);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.STATE_TRANSITION: {
				StateTransition stateTransition = (StateTransition)theEObject;
				T result = caseStateTransition(stateTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.CONDITION_EVENT: {
				ConditionEvent conditionEvent = (ConditionEvent)theEObject;
				T result = caseConditionEvent(conditionEvent);
				if (result == null) result = caseEvent(conditionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.GUARD: {
				Guard guard = (Guard)theEObject;
				T result = caseGuard(guard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.GENERIC: {
				Generic generic = (Generic)theEObject;
				T result = caseGeneric(generic);
				if (result == null) result = caseAction(generic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.VIRTUAL_BOARD: {
				VirtualBoard virtualBoard = (VirtualBoard)theEObject;
				T result = caseVirtualBoard(virtualBoard);
				if (result == null) result = caseVirtualElement(virtualBoard);
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
			case CHESSIoTSoftwarePackage.SYSTEM_SW: {
				SYSTEM_Sw systeM_Sw = (SYSTEM_Sw)theEObject;
				T result = caseSYSTEM_Sw(systeM_Sw);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.EXTERNAL: {
				External external = (External)theEObject;
				T result = caseExternal(external);
				if (result == null) result = caseGeneric(external);
				if (result == null) result = caseAction(external);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.LOOP: {
				Loop loop = (Loop)theEObject;
				T result = caseLoop(loop);
				if (result == null) result = caseGeneric(loop);
				if (result == null) result = caseAction(loop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = caseGeneric(condition);
				if (result == null) result = caseAction(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.ASSIGNEMT: {
				Assignemt assignemt = (Assignemt)theEObject;
				T result = caseAssignemt(assignemt);
				if (result == null) result = caseGeneric(assignemt);
				if (result == null) result = caseAction(assignemt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.PRINT: {
				Print print = (Print)theEObject;
				T result = casePrint(print);
				if (result == null) result = caseGeneric(print);
				if (result == null) result = caseAction(print);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.ERROR: {
				org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Error error = (org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Error)theEObject;
				T result = caseError(error);
				if (result == null) result = caseGeneric(error);
				if (result == null) result = caseAction(error);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.FUNCTION_CALL: {
				FunctionCall functionCall = (FunctionCall)theEObject;
				T result = caseFunctionCall(functionCall);
				if (result == null) result = caseGeneric(functionCall);
				if (result == null) result = caseAction(functionCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSoftwarePackage.MQTT_PORT: {
				MQTTPort mqttPort = (MQTTPort)theEObject;
				T result = caseMQTTPort(mqttPort);
				if (result == null) result = caseIoTPort(mqttPort);
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
	 * Returns the result of interpreting the object as an instance of '<em>Payload Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payload Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePayloadParameters(PayloadParameters object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalEvent(InternalEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSend(Send object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Condition Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionEvent(ConditionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuard(Guard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneric(Generic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Board</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Board</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualBoard(VirtualBoard object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>SYSTEM Sw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SYSTEM Sw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSYSTEM_Sw(SYSTEM_Sw object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternal(External object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoop(Loop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignemt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignemt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignemt(Assignemt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Print</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Print</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrint(Print object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseError(org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Error object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionCall(FunctionCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MQTT Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MQTT Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMQTTPort(MQTTPort object) {
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
