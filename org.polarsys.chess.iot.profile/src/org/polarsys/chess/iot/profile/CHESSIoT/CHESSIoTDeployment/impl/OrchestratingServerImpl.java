/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.Component;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.OrchestratingAgent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.OrchestratingServer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orchestrating Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.OrchestratingServerImpl#getOrchestratingagent <em>Orchestratingagent</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.OrchestratingServerImpl#getBase_Component <em>Base Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrchestratingServerImpl extends MinimalEObjectImpl.Container implements OrchestratingServer {
	/**
	 * The cached value of the '{@link #getOrchestratingagent() <em>Orchestratingagent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrchestratingagent()
	 * @generated
	 * @ordered
	 */
	protected EList<OrchestratingAgent> orchestratingagent;

	/**
	 * The cached value of the '{@link #getBase_Component() <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Component()
	 * @generated
	 * @ordered
	 */
	protected Component base_Component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrchestratingServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTDeploymentPackage.Literals.ORCHESTRATING_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrchestratingAgent> getOrchestratingagent() {
		if (orchestratingagent == null) {
			orchestratingagent = new EObjectResolvingEList<OrchestratingAgent>(OrchestratingAgent.class, this, CHESSIoTDeploymentPackage.ORCHESTRATING_SERVER__ORCHESTRATINGAGENT);
		}
		return orchestratingagent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getBase_Component() {
		if (base_Component != null && base_Component.eIsProxy()) {
			InternalEObject oldBase_Component = (InternalEObject)base_Component;
			base_Component = (Component)eResolveProxy(oldBase_Component);
			if (base_Component != oldBase_Component) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTDeploymentPackage.ORCHESTRATING_SERVER__BASE_COMPONENT, oldBase_Component, base_Component));
			}
		}
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetBase_Component() {
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Component(Component newBase_Component) {
		Component oldBase_Component = base_Component;
		base_Component = newBase_Component;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTDeploymentPackage.ORCHESTRATING_SERVER__BASE_COMPONENT, oldBase_Component, base_Component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTDeploymentPackage.ORCHESTRATING_SERVER__ORCHESTRATINGAGENT:
				return getOrchestratingagent();
			case CHESSIoTDeploymentPackage.ORCHESTRATING_SERVER__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
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
			case CHESSIoTDeploymentPackage.ORCHESTRATING_SERVER__ORCHESTRATINGAGENT:
				getOrchestratingagent().clear();
				getOrchestratingagent().addAll((Collection<? extends OrchestratingAgent>)newValue);
				return;
			case CHESSIoTDeploymentPackage.ORCHESTRATING_SERVER__BASE_COMPONENT:
				setBase_Component((Component)newValue);
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
			case CHESSIoTDeploymentPackage.ORCHESTRATING_SERVER__ORCHESTRATINGAGENT:
				getOrchestratingagent().clear();
				return;
			case CHESSIoTDeploymentPackage.ORCHESTRATING_SERVER__BASE_COMPONENT:
				setBase_Component((Component)null);
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
			case CHESSIoTDeploymentPackage.ORCHESTRATING_SERVER__ORCHESTRATINGAGENT:
				return orchestratingagent != null && !orchestratingagent.isEmpty();
			case CHESSIoTDeploymentPackage.ORCHESTRATING_SERVER__BASE_COMPONENT:
				return base_Component != null;
		}
		return super.eIsSet(featureID);
	}

} //OrchestratingServerImpl
