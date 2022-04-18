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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.uml2.uml.Constraint;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.OrchestratingAgent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orchestrating Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.OrchestratingAgentImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.OrchestratingAgentImpl#getBase_Constraint <em>Base Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrchestratingAgentImpl extends MinimalEObjectImpl.Container implements OrchestratingAgent {
	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<String> configuration;

	/**
	 * The cached value of the '{@link #getBase_Constraint() <em>Base Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Constraint()
	 * @generated
	 * @ordered
	 */
	protected Constraint base_Constraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrchestratingAgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTDeploymentPackage.Literals.ORCHESTRATING_AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getConfiguration() {
		if (configuration == null) {
			configuration = new EDataTypeUniqueEList<String>(String.class, this, CHESSIoTDeploymentPackage.ORCHESTRATING_AGENT__CONFIGURATION);
		}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getBase_Constraint() {
		if (base_Constraint != null && base_Constraint.eIsProxy()) {
			InternalEObject oldBase_Constraint = (InternalEObject)base_Constraint;
			base_Constraint = (Constraint)eResolveProxy(oldBase_Constraint);
			if (base_Constraint != oldBase_Constraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTDeploymentPackage.ORCHESTRATING_AGENT__BASE_CONSTRAINT, oldBase_Constraint, base_Constraint));
			}
		}
		return base_Constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetBase_Constraint() {
		return base_Constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Constraint(Constraint newBase_Constraint) {
		Constraint oldBase_Constraint = base_Constraint;
		base_Constraint = newBase_Constraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTDeploymentPackage.ORCHESTRATING_AGENT__BASE_CONSTRAINT, oldBase_Constraint, base_Constraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTDeploymentPackage.ORCHESTRATING_AGENT__CONFIGURATION:
				return getConfiguration();
			case CHESSIoTDeploymentPackage.ORCHESTRATING_AGENT__BASE_CONSTRAINT:
				if (resolve) return getBase_Constraint();
				return basicGetBase_Constraint();
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
			case CHESSIoTDeploymentPackage.ORCHESTRATING_AGENT__CONFIGURATION:
				getConfiguration().clear();
				getConfiguration().addAll((Collection<? extends String>)newValue);
				return;
			case CHESSIoTDeploymentPackage.ORCHESTRATING_AGENT__BASE_CONSTRAINT:
				setBase_Constraint((Constraint)newValue);
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
			case CHESSIoTDeploymentPackage.ORCHESTRATING_AGENT__CONFIGURATION:
				getConfiguration().clear();
				return;
			case CHESSIoTDeploymentPackage.ORCHESTRATING_AGENT__BASE_CONSTRAINT:
				setBase_Constraint((Constraint)null);
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
			case CHESSIoTDeploymentPackage.ORCHESTRATING_AGENT__CONFIGURATION:
				return configuration != null && !configuration.isEmpty();
			case CHESSIoTDeploymentPackage.ORCHESTRATING_AGENT__BASE_CONSTRAINT:
				return base_Constraint != null;
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
		result.append(" (configuration: ");
		result.append(configuration);
		result.append(')');
		return result.toString();
	}

} //OrchestratingAgentImpl
