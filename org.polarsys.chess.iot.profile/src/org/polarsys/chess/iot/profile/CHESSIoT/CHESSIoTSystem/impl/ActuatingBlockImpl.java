/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ActuatingBlock;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuating Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ActuatingBlockImpl#getActuationType <em>Actuation Type</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ActuatingBlockImpl#getPhysicalentity <em>Physicalentity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActuatingBlockImpl extends PhysicalElementImpl implements ActuatingBlock {
	/**
	 * The default value of the '{@link #getActuationType() <em>Actuation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuationType()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTUATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActuationType() <em>Actuation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuationType()
	 * @generated
	 * @ordered
	 */
	protected String actuationType = ACTUATION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPhysicalentity() <em>Physicalentity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalentity()
	 * @generated
	 * @ordered
	 */
	protected PhysicalEntity physicalentity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActuatingBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSystemPackage.Literals.ACTUATING_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActuationType() {
		return actuationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuationType(String newActuationType) {
		String oldActuationType = actuationType;
		actuationType = newActuationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.ACTUATING_BLOCK__ACTUATION_TYPE, oldActuationType, actuationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalEntity getPhysicalentity() {
		if (physicalentity != null && physicalentity.eIsProxy()) {
			InternalEObject oldPhysicalentity = (InternalEObject)physicalentity;
			physicalentity = (PhysicalEntity)eResolveProxy(oldPhysicalentity);
			if (physicalentity != oldPhysicalentity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSystemPackage.ACTUATING_BLOCK__PHYSICALENTITY, oldPhysicalentity, physicalentity));
			}
		}
		return physicalentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalEntity basicGetPhysicalentity() {
		return physicalentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalentity(PhysicalEntity newPhysicalentity) {
		PhysicalEntity oldPhysicalentity = physicalentity;
		physicalentity = newPhysicalentity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.ACTUATING_BLOCK__PHYSICALENTITY, oldPhysicalentity, physicalentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTSystemPackage.ACTUATING_BLOCK__ACTUATION_TYPE:
				return getActuationType();
			case CHESSIoTSystemPackage.ACTUATING_BLOCK__PHYSICALENTITY:
				if (resolve) return getPhysicalentity();
				return basicGetPhysicalentity();
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
			case CHESSIoTSystemPackage.ACTUATING_BLOCK__ACTUATION_TYPE:
				setActuationType((String)newValue);
				return;
			case CHESSIoTSystemPackage.ACTUATING_BLOCK__PHYSICALENTITY:
				setPhysicalentity((PhysicalEntity)newValue);
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
			case CHESSIoTSystemPackage.ACTUATING_BLOCK__ACTUATION_TYPE:
				setActuationType(ACTUATION_TYPE_EDEFAULT);
				return;
			case CHESSIoTSystemPackage.ACTUATING_BLOCK__PHYSICALENTITY:
				setPhysicalentity((PhysicalEntity)null);
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
			case CHESSIoTSystemPackage.ACTUATING_BLOCK__ACTUATION_TYPE:
				return ACTUATION_TYPE_EDEFAULT == null ? actuationType != null : !ACTUATION_TYPE_EDEFAULT.equals(actuationType);
			case CHESSIoTSystemPackage.ACTUATING_BLOCK__PHYSICALENTITY:
				return physicalentity != null;
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
		result.append(" (actuationType: ");
		result.append(actuationType);
		result.append(')');
		return result.toString();
	}

} //ActuatingBlockImpl
