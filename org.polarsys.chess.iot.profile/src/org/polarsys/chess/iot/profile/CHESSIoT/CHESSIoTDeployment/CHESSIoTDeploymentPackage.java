/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment;

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
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentFactory
 * @model kind="package"
 * @generated
 */
public interface CHESSIoTDeploymentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CHESSIoTDeployment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///CHESSIoT/CHESSIoTDeployment.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CHESSIoT.CHESSIoTDeployment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CHESSIoTDeploymentPackage eINSTANCE = org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.SensorUnitImpl <em>Sensor Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.SensorUnitImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getSensorUnit()
	 * @generated
	 */
	int SENSOR_UNIT = 0;

	/**
	 * The feature id for the '<em><b>Sensor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_UNIT__SENSOR_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_UNIT__BASE_COMPONENT = 1;

	/**
	 * The number of structural features of the '<em>Sensor Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_UNIT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sensor Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.ActuatorUnitImpl <em>Actuator Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.ActuatorUnitImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getActuatorUnit()
	 * @generated
	 */
	int ACTUATOR_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Actuator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_UNIT__ACTUATOR_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_UNIT__BASE_COMPONENT = 1;

	/**
	 * The number of structural features of the '<em>Actuator Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_UNIT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Actuator Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.PhysicalBaordImpl <em>Physical Baord</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.PhysicalBaordImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getPhysicalBaord()
	 * @generated
	 */
	int PHYSICAL_BAORD = 2;

	/**
	 * The feature id for the '<em><b>Board Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BAORD__BOARD_NAME = 0;

	/**
	 * The feature id for the '<em><b>Virtual Board</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BAORD__VIRTUAL_BOARD = 1;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BAORD__BASE_COMPONENT = 2;

	/**
	 * The number of structural features of the '<em>Physical Baord</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BAORD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Physical Baord</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BAORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.SystemHWImpl <em>System HW</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.SystemHWImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getSystemHW()
	 * @generated
	 */
	int SYSTEM_HW = 3;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_HW__BASE_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>System HW</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_HW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>System HW</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_HW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.IoTPortImpl <em>Io TPort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.IoTPortImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getIoTPort()
	 * @generated
	 */
	int IO_TPORT = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TPORT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Aaport Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TPORT__AAPORT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TPORT__BASE_PORT = 2;

	/**
	 * The number of structural features of the '<em>Io TPort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TPORT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Io TPort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.portInImpl <em>port In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.portInImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getportIn()
	 * @generated
	 */
	int PORT_IN = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_IN__TYPE = IO_TPORT__TYPE;

	/**
	 * The feature id for the '<em><b>Aaport Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_IN__AAPORT_NAME = IO_TPORT__AAPORT_NAME;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_IN__BASE_PORT = IO_TPORT__BASE_PORT;

	/**
	 * The number of structural features of the '<em>port In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_IN_FEATURE_COUNT = IO_TPORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>port In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_IN_OPERATION_COUNT = IO_TPORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.portOutImpl <em>port Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.portOutImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getportOut()
	 * @generated
	 */
	int PORT_OUT = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OUT__TYPE = IO_TPORT__TYPE;

	/**
	 * The feature id for the '<em><b>Aaport Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OUT__AAPORT_NAME = IO_TPORT__AAPORT_NAME;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OUT__BASE_PORT = IO_TPORT__BASE_PORT;

	/**
	 * The number of structural features of the '<em>port Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OUT_FEATURE_COUNT = IO_TPORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>port Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OUT_OPERATION_COUNT = IO_TPORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.TagUnitImpl <em>Tag Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.TagUnitImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getTagUnit()
	 * @generated
	 */
	int TAG_UNIT = 7;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_UNIT__BASE_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Tag Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_UNIT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tag Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.PortType <em>Port Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.PortType
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 8;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.SensorType <em>Sensor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.SensorType
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getSensorType()
	 * @generated
	 */
	int SENSOR_TYPE = 9;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.ActuatorType <em>Actuator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.ActuatorType
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getActuatorType()
	 * @generated
	 */
	int ACTUATOR_TYPE = 10;


	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.SensorUnit <em>Sensor Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Unit</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.SensorUnit
	 * @generated
	 */
	EClass getSensorUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.SensorUnit#getSensorType <em>Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor Type</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.SensorUnit#getSensorType()
	 * @see #getSensorUnit()
	 * @generated
	 */
	EAttribute getSensorUnit_SensorType();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.SensorUnit#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.SensorUnit#getBase_Component()
	 * @see #getSensorUnit()
	 * @generated
	 */
	EReference getSensorUnit_Base_Component();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.ActuatorUnit <em>Actuator Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator Unit</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.ActuatorUnit
	 * @generated
	 */
	EClass getActuatorUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.ActuatorUnit#getActuatorType <em>Actuator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuator Type</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.ActuatorUnit#getActuatorType()
	 * @see #getActuatorUnit()
	 * @generated
	 */
	EAttribute getActuatorUnit_ActuatorType();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.ActuatorUnit#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.ActuatorUnit#getBase_Component()
	 * @see #getActuatorUnit()
	 * @generated
	 */
	EReference getActuatorUnit_Base_Component();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.PhysicalBaord <em>Physical Baord</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Baord</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.PhysicalBaord
	 * @generated
	 */
	EClass getPhysicalBaord();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.PhysicalBaord#getBoardName <em>Board Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Board Name</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.PhysicalBaord#getBoardName()
	 * @see #getPhysicalBaord()
	 * @generated
	 */
	EAttribute getPhysicalBaord_BoardName();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.PhysicalBaord#getVirtualBoard <em>Virtual Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Virtual Board</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.PhysicalBaord#getVirtualBoard()
	 * @see #getPhysicalBaord()
	 * @generated
	 */
	EReference getPhysicalBaord_VirtualBoard();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.PhysicalBaord#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.PhysicalBaord#getBase_Component()
	 * @see #getPhysicalBaord()
	 * @generated
	 */
	EReference getPhysicalBaord_Base_Component();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.SystemHW <em>System HW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System HW</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.SystemHW
	 * @generated
	 */
	EClass getSystemHW();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.SystemHW#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.SystemHW#getBase_Component()
	 * @see #getSystemHW()
	 * @generated
	 */
	EReference getSystemHW_Base_Component();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.portIn <em>port In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>port In</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.portIn
	 * @generated
	 */
	EClass getportIn();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.IoTPort <em>Io TPort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io TPort</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.IoTPort
	 * @generated
	 */
	EClass getIoTPort();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.IoTPort#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.IoTPort#getType()
	 * @see #getIoTPort()
	 * @generated
	 */
	EAttribute getIoTPort_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.IoTPort#getAaportName <em>Aaport Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aaport Name</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.IoTPort#getAaportName()
	 * @see #getIoTPort()
	 * @generated
	 */
	EAttribute getIoTPort_AaportName();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.IoTPort#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.IoTPort#getBase_Port()
	 * @see #getIoTPort()
	 * @generated
	 */
	EReference getIoTPort_Base_Port();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.portOut <em>port Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>port Out</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.portOut
	 * @generated
	 */
	EClass getportOut();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.TagUnit <em>Tag Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag Unit</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.TagUnit
	 * @generated
	 */
	EClass getTagUnit();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.TagUnit#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.TagUnit#getBase_Component()
	 * @see #getTagUnit()
	 * @generated
	 */
	EReference getTagUnit_Base_Component();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Type</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.PortType
	 * @generated
	 */
	EEnum getPortType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.SensorType <em>Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sensor Type</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.SensorType
	 * @generated
	 */
	EEnum getSensorType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.ActuatorType <em>Actuator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Actuator Type</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.ActuatorType
	 * @generated
	 */
	EEnum getActuatorType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CHESSIoTDeploymentFactory getCHESSIoTDeploymentFactory();

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
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.SensorUnitImpl <em>Sensor Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.SensorUnitImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getSensorUnit()
		 * @generated
		 */
		EClass SENSOR_UNIT = eINSTANCE.getSensorUnit();

		/**
		 * The meta object literal for the '<em><b>Sensor Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_UNIT__SENSOR_TYPE = eINSTANCE.getSensorUnit_SensorType();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_UNIT__BASE_COMPONENT = eINSTANCE.getSensorUnit_Base_Component();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.ActuatorUnitImpl <em>Actuator Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.ActuatorUnitImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getActuatorUnit()
		 * @generated
		 */
		EClass ACTUATOR_UNIT = eINSTANCE.getActuatorUnit();

		/**
		 * The meta object literal for the '<em><b>Actuator Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR_UNIT__ACTUATOR_TYPE = eINSTANCE.getActuatorUnit_ActuatorType();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR_UNIT__BASE_COMPONENT = eINSTANCE.getActuatorUnit_Base_Component();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.PhysicalBaordImpl <em>Physical Baord</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.PhysicalBaordImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getPhysicalBaord()
		 * @generated
		 */
		EClass PHYSICAL_BAORD = eINSTANCE.getPhysicalBaord();

		/**
		 * The meta object literal for the '<em><b>Board Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_BAORD__BOARD_NAME = eINSTANCE.getPhysicalBaord_BoardName();

		/**
		 * The meta object literal for the '<em><b>Virtual Board</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_BAORD__VIRTUAL_BOARD = eINSTANCE.getPhysicalBaord_VirtualBoard();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_BAORD__BASE_COMPONENT = eINSTANCE.getPhysicalBaord_Base_Component();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.SystemHWImpl <em>System HW</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.SystemHWImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getSystemHW()
		 * @generated
		 */
		EClass SYSTEM_HW = eINSTANCE.getSystemHW();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_HW__BASE_COMPONENT = eINSTANCE.getSystemHW_Base_Component();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.portInImpl <em>port In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.portInImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getportIn()
		 * @generated
		 */
		EClass PORT_IN = eINSTANCE.getportIn();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.IoTPortImpl <em>Io TPort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.IoTPortImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getIoTPort()
		 * @generated
		 */
		EClass IO_TPORT = eINSTANCE.getIoTPort();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_TPORT__TYPE = eINSTANCE.getIoTPort_Type();

		/**
		 * The meta object literal for the '<em><b>Aaport Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_TPORT__AAPORT_NAME = eINSTANCE.getIoTPort_AaportName();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_TPORT__BASE_PORT = eINSTANCE.getIoTPort_Base_Port();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.portOutImpl <em>port Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.portOutImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getportOut()
		 * @generated
		 */
		EClass PORT_OUT = eINSTANCE.getportOut();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.TagUnitImpl <em>Tag Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.TagUnitImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getTagUnit()
		 * @generated
		 */
		EClass TAG_UNIT = eINSTANCE.getTagUnit();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG_UNIT__BASE_COMPONENT = eINSTANCE.getTagUnit_Base_Component();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.PortType <em>Port Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.PortType
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getPortType()
		 * @generated
		 */
		EEnum PORT_TYPE = eINSTANCE.getPortType();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.SensorType <em>Sensor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.SensorType
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getSensorType()
		 * @generated
		 */
		EEnum SENSOR_TYPE = eINSTANCE.getSensorType();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.ActuatorType <em>Actuator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.ActuatorType
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getActuatorType()
		 * @generated
		 */
		EEnum ACTUATOR_TYPE = eINSTANCE.getActuatorType();

	}

} //CHESSIoTDeploymentPackage
