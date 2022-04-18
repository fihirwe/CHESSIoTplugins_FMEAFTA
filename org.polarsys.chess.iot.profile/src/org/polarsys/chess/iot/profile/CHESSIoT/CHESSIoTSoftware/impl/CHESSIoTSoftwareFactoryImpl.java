/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.AccessMode;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Action;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Actuator;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Assignemt;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwareFactory;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CHESSIoTSoftwareFactoryImpl extends EFactoryImpl implements CHESSIoTSoftwareFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CHESSIoTSoftwareFactory init() {
		try {
			CHESSIoTSoftwareFactory theCHESSIoTSoftwareFactory = (CHESSIoTSoftwareFactory)EPackage.Registry.INSTANCE.getEFactory(CHESSIoTSoftwarePackage.eNS_URI);
			if (theCHESSIoTSoftwareFactory != null) {
				return theCHESSIoTSoftwareFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CHESSIoTSoftwareFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTSoftwareFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CHESSIoTSoftwarePackage.VIRTUAL_ENTITY: return createVirtualEntity();
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT: return createVirtualElement();
			case CHESSIoTSoftwarePackage.IO_TPORT: return createIoTPort();
			case CHESSIoTSoftwarePackage.PAYLOAD: return createPayload();
			case CHESSIoTSoftwarePackage.PAYLOAD_PARAMETERS: return createPayloadParameters();
			case CHESSIoTSoftwarePackage.STATE_MACHINE: return createStateMachine();
			case CHESSIoTSoftwarePackage.IO_TSTATE: return createIoTState();
			case CHESSIoTSoftwarePackage.ACTION: return createAction();
			case CHESSIoTSoftwarePackage.INTERNAL_EVENT: return createInternalEvent();
			case CHESSIoTSoftwarePackage.EVENT: return createEvent();
			case CHESSIoTSoftwarePackage.SEND: return createSend();
			case CHESSIoTSoftwarePackage.STATE_TRANSITION: return createStateTransition();
			case CHESSIoTSoftwarePackage.CONDITION_EVENT: return createConditionEvent();
			case CHESSIoTSoftwarePackage.GUARD: return createGuard();
			case CHESSIoTSoftwarePackage.GENERIC: return createGeneric();
			case CHESSIoTSoftwarePackage.VIRTUAL_BOARD: return createVirtualBoard();
			case CHESSIoTSoftwarePackage.SENSOR: return createSensor();
			case CHESSIoTSoftwarePackage.ACTUATOR: return createActuator();
			case CHESSIoTSoftwarePackage.SYSTEM_SW: return createSYSTEM_Sw();
			case CHESSIoTSoftwarePackage.EXTERNAL: return createExternal();
			case CHESSIoTSoftwarePackage.LOOP: return createLoop();
			case CHESSIoTSoftwarePackage.CONDITION: return createCondition();
			case CHESSIoTSoftwarePackage.ASSIGNEMT: return createAssignemt();
			case CHESSIoTSoftwarePackage.PRINT: return createPrint();
			case CHESSIoTSoftwarePackage.ERROR: return createError();
			case CHESSIoTSoftwarePackage.FUNCTION_CALL: return createFunctionCall();
			case CHESSIoTSoftwarePackage.MQTT_PORT: return createMQTTPort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CHESSIoTSoftwarePackage.ACCESS_MODE:
				return createAccessModeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CHESSIoTSoftwarePackage.ACCESS_MODE:
				return convertAccessModeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualEntity createVirtualEntity() {
		VirtualEntityImpl virtualEntity = new VirtualEntityImpl();
		return virtualEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualElement createVirtualElement() {
		VirtualElementImpl virtualElement = new VirtualElementImpl();
		return virtualElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTPort createIoTPort() {
		IoTPortImpl ioTPort = new IoTPortImpl();
		return ioTPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Payload createPayload() {
		PayloadImpl payload = new PayloadImpl();
		return payload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayloadParameters createPayloadParameters() {
		PayloadParametersImpl payloadParameters = new PayloadParametersImpl();
		return payloadParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine createStateMachine() {
		StateMachineImpl stateMachine = new StateMachineImpl();
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTState createIoTState() {
		IoTStateImpl ioTState = new IoTStateImpl();
		return ioTState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalEvent createInternalEvent() {
		InternalEventImpl internalEvent = new InternalEventImpl();
		return internalEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Send createSend() {
		SendImpl send = new SendImpl();
		return send;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateTransition createStateTransition() {
		StateTransitionImpl stateTransition = new StateTransitionImpl();
		return stateTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionEvent createConditionEvent() {
		ConditionEventImpl conditionEvent = new ConditionEventImpl();
		return conditionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guard createGuard() {
		GuardImpl guard = new GuardImpl();
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generic createGeneric() {
		GenericImpl generic = new GenericImpl();
		return generic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualBoard createVirtualBoard() {
		VirtualBoardImpl virtualBoard = new VirtualBoardImpl();
		return virtualBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator createActuator() {
		ActuatorImpl actuator = new ActuatorImpl();
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SYSTEM_Sw createSYSTEM_Sw() {
		SYSTEM_SwImpl systeM_Sw = new SYSTEM_SwImpl();
		return systeM_Sw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public External createExternal() {
		ExternalImpl external = new ExternalImpl();
		return external;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loop createLoop() {
		LoopImpl loop = new LoopImpl();
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignemt createAssignemt() {
		AssignemtImpl assignemt = new AssignemtImpl();
		return assignemt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Print createPrint() {
		PrintImpl print = new PrintImpl();
		return print;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Error createError() {
		ErrorImpl error = new ErrorImpl();
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionCall createFunctionCall() {
		FunctionCallImpl functionCall = new FunctionCallImpl();
		return functionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MQTTPort createMQTTPort() {
		MQTTPortImpl mqttPort = new MQTTPortImpl();
		return mqttPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessMode createAccessModeFromString(EDataType eDataType, String initialValue) {
		AccessMode result = AccessMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTSoftwarePackage getCHESSIoTSoftwarePackage() {
		return (CHESSIoTSoftwarePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CHESSIoTSoftwarePackage getPackage() {
		return CHESSIoTSoftwarePackage.eINSTANCE;
	}

} //CHESSIoTSoftwareFactoryImpl
