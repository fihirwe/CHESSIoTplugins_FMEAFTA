/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.sysml.SysmlPackage;

import org.eclipse.papyrus.sysml.blocks.BlocksPackage;

import org.eclipse.papyrus.sysml.portandflows.PortandflowsPackage;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CHESSIoTOperationalProfilePackage;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CHESSIoTOperationalProfilePackageImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.CHESSIoTSoftwarePackageImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Active;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ActuatingBlock;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ActuatorType;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemFactory;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CommunicationMode;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ComputingBoard;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Connection;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ConsumerEntity;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Gateway;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTPort;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.NodeModel;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Passive;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalElement;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalEntity;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SYSTEM_Hw;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorType;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Server;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CHESSIoTSystemPackageImpl extends EPackageImpl implements CHESSIoTSystemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computingBoardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioTPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatingBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systeM_HwEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consumerEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nodeModelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actuatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sensorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum communicationModeEEnum = null;

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
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CHESSIoTSystemPackageImpl() {
		super(eNS_URI, CHESSIoTSystemFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CHESSIoTSystemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CHESSIoTSystemPackage init() {
		if (isInited) return (CHESSIoTSystemPackage)EPackage.Registry.INSTANCE.getEPackage(CHESSIoTSystemPackage.eNS_URI);

		// Obtain or create and register package
		CHESSIoTSystemPackageImpl theCHESSIoTSystemPackage = (CHESSIoTSystemPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CHESSIoTSystemPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CHESSIoTSystemPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SysmlPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CHESSIoTSoftwarePackageImpl theCHESSIoTSoftwarePackage = (CHESSIoTSoftwarePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CHESSIoTSoftwarePackage.eNS_URI) instanceof CHESSIoTSoftwarePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CHESSIoTSoftwarePackage.eNS_URI) : CHESSIoTSoftwarePackage.eINSTANCE);
		CHESSIoTOperationalProfilePackageImpl theCHESSIoTOperationalProfilePackage = (CHESSIoTOperationalProfilePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CHESSIoTOperationalProfilePackage.eNS_URI) instanceof CHESSIoTOperationalProfilePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CHESSIoTOperationalProfilePackage.eNS_URI) : CHESSIoTOperationalProfilePackage.eINSTANCE);
		CHESSIoTDeploymentPackageImpl theCHESSIoTDeploymentPackage = (CHESSIoTDeploymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CHESSIoTDeploymentPackage.eNS_URI) instanceof CHESSIoTDeploymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CHESSIoTDeploymentPackage.eNS_URI) : CHESSIoTDeploymentPackage.eINSTANCE);

		// Create package meta-data objects
		theCHESSIoTSystemPackage.createPackageContents();
		theCHESSIoTSoftwarePackage.createPackageContents();
		theCHESSIoTOperationalProfilePackage.createPackageContents();
		theCHESSIoTDeploymentPackage.createPackageContents();

		// Initialize created meta-data
		theCHESSIoTSystemPackage.initializePackageContents();
		theCHESSIoTSoftwarePackage.initializePackageContents();
		theCHESSIoTOperationalProfilePackage.initializePackageContents();
		theCHESSIoTDeploymentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCHESSIoTSystemPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CHESSIoTSystemPackage.eNS_URI, theCHESSIoTSystemPackage);
		return theCHESSIoTSystemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputingBoard() {
		return computingBoardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputingBoard_NodeModel() {
		return (EAttribute)computingBoardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputingBoard_Gateway() {
		return (EReference)computingBoardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputingBoard_Actuatingblock() {
		return (EReference)computingBoardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputingBoard_Sensorblock() {
		return (EReference)computingBoardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputingBoard_Physicalentity() {
		return (EReference)computingBoardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalElement() {
		return physicalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalElement_Name() {
		return (EAttribute)physicalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalElement_Latitude() {
		return (EAttribute)physicalElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalElement_Longitude() {
		return (EAttribute)physicalElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalElement_Base_Block() {
		return (EReference)physicalElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalElement_Iotport() {
		return (EReference)physicalElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIoTPort() {
		return ioTPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGateway() {
		return gatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGateway_Gateway() {
		return (EReference)gatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGateway_Server() {
		return (EReference)gatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGateway_Computingboard() {
		return (EReference)gatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServer() {
		return serverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_OpSystem() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Iotport() {
		return (EReference)serverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuatingBlock() {
		return actuatingBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActuatingBlock_ActuationType() {
		return (EAttribute)actuatingBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActuatingBlock_Physicalentity() {
		return (EReference)actuatingBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalEntity() {
		return physicalEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalEntity_Id() {
		return (EAttribute)physicalEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalEntity_Physicalentity() {
		return (EReference)physicalEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorBlock() {
		return sensorBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensorBlock_SensorType() {
		return (EAttribute)sensorBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensorBlock_Physicalentity() {
		return (EReference)sensorBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensorBlock_Computingboard() {
		return (EReference)sensorBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_CommMode() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Base_Connector() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Iotport() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSYSTEM_Hw() {
		return systeM_HwEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSYSTEM_Hw_Base_Block() {
		return (EReference)systeM_HwEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSYSTEM_Hw_Physicalentity() {
		return (EReference)systeM_HwEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSYSTEM_Hw_Iotport() {
		return (EReference)systeM_HwEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSYSTEM_Hw_Server() {
		return (EReference)systeM_HwEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSYSTEM_Hw_Name() {
		return (EAttribute)systeM_HwEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSYSTEM_Hw_System_hw() {
		return (EReference)systeM_HwEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSYSTEM_Hw_Physicalelement() {
		return (EReference)systeM_HwEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsumerEntity() {
		return consumerEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActive() {
		return activeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActive_Server() {
		return (EReference)activeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassive() {
		return passiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassive_Physicalentity() {
		return (EReference)passiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNodeModel() {
		return nodeModelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActuatorType() {
		return actuatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSensorType() {
		return sensorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommunicationMode() {
		return communicationModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTSystemFactory getCHESSIoTSystemFactory() {
		return (CHESSIoTSystemFactory)getEFactoryInstance();
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
		computingBoardEClass = createEClass(COMPUTING_BOARD);
		createEAttribute(computingBoardEClass, COMPUTING_BOARD__NODE_MODEL);
		createEReference(computingBoardEClass, COMPUTING_BOARD__GATEWAY);
		createEReference(computingBoardEClass, COMPUTING_BOARD__ACTUATINGBLOCK);
		createEReference(computingBoardEClass, COMPUTING_BOARD__SENSORBLOCK);
		createEReference(computingBoardEClass, COMPUTING_BOARD__PHYSICALENTITY);

		physicalElementEClass = createEClass(PHYSICAL_ELEMENT);
		createEAttribute(physicalElementEClass, PHYSICAL_ELEMENT__NAME);
		createEAttribute(physicalElementEClass, PHYSICAL_ELEMENT__LATITUDE);
		createEAttribute(physicalElementEClass, PHYSICAL_ELEMENT__LONGITUDE);
		createEReference(physicalElementEClass, PHYSICAL_ELEMENT__BASE_BLOCK);
		createEReference(physicalElementEClass, PHYSICAL_ELEMENT__IOTPORT);

		ioTPortEClass = createEClass(IO_TPORT);

		gatewayEClass = createEClass(GATEWAY);
		createEReference(gatewayEClass, GATEWAY__GATEWAY);
		createEReference(gatewayEClass, GATEWAY__SERVER);
		createEReference(gatewayEClass, GATEWAY__COMPUTINGBOARD);

		serverEClass = createEClass(SERVER);
		createEAttribute(serverEClass, SERVER__OP_SYSTEM);
		createEReference(serverEClass, SERVER__IOTPORT);

		actuatingBlockEClass = createEClass(ACTUATING_BLOCK);
		createEAttribute(actuatingBlockEClass, ACTUATING_BLOCK__ACTUATION_TYPE);
		createEReference(actuatingBlockEClass, ACTUATING_BLOCK__PHYSICALENTITY);

		physicalEntityEClass = createEClass(PHYSICAL_ENTITY);
		createEAttribute(physicalEntityEClass, PHYSICAL_ENTITY__ID);
		createEReference(physicalEntityEClass, PHYSICAL_ENTITY__PHYSICALENTITY);

		sensorBlockEClass = createEClass(SENSOR_BLOCK);
		createEAttribute(sensorBlockEClass, SENSOR_BLOCK__SENSOR_TYPE);
		createEReference(sensorBlockEClass, SENSOR_BLOCK__PHYSICALENTITY);
		createEReference(sensorBlockEClass, SENSOR_BLOCK__COMPUTINGBOARD);

		connectionEClass = createEClass(CONNECTION);
		createEAttribute(connectionEClass, CONNECTION__COMM_MODE);
		createEReference(connectionEClass, CONNECTION__BASE_CONNECTOR);
		createEReference(connectionEClass, CONNECTION__IOTPORT);

		systeM_HwEClass = createEClass(SYSTEM_HW);
		createEReference(systeM_HwEClass, SYSTEM_HW__BASE_BLOCK);
		createEReference(systeM_HwEClass, SYSTEM_HW__PHYSICALENTITY);
		createEReference(systeM_HwEClass, SYSTEM_HW__IOTPORT);
		createEReference(systeM_HwEClass, SYSTEM_HW__SERVER);
		createEAttribute(systeM_HwEClass, SYSTEM_HW__NAME);
		createEReference(systeM_HwEClass, SYSTEM_HW__SYSTEM_HW);
		createEReference(systeM_HwEClass, SYSTEM_HW__PHYSICALELEMENT);

		consumerEntityEClass = createEClass(CONSUMER_ENTITY);

		activeEClass = createEClass(ACTIVE);
		createEReference(activeEClass, ACTIVE__SERVER);

		passiveEClass = createEClass(PASSIVE);
		createEReference(passiveEClass, PASSIVE__PHYSICALENTITY);

		// Create enums
		nodeModelEEnum = createEEnum(NODE_MODEL);
		actuatorTypeEEnum = createEEnum(ACTUATOR_TYPE);
		sensorTypeEEnum = createEEnum(SENSOR_TYPE);
		communicationModeEEnum = createEEnum(COMMUNICATION_MODE);
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
		BlocksPackage theBlocksPackage = (BlocksPackage)EPackage.Registry.INSTANCE.getEPackage(BlocksPackage.eNS_URI);
		PortandflowsPackage thePortandflowsPackage = (PortandflowsPackage)EPackage.Registry.INSTANCE.getEPackage(PortandflowsPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		computingBoardEClass.getESuperTypes().add(this.getPhysicalElement());
		ioTPortEClass.getESuperTypes().add(thePortandflowsPackage.getFlowPort());
		gatewayEClass.getESuperTypes().add(this.getPhysicalElement());
		serverEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		actuatingBlockEClass.getESuperTypes().add(this.getPhysicalElement());
		physicalEntityEClass.getESuperTypes().add(this.getPhysicalElement());
		sensorBlockEClass.getESuperTypes().add(this.getPhysicalElement());
		consumerEntityEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		activeEClass.getESuperTypes().add(this.getConsumerEntity());
		passiveEClass.getESuperTypes().add(this.getConsumerEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(computingBoardEClass, ComputingBoard.class, "ComputingBoard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComputingBoard_NodeModel(), this.getNodeModel(), "nodeModel", null, 1, 1, ComputingBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComputingBoard_Gateway(), this.getGateway(), this.getGateway_Computingboard(), "gateway", null, 1, 1, ComputingBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComputingBoard_Actuatingblock(), this.getActuatingBlock(), null, "actuatingblock", null, 1, 1, ComputingBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComputingBoard_Sensorblock(), this.getSensorBlock(), this.getSensorBlock_Computingboard(), "sensorblock", null, 1, 1, ComputingBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComputingBoard_Physicalentity(), this.getPhysicalEntity(), null, "physicalentity", null, 1, 1, ComputingBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(physicalElementEClass, PhysicalElement.class, "PhysicalElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhysicalElement_Name(), theTypesPackage.getString(), "name", null, 1, 1, PhysicalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPhysicalElement_Latitude(), theTypesPackage.getString(), "latitude", null, 1, 1, PhysicalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPhysicalElement_Longitude(), theTypesPackage.getString(), "longitude", null, 1, 1, PhysicalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPhysicalElement_Base_Block(), theBlocksPackage.getBlock(), null, "base_Block", null, 1, 1, PhysicalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPhysicalElement_Iotport(), this.getIoTPort(), null, "iotport", null, 1, 1, PhysicalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ioTPortEClass, IoTPort.class, "IoTPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gatewayEClass, Gateway.class, "Gateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGateway_Gateway(), this.getGateway(), null, "gateway", null, 1, 1, Gateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGateway_Server(), this.getServer(), null, "server", null, 1, 1, Gateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGateway_Computingboard(), this.getComputingBoard(), this.getComputingBoard_Gateway(), "computingboard", null, 1, 1, Gateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(serverEClass, Server.class, "Server", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServer_OpSystem(), theTypesPackage.getString(), "opSystem", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServer_Iotport(), this.getIoTPort(), null, "iotport", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(actuatingBlockEClass, ActuatingBlock.class, "ActuatingBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActuatingBlock_ActuationType(), this.getActuatorType(), "actuationType", null, 1, 1, ActuatingBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActuatingBlock_Physicalentity(), this.getPhysicalEntity(), null, "physicalentity", null, 1, 1, ActuatingBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(physicalEntityEClass, PhysicalEntity.class, "PhysicalEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhysicalEntity_Id(), theTypesPackage.getInteger(), "id", null, 1, 1, PhysicalEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPhysicalEntity_Physicalentity(), this.getPhysicalEntity(), null, "physicalentity", null, 1, 1, PhysicalEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sensorBlockEClass, SensorBlock.class, "SensorBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensorBlock_SensorType(), this.getSensorType(), "sensorType", null, 1, 1, SensorBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSensorBlock_Physicalentity(), this.getPhysicalEntity(), null, "physicalentity", null, 1, 1, SensorBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSensorBlock_Computingboard(), this.getComputingBoard(), this.getComputingBoard_Sensorblock(), "computingboard", null, 1, 1, SensorBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnection_CommMode(), this.getCommunicationMode(), "commMode", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnection_Base_Connector(), theUMLPackage.getConnector(), null, "base_Connector", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnection_Iotport(), this.getIoTPort(), null, "iotport", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(systeM_HwEClass, SYSTEM_Hw.class, "SYSTEM_Hw", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSYSTEM_Hw_Base_Block(), theBlocksPackage.getBlock(), null, "base_Block", null, 1, 1, SYSTEM_Hw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSYSTEM_Hw_Physicalentity(), this.getPhysicalEntity(), null, "physicalentity", null, 1, 1, SYSTEM_Hw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSYSTEM_Hw_Iotport(), this.getIoTPort(), null, "iotport", null, 1, 1, SYSTEM_Hw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSYSTEM_Hw_Server(), this.getServer(), null, "server", null, 1, 1, SYSTEM_Hw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSYSTEM_Hw_Name(), theTypesPackage.getString(), "name", null, 1, 1, SYSTEM_Hw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSYSTEM_Hw_System_hw(), this.getSYSTEM_Hw(), null, "system_hw", null, 1, 1, SYSTEM_Hw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSYSTEM_Hw_Physicalelement(), this.getPhysicalElement(), null, "physicalelement", null, 1, 1, SYSTEM_Hw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(consumerEntityEClass, ConsumerEntity.class, "ConsumerEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activeEClass, Active.class, "Active", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActive_Server(), this.getServer(), null, "server", null, 1, 1, Active.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(passiveEClass, Passive.class, "Passive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPassive_Physicalentity(), this.getPhysicalEntity(), null, "physicalentity", null, 1, 1, Passive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(nodeModelEEnum, NodeModel.class, "NodeModel");
		addEEnumLiteral(nodeModelEEnum, NodeModel.RASBERRY_PI);
		addEEnumLiteral(nodeModelEEnum, NodeModel.ARDUINO);
		addEEnumLiteral(nodeModelEEnum, NodeModel.TEENSY);
		addEEnumLiteral(nodeModelEEnum, NodeModel.BEAGLE_BONE_BLACK);
		addEEnumLiteral(nodeModelEEnum, NodeModel.ADAFRUIT);
		addEEnumLiteral(nodeModelEEnum, NodeModel.OTHER);

		initEEnum(actuatorTypeEEnum, ActuatorType.class, "ActuatorType");
		addEEnumLiteral(actuatorTypeEEnum, ActuatorType.LED);
		addEEnumLiteral(actuatorTypeEEnum, ActuatorType.BUZZER);
		addEEnumLiteral(actuatorTypeEEnum, ActuatorType.SERVO);
		addEEnumLiteral(actuatorTypeEEnum, ActuatorType.OTHER);

		initEEnum(sensorTypeEEnum, SensorType.class, "SensorType");
		addEEnumLiteral(sensorTypeEEnum, SensorType.HUMIDITY);
		addEEnumLiteral(sensorTypeEEnum, SensorType.TEMPERATURE);
		addEEnumLiteral(sensorTypeEEnum, SensorType.GAZ);
		addEEnumLiteral(sensorTypeEEnum, SensorType.MOTION);
		addEEnumLiteral(sensorTypeEEnum, SensorType.ULTRASONIC);
		addEEnumLiteral(sensorTypeEEnum, SensorType.OTHER);

		initEEnum(communicationModeEEnum, CommunicationMode.class, "CommunicationMode");
		addEEnumLiteral(communicationModeEEnum, CommunicationMode.WIRELESS);
		addEEnumLiteral(communicationModeEEnum, CommunicationMode.WIRED);

		// Create resource
		createResource(eNS_URI);
	}

} //CHESSIoTSystemPackageImpl
