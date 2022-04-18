/**
 */
package org.polarsys.chess.mobius.model.SAN.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.chess.mobius.model.SAN.Activity;
import org.polarsys.chess.mobius.model.SAN.ActivityPlaceCase;
import org.polarsys.chess.mobius.model.SAN.OutputGate;
import org.polarsys.chess.mobius.model.SAN.Place;
import org.polarsys.chess.mobius.model.SAN.SANModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.impl.ActivityImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.impl.ActivityImpl#getOutputGate <em>Output Gate</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.impl.ActivityImpl#getCase <em>Case</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.impl.ActivityImpl#getPlacecase <em>Placecase</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActivityImpl extends NamedElementImpl implements Activity {
	/**
	 * The cached value of the '{@link #getPlace() <em>Place</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> place;

	/**
	 * The cached value of the '{@link #getOutputGate() <em>Output Gate</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputGate()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputGate> outputGate;

	/**
	 * The cached value of the '{@link #getCase() <em>Case</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCase()
	 * @generated
	 * @ordered
	 */
	protected EList<String> case_;

	/**
	 * The cached value of the '{@link #getPlacecase() <em>Placecase</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacecase()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityPlaceCase> placecase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANModelPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Place> getPlace() {
		if (place == null) {
			place = new EObjectResolvingEList<Place>(Place.class, this, SANModelPackage.ACTIVITY__PLACE);
		}
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputGate> getOutputGate() {
		if (outputGate == null) {
			outputGate = new EObjectResolvingEList<OutputGate>(OutputGate.class, this, SANModelPackage.ACTIVITY__OUTPUT_GATE);
		}
		return outputGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCase() {
		if (case_ == null) {
			case_ = new EDataTypeUniqueEList<String>(String.class, this, SANModelPackage.ACTIVITY__CASE);
		}
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityPlaceCase> getPlacecase() {
		if (placecase == null) {
			placecase = new EObjectContainmentEList<ActivityPlaceCase>(ActivityPlaceCase.class, this, SANModelPackage.ACTIVITY__PLACECASE);
		}
		return placecase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SANModelPackage.ACTIVITY__PLACECASE:
				return ((InternalEList<?>)getPlacecase()).basicRemove(otherEnd, msgs);
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
			case SANModelPackage.ACTIVITY__PLACE:
				return getPlace();
			case SANModelPackage.ACTIVITY__OUTPUT_GATE:
				return getOutputGate();
			case SANModelPackage.ACTIVITY__CASE:
				return getCase();
			case SANModelPackage.ACTIVITY__PLACECASE:
				return getPlacecase();
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
			case SANModelPackage.ACTIVITY__PLACE:
				getPlace().clear();
				getPlace().addAll((Collection<? extends Place>)newValue);
				return;
			case SANModelPackage.ACTIVITY__OUTPUT_GATE:
				getOutputGate().clear();
				getOutputGate().addAll((Collection<? extends OutputGate>)newValue);
				return;
			case SANModelPackage.ACTIVITY__CASE:
				getCase().clear();
				getCase().addAll((Collection<? extends String>)newValue);
				return;
			case SANModelPackage.ACTIVITY__PLACECASE:
				getPlacecase().clear();
				getPlacecase().addAll((Collection<? extends ActivityPlaceCase>)newValue);
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
			case SANModelPackage.ACTIVITY__PLACE:
				getPlace().clear();
				return;
			case SANModelPackage.ACTIVITY__OUTPUT_GATE:
				getOutputGate().clear();
				return;
			case SANModelPackage.ACTIVITY__CASE:
				getCase().clear();
				return;
			case SANModelPackage.ACTIVITY__PLACECASE:
				getPlacecase().clear();
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
			case SANModelPackage.ACTIVITY__PLACE:
				return place != null && !place.isEmpty();
			case SANModelPackage.ACTIVITY__OUTPUT_GATE:
				return outputGate != null && !outputGate.isEmpty();
			case SANModelPackage.ACTIVITY__CASE:
				return case_ != null && !case_.isEmpty();
			case SANModelPackage.ACTIVITY__PLACECASE:
				return placecase != null && !placecase.isEmpty();
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
		result.append(" (case: ");
		result.append(case_);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
