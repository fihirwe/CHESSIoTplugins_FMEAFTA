/**
 */
package org.polarsys.chess.mobius.model.SAN.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.polarsys.chess.mobius.model.SAN.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage
 * @generated
 */
public class SANModelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SANModelValidator INSTANCE = new SANModelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.polarsys.chess.mobius.model.SAN";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Named Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NAMED_ELEMENT__VALIDATE = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SANModelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SANModelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SANModelPackage.SAN_MODEL:
				return validateSANModel((SANModel)value, diagnostics, context);
			case SANModelPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case SANModelPackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case SANModelPackage.COMPOSED_NODE:
				return validateComposedNode((ComposedNode)value, diagnostics, context);
			case SANModelPackage.SHARED_STATE:
				return validateSharedState((SharedState)value, diagnostics, context);
			case SANModelPackage.JOIN:
				return validateJoin((Join)value, diagnostics, context);
			case SANModelPackage.REP:
				return validateRep((Rep)value, diagnostics, context);
			case SANModelPackage.ATOMIC_NODE:
				return validateAtomicNode((AtomicNode)value, diagnostics, context);
			case SANModelPackage.PLACE:
				return validatePlace((Place)value, diagnostics, context);
			case SANModelPackage.TIMED_ACTIVITY:
				return validateTimedActivity((TimedActivity)value, diagnostics, context);
			case SANModelPackage.INSTANTANEOUS_ACTIVITY:
				return validateInstantaneousActivity((InstantaneousActivity)value, diagnostics, context);
			case SANModelPackage.INPUT_GATE:
				return validateInputGate((InputGate)value, diagnostics, context);
			case SANModelPackage.OUTPUT_GATE:
				return validateOutputGate((OutputGate)value, diagnostics, context);
			case SANModelPackage.ACTIVITY:
				return validateActivity((Activity)value, diagnostics, context);
			case SANModelPackage.GATE:
				return validateGate((Gate)value, diagnostics, context);
			case SANModelPackage.GLOBAL_VARIABLE:
				return validateGlobalVariable((GlobalVariable)value, diagnostics, context);
			case SANModelPackage.ACTIVITY_PLACE_CASE:
				return validateActivityPlaceCase((ActivityPlaceCase)value, diagnostics, context);
			case SANModelPackage.GRAPHICAL_ELEMENT:
				return validateGraphicalElement((GraphicalElement)value, diagnostics, context);
			case SANModelPackage.PRIMITIVE:
				return validatePrimitive((Primitive)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSANModel(SANModel sanModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sanModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sanModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sanModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sanModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sanModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sanModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sanModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sanModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sanModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(sanModel, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(namedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(namedElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement_validate(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return namedElement.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(node, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(node, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposedNode(ComposedNode composedNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(composedNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(composedNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(composedNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(composedNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(composedNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(composedNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(composedNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(composedNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(composedNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(composedNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSharedState(SharedState sharedState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sharedState, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sharedState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sharedState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sharedState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sharedState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sharedState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sharedState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sharedState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sharedState, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(sharedState, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoin(Join join, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(join, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(join, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(join, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRep(Rep rep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rep, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rep, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(rep, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtomicNode(AtomicNode atomicNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(atomicNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(atomicNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(atomicNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(atomicNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(atomicNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(atomicNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(atomicNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(atomicNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(atomicNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(atomicNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlace(Place place, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(place, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(place, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(place, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(place, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(place, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(place, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(place, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(place, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(place, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(place, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimedActivity(TimedActivity timedActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timedActivity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timedActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(timedActivity, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstantaneousActivity(InstantaneousActivity instantaneousActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instantaneousActivity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instantaneousActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instantaneousActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instantaneousActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instantaneousActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instantaneousActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instantaneousActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instantaneousActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instantaneousActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(instantaneousActivity, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputGate(InputGate inputGate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(inputGate, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(inputGate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(inputGate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(inputGate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(inputGate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(inputGate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(inputGate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(inputGate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(inputGate, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(inputGate, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputGate(OutputGate outputGate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(outputGate, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(outputGate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(outputGate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(outputGate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(outputGate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(outputGate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(outputGate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(outputGate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(outputGate, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(outputGate, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(activity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(activity, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gate, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(gate, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalVariable(GlobalVariable globalVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(globalVariable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(globalVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(globalVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(globalVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(globalVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(globalVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(globalVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(globalVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(globalVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(globalVariable, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityPlaceCase(ActivityPlaceCase activityPlaceCase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activityPlaceCase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphicalElement(GraphicalElement graphicalElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphicalElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitive(Primitive primitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(primitive, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(primitive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(primitive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(primitive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(primitive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(primitive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(primitive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(primitive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(primitive, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_validate(primitive, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SANModelValidator
