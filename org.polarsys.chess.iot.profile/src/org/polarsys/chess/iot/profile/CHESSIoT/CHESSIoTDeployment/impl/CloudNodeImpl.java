/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CloudNode;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CloudOrchestrator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CloudNodeImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CloudNodeImpl#getCloudresources <em>Cloudresources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CloudNodeImpl extends NodeImpl implements CloudNode {
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
	 * The cached value of the '{@link #getCloudresources() <em>Cloudresources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudresources()
	 * @generated
	 * @ordered
	 */
	protected EList<CloudOrchestrator> cloudresources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTDeploymentPackage.Literals.CLOUD_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Container> getContainer() {
		if (container == null) {
			container = new EObjectResolvingEList<org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Container>(org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Container.class, this, CHESSIoTDeploymentPackage.CLOUD_NODE__CONTAINER);
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CloudOrchestrator> getCloudresources() {
		if (cloudresources == null) {
			cloudresources = new EObjectResolvingEList<CloudOrchestrator>(CloudOrchestrator.class, this, CHESSIoTDeploymentPackage.CLOUD_NODE__CLOUDRESOURCES);
		}
		return cloudresources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTDeploymentPackage.CLOUD_NODE__CONTAINER:
				return getContainer();
			case CHESSIoTDeploymentPackage.CLOUD_NODE__CLOUDRESOURCES:
				return getCloudresources();
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
			case CHESSIoTDeploymentPackage.CLOUD_NODE__CONTAINER:
				getContainer().clear();
				getContainer().addAll((Collection<? extends org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Container>)newValue);
				return;
			case CHESSIoTDeploymentPackage.CLOUD_NODE__CLOUDRESOURCES:
				getCloudresources().clear();
				getCloudresources().addAll((Collection<? extends CloudOrchestrator>)newValue);
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
			case CHESSIoTDeploymentPackage.CLOUD_NODE__CONTAINER:
				getContainer().clear();
				return;
			case CHESSIoTDeploymentPackage.CLOUD_NODE__CLOUDRESOURCES:
				getCloudresources().clear();
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
			case CHESSIoTDeploymentPackage.CLOUD_NODE__CONTAINER:
				return container != null && !container.isEmpty();
			case CHESSIoTDeploymentPackage.CLOUD_NODE__CLOUDRESOURCES:
				return cloudresources != null && !cloudresources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CloudNodeImpl
