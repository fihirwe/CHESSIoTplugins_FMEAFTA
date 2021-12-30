/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ELEMENT__LATITUDE = 1;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ELEMENT__LONGITUDE = 2;

	/**
	 * The feature id for the '<em><b>Base Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ELEMENT__BASE_BLOCK = 3;

	/**
	 * The feature id for the '<em><b>Iotport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ELEMENT__IOTPORT = 4;

	/**
	 * The number of structural features of the '<em>Physical Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ELEMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Physical Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ComputingBoardImpl <em>Computing Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ComputingBoardImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getComputingBoard()
	 * @generated
	 */
	int COMPUTING_BOARD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_BOARD__NAME = PHYSICAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_BOARD__LATITUDE = PHYSICAL_ELEMENT__LATITUDE;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_BOARD__LONGITUDE = PHYSICAL_ELEMENT__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Base Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_BOARD__BASE_BLOCK = PHYSICAL_ELEMENT__BASE_BLOCK;

	/**
	 * The feature id for the '<em><b>Iotport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_BOARD__IOTPORT = PHYSICAL_ELEMENT__IOTPORT;

	/**
	 * The feature id for the '<em><b>Node Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_BOARD__NODE_MODEL = PHYSICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_BOARD__GATEWAY = PHYSICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actuatingblock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_BOARD__ACTUATINGBLOCK = PHYSICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sensorblock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_BOARD__SENSORBLOCK = PHYSICAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Physicalentity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_BOARD__PHYSICALENTITY = PHYSICAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Computing Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_BOARD_FEATURE_COUNT = PHYSICAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Computing Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_BOARD_OPERATION_COUNT = PHYSICAL_ELEMENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__NAME = PHYSICAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__LATITUDE = PHYSICAL_ELEMENT__LATITUDE;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__LONGITUDE = PHYSICAL_ELEMENT__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Base Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__BASE_BLOCK = PHYSICAL_ELEMENT__BASE_BLOCK;

	/**
	 * The feature id for the '<em><b>Iotport</b></em>' containment reference.
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
	 * The feature id for the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__SERVER = PHYSICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Computingboard</b></em>' reference.
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
	 * The feature id for the '<em><b>Op System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__OP_SYSTEM = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iotport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__IOTPORT = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATING_BLOCK__NAME = PHYSICAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATING_BLOCK__LATITUDE = PHYSICAL_ELEMENT__LATITUDE;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATING_BLOCK__LONGITUDE = PHYSICAL_ELEMENT__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Base Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATING_BLOCK__BASE_BLOCK = PHYSICAL_ELEMENT__BASE_BLOCK;

	/**
	 * The feature id for the '<em><b>Iotport</b></em>' containment reference.
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY__NAME = PHYSICAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY__LATITUDE = PHYSICAL_ELEMENT__LATITUDE;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY__LONGITUDE = PHYSICAL_ELEMENT__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Base Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY__BASE_BLOCK = PHYSICAL_ELEMENT__BASE_BLOCK;

	/**
	 * The feature id for the '<em><b>Iotport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY__IOTPORT = PHYSICAL_ELEMENT__IOTPORT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY__ID = PHYSICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Physicalentity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY__PHYSICALENTITY = PHYSICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Physical Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ENTITY_FEATURE_COUNT = PHYSICAL_ELEMENT_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_BLOCK__NAME = PHYSICAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_BLOCK__LATITUDE = PHYSICAL_ELEMENT__LATITUDE;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_BLOCK__LONGITUDE = PHYSICAL_ELEMENT__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Base Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_BLOCK__BASE_BLOCK = PHYSICAL_ELEMENT__BASE_BLOCK;

	/**
	 * The feature id for the '<em><b>Iotport</b></em>' containment reference.
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
	 * The feature id for the '<em><b>Comm Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__COMM_MODE = 0;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__BASE_CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Iotport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__IOTPORT = 2;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SYSTEM_HwImpl <em>SYSTEM Hw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SYSTEM_HwImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getSYSTEM_Hw()
	 * @generated
	 */
	int SYSTEM_HW = 9;

	/**
	 * The feature id for the '<em><b>Base Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_HW__BASE_BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Physicalentity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_HW__PHYSICALENTITY = 1;

	/**
	 * The feature id for the '<em><b>Iotport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_HW__IOTPORT = 2;

	/**
	 * The feature id for the '<em><b>Server</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_HW__SERVER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_HW__NAME = 4;

	/**
	 * The feature id for the '<em><b>System hw</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_HW__SYSTEM_HW = 5;

	/**
	 * The feature id for the '<em><b>Physicalelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_HW__PHYSICALELEMENT = 6;

	/**
	 * The number of structural features of the '<em>SYSTEM Hw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_HW_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>SYSTEM Hw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_HW_OPERATION_COUNT = 0;

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
	 * The number of structural features of the '<em>Consumer Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_ENTITY_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Consumer Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_ENTITY_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ActiveImpl <em>Active</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ActiveImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getActive()
	 * @generated
	 */
	int ACTIVE = 11;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE__IS_ENCAPSULATED = CONSUMER_ENTITY__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE__BASE_CLASS = CONSUMER_ENTITY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE__SERVER = CONSUMER_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Active</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_FEATURE_COUNT = CONSUMER_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Active</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_OPERATION_COUNT = CONSUMER_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PassiveImpl <em>Passive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PassiveImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getPassive()
	 * @generated
	 */
	int PASSIVE = 12;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE__IS_ENCAPSULATED = CONSUMER_ENTITY__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE__BASE_CLASS = CONSUMER_ENTITY__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Physicalentity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE__PHYSICALENTITY = CONSUMER_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Passive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_FEATURE_COUNT = CONSUMER_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Passive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_OPERATION_COUNT = CONSUMER_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.NodeModel <em>Node Model</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.NodeModel
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getNodeModel()
	 * @generated
	 */
	int NODE_MODEL = 13;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ActuatorType <em>Actuator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ActuatorType
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getActuatorType()
	 * @generated
	 */
	int ACTUATOR_TYPE = 14;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorType <em>Sensor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorType
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getSensorType()
	 * @generated
	 */
	int SENSOR_TYPE = 15;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CommunicationMode <em>Communication Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CommunicationMode
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getCommunicationMode()
	 * @generated
	 */
	int COMMUNICATION_MODE = 16;


	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ComputingBoard <em>Computing Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computing Board</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ComputingBoard
	 * @generated
	 */
	EClass getComputingBoard();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ComputingBoard#getNodeModel <em>Node Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Model</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ComputingBoard#getNodeModel()
	 * @see #getComputingBoard()
	 * @generated
	 */
	EAttribute getComputingBoard_NodeModel();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ComputingBoard#getGateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gateway</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ComputingBoard#getGateway()
	 * @see #getComputingBoard()
	 * @generated
	 */
	EReference getComputingBoard_Gateway();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ComputingBoard#getActuatingblock <em>Actuatingblock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actuatingblock</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ComputingBoard#getActuatingblock()
	 * @see #getComputingBoard()
	 * @generated
	 */
	EReference getComputingBoard_Actuatingblock();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ComputingBoard#getSensorblock <em>Sensorblock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensorblock</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ComputingBoard#getSensorblock()
	 * @see #getComputingBoard()
	 * @generated
	 */
	EReference getComputingBoard_Sensorblock();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ComputingBoard#getPhysicalentity <em>Physicalentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Physicalentity</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ComputingBoard#getPhysicalentity()
	 * @see #getComputingBoard()
	 * @generated
	 */
	EReference getComputingBoard_Physicalentity();

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
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalElement#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalElement#getLatitude()
	 * @see #getPhysicalElement()
	 * @generated
	 */
	EAttribute getPhysicalElement_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalElement#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalElement#getLongitude()
	 * @see #getPhysicalElement()
	 * @generated
	 */
	EAttribute getPhysicalElement_Longitude();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalElement#getBase_Block <em>Base Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Block</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalElement#getBase_Block()
	 * @see #getPhysicalElement()
	 * @generated
	 */
	EReference getPhysicalElement_Base_Block();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalElement#getIotport <em>Iotport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iotport</em>'.
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
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Gateway#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Gateway#getServer()
	 * @see #getGateway()
	 * @generated
	 */
	EReference getGateway_Server();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Gateway#getComputingboard <em>Computingboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Computingboard</em>'.
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
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Server#getOpSystem <em>Op System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op System</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Server#getOpSystem()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_OpSystem();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Server#getIotport <em>Iotport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Iotport</em>'.
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
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalEntity#getId()
	 * @see #getPhysicalEntity()
	 * @generated
	 */
	EAttribute getPhysicalEntity_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalEntity#getPhysicalentity <em>Physicalentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Physicalentity</em>'.
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
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Connection#getCommMode <em>Comm Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comm Mode</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Connection#getCommMode()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_CommMode();

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
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Connection#getIotport <em>Iotport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Iotport</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Connection#getIotport()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Iotport();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SYSTEM_Hw <em>SYSTEM Hw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SYSTEM Hw</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SYSTEM_Hw
	 * @generated
	 */
	EClass getSYSTEM_Hw();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SYSTEM_Hw#getBase_Block <em>Base Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Block</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SYSTEM_Hw#getBase_Block()
	 * @see #getSYSTEM_Hw()
	 * @generated
	 */
	EReference getSYSTEM_Hw_Base_Block();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SYSTEM_Hw#getPhysicalentity <em>Physicalentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Physicalentity</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SYSTEM_Hw#getPhysicalentity()
	 * @see #getSYSTEM_Hw()
	 * @generated
	 */
	EReference getSYSTEM_Hw_Physicalentity();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SYSTEM_Hw#getIotport <em>Iotport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iotport</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SYSTEM_Hw#getIotport()
	 * @see #getSYSTEM_Hw()
	 * @generated
	 */
	EReference getSYSTEM_Hw_Iotport();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SYSTEM_Hw#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Server</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SYSTEM_Hw#getServer()
	 * @see #getSYSTEM_Hw()
	 * @generated
	 */
	EReference getSYSTEM_Hw_Server();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SYSTEM_Hw#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SYSTEM_Hw#getName()
	 * @see #getSYSTEM_Hw()
	 * @generated
	 */
	EAttribute getSYSTEM_Hw_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SYSTEM_Hw#getSystem_hw <em>System hw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System hw</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SYSTEM_Hw#getSystem_hw()
	 * @see #getSYSTEM_Hw()
	 * @generated
	 */
	EReference getSYSTEM_Hw_System_hw();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SYSTEM_Hw#getPhysicalelement <em>Physicalelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Physicalelement</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SYSTEM_Hw#getPhysicalelement()
	 * @see #getSYSTEM_Hw()
	 * @generated
	 */
	EReference getSYSTEM_Hw_Physicalelement();

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
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Active <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Active
	 * @generated
	 */
	EClass getActive();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Active#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Active#getServer()
	 * @see #getActive()
	 * @generated
	 */
	EReference getActive_Server();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Passive <em>Passive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passive</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Passive
	 * @generated
	 */
	EClass getPassive();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Passive#getPhysicalentity <em>Physicalentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Physicalentity</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Passive#getPhysicalentity()
	 * @see #getPassive()
	 * @generated
	 */
	EReference getPassive_Physicalentity();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.NodeModel <em>Node Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Model</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.NodeModel
	 * @generated
	 */
	EEnum getNodeModel();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ActuatorType <em>Actuator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Actuator Type</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ActuatorType
	 * @generated
	 */
	EEnum getActuatorType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorType <em>Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sensor Type</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorType
	 * @generated
	 */
	EEnum getSensorType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CommunicationMode <em>Communication Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Communication Mode</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CommunicationMode
	 * @generated
	 */
	EEnum getCommunicationMode();

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
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ComputingBoardImpl <em>Computing Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ComputingBoardImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getComputingBoard()
		 * @generated
		 */
		EClass COMPUTING_BOARD = eINSTANCE.getComputingBoard();

		/**
		 * The meta object literal for the '<em><b>Node Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTING_BOARD__NODE_MODEL = eINSTANCE.getComputingBoard_NodeModel();

		/**
		 * The meta object literal for the '<em><b>Gateway</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTING_BOARD__GATEWAY = eINSTANCE.getComputingBoard_Gateway();

		/**
		 * The meta object literal for the '<em><b>Actuatingblock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTING_BOARD__ACTUATINGBLOCK = eINSTANCE.getComputingBoard_Actuatingblock();

		/**
		 * The meta object literal for the '<em><b>Sensorblock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTING_BOARD__SENSORBLOCK = eINSTANCE.getComputingBoard_Sensorblock();

		/**
		 * The meta object literal for the '<em><b>Physicalentity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTING_BOARD__PHYSICALENTITY = eINSTANCE.getComputingBoard_Physicalentity();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_ELEMENT__NAME = eINSTANCE.getPhysicalElement_Name();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_ELEMENT__LATITUDE = eINSTANCE.getPhysicalElement_Latitude();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_ELEMENT__LONGITUDE = eINSTANCE.getPhysicalElement_Longitude();

		/**
		 * The meta object literal for the '<em><b>Base Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_ELEMENT__BASE_BLOCK = eINSTANCE.getPhysicalElement_Base_Block();

		/**
		 * The meta object literal for the '<em><b>Iotport</b></em>' containment reference feature.
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
		 * The meta object literal for the '<em><b>Server</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATEWAY__SERVER = eINSTANCE.getGateway_Server();

		/**
		 * The meta object literal for the '<em><b>Computingboard</b></em>' reference feature.
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
		 * The meta object literal for the '<em><b>Op System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__OP_SYSTEM = eINSTANCE.getServer_OpSystem();

		/**
		 * The meta object literal for the '<em><b>Iotport</b></em>' reference feature.
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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_ENTITY__ID = eINSTANCE.getPhysicalEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Physicalentity</b></em>' containment reference feature.
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
		 * The meta object literal for the '<em><b>Comm Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__COMM_MODE = eINSTANCE.getConnection_CommMode();

		/**
		 * The meta object literal for the '<em><b>Base Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__BASE_CONNECTOR = eINSTANCE.getConnection_Base_Connector();

		/**
		 * The meta object literal for the '<em><b>Iotport</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__IOTPORT = eINSTANCE.getConnection_Iotport();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SYSTEM_HwImpl <em>SYSTEM Hw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SYSTEM_HwImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getSYSTEM_Hw()
		 * @generated
		 */
		EClass SYSTEM_HW = eINSTANCE.getSYSTEM_Hw();

		/**
		 * The meta object literal for the '<em><b>Base Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_HW__BASE_BLOCK = eINSTANCE.getSYSTEM_Hw_Base_Block();

		/**
		 * The meta object literal for the '<em><b>Physicalentity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_HW__PHYSICALENTITY = eINSTANCE.getSYSTEM_Hw_Physicalentity();

		/**
		 * The meta object literal for the '<em><b>Iotport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_HW__IOTPORT = eINSTANCE.getSYSTEM_Hw_Iotport();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_HW__SERVER = eINSTANCE.getSYSTEM_Hw_Server();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_HW__NAME = eINSTANCE.getSYSTEM_Hw_Name();

		/**
		 * The meta object literal for the '<em><b>System hw</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_HW__SYSTEM_HW = eINSTANCE.getSYSTEM_Hw_System_hw();

		/**
		 * The meta object literal for the '<em><b>Physicalelement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_HW__PHYSICALELEMENT = eINSTANCE.getSYSTEM_Hw_Physicalelement();

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
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ActiveImpl <em>Active</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ActiveImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getActive()
		 * @generated
		 */
		EClass ACTIVE = eINSTANCE.getActive();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVE__SERVER = eINSTANCE.getActive_Server();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PassiveImpl <em>Passive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PassiveImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getPassive()
		 * @generated
		 */
		EClass PASSIVE = eINSTANCE.getPassive();

		/**
		 * The meta object literal for the '<em><b>Physicalentity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSIVE__PHYSICALENTITY = eINSTANCE.getPassive_Physicalentity();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.NodeModel <em>Node Model</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.NodeModel
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getNodeModel()
		 * @generated
		 */
		EEnum NODE_MODEL = eINSTANCE.getNodeModel();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ActuatorType <em>Actuator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ActuatorType
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getActuatorType()
		 * @generated
		 */
		EEnum ACTUATOR_TYPE = eINSTANCE.getActuatorType();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorType <em>Sensor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorType
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getSensorType()
		 * @generated
		 */
		EEnum SENSOR_TYPE = eINSTANCE.getSensorType();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CommunicationMode <em>Communication Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CommunicationMode
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl#getCommunicationMode()
		 * @generated
		 */
		EEnum COMMUNICATION_MODE = eINSTANCE.getCommunicationMode();

	}

} //CHESSIoTSystemPackage
