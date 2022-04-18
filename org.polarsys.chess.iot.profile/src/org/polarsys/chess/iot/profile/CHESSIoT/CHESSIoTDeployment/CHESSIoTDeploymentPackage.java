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
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.ServiceImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Image URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__IMAGE_URL = 1;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PORTS = 2;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__VOLUMES = 3;

	/**
	 * The feature id for the '<em><b>Depends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DEPENDS = 4;

	/**
	 * The feature id for the '<em><b>Service Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICE_PRIORITY = 5;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__BASE_CLASS = 6;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICE = 7;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.MQTTBrokerImpl <em>MQTT Broker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.MQTTBrokerImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getMQTTBroker()
	 * @generated
	 */
	int MQTT_BROKER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_BROKER__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Image URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_BROKER__IMAGE_URL = SERVICE__IMAGE_URL;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_BROKER__PORTS = SERVICE__PORTS;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_BROKER__VOLUMES = SERVICE__VOLUMES;

	/**
	 * The feature id for the '<em><b>Depends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_BROKER__DEPENDS = SERVICE__DEPENDS;

	/**
	 * The feature id for the '<em><b>Service Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_BROKER__SERVICE_PRIORITY = SERVICE__SERVICE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_BROKER__BASE_CLASS = SERVICE__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_BROKER__SERVICE = SERVICE__SERVICE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_BROKER__TYPE = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_BROKER__ANONYMOUS = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Persistence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_BROKER__PERSISTENCE = SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_BROKER__USERNAME = SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_BROKER__PASSWORD = SERVICE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>MQTT Broker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_BROKER_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>MQTT Broker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_BROKER_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.OrchestratingAgentImpl <em>Orchestrating Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.OrchestratingAgentImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getOrchestratingAgent()
	 * @generated
	 */
	int ORCHESTRATING_AGENT = 2;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATING_AGENT__CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATING_AGENT__BASE_CONSTRAINT = 1;

	/**
	 * The number of structural features of the '<em>Orchestrating Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATING_AGENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Orchestrating Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATING_AGENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.EndUserApplicationImpl <em>End User Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.EndUserApplicationImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getEndUserApplication()
	 * @generated
	 */
	int END_USER_APPLICATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_USER_APPLICATION__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Image URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_USER_APPLICATION__IMAGE_URL = SERVICE__IMAGE_URL;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_USER_APPLICATION__PORTS = SERVICE__PORTS;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_USER_APPLICATION__VOLUMES = SERVICE__VOLUMES;

	/**
	 * The feature id for the '<em><b>Depends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_USER_APPLICATION__DEPENDS = SERVICE__DEPENDS;

	/**
	 * The feature id for the '<em><b>Service Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_USER_APPLICATION__SERVICE_PRIORITY = SERVICE__SERVICE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_USER_APPLICATION__BASE_CLASS = SERVICE__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_USER_APPLICATION__SERVICE = SERVICE__SERVICE;

	/**
	 * The feature id for the '<em><b>Custom Conf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_USER_APPLICATION__CUSTOM_CONF = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>End User Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_USER_APPLICATION_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>End User Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_USER_APPLICATION_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CloudOrchestratorImpl <em>Cloud Orchestrator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CloudOrchestratorImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getCloudOrchestrator()
	 * @generated
	 */
	int CLOUD_ORCHESTRATOR = 4;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ORCHESTRATOR__CONFIGURATION = ORCHESTRATING_AGENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ORCHESTRATOR__BASE_CONSTRAINT = ORCHESTRATING_AGENT__BASE_CONSTRAINT;

	/**
	 * The number of structural features of the '<em>Cloud Orchestrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ORCHESTRATOR_FEATURE_COUNT = ORCHESTRATING_AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cloud Orchestrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ORCHESTRATOR_OPERATION_COUNT = ORCHESTRATING_AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.NodeImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Op System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OP_SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__BASE_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MEMORY = 3;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.FogNodeImpl <em>Fog Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.FogNodeImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getFogNode()
	 * @generated
	 */
	int FOG_NODE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Op System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE__OP_SYSTEM = NODE__OP_SYSTEM;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE__BASE_COMPONENT = NODE__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE__MEMORY = NODE__MEMORY;

	/**
	 * The feature id for the '<em><b>Clients</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE__CLIENTS = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deviceresources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE__DEVICERESOURCES = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE__CONTAINER = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Devicenode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE__DEVICENODE = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Fog Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Fog Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.DeviceNodeImpl <em>Device Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.DeviceNodeImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getDeviceNode()
	 * @generated
	 */
	int DEVICE_NODE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Op System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_NODE__OP_SYSTEM = NODE__OP_SYSTEM;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_NODE__BASE_COMPONENT = NODE__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_NODE__MEMORY = NODE__MEMORY;

	/**
	 * The feature id for the '<em><b>Deviceresources</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_NODE__DEVICERESOURCES = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pysical Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_NODE__PYSICAL_DEVICE = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Device Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Device Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.DeviceResourcesImpl <em>Device Resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.DeviceResourcesImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getDeviceResources()
	 * @generated
	 */
	int DEVICE_RESOURCES = 8;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESOURCES__PATH = 0;

	/**
	 * The feature id for the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESOURCES__BASE_COMMENT = 1;

	/**
	 * The number of structural features of the '<em>Device Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESOURCES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_RESOURCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.FogOrchestratorImpl <em>Fog Orchestrator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.FogOrchestratorImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getFogOrchestrator()
	 * @generated
	 */
	int FOG_ORCHESTRATOR = 9;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_ORCHESTRATOR__CONFIGURATION = ORCHESTRATING_AGENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_ORCHESTRATOR__BASE_CONSTRAINT = ORCHESTRATING_AGENT__BASE_CONSTRAINT;

	/**
	 * The number of structural features of the '<em>Fog Orchestrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_ORCHESTRATOR_FEATURE_COUNT = ORCHESTRATING_AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fog Orchestrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_ORCHESTRATOR_OPERATION_COUNT = ORCHESTRATING_AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.ContainerImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 10;

	/**
	 * The feature id for the '<em><b>Service Hosted</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__SERVICE_HOSTED = 0;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__BASE_COMPONENT = 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CloudNodeImpl <em>Cloud Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CloudNodeImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getCloudNode()
	 * @generated
	 */
	int CLOUD_NODE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Op System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__OP_SYSTEM = NODE__OP_SYSTEM;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__BASE_COMPONENT = NODE__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__MEMORY = NODE__MEMORY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__CONTAINER = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cloudresources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__CLOUDRESOURCES = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cloud Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cloud Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.ExternalServiceImpl <em>External Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.ExternalServiceImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getExternalService()
	 * @generated
	 */
	int EXTERNAL_SERVICE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SERVICE__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Image URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SERVICE__IMAGE_URL = SERVICE__IMAGE_URL;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SERVICE__PORTS = SERVICE__PORTS;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SERVICE__VOLUMES = SERVICE__VOLUMES;

	/**
	 * The feature id for the '<em><b>Depends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SERVICE__DEPENDS = SERVICE__DEPENDS;

	/**
	 * The feature id for the '<em><b>Service Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SERVICE__SERVICE_PRIORITY = SERVICE__SERVICE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SERVICE__BASE_CLASS = SERVICE__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SERVICE__SERVICE = SERVICE__SERVICE;

	/**
	 * The number of structural features of the '<em>External Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>External Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SERVICE_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.DataDistributionServiceImpl <em>Data Distribution Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.DataDistributionServiceImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getDataDistributionService()
	 * @generated
	 */
	int DATA_DISTRIBUTION_SERVICE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISTRIBUTION_SERVICE__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Image URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISTRIBUTION_SERVICE__IMAGE_URL = SERVICE__IMAGE_URL;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISTRIBUTION_SERVICE__PORTS = SERVICE__PORTS;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISTRIBUTION_SERVICE__VOLUMES = SERVICE__VOLUMES;

	/**
	 * The feature id for the '<em><b>Depends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISTRIBUTION_SERVICE__DEPENDS = SERVICE__DEPENDS;

	/**
	 * The feature id for the '<em><b>Service Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISTRIBUTION_SERVICE__SERVICE_PRIORITY = SERVICE__SERVICE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISTRIBUTION_SERVICE__BASE_CLASS = SERVICE__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISTRIBUTION_SERVICE__SERVICE = SERVICE__SERVICE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISTRIBUTION_SERVICE__TYPE = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Distribution Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISTRIBUTION_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Distribution Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DISTRIBUTION_SERVICE_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.StorageServiceImpl <em>Storage Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.StorageServiceImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getStorageService()
	 * @generated
	 */
	int STORAGE_SERVICE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_SERVICE__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Image URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_SERVICE__IMAGE_URL = SERVICE__IMAGE_URL;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_SERVICE__PORTS = SERVICE__PORTS;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_SERVICE__VOLUMES = SERVICE__VOLUMES;

	/**
	 * The feature id for the '<em><b>Depends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_SERVICE__DEPENDS = SERVICE__DEPENDS;

	/**
	 * The feature id for the '<em><b>Service Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_SERVICE__SERVICE_PRIORITY = SERVICE__SERVICE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_SERVICE__BASE_CLASS = SERVICE__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_SERVICE__SERVICE = SERVICE__SERVICE;

	/**
	 * The number of structural features of the '<em>Storage Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Storage Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_SERVICE_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.SystemImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 15;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__BASE_COMPONENT = 2;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.OrchestratingServerImpl <em>Orchestrating Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.OrchestratingServerImpl
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getOrchestratingServer()
	 * @generated
	 */
	int ORCHESTRATING_SERVER = 16;

	/**
	 * The feature id for the '<em><b>Orchestratingagent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATING_SERVER__ORCHESTRATINGAGENT = 0;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATING_SERVER__BASE_COMPONENT = 1;

	/**
	 * The number of structural features of the '<em>Orchestrating Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATING_SERVER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Orchestrating Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATING_SERVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.BrokerType <em>Broker Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.BrokerType
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getBrokerType()
	 * @generated
	 */
	int BROKER_TYPE = 17;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DDSType <em>DDS Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DDSType
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getDDSType()
	 * @generated
	 */
	int DDS_TYPE = 18;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.PortType <em>Port Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.PortType
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 19;


	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Service#getImageURL <em>Image URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image URL</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Service#getImageURL()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_ImageURL();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Service#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ports</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Service#getPorts()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Ports();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Service#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Volumes</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Service#getVolumes()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Volumes();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Service#getDepends <em>Depends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Depends</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Service#getDepends()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Depends();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Service#getServicePriority <em>Service Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Priority</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Service#getServicePriority()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_ServicePriority();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Service#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Service#getBase_Class()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Service#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Service#getService()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Service();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.MQTTBroker <em>MQTT Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MQTT Broker</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.MQTTBroker
	 * @generated
	 */
	EClass getMQTTBroker();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.MQTTBroker#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.MQTTBroker#getType()
	 * @see #getMQTTBroker()
	 * @generated
	 */
	EAttribute getMQTTBroker_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.MQTTBroker#isAnonymous <em>Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anonymous</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.MQTTBroker#isAnonymous()
	 * @see #getMQTTBroker()
	 * @generated
	 */
	EAttribute getMQTTBroker_Anonymous();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.MQTTBroker#isPersistence <em>Persistence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistence</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.MQTTBroker#isPersistence()
	 * @see #getMQTTBroker()
	 * @generated
	 */
	EAttribute getMQTTBroker_Persistence();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.MQTTBroker#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.MQTTBroker#getUsername()
	 * @see #getMQTTBroker()
	 * @generated
	 */
	EAttribute getMQTTBroker_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.MQTTBroker#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.MQTTBroker#getPassword()
	 * @see #getMQTTBroker()
	 * @generated
	 */
	EAttribute getMQTTBroker_Password();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.OrchestratingAgent <em>Orchestrating Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orchestrating Agent</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.OrchestratingAgent
	 * @generated
	 */
	EClass getOrchestratingAgent();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.OrchestratingAgent#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Configuration</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.OrchestratingAgent#getConfiguration()
	 * @see #getOrchestratingAgent()
	 * @generated
	 */
	EAttribute getOrchestratingAgent_Configuration();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.OrchestratingAgent#getBase_Constraint <em>Base Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Constraint</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.OrchestratingAgent#getBase_Constraint()
	 * @see #getOrchestratingAgent()
	 * @generated
	 */
	EReference getOrchestratingAgent_Base_Constraint();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.EndUserApplication <em>End User Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End User Application</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.EndUserApplication
	 * @generated
	 */
	EClass getEndUserApplication();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.EndUserApplication#getCustomConf <em>Custom Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Conf</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.EndUserApplication#getCustomConf()
	 * @see #getEndUserApplication()
	 * @generated
	 */
	EAttribute getEndUserApplication_CustomConf();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CloudOrchestrator <em>Cloud Orchestrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Orchestrator</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CloudOrchestrator
	 * @generated
	 */
	EClass getCloudOrchestrator();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.FogNode <em>Fog Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fog Node</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.FogNode
	 * @generated
	 */
	EClass getFogNode();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.FogNode#getClients <em>Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clients</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.FogNode#getClients()
	 * @see #getFogNode()
	 * @generated
	 */
	EReference getFogNode_Clients();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.FogNode#getDeviceresources <em>Deviceresources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deviceresources</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.FogNode#getDeviceresources()
	 * @see #getFogNode()
	 * @generated
	 */
	EReference getFogNode_Deviceresources();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.FogNode#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Container</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.FogNode#getContainer()
	 * @see #getFogNode()
	 * @generated
	 */
	EReference getFogNode_Container();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.FogNode#getDevicenode <em>Devicenode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Devicenode</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.FogNode#getDevicenode()
	 * @see #getFogNode()
	 * @generated
	 */
	EReference getFogNode_Devicenode();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Node#getOpSystem <em>Op System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op System</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Node#getOpSystem()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_OpSystem();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Node#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Node#getBase_Component()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Base_Component();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Node#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Node#getMemory()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Memory();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceNode <em>Device Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Node</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceNode
	 * @generated
	 */
	EClass getDeviceNode();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceNode#getDeviceresources <em>Deviceresources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deviceresources</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceNode#getDeviceresources()
	 * @see #getDeviceNode()
	 * @generated
	 */
	EReference getDeviceNode_Deviceresources();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceNode#getPysicalDevice <em>Pysical Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pysical Device</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceNode#getPysicalDevice()
	 * @see #getDeviceNode()
	 * @generated
	 */
	EReference getDeviceNode_PysicalDevice();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceResources <em>Device Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Resources</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceResources
	 * @generated
	 */
	EClass getDeviceResources();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceResources#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceResources#getPath()
	 * @see #getDeviceResources()
	 * @generated
	 */
	EAttribute getDeviceResources_Path();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceResources#getBase_Comment <em>Base Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Comment</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceResources#getBase_Comment()
	 * @see #getDeviceResources()
	 * @generated
	 */
	EReference getDeviceResources_Base_Comment();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.FogOrchestrator <em>Fog Orchestrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fog Orchestrator</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.FogOrchestrator
	 * @generated
	 */
	EClass getFogOrchestrator();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Container#getServiceHosted <em>Service Hosted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Hosted</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Container#getServiceHosted()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_ServiceHosted();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Container#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Container#getBase_Component()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Base_Component();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CloudNode <em>Cloud Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Node</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CloudNode
	 * @generated
	 */
	EClass getCloudNode();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CloudNode#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Container</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CloudNode#getContainer()
	 * @see #getCloudNode()
	 * @generated
	 */
	EReference getCloudNode_Container();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CloudNode#getCloudresources <em>Cloudresources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cloudresources</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CloudNode#getCloudresources()
	 * @see #getCloudNode()
	 * @generated
	 */
	EReference getCloudNode_Cloudresources();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.ExternalService <em>External Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Service</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.ExternalService
	 * @generated
	 */
	EClass getExternalService();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DataDistributionService <em>Data Distribution Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Distribution Service</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DataDistributionService
	 * @generated
	 */
	EClass getDataDistributionService();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DataDistributionService#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DataDistributionService#getType()
	 * @see #getDataDistributionService()
	 * @generated
	 */
	EAttribute getDataDistributionService_Type();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.StorageService <em>Storage Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Service</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.StorageService
	 * @generated
	 */
	EClass getStorageService();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.System#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Node</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.System#getNode()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Node();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.System#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.System#getBase_Component()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Base_Component();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.OrchestratingServer <em>Orchestrating Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orchestrating Server</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.OrchestratingServer
	 * @generated
	 */
	EClass getOrchestratingServer();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.OrchestratingServer#getOrchestratingagent <em>Orchestratingagent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Orchestratingagent</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.OrchestratingServer#getOrchestratingagent()
	 * @see #getOrchestratingServer()
	 * @generated
	 */
	EReference getOrchestratingServer_Orchestratingagent();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.OrchestratingServer#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.OrchestratingServer#getBase_Component()
	 * @see #getOrchestratingServer()
	 * @generated
	 */
	EReference getOrchestratingServer_Base_Component();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.BrokerType <em>Broker Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Broker Type</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.BrokerType
	 * @generated
	 */
	EEnum getBrokerType();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DDSType <em>DDS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DDS Type</em>'.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DDSType
	 * @generated
	 */
	EEnum getDDSType();

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
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.ServiceImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Image URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__IMAGE_URL = eINSTANCE.getService_ImageURL();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__PORTS = eINSTANCE.getService_Ports();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__VOLUMES = eINSTANCE.getService_Volumes();

		/**
		 * The meta object literal for the '<em><b>Depends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__DEPENDS = eINSTANCE.getService_Depends();

		/**
		 * The meta object literal for the '<em><b>Service Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__SERVICE_PRIORITY = eINSTANCE.getService_ServicePriority();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__BASE_CLASS = eINSTANCE.getService_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SERVICE = eINSTANCE.getService_Service();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.MQTTBrokerImpl <em>MQTT Broker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.MQTTBrokerImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getMQTTBroker()
		 * @generated
		 */
		EClass MQTT_BROKER = eINSTANCE.getMQTTBroker();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MQTT_BROKER__TYPE = eINSTANCE.getMQTTBroker_Type();

		/**
		 * The meta object literal for the '<em><b>Anonymous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MQTT_BROKER__ANONYMOUS = eINSTANCE.getMQTTBroker_Anonymous();

		/**
		 * The meta object literal for the '<em><b>Persistence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MQTT_BROKER__PERSISTENCE = eINSTANCE.getMQTTBroker_Persistence();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MQTT_BROKER__USERNAME = eINSTANCE.getMQTTBroker_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MQTT_BROKER__PASSWORD = eINSTANCE.getMQTTBroker_Password();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.OrchestratingAgentImpl <em>Orchestrating Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.OrchestratingAgentImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getOrchestratingAgent()
		 * @generated
		 */
		EClass ORCHESTRATING_AGENT = eINSTANCE.getOrchestratingAgent();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORCHESTRATING_AGENT__CONFIGURATION = eINSTANCE.getOrchestratingAgent_Configuration();

		/**
		 * The meta object literal for the '<em><b>Base Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORCHESTRATING_AGENT__BASE_CONSTRAINT = eINSTANCE.getOrchestratingAgent_Base_Constraint();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.EndUserApplicationImpl <em>End User Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.EndUserApplicationImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getEndUserApplication()
		 * @generated
		 */
		EClass END_USER_APPLICATION = eINSTANCE.getEndUserApplication();

		/**
		 * The meta object literal for the '<em><b>Custom Conf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_USER_APPLICATION__CUSTOM_CONF = eINSTANCE.getEndUserApplication_CustomConf();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CloudOrchestratorImpl <em>Cloud Orchestrator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CloudOrchestratorImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getCloudOrchestrator()
		 * @generated
		 */
		EClass CLOUD_ORCHESTRATOR = eINSTANCE.getCloudOrchestrator();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.FogNodeImpl <em>Fog Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.FogNodeImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getFogNode()
		 * @generated
		 */
		EClass FOG_NODE = eINSTANCE.getFogNode();

		/**
		 * The meta object literal for the '<em><b>Clients</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG_NODE__CLIENTS = eINSTANCE.getFogNode_Clients();

		/**
		 * The meta object literal for the '<em><b>Deviceresources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG_NODE__DEVICERESOURCES = eINSTANCE.getFogNode_Deviceresources();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG_NODE__CONTAINER = eINSTANCE.getFogNode_Container();

		/**
		 * The meta object literal for the '<em><b>Devicenode</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOG_NODE__DEVICENODE = eINSTANCE.getFogNode_Devicenode();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.NodeImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Op System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__OP_SYSTEM = eINSTANCE.getNode_OpSystem();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__BASE_COMPONENT = eINSTANCE.getNode_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__MEMORY = eINSTANCE.getNode_Memory();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.DeviceNodeImpl <em>Device Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.DeviceNodeImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getDeviceNode()
		 * @generated
		 */
		EClass DEVICE_NODE = eINSTANCE.getDeviceNode();

		/**
		 * The meta object literal for the '<em><b>Deviceresources</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_NODE__DEVICERESOURCES = eINSTANCE.getDeviceNode_Deviceresources();

		/**
		 * The meta object literal for the '<em><b>Pysical Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_NODE__PYSICAL_DEVICE = eINSTANCE.getDeviceNode_PysicalDevice();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.DeviceResourcesImpl <em>Device Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.DeviceResourcesImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getDeviceResources()
		 * @generated
		 */
		EClass DEVICE_RESOURCES = eINSTANCE.getDeviceResources();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_RESOURCES__PATH = eINSTANCE.getDeviceResources_Path();

		/**
		 * The meta object literal for the '<em><b>Base Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_RESOURCES__BASE_COMMENT = eINSTANCE.getDeviceResources_Base_Comment();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.FogOrchestratorImpl <em>Fog Orchestrator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.FogOrchestratorImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getFogOrchestrator()
		 * @generated
		 */
		EClass FOG_ORCHESTRATOR = eINSTANCE.getFogOrchestrator();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.ContainerImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Service Hosted</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__SERVICE_HOSTED = eINSTANCE.getContainer_ServiceHosted();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__BASE_COMPONENT = eINSTANCE.getContainer_Base_Component();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CloudNodeImpl <em>Cloud Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CloudNodeImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getCloudNode()
		 * @generated
		 */
		EClass CLOUD_NODE = eINSTANCE.getCloudNode();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_NODE__CONTAINER = eINSTANCE.getCloudNode_Container();

		/**
		 * The meta object literal for the '<em><b>Cloudresources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_NODE__CLOUDRESOURCES = eINSTANCE.getCloudNode_Cloudresources();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.ExternalServiceImpl <em>External Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.ExternalServiceImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getExternalService()
		 * @generated
		 */
		EClass EXTERNAL_SERVICE = eINSTANCE.getExternalService();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.DataDistributionServiceImpl <em>Data Distribution Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.DataDistributionServiceImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getDataDistributionService()
		 * @generated
		 */
		EClass DATA_DISTRIBUTION_SERVICE = eINSTANCE.getDataDistributionService();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DISTRIBUTION_SERVICE__TYPE = eINSTANCE.getDataDistributionService_Type();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.StorageServiceImpl <em>Storage Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.StorageServiceImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getStorageService()
		 * @generated
		 */
		EClass STORAGE_SERVICE = eINSTANCE.getStorageService();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.SystemImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__NODE = eINSTANCE.getSystem_Node();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__BASE_COMPONENT = eINSTANCE.getSystem_Base_Component();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.OrchestratingServerImpl <em>Orchestrating Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.OrchestratingServerImpl
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getOrchestratingServer()
		 * @generated
		 */
		EClass ORCHESTRATING_SERVER = eINSTANCE.getOrchestratingServer();

		/**
		 * The meta object literal for the '<em><b>Orchestratingagent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORCHESTRATING_SERVER__ORCHESTRATINGAGENT = eINSTANCE.getOrchestratingServer_Orchestratingagent();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORCHESTRATING_SERVER__BASE_COMPONENT = eINSTANCE.getOrchestratingServer_Base_Component();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.BrokerType <em>Broker Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.BrokerType
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getBrokerType()
		 * @generated
		 */
		EEnum BROKER_TYPE = eINSTANCE.getBrokerType();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DDSType <em>DDS Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DDSType
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getDDSType()
		 * @generated
		 */
		EEnum DDS_TYPE = eINSTANCE.getDDSType();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.PortType <em>Port Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.PortType
		 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl#getPortType()
		 * @generated
		 */
		EEnum PORT_TYPE = eINSTANCE.getPortType();

	}

} //CHESSIoTDeploymentPackage
