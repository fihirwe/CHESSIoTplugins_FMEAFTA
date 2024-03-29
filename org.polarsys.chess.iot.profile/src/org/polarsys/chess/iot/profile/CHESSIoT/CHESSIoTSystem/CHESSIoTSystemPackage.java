/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.papyrus.sysml.blocks.BlocksPackage;

import org.eclipse.papyrus.sysml.portandflows.PortandflowsPackage;

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
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemFactory
 * @model kind="package"
 * @generated
 */
public interface CHESSIoTSystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CHESSIoTSystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///CHESSIoT/CHESSIoTSystem.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CHESSIoT.CHESSIoTSystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CHESSIoTSystemPackage eINSTANCE = org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PhysicalElementImpl <em>Physical Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PhysicalElementImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getPhysicalElement()
	 * @generated
	 */
	int PHYSICAL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ELEMENT__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ELEMENT__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ELEMENT__ID = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ELEMENT__NAME = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Iotport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ELEMENT__IOTPORT = BlocksPackage.BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Physical Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ELEMENT_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Physical Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ELEMENT_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PhysicalBoardImpl <em>Physical Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PhysicalBoardImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getPhysicalBoard()
	 * @generated
	 */
	int PHYSICAL_BOARD = 0;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BOARD__IS_ENCAPSULATED = PHYSICAL_ELEMENT__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BOARD__BASE_CLASS = PHYSICAL_ELEMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BOARD__ID = PHYSICAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BOARD__NAME = PHYSICAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Iotport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BOARD__IOTPORT = PHYSICAL_ELEMENT__IOTPORT;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BOARD__MODEL = PHYSICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BOARD__GATEWAY = PHYSICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actuatingblock</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BOARD__ACTUATINGBLOCK = PHYSICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sensorblock</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BOARD__SENSORBLOCK = PHYSICAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Physicalentity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BOARD__PHYSICALENTITY = PHYSICAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Physical Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BOARD_FEATURE_COUNT = PHYSICAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Physical Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BOARD_OPERATION_COUNT = PHYSICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.IoTPortImpl <em>Io TPort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.IoTPortImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getIoTPort()
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
	int IO_TPORT__BASE_PORT = PortandflowsPackage.FLOW_PORT__BASE_PORT;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TPORT__IS_ATOMIC = PortandflowsPackage.FLOW_PORT__IS_ATOMIC;

	/**
	 * The feature id for the '<em><b>Is Conjugated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TPORT__IS_CONJUGATED = PortandflowsPackage.FLOW_PORT__IS_CONJUGATED;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TPORT__DIRECTION = PortandflowsPackage.FLOW_PORT__DIRECTION;

	/**
	 * The number of structural features of the '<em>Io TPort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TPORT_FEATURE_COUNT = PortandflowsPackage.FLOW_PORT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Icon</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TPORT___GET_ICON = PortandflowsPackage.FLOW_PORT___GET_ICON;

	/**
	 * The number of operations of the '<em>Io TPort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TPORT_OPERATION_COUNT = PortandflowsPackage.FLOW_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.GatewayImpl <em>Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.GatewayImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getGateway()
	 * @generated
	 */
	int GATEWAY = 3;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__IS_ENCAPSULATED = PHYSICAL_ELEMENT__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__BASE_CLASS = PHYSICAL_ELEMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__ID = PHYSICAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__NAME = PHYSICAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Iotport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__IOTPORT = PHYSICAL_ELEMENT__IOTPORT;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__GATEWAY = PHYSICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Server</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__SERVER = PHYSICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Computingboard</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__COMPUTINGBOARD = PHYSICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_FEATURE_COUNT = PHYSICAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_OPERATION_COUNT = PHYSICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ServerImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 4;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Iotport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__IOTPORT = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ActuatingBlockImpl <em>Actuating Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ActuatingBlockImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getActuatingBlock()
	 * @generated
	 */
	int ACTUATING_BLOCK = 5;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATING_BLOCK__IS_ENCAPSULATED = PHYSICAL_ELEMENT__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATING_BLOCK__BASE_CLASS = PHYSICAL_ELEMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATING_BLOCK__ID = PHYSICAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATING_BLOCK__NAME = PHYSICAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Iotport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATING_BLOCK__IOTPORT = PHYSICAL_ELEMENT__IOTPORT;

	/**
	 * The feature id for the '<em><b>Actuation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATING_BLOCK__ACTUATION_TYPE = PHYSICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Physicalentity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATING_BLOCK__PHYSICALENTITY = PHYSICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actuating Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATING_BLOCK_FEATURE_COUNT = PHYSICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Actuating Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATING_BLOCK_OPERATION_COUNT = PHYSICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PhysicalEntityImpl <em>Physical Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PhysicalEntityImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getPhysicalEntity()
	 * @generated
	 */
	int PHYSICAL_ENTITY = 6;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY__IS_ENCAPSULATED = PHYSICAL_ELEMENT__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY__BASE_CLASS = PHYSICAL_ELEMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY__ID = PHYSICAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY__NAME = PHYSICAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Iotport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY__IOTPORT = PHYSICAL_ELEMENT__IOTPORT;

	/**
	 * The feature id for the '<em><b>Physicalentity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY__PHYSICALENTITY = PHYSICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Physical Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_FEATURE_COUNT = PHYSICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Physical Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_OPERATION_COUNT = PHYSICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SensorBlockImpl <em>Sensor Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SensorBlockImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getSensorBlock()
	 * @generated
	 */
	int SENSOR_BLOCK = 7;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_BLOCK__IS_ENCAPSULATED = PHYSICAL_ELEMENT__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_BLOCK__BASE_CLASS = PHYSICAL_ELEMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_BLOCK__ID = PHYSICAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_BLOCK__NAME = PHYSICAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Iotport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_BLOCK__IOTPORT = PHYSICAL_ELEMENT__IOTPORT;

	/**
	 * The feature id for the '<em><b>Sensor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_BLOCK__SENSOR_TYPE = PHYSICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Physicalentity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_BLOCK__PHYSICALENTITY = PHYSICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Computingboard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_BLOCK__COMPUTINGBOARD = PHYSICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sensor Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_BLOCK_FEATURE_COUNT = PHYSICAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sensor Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_BLOCK_OPERATION_COUNT = PHYSICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ConnectionImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 8;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__BASE_CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Iotport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__IOTPORT = 1;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SystemImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 9;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Physicalentity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PHYSICALENTITY = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iotport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__IOTPORT = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Server</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SERVER = BlocksPackage.BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = BlocksPackage.BLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Physicalelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PHYSICALELEMENT = BlocksPackage.BLOCK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>System hw</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SYSTEM_HW = BlocksPackage.BLOCK_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ConsumerEntityImpl <em>Consumer Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ConsumerEntityImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getConsumerEntity()
	 * @generated
	 */
	int CONSUMER_ENTITY = 10;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_ENTITY__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_ENTITY__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Server</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_ENTITY__SERVER = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Consumer Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_ENTITY_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Consumer Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_ENTITY_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ExternalActiveEntityImpl <em>External Active Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ExternalActiveEntityImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getExternalActiveEntity()
	 * @generated
	 */
	int EXTERNAL_ACTIVE_ENTITY = 11;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTIVE_ENTITY__IS_ENCAPSULATED = CONSUMER_ENTITY__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTIVE_ENTITY__BASE_CLASS = CONSUMER_ENTITY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Server</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTIVE_ENTITY__SERVER = CONSUMER_ENTITY__SERVER;

	/**
	 * The number of structural features of the '<em>External Active Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTIVE_ENTITY_FEATURE_COUNT = CONSUMER_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>External Active Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ACTIVE_ENTITY_OPERATION_COUNT = CONSUMER_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ExternalPassiveEntityImpl <em>External Passive Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ExternalPassiveEntityImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getExternalPassiveEntity()
	 * @generated
	 */
	int EXTERNAL_PASSIVE_ENTITY = 12;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PASSIVE_ENTITY__IS_ENCAPSULATED = CONSUMER_ENTITY__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PASSIVE_ENTITY__BASE_CLASS = CONSUMER_ENTITY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Server</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PASSIVE_ENTITY__SERVER = CONSUMER_ENTITY__SERVER;

	/**
	 * The feature id for the '<em><b>Physicalentity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PASSIVE_ENTITY__PHYSICALENTITY = CONSUMER_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Passive Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PASSIVE_ENTITY_FEATURE_COUNT = CONSUMER_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>External Passive Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_PASSIVE_ENTITY_OPERATION_COUNT = CONSUMER_ENTITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalBoard <em>Physical Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Board</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalBoard
	 * @generated
	 */
	EClass getPhysicalBoard();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalBoard#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalBoard#getModel()
	 * @see #getPhysicalBoard()
	 * @generated
	 */
	EAttribute getPhysicalBoard_Model();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalBoard#getGateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gateway</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalBoard#getGateway()
	 * @see #getPhysicalBoard()
	 * @generated
	 */
	EReference getPhysicalBoard_Gateway();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalBoard#getActuatingblock <em>Actuatingblock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actuatingblock</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalBoard#getActuatingblock()
	 * @see #getPhysicalBoard()
	 * @generated
	 */
	EReference getPhysicalBoard_Actuatingblock();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalBoard#getSensorblock <em>Sensorblock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sensorblock</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalBoard#getSensorblock()
	 * @see #getPhysicalBoard()
	 * @generated
	 */
	EReference getPhysicalBoard_Sensorblock();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalBoard#getPhysicalentity <em>Physicalentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Physicalentity</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalBoard#getPhysicalentity()
	 * @see #getPhysicalBoard()
	 * @generated
	 */
	EReference getPhysicalBoard_Physicalentity();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalElement <em>Physical Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Element</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalElement
	 * @generated
	 */
	EClass getPhysicalElement();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalElement#getId()
	 * @see #getPhysicalElement()
	 * @generated
	 */
	EAttribute getPhysicalElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalElement#getName()
	 * @see #getPhysicalElement()
	 * @generated
	 */
	EAttribute getPhysicalElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalElement#getIotport <em>Iotport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iotport</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalElement#getIotport()
	 * @see #getPhysicalElement()
	 * @generated
	 */
	EReference getPhysicalElement_Iotport();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTPort <em>Io TPort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io TPort</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTPort
	 * @generated
	 */
	EClass getIoTPort();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Gateway
	 * @generated
	 */
	EClass getGateway();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Gateway#getGateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gateway</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Gateway#getGateway()
	 * @see #getGateway()
	 * @generated
	 */
	EReference getGateway_Gateway();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Gateway#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Server</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Gateway#getServer()
	 * @see #getGateway()
	 * @generated
	 */
	EReference getGateway_Server();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Gateway#getComputingboard <em>Computingboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Computingboard</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Gateway#getComputingboard()
	 * @see #getGateway()
	 * @generated
	 */
	EReference getGateway_Computingboard();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Server#getIotport <em>Iotport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iotport</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Server#getIotport()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Iotport();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ActuatingBlock <em>Actuating Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuating Block</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ActuatingBlock
	 * @generated
	 */
	EClass getActuatingBlock();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ActuatingBlock#getActuationType <em>Actuation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuation Type</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ActuatingBlock#getActuationType()
	 * @see #getActuatingBlock()
	 * @generated
	 */
	EAttribute getActuatingBlock_ActuationType();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ActuatingBlock#getPhysicalentity <em>Physicalentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Physicalentity</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ActuatingBlock#getPhysicalentity()
	 * @see #getActuatingBlock()
	 * @generated
	 */
	EReference getActuatingBlock_Physicalentity();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalEntity <em>Physical Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Entity</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalEntity
	 * @generated
	 */
	EClass getPhysicalEntity();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalEntity#getPhysicalentity <em>Physicalentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Physicalentity</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalEntity#getPhysicalentity()
	 * @see #getPhysicalEntity()
	 * @generated
	 */
	EReference getPhysicalEntity_Physicalentity();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock <em>Sensor Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Block</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock
	 * @generated
	 */
	EClass getSensorBlock();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock#getSensorType <em>Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor Type</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock#getSensorType()
	 * @see #getSensorBlock()
	 * @generated
	 */
	EAttribute getSensorBlock_SensorType();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock#getPhysicalentity <em>Physicalentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Physicalentity</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock#getPhysicalentity()
	 * @see #getSensorBlock()
	 * @generated
	 */
	EReference getSensorBlock_Physicalentity();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock#getComputingboard <em>Computingboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Computingboard</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock#getComputingboard()
	 * @see #getSensorBlock()
	 * @generated
	 */
	EReference getSensorBlock_Computingboard();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Connection#getBase_Connector <em>Base Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Connector</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Connection#getBase_Connector()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Base_Connector();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Connection#getIotport <em>Iotport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iotport</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Connection#getIotport()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Iotport();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.System#getPhysicalentity <em>Physicalentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Physicalentity</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.System#getPhysicalentity()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Physicalentity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.System#getIotport <em>Iotport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iotport</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.System#getIotport()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Iotport();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.System#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Server</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.System#getServer()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Server();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.System#getPhysicalelement <em>Physicalelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Physicalelement</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.System#getPhysicalelement()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Physicalelement();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.System#getSystem_hw <em>System hw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System hw</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.System#getSystem_hw()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_System_hw();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ConsumerEntity <em>Consumer Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consumer Entity</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ConsumerEntity
	 * @generated
	 */
	EClass getConsumerEntity();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ConsumerEntity#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Server</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ConsumerEntity#getServer()
	 * @see #getConsumerEntity()
	 * @generated
	 */
	EReference getConsumerEntity_Server();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ExternalActiveEntity <em>External Active Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Active Entity</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ExternalActiveEntity
	 * @generated
	 */
	EClass getExternalActiveEntity();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ExternalPassiveEntity <em>External Passive Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Passive Entity</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ExternalPassiveEntity
	 * @generated
	 */
	EClass getExternalPassiveEntity();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ExternalPassiveEntity#getPhysicalentity <em>Physicalentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Physicalentity</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ExternalPassiveEntity#getPhysicalentity()
	 * @see #getExternalPassiveEntity()
	 * @generated
	 */
	EReference getExternalPassiveEntity_Physicalentity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CHESSIoTSystemFactory getCHESSIoTSystemFactory();

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
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PhysicalBoardImpl <em>Physical Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PhysicalBoardImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getPhysicalBoard()
		 * @generated
		 */
		EClass PHYSICAL_BOARD = eINSTANCE.getPhysicalBoard();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_BOARD__MODEL = eINSTANCE.getPhysicalBoard_Model();

		/**
		 * The meta object literal for the '<em><b>Gateway</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_BOARD__GATEWAY = eINSTANCE.getPhysicalBoard_Gateway();

		/**
		 * The meta object literal for the '<em><b>Actuatingblock</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_BOARD__ACTUATINGBLOCK = eINSTANCE.getPhysicalBoard_Actuatingblock();

		/**
		 * The meta object literal for the '<em><b>Sensorblock</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_BOARD__SENSORBLOCK = eINSTANCE.getPhysicalBoard_Sensorblock();

		/**
		 * The meta object literal for the '<em><b>Physicalentity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_BOARD__PHYSICALENTITY = eINSTANCE.getPhysicalBoard_Physicalentity();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PhysicalElementImpl <em>Physical Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PhysicalElementImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getPhysicalElement()
		 * @generated
		 */
		EClass PHYSICAL_ELEMENT = eINSTANCE.getPhysicalElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_ELEMENT__ID = eINSTANCE.getPhysicalElement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_ELEMENT__NAME = eINSTANCE.getPhysicalElement_Name();

		/**
		 * The meta object literal for the '<em><b>Iotport</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_ELEMENT__IOTPORT = eINSTANCE.getPhysicalElement_Iotport();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.IoTPortImpl <em>Io TPort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.IoTPortImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getIoTPort()
		 * @generated
		 */
		EClass IO_TPORT = eINSTANCE.getIoTPort();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.GatewayImpl <em>Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.GatewayImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getGateway()
		 * @generated
		 */
		EClass GATEWAY = eINSTANCE.getGateway();

		/**
		 * The meta object literal for the '<em><b>Gateway</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATEWAY__GATEWAY = eINSTANCE.getGateway_Gateway();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATEWAY__SERVER = eINSTANCE.getGateway_Server();

		/**
		 * The meta object literal for the '<em><b>Computingboard</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATEWAY__COMPUTINGBOARD = eINSTANCE.getGateway_Computingboard();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ServerImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '<em><b>Iotport</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__IOTPORT = eINSTANCE.getServer_Iotport();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ActuatingBlockImpl <em>Actuating Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ActuatingBlockImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getActuatingBlock()
		 * @generated
		 */
		EClass ACTUATING_BLOCK = eINSTANCE.getActuatingBlock();

		/**
		 * The meta object literal for the '<em><b>Actuation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATING_BLOCK__ACTUATION_TYPE = eINSTANCE.getActuatingBlock_ActuationType();

		/**
		 * The meta object literal for the '<em><b>Physicalentity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATING_BLOCK__PHYSICALENTITY = eINSTANCE.getActuatingBlock_Physicalentity();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PhysicalEntityImpl <em>Physical Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PhysicalEntityImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getPhysicalEntity()
		 * @generated
		 */
		EClass PHYSICAL_ENTITY = eINSTANCE.getPhysicalEntity();

		/**
		 * The meta object literal for the '<em><b>Physicalentity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_ENTITY__PHYSICALENTITY = eINSTANCE.getPhysicalEntity_Physicalentity();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SensorBlockImpl <em>Sensor Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SensorBlockImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getSensorBlock()
		 * @generated
		 */
		EClass SENSOR_BLOCK = eINSTANCE.getSensorBlock();

		/**
		 * The meta object literal for the '<em><b>Sensor Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_BLOCK__SENSOR_TYPE = eINSTANCE.getSensorBlock_SensorType();

		/**
		 * The meta object literal for the '<em><b>Physicalentity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_BLOCK__PHYSICALENTITY = eINSTANCE.getSensorBlock_Physicalentity();

		/**
		 * The meta object literal for the '<em><b>Computingboard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_BLOCK__COMPUTINGBOARD = eINSTANCE.getSensorBlock_Computingboard();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ConnectionImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Base Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__BASE_CONNECTOR = eINSTANCE.getConnection_Base_Connector();

		/**
		 * The meta object literal for the '<em><b>Iotport</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__IOTPORT = eINSTANCE.getConnection_Iotport();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SystemImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Physicalentity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__PHYSICALENTITY = eINSTANCE.getSystem_Physicalentity();

		/**
		 * The meta object literal for the '<em><b>Iotport</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__IOTPORT = eINSTANCE.getSystem_Iotport();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SERVER = eINSTANCE.getSystem_Server();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Physicalelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__PHYSICALELEMENT = eINSTANCE.getSystem_Physicalelement();

		/**
		 * The meta object literal for the '<em><b>System hw</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SYSTEM_HW = eINSTANCE.getSystem_System_hw();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ConsumerEntityImpl <em>Consumer Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ConsumerEntityImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getConsumerEntity()
		 * @generated
		 */
		EClass CONSUMER_ENTITY = eINSTANCE.getConsumerEntity();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMER_ENTITY__SERVER = eINSTANCE.getConsumerEntity_Server();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ExternalActiveEntityImpl <em>External Active Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ExternalActiveEntityImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getExternalActiveEntity()
		 * @generated
		 */
		EClass EXTERNAL_ACTIVE_ENTITY = eINSTANCE.getExternalActiveEntity();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ExternalPassiveEntityImpl <em>External Passive Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ExternalPassiveEntityImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getExternalPassiveEntity()
		 * @generated
		 */
		EClass EXTERNAL_PASSIVE_ENTITY = eINSTANCE.getExternalPassiveEntity();

		/**
		 * The meta object literal for the '<em><b>Physicalentity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_PASSIVE_ENTITY__PHYSICALENTITY = eINSTANCE.getExternalPassiveEntity_Physicalentity();

	}

} //CHESSIoTSystemPackage
