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
import org.polarsys.chess.mobius.model.SAN.Place;
import org.polarsys.chess.mobius.model.SAN.SANModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.impl.PlaceImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.impl.PlaceImpl#getInputGate <em>Input Gate</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.impl.PlaceImpl#getInitialState <em>Initial State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaceImpl extends PrimitiveImpl implements Place {
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
	 * The cached value of the '{@link #getInputGate() <em>Input Gate</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputGate()
	 * @generated
	 * @ordered
	 */
	protected EList<InputGate> inputGate;

	/**
	 * The default value of the '{@link #getInitialState() <em>Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected static final int INITIAL_STATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected int initialState = INITIAL_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANModelPackage.Literals.PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivity() {
		if (activity == null) {
			activity = new EObjectResolvingEList<Activity>(Activity.class, this, SANModelPackage.PLACE__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputGate> getInputGate() {
		if (inputGate == null) {
			inputGate = new EObjectResolvingEList<InputGate>(InputGate.class, this, SANModelPackage.PLACE__INPUT_GATE);
		}
		return inputGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(int newInitialState) {
		int oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANModelPackage.PLACE__INITIAL_STATE, oldInitialState, initialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SANModelPackage.PLACE__ACTIVITY:
				return getActivity();
			case SANModelPackage.PLACE__INPUT_GATE:
				return getInputGate();
			case SANModelPackage.PLACE__INITIAL_STATE:
				return getInitialState();
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
			case SANModelPackage.PLACE__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends Activity>)newValue);
				return;
			case SANModelPackage.PLACE__INPUT_GATE:
				getInputGate().clear();
				getInputGate().addAll((Collection<? extends InputGate>)newValue);
				return;
			case SANModelPackage.PLACE__INITIAL_STATE:
				setInitialState((Integer)newValue);
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
			case SANModelPackage.PLACE__ACTIVITY:
				getActivity().clear();
				return;
			case SANModelPackage.PLACE__INPUT_GATE:
				getInputGate().clear();
				return;
			case SANModelPackage.PLACE__INITIAL_STATE:
				setInitialState(INITIAL_STATE_EDEFAULT);
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
			case SANModelPackage.PLACE__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case SANModelPackage.PLACE__INPUT_GATE:
				return inputGate != null && !inputGate.isEmpty();
			case SANModelPackage.PLACE__INITIAL_STATE:
				return initialState != INITIAL_STATE_EDEFAULT;
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
		result.append(" (initialState: ");
		result.append(initialState);
		result.append(')');
		return result.toString();
	}

} //PlaceImpl
