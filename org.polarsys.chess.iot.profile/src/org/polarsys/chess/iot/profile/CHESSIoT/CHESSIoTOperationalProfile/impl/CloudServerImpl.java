/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CHESSIoTOperationalProfilePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.CloudServer;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.NetworkResources;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CloudServerImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CloudServerImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl.CloudServerImpl#getNetworkresources <em>Networkresources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CloudServerImpl extends NodeImpl implements CloudServer {
	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The cached value of the '{@link #getNetworkresources() <em>Networkresources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkresources()
	 * @generated
	 * @ordered
	 */
	protected NetworkResources networkresources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTOperationalProfilePackage.Literals.CLOUD_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTOperationalProfilePackage.CLOUD_SERVER__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTOperationalProfilePackage.CLOUD_SERVER__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTOperationalProfilePackage.CLOUD_SERVER__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkResources getNetworkresources() {
		return networkresources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkresources(NetworkResources newNetworkresources, NotificationChain msgs) {
		NetworkResources oldNetworkresources = networkresources;
		networkresources = newNetworkresources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CHESSIoTOperationalProfilePackage.CLOUD_SERVER__NETWORKRESOURCES, oldNetworkresources, newNetworkresources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkresources(NetworkResources newNetworkresources) {
		if (newNetworkresources != networkresources) {
			NotificationChain msgs = null;
			if (networkresources != null)
				msgs = ((InternalEObject)networkresources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CHESSIoTOperationalProfilePackage.CLOUD_SERVER__NETWORKRESOURCES, null, msgs);
			if (newNetworkresources != null)
				msgs = ((InternalEObject)newNetworkresources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CHESSIoTOperationalProfilePackage.CLOUD_SERVER__NETWORKRESOURCES, null, msgs);
			msgs = basicSetNetworkresources(newNetworkresources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTOperationalProfilePackage.CLOUD_SERVER__NETWORKRESOURCES, newNetworkresources, newNetworkresources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CHESSIoTOperationalProfilePackage.CLOUD_SERVER__NETWORKRESOURCES:
				return basicSetNetworkresources(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTOperationalProfilePackage.CLOUD_SERVER__ADDRESS:
				return getAddress();
			case CHESSIoTOperationalProfilePackage.CLOUD_SERVER__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case CHESSIoTOperationalProfilePackage.CLOUD_SERVER__NETWORKRESOURCES:
				return getNetworkresources();
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
			case CHESSIoTOperationalProfilePackage.CLOUD_SERVER__ADDRESS:
				setAddress((String)newValue);
				return;
			case CHESSIoTOperationalProfilePackage.CLOUD_SERVER__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case CHESSIoTOperationalProfilePackage.CLOUD_SERVER__NETWORKRESOURCES:
				setNetworkresources((NetworkResources)newValue);
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
			case CHESSIoTOperationalProfilePackage.CLOUD_SERVER__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case CHESSIoTOperationalProfilePackage.CLOUD_SERVER__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case CHESSIoTOperationalProfilePackage.CLOUD_SERVER__NETWORKRESOURCES:
				setNetworkresources((NetworkResources)null);
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
			case CHESSIoTOperationalProfilePackage.CLOUD_SERVER__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case CHESSIoTOperationalProfilePackage.CLOUD_SERVER__BASE_CLASS:
				return base_Class != null;
			case CHESSIoTOperationalProfilePackage.CLOUD_SERVER__NETWORKRESOURCES:
				return networkresources != null;
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
		result.append(" (address: ");
		result.append(address);
		result.append(')');
		return result.toString();
	}

} //CloudServerImpl
