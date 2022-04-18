/**
 */
package org.polarsys.chess.mobius.model.SAN.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.polarsys.chess.mobius.model.SAN.ActivityPlaceCase;
import org.polarsys.chess.mobius.model.SAN.Primitive;
import org.polarsys.chess.mobius.model.SAN.SANModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Place Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.impl.ActivityPlaceCaseImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.impl.ActivityPlaceCaseImpl#getCase <em>Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityPlaceCaseImpl extends GraphicalElementImpl implements ActivityPlaceCase {
	/**
	 * The cached value of the '{@link #getPlace() <em>Place</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected EList<Primitive> place;

	/**
	 * The default value of the '{@link #getCase() <em>Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCase()
	 * @generated
	 * @ordered
	 */
	protected static final int CASE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCase() <em>Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCase()
	 * @generated
	 * @ordered
	 */
	protected int case_ = CASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityPlaceCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANModelPackage.Literals.ACTIVITY_PLACE_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Primitive> getPlace() {
		if (place == null) {
			place = new EObjectResolvingEList<Primitive>(Primitive.class, this, SANModelPackage.ACTIVITY_PLACE_CASE__PLACE);
		}
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCase() {
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCase(int newCase) {
		int oldCase = case_;
		case_ = newCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANModelPackage.ACTIVITY_PLACE_CASE__CASE, oldCase, case_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SANModelPackage.ACTIVITY_PLACE_CASE__PLACE:
				return getPlace();
			case SANModelPackage.ACTIVITY_PLACE_CASE__CASE:
				return getCase();
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
			case SANModelPackage.ACTIVITY_PLACE_CASE__PLACE:
				getPlace().clear();
				getPlace().addAll((Collection<? extends Primitive>)newValue);
				return;
			case SANModelPackage.ACTIVITY_PLACE_CASE__CASE:
				setCase((Integer)newValue);
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
			case SANModelPackage.ACTIVITY_PLACE_CASE__PLACE:
				getPlace().clear();
				return;
			case SANModelPackage.ACTIVITY_PLACE_CASE__CASE:
				setCase(CASE_EDEFAULT);
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
			case SANModelPackage.ACTIVITY_PLACE_CASE__PLACE:
				return place != null && !place.isEmpty();
			case SANModelPackage.ACTIVITY_PLACE_CASE__CASE:
				return case_ != CASE_EDEFAULT;
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

} //ActivityPlaceCaseImpl
