/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.BrokerType;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentFactory;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CloudNode;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CloudOrchestrator;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DDSType;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DataDistributionService;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceNode;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceResources;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.EndUserApplication;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.ExternalService;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.FogNode;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.FogOrchestrator;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.MQTTBroker;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Node;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.OrchestratingAgent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.OrchestratingServer;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.PortType;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Service;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.StorageService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CHESSIoTDeploymentFactoryImpl extends EFactoryImpl implements CHESSIoTDeploymentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CHESSIoTDeploymentFactory init() {
		try {
			CHESSIoTDeploymentFactory theCHESSIoTDeploymentFactory = (CHESSIoTDeploymentFactory)EPackage.Registry.INSTANCE.getEFactory(CHESSIoTDeploymentPackage.eNS_URI);
			if (theCHESSIoTDeploymentFactory != null) {
				return theCHESSIoTDeploymentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CHESSIoTDeploymentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTDeploymentFactoryImpl() {
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
			case CHESSIoTDeploymentPackage.SERVICE: return createService();
			case CHESSIoTDeploymentPackage.MQTT_BROKER: return createMQTTBroker();
			case CHESSIoTDeploymentPackage.ORCHESTRATING_AGENT: return createOrchestratingAgent();
			case CHESSIoTDeploymentPackage.END_USER_APPLICATION: return createEndUserApplication();
			case CHESSIoTDeploymentPackage.CLOUD_ORCHESTRATOR: return createCloudOrchestrator();
			case CHESSIoTDeploymentPackage.FOG_NODE: return createFogNode();
			case CHESSIoTDeploymentPackage.NODE: return createNode();
			case CHESSIoTDeploymentPackage.DEVICE_NODE: return createDeviceNode();
			case CHESSIoTDeploymentPackage.DEVICE_RESOURCES: return createDeviceResources();
			case CHESSIoTDeploymentPackage.FOG_ORCHESTRATOR: return createFogOrchestrator();
			case CHESSIoTDeploymentPackage.CONTAINER: return createContainer();
			case CHESSIoTDeploymentPackage.CLOUD_NODE: return createCloudNode();
			case CHESSIoTDeploymentPackage.EXTERNAL_SERVICE: return createExternalService();
			case CHESSIoTDeploymentPackage.DATA_DISTRIBUTION_SERVICE: return createDataDistributionService();
			case CHESSIoTDeploymentPackage.STORAGE_SERVICE: return createStorageService();
			case CHESSIoTDeploymentPackage.SYSTEM: return createSystem();
			case CHESSIoTDeploymentPackage.ORCHESTRATING_SERVER: return createOrchestratingServer();
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
			case CHESSIoTDeploymentPackage.BROKER_TYPE:
				return createBrokerTypeFromString(eDataType, initialValue);
			case CHESSIoTDeploymentPackage.DDS_TYPE:
				return createDDSTypeFromString(eDataType, initialValue);
			case CHESSIoTDeploymentPackage.PORT_TYPE:
				return createPortTypeFromString(eDataType, initialValue);
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
			case CHESSIoTDeploymentPackage.BROKER_TYPE:
				return convertBrokerTypeToString(eDataType, instanceValue);
			case CHESSIoTDeploymentPackage.DDS_TYPE:
				return convertDDSTypeToString(eDataType, instanceValue);
			case CHESSIoTDeploymentPackage.PORT_TYPE:
				return convertPortTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MQTTBroker createMQTTBroker() {
		MQTTBrokerImpl mqttBroker = new MQTTBrokerImpl();
		return mqttBroker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrchestratingAgent createOrchestratingAgent() {
		OrchestratingAgentImpl orchestratingAgent = new OrchestratingAgentImpl();
		return orchestratingAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndUserApplication createEndUserApplication() {
		EndUserApplicationImpl endUserApplication = new EndUserApplicationImpl();
		return endUserApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudOrchestrator createCloudOrchestrator() {
		CloudOrchestratorImpl cloudOrchestrator = new CloudOrchestratorImpl();
		return cloudOrchestrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FogNode createFogNode() {
		FogNodeImpl fogNode = new FogNodeImpl();
		return fogNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceNode createDeviceNode() {
		DeviceNodeImpl deviceNode = new DeviceNodeImpl();
		return deviceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceResources createDeviceResources() {
		DeviceResourcesImpl deviceResources = new DeviceResourcesImpl();
		return deviceResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FogOrchestrator createFogOrchestrator() {
		FogOrchestratorImpl fogOrchestrator = new FogOrchestratorImpl();
		return fogOrchestrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudNode createCloudNode() {
		CloudNodeImpl cloudNode = new CloudNodeImpl();
		return cloudNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalService createExternalService() {
		ExternalServiceImpl externalService = new ExternalServiceImpl();
		return externalService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDistributionService createDataDistributionService() {
		DataDistributionServiceImpl dataDistributionService = new DataDistributionServiceImpl();
		return dataDistributionService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageService createStorageService() {
		StorageServiceImpl storageService = new StorageServiceImpl();
		return storageService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrchestratingServer createOrchestratingServer() {
		OrchestratingServerImpl orchestratingServer = new OrchestratingServerImpl();
		return orchestratingServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrokerType createBrokerTypeFromString(EDataType eDataType, String initialValue) {
		BrokerType result = BrokerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBrokerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DDSType createDDSTypeFromString(EDataType eDataType, String initialValue) {
		DDSType result = DDSType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDDSTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType createPortTypeFromString(EDataType eDataType, String initialValue) {
		PortType result = PortType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTDeploymentPackage getCHESSIoTDeploymentPackage() {
		return (CHESSIoTDeploymentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CHESSIoTDeploymentPackage getPackage() {
		return CHESSIoTDeploymentPackage.eINSTANCE;
	}

} //CHESSIoTDeploymentFactoryImpl
