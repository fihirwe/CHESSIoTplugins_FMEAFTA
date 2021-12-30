/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTPort;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Payload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SendPayloadImpl#getPayload <em>Payload</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SendPayloadImpl#getIotport <em>Iotport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SendPayloadImpl extends IoTActionImpl implements SendPayload {
	/**
	 * The cached value of the '{@link #getPayload() <em>Payload</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayload()
	 * @generated
	 * @ordered
	 */
	protected EList<Payload> payload;

	/**
	 * The cached value of the '{@link #getIotport() <em>Iotport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIotport()
	 * @generated
	 * @ordered
	 */
	protected IoTPort iotport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendPayloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSoftwarePackage.Literals.SEND_PAYLOAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Payload> getPayload() {
		if (payload == null) {
			payload = new EObjectResolvingEList<Payload>(Payload.class, this, CHESSIoTSoftwarePackage.SEND_PAYLOAD__PAYLOAD);
		}
		return payload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTPort getIotport() {
		if (iotport != null && iotport.eIsProxy()) {
			InternalEObject oldIotport = (InternalEObject)iotport;
			iotport = (IoTPort)eResolveProxy(oldIotport);
			if (iotport != oldIotport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.SEND_PAYLOAD__IOTPORT, oldIotport, iotport));
			}
		}
		return iotport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTPort basicGetIotport() {
		return iotport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIotport(IoTPort newIotport) {
		IoTPort oldIotport = iotport;
		iotport = newIotport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.SEND_PAYLOAD__IOTPORT, oldIotport, iotport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD__PAYLOAD:
				return getPayload();
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD__IOTPORT:
				if (resolve) return getIotport();
				return basicGetIotport();
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
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD__PAYLOAD:
				getPayload().clear();
				getPayload().addAll((Collection<? extends Payload>)newValue);
				return;
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD__IOTPORT:
				setIotport((IoTPort)newValue);
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
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD__PAYLOAD:
				getPayload().clear();
				return;
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD__IOTPORT:
				setIotport((IoTPort)null);
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
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD__PAYLOAD:
				return payload != null && !payload.isEmpty();
			case CHESSIoTSoftwarePackage.SEND_PAYLOAD__IOTPORT:
				return iotport != null;
		}
		return super.eIsSet(featureID);
	}

} //SendPayloadImpl
