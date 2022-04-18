/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.AccessMode;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.MQTTPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MQTT Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.MQTTPortImpl#getPayloadType <em>Payload Type</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.MQTTPortImpl#getBrokerAdress <em>Broker Adress</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.MQTTPortImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.MQTTPortImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MQTTPortImpl extends IoTPortImpl implements MQTTPort {
	/**
	 * The default value of the '{@link #getPayloadType() <em>Payload Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadType()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYLOAD_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPayloadType() <em>Payload Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadType()
	 * @generated
	 * @ordered
	 */
	protected String payloadType = PAYLOAD_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBrokerAdress() <em>Broker Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrokerAdress()
	 * @generated
	 * @ordered
	 */
	protected static final String BROKER_ADRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBrokerAdress() <em>Broker Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrokerAdress()
	 * @generated
	 * @ordered
	 */
	protected String brokerAdress = BROKER_ADRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopic() <em>Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected static final String TOPIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected String topic = TOPIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final AccessMode TYPE_EDEFAULT = AccessMode.SUBSCRIBER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AccessMode type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MQTTPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSoftwarePackage.Literals.MQTT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPayloadType() {
		return payloadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayloadType(String newPayloadType) {
		String oldPayloadType = payloadType;
		payloadType = newPayloadType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.MQTT_PORT__PAYLOAD_TYPE, oldPayloadType, payloadType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBrokerAdress() {
		return brokerAdress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrokerAdress(String newBrokerAdress) {
		String oldBrokerAdress = brokerAdress;
		brokerAdress = newBrokerAdress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.MQTT_PORT__BROKER_ADRESS, oldBrokerAdress, brokerAdress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTopic() {
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopic(String newTopic) {
		String oldTopic = topic;
		topic = newTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.MQTT_PORT__TOPIC, oldTopic, topic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessMode getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AccessMode newType) {
		AccessMode oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.MQTT_PORT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.MQTT_PORT__PAYLOAD_TYPE:
				return getPayloadType();
			case CHESSIoTSoftwarePackage.MQTT_PORT__BROKER_ADRESS:
				return getBrokerAdress();
			case CHESSIoTSoftwarePackage.MQTT_PORT__TOPIC:
				return getTopic();
			case CHESSIoTSoftwarePackage.MQTT_PORT__TYPE:
				return getType();
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
			case CHESSIoTSoftwarePackage.MQTT_PORT__PAYLOAD_TYPE:
				setPayloadType((String)newValue);
				return;
			case CHESSIoTSoftwarePackage.MQTT_PORT__BROKER_ADRESS:
				setBrokerAdress((String)newValue);
				return;
			case CHESSIoTSoftwarePackage.MQTT_PORT__TOPIC:
				setTopic((String)newValue);
				return;
			case CHESSIoTSoftwarePackage.MQTT_PORT__TYPE:
				setType((AccessMode)newValue);
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
			case CHESSIoTSoftwarePackage.MQTT_PORT__PAYLOAD_TYPE:
				setPayloadType(PAYLOAD_TYPE_EDEFAULT);
				return;
			case CHESSIoTSoftwarePackage.MQTT_PORT__BROKER_ADRESS:
				setBrokerAdress(BROKER_ADRESS_EDEFAULT);
				return;
			case CHESSIoTSoftwarePackage.MQTT_PORT__TOPIC:
				setTopic(TOPIC_EDEFAULT);
				return;
			case CHESSIoTSoftwarePackage.MQTT_PORT__TYPE:
				setType(TYPE_EDEFAULT);
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
			case CHESSIoTSoftwarePackage.MQTT_PORT__PAYLOAD_TYPE:
				return PAYLOAD_TYPE_EDEFAULT == null ? payloadType != null : !PAYLOAD_TYPE_EDEFAULT.equals(payloadType);
			case CHESSIoTSoftwarePackage.MQTT_PORT__BROKER_ADRESS:
				return BROKER_ADRESS_EDEFAULT == null ? brokerAdress != null : !BROKER_ADRESS_EDEFAULT.equals(brokerAdress);
			case CHESSIoTSoftwarePackage.MQTT_PORT__TOPIC:
				return TOPIC_EDEFAULT == null ? topic != null : !TOPIC_EDEFAULT.equals(topic);
			case CHESSIoTSoftwarePackage.MQTT_PORT__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (payloadType: ");
		result.append(payloadType);
		result.append(", brokerAdress: ");
		result.append(brokerAdress);
		result.append(", topic: ");
		result.append(topic);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //MQTTPortImpl
