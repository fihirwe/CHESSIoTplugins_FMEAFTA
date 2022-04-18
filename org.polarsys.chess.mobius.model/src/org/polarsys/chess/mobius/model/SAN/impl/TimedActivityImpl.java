/**
 */
package org.polarsys.chess.mobius.model.SAN.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.chess.mobius.model.SAN.SANModelPackage;
import org.polarsys.chess.mobius.model.SAN.TimedActivity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.impl.TimedActivityImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.impl.TimedActivityImpl#getTimeDistributionFunction <em>Time Distribution Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimedActivityImpl extends ActivityImpl implements TimedActivity {
	/**
	 * The default value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected static final String RATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected String rate = RATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getTimeDistributionFunction() <em>Time Distribution Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeDistributionFunction()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_DISTRIBUTION_FUNCTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTimeDistributionFunction() <em>Time Distribution Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeDistributionFunction()
	 * @generated
	 * @ordered
	 */
	protected String timeDistributionFunction = TIME_DISTRIBUTION_FUNCTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANModelPackage.Literals.TIMED_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRate() {
		return rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRate(String newRate) {
		String oldRate = rate;
		rate = newRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANModelPackage.TIMED_ACTIVITY__RATE, oldRate, rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeDistributionFunction() {
		return timeDistributionFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeDistributionFunction(String newTimeDistributionFunction) {
		String oldTimeDistributionFunction = timeDistributionFunction;
		timeDistributionFunction = newTimeDistributionFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANModelPackage.TIMED_ACTIVITY__TIME_DISTRIBUTION_FUNCTION, oldTimeDistributionFunction, timeDistributionFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SANModelPackage.TIMED_ACTIVITY__RATE:
				return getRate();
			case SANModelPackage.TIMED_ACTIVITY__TIME_DISTRIBUTION_FUNCTION:
				return getTimeDistributionFunction();
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
			case SANModelPackage.TIMED_ACTIVITY__RATE:
				setRate((String)newValue);
				return;
			case SANModelPackage.TIMED_ACTIVITY__TIME_DISTRIBUTION_FUNCTION:
				setTimeDistributionFunction((String)newValue);
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
			case SANModelPackage.TIMED_ACTIVITY__RATE:
				setRate(RATE_EDEFAULT);
				return;
			case SANModelPackage.TIMED_ACTIVITY__TIME_DISTRIBUTION_FUNCTION:
				setTimeDistributionFunction(TIME_DISTRIBUTION_FUNCTION_EDEFAULT);
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
			case SANModelPackage.TIMED_ACTIVITY__RATE:
				return RATE_EDEFAULT == null ? rate != null : !RATE_EDEFAULT.equals(rate);
			case SANModelPackage.TIMED_ACTIVITY__TIME_DISTRIBUTION_FUNCTION:
				return TIME_DISTRIBUTION_FUNCTION_EDEFAULT == null ? timeDistributionFunction != null : !TIME_DISTRIBUTION_FUNCTION_EDEFAULT.equals(timeDistributionFunction);
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
		result.append(" (rate: ");
		result.append(rate);
		result.append(", timeDistributionFunction: ");
		result.append(timeDistributionFunction);
		result.append(')');
		return result.toString();
	}

} //TimedActivityImpl
