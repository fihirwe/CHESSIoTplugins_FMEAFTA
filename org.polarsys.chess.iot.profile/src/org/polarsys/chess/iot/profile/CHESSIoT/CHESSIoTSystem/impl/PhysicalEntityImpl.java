/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PhysicalEntityImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PhysicalEntityImpl#getPhysicalentity <em>Physicalentity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalEntityImpl extends PhysicalElementImpl implements PhysicalEntity {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPhysicalentity() <em>Physicalentity</em>}' containment reference.
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
	protected PhysicalEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSystemPackage.Literals.PHYSICAL_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.PHYSICAL_ENTITY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalEntity getPhysicalentity() {
		return physicalentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysicalentity(PhysicalEntity newPhysicalentity, NotificationChain msgs) {
		PhysicalEntity oldPhysicalentity = physicalentity;
		physicalentity = newPhysicalentity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.PHYSICAL_ENTITY__PHYSICALENTITY, oldPhysicalentity, newPhysicalentity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalentity(PhysicalEntity newPhysicalentity) {
		if (newPhysicalentity != physicalentity) {
			NotificationChain msgs = null;
			if (physicalentity != null)
				msgs = ((InternalEObject)physicalentity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CHESSIoTSystemPackage.PHYSICAL_ENTITY__PHYSICALENTITY, null, msgs);
			if (newPhysicalentity != null)
				msgs = ((InternalEObject)newPhysicalentity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CHESSIoTSystemPackage.PHYSICAL_ENTITY__PHYSICALENTITY, null, msgs);
			msgs = basicSetPhysicalentity(newPhysicalentity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.PHYSICAL_ENTITY__PHYSICALENTITY, newPhysicalentity, newPhysicalentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CHESSIoTSystemPackage.PHYSICAL_ENTITY__PHYSICALENTITY:
				return basicSetPhysicalentity(null, msgs);
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
			case CHESSIoTSystemPackage.PHYSICAL_ENTITY__ID:
				return getId();
			case CHESSIoTSystemPackage.PHYSICAL_ENTITY__PHYSICALENTITY:
				return getPhysicalentity();
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
			case CHESSIoTSystemPackage.PHYSICAL_ENTITY__ID:
				setId((Integer)newValue);
				return;
			case CHESSIoTSystemPackage.PHYSICAL_ENTITY__PHYSICALENTITY:
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
			case CHESSIoTSystemPackage.PHYSICAL_ENTITY__ID:
				setId(ID_EDEFAULT);
				return;
			case CHESSIoTSystemPackage.PHYSICAL_ENTITY__PHYSICALENTITY:
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
			case CHESSIoTSystemPackage.PHYSICAL_ENTITY__ID:
				return id != ID_EDEFAULT;
			case CHESSIoTSystemPackage.PHYSICAL_ENTITY__PHYSICALENTITY:
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //PhysicalEntityImpl
