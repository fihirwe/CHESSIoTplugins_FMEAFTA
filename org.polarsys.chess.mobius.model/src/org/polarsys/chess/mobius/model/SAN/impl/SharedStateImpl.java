/**
 */
package org.polarsys.chess.mobius.model.SAN.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.polarsys.chess.mobius.model.SAN.Place;
import org.polarsys.chess.mobius.model.SAN.SANModelPackage;
import org.polarsys.chess.mobius.model.SAN.SharedState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shared State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.impl.SharedStateImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.impl.SharedStateImpl#getSharedStates <em>Shared States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SharedStateImpl extends NamedElementImpl implements SharedState {
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
	 * The cached value of the '{@link #getSharedStates() <em>Shared States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedStates()
	 * @generated
	 * @ordered
	 */
	protected EList<SharedState> sharedStates;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SharedStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANModelPackage.Literals.SHARED_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Place> getPlace() {
		if (place == null) {
			place = new EObjectResolvingEList<Place>(Place.class, this, SANModelPackage.SHARED_STATE__PLACE);
		}
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SharedState> getSharedStates() {
		if (sharedStates == null) {
			sharedStates = new EObjectResolvingEList<SharedState>(SharedState.class, this, SANModelPackage.SHARED_STATE__SHARED_STATES);
		}
		return sharedStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SANModelPackage.SHARED_STATE__PLACE:
				return getPlace();
			case SANModelPackage.SHARED_STATE__SHARED_STATES:
				return getSharedStates();
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
			case SANModelPackage.SHARED_STATE__PLACE:
				getPlace().clear();
				getPlace().addAll((Collection<? extends Place>)newValue);
				return;
			case SANModelPackage.SHARED_STATE__SHARED_STATES:
				getSharedStates().clear();
				getSharedStates().addAll((Collection<? extends SharedState>)newValue);
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
			case SANModelPackage.SHARED_STATE__PLACE:
				getPlace().clear();
				return;
			case SANModelPackage.SHARED_STATE__SHARED_STATES:
				getSharedStates().clear();
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
			case SANModelPackage.SHARED_STATE__PLACE:
				return place != null && !place.isEmpty();
			case SANModelPackage.SHARED_STATE__SHARED_STATES:
				return sharedStates != null && !sharedStates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SharedStateImpl
