/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.Port;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTPort;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Io TPort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTPortImpl#getBase_Port <em>Base Port</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTPortImpl#getConnectionPins <em>Connection Pins</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTPortImpl#getSend_payload <em>Send payload</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTPortImpl#getReceive_payload <em>Receive payload</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IoTPortImpl extends MinimalEObjectImpl.Container implements IoTPort {
	/**
	 * The cached value of the '{@link #getBase_Port() <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Port()
	 * @generated
	 * @ordered
	 */
	protected Port base_Port;

	/**
	 * The cached value of the '{@link #getConnectionPins() <em>Connection Pins</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionPins()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> connectionPins;

	/**
	 * The cached value of the '{@link #getSend_payload() <em>Send payload</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSend_payload()
	 * @generated
	 * @ordered
	 */
	protected EList<Payload> send_payload;

	/**
	 * The cached value of the '{@link #getReceive_payload() <em>Receive payload</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceive_payload()
	 * @generated
	 * @ordered
	 */
	protected EList<Payload> receive_payload;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IoTPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSoftwarePackage.Literals.IO_TPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getBase_Port() {
		if (base_Port != null && base_Port.eIsProxy()) {
			InternalEObject oldBase_Port = (InternalEObject)base_Port;
			base_Port = (Port)eResolveProxy(oldBase_Port);
			if (base_Port != oldBase_Port) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.IO_TPORT__BASE_PORT, oldBase_Port, base_Port));
			}
		}
		return base_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetBase_Port() {
		return base_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Port(Port newBase_Port) {
		Port oldBase_Port = base_Port;
		base_Port = newBase_Port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.IO_TPORT__BASE_PORT, oldBase_Port, base_Port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getConnectionPins() {
		if (connectionPins == null) {
			connectionPins = new EDataTypeUniqueEList<Integer>(Integer.class, this, CHESSIoTSoftwarePackage.IO_TPORT__CONNECTION_PINS);
		}
		return connectionPins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Payload> getSend_payload() {
		if (send_payload == null) {
			send_payload = new EObjectResolvingEList<Payload>(Payload.class, this, CHESSIoTSoftwarePackage.IO_TPORT__SEND_PAYLOAD);
		}
		return send_payload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Payload> getReceive_payload() {
		if (receive_payload == null) {
			receive_payload = new EObjectResolvingEList<Payload>(Payload.class, this, CHESSIoTSoftwarePackage.IO_TPORT__RECEIVE_PAYLOAD);
		}
		return receive_payload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.IO_TPORT__BASE_PORT:
				if (resolve) return getBase_Port();
				return basicGetBase_Port();
			case CHESSIoTSoftwarePackage.IO_TPORT__CONNECTION_PINS:
				return getConnectionPins();
			case CHESSIoTSoftwarePackage.IO_TPORT__SEND_PAYLOAD:
				return getSend_payload();
			case CHESSIoTSoftwarePackage.IO_TPORT__RECEIVE_PAYLOAD:
				return getReceive_payload();
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
			case CHESSIoTSoftwarePackage.IO_TPORT__BASE_PORT:
				setBase_Port((Port)newValue);
				return;
			case CHESSIoTSoftwarePackage.IO_TPORT__CONNECTION_PINS:
				getConnectionPins().clear();
				getConnectionPins().addAll((Collection<? extends Integer>)newValue);
				return;
			case CHESSIoTSoftwarePackage.IO_TPORT__SEND_PAYLOAD:
				getSend_payload().clear();
				getSend_payload().addAll((Collection<? extends Payload>)newValue);
				return;
			case CHESSIoTSoftwarePackage.IO_TPORT__RECEIVE_PAYLOAD:
				getReceive_payload().clear();
				getReceive_payload().addAll((Collection<? extends Payload>)newValue);
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
			case CHESSIoTSoftwarePackage.IO_TPORT__BASE_PORT:
				setBase_Port((Port)null);
				return;
			case CHESSIoTSoftwarePackage.IO_TPORT__CONNECTION_PINS:
				getConnectionPins().clear();
				return;
			case CHESSIoTSoftwarePackage.IO_TPORT__SEND_PAYLOAD:
				getSend_payload().clear();
				return;
			case CHESSIoTSoftwarePackage.IO_TPORT__RECEIVE_PAYLOAD:
				getReceive_payload().clear();
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
			case CHESSIoTSoftwarePackage.IO_TPORT__BASE_PORT:
				return base_Port != null;
			case CHESSIoTSoftwarePackage.IO_TPORT__CONNECTION_PINS:
				return connectionPins != null && !connectionPins.isEmpty();
			case CHESSIoTSoftwarePackage.IO_TPORT__SEND_PAYLOAD:
				return send_payload != null && !send_payload.isEmpty();
			case CHESSIoTSoftwarePackage.IO_TPORT__RECEIVE_PAYLOAD:
				return receive_payload != null && !receive_payload.isEmpty();
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
		result.append(" (connectionPins: ");
		result.append(connectionPins);
		result.append(')');
		return result.toString();
	}

} //IoTPortImpl
