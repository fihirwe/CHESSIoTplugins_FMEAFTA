/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Region;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.RegionImpl#getIotstate <em>Iotstate</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.RegionImpl#getBase_Region <em>Base Region</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegionImpl extends MinimalEObjectImpl.Container implements Region {
	/**
	 * The cached value of the '{@link #getIotstate() <em>Iotstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIotstate()
	 * @generated
	 * @ordered
	 */
	protected IoTState iotstate;

	/**
	 * The cached value of the '{@link #getBase_Region() <em>Base Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Region()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Region base_Region;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSoftwarePackage.Literals.REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTState getIotstate() {
		if (iotstate != null && iotstate.eIsProxy()) {
			InternalEObject oldIotstate = (InternalEObject)iotstate;
			iotstate = (IoTState)eResolveProxy(oldIotstate);
			if (iotstate != oldIotstate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.REGION__IOTSTATE, oldIotstate, iotstate));
			}
		}
		return iotstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTState basicGetIotstate() {
		return iotstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIotstate(IoTState newIotstate) {
		IoTState oldIotstate = iotstate;
		iotstate = newIotstate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.REGION__IOTSTATE, oldIotstate, iotstate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Region getBase_Region() {
		if (base_Region != null && base_Region.eIsProxy()) {
			InternalEObject oldBase_Region = (InternalEObject)base_Region;
			base_Region = (org.eclipse.uml2.uml.Region)eResolveProxy(oldBase_Region);
			if (base_Region != oldBase_Region) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.REGION__BASE_REGION, oldBase_Region, base_Region));
			}
		}
		return base_Region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Region basicGetBase_Region() {
		return base_Region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Region(org.eclipse.uml2.uml.Region newBase_Region) {
		org.eclipse.uml2.uml.Region oldBase_Region = base_Region;
		base_Region = newBase_Region;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.REGION__BASE_REGION, oldBase_Region, base_Region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.REGION__IOTSTATE:
				if (resolve) return getIotstate();
				return basicGetIotstate();
			case CHESSIoTSoftwarePackage.REGION__BASE_REGION:
				if (resolve) return getBase_Region();
				return basicGetBase_Region();
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
			case CHESSIoTSoftwarePackage.REGION__IOTSTATE:
				setIotstate((IoTState)newValue);
				return;
			case CHESSIoTSoftwarePackage.REGION__BASE_REGION:
				setBase_Region((org.eclipse.uml2.uml.Region)newValue);
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
			case CHESSIoTSoftwarePackage.REGION__IOTSTATE:
				setIotstate((IoTState)null);
				return;
			case CHESSIoTSoftwarePackage.REGION__BASE_REGION:
				setBase_Region((org.eclipse.uml2.uml.Region)null);
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
			case CHESSIoTSoftwarePackage.REGION__IOTSTATE:
				return iotstate != null;
			case CHESSIoTSoftwarePackage.REGION__BASE_REGION:
				return base_Region != null;
		}
		return super.eIsSet(featureID);
	}

} //RegionImpl
