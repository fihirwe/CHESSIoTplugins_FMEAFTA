/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Passive;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Passive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PassiveImpl#getPhysicalentity <em>Physicalentity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PassiveImpl extends ConsumerEntityImpl implements Passive {
	/**
	 * The cached value of the '{@link #getPhysicalentity() <em>Physicalentity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalentity()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalEntity> physicalentity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSystemPackage.Literals.PASSIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalEntity> getPhysicalentity() {
		if (physicalentity == null) {
			physicalentity = new EObjectResolvingEList<PhysicalEntity>(PhysicalEntity.class, this, CHESSIoTSystemPackage.PASSIVE__PHYSICALENTITY);
		}
		return physicalentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTSystemPackage.PASSIVE__PHYSICALENTITY:
				return getPhysicalentity();
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
			case CHESSIoTSystemPackage.PASSIVE__PHYSICALENTITY:
				getPhysicalentity().clear();
				getPhysicalentity().addAll((Collection<? extends PhysicalEntity>)newValue);
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
			case CHESSIoTSystemPackage.PASSIVE__PHYSICALENTITY:
				getPhysicalentity().clear();
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
			case CHESSIoTSystemPackage.PASSIVE__PHYSICALENTITY:
				return physicalentity != null && !physicalentity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PassiveImpl
