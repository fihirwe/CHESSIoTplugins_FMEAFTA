/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage
 * @generated
 */
public class CHESSIoTSoftwareAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CHESSIoTSoftwarePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTSoftwareAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CHESSIoTSoftwarePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CHESSIoTSoftwareSwitch<Adapter> modelSwitch =
		new CHESSIoTSoftwareSwitch<Adapter>() {
			@Override
			public Adapter caseVirtualEntity(VirtualEntity object) {
				return createVirtualEntityAdapter();
			}
			@Override
			public Adapter caseVirtualElement(VirtualElement object) {
				return createVirtualElementAdapter();
			}
			@Override
			public Adapter caseIoTPort(IoTPort object) {
				return createIoTPortAdapter();
			}
			@Override
			public Adapter casePayload(Payload object) {
				return createPayloadAdapter();
			}
			@Override
			public Adapter casePayloadParameters(PayloadParameters object) {
				return createPayloadParametersAdapter();
			}
			@Override
			public Adapter caseStateMachine(StateMachine object) {
				return createStateMachineAdapter();
			}
			@Override
			public Adapter caseIoTState(IoTState object) {
				return createIoTStateAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseInternalEvent(InternalEvent object) {
				return createInternalEventAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseSend(Send object) {
				return createSendAdapter();
			}
			@Override
			public Adapter caseStateTransition(StateTransition object) {
				return createStateTransitionAdapter();
			}
			@Override
			public Adapter caseConditionEvent(ConditionEvent object) {
				return createConditionEventAdapter();
			}
			@Override
			public Adapter caseGuard(Guard object) {
				return createGuardAdapter();
			}
			@Override
			public Adapter caseGeneric(Generic object) {
				return createGenericAdapter();
			}
			@Override
			public Adapter caseVirtualBoard(VirtualBoard object) {
				return createVirtualBoardAdapter();
			}
			@Override
			public Adapter caseSensor(Sensor object) {
				return createSensorAdapter();
			}
			@Override
			public Adapter caseActuator(Actuator object) {
				return createActuatorAdapter();
			}
			@Override
			public Adapter caseSYSTEM_Sw(SYSTEM_Sw object) {
				return createSYSTEM_SwAdapter();
			}
			@Override
			public Adapter caseExternal(External object) {
				return createExternalAdapter();
			}
			@Override
			public Adapter caseLoop(Loop object) {
				return createLoopAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseAssignemt(Assignemt object) {
				return createAssignemtAdapter();
			}
			@Override
			public Adapter casePrint(Print object) {
				return createPrintAdapter();
			}
			@Override
			public Adapter caseError(org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Error object) {
				return createErrorAdapter();
			}
			@Override
			public Adapter caseFunctionCall(FunctionCall object) {
				return createFunctionCallAdapter();
			}
			@Override
			public Adapter caseMQTTPort(MQTTPort object) {
				return createMQTTPortAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity <em>Virtual Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity
	 * @generated
	 */
	public Adapter createVirtualEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualElement <em>Virtual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualElement
	 * @generated
	 */
	public Adapter createVirtualElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTPort <em>Io TPort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTPort
	 * @generated
	 */
	public Adapter createIoTPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload <em>Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload
	 * @generated
	 */
	public Adapter createPayloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.PayloadParameters <em>Payload Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.PayloadParameters
	 * @generated
	 */
	public Adapter createPayloadParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateMachine
	 * @generated
	 */
	public Adapter createStateMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState <em>Io TState</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState
	 * @generated
	 */
	public Adapter createIoTStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.InternalEvent <em>Internal Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.InternalEvent
	 * @generated
	 */
	public Adapter createInternalEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Send <em>Send</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Send
	 * @generated
	 */
	public Adapter createSendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition <em>State Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition
	 * @generated
	 */
	public Adapter createStateTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.ConditionEvent <em>Condition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.ConditionEvent
	 * @generated
	 */
	public Adapter createConditionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Guard
	 * @generated
	 */
	public Adapter createGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Generic <em>Generic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Generic
	 * @generated
	 */
	public Adapter createGenericAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard <em>Virtual Board</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard
	 * @generated
	 */
	public Adapter createVirtualBoardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Actuator
	 * @generated
	 */
	public Adapter createActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SYSTEM_Sw <em>SYSTEM Sw</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SYSTEM_Sw
	 * @generated
	 */
	public Adapter createSYSTEM_SwAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.External <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.External
	 * @generated
	 */
	public Adapter createExternalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Loop
	 * @generated
	 */
	public Adapter createLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Assignemt <em>Assignemt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Assignemt
	 * @generated
	 */
	public Adapter createAssignemtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Print <em>Print</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Print
	 * @generated
	 */
	public Adapter createPrintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Error <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Error
	 * @generated
	 */
	public Adapter createErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.FunctionCall
	 * @generated
	 */
	public Adapter createFunctionCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.MQTTPort <em>MQTT Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.MQTTPort
	 * @generated
	 */
	public Adapter createMQTTPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CHESSIoTSoftwareAdapterFactory
