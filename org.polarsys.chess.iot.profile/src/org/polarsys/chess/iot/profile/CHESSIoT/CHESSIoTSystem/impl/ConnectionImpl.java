/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.Connector;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Connection;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ConnectionImpl#getBase_Connector <em>Base Connector</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ConnectionImpl#getIotport <em>Iotport</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ConnectionImpl#getCommMode <em>Comm Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
	/**
	 * The cached value of the '{@link #getBase_Connector() <em>Base Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Connector()
	 * @generated
	 * @ordered
	 */
	protected Connector base_Connector;

	/**
	 * The cached value of the '{@link #getIotport() <em>Iotport</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIotport()
	 * @generated
	 * @ordered
	 */
	protected EList<IoTPort> iotport;

	/**
	 * The default value of the '{@link #getCommMode() <em>Comm Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommMode()
	 * @generated
	 * @ordered
	 */
	protected static final String COMM_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommMode() <em>Comm Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommMode()
	 * @generated
	 * @ordered
	 */
	protected String commMode = COMM_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSystemPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getBase_Connector() {
		if (base_Connector != null && base_Connector.eIsProxy()) {
			InternalEObject oldBase_Connector = (InternalEObject)base_Connector;
			base_Connector = (Connector)eResolveProxy(oldBase_Connector);
			if (base_Connector != oldBase_Connector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSystemPackage.CONNECTION__BASE_CONNECTOR, oldBase_Connector, base_Connector));
			}
		}
		return base_Connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetBase_Connector() {
		return base_Connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Connector(Connector newBase_Connector) {
		Connector oldBase_Connector = base_Connector;
		base_Connector = newBase_Connector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.CONNECTION__BASE_CONNECTOR, oldBase_Connector, base_Connector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IoTPort> getIotport() {
		if (iotport == null) {
			iotport = new EObjectResolvingEList<IoTPort>(IoTPort.class, this, CHESSIoTSystemPackage.CONNECTION__IOTPORT);
		}
		return iotport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommMode() {
		return commMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommMode(String newCommMode) {
		String oldCommMode = commMode;
		commMode = newCommMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.CONNECTION__COMM_MODE, oldCommMode, commMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTSystemPackage.CONNECTION__BASE_CONNECTOR:
				if (resolve) return getBase_Connector();
				return basicGetBase_Connector();
			case CHESSIoTSystemPackage.CONNECTION__IOTPORT:
				return getIotport();
			case CHESSIoTSystemPackage.CONNECTION__COMM_MODE:
				return getCommMode();
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
			case CHESSIoTSystemPackage.CONNECTION__BASE_CONNECTOR:
				setBase_Connector((Connector)newValue);
				return;
			case CHESSIoTSystemPackage.CONNECTION__IOTPORT:
				getIotport().clear();
				getIotport().addAll((Collection<? extends IoTPort>)newValue);
				return;
			case CHESSIoTSystemPackage.CONNECTION__COMM_MODE:
				setCommMode((String)newValue);
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
			case CHESSIoTSystemPackage.CONNECTION__BASE_CONNECTOR:
				setBase_Connector((Connector)null);
				return;
			case CHESSIoTSystemPackage.CONNECTION__IOTPORT:
				getIotport().clear();
				return;
			case CHESSIoTSystemPackage.CONNECTION__COMM_MODE:
				setCommMode(COMM_MODE_EDEFAULT);
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
			case CHESSIoTSystemPackage.CONNECTION__BASE_CONNECTOR:
				return base_Connector != null;
			case CHESSIoTSystemPackage.CONNECTION__IOTPORT:
				return iotport != null && !iotport.isEmpty();
			case CHESSIoTSystemPackage.CONNECTION__COMM_MODE:
				return COMM_MODE_EDEFAULT == null ? commMode != null : !COMM_MODE_EDEFAULT.equals(commMode);
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
		result.append(" (commMode: ");
		result.append(commMode);
		result.append(')');
		return result.toString();
	}

} //ConnectionImpl
