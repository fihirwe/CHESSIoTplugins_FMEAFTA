/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalBoard;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalEntity;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SensorBlockImpl#getSensorType <em>Sensor Type</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SensorBlockImpl#getPhysicalentity <em>Physicalentity</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SensorBlockImpl#getComputingboard <em>Computingboard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorBlockImpl extends PhysicalElementImpl implements SensorBlock {
	/**
	 * The default value of the '{@link #getSensorType() <em>Sensor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorType()
	 * @generated
	 * @ordered
	 */
	protected static final String SENSOR_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSensorType() <em>Sensor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorType()
	 * @generated
	 * @ordered
	 */
	protected String sensorType = SENSOR_TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getComputingboard() <em>Computingboard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputingboard()
	 * @generated
	 * @ordered
	 */
	protected PhysicalBoard computingboard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSystemPackage.Literals.SENSOR_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSensorType() {
		return sensorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensorType(String newSensorType) {
		String oldSensorType = sensorType;
		sensorType = newSensorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.SENSOR_BLOCK__SENSOR_TYPE, oldSensorType, sensorType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSystemPackage.SENSOR_BLOCK__PHYSICALENTITY, oldPhysicalentity, physicalentity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.SENSOR_BLOCK__PHYSICALENTITY, oldPhysicalentity, physicalentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalBoard getComputingboard() {
		if (computingboard != null && computingboard.eIsProxy()) {
			InternalEObject oldComputingboard = (InternalEObject)computingboard;
			computingboard = (PhysicalBoard)eResolveProxy(oldComputingboard);
			if (computingboard != oldComputingboard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSystemPackage.SENSOR_BLOCK__COMPUTINGBOARD, oldComputingboard, computingboard));
			}
		}
		return computingboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalBoard basicGetComputingboard() {
		return computingboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComputingboard(PhysicalBoard newComputingboard, NotificationChain msgs) {
		PhysicalBoard oldComputingboard = computingboard;
		computingboard = newComputingboard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.SENSOR_BLOCK__COMPUTINGBOARD, oldComputingboard, newComputingboard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputingboard(PhysicalBoard newComputingboard) {
		if (newComputingboard != computingboard) {
			NotificationChain msgs = null;
			if (computingboard != null)
				msgs = ((InternalEObject)computingboard).eInverseRemove(this, CHESSIoTSystemPackage.PHYSICAL_BOARD__SENSORBLOCK, PhysicalBoard.class, msgs);
			if (newComputingboard != null)
				msgs = ((InternalEObject)newComputingboard).eInverseAdd(this, CHESSIoTSystemPackage.PHYSICAL_BOARD__SENSORBLOCK, PhysicalBoard.class, msgs);
			msgs = basicSetComputingboard(newComputingboard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.SENSOR_BLOCK__COMPUTINGBOARD, newComputingboard, newComputingboard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CHESSIoTSystemPackage.SENSOR_BLOCK__COMPUTINGBOARD:
				if (computingboard != null)
					msgs = ((InternalEObject)computingboard).eInverseRemove(this, CHESSIoTSystemPackage.PHYSICAL_BOARD__SENSORBLOCK, PhysicalBoard.class, msgs);
				return basicSetComputingboard((PhysicalBoard)otherEnd, msgs);
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
			case CHESSIoTSystemPackage.SENSOR_BLOCK__COMPUTINGBOARD:
				return basicSetComputingboard(null, msgs);
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
			case CHESSIoTSystemPackage.SENSOR_BLOCK__SENSOR_TYPE:
				return getSensorType();
			case CHESSIoTSystemPackage.SENSOR_BLOCK__PHYSICALENTITY:
				if (resolve) return getPhysicalentity();
				return basicGetPhysicalentity();
			case CHESSIoTSystemPackage.SENSOR_BLOCK__COMPUTINGBOARD:
				if (resolve) return getComputingboard();
				return basicGetComputingboard();
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
			case CHESSIoTSystemPackage.SENSOR_BLOCK__SENSOR_TYPE:
				setSensorType((String)newValue);
				return;
			case CHESSIoTSystemPackage.SENSOR_BLOCK__PHYSICALENTITY:
				setPhysicalentity((PhysicalEntity)newValue);
				return;
			case CHESSIoTSystemPackage.SENSOR_BLOCK__COMPUTINGBOARD:
				setComputingboard((PhysicalBoard)newValue);
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
			case CHESSIoTSystemPackage.SENSOR_BLOCK__SENSOR_TYPE:
				setSensorType(SENSOR_TYPE_EDEFAULT);
				return;
			case CHESSIoTSystemPackage.SENSOR_BLOCK__PHYSICALENTITY:
				setPhysicalentity((PhysicalEntity)null);
				return;
			case CHESSIoTSystemPackage.SENSOR_BLOCK__COMPUTINGBOARD:
				setComputingboard((PhysicalBoard)null);
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
			case CHESSIoTSystemPackage.SENSOR_BLOCK__SENSOR_TYPE:
				return SENSOR_TYPE_EDEFAULT == null ? sensorType != null : !SENSOR_TYPE_EDEFAULT.equals(sensorType);
			case CHESSIoTSystemPackage.SENSOR_BLOCK__PHYSICALENTITY:
				return physicalentity != null;
			case CHESSIoTSystemPackage.SENSOR_BLOCK__COMPUTINGBOARD:
				return computingboard != null;
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
		result.append(" (sensorType: ");
		result.append(sensorType);
		result.append(')');
		return result.toString();
	}

} //SensorBlockImpl
