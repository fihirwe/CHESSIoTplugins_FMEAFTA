/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceNode;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.OnDeviceApp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.DeviceNodeImpl#getIotdevice <em>Iotdevice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceNodeImpl extends NodeImpl implements DeviceNode {
	/**
	 * The cached value of the '{@link #getIotdevice() <em>Iotdevice</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIotdevice()
	 * @generated
	 * @ordered
	 */
	protected EList<OnDeviceApp> iotdevice;

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
	public EList<OnDeviceApp> getIotdevice() {
		if (iotdevice == null) {
			iotdevice = new EObjectResolvingEList<OnDeviceApp>(OnDeviceApp.class, this, CHESSIoTDeploymentPackage.DEVICE_NODE__IOTDEVICE);
		}
		return iotdevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTDeploymentPackage.DEVICE_NODE__IOTDEVICE:
				return getIotdevice();
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
			case CHESSIoTDeploymentPackage.DEVICE_NODE__IOTDEVICE:
				getIotdevice().clear();
				getIotdevice().addAll((Collection<? extends OnDeviceApp>)newValue);
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
			case CHESSIoTDeploymentPackage.DEVICE_NODE__IOTDEVICE:
				getIotdevice().clear();
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
			case CHESSIoTDeploymentPackage.DEVICE_NODE__IOTDEVICE:
				return iotdevice != null && !iotdevice.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeviceNodeImpl
