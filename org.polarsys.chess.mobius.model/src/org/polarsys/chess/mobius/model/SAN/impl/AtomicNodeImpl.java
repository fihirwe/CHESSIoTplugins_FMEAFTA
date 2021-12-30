/**
 */
package org.polarsys.chess.mobius.model.SAN.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.chess.mobius.model.SAN.AtomicNode;
import org.polarsys.chess.mobius.model.SAN.InputGate;
import org.polarsys.chess.mobius.model.SAN.InstantaneousActivity;
import org.polarsys.chess.mobius.model.SAN.OutputGate;
import org.polarsys.chess.mobius.model.SAN.Place;
import org.polarsys.chess.mobius.model.SAN.SANModelPackage;
import org.polarsys.chess.mobius.model.SAN.TimedActivity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.impl.AtomicNodeImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.impl.AtomicNodeImpl#getTimedActivity <em>Timed Activity</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.impl.AtomicNodeImpl#getInstantaneousActivity <em>Instantaneous Activity</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.impl.AtomicNodeImpl#getInputGate <em>Input Gate</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.impl.AtomicNodeImpl#getOutputGate <em>Output Gate</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.impl.AtomicNodeImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomicNodeImpl extends NodeImpl implements AtomicNode {
	/**
	 * The cached value of the '{@link #getPlace() <em>Place</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> place;

	/**
	 * The cached value of the '{@link #getTimedActivity() <em>Timed Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimedActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<TimedActivity> timedActivity;

	/**
	 * The cached value of the '{@link #getInstantaneousActivity() <em>Instantaneous Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantaneousActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<InstantaneousActivity> instantaneousActivity;

	/**
	 * The cached value of the '{@link #getInputGate() <em>Input Gate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputGate()
	 * @generated
	 * @ordered
	 */
	protected EList<InputGate> inputGate;

	/**
	 * The cached value of the '{@link #getOutputGate() <em>Output Gate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputGate()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputGate> outputGate;

	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANModelPackage.Literals.ATOMIC_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Place> getPlace() {
		if (place == null) {
			place = new EObjectContainmentEList<Place>(Place.class, this, SANModelPackage.ATOMIC_NODE__PLACE);
		}
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimedActivity> getTimedActivity() {
		if (timedActivity == null) {
			timedActivity = new EObjectContainmentEList<TimedActivity>(TimedActivity.class, this, SANModelPackage.ATOMIC_NODE__TIMED_ACTIVITY);
		}
		return timedActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstantaneousActivity> getInstantaneousActivity() {
		if (instantaneousActivity == null) {
			instantaneousActivity = new EObjectContainmentEList<InstantaneousActivity>(InstantaneousActivity.class, this, SANModelPackage.ATOMIC_NODE__INSTANTANEOUS_ACTIVITY);
		}
		return instantaneousActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputGate> getInputGate() {
		if (inputGate == null) {
			inputGate = new EObjectContainmentEList<InputGate>(InputGate.class, this, SANModelPackage.ATOMIC_NODE__INPUT_GATE);
		}
		return inputGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputGate> getOutputGate() {
		if (outputGate == null) {
			outputGate = new EObjectContainmentEList<OutputGate>(OutputGate.class, this, SANModelPackage.ATOMIC_NODE__OUTPUT_GATE);
		}
		return outputGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANModelPackage.ATOMIC_NODE__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SANModelPackage.ATOMIC_NODE__PLACE:
				return ((InternalEList<?>)getPlace()).basicRemove(otherEnd, msgs);
			case SANModelPackage.ATOMIC_NODE__TIMED_ACTIVITY:
				return ((InternalEList<?>)getTimedActivity()).basicRemove(otherEnd, msgs);
			case SANModelPackage.ATOMIC_NODE__INSTANTANEOUS_ACTIVITY:
				return ((InternalEList<?>)getInstantaneousActivity()).basicRemove(otherEnd, msgs);
			case SANModelPackage.ATOMIC_NODE__INPUT_GATE:
				return ((InternalEList<?>)getInputGate()).basicRemove(otherEnd, msgs);
			case SANModelPackage.ATOMIC_NODE__OUTPUT_GATE:
				return ((InternalEList<?>)getOutputGate()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SANModelPackage.ATOMIC_NODE__PLACE:
				return getPlace();
			case SANModelPackage.ATOMIC_NODE__TIMED_ACTIVITY:
				return getTimedActivity();
			case SANModelPackage.ATOMIC_NODE__INSTANTANEOUS_ACTIVITY:
				return getInstantaneousActivity();
			case SANModelPackage.ATOMIC_NODE__INPUT_GATE:
				return getInputGate();
			case SANModelPackage.ATOMIC_NODE__OUTPUT_GATE:
				return getOutputGate();
			case SANModelPackage.ATOMIC_NODE__MODEL:
				return getModel();
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
			case SANModelPackage.ATOMIC_NODE__PLACE:
				getPlace().clear();
				getPlace().addAll((Collection<? extends Place>)newValue);
				return;
			case SANModelPackage.ATOMIC_NODE__TIMED_ACTIVITY:
				getTimedActivity().clear();
				getTimedActivity().addAll((Collection<? extends TimedActivity>)newValue);
				return;
			case SANModelPackage.ATOMIC_NODE__INSTANTANEOUS_ACTIVITY:
				getInstantaneousActivity().clear();
				getInstantaneousActivity().addAll((Collection<? extends InstantaneousActivity>)newValue);
				return;
			case SANModelPackage.ATOMIC_NODE__INPUT_GATE:
				getInputGate().clear();
				getInputGate().addAll((Collection<? extends InputGate>)newValue);
				return;
			case SANModelPackage.ATOMIC_NODE__OUTPUT_GATE:
				getOutputGate().clear();
				getOutputGate().addAll((Collection<? extends OutputGate>)newValue);
				return;
			case SANModelPackage.ATOMIC_NODE__MODEL:
				setModel((String)newValue);
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
			case SANModelPackage.ATOMIC_NODE__PLACE:
				getPlace().clear();
				return;
			case SANModelPackage.ATOMIC_NODE__TIMED_ACTIVITY:
				getTimedActivity().clear();
				return;
			case SANModelPackage.ATOMIC_NODE__INSTANTANEOUS_ACTIVITY:
				getInstantaneousActivity().clear();
				return;
			case SANModelPackage.ATOMIC_NODE__INPUT_GATE:
				getInputGate().clear();
				return;
			case SANModelPackage.ATOMIC_NODE__OUTPUT_GATE:
				getOutputGate().clear();
				return;
			case SANModelPackage.ATOMIC_NODE__MODEL:
				setModel(MODEL_EDEFAULT);
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
			case SANModelPackage.ATOMIC_NODE__PLACE:
				return place != null && !place.isEmpty();
			case SANModelPackage.ATOMIC_NODE__TIMED_ACTIVITY:
				return timedActivity != null && !timedActivity.isEmpty();
			case SANModelPackage.ATOMIC_NODE__INSTANTANEOUS_ACTIVITY:
				return instantaneousActivity != null && !instantaneousActivity.isEmpty();
			case SANModelPackage.ATOMIC_NODE__INPUT_GATE:
				return inputGate != null && !inputGate.isEmpty();
			case SANModelPackage.ATOMIC_NODE__OUTPUT_GATE:
				return outputGate != null && !outputGate.isEmpty();
			case SANModelPackage.ATOMIC_NODE__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
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
		result.append(" (model: ");
		result.append(model);
		result.append(')');
		return result.toString();
	}

} //AtomicNodeImpl
