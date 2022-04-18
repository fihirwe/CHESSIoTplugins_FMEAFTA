/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceNode;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceResources;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.DeviceNodeImpl#getDeviceresources <em>Deviceresources</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.DeviceNodeImpl#getPysicalDevice <em>Pysical Device</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceNodeImpl extends NodeImpl implements DeviceNode {
	/**
	 * The cached value of the '{@link #getDeviceresources() <em>Deviceresources</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceresources()
	 * @generated
	 * @ordered
	 */
	protected DeviceResources deviceresources;

	/**
	 * The cached value of the '{@link #getPysicalDevice() <em>Pysical Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPysicalDevice()
	 * @generated
	 * @ordered
	 */
	protected VirtualBoard pysicalDevice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTDeploymentPackage.Literals.DEVICE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceResources getDeviceresources() {
		if (deviceresources != null && deviceresources.eIsProxy()) {
			InternalEObject oldDeviceresources = (InternalEObject)deviceresources;
			deviceresources = (DeviceResources)eResolveProxy(oldDeviceresources);
			if (deviceresources != oldDeviceresources) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTDeploymentPackage.DEVICE_NODE__DEVICERESOURCES, oldDeviceresources, deviceresources));
			}
		}
		return deviceresources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceResources basicGetDeviceresources() {
		return deviceresources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceresources(DeviceResources newDeviceresources) {
		DeviceResources oldDeviceresources = deviceresources;
		deviceresources = newDeviceresources;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTDeploymentPackage.DEVICE_NODE__DEVICERESOURCES, oldDeviceresources, deviceresources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualBoard getPysicalDevice() {
		if (pysicalDevice != null && pysicalDevice.eIsProxy()) {
			InternalEObject oldPysicalDevice = (InternalEObject)pysicalDevice;
			pysicalDevice = (VirtualBoard)eResolveProxy(oldPysicalDevice);
			if (pysicalDevice != oldPysicalDevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTDeploymentPackage.DEVICE_NODE__PYSICAL_DEVICE, oldPysicalDevice, pysicalDevice));
			}
		}
		return pysicalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualBoard basicGetPysicalDevice() {
		return pysicalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPysicalDevice(VirtualBoard newPysicalDevice) {
		VirtualBoard oldPysicalDevice = pysicalDevice;
		pysicalDevice = newPysicalDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTDeploymentPackage.DEVICE_NODE__PYSICAL_DEVICE, oldPysicalDevice, pysicalDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTDeploymentPackage.DEVICE_NODE__DEVICERESOURCES:
				if (resolve) return getDeviceresources();
				return basicGetDeviceresources();
			case CHESSIoTDeploymentPackage.DEVICE_NODE__PYSICAL_DEVICE:
				if (resolve) return getPysicalDevice();
				return basicGetPysicalDevice();
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
			case CHESSIoTDeploymentPackage.DEVICE_NODE__DEVICERESOURCES:
				setDeviceresources((DeviceResources)newValue);
				return;
			case CHESSIoTDeploymentPackage.DEVICE_NODE__PYSICAL_DEVICE:
				setPysicalDevice((VirtualBoard)newValue);
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
			case CHESSIoTDeploymentPackage.DEVICE_NODE__DEVICERESOURCES:
				setDeviceresources((DeviceResources)null);
				return;
			case CHESSIoTDeploymentPackage.DEVICE_NODE__PYSICAL_DEVICE:
				setPysicalDevice((VirtualBoard)null);
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
			case CHESSIoTDeploymentPackage.DEVICE_NODE__DEVICERESOURCES:
				return deviceresources != null;
			case CHESSIoTDeploymentPackage.DEVICE_NODE__PYSICAL_DEVICE:
				return pysicalDevice != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceNodeImpl
