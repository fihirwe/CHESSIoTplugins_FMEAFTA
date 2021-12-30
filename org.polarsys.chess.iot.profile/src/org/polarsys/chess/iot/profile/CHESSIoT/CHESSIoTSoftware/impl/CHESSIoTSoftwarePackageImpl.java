/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.sysml.SysmlPackage;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentPackageImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CHESSIoTOperationalProfilePackage;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CHESSIoTOperationalProfilePackageImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Actuator;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwareFactory;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericActIoType;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericEvent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.GenericIoTAction;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTAction;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTEvent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTPort;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.MessageParameters;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.PayloadType;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.ReceivePayload;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Region;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Sensor;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateMachine;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualElement;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VitualComputingNode;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.CHESSIoTSystemPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CHESSIoTSoftwarePackageImpl extends EPackageImpl implements CHESSIoTSoftwarePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualElementEClass = null;

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
	private EClass payloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioTStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioTEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incomingEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receivePayloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioTActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outgoingEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendPayloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericIoTActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitualComputingNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorEClass = null;

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
	private EEnum payloadTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genericActIoTypeEEnum = null;

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
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CHESSIoTSoftwarePackageImpl() {
		super(eNS_URI, CHESSIoTSoftwareFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CHESSIoTSoftwarePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CHESSIoTSoftwarePackage init() {
		if (isInited) return (CHESSIoTSoftwarePackage)EPackage.Registry.INSTANCE.getEPackage(CHESSIoTSoftwarePackage.eNS_URI);

		// Obtain or create and register package
		CHESSIoTSoftwarePackageImpl theCHESSIoTSoftwarePackage = (CHESSIoTSoftwarePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CHESSIoTSoftwarePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CHESSIoTSoftwarePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SysmlPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CHESSIoTOperationalProfilePackageImpl theCHESSIoTOperationalProfilePackage = (CHESSIoTOperationalProfilePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CHESSIoTOperationalProfilePackage.eNS_URI) instanceof CHESSIoTOperationalProfilePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CHESSIoTOperationalProfilePackage.eNS_URI) : CHESSIoTOperationalProfilePackage.eINSTANCE);
		CHESSIoTSystemPackageImpl theCHESSIoTSystemPackage = (CHESSIoTSystemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CHESSIoTSystemPackage.eNS_URI) instanceof CHESSIoTSystemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CHESSIoTSystemPackage.eNS_URI) : CHESSIoTSystemPackage.eINSTANCE);
		CHESSIoTDeploymentPackageImpl theCHESSIoTDeploymentPackage = (CHESSIoTDeploymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CHESSIoTDeploymentPackage.eNS_URI) instanceof CHESSIoTDeploymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CHESSIoTDeploymentPackage.eNS_URI) : CHESSIoTDeploymentPackage.eINSTANCE);

		// Create package meta-data objects
		theCHESSIoTSoftwarePackage.createPackageContents();
		theCHESSIoTOperationalProfilePackage.createPackageContents();
		theCHESSIoTSystemPackage.createPackageContents();
		theCHESSIoTDeploymentPackage.createPackageContents();

		// Initialize created meta-data
		theCHESSIoTSoftwarePackage.initializePackageContents();
		theCHESSIoTOperationalProfilePackage.initializePackageContents();
		theCHESSIoTSystemPackage.initializePackageContents();
		theCHESSIoTDeploymentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCHESSIoTSoftwarePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CHESSIoTSoftwarePackage.eNS_URI, theCHESSIoTSoftwarePackage);
		return theCHESSIoTSoftwarePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualEntity() {
		return virtualEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualEntity_Base_Component() {
		return (EReference)virtualEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualEntity_Virtualentity() {
		return (EReference)virtualEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualEntity_Id() {
		return (EAttribute)virtualEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualEntity_Name() {
		return (EAttribute)virtualEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualElement() {
		return virtualElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualElement_Id() {
		return (EAttribute)virtualElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualElement_Name() {
		return (EAttribute)virtualElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualElement_Base_Component() {
		return (EReference)virtualElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualElement_Virtualelement() {
		return (EReference)virtualElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualElement_Virtualentity() {
		return (EReference)virtualElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualElement_Iotport() {
		return (EReference)virtualElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualElement_Iotstate() {
		return (EReference)virtualElementEClass.getEStructuralFeatures().get(6);
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
	public EReference getIoTPort_Base_Port() {
		return (EReference)ioTPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIoTPort_Pin() {
		return (EAttribute)ioTPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoTPort_Sends() {
		return (EReference)ioTPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoTPort_Receives() {
		return (EReference)ioTPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPayload() {
		return payloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPayload_Base_Class() {
		return (EReference)payloadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPayload_Have() {
		return (EReference)payloadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPayload_PayloadType() {
		return (EAttribute)payloadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageParameters() {
		return messageParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageParameters_Base_Property() {
		return (EReference)messageParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateMachine() {
		return stateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_Region() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_Base_StateMachine() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegion() {
		return regionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_Iotstate() {
		return (EReference)regionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_Base_Region() {
		return (EReference)regionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIoTState() {
		return ioTStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoTState_Base_State() {
		return (EReference)ioTStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoTState_Iotevent() {
		return (EReference)ioTStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIoTEvent() {
		return ioTEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoTEvent_Base_Class() {
		return (EReference)ioTEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncomingEvent() {
		return incomingEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncomingEvent_Receivepayload() {
		return (EReference)incomingEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncomingEvent_Outgoingevent() {
		return (EReference)incomingEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceivePayload() {
		return receivePayloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceivePayload_Iotport() {
		return (EReference)receivePayloadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceivePayload_Payload() {
		return (EReference)receivePayloadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIoTAction() {
		return ioTActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoTAction_Base_Class() {
		return (EReference)ioTActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutgoingEvent() {
		return outgoingEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutgoingEvent_IsPeriodic() {
		return (EAttribute)outgoingEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutgoingEvent_TimeInterval() {
		return (EAttribute)outgoingEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutgoingEvent_Sendpayload() {
		return (EReference)outgoingEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutgoingEvent_Incomingevent() {
		return (EReference)outgoingEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendPayload() {
		return sendPayloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendPayload_Payload() {
		return (EReference)sendPayloadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendPayload_Iotport() {
		return (EReference)sendPayloadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateTransition() {
		return stateTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateTransition_Condition() {
		return (EAttribute)stateTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateTransition_Base_Transition() {
		return (EReference)stateTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateTransition_Iotstate() {
		return (EReference)stateTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericEvent() {
		return genericEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericEvent_IsPeriodic() {
		return (EAttribute)genericEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericEvent_TimeInterval() {
		return (EAttribute)genericEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericIoTAction() {
		return genericIoTActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericIoTAction_ActionName() {
		return (EAttribute)genericIoTActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericIoTAction_ActionType() {
		return (EAttribute)genericIoTActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitualComputingNode() {
		return vitualComputingNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVitualComputingNode_Sensor() {
		return (EReference)vitualComputingNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVitualComputingNode_Actuator() {
		return (EReference)vitualComputingNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensor_Computingnode() {
		return (EReference)sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuator() {
		return actuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSYSTEM() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSYSTEM_Base_Component() {
		return (EReference)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSYSTEM_Virtualentity() {
		return (EReference)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSYSTEM_Name() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPayloadType() {
		return payloadTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGenericActIoType() {
		return genericActIoTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTSoftwareFactory getCHESSIoTSoftwareFactory() {
		return (CHESSIoTSoftwareFactory)getEFactoryInstance();
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
		virtualEntityEClass = createEClass(VIRTUAL_ENTITY);
		createEReference(virtualEntityEClass, VIRTUAL_ENTITY__BASE_COMPONENT);
		createEReference(virtualEntityEClass, VIRTUAL_ENTITY__VIRTUALENTITY);
		createEAttribute(virtualEntityEClass, VIRTUAL_ENTITY__ID);
		createEAttribute(virtualEntityEClass, VIRTUAL_ENTITY__NAME);

		virtualElementEClass = createEClass(VIRTUAL_ELEMENT);
		createEAttribute(virtualElementEClass, VIRTUAL_ELEMENT__ID);
		createEAttribute(virtualElementEClass, VIRTUAL_ELEMENT__NAME);
		createEReference(virtualElementEClass, VIRTUAL_ELEMENT__BASE_COMPONENT);
		createEReference(virtualElementEClass, VIRTUAL_ELEMENT__VIRTUALELEMENT);
		createEReference(virtualElementEClass, VIRTUAL_ELEMENT__VIRTUALENTITY);
		createEReference(virtualElementEClass, VIRTUAL_ELEMENT__IOTPORT);
		createEReference(virtualElementEClass, VIRTUAL_ELEMENT__IOTSTATE);

		ioTPortEClass = createEClass(IO_TPORT);
		createEReference(ioTPortEClass, IO_TPORT__BASE_PORT);
		createEAttribute(ioTPortEClass, IO_TPORT__PIN);
		createEReference(ioTPortEClass, IO_TPORT__SENDS);
		createEReference(ioTPortEClass, IO_TPORT__RECEIVES);

		payloadEClass = createEClass(PAYLOAD);
		createEReference(payloadEClass, PAYLOAD__BASE_CLASS);
		createEReference(payloadEClass, PAYLOAD__HAVE);
		createEAttribute(payloadEClass, PAYLOAD__PAYLOAD_TYPE);

		messageParametersEClass = createEClass(MESSAGE_PARAMETERS);
		createEReference(messageParametersEClass, MESSAGE_PARAMETERS__BASE_PROPERTY);

		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__REGION);
		createEReference(stateMachineEClass, STATE_MACHINE__BASE_STATE_MACHINE);

		regionEClass = createEClass(REGION);
		createEReference(regionEClass, REGION__IOTSTATE);
		createEReference(regionEClass, REGION__BASE_REGION);

		ioTStateEClass = createEClass(IO_TSTATE);
		createEReference(ioTStateEClass, IO_TSTATE__BASE_STATE);
		createEReference(ioTStateEClass, IO_TSTATE__IOTEVENT);

		ioTEventEClass = createEClass(IO_TEVENT);
		createEReference(ioTEventEClass, IO_TEVENT__BASE_CLASS);

		incomingEventEClass = createEClass(INCOMING_EVENT);
		createEReference(incomingEventEClass, INCOMING_EVENT__RECEIVEPAYLOAD);
		createEReference(incomingEventEClass, INCOMING_EVENT__OUTGOINGEVENT);

		receivePayloadEClass = createEClass(RECEIVE_PAYLOAD);
		createEReference(receivePayloadEClass, RECEIVE_PAYLOAD__IOTPORT);
		createEReference(receivePayloadEClass, RECEIVE_PAYLOAD__PAYLOAD);

		ioTActionEClass = createEClass(IO_TACTION);
		createEReference(ioTActionEClass, IO_TACTION__BASE_CLASS);

		outgoingEventEClass = createEClass(OUTGOING_EVENT);
		createEAttribute(outgoingEventEClass, OUTGOING_EVENT__IS_PERIODIC);
		createEAttribute(outgoingEventEClass, OUTGOING_EVENT__TIME_INTERVAL);
		createEReference(outgoingEventEClass, OUTGOING_EVENT__SENDPAYLOAD);
		createEReference(outgoingEventEClass, OUTGOING_EVENT__INCOMINGEVENT);

		sendPayloadEClass = createEClass(SEND_PAYLOAD);
		createEReference(sendPayloadEClass, SEND_PAYLOAD__PAYLOAD);
		createEReference(sendPayloadEClass, SEND_PAYLOAD__IOTPORT);

		stateTransitionEClass = createEClass(STATE_TRANSITION);
		createEAttribute(stateTransitionEClass, STATE_TRANSITION__CONDITION);
		createEReference(stateTransitionEClass, STATE_TRANSITION__BASE_TRANSITION);
		createEReference(stateTransitionEClass, STATE_TRANSITION__IOTSTATE);

		genericEventEClass = createEClass(GENERIC_EVENT);
		createEAttribute(genericEventEClass, GENERIC_EVENT__IS_PERIODIC);
		createEAttribute(genericEventEClass, GENERIC_EVENT__TIME_INTERVAL);

		genericIoTActionEClass = createEClass(GENERIC_IO_TACTION);
		createEAttribute(genericIoTActionEClass, GENERIC_IO_TACTION__ACTION_NAME);
		createEAttribute(genericIoTActionEClass, GENERIC_IO_TACTION__ACTION_TYPE);

		vitualComputingNodeEClass = createEClass(VITUAL_COMPUTING_NODE);
		createEReference(vitualComputingNodeEClass, VITUAL_COMPUTING_NODE__SENSOR);
		createEReference(vitualComputingNodeEClass, VITUAL_COMPUTING_NODE__ACTUATOR);

		sensorEClass = createEClass(SENSOR);
		createEReference(sensorEClass, SENSOR__COMPUTINGNODE);

		actuatorEClass = createEClass(ACTUATOR);

		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__BASE_COMPONENT);
		createEReference(systemEClass, SYSTEM__VIRTUALENTITY);
		createEAttribute(systemEClass, SYSTEM__NAME);

		// Create enums
		payloadTypeEEnum = createEEnum(PAYLOAD_TYPE);
		genericActIoTypeEEnum = createEEnum(GENERIC_ACT_IO_TYPE);
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
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		incomingEventEClass.getESuperTypes().add(this.getIoTEvent());
		receivePayloadEClass.getESuperTypes().add(this.getIoTAction());
		outgoingEventEClass.getESuperTypes().add(this.getIoTEvent());
		sendPayloadEClass.getESuperTypes().add(this.getIoTAction());
		genericEventEClass.getESuperTypes().add(this.getIoTEvent());
		genericIoTActionEClass.getESuperTypes().add(this.getIoTAction());
		vitualComputingNodeEClass.getESuperTypes().add(this.getVirtualElement());
		sensorEClass.getESuperTypes().add(this.getVirtualElement());
		actuatorEClass.getESuperTypes().add(this.getVirtualElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(virtualEntityEClass, VirtualEntity.class, "VirtualEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualEntity_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, VirtualEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualEntity_Virtualentity(), this.getVirtualEntity(), null, "virtualentity", null, 1, 1, VirtualEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVirtualEntity_Id(), theTypesPackage.getInteger(), "id", null, 1, 1, VirtualEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVirtualEntity_Name(), theTypesPackage.getString(), "name", null, 1, 1, VirtualEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(virtualElementEClass, VirtualElement.class, "VirtualElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualElement_Id(), theTypesPackage.getInteger(), "id", null, 1, 1, VirtualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVirtualElement_Name(), theTypesPackage.getString(), "name", null, 1, 1, VirtualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualElement_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, VirtualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualElement_Virtualelement(), this.getVirtualElement(), null, "virtualelement", null, 1, 1, VirtualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualElement_Virtualentity(), this.getVirtualEntity(), null, "virtualentity", null, 1, 1, VirtualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualElement_Iotport(), this.getIoTPort(), null, "iotport", null, 1, -1, VirtualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualElement_Iotstate(), this.getStateMachine(), null, "iotstate", null, 1, 1, VirtualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ioTPortEClass, IoTPort.class, "IoTPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIoTPort_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 1, 1, IoTPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIoTPort_Pin(), theTypesPackage.getInteger(), "pin", null, 0, -1, IoTPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIoTPort_Sends(), this.getPayload(), null, "sends", null, 0, -1, IoTPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIoTPort_Receives(), this.getPayload(), null, "receives", null, 0, -1, IoTPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(payloadEClass, Payload.class, "Payload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPayload_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, Payload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPayload_Have(), this.getMessageParameters(), null, "have", null, 0, -1, Payload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPayload_PayloadType(), this.getPayloadType(), "payloadType", null, 1, 1, Payload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(messageParametersEClass, MessageParameters.class, "MessageParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageParameters_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, MessageParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_Region(), this.getRegion(), null, "region", null, 1, 1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStateMachine_Base_StateMachine(), theUMLPackage.getStateMachine(), null, "base_StateMachine", null, 1, 1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(regionEClass, Region.class, "Region", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegion_Iotstate(), this.getIoTState(), null, "iotstate", null, 1, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRegion_Base_Region(), theUMLPackage.getRegion(), null, "base_Region", null, 1, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ioTStateEClass, IoTState.class, "IoTState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIoTState_Base_State(), theUMLPackage.getState(), null, "base_State", null, 1, 1, IoTState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIoTState_Iotevent(), this.getIoTEvent(), null, "iotevent", null, 0, -1, IoTState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ioTEventEClass, IoTEvent.class, "IoTEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIoTEvent_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, IoTEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(incomingEventEClass, IncomingEvent.class, "IncomingEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIncomingEvent_Receivepayload(), this.getReceivePayload(), null, "receivepayload", null, 1, 1, IncomingEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIncomingEvent_Outgoingevent(), this.getOutgoingEvent(), this.getOutgoingEvent_Incomingevent(), "outgoingevent", null, 1, 1, IncomingEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(receivePayloadEClass, ReceivePayload.class, "ReceivePayload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReceivePayload_Iotport(), this.getIoTPort(), null, "iotport", null, 1, 1, ReceivePayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReceivePayload_Payload(), this.getPayload(), null, "payload", null, 1, 1, ReceivePayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ioTActionEClass, IoTAction.class, "IoTAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIoTAction_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, IoTAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(outgoingEventEClass, OutgoingEvent.class, "OutgoingEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutgoingEvent_IsPeriodic(), theTypesPackage.getBoolean(), "isPeriodic", null, 1, 1, OutgoingEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOutgoingEvent_TimeInterval(), theTypesPackage.getInteger(), "timeInterval", null, 1, 1, OutgoingEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOutgoingEvent_Sendpayload(), this.getSendPayload(), null, "sendpayload", null, 0, -1, OutgoingEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOutgoingEvent_Incomingevent(), this.getIncomingEvent(), this.getIncomingEvent_Outgoingevent(), "incomingevent", null, 1, 1, OutgoingEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sendPayloadEClass, SendPayload.class, "SendPayload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendPayload_Payload(), this.getPayload(), null, "payload", null, 1, -1, SendPayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSendPayload_Iotport(), this.getIoTPort(), null, "iotport", null, 1, 1, SendPayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stateTransitionEClass, StateTransition.class, "StateTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateTransition_Condition(), theTypesPackage.getString(), "condition", null, 1, 1, StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStateTransition_Base_Transition(), theUMLPackage.getTransition(), null, "base_Transition", null, 1, 1, StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStateTransition_Iotstate(), this.getIoTState(), null, "iotstate", null, 1, 1, StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genericEventEClass, GenericEvent.class, "GenericEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericEvent_IsPeriodic(), theTypesPackage.getBoolean(), "isPeriodic", null, 1, 1, GenericEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenericEvent_TimeInterval(), theTypesPackage.getInteger(), "timeInterval", null, 1, 1, GenericEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genericIoTActionEClass, GenericIoTAction.class, "GenericIoTAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericIoTAction_ActionName(), theTypesPackage.getString(), "actionName", null, 1, 1, GenericIoTAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGenericIoTAction_ActionType(), this.getGenericActIoType(), "actionType", null, 1, 1, GenericIoTAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vitualComputingNodeEClass, VitualComputingNode.class, "VitualComputingNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVitualComputingNode_Sensor(), this.getSensor(), this.getSensor_Computingnode(), "sensor", null, 0, -1, VitualComputingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVitualComputingNode_Actuator(), this.getActuator(), null, "actuator", null, 0, -1, VitualComputingNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSensor_Computingnode(), this.getVitualComputingNode(), this.getVitualComputingNode_Sensor(), "computingnode", null, 1, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(actuatorEClass, Actuator.class, "Actuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemEClass, org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SYSTEM.class, "SYSTEM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSYSTEM_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SYSTEM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSYSTEM_Virtualentity(), this.getVirtualEntity(), null, "virtualentity", null, 1, 1, org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SYSTEM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSYSTEM_Name(), theTypesPackage.getString(), "name", null, 1, 1, org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SYSTEM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(payloadTypeEEnum, PayloadType.class, "PayloadType");
		addEEnumLiteral(payloadTypeEEnum, PayloadType.TEXT);
		addEEnumLiteral(payloadTypeEEnum, PayloadType.BINARY);
		addEEnumLiteral(payloadTypeEEnum, PayloadType.IMAGE);
		addEEnumLiteral(payloadTypeEEnum, PayloadType.OTHER);

		initEEnum(genericActIoTypeEEnum, GenericActIoType.class, "GenericActIoType");
		addEEnumLiteral(genericActIoTypeEEnum, GenericActIoType.EXTERNAL);
		addEEnumLiteral(genericActIoTypeEEnum, GenericActIoType.LOOP);
		addEEnumLiteral(genericActIoTypeEEnum, GenericActIoType.CONDITION);
		addEEnumLiteral(genericActIoTypeEEnum, GenericActIoType.ASSIGNMENT);
		addEEnumLiteral(genericActIoTypeEEnum, GenericActIoType.RETURN);
		addEEnumLiteral(genericActIoTypeEEnum, GenericActIoType.ERROR);
		addEEnumLiteral(genericActIoTypeEEnum, GenericActIoType.PRINT);
		addEEnumLiteral(genericActIoTypeEEnum, GenericActIoType.FUNCTION_CALL);

		// Create resource
		createResource(eNS_URI);
	}

} //CHESSIoTSoftwarePackageImpl
