/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.*;

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
			case CHESSIoTSoftwarePackage.MESSAGE_PARAMETERS: return createMessageParameters();
			case CHESSIoTSoftwarePackage.STATE_MACHINE: return createStateMachine();
			case CHESSIoTSoftwarePackage.REGION: return createRegion();
			case CHESSIoTSoftwarePackage.IO_TSTATE: return createIoTState();
			case CHESSIoTSoftwarePackage.IO_TEVENT: return createIoTEvent();
			case CHESSIoTSoftwarePackage.INCOMING_EVENT: return createIncomingEvent();
			case CHESSIoTSoftwarePackage.RECEIVE_PAYLOAD: return createReceivePayload();
			case CHESSIoTSoftwarePackage.IO_TACTION: return createIoTAction();
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT: return createOutgoingEvent();
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD: return createSendPayload();
			case CHESSIoTSoftwarePackage.STATE_TRANSITION: return createStateTransition();
			case CHESSIoTSoftwarePackage.GENERIC_EVENT: return createGenericEvent();
			case CHESSIoTSoftwarePackage.GENERIC_IO_TACTION: return createGenericIoTAction();
			case CHESSIoTSoftwarePackage.VITUAL_COMPUTING_NODE: return createVitualComputingNode();
			case CHESSIoTSoftwarePackage.SENSOR: return createSensor();
			case CHESSIoTSoftwarePackage.ACTUATOR: return createActuator();
			case CHESSIoTSoftwarePackage.SYSTEM: return createSYSTEM();
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
			case CHESSIoTSoftwarePackage.PAYLOAD_TYPE:
				return createPayloadTypeFromString(eDataType, initialValue);
			case CHESSIoTSoftwarePackage.GENERIC_ACT_IO_TYPE:
				return createGenericActIoTypeFromString(eDataType, initialValue);
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
			case CHESSIoTSoftwarePackage.PAYLOAD_TYPE:
				return convertPayloadTypeToString(eDataType, instanceValue);
			case CHESSIoTSoftwarePackage.GENERIC_ACT_IO_TYPE:
				return convertGenericActIoTypeToString(eDataType, instanceValue);
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
	public MessageParameters createMessageParameters() {
		MessageParametersImpl messageParameters = new MessageParametersImpl();
		return messageParameters;
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
	public Region createRegion() {
		RegionImpl region = new RegionImpl();
		return region;
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
	public IoTEvent createIoTEvent() {
		IoTEventImpl ioTEvent = new IoTEventImpl();
		return ioTEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncomingEvent createIncomingEvent() {
		IncomingEventImpl incomingEvent = new IncomingEventImpl();
		return incomingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceivePayload createReceivePayload() {
		ReceivePayloadImpl receivePayload = new ReceivePayloadImpl();
		return receivePayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTAction createIoTAction() {
		IoTActionImpl ioTAction = new IoTActionImpl();
		return ioTAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutgoingEvent createOutgoingEvent() {
		OutgoingEventImpl outgoingEvent = new OutgoingEventImpl();
		return outgoingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendPayload createSendPayload() {
		SendPayloadImpl sendPayload = new SendPayloadImpl();
		return sendPayload;
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
	public GenericEvent createGenericEvent() {
		GenericEventImpl genericEvent = new GenericEventImpl();
		return genericEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericIoTAction createGenericIoTAction() {
		GenericIoTActionImpl genericIoTAction = new GenericIoTActionImpl();
		return genericIoTAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitualComputingNode createVitualComputingNode() {
		VitualComputingNodeImpl vitualComputingNode = new VitualComputingNodeImpl();
		return vitualComputingNode;
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
	public SYSTEM createSYSTEM() {
		SYSTEMImpl system = new SYSTEMImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayloadType createPayloadTypeFromString(EDataType eDataType, String initialValue) {
		PayloadType result = PayloadType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPayloadTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericActIoType createGenericActIoTypeFromString(EDataType eDataType, String initialValue) {
		GenericActIoType result = GenericActIoType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenericActIoTypeToString(EDataType eDataType, Object instanceValue) {
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
