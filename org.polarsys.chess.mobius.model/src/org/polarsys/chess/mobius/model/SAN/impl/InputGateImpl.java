/**
 */
package org.polarsys.chess.mobius.model.SAN.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.chess.mobius.model.SAN.Activity;
import org.polarsys.chess.mobius.model.SAN.InputGate;
import org.polarsys.chess.mobius.model.SAN.SANModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Gate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.impl.InputGateImpl#getInputPredicated <em>Input Predicated</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.impl.InputGateImpl#getInputFunction <em>Input Function</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.impl.InputGateImpl#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputGateImpl extends PrimitiveImpl implements InputGate {
	/**
	 * The default value of the '{@link #getInputPredicated() <em>Input Predicated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPredicated()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_PREDICATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputPredicated() <em>Input Predicated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPredicated()
	 * @generated
	 * @ordered
	 */
	protected String inputPredicated = INPUT_PREDICATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputFunction() <em>Input Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFunction()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_FUNCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputFunction() <em>Input Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFunction()
	 * @generated
	 * @ordered
	 */
	protected String inputFunction = INPUT_FUNCTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputGateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANModelPackage.Literals.INPUT_GATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputPredicated() {
		return inputPredicated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputPredicated(String newInputPredicated) {
		String oldInputPredicated = inputPredicated;
		inputPredicated = newInputPredicated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANModelPackage.INPUT_GATE__INPUT_PREDICATED, oldInputPredicated, inputPredicated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputFunction() {
		return inputFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputFunction(String newInputFunction) {
		String oldInputFunction = inputFunction;
		inputFunction = newInputFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANModelPackage.INPUT_GATE__INPUT_FUNCTION, oldInputFunction, inputFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivity() {
		if (activity == null) {
			activity = new EObjectResolvingEList<Activity>(Activity.class, this, SANModelPackage.INPUT_GATE__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SANModelPackage.INPUT_GATE__INPUT_PREDICATED:
				return getInputPredicated();
			case SANModelPackage.INPUT_GATE__INPUT_FUNCTION:
				return getInputFunction();
			case SANModelPackage.INPUT_GATE__ACTIVITY:
				return getActivity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SANModelPackage.INPUT_GATE__INPUT_PREDICATED:
				setInputPredicated((String)newValue);
				return;
			case SANModelPackage.INPUT_GATE__INPUT_FUNCTION:
				setInputFunction((String)newValue);
				return;
			case SANModelPackage.INPUT_GATE__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends Activity>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SANModelPackage.INPUT_GATE__INPUT_PREDICATED:
				setInputPredicated(INPUT_PREDICATED_EDEFAULT);
				return;
			case SANModelPackage.INPUT_GATE__INPUT_FUNCTION:
				setInputFunction(INPUT_FUNCTION_EDEFAULT);
				return;
			case SANModelPackage.INPUT_GATE__ACTIVITY:
				getActivity().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SANModelPackage.INPUT_GATE__INPUT_PREDICATED:
				return INPUT_PREDICATED_EDEFAULT == null ? inputPredicated != null : !INPUT_PREDICATED_EDEFAULT.equals(inputPredicated);
			case SANModelPackage.INPUT_GATE__INPUT_FUNCTION:
				return INPUT_FUNCTION_EDEFAULT == null ? inputFunction != null : !INPUT_FUNCTION_EDEFAULT.equals(inputFunction);
			case SANModelPackage.INPUT_GATE__ACTIVITY:
				return activity != null && !activity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (inputPredicated: ");
		result.append(inputPredicated);
		result.append(", inputFunction: ");
		result.append(inputFunction);
		result.append(')');
		return result.toString();
	}

} //InputGateImpl
