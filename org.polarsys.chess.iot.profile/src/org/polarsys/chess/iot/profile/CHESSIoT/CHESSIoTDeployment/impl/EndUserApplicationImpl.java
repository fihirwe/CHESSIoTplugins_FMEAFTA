/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.EndUserApplication;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End User Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.EndUserApplicationImpl#getCustomConf <em>Custom Conf</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndUserApplicationImpl extends ServiceImpl implements EndUserApplication {
	/**
	 * The default value of the '{@link #getCustomConf() <em>Custom Conf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomConf()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_CONF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomConf() <em>Custom Conf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomConf()
	 * @generated
	 * @ordered
	 */
	protected String customConf = CUSTOM_CONF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndUserApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTDeploymentPackage.Literals.END_USER_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomConf() {
		return customConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomConf(String newCustomConf) {
		String oldCustomConf = customConf;
		customConf = newCustomConf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTDeploymentPackage.END_USER_APPLICATION__CUSTOM_CONF, oldCustomConf, customConf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTDeploymentPackage.END_USER_APPLICATION__CUSTOM_CONF:
				return getCustomConf();
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
			case CHESSIoTDeploymentPackage.END_USER_APPLICATION__CUSTOM_CONF:
				setCustomConf((String)newValue);
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
			case CHESSIoTDeploymentPackage.END_USER_APPLICATION__CUSTOM_CONF:
				setCustomConf(CUSTOM_CONF_EDEFAULT);
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
			case CHESSIoTDeploymentPackage.END_USER_APPLICATION__CUSTOM_CONF:
				return CUSTOM_CONF_EDEFAULT == null ? customConf != null : !CUSTOM_CONF_EDEFAULT.equals(customConf);
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
		result.append(" (customConf: ");
		result.append(customConf);
		result.append(')');
		return result.toString();
	}

} //EndUserApplicationImpl
