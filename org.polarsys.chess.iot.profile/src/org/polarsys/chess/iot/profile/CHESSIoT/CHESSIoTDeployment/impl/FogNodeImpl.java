/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceNode;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.FogNode;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.FogOrchestrator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fog Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.FogNodeImpl#getClients <em>Clients</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.FogNodeImpl#getDeviceresources <em>Deviceresources</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.FogNodeImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.FogNodeImpl#getDevicenode <em>Devicenode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FogNodeImpl extends NodeImpl implements FogNode {
	/**
	 * The cached value of the '{@link #getClients() <em>Clients</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClients()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceNode> clients;

	/**
	 * The cached value of the '{@link #getDeviceresources() <em>Deviceresources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceresources()
	 * @generated
	 * @ordered
	 */
	protected EList<FogOrchestrator> deviceresources;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Container> container;

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
	public EList<DeviceNode> getClients() {
		if (clients == null) {
			clients = new EObjectResolvingEList<DeviceNode>(DeviceNode.class, this, CHESSIoTDeploymentPackage.FOG_NODE__CLIENTS);
		}
		return clients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FogOrchestrator> getDeviceresources() {
		if (deviceresources == null) {
			deviceresources = new EObjectResolvingEList<FogOrchestrator>(FogOrchestrator.class, this, CHESSIoTDeploymentPackage.FOG_NODE__DEVICERESOURCES);
		}
		return deviceresources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Container> getContainer() {
		if (container == null) {
			container = new EObjectResolvingEList<org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Container>(org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Container.class, this, CHESSIoTDeploymentPackage.FOG_NODE__CONTAINER);
		}
		return container;
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTDeploymentPackage.FOG_NODE__CLIENTS:
				return getClients();
			case CHESSIoTDeploymentPackage.FOG_NODE__DEVICERESOURCES:
				return getDeviceresources();
			case CHESSIoTDeploymentPackage.FOG_NODE__CONTAINER:
				return getContainer();
			case CHESSIoTDeploymentPackage.FOG_NODE__DEVICENODE:
				return getDevicenode();
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
			case CHESSIoTDeploymentPackage.FOG_NODE__CLIENTS:
				getClients().clear();
				getClients().addAll((Collection<? extends DeviceNode>)newValue);
				return;
			case CHESSIoTDeploymentPackage.FOG_NODE__DEVICERESOURCES:
				getDeviceresources().clear();
				getDeviceresources().addAll((Collection<? extends FogOrchestrator>)newValue);
				return;
			case CHESSIoTDeploymentPackage.FOG_NODE__CONTAINER:
				getContainer().clear();
				getContainer().addAll((Collection<? extends org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Container>)newValue);
				return;
			case CHESSIoTDeploymentPackage.FOG_NODE__DEVICENODE:
				getDevicenode().clear();
				getDevicenode().addAll((Collection<? extends DeviceNode>)newValue);
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
			case CHESSIoTDeploymentPackage.FOG_NODE__CLIENTS:
				getClients().clear();
				return;
			case CHESSIoTDeploymentPackage.FOG_NODE__DEVICERESOURCES:
				getDeviceresources().clear();
				return;
			case CHESSIoTDeploymentPackage.FOG_NODE__CONTAINER:
				getContainer().clear();
				return;
			case CHESSIoTDeploymentPackage.FOG_NODE__DEVICENODE:
				getDevicenode().clear();
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
			case CHESSIoTDeploymentPackage.FOG_NODE__CLIENTS:
				return clients != null && !clients.isEmpty();
			case CHESSIoTDeploymentPackage.FOG_NODE__DEVICERESOURCES:
				return deviceresources != null && !deviceresources.isEmpty();
			case CHESSIoTDeploymentPackage.FOG_NODE__CONTAINER:
				return container != null && !container.isEmpty();
			case CHESSIoTDeploymentPackage.FOG_NODE__DEVICENODE:
				return devicenode != null && !devicenode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FogNodeImpl
