/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.sysml.SysmlPackage;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

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

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CHESSIoTDeploymentPackageImpl extends EPackageImpl implements CHESSIoTDeploymentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mqttBrokerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orchestratingAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endUserApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudOrchestratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fogNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceResourcesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fogOrchestratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDistributionServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orchestratingServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum brokerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ddsTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum portTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CHESSIoTDeploymentPackageImpl() {
		super(eNS_URI, CHESSIoTDeploymentFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CHESSIoTDeploymentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CHESSIoTDeploymentPackage init() {
		if (isInited) return (CHESSIoTDeploymentPackage)EPackage.Registry.INSTANCE.getEPackage(CHESSIoTDeploymentPackage.eNS_URI);

		// Obtain or create and register package
		CHESSIoTDeploymentPackageImpl theCHESSIoTDeploymentPackage = (CHESSIoTDeploymentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CHESSIoTDeploymentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CHESSIoTDeploymentPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SysmlPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CHESSIoTSoftwarePackageImpl theCHESSIoTSoftwarePackage = (CHESSIoTSoftwarePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CHESSIoTSoftwarePackage.eNS_URI) instanceof CHESSIoTSoftwarePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CHESSIoTSoftwarePackage.eNS_URI) : CHESSIoTSoftwarePackage.eINSTANCE);
		CHESSIoTSystemPackageImpl theCHESSIoTSystemPackage = (CHESSIoTSystemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CHESSIoTSystemPackage.eNS_URI) instanceof CHESSIoTSystemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CHESSIoTSystemPackage.eNS_URI) : CHESSIoTSystemPackage.eINSTANCE);

		// Create package meta-data objects
		theCHESSIoTDeploymentPackage.createPackageContents();
		theCHESSIoTSoftwarePackage.createPackageContents();
		theCHESSIoTSystemPackage.createPackageContents();

		// Initialize created meta-data
		theCHESSIoTDeploymentPackage.initializePackageContents();
		theCHESSIoTSoftwarePackage.initializePackageContents();
		theCHESSIoTSystemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCHESSIoTDeploymentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CHESSIoTDeploymentPackage.eNS_URI, theCHESSIoTDeploymentPackage);
		return theCHESSIoTDeploymentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Name() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_ImageURL() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Ports() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Volumes() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Depends() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_ServicePriority() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Base_Class() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Service() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMQTTBroker() {
		return mqttBrokerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMQTTBroker_Type() {
		return (EAttribute)mqttBrokerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMQTTBroker_Anonymous() {
		return (EAttribute)mqttBrokerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMQTTBroker_Persistence() {
		return (EAttribute)mqttBrokerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMQTTBroker_Username() {
		return (EAttribute)mqttBrokerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMQTTBroker_Password() {
		return (EAttribute)mqttBrokerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrchestratingAgent() {
		return orchestratingAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrchestratingAgent_Configuration() {
		return (EAttribute)orchestratingAgentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrchestratingAgent_Base_Constraint() {
		return (EReference)orchestratingAgentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndUserApplication() {
		return endUserApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndUserApplication_CustomConf() {
		return (EAttribute)endUserApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudOrchestrator() {
		return cloudOrchestratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFogNode() {
		return fogNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFogNode_Clients() {
		return (EReference)fogNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFogNode_Deviceresources() {
		return (EReference)fogNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFogNode_Container() {
		return (EReference)fogNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFogNode_Devicenode() {
		return (EReference)fogNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Name() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_OpSystem() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Base_Component() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Memory() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceNode() {
		return deviceNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceNode_Deviceresources() {
		return (EReference)deviceNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceNode_PysicalDevice() {
		return (EReference)deviceNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceResources() {
		return deviceResourcesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceResources_Path() {
		return (EAttribute)deviceResourcesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceResources_Base_Comment() {
		return (EReference)deviceResourcesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFogOrchestrator() {
		return fogOrchestratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_ServiceHosted() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Base_Component() {
		return (EReference)containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudNode() {
		return cloudNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudNode_Container() {
		return (EReference)cloudNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudNode_Cloudresources() {
		return (EReference)cloudNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalService() {
		return externalServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataDistributionService() {
		return dataDistributionServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDistributionService_Type() {
		return (EAttribute)dataDistributionServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorageService() {
		return storageServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Node() {
		return (EReference)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Name() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Base_Component() {
		return (EReference)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrchestratingServer() {
		return orchestratingServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrchestratingServer_Orchestratingagent() {
		return (EReference)orchestratingServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrchestratingServer_Base_Component() {
		return (EReference)orchestratingServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBrokerType() {
		return brokerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDDSType() {
		return ddsTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPortType() {
		return portTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTDeploymentFactory getCHESSIoTDeploymentFactory() {
		return (CHESSIoTDeploymentFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__NAME);
		createEAttribute(serviceEClass, SERVICE__IMAGE_URL);
		createEAttribute(serviceEClass, SERVICE__PORTS);
		createEAttribute(serviceEClass, SERVICE__VOLUMES);
		createEReference(serviceEClass, SERVICE__DEPENDS);
		createEAttribute(serviceEClass, SERVICE__SERVICE_PRIORITY);
		createEReference(serviceEClass, SERVICE__BASE_CLASS);
		createEReference(serviceEClass, SERVICE__SERVICE);

		mqttBrokerEClass = createEClass(MQTT_BROKER);
		createEAttribute(mqttBrokerEClass, MQTT_BROKER__TYPE);
		createEAttribute(mqttBrokerEClass, MQTT_BROKER__ANONYMOUS);
		createEAttribute(mqttBrokerEClass, MQTT_BROKER__PERSISTENCE);
		createEAttribute(mqttBrokerEClass, MQTT_BROKER__USERNAME);
		createEAttribute(mqttBrokerEClass, MQTT_BROKER__PASSWORD);

		orchestratingAgentEClass = createEClass(ORCHESTRATING_AGENT);
		createEAttribute(orchestratingAgentEClass, ORCHESTRATING_AGENT__CONFIGURATION);
		createEReference(orchestratingAgentEClass, ORCHESTRATING_AGENT__BASE_CONSTRAINT);

		endUserApplicationEClass = createEClass(END_USER_APPLICATION);
		createEAttribute(endUserApplicationEClass, END_USER_APPLICATION__CUSTOM_CONF);

		cloudOrchestratorEClass = createEClass(CLOUD_ORCHESTRATOR);

		fogNodeEClass = createEClass(FOG_NODE);
		createEReference(fogNodeEClass, FOG_NODE__CLIENTS);
		createEReference(fogNodeEClass, FOG_NODE__DEVICERESOURCES);
		createEReference(fogNodeEClass, FOG_NODE__CONTAINER);
		createEReference(fogNodeEClass, FOG_NODE__DEVICENODE);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NAME);
		createEAttribute(nodeEClass, NODE__OP_SYSTEM);
		createEReference(nodeEClass, NODE__BASE_COMPONENT);
		createEAttribute(nodeEClass, NODE__MEMORY);

		deviceNodeEClass = createEClass(DEVICE_NODE);
		createEReference(deviceNodeEClass, DEVICE_NODE__DEVICERESOURCES);
		createEReference(deviceNodeEClass, DEVICE_NODE__PYSICAL_DEVICE);

		deviceResourcesEClass = createEClass(DEVICE_RESOURCES);
		createEAttribute(deviceResourcesEClass, DEVICE_RESOURCES__PATH);
		createEReference(deviceResourcesEClass, DEVICE_RESOURCES__BASE_COMMENT);

		fogOrchestratorEClass = createEClass(FOG_ORCHESTRATOR);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__SERVICE_HOSTED);
		createEReference(containerEClass, CONTAINER__BASE_COMPONENT);

		cloudNodeEClass = createEClass(CLOUD_NODE);
		createEReference(cloudNodeEClass, CLOUD_NODE__CONTAINER);
		createEReference(cloudNodeEClass, CLOUD_NODE__CLOUDRESOURCES);

		externalServiceEClass = createEClass(EXTERNAL_SERVICE);

		dataDistributionServiceEClass = createEClass(DATA_DISTRIBUTION_SERVICE);
		createEAttribute(dataDistributionServiceEClass, DATA_DISTRIBUTION_SERVICE__TYPE);

		storageServiceEClass = createEClass(STORAGE_SERVICE);

		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__NODE);
		createEAttribute(systemEClass, SYSTEM__NAME);
		createEReference(systemEClass, SYSTEM__BASE_COMPONENT);

		orchestratingServerEClass = createEClass(ORCHESTRATING_SERVER);
		createEReference(orchestratingServerEClass, ORCHESTRATING_SERVER__ORCHESTRATINGAGENT);
		createEReference(orchestratingServerEClass, ORCHESTRATING_SERVER__BASE_COMPONENT);

		// Create enums
		brokerTypeEEnum = createEEnum(BROKER_TYPE);
		ddsTypeEEnum = createEEnum(DDS_TYPE);
		portTypeEEnum = createEEnum(PORT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		CHESSIoTSoftwarePackage theCHESSIoTSoftwarePackage = (CHESSIoTSoftwarePackage)EPackage.Registry.INSTANCE.getEPackage(CHESSIoTSoftwarePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mqttBrokerEClass.getESuperTypes().add(this.getService());
		endUserApplicationEClass.getESuperTypes().add(this.getService());
		cloudOrchestratorEClass.getESuperTypes().add(this.getOrchestratingAgent());
		fogNodeEClass.getESuperTypes().add(this.getNode());
		deviceNodeEClass.getESuperTypes().add(this.getNode());
		fogOrchestratorEClass.getESuperTypes().add(this.getOrchestratingAgent());
		cloudNodeEClass.getESuperTypes().add(this.getNode());
		externalServiceEClass.getESuperTypes().add(this.getService());
		dataDistributionServiceEClass.getESuperTypes().add(this.getService());
		storageServiceEClass.getESuperTypes().add(this.getService());

		// Initialize classes, features, and operations; add parameters
		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Name(), theTypesPackage.getString(), "name", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getService_ImageURL(), theTypesPackage.getString(), "imageURL", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getService_Ports(), theTypesPackage.getString(), "ports", null, 1, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getService_Volumes(), theTypesPackage.getString(), "volumes", null, 1, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getService_Depends(), this.getService(), null, "depends", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getService_ServicePriority(), theTypesPackage.getInteger(), "servicePriority", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getService_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getService_Service(), this.getService(), null, "service", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(mqttBrokerEClass, MQTTBroker.class, "MQTTBroker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMQTTBroker_Type(), this.getBrokerType(), "type", null, 1, 1, MQTTBroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMQTTBroker_Anonymous(), theTypesPackage.getBoolean(), "anonymous", null, 1, 1, MQTTBroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMQTTBroker_Persistence(), theTypesPackage.getBoolean(), "persistence", null, 1, 1, MQTTBroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMQTTBroker_Username(), theTypesPackage.getString(), "username", null, 1, 1, MQTTBroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMQTTBroker_Password(), theTypesPackage.getString(), "password", null, 1, 1, MQTTBroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(orchestratingAgentEClass, OrchestratingAgent.class, "OrchestratingAgent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrchestratingAgent_Configuration(), theTypesPackage.getString(), "configuration", null, 1, -1, OrchestratingAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOrchestratingAgent_Base_Constraint(), theUMLPackage.getConstraint(), null, "base_Constraint", null, 1, 1, OrchestratingAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(endUserApplicationEClass, EndUserApplication.class, "EndUserApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndUserApplication_CustomConf(), theTypesPackage.getString(), "customConf", null, 1, 1, EndUserApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cloudOrchestratorEClass, CloudOrchestrator.class, "CloudOrchestrator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fogNodeEClass, FogNode.class, "FogNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFogNode_Clients(), this.getDeviceNode(), null, "clients", null, 1, -1, FogNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFogNode_Deviceresources(), this.getFogOrchestrator(), null, "deviceresources", null, 1, -1, FogNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFogNode_Container(), this.getContainer(), null, "container", null, 1, -1, FogNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFogNode_Devicenode(), this.getDeviceNode(), null, "devicenode", null, 1, -1, FogNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Name(), theTypesPackage.getString(), "name", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNode_OpSystem(), theTypesPackage.getString(), "opSystem", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNode_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNode_Memory(), theTypesPackage.getString(), "memory", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(deviceNodeEClass, DeviceNode.class, "DeviceNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceNode_Deviceresources(), this.getDeviceResources(), null, "deviceresources", null, 1, 1, DeviceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeviceNode_PysicalDevice(), theCHESSIoTSoftwarePackage.getVirtualBoard(), null, "pysicalDevice", null, 1, 1, DeviceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(deviceResourcesEClass, DeviceResources.class, "DeviceResources", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceResources_Path(), theTypesPackage.getString(), "path", null, 1, 1, DeviceResources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeviceResources_Base_Comment(), theUMLPackage.getComment(), null, "base_Comment", null, 1, 1, DeviceResources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(fogOrchestratorEClass, FogOrchestrator.class, "FogOrchestrator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containerEClass, org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_ServiceHosted(), this.getService(), null, "serviceHosted", null, 1, 1, org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getContainer_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cloudNodeEClass, CloudNode.class, "CloudNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCloudNode_Container(), this.getContainer(), null, "container", null, 1, -1, CloudNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCloudNode_Cloudresources(), this.getCloudOrchestrator(), null, "cloudresources", null, 1, -1, CloudNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(externalServiceEClass, ExternalService.class, "ExternalService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataDistributionServiceEClass, DataDistributionService.class, "DataDistributionService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataDistributionService_Type(), this.getDDSType(), "type", null, 1, 1, DataDistributionService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(storageServiceEClass, StorageService.class, "StorageService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemEClass, org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Node(), this.getNode(), null, "node", null, 1, -1, org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSystem_Name(), theTypesPackage.getString(), "name", null, 1, 1, org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSystem_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(orchestratingServerEClass, OrchestratingServer.class, "OrchestratingServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrchestratingServer_Orchestratingagent(), this.getOrchestratingAgent(), null, "orchestratingagent", null, 1, -1, OrchestratingServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOrchestratingServer_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, OrchestratingServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(brokerTypeEEnum, BrokerType.class, "BrokerType");
		addEEnumLiteral(brokerTypeEEnum, BrokerType.MOSQUITTO);
		addEEnumLiteral(brokerTypeEEnum, BrokerType.HIVEMQ);
		addEEnumLiteral(brokerTypeEEnum, BrokerType.MOQUETTE);

		initEEnum(ddsTypeEEnum, DDSType.class, "DDSType");
		addEEnumLiteral(ddsTypeEEnum, DDSType.KAFKA);
		addEEnumLiteral(ddsTypeEEnum, DDSType.RABBIT_MQ);
		addEEnumLiteral(ddsTypeEEnum, DDSType.APACHE_SPARK);

		initEEnum(portTypeEEnum, PortType.class, "PortType");
		addEEnumLiteral(portTypeEEnum, PortType.UDP);
		addEEnumLiteral(portTypeEEnum, PortType.TCP);
		addEEnumLiteral(portTypeEEnum, PortType.OTHER);

		// Create resource
		createResource(eNS_URI);
	}

} //CHESSIoTDeploymentPackageImpl
