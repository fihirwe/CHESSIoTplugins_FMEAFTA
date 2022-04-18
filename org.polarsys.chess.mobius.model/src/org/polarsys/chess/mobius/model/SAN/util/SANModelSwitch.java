/**
 */
package org.polarsys.chess.mobius.model.SAN.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.polarsys.chess.mobius.model.SAN.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage
 * @generated
 */
public class SANModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SANModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SANModelSwitch() {
		if (modelPackage == null) {
			modelPackage = SANModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SANModelPackage.SAN_MODEL: {
				SANModel sanModel = (SANModel)theEObject;
				T result = caseSANModel(sanModel);
				if (result == null) result = caseNamedElement(sanModel);
				if (result == null) result = caseGraphicalElement(sanModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANModelPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = caseGraphicalElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANModelPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseNamedElement(node);
				if (result == null) result = caseGraphicalElement(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANModelPackage.COMPOSED_NODE: {
				ComposedNode composedNode = (ComposedNode)theEObject;
				T result = caseComposedNode(composedNode);
				if (result == null) result = caseNode(composedNode);
				if (result == null) result = caseNamedElement(composedNode);
				if (result == null) result = caseGraphicalElement(composedNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANModelPackage.SHARED_STATE: {
				SharedState sharedState = (SharedState)theEObject;
				T result = caseSharedState(sharedState);
				if (result == null) result = caseNamedElement(sharedState);
				if (result == null) result = caseGraphicalElement(sharedState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANModelPackage.JOIN: {
				Join join = (Join)theEObject;
				T result = caseJoin(join);
				if (result == null) result = caseComposedNode(join);
				if (result == null) result = caseNode(join);
				if (result == null) result = caseNamedElement(join);
				if (result == null) result = caseGraphicalElement(join);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANModelPackage.REP: {
				Rep rep = (Rep)theEObject;
				T result = caseRep(rep);
				if (result == null) result = caseComposedNode(rep);
				if (result == null) result = caseNode(rep);
				if (result == null) result = caseNamedElement(rep);
				if (result == null) result = caseGraphicalElement(rep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANModelPackage.ATOMIC_NODE: {
				AtomicNode atomicNode = (AtomicNode)theEObject;
				T result = caseAtomicNode(atomicNode);
				if (result == null) result = caseNode(atomicNode);
				if (result == null) result = caseNamedElement(atomicNode);
				if (result == null) result = caseGraphicalElement(atomicNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANModelPackage.PLACE: {
				Place place = (Place)theEObject;
				T result = casePlace(place);
				if (result == null) result = casePrimitive(place);
				if (result == null) result = caseNamedElement(place);
				if (result == null) result = caseGraphicalElement(place);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANModelPackage.TIMED_ACTIVITY: {
				TimedActivity timedActivity = (TimedActivity)theEObject;
				T result = caseTimedActivity(timedActivity);
				if (result == null) result = caseActivity(timedActivity);
				if (result == null) result = caseNamedElement(timedActivity);
				if (result == null) result = caseGraphicalElement(timedActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANModelPackage.INSTANTANEOUS_ACTIVITY: {
				InstantaneousActivity instantaneousActivity = (InstantaneousActivity)theEObject;
				T result = caseInstantaneousActivity(instantaneousActivity);
				if (result == null) result = caseActivity(instantaneousActivity);
				if (result == null) result = caseNamedElement(instantaneousActivity);
				if (result == null) result = caseGraphicalElement(instantaneousActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANModelPackage.INPUT_GATE: {
				InputGate inputGate = (InputGate)theEObject;
				T result = caseInputGate(inputGate);
				if (result == null) result = casePrimitive(inputGate);
				if (result == null) result = caseNamedElement(inputGate);
				if (result == null) result = caseGraphicalElement(inputGate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANModelPackage.OUTPUT_GATE: {
				OutputGate outputGate = (OutputGate)theEObject;
				T result = caseOutputGate(outputGate);
				if (result == null) result = caseInputGate(outputGate);
				if (result == null) result = casePrimitive(outputGate);
				if (result == null) result = caseNamedElement(outputGate);
				if (result == null) result = caseGraphicalElement(outputGate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANModelPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseNamedElement(activity);
				if (result == null) result = caseGraphicalElement(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANModelPackage.GATE: {
				Gate gate = (Gate)theEObject;
				T result = caseGate(gate);
				if (result == null) result = caseNamedElement(gate);
				if (result == null) result = caseGraphicalElement(gate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANModelPackage.GLOBAL_VARIABLE: {
				GlobalVariable globalVariable = (GlobalVariable)theEObject;
				T result = caseGlobalVariable(globalVariable);
				if (result == null) result = caseNamedElement(globalVariable);
				if (result == null) result = caseGraphicalElement(globalVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANModelPackage.ACTIVITY_PLACE_CASE: {
				ActivityPlaceCase activityPlaceCase = (ActivityPlaceCase)theEObject;
				T result = caseActivityPlaceCase(activityPlaceCase);
				if (result == null) result = caseGraphicalElement(activityPlaceCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANModelPackage.GRAPHICAL_ELEMENT: {
				GraphicalElement graphicalElement = (GraphicalElement)theEObject;
				T result = caseGraphicalElement(graphicalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SANModelPackage.PRIMITIVE: {
				Primitive primitive = (Primitive)theEObject;
				T result = casePrimitive(primitive);
				if (result == null) result = caseNamedElement(primitive);
				if (result == null) result = caseGraphicalElement(primitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SAN Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SAN Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSANModel(SANModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composed Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composed Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposedNode(ComposedNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shared State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shared State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharedState(SharedState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoin(Join object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rep</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rep</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRep(Rep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicNode(AtomicNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlace(Place object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedActivity(TimedActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instantaneous Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instantaneous Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstantaneousActivity(InstantaneousActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputGate(InputGate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputGate(OutputGate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGate(Gate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalVariable(GlobalVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Place Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Place Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityPlaceCase(ActivityPlaceCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphical Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphical Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicalElement(GraphicalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitive(Primitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SANModelSwitch
