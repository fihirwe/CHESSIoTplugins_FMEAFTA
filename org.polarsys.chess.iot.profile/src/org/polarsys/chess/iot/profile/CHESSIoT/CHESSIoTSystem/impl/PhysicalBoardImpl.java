/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ActuatingBlock;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Gateway;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalBoard;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalEntity;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Board</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PhysicalBoardImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PhysicalBoardImpl#getGateway <em>Gateway</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PhysicalBoardImpl#getActuatingblock <em>Actuatingblock</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PhysicalBoardImpl#getSensorblock <em>Sensorblock</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PhysicalBoardImpl#getPhysicalentity <em>Physicalentity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalBoardImpl extends PhysicalElementImpl implements PhysicalBoard {
	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGateway() <em>Gateway</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateway()
	 * @generated
	 * @ordered
	 */
	protected EList<Gateway> gateway;

	/**
	 * The cached value of the '{@link #getActuatingblock() <em>Actuatingblock</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatingblock()
	 * @generated
	 * @ordered
	 */
	protected EList<ActuatingBlock> actuatingblock;

	/**
	 * The cached value of the '{@link #getSensorblock() <em>Sensorblock</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorblock()
	 * @generated
	 * @ordered
	 */
	protected EList<SensorBlock> sensorblock;

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
	protected PhysicalBoardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSystemPackage.Literals.PHYSICAL_BOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.PHYSICAL_BOARD__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gateway> getGateway() {
		if (gateway == null) {
			gateway = new EObjectWithInverseResolvingEList.ManyInverse<Gateway>(Gateway.class, this, CHESSIoTSystemPackage.PHYSICAL_BOARD__GATEWAY, CHESSIoTSystemPackage.GATEWAY__COMPUTINGBOARD);
		}
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActuatingBlock> getActuatingblock() {
		if (actuatingblock == null) {
			actuatingblock = new EObjectResolvingEList<ActuatingBlock>(ActuatingBlock.class, this, CHESSIoTSystemPackage.PHYSICAL_BOARD__ACTUATINGBLOCK);
		}
		return actuatingblock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensorBlock> getSensorblock() {
		if (sensorblock == null) {
			sensorblock = new EObjectWithInverseResolvingEList<SensorBlock>(SensorBlock.class, this, CHESSIoTSystemPackage.PHYSICAL_BOARD__SENSORBLOCK, CHESSIoTSystemPackage.SENSOR_BLOCK__COMPUTINGBOARD);
		}
		return sensorblock;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSystemPackage.PHYSICAL_BOARD__PHYSICALENTITY, oldPhysicalentity, physicalentity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.PHYSICAL_BOARD__PHYSICALENTITY, oldPhysicalentity, physicalentity));
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
			case CHESSIoTSystemPackage.PHYSICAL_BOARD__GATEWAY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGateway()).basicAdd(otherEnd, msgs);
			case CHESSIoTSystemPackage.PHYSICAL_BOARD__SENSORBLOCK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSensorblock()).basicAdd(otherEnd, msgs);
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
			case CHESSIoTSystemPackage.PHYSICAL_BOARD__GATEWAY:
				return ((InternalEList<?>)getGateway()).basicRemove(otherEnd, msgs);
			case CHESSIoTSystemPackage.PHYSICAL_BOARD__SENSORBLOCK:
				return ((InternalEList<?>)getSensorblock()).basicRemove(otherEnd, msgs);
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
			case CHESSIoTSystemPackage.PHYSICAL_BOARD__MODEL:
				return getModel();
			case CHESSIoTSystemPackage.PHYSICAL_BOARD__GATEWAY:
				return getGateway();
			case CHESSIoTSystemPackage.PHYSICAL_BOARD__ACTUATINGBLOCK:
				return getActuatingblock();
			case CHESSIoTSystemPackage.PHYSICAL_BOARD__SENSORBLOCK:
				return getSensorblock();
			case CHESSIoTSystemPackage.PHYSICAL_BOARD__PHYSICALENTITY:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CHESSIoTSystemPackage.PHYSICAL_BOARD__MODEL:
				setModel((String)newValue);
				return;
			case CHESSIoTSystemPackage.PHYSICAL_BOARD__GATEWAY:
				getGateway().clear();
				getGateway().addAll((Collection<? extends Gateway>)newValue);
				return;
			case CHESSIoTSystemPackage.PHYSICAL_BOARD__ACTUATINGBLOCK:
				getActuatingblock().clear();
				getActuatingblock().addAll((Collection<? extends ActuatingBlock>)newValue);
				return;
			case CHESSIoTSystemPackage.PHYSICAL_BOARD__SENSORBLOCK:
				getSensorblock().clear();
				getSensorblock().addAll((Collection<? extends SensorBlock>)newValue);
				return;
			case CHESSIoTSystemPackage.PHYSICAL_BOARD__PHYSICALENTITY:
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
			case CHESSIoTSystemPackage.PHYSICAL_BOARD__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case CHESSIoTSystemPackage.PHYSICAL_BOARD__GATEWAY:
				getGateway().clear();
				return;
			case CHESSIoTSystemPackage.PHYSICAL_BOARD__ACTUATINGBLOCK:
				getActuatingblock().clear();
				return;
			case CHESSIoTSystemPackage.PHYSICAL_BOARD__SENSORBLOCK:
				getSensorblock().clear();
				return;
			case CHESSIoTSystemPackage.PHYSICAL_BOARD__PHYSICALENTITY:
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
			case CHESSIoTSystemPackage.PHYSICAL_BOARD__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
			case CHESSIoTSystemPackage.PHYSICAL_BOARD__GATEWAY:
				return gateway != null && !gateway.isEmpty();
			case CHESSIoTSystemPackage.PHYSICAL_BOARD__ACTUATINGBLOCK:
				return actuatingblock != null && !actuatingblock.isEmpty();
			case CHESSIoTSystemPackage.PHYSICAL_BOARD__SENSORBLOCK:
				return sensorblock != null && !sensorblock.isEmpty();
			case CHESSIoTSystemPackage.PHYSICAL_BOARD__PHYSICALENTITY:
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
		result.append(" (model: ");
		result.append(model);
		result.append(')');
		return result.toString();
	}

} //PhysicalBoardImpl
