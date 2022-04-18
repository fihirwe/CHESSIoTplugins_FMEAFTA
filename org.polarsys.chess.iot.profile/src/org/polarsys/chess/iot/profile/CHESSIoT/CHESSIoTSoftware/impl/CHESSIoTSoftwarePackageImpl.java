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

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.AccessMode;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Action;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Actuator;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Assignemt;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwareFactory;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Condition;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.ConditionEvent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Event;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.External;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.FunctionCall;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Generic;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Guard;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.InternalEvent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTPort;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Loop;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.MQTTPort;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.PayloadParameters;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Print;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SYSTEM_Sw;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Send;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Sensor;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateMachine;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualElement;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity;

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
	private EClass payloadParametersEClass = null;

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
	private EClass ioTStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendEClass = null;

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
	private EClass conditionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualBoardEClass = null;

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
	private EClass systeM_SwEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignemtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass printEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mqttPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessModeEEnum = null;

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
		CHESSIoTDeploymentPackageImpl theCHESSIoTDeploymentPackage = (CHESSIoTDeploymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CHESSIoTDeploymentPackage.eNS_URI) instanceof CHESSIoTDeploymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CHESSIoTDeploymentPackage.eNS_URI) : CHESSIoTDeploymentPackage.eINSTANCE);
		CHESSIoTSystemPackageImpl theCHESSIoTSystemPackage = (CHESSIoTSystemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CHESSIoTSystemPackage.eNS_URI) instanceof CHESSIoTSystemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CHESSIoTSystemPackage.eNS_URI) : CHESSIoTSystemPackage.eINSTANCE);

		// Create package meta-data objects
		theCHESSIoTSoftwarePackage.createPackageContents();
		theCHESSIoTDeploymentPackage.createPackageContents();
		theCHESSIoTSystemPackage.createPackageContents();

		// Initialize created meta-data
		theCHESSIoTSoftwarePackage.initializePackageContents();
		theCHESSIoTDeploymentPackage.initializePackageContents();
		theCHESSIoTSystemPackage.initializePackageContents();

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
	public EReference getVirtualElement_Statemachine() {
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
	public EAttribute getIoTPort_ConnectionPins() {
		return (EAttribute)ioTPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoTPort_Send_payload() {
		return (EReference)ioTPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoTPort_Receive_payload() {
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
	public EClass getPayloadParameters() {
		return payloadParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPayloadParameters_Base_Property() {
		return (EReference)payloadParametersEClass.getEStructuralFeatures().get(0);
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
	public EReference getStateMachine_Base_StateMachine() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_Iotstate() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
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
	public EReference getIoTState_OnExit() {
		return (EReference)ioTStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoTState_Internal() {
		return (EReference)ioTStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoTState_OnEntry() {
		return (EReference)ioTStateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Base_Class() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalEvent() {
		return internalEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalEvent_Action() {
		return (EReference)internalEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Payload() {
		return (EReference)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Iotport() {
		return (EReference)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Base_Class() {
		return (EReference)eventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSend() {
		return sendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSend_Payload() {
		return (EReference)sendEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSend_Port() {
		return (EReference)sendEClass.getEStructuralFeatures().get(1);
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
	public EReference getStateTransition_Base_Transition() {
		return (EReference)stateTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateTransition_Target() {
		return (EReference)stateTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateTransition_Source() {
		return (EReference)stateTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateTransition_Conditionalevent() {
		return (EReference)stateTransitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateTransition_Guard() {
		return (EReference)stateTransitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionEvent() {
		return conditionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuard() {
		return guardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuard_Base_Class() {
		return (EReference)guardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuard_Condition() {
		return (EAttribute)guardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuard_Action() {
		return (EReference)guardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneric() {
		return genericEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneric_Implementation() {
		return (EAttribute)genericEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualBoard() {
		return virtualBoardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualBoard_Sensor() {
		return (EReference)virtualBoardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualBoard_Actuator() {
		return (EReference)virtualBoardEClass.getEStructuralFeatures().get(1);
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
	public EClass getSYSTEM_Sw() {
		return systeM_SwEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSYSTEM_Sw_Base_Component() {
		return (EReference)systeM_SwEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSYSTEM_Sw_Virtualentity() {
		return (EReference)systeM_SwEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSYSTEM_Sw_Name() {
		return (EAttribute)systeM_SwEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternal() {
		return externalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoop() {
		return loopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignemt() {
		return assignemtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrint() {
		return printEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getError() {
		return errorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionCall() {
		return functionCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMQTTPort() {
		return mqttPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMQTTPort_PayloadType() {
		return (EAttribute)mqttPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMQTTPort_BrokerAdress() {
		return (EAttribute)mqttPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMQTTPort_Topic() {
		return (EAttribute)mqttPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMQTTPort_Type() {
		return (EAttribute)mqttPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessMode() {
		return accessModeEEnum;
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
		createEReference(virtualElementEClass, VIRTUAL_ELEMENT__STATEMACHINE);

		ioTPortEClass = createEClass(IO_TPORT);
		createEReference(ioTPortEClass, IO_TPORT__BASE_PORT);
		createEAttribute(ioTPortEClass, IO_TPORT__CONNECTION_PINS);
		createEReference(ioTPortEClass, IO_TPORT__SEND_PAYLOAD);
		createEReference(ioTPortEClass, IO_TPORT__RECEIVE_PAYLOAD);

		payloadEClass = createEClass(PAYLOAD);
		createEReference(payloadEClass, PAYLOAD__BASE_CLASS);
		createEReference(payloadEClass, PAYLOAD__HAVE);

		payloadParametersEClass = createEClass(PAYLOAD_PARAMETERS);
		createEReference(payloadParametersEClass, PAYLOAD_PARAMETERS__BASE_PROPERTY);

		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__BASE_STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__IOTSTATE);

		ioTStateEClass = createEClass(IO_TSTATE);
		createEReference(ioTStateEClass, IO_TSTATE__BASE_STATE);
		createEReference(ioTStateEClass, IO_TSTATE__ON_EXIT);
		createEReference(ioTStateEClass, IO_TSTATE__INTERNAL);
		createEReference(ioTStateEClass, IO_TSTATE__ON_ENTRY);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__BASE_CLASS);

		internalEventEClass = createEClass(INTERNAL_EVENT);
		createEReference(internalEventEClass, INTERNAL_EVENT__ACTION);

		eventEClass = createEClass(EVENT);
		createEReference(eventEClass, EVENT__PAYLOAD);
		createEReference(eventEClass, EVENT__IOTPORT);
		createEReference(eventEClass, EVENT__BASE_CLASS);

		sendEClass = createEClass(SEND);
		createEReference(sendEClass, SEND__PAYLOAD);
		createEReference(sendEClass, SEND__PORT);

		stateTransitionEClass = createEClass(STATE_TRANSITION);
		createEReference(stateTransitionEClass, STATE_TRANSITION__BASE_TRANSITION);
		createEReference(stateTransitionEClass, STATE_TRANSITION__TARGET);
		createEReference(stateTransitionEClass, STATE_TRANSITION__SOURCE);
		createEReference(stateTransitionEClass, STATE_TRANSITION__CONDITIONALEVENT);
		createEReference(stateTransitionEClass, STATE_TRANSITION__GUARD);

		conditionEventEClass = createEClass(CONDITION_EVENT);

		guardEClass = createEClass(GUARD);
		createEReference(guardEClass, GUARD__BASE_CLASS);
		createEAttribute(guardEClass, GUARD__CONDITION);
		createEReference(guardEClass, GUARD__ACTION);

		genericEClass = createEClass(GENERIC);
		createEAttribute(genericEClass, GENERIC__IMPLEMENTATION);

		virtualBoardEClass = createEClass(VIRTUAL_BOARD);
		createEReference(virtualBoardEClass, VIRTUAL_BOARD__SENSOR);
		createEReference(virtualBoardEClass, VIRTUAL_BOARD__ACTUATOR);

		sensorEClass = createEClass(SENSOR);
		createEReference(sensorEClass, SENSOR__COMPUTINGNODE);

		actuatorEClass = createEClass(ACTUATOR);

		systeM_SwEClass = createEClass(SYSTEM_SW);
		createEReference(systeM_SwEClass, SYSTEM_SW__BASE_COMPONENT);
		createEReference(systeM_SwEClass, SYSTEM_SW__VIRTUALENTITY);
		createEAttribute(systeM_SwEClass, SYSTEM_SW__NAME);

		externalEClass = createEClass(EXTERNAL);

		loopEClass = createEClass(LOOP);

		conditionEClass = createEClass(CONDITION);

		assignemtEClass = createEClass(ASSIGNEMT);

		printEClass = createEClass(PRINT);

		errorEClass = createEClass(ERROR);

		functionCallEClass = createEClass(FUNCTION_CALL);

		mqttPortEClass = createEClass(MQTT_PORT);
		createEAttribute(mqttPortEClass, MQTT_PORT__PAYLOAD_TYPE);
		createEAttribute(mqttPortEClass, MQTT_PORT__BROKER_ADRESS);
		createEAttribute(mqttPortEClass, MQTT_PORT__TOPIC);
		createEAttribute(mqttPortEClass, MQTT_PORT__TYPE);

		// Create enums
		accessModeEEnum = createEEnum(ACCESS_MODE);
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
		internalEventEClass.getESuperTypes().add(this.getEvent());
		sendEClass.getESuperTypes().add(this.getAction());
		conditionEventEClass.getESuperTypes().add(this.getEvent());
		genericEClass.getESuperTypes().add(this.getAction());
		virtualBoardEClass.getESuperTypes().add(this.getVirtualElement());
		sensorEClass.getESuperTypes().add(this.getVirtualElement());
		actuatorEClass.getESuperTypes().add(this.getVirtualElement());
		externalEClass.getESuperTypes().add(this.getGeneric());
		loopEClass.getESuperTypes().add(this.getGeneric());
		conditionEClass.getESuperTypes().add(this.getGeneric());
		assignemtEClass.getESuperTypes().add(this.getGeneric());
		printEClass.getESuperTypes().add(this.getGeneric());
		errorEClass.getESuperTypes().add(this.getGeneric());
		functionCallEClass.getESuperTypes().add(this.getGeneric());
		mqttPortEClass.getESuperTypes().add(this.getIoTPort());

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
		initEReference(getVirtualElement_Statemachine(), this.getStateMachine(), null, "statemachine", null, 1, -1, VirtualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ioTPortEClass, IoTPort.class, "IoTPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIoTPort_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 1, 1, IoTPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIoTPort_ConnectionPins(), theTypesPackage.getInteger(), "connectionPins", null, 0, -1, IoTPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIoTPort_Send_payload(), this.getPayload(), null, "send_payload", null, 1, -1, IoTPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIoTPort_Receive_payload(), this.getPayload(), null, "receive_payload", null, 1, -1, IoTPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(payloadEClass, Payload.class, "Payload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPayload_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, Payload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPayload_Have(), this.getPayloadParameters(), null, "have", null, 1, -1, Payload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(payloadParametersEClass, PayloadParameters.class, "PayloadParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPayloadParameters_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, PayloadParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_Base_StateMachine(), theUMLPackage.getStateMachine(), null, "base_StateMachine", null, 1, 1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStateMachine_Iotstate(), this.getIoTState(), null, "iotstate", null, 1, 1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ioTStateEClass, IoTState.class, "IoTState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIoTState_Base_State(), theUMLPackage.getState(), null, "base_State", null, 1, 1, IoTState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIoTState_OnExit(), this.getAction(), null, "onExit", null, 1, -1, IoTState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIoTState_Internal(), this.getInternalEvent(), null, "internal", null, 1, -1, IoTState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIoTState_OnEntry(), this.getAction(), null, "onEntry", null, 1, -1, IoTState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(internalEventEClass, InternalEvent.class, "InternalEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalEvent_Action(), this.getAction(), null, "action", null, 1, -1, InternalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvent_Payload(), this.getPayload(), null, "payload", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEvent_Iotport(), this.getIoTPort(), null, "iotport", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEvent_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sendEClass, Send.class, "Send", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSend_Payload(), this.getPayload(), null, "payload", null, 1, 1, Send.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSend_Port(), this.getIoTPort(), null, "port", null, 1, 1, Send.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stateTransitionEClass, StateTransition.class, "StateTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateTransition_Base_Transition(), theUMLPackage.getTransition(), null, "base_Transition", null, 1, 1, StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStateTransition_Target(), this.getIoTState(), null, "target", null, 1, 1, StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStateTransition_Source(), this.getIoTState(), null, "source", null, 1, 1, StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStateTransition_Conditionalevent(), this.getConditionEvent(), null, "conditionalevent", null, 1, 1, StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStateTransition_Guard(), this.getGuard(), null, "guard", null, 1, -1, StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(conditionEventEClass, ConditionEvent.class, "ConditionEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(guardEClass, Guard.class, "Guard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuard_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, Guard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuard_Condition(), theTypesPackage.getString(), "condition", null, 1, 1, Guard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGuard_Action(), this.getAction(), null, "action", null, 1, -1, Guard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genericEClass, Generic.class, "Generic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneric_Implementation(), theTypesPackage.getString(), "implementation", null, 1, 1, Generic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(virtualBoardEClass, VirtualBoard.class, "VirtualBoard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualBoard_Sensor(), this.getSensor(), this.getSensor_Computingnode(), "sensor", null, 0, -1, VirtualBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVirtualBoard_Actuator(), this.getActuator(), null, "actuator", null, 0, -1, VirtualBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSensor_Computingnode(), this.getVirtualBoard(), this.getVirtualBoard_Sensor(), "computingnode", null, 1, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(actuatorEClass, Actuator.class, "Actuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systeM_SwEClass, SYSTEM_Sw.class, "SYSTEM_Sw", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSYSTEM_Sw_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, SYSTEM_Sw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSYSTEM_Sw_Virtualentity(), this.getVirtualEntity(), null, "virtualentity", null, 1, 1, SYSTEM_Sw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSYSTEM_Sw_Name(), theTypesPackage.getString(), "name", null, 1, 1, SYSTEM_Sw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(externalEClass, External.class, "External", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assignemtEClass, Assignemt.class, "Assignemt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(printEClass, Print.class, "Print", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(errorEClass, org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Error.class, "Error", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionCallEClass, FunctionCall.class, "FunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mqttPortEClass, MQTTPort.class, "MQTTPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMQTTPort_PayloadType(), theTypesPackage.getString(), "payloadType", null, 1, 1, MQTTPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMQTTPort_BrokerAdress(), theTypesPackage.getString(), "brokerAdress", null, 1, 1, MQTTPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMQTTPort_Topic(), theTypesPackage.getString(), "topic", null, 1, 1, MQTTPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMQTTPort_Type(), this.getAccessMode(), "type", null, 1, 1, MQTTPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(accessModeEEnum, AccessMode.class, "AccessMode");
		addEEnumLiteral(accessModeEEnum, AccessMode.SUBSCRIBER);
		addEEnumLiteral(accessModeEEnum, AccessMode.PUBLISHER);
		addEEnumLiteral(accessModeEEnum, AccessMode.PUBSUB);

		// Create resource
		createResource(eNS_URI);
	}

} //CHESSIoTSoftwarePackageImpl
