/**
 */
package org.polarsys.chess.mobius.model.SAN.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.chess.mobius.model.SAN.Rep;
import org.polarsys.chess.mobius.model.SAN.SANModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rep</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.impl.RepImpl#getNumbOfReps <em>Numb Of Reps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepImpl extends ComposedNodeImpl implements Rep {
	/**
	 * The default value of the '{@link #getNumbOfReps() <em>Numb Of Reps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumbOfReps()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMB_OF_REPS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getNumbOfReps() <em>Numb Of Reps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumbOfReps()
	 * @generated
	 * @ordered
	 */
	protected String numbOfReps = NUMB_OF_REPS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANModelPackage.Literals.REP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumbOfReps() {
		return numbOfReps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumbOfReps(String newNumbOfReps) {
		String oldNumbOfReps = numbOfReps;
		numbOfReps = newNumbOfReps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANModelPackage.REP__NUMB_OF_REPS, oldNumbOfReps, numbOfReps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SANModelPackage.REP__NUMB_OF_REPS:
				return getNumbOfReps();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SANModelPackage.REP__NUMB_OF_REPS:
				setNumbOfReps((String)newValue);
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
			case SANModelPackage.REP__NUMB_OF_REPS:
				setNumbOfReps(NUMB_OF_REPS_EDEFAULT);
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
			case SANModelPackage.REP__NUMB_OF_REPS:
				return NUMB_OF_REPS_EDEFAULT == null ? numbOfReps != null : !NUMB_OF_REPS_EDEFAULT.equals(numbOfReps);
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
		result.append(" (numbOfReps: ");
		result.append(numbOfReps);
		result.append(')');
		return result.toString();
	}

} //RepImpl
