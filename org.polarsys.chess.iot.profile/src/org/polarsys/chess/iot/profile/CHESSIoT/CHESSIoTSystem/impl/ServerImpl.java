/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.sysml.blocks.internal.impl.BlockImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTPort;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Server;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ServerImpl#getOpSystem <em>Op System</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ServerImpl#getIotport <em>Iotport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerImpl extends BlockImpl implements Server {
	/**
	 * The default value of the '{@link #getOpSystem() <em>Op System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String OP_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpSystem() <em>Op System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpSystem()
	 * @generated
	 * @ordered
	 */
	protected String opSystem = OP_SYSTEM_EDEFAULT;

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
	protected ServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSystemPackage.Literals.SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpSystem() {
		return opSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpSystem(String newOpSystem) {
		String oldOpSystem = opSystem;
		opSystem = newOpSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.SERVER__OP_SYSTEM, oldOpSystem, opSystem));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSystemPackage.SERVER__IOTPORT, oldIotport, iotport));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.SERVER__IOTPORT, oldIotport, iotport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTSystemPackage.SERVER__OP_SYSTEM:
				return getOpSystem();
			case CHESSIoTSystemPackage.SERVER__IOTPORT:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CHESSIoTSystemPackage.SERVER__OP_SYSTEM:
				setOpSystem((String)newValue);
				return;
			case CHESSIoTSystemPackage.SERVER__IOTPORT:
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
			case CHESSIoTSystemPackage.SERVER__OP_SYSTEM:
				setOpSystem(OP_SYSTEM_EDEFAULT);
				return;
			case CHESSIoTSystemPackage.SERVER__IOTPORT:
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
			case CHESSIoTSystemPackage.SERVER__OP_SYSTEM:
				return OP_SYSTEM_EDEFAULT == null ? opSystem != null : !OP_SYSTEM_EDEFAULT.equals(opSystem);
			case CHESSIoTSystemPackage.SERVER__IOTPORT:
				return iotport != null;
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
		result.append(" (opSystem: ");
		result.append(opSystem);
		result.append(')');
		return result.toString();
	}

} //ServerImpl
