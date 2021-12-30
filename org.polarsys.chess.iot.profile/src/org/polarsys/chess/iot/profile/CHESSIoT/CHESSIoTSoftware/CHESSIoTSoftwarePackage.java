/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwareFactory
 * @model kind="package"
 * @generated
 */
public interface CHESSIoTSoftwarePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CHESSIoTSoftware";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///CHESSIoT/CHESSIoTSoftware.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CHESSIoT.CHESSIoTSoftware";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CHESSIoTSoftwarePackage eINSTANCE = org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualEntityImpl <em>Virtual Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualEntityImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getVirtualEntity()
	 * @generated
	 */
	int VIRTUAL_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ENTITY__BASE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Virtualentity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ENTITY__VIRTUALENTITY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ENTITY__ID = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ENTITY__NAME = 3;

	/**
	 * The number of structural features of the '<em>Virtual Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ENTITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Virtual Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualElementImpl <em>Virtual Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualElementImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getVirtualElement()
	 * @generated
	 */
	int VIRTUAL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ELEMENT__BASE_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Virtualelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ELEMENT__VIRTUALELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Virtualentity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ELEMENT__VIRTUALENTITY = 4;

	/**
	 * The feature id for the '<em><b>Iotport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ELEMENT__IOTPORT = 5;

	/**
	 * The feature id for the '<em><b>Iotstate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ELEMENT__IOTSTATE = 6;

	/**
	 * The number of structural features of the '<em>Virtual Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ELEMENT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Virtual Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTPortImpl <em>Io TPort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTPortImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getIoTPort()
	 * @generated
	 */
	int IO_TPORT = 2;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TPORT__BASE_PORT = 0;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TPORT__PIN = 1;

	/**
	 * The feature id for the '<em><b>Sends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TPORT__SENDS = 2;

	/**
	 * The feature id for the '<em><b>Receives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TPORT__RECEIVES = 3;

	/**
	 * The number of structural features of the '<em>Io TPort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TPORT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Io TPort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.PayloadImpl <em>Payload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.PayloadImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getPayload()
	 * @generated
	 */
	int PAYLOAD = 3;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Have</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__HAVE = 1;

	/**
	 * The feature id for the '<em><b>Payload Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__PAYLOAD_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.MessageParametersImpl <em>Message Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.MessageParametersImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getMessageParameters()
	 * @generated
	 */
	int MESSAGE_PARAMETERS = 4;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PARAMETERS__BASE_PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Message Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PARAMETERS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Message Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.StateMachineImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getStateMachine()
	 * @generated
	 */
	int STATE_MACHINE = 5;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__REGION = 0;

	/**
	 * The feature id for the '<em><b>Base State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__BASE_STATE_MACHINE = 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.RegionImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 6;

	/**
	 * The feature id for the '<em><b>Iotstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__IOTSTATE = 0;

	/**
	 * The feature id for the '<em><b>Base Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__BASE_REGION = 1;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTStateImpl <em>Io TState</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTStateImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getIoTState()
	 * @generated
	 */
	int IO_TSTATE = 7;

	/**
	 * The feature id for the '<em><b>Base State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TSTATE__BASE_STATE = 0;

	/**
	 * The feature id for the '<em><b>Iotevent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TSTATE__IOTEVENT = 1;

	/**
	 * The number of structural features of the '<em>Io TState</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TSTATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Io TState</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TSTATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTEventImpl <em>Io TEvent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTEventImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getIoTEvent()
	 * @generated
	 */
	int IO_TEVENT = 8;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TEVENT__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Io TEvent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TEVENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Io TEvent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TEVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IncomingEventImpl <em>Incoming Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IncomingEventImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getIncomingEvent()
	 * @generated
	 */
	int INCOMING_EVENT = 9;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_EVENT__BASE_CLASS = IO_TEVENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Receivepayload</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_EVENT__RECEIVEPAYLOAD = IO_TEVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoingevent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_EVENT__OUTGOINGEVENT = IO_TEVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Incoming Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_EVENT_FEATURE_COUNT = IO_TEVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Incoming Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_EVENT_OPERATION_COUNT = IO_TEVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTActionImpl <em>Io TAction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTActionImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getIoTAction()
	 * @generated
	 */
	int IO_TACTION = 11;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TACTION__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Io TAction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Io TAction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.ReceivePayloadImpl <em>Receive Payload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.ReceivePayloadImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getReceivePayload()
	 * @generated
	 */
	int RECEIVE_PAYLOAD = 10;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_PAYLOAD__BASE_CLASS = IO_TACTION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Iotport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_PAYLOAD__IOTPORT = IO_TACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_PAYLOAD__PAYLOAD = IO_TACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Receive Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_PAYLOAD_FEATURE_COUNT = IO_TACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Receive Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_PAYLOAD_OPERATION_COUNT = IO_TACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.OutgoingEventImpl <em>Outgoing Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.OutgoingEventImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getOutgoingEvent()
	 * @generated
	 */
	int OUTGOING_EVENT = 12;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_EVENT__BASE_CLASS = IO_TEVENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Periodic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_EVENT__IS_PERIODIC = IO_TEVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_EVENT__TIME_INTERVAL = IO_TEVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sendpayload</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_EVENT__SENDPAYLOAD = IO_TEVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Incomingevent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_EVENT__INCOMINGEVENT = IO_TEVENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Outgoing Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_EVENT_FEATURE_COUNT = IO_TEVENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Outgoing Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_EVENT_OPERATION_COUNT = IO_TEVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SendPayloadImpl <em>Send Payload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SendPayloadImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getSendPayload()
	 * @generated
	 */
	int SEND_PAYLOAD = 13;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_PAYLOAD__BASE_CLASS = IO_TACTION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_PAYLOAD__PAYLOAD = IO_TACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iotport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_PAYLOAD__IOTPORT = IO_TACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Send Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_PAYLOAD_FEATURE_COUNT = IO_TACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Send Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_PAYLOAD_OPERATION_COUNT = IO_TACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.StateTransitionImpl <em>State Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.StateTransitionImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getStateTransition()
	 * @generated
	 */
	int STATE_TRANSITION = 14;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Base Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION__BASE_TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Iotstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION__IOTSTATE = 2;

	/**
	 * The number of structural features of the '<em>State Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>State Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.GenericEventImpl <em>Generic Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.GenericEventImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getGenericEvent()
	 * @generated
	 */
	int GENERIC_EVENT = 15;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EVENT__BASE_CLASS = IO_TEVENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Periodic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EVENT__IS_PERIODIC = IO_TEVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EVENT__TIME_INTERVAL = IO_TEVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EVENT_FEATURE_COUNT = IO_TEVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Generic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_EVENT_OPERATION_COUNT = IO_TEVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.GenericIoTActionImpl <em>Generic Io TAction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.GenericIoTActionImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getGenericIoTAction()
	 * @generated
	 */
	int GENERIC_IO_TACTION = 16;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_IO_TACTION__BASE_CLASS = IO_TACTION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_IO_TACTION__ACTION_NAME = IO_TACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_IO_TACTION__ACTION_TYPE = IO_TACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generic Io TAction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_IO_TACTION_FEATURE_COUNT = IO_TACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Generic Io TAction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_IO_TACTION_OPERATION_COUNT = IO_TACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VitualComputingNodeImpl <em>Vitual Computing Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VitualComputingNodeImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getVitualComputingNode()
	 * @generated
	 */
	int VITUAL_COMPUTING_NODE = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITUAL_COMPUTING_NODE__ID = VIRTUAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITUAL_COMPUTING_NODE__NAME = VIRTUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITUAL_COMPUTING_NODE__BASE_COMPONENT = VIRTUAL_ELEMENT__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Virtualelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITUAL_COMPUTING_NODE__VIRTUALELEMENT = VIRTUAL_ELEMENT__VIRTUALELEMENT;

	/**
	 * The feature id for the '<em><b>Virtualentity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITUAL_COMPUTING_NODE__VIRTUALENTITY = VIRTUAL_ELEMENT__VIRTUALENTITY;

	/**
	 * The feature id for the '<em><b>Iotport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITUAL_COMPUTING_NODE__IOTPORT = VIRTUAL_ELEMENT__IOTPORT;

	/**
	 * The feature id for the '<em><b>Iotstate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITUAL_COMPUTING_NODE__IOTSTATE = VIRTUAL_ELEMENT__IOTSTATE;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITUAL_COMPUTING_NODE__SENSOR = VIRTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actuator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITUAL_COMPUTING_NODE__ACTUATOR = VIRTUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Vitual Computing Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITUAL_COMPUTING_NODE_FEATURE_COUNT = VIRTUAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Vitual Computing Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VITUAL_COMPUTING_NODE_OPERATION_COUNT = VIRTUAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SensorImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ID = VIRTUAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = VIRTUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__BASE_COMPONENT = VIRTUAL_ELEMENT__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Virtualelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__VIRTUALELEMENT = VIRTUAL_ELEMENT__VIRTUALELEMENT;

	/**
	 * The feature id for the '<em><b>Virtualentity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__VIRTUALENTITY = VIRTUAL_ELEMENT__VIRTUALENTITY;

	/**
	 * The feature id for the '<em><b>Iotport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__IOTPORT = VIRTUAL_ELEMENT__IOTPORT;

	/**
	 * The feature id for the '<em><b>Iotstate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__IOTSTATE = VIRTUAL_ELEMENT__IOTSTATE;

	/**
	 * The feature id for the '<em><b>Computingnode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__COMPUTINGNODE = VIRTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = VIRTUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = VIRTUAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.ActuatorImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ID = VIRTUAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = VIRTUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__BASE_COMPONENT = VIRTUAL_ELEMENT__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Virtualelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__VIRTUALELEMENT = VIRTUAL_ELEMENT__VIRTUALELEMENT;

	/**
	 * The feature id for the '<em><b>Virtualentity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__VIRTUALENTITY = VIRTUAL_ELEMENT__VIRTUALENTITY;

	/**
	 * The feature id for the '<em><b>Iotport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__IOTPORT = VIRTUAL_ELEMENT__IOTPORT;

	/**
	 * The feature id for the '<em><b>Iotstate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__IOTSTATE = VIRTUAL_ELEMENT__IOTSTATE;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = VIRTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = VIRTUAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SYSTEMImpl <em>SYSTEM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SYSTEMImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getSYSTEM()
	 * @generated
	 */
	int SYSTEM = 20;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__BASE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Virtualentity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__VIRTUALENTITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 2;

	/**
	 * The number of structural features of the '<em>SYSTEM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>SYSTEM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.PayloadType <em>Payload Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.PayloadType
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getPayloadType()
	 * @generated
	 */
	int PAYLOAD_TYPE = 21;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericActIoType <em>Generic Act Io Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericActIoType
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getGenericActIoType()
	 * @generated
	 */
	int GENERIC_ACT_IO_TYPE = 22;


	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity <em>Virtual Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Entity</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity
	 * @generated
	 */
	EClass getVirtualEntity();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity#getBase_Component()
	 * @see #getVirtualEntity()
	 * @generated
	 */
	EReference getVirtualEntity_Base_Component();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity#getVirtualentity <em>Virtualentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Virtualentity</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity#getVirtualentity()
	 * @see #getVirtualEntity()
	 * @generated
	 */
	EReference getVirtualEntity_Virtualentity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity#getId()
	 * @see #getVirtualEntity()
	 * @generated
	 */
	EAttribute getVirtualEntity_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity#getName()
	 * @see #getVirtualEntity()
	 * @generated
	 */
	EAttribute getVirtualEntity_Name();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualElement <em>Virtual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Element</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualElement
	 * @generated
	 */
	EClass getVirtualElement();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualElement#getId()
	 * @see #getVirtualElement()
	 * @generated
	 */
	EAttribute getVirtualElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualElement#getName()
	 * @see #getVirtualElement()
	 * @generated
	 */
	EAttribute getVirtualElement_Name();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualElement#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualElement#getBase_Component()
	 * @see #getVirtualElement()
	 * @generated
	 */
	EReference getVirtualElement_Base_Component();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualElement#getVirtualelement <em>Virtualelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Virtualelement</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualElement#getVirtualelement()
	 * @see #getVirtualElement()
	 * @generated
	 */
	EReference getVirtualElement_Virtualelement();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualElement#getVirtualentity <em>Virtualentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Virtualentity</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualElement#getVirtualentity()
	 * @see #getVirtualElement()
	 * @generated
	 */
	EReference getVirtualElement_Virtualentity();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualElement#getIotport <em>Iotport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iotport</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualElement#getIotport()
	 * @see #getVirtualElement()
	 * @generated
	 */
	EReference getVirtualElement_Iotport();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualElement#getIotstate <em>Iotstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iotstate</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualElement#getIotstate()
	 * @see #getVirtualElement()
	 * @generated
	 */
	EReference getVirtualElement_Iotstate();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTPort <em>Io TPort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io TPort</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTPort
	 * @generated
	 */
	EClass getIoTPort();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTPort#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTPort#getBase_Port()
	 * @see #getIoTPort()
	 * @generated
	 */
	EReference getIoTPort_Base_Port();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTPort#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Pin</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTPort#getPin()
	 * @see #getIoTPort()
	 * @generated
	 */
	EAttribute getIoTPort_Pin();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTPort#getSends <em>Sends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sends</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTPort#getSends()
	 * @see #getIoTPort()
	 * @generated
	 */
	EReference getIoTPort_Sends();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTPort#getReceives <em>Receives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receives</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTPort#getReceives()
	 * @see #getIoTPort()
	 * @generated
	 */
	EReference getIoTPort_Receives();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload <em>Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payload</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload
	 * @generated
	 */
	EClass getPayload();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload#getBase_Class()
	 * @see #getPayload()
	 * @generated
	 */
	EReference getPayload_Base_Class();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload#getHave <em>Have</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Have</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload#getHave()
	 * @see #getPayload()
	 * @generated
	 */
	EReference getPayload_Have();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload#getPayloadType <em>Payload Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payload Type</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload#getPayloadType()
	 * @see #getPayload()
	 * @generated
	 */
	EAttribute getPayload_PayloadType();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.MessageParameters <em>Message Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Parameters</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.MessageParameters
	 * @generated
	 */
	EClass getMessageParameters();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.MessageParameters#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.MessageParameters#getBase_Property()
	 * @see #getMessageParameters()
	 * @generated
	 */
	EReference getMessageParameters_Base_Property();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateMachine#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Region</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateMachine#getRegion()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Region();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateMachine#getBase_StateMachine <em>Base State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base State Machine</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateMachine#getBase_StateMachine()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Base_StateMachine();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Region#getIotstate <em>Iotstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Iotstate</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Region#getIotstate()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Iotstate();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Region#getBase_Region <em>Base Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Region</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Region#getBase_Region()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Base_Region();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState <em>Io TState</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io TState</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState
	 * @generated
	 */
	EClass getIoTState();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState#getBase_State <em>Base State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base State</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState#getBase_State()
	 * @see #getIoTState()
	 * @generated
	 */
	EReference getIoTState_Base_State();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState#getIotevent <em>Iotevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iotevent</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState#getIotevent()
	 * @see #getIoTState()
	 * @generated
	 */
	EReference getIoTState_Iotevent();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTEvent <em>Io TEvent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io TEvent</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTEvent
	 * @generated
	 */
	EClass getIoTEvent();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTEvent#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTEvent#getBase_Class()
	 * @see #getIoTEvent()
	 * @generated
	 */
	EReference getIoTEvent_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent <em>Incoming Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incoming Event</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent
	 * @generated
	 */
	EClass getIncomingEvent();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent#getReceivepayload <em>Receivepayload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receivepayload</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent#getReceivepayload()
	 * @see #getIncomingEvent()
	 * @generated
	 */
	EReference getIncomingEvent_Receivepayload();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent#getOutgoingevent <em>Outgoingevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outgoingevent</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent#getOutgoingevent()
	 * @see #getIncomingEvent()
	 * @generated
	 */
	EReference getIncomingEvent_Outgoingevent();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.ReceivePayload <em>Receive Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive Payload</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.ReceivePayload
	 * @generated
	 */
	EClass getReceivePayload();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.ReceivePayload#getIotport <em>Iotport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Iotport</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.ReceivePayload#getIotport()
	 * @see #getReceivePayload()
	 * @generated
	 */
	EReference getReceivePayload_Iotport();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.ReceivePayload#getPayload <em>Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payload</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.ReceivePayload#getPayload()
	 * @see #getReceivePayload()
	 * @generated
	 */
	EReference getReceivePayload_Payload();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTAction <em>Io TAction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io TAction</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTAction
	 * @generated
	 */
	EClass getIoTAction();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTAction#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTAction#getBase_Class()
	 * @see #getIoTAction()
	 * @generated
	 */
	EReference getIoTAction_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent <em>Outgoing Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outgoing Event</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent
	 * @generated
	 */
	EClass getOutgoingEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent#isPeriodic <em>Is Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Periodic</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent#isPeriodic()
	 * @see #getOutgoingEvent()
	 * @generated
	 */
	EAttribute getOutgoingEvent_IsPeriodic();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent#getTimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Interval</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent#getTimeInterval()
	 * @see #getOutgoingEvent()
	 * @generated
	 */
	EAttribute getOutgoingEvent_TimeInterval();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent#getSendpayload <em>Sendpayload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sendpayload</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent#getSendpayload()
	 * @see #getOutgoingEvent()
	 * @generated
	 */
	EReference getOutgoingEvent_Sendpayload();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent#getIncomingevent <em>Incomingevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incomingevent</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent#getIncomingevent()
	 * @see #getOutgoingEvent()
	 * @generated
	 */
	EReference getOutgoingEvent_Incomingevent();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload <em>Send Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Payload</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload
	 * @generated
	 */
	EClass getSendPayload();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload#getPayload <em>Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Payload</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload#getPayload()
	 * @see #getSendPayload()
	 * @generated
	 */
	EReference getSendPayload_Payload();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload#getIotport <em>Iotport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Iotport</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload#getIotport()
	 * @see #getSendPayload()
	 * @generated
	 */
	EReference getSendPayload_Iotport();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition <em>State Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Transition</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition
	 * @generated
	 */
	EClass getStateTransition();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition#getCondition()
	 * @see #getStateTransition()
	 * @generated
	 */
	EAttribute getStateTransition_Condition();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition#getBase_Transition <em>Base Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Transition</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition#getBase_Transition()
	 * @see #getStateTransition()
	 * @generated
	 */
	EReference getStateTransition_Base_Transition();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition#getIotstate <em>Iotstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Iotstate</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition#getIotstate()
	 * @see #getStateTransition()
	 * @generated
	 */
	EReference getStateTransition_Iotstate();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericEvent <em>Generic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Event</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericEvent
	 * @generated
	 */
	EClass getGenericEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericEvent#isPeriodic <em>Is Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Periodic</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericEvent#isPeriodic()
	 * @see #getGenericEvent()
	 * @generated
	 */
	EAttribute getGenericEvent_IsPeriodic();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericEvent#getTimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Interval</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericEvent#getTimeInterval()
	 * @see #getGenericEvent()
	 * @generated
	 */
	EAttribute getGenericEvent_TimeInterval();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericIoTAction <em>Generic Io TAction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Io TAction</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericIoTAction
	 * @generated
	 */
	EClass getGenericIoTAction();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericIoTAction#getActionName <em>Action Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Name</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericIoTAction#getActionName()
	 * @see #getGenericIoTAction()
	 * @generated
	 */
	EAttribute getGenericIoTAction_ActionName();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericIoTAction#getActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Type</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericIoTAction#getActionType()
	 * @see #getGenericIoTAction()
	 * @generated
	 */
	EAttribute getGenericIoTAction_ActionType();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VitualComputingNode <em>Vitual Computing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vitual Computing Node</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VitualComputingNode
	 * @generated
	 */
	EClass getVitualComputingNode();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VitualComputingNode#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sensor</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VitualComputingNode#getSensor()
	 * @see #getVitualComputingNode()
	 * @generated
	 */
	EReference getVitualComputingNode_Sensor();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VitualComputingNode#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actuator</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VitualComputingNode#getActuator()
	 * @see #getVitualComputingNode()
	 * @generated
	 */
	EReference getVitualComputingNode_Actuator();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Sensor#getComputingnode <em>Computingnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Computingnode</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Sensor#getComputingnode()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Computingnode();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SYSTEM <em>SYSTEM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SYSTEM</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SYSTEM
	 * @generated
	 */
	EClass getSYSTEM();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SYSTEM#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SYSTEM#getBase_Component()
	 * @see #getSYSTEM()
	 * @generated
	 */
	EReference getSYSTEM_Base_Component();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SYSTEM#getVirtualentity <em>Virtualentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Virtualentity</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SYSTEM#getVirtualentity()
	 * @see #getSYSTEM()
	 * @generated
	 */
	EReference getSYSTEM_Virtualentity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SYSTEM#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SYSTEM#getName()
	 * @see #getSYSTEM()
	 * @generated
	 */
	EAttribute getSYSTEM_Name();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.PayloadType <em>Payload Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payload Type</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.PayloadType
	 * @generated
	 */
	EEnum getPayloadType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericActIoType <em>Generic Act Io Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generic Act Io Type</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericActIoType
	 * @generated
	 */
	EEnum getGenericActIoType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CHESSIoTSoftwareFactory getCHESSIoTSoftwareFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualEntityImpl <em>Virtual Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualEntityImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getVirtualEntity()
		 * @generated
		 */
		EClass VIRTUAL_ENTITY = eINSTANCE.getVirtualEntity();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_ENTITY__BASE_COMPONENT = eINSTANCE.getVirtualEntity_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Virtualentity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_ENTITY__VIRTUALENTITY = eINSTANCE.getVirtualEntity_Virtualentity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_ENTITY__ID = eINSTANCE.getVirtualEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_ENTITY__NAME = eINSTANCE.getVirtualEntity_Name();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualElementImpl <em>Virtual Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualElementImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getVirtualElement()
		 * @generated
		 */
		EClass VIRTUAL_ELEMENT = eINSTANCE.getVirtualElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_ELEMENT__ID = eINSTANCE.getVirtualElement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_ELEMENT__NAME = eINSTANCE.getVirtualElement_Name();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_ELEMENT__BASE_COMPONENT = eINSTANCE.getVirtualElement_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Virtualelement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_ELEMENT__VIRTUALELEMENT = eINSTANCE.getVirtualElement_Virtualelement();

		/**
		 * The meta object literal for the '<em><b>Virtualentity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_ELEMENT__VIRTUALENTITY = eINSTANCE.getVirtualElement_Virtualentity();

		/**
		 * The meta object literal for the '<em><b>Iotport</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_ELEMENT__IOTPORT = eINSTANCE.getVirtualElement_Iotport();

		/**
		 * The meta object literal for the '<em><b>Iotstate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_ELEMENT__IOTSTATE = eINSTANCE.getVirtualElement_Iotstate();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTPortImpl <em>Io TPort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTPortImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getIoTPort()
		 * @generated
		 */
		EClass IO_TPORT = eINSTANCE.getIoTPort();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_TPORT__BASE_PORT = eINSTANCE.getIoTPort_Base_Port();

		/**
		 * The meta object literal for the '<em><b>Pin</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_TPORT__PIN = eINSTANCE.getIoTPort_Pin();

		/**
		 * The meta object literal for the '<em><b>Sends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_TPORT__SENDS = eINSTANCE.getIoTPort_Sends();

		/**
		 * The meta object literal for the '<em><b>Receives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_TPORT__RECEIVES = eINSTANCE.getIoTPort_Receives();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.PayloadImpl <em>Payload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.PayloadImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getPayload()
		 * @generated
		 */
		EClass PAYLOAD = eINSTANCE.getPayload();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYLOAD__BASE_CLASS = eINSTANCE.getPayload_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Have</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYLOAD__HAVE = eINSTANCE.getPayload_Have();

		/**
		 * The meta object literal for the '<em><b>Payload Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYLOAD__PAYLOAD_TYPE = eINSTANCE.getPayload_PayloadType();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.MessageParametersImpl <em>Message Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.MessageParametersImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getMessageParameters()
		 * @generated
		 */
		EClass MESSAGE_PARAMETERS = eINSTANCE.getMessageParameters();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_PARAMETERS__BASE_PROPERTY = eINSTANCE.getMessageParameters_Base_Property();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.StateMachineImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__REGION = eINSTANCE.getStateMachine_Region();

		/**
		 * The meta object literal for the '<em><b>Base State Machine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__BASE_STATE_MACHINE = eINSTANCE.getStateMachine_Base_StateMachine();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.RegionImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Iotstate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__IOTSTATE = eINSTANCE.getRegion_Iotstate();

		/**
		 * The meta object literal for the '<em><b>Base Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__BASE_REGION = eINSTANCE.getRegion_Base_Region();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTStateImpl <em>Io TState</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTStateImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getIoTState()
		 * @generated
		 */
		EClass IO_TSTATE = eINSTANCE.getIoTState();

		/**
		 * The meta object literal for the '<em><b>Base State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_TSTATE__BASE_STATE = eINSTANCE.getIoTState_Base_State();

		/**
		 * The meta object literal for the '<em><b>Iotevent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_TSTATE__IOTEVENT = eINSTANCE.getIoTState_Iotevent();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTEventImpl <em>Io TEvent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTEventImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getIoTEvent()
		 * @generated
		 */
		EClass IO_TEVENT = eINSTANCE.getIoTEvent();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_TEVENT__BASE_CLASS = eINSTANCE.getIoTEvent_Base_Class();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IncomingEventImpl <em>Incoming Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IncomingEventImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getIncomingEvent()
		 * @generated
		 */
		EClass INCOMING_EVENT = eINSTANCE.getIncomingEvent();

		/**
		 * The meta object literal for the '<em><b>Receivepayload</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOMING_EVENT__RECEIVEPAYLOAD = eINSTANCE.getIncomingEvent_Receivepayload();

		/**
		 * The meta object literal for the '<em><b>Outgoingevent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOMING_EVENT__OUTGOINGEVENT = eINSTANCE.getIncomingEvent_Outgoingevent();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.ReceivePayloadImpl <em>Receive Payload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.ReceivePayloadImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getReceivePayload()
		 * @generated
		 */
		EClass RECEIVE_PAYLOAD = eINSTANCE.getReceivePayload();

		/**
		 * The meta object literal for the '<em><b>Iotport</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_PAYLOAD__IOTPORT = eINSTANCE.getReceivePayload_Iotport();

		/**
		 * The meta object literal for the '<em><b>Payload</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_PAYLOAD__PAYLOAD = eINSTANCE.getReceivePayload_Payload();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTActionImpl <em>Io TAction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTActionImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getIoTAction()
		 * @generated
		 */
		EClass IO_TACTION = eINSTANCE.getIoTAction();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_TACTION__BASE_CLASS = eINSTANCE.getIoTAction_Base_Class();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.OutgoingEventImpl <em>Outgoing Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.OutgoingEventImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getOutgoingEvent()
		 * @generated
		 */
		EClass OUTGOING_EVENT = eINSTANCE.getOutgoingEvent();

		/**
		 * The meta object literal for the '<em><b>Is Periodic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTGOING_EVENT__IS_PERIODIC = eINSTANCE.getOutgoingEvent_IsPeriodic();

		/**
		 * The meta object literal for the '<em><b>Time Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTGOING_EVENT__TIME_INTERVAL = eINSTANCE.getOutgoingEvent_TimeInterval();

		/**
		 * The meta object literal for the '<em><b>Sendpayload</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTGOING_EVENT__SENDPAYLOAD = eINSTANCE.getOutgoingEvent_Sendpayload();

		/**
		 * The meta object literal for the '<em><b>Incomingevent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTGOING_EVENT__INCOMINGEVENT = eINSTANCE.getOutgoingEvent_Incomingevent();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SendPayloadImpl <em>Send Payload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SendPayloadImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getSendPayload()
		 * @generated
		 */
		EClass SEND_PAYLOAD = eINSTANCE.getSendPayload();

		/**
		 * The meta object literal for the '<em><b>Payload</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_PAYLOAD__PAYLOAD = eINSTANCE.getSendPayload_Payload();

		/**
		 * The meta object literal for the '<em><b>Iotport</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_PAYLOAD__IOTPORT = eINSTANCE.getSendPayload_Iotport();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.StateTransitionImpl <em>State Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.StateTransitionImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getStateTransition()
		 * @generated
		 */
		EClass STATE_TRANSITION = eINSTANCE.getStateTransition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_TRANSITION__CONDITION = eINSTANCE.getStateTransition_Condition();

		/**
		 * The meta object literal for the '<em><b>Base Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_TRANSITION__BASE_TRANSITION = eINSTANCE.getStateTransition_Base_Transition();

		/**
		 * The meta object literal for the '<em><b>Iotstate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_TRANSITION__IOTSTATE = eINSTANCE.getStateTransition_Iotstate();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.GenericEventImpl <em>Generic Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.GenericEventImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getGenericEvent()
		 * @generated
		 */
		EClass GENERIC_EVENT = eINSTANCE.getGenericEvent();

		/**
		 * The meta object literal for the '<em><b>Is Periodic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_EVENT__IS_PERIODIC = eINSTANCE.getGenericEvent_IsPeriodic();

		/**
		 * The meta object literal for the '<em><b>Time Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_EVENT__TIME_INTERVAL = eINSTANCE.getGenericEvent_TimeInterval();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.GenericIoTActionImpl <em>Generic Io TAction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.GenericIoTActionImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getGenericIoTAction()
		 * @generated
		 */
		EClass GENERIC_IO_TACTION = eINSTANCE.getGenericIoTAction();

		/**
		 * The meta object literal for the '<em><b>Action Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_IO_TACTION__ACTION_NAME = eINSTANCE.getGenericIoTAction_ActionName();

		/**
		 * The meta object literal for the '<em><b>Action Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_IO_TACTION__ACTION_TYPE = eINSTANCE.getGenericIoTAction_ActionType();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VitualComputingNodeImpl <em>Vitual Computing Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VitualComputingNodeImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getVitualComputingNode()
		 * @generated
		 */
		EClass VITUAL_COMPUTING_NODE = eINSTANCE.getVitualComputingNode();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VITUAL_COMPUTING_NODE__SENSOR = eINSTANCE.getVitualComputingNode_Sensor();

		/**
		 * The meta object literal for the '<em><b>Actuator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VITUAL_COMPUTING_NODE__ACTUATOR = eINSTANCE.getVitualComputingNode_Actuator();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SensorImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Computingnode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__COMPUTINGNODE = eINSTANCE.getSensor_Computingnode();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.ActuatorImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SYSTEMImpl <em>SYSTEM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SYSTEMImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getSYSTEM()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSYSTEM();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__BASE_COMPONENT = eINSTANCE.getSYSTEM_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Virtualentity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__VIRTUALENTITY = eINSTANCE.getSYSTEM_Virtualentity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSYSTEM_Name();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.PayloadType <em>Payload Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.PayloadType
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getPayloadType()
		 * @generated
		 */
		EEnum PAYLOAD_TYPE = eINSTANCE.getPayloadType();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericActIoType <em>Generic Act Io Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericActIoType
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl#getGenericActIoType()
		 * @generated
		 */
		EEnum GENERIC_ACT_IO_TYPE = eINSTANCE.getGenericActIoType();

	}

} //CHESSIoTSoftwarePackage
