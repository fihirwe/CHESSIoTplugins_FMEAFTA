/**
 */
package org.polarsys.chess.mobius.model.SAN.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.chess.mobius.model.SAN.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SANModelFactoryImpl extends EFactoryImpl implements SANModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SANModelFactory init() {
		try {
			SANModelFactory theSANModelFactory = (SANModelFactory)EPackage.Registry.INSTANCE.getEFactory(SANModelPackage.eNS_URI);
			if (theSANModelFactory != null) {
				return theSANModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SANModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SANModelFactoryImpl() {
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
			case SANModelPackage.SAN_MODEL: return createSANModel();
			case SANModelPackage.SHARED_STATE: return createSharedState();
			case SANModelPackage.JOIN: return createJoin();
			case SANModelPackage.REP: return createRep();
			case SANModelPackage.ATOMIC_NODE: return createAtomicNode();
			case SANModelPackage.PLACE: return createPlace();
			case SANModelPackage.TIMED_ACTIVITY: return createTimedActivity();
			case SANModelPackage.INSTANTANEOUS_ACTIVITY: return createInstantaneousActivity();
			case SANModelPackage.INPUT_GATE: return createInputGate();
			case SANModelPackage.OUTPUT_GATE: return createOutputGate();
			case SANModelPackage.GLOBAL_VARIABLE: return createGlobalVariable();
			case SANModelPackage.ACTIVITY_PLACE_CASE: return createActivityPlaceCase();
			case SANModelPackage.GRAPHICAL_ELEMENT: return createGraphicalElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SANModel createSANModel() {
		SANModelImpl sanModel = new SANModelImpl();
		return sanModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedState createSharedState() {
		SharedStateImpl sharedState = new SharedStateImpl();
		return sharedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join createJoin() {
		JoinImpl join = new JoinImpl();
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rep createRep() {
		RepImpl rep = new RepImpl();
		return rep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicNode createAtomicNode() {
		AtomicNodeImpl atomicNode = new AtomicNodeImpl();
		return atomicNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedActivity createTimedActivity() {
		TimedActivityImpl timedActivity = new TimedActivityImpl();
		return timedActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantaneousActivity createInstantaneousActivity() {
		InstantaneousActivityImpl instantaneousActivity = new InstantaneousActivityImpl();
		return instantaneousActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputGate createInputGate() {
		InputGateImpl inputGate = new InputGateImpl();
		return inputGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputGate createOutputGate() {
		OutputGateImpl outputGate = new OutputGateImpl();
		return outputGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable createGlobalVariable() {
		GlobalVariableImpl globalVariable = new GlobalVariableImpl();
		return globalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPlaceCase createActivityPlaceCase() {
		ActivityPlaceCaseImpl activityPlaceCase = new ActivityPlaceCaseImpl();
		return activityPlaceCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalElement createGraphicalElement() {
		GraphicalElementImpl graphicalElement = new GraphicalElementImpl();
		return graphicalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SANModelPackage getSANModelPackage() {
		return (SANModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SANModelPackage getPackage() {
		return SANModelPackage.eINSTANCE;
	}

} //SANModelFactoryImpl
