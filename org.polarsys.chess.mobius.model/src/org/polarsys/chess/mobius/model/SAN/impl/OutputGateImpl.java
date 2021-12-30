/**
 */
package org.polarsys.chess.mobius.model.SAN.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.chess.mobius.model.SAN.OutputGate;
import org.polarsys.chess.mobius.model.SAN.SANModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Gate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.impl.OutputGateImpl#getOutputFunction <em>Output Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputGateImpl extends InputGateImpl implements OutputGate {
	/**
	 * The default value of the '{@link #getOutputFunction() <em>Output Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFunction()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_FUNCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputFunction() <em>Output Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFunction()
	 * @generated
	 * @ordered
	 */
	protected String outputFunction = OUTPUT_FUNCTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputGateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANModelPackage.Literals.OUTPUT_GATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputFunction() {
		return outputFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputFunction(String newOutputFunction) {
		String oldOutputFunction = outputFunction;
		outputFunction = newOutputFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANModelPackage.OUTPUT_GATE__OUTPUT_FUNCTION, oldOutputFunction, outputFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SANModelPackage.OUTPUT_GATE__OUTPUT_FUNCTION:
				return getOutputFunction();
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
			case SANModelPackage.OUTPUT_GATE__OUTPUT_FUNCTION:
				setOutputFunction((String)newValue);
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
			case SANModelPackage.OUTPUT_GATE__OUTPUT_FUNCTION:
				setOutputFunction(OUTPUT_FUNCTION_EDEFAULT);
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
			case SANModelPackage.OUTPUT_GATE__OUTPUT_FUNCTION:
				return OUTPUT_FUNCTION_EDEFAULT == null ? outputFunction != null : !OUTPUT_FUNCTION_EDEFAULT.equals(outputFunction);
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
		result.append(" (outputFunction: ");
		result.append(outputFunction);
		result.append(')');
		return result.toString();
	}

} //OutputGateImpl
