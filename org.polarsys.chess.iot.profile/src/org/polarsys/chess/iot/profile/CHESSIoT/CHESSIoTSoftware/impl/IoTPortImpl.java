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
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTPortImpl#getPin <em>Pin</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTPortImpl#getSends <em>Sends</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTPortImpl#getReceives <em>Receives</em>}</li>
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
	 * The cached value of the '{@link #getPin() <em>Pin</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> pin;

	/**
	 * The cached value of the '{@link #getSends() <em>Sends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSends()
	 * @generated
	 * @ordered
	 */
	protected EList<Payload> sends;

	/**
	 * The cached value of the '{@link #getReceives() <em>Receives</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceives()
	 * @generated
	 * @ordered
	 */
	protected EList<Payload> receives;

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
	public EList<Integer> getPin() {
		if (pin == null) {
			pin = new EDataTypeUniqueEList<Integer>(Integer.class, this, CHESSIoTSoftwarePackage.IO_TPORT__PIN);
		}
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Payload> getSends() {
		if (sends == null) {
			sends = new EObjectResolvingEList<Payload>(Payload.class, this, CHESSIoTSoftwarePackage.IO_TPORT__SENDS);
		}
		return sends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Payload> getReceives() {
		if (receives == null) {
			receives = new EObjectResolvingEList<Payload>(Payload.class, this, CHESSIoTSoftwarePackage.IO_TPORT__RECEIVES);
		}
		return receives;
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
			case CHESSIoTSoftwarePackage.IO_TPORT__PIN:
				return getPin();
			case CHESSIoTSoftwarePackage.IO_TPORT__SENDS:
				return getSends();
			case CHESSIoTSoftwarePackage.IO_TPORT__RECEIVES:
				return getReceives();
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
			case CHESSIoTSoftwarePackage.IO_TPORT__PIN:
				getPin().clear();
				getPin().addAll((Collection<? extends Integer>)newValue);
				return;
			case CHESSIoTSoftwarePackage.IO_TPORT__SENDS:
				getSends().clear();
				getSends().addAll((Collection<? extends Payload>)newValue);
				return;
			case CHESSIoTSoftwarePackage.IO_TPORT__RECEIVES:
				getReceives().clear();
				getReceives().addAll((Collection<? extends Payload>)newValue);
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
			case CHESSIoTSoftwarePackage.IO_TPORT__PIN:
				getPin().clear();
				return;
			case CHESSIoTSoftwarePackage.IO_TPORT__SENDS:
				getSends().clear();
				return;
			case CHESSIoTSoftwarePackage.IO_TPORT__RECEIVES:
				getReceives().clear();
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
			case CHESSIoTSoftwarePackage.IO_TPORT__PIN:
				return pin != null && !pin.isEmpty();
			case CHESSIoTSoftwarePackage.IO_TPORT__SENDS:
				return sends != null && !sends.isEmpty();
			case CHESSIoTSoftwarePackage.IO_TPORT__RECEIVES:
				return receives != null && !receives.isEmpty();
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
		result.append(" (pin: ");
		result.append(pin);
		result.append(')');
		return result.toString();
	}

} //IoTPortImpl
