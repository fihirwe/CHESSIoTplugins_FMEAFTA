/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.BrokerType;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.MQTTBroker;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MQTT Broker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.MQTTBrokerImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.MQTTBrokerImpl#isAnonymous <em>Anonymous</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.MQTTBrokerImpl#isPersistence <em>Persistence</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.MQTTBrokerImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.MQTTBrokerImpl#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MQTTBrokerImpl extends ServiceImpl implements MQTTBroker {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final BrokerType TYPE_EDEFAULT = BrokerType.MOSQUITTO;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected BrokerType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAnonymous() <em>Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnonymous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANONYMOUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnonymous() <em>Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnonymous()
	 * @generated
	 * @ordered
	 */
	protected boolean anonymous = ANONYMOUS_EDEFAULT;

	/**
	 * The default value of the '{@link #isPersistence() <em>Persistence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistence()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERSISTENCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPersistence() <em>Persistence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistence()
	 * @generated
	 * @ordered
	 */
	protected boolean persistence = PERSISTENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MQTTBrokerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTDeploymentPackage.Literals.MQTT_BROKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrokerType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(BrokerType newType) {
		BrokerType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTDeploymentPackage.MQTT_BROKER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAnonymous() {
		return anonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnonymous(boolean newAnonymous) {
		boolean oldAnonymous = anonymous;
		anonymous = newAnonymous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTDeploymentPackage.MQTT_BROKER__ANONYMOUS, oldAnonymous, anonymous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPersistence() {
		return persistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistence(boolean newPersistence) {
		boolean oldPersistence = persistence;
		persistence = newPersistence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTDeploymentPackage.MQTT_BROKER__PERSISTENCE, oldPersistence, persistence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTDeploymentPackage.MQTT_BROKER__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTDeploymentPackage.MQTT_BROKER__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTDeploymentPackage.MQTT_BROKER__TYPE:
				return getType();
			case CHESSIoTDeploymentPackage.MQTT_BROKER__ANONYMOUS:
				return isAnonymous();
			case CHESSIoTDeploymentPackage.MQTT_BROKER__PERSISTENCE:
				return isPersistence();
			case CHESSIoTDeploymentPackage.MQTT_BROKER__USERNAME:
				return getUsername();
			case CHESSIoTDeploymentPackage.MQTT_BROKER__PASSWORD:
				return getPassword();
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
			case CHESSIoTDeploymentPackage.MQTT_BROKER__TYPE:
				setType((BrokerType)newValue);
				return;
			case CHESSIoTDeploymentPackage.MQTT_BROKER__ANONYMOUS:
				setAnonymous((Boolean)newValue);
				return;
			case CHESSIoTDeploymentPackage.MQTT_BROKER__PERSISTENCE:
				setPersistence((Boolean)newValue);
				return;
			case CHESSIoTDeploymentPackage.MQTT_BROKER__USERNAME:
				setUsername((String)newValue);
				return;
			case CHESSIoTDeploymentPackage.MQTT_BROKER__PASSWORD:
				setPassword((String)newValue);
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
			case CHESSIoTDeploymentPackage.MQTT_BROKER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CHESSIoTDeploymentPackage.MQTT_BROKER__ANONYMOUS:
				setAnonymous(ANONYMOUS_EDEFAULT);
				return;
			case CHESSIoTDeploymentPackage.MQTT_BROKER__PERSISTENCE:
				setPersistence(PERSISTENCE_EDEFAULT);
				return;
			case CHESSIoTDeploymentPackage.MQTT_BROKER__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case CHESSIoTDeploymentPackage.MQTT_BROKER__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
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
			case CHESSIoTDeploymentPackage.MQTT_BROKER__TYPE:
				return type != TYPE_EDEFAULT;
			case CHESSIoTDeploymentPackage.MQTT_BROKER__ANONYMOUS:
				return anonymous != ANONYMOUS_EDEFAULT;
			case CHESSIoTDeploymentPackage.MQTT_BROKER__PERSISTENCE:
				return persistence != PERSISTENCE_EDEFAULT;
			case CHESSIoTDeploymentPackage.MQTT_BROKER__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case CHESSIoTDeploymentPackage.MQTT_BROKER__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", anonymous: ");
		result.append(anonymous);
		result.append(", persistence: ");
		result.append(persistence);
		result.append(", username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(')');
		return result.toString();
	}

} //MQTTBrokerImpl
