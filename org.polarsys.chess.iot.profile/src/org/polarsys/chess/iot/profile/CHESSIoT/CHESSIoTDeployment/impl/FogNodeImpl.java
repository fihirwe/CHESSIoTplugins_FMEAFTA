/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CloudNode;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceNode;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.FogNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fog Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.FogNodeImpl#getDevicenode <em>Devicenode</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.FogNodeImpl#getCloudnode <em>Cloudnode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FogNodeImpl extends NodeImpl implements FogNode {
	/**
	 * The cached value of the '{@link #getDevicenode() <em>Devicenode</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevicenode()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceNode> devicenode;

	/**
	 * The cached value of the '{@link #getCloudnode() <em>Cloudnode</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudnode()
	 * @generated
	 * @ordered
	 */
	protected EList<CloudNode> cloudnode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FogNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTDeploymentPackage.Literals.FOG_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceNode> getDevicenode() {
		if (devicenode == null) {
			devicenode = new EObjectResolvingEList<DeviceNode>(DeviceNode.class, this, CHESSIoTDeploymentPackage.FOG_NODE__DEVICENODE);
		}
		return devicenode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CloudNode> getCloudnode() {
		if (cloudnode == null) {
			cloudnode = new EObjectWithInverseResolvingEList.ManyInverse<CloudNode>(CloudNode.class, this, CHESSIoTDeploymentPackage.FOG_NODE__CLOUDNODE, CHESSIoTDeploymentPackage.CLOUD_NODE__FOGNODE);
		}
		return cloudnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CHESSIoTDeploymentPackage.FOG_NODE__CLOUDNODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCloudnode()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CHESSIoTDeploymentPackage.FOG_NODE__CLOUDNODE:
				return ((InternalEList<?>)getCloudnode()).basicRemove(otherEnd, msgs);
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
			case CHESSIoTDeploymentPackage.FOG_NODE__DEVICENODE:
				return getDevicenode();
			case CHESSIoTDeploymentPackage.FOG_NODE__CLOUDNODE:
				return getCloudnode();
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
			case CHESSIoTDeploymentPackage.FOG_NODE__DEVICENODE:
				getDevicenode().clear();
				getDevicenode().addAll((Collection<? extends DeviceNode>)newValue);
				return;
			case CHESSIoTDeploymentPackage.FOG_NODE__CLOUDNODE:
				getCloudnode().clear();
				getCloudnode().addAll((Collection<? extends CloudNode>)newValue);
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
			case CHESSIoTDeploymentPackage.FOG_NODE__DEVICENODE:
				getDevicenode().clear();
				return;
			case CHESSIoTDeploymentPackage.FOG_NODE__CLOUDNODE:
				getCloudnode().clear();
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
			case CHESSIoTDeploymentPackage.FOG_NODE__DEVICENODE:
				return devicenode != null && !devicenode.isEmpty();
			case CHESSIoTDeploymentPackage.FOG_NODE__CLOUDNODE:
				return cloudnode != null && !cloudnode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FogNodeImpl
