/**
 */
package org.polarsys.chess.mobius.model.SAN.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.chess.mobius.model.SAN.Activity;
import org.polarsys.chess.mobius.model.SAN.ActivityPlaceCase;
import org.polarsys.chess.mobius.model.SAN.AtomicNode;
import org.polarsys.chess.mobius.model.SAN.ComposedNode;
import org.polarsys.chess.mobius.model.SAN.Gate;
import org.polarsys.chess.mobius.model.SAN.GlobalVariable;
import org.polarsys.chess.mobius.model.SAN.GraphicalElement;
import org.polarsys.chess.mobius.model.SAN.InputGate;
import org.polarsys.chess.mobius.model.SAN.InstantaneousActivity;
import org.polarsys.chess.mobius.model.SAN.Join;
import org.polarsys.chess.mobius.model.SAN.NamedElement;
import org.polarsys.chess.mobius.model.SAN.Node;
import org.polarsys.chess.mobius.model.SAN.OutputGate;
import org.polarsys.chess.mobius.model.SAN.Place;
import org.polarsys.chess.mobius.model.SAN.Primitive;
import org.polarsys.chess.mobius.model.SAN.Rep;
import org.polarsys.chess.mobius.model.SAN.SANModel;
import org.polarsys.chess.mobius.model.SAN.SANModelFactory;
import org.polarsys.chess.mobius.model.SAN.SANModelPackage;
import org.polarsys.chess.mobius.model.SAN.SharedState;
import org.polarsys.chess.mobius.model.SAN.TimedActivity;
import org.polarsys.chess.mobius.model.SAN.util.SANModelValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SANModelPackageImpl extends EPackageImpl implements SANModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sanModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

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
	private EClass composedNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharedStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instantaneousActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputGateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputGateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityPlaceCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveEClass = null;

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
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SANModelPackageImpl() {
		super(eNS_URI, SANModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SANModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SANModelPackage init() {
		if (isInited) return (SANModelPackage)EPackage.Registry.INSTANCE.getEPackage(SANModelPackage.eNS_URI);

		// Obtain or create and register package
		SANModelPackageImpl theSANModelPackage = (SANModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SANModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SANModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSANModelPackage.createPackageContents();

		// Initialize created meta-data
		theSANModelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSANModelPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SANModelValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSANModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SANModelPackage.eNS_URI, theSANModelPackage);
		return theSANModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSANModel() {
		return sanModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSANModel_Node() {
		return (EReference)sanModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSANModel__GetAllNodes() {
		return sanModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedElement__Validate__DiagnosticChain_Map() {
		return namedElementEClass.getEOperations().get(0);
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
	public EReference getNode_GlobalVariable() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposedNode() {
		return composedNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposedNode_StateVariables() {
		return (EReference)composedNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposedNode_Child() {
		return (EReference)composedNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharedState() {
		return sharedStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedState_Place() {
		return (EReference)sharedStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedState_SharedStates() {
		return (EReference)sharedStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoin() {
		return joinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRep() {
		return repEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRep_NumbOfReps() {
		return (EAttribute)repEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicNode() {
		return atomicNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicNode_Place() {
		return (EReference)atomicNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicNode_TimedActivity() {
		return (EReference)atomicNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicNode_InstantaneousActivity() {
		return (EReference)atomicNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicNode_InputGate() {
		return (EReference)atomicNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicNode_OutputGate() {
		return (EReference)atomicNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicNode_Model() {
		return (EAttribute)atomicNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_Activity() {
		return (EReference)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_InputGate() {
		return (EReference)placeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlace_InitialState() {
		return (EAttribute)placeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedActivity() {
		return timedActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedActivity_Rate() {
		return (EAttribute)timedActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedActivity_TimeDistributionFunction() {
		return (EAttribute)timedActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstantaneousActivity() {
		return instantaneousActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputGate() {
		return inputGateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputGate_InputPredicated() {
		return (EAttribute)inputGateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputGate_InputFunction() {
		return (EAttribute)inputGateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputGate_Activity() {
		return (EReference)inputGateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputGate() {
		return outputGateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputGate_OutputFunction() {
		return (EAttribute)outputGateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Place() {
		return (EReference)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_OutputGate() {
		return (EReference)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Case() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Placecase() {
		return (EReference)activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGate() {
		return gateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGate_Place() {
		return (EReference)gateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalVariable() {
		return globalVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalVariable_Type() {
		return (EAttribute)globalVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityPlaceCase() {
		return activityPlaceCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPlaceCase_Place() {
		return (EReference)activityPlaceCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityPlaceCase_Case() {
		return (EAttribute)activityPlaceCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphicalElement() {
		return graphicalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalElement_X() {
		return (EAttribute)graphicalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalElement_Y() {
		return (EAttribute)graphicalElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitive() {
		return primitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SANModelFactory getSANModelFactory() {
		return (SANModelFactory)getEFactoryInstance();
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
		sanModelEClass = createEClass(SAN_MODEL);
		createEReference(sanModelEClass, SAN_MODEL__NODE);
		createEOperation(sanModelEClass, SAN_MODEL___GET_ALL_NODES);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEOperation(namedElementEClass, NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__GLOBAL_VARIABLE);

		composedNodeEClass = createEClass(COMPOSED_NODE);
		createEReference(composedNodeEClass, COMPOSED_NODE__STATE_VARIABLES);
		createEReference(composedNodeEClass, COMPOSED_NODE__CHILD);

		sharedStateEClass = createEClass(SHARED_STATE);
		createEReference(sharedStateEClass, SHARED_STATE__PLACE);
		createEReference(sharedStateEClass, SHARED_STATE__SHARED_STATES);

		joinEClass = createEClass(JOIN);

		repEClass = createEClass(REP);
		createEAttribute(repEClass, REP__NUMB_OF_REPS);

		atomicNodeEClass = createEClass(ATOMIC_NODE);
		createEReference(atomicNodeEClass, ATOMIC_NODE__PLACE);
		createEReference(atomicNodeEClass, ATOMIC_NODE__TIMED_ACTIVITY);
		createEReference(atomicNodeEClass, ATOMIC_NODE__INSTANTANEOUS_ACTIVITY);
		createEReference(atomicNodeEClass, ATOMIC_NODE__INPUT_GATE);
		createEReference(atomicNodeEClass, ATOMIC_NODE__OUTPUT_GATE);
		createEAttribute(atomicNodeEClass, ATOMIC_NODE__MODEL);

		placeEClass = createEClass(PLACE);
		createEReference(placeEClass, PLACE__ACTIVITY);
		createEReference(placeEClass, PLACE__INPUT_GATE);
		createEAttribute(placeEClass, PLACE__INITIAL_STATE);

		timedActivityEClass = createEClass(TIMED_ACTIVITY);
		createEAttribute(timedActivityEClass, TIMED_ACTIVITY__RATE);
		createEAttribute(timedActivityEClass, TIMED_ACTIVITY__TIME_DISTRIBUTION_FUNCTION);

		instantaneousActivityEClass = createEClass(INSTANTANEOUS_ACTIVITY);

		inputGateEClass = createEClass(INPUT_GATE);
		createEAttribute(inputGateEClass, INPUT_GATE__INPUT_PREDICATED);
		createEAttribute(inputGateEClass, INPUT_GATE__INPUT_FUNCTION);
		createEReference(inputGateEClass, INPUT_GATE__ACTIVITY);

		outputGateEClass = createEClass(OUTPUT_GATE);
		createEAttribute(outputGateEClass, OUTPUT_GATE__OUTPUT_FUNCTION);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__PLACE);
		createEReference(activityEClass, ACTIVITY__OUTPUT_GATE);
		createEAttribute(activityEClass, ACTIVITY__CASE);
		createEReference(activityEClass, ACTIVITY__PLACECASE);

		gateEClass = createEClass(GATE);
		createEReference(gateEClass, GATE__PLACE);

		globalVariableEClass = createEClass(GLOBAL_VARIABLE);
		createEAttribute(globalVariableEClass, GLOBAL_VARIABLE__TYPE);

		activityPlaceCaseEClass = createEClass(ACTIVITY_PLACE_CASE);
		createEReference(activityPlaceCaseEClass, ACTIVITY_PLACE_CASE__PLACE);
		createEAttribute(activityPlaceCaseEClass, ACTIVITY_PLACE_CASE__CASE);

		graphicalElementEClass = createEClass(GRAPHICAL_ELEMENT);
		createEAttribute(graphicalElementEClass, GRAPHICAL_ELEMENT__X);
		createEAttribute(graphicalElementEClass, GRAPHICAL_ELEMENT__Y);

		primitiveEClass = createEClass(PRIMITIVE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sanModelEClass.getESuperTypes().add(this.getNamedElement());
		namedElementEClass.getESuperTypes().add(this.getGraphicalElement());
		nodeEClass.getESuperTypes().add(this.getNamedElement());
		composedNodeEClass.getESuperTypes().add(this.getNode());
		sharedStateEClass.getESuperTypes().add(this.getNamedElement());
		joinEClass.getESuperTypes().add(this.getComposedNode());
		repEClass.getESuperTypes().add(this.getComposedNode());
		atomicNodeEClass.getESuperTypes().add(this.getNode());
		placeEClass.getESuperTypes().add(this.getPrimitive());
		timedActivityEClass.getESuperTypes().add(this.getActivity());
		instantaneousActivityEClass.getESuperTypes().add(this.getActivity());
		inputGateEClass.getESuperTypes().add(this.getPrimitive());
		outputGateEClass.getESuperTypes().add(this.getInputGate());
		activityEClass.getESuperTypes().add(this.getNamedElement());
		gateEClass.getESuperTypes().add(this.getNamedElement());
		globalVariableEClass.getESuperTypes().add(this.getNamedElement());
		activityPlaceCaseEClass.getESuperTypes().add(this.getGraphicalElement());
		primitiveEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(sanModelEClass, SANModel.class, "SANModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSANModel_Node(), this.getNode(), null, "node", null, 1, 1, SANModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSANModel__GetAllNodes(), this.getNode(), "getAllNodes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getNamedElement__Validate__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_GlobalVariable(), this.getGlobalVariable(), null, "globalVariable", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(composedNodeEClass, ComposedNode.class, "ComposedNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposedNode_StateVariables(), this.getSharedState(), null, "stateVariables", null, 0, -1, ComposedNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposedNode_Child(), this.getNode(), null, "child", null, 2, -1, ComposedNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sharedStateEClass, SharedState.class, "SharedState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSharedState_Place(), this.getPlace(), null, "place", null, 0, -1, SharedState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSharedState_SharedStates(), this.getSharedState(), null, "sharedStates", null, 0, -1, SharedState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinEClass, Join.class, "Join", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(repEClass, Rep.class, "Rep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRep_NumbOfReps(), ecorePackage.getEString(), "numbOfReps", "", 0, 1, Rep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicNodeEClass, AtomicNode.class, "AtomicNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomicNode_Place(), this.getPlace(), null, "place", null, 0, -1, AtomicNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicNode_TimedActivity(), this.getTimedActivity(), null, "timedActivity", null, 0, -1, AtomicNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicNode_InstantaneousActivity(), this.getInstantaneousActivity(), null, "instantaneousActivity", null, 0, -1, AtomicNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicNode_InputGate(), this.getInputGate(), null, "inputGate", null, 0, -1, AtomicNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicNode_OutputGate(), this.getOutputGate(), null, "outputGate", null, 0, -1, AtomicNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicNode_Model(), ecorePackage.getEString(), "model", null, 0, 1, AtomicNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlace_Activity(), this.getActivity(), null, "activity", null, 0, -1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlace_InputGate(), this.getInputGate(), null, "inputGate", null, 0, -1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlace_InitialState(), ecorePackage.getEInt(), "initialState", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timedActivityEClass, TimedActivity.class, "TimedActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimedActivity_Rate(), ecorePackage.getEString(), "rate", null, 0, 1, TimedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimedActivity_TimeDistributionFunction(), ecorePackage.getEString(), "timeDistributionFunction", null, 0, 1, TimedActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instantaneousActivityEClass, InstantaneousActivity.class, "InstantaneousActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputGateEClass, InputGate.class, "InputGate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputGate_InputPredicated(), ecorePackage.getEString(), "inputPredicated", null, 0, 1, InputGate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputGate_InputFunction(), ecorePackage.getEString(), "inputFunction", null, 0, 1, InputGate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputGate_Activity(), this.getActivity(), null, "activity", null, 0, -1, InputGate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputGateEClass, OutputGate.class, "OutputGate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputGate_OutputFunction(), ecorePackage.getEString(), "outputFunction", null, 0, 1, OutputGate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Place(), this.getPlace(), null, "place", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_OutputGate(), this.getOutputGate(), null, "outputGate", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_Case(), ecorePackage.getEString(), "case", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Placecase(), this.getActivityPlaceCase(), null, "placecase", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gateEClass, Gate.class, "Gate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGate_Place(), this.getPlace(), null, "place", null, 0, -1, Gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalVariableEClass, GlobalVariable.class, "GlobalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlobalVariable_Type(), ecorePackage.getEString(), "type", null, 0, 1, GlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityPlaceCaseEClass, ActivityPlaceCase.class, "ActivityPlaceCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityPlaceCase_Place(), this.getPrimitive(), null, "place", null, 0, -1, ActivityPlaceCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityPlaceCase_Case(), ecorePackage.getEInt(), "case", null, 0, 1, ActivityPlaceCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicalElementEClass, GraphicalElement.class, "GraphicalElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicalElement_X(), ecorePackage.getEInt(), "x", null, 0, 1, GraphicalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphicalElement_Y(), ecorePackage.getEInt(), "y", null, 0, 1, GraphicalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveEClass, Primitive.class, "Primitive", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SANModelPackageImpl
