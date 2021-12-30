/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ActuatingBlock;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ComputingBoard;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Gateway;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.NodeModel;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalEntity;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computing Board</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ComputingBoardImpl#getNodeModel <em>Node Model</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ComputingBoardImpl#getGateway <em>Gateway</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ComputingBoardImpl#getActuatingblock <em>Actuatingblock</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ComputingBoardImpl#getSensorblock <em>Sensorblock</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ComputingBoardImpl#getPhysicalentity <em>Physicalentity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputingBoardImpl extends PhysicalElementImpl implements ComputingBoard {
	/**
	 * The default value of the '{@link #getNodeModel() <em>Node Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeModel()
	 * @generated
	 * @ordered
	 */
	protected static final NodeModel NODE_MODEL_EDEFAULT = NodeModel.RASBERRY_PI;

	/**
	 * The cached value of the '{@link #getNodeModel() <em>Node Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeModel()
	 * @generated
	 * @ordered
	 */
	protected NodeModel nodeModel = NODE_MODEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGateway() <em>Gateway</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateway()
	 * @generated
	 * @ordered
	 */
	protected Gateway gateway;

	/**
	 * The cached value of the '{@link #getActuatingblock() <em>Actuatingblock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatingblock()
	 * @generated
	 * @ordered
	 */
	protected ActuatingBlock actuatingblock;

	/**
	 * The cached value of the '{@link #getSensorblock() <em>Sensorblock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorblock()
	 * @generated
	 * @ordered
	 */
	protected SensorBlock sensorblock;

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
	protected ComputingBoardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSystemPackage.Literals.COMPUTING_BOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeModel getNodeModel() {
		return nodeModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeModel(NodeModel newNodeModel) {
		NodeModel oldNodeModel = nodeModel;
		nodeModel = newNodeModel == null ? NODE_MODEL_EDEFAULT : newNodeModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.COMPUTING_BOARD__NODE_MODEL, oldNodeModel, nodeModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gateway getGateway() {
		if (gateway != null && gateway.eIsProxy()) {
			InternalEObject oldGateway = (InternalEObject)gateway;
			gateway = (Gateway)eResolveProxy(oldGateway);
			if (gateway != oldGateway) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSystemPackage.COMPUTING_BOARD__GATEWAY, oldGateway, gateway));
			}
		}
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gateway basicGetGateway() {
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGateway(Gateway newGateway, NotificationChain msgs) {
		Gateway oldGateway = gateway;
		gateway = newGateway;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.COMPUTING_BOARD__GATEWAY, oldGateway, newGateway);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGateway(Gateway newGateway) {
		if (newGateway != gateway) {
			NotificationChain msgs = null;
			if (gateway != null)
				msgs = ((InternalEObject)gateway).eInverseRemove(this, CHESSIoTSystemPackage.GATEWAY__COMPUTINGBOARD, Gateway.class, msgs);
			if (newGateway != null)
				msgs = ((InternalEObject)newGateway).eInverseAdd(this, CHESSIoTSystemPackage.GATEWAY__COMPUTINGBOARD, Gateway.class, msgs);
			msgs = basicSetGateway(newGateway, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.COMPUTING_BOARD__GATEWAY, newGateway, newGateway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatingBlock getActuatingblock() {
		if (actuatingblock != null && actuatingblock.eIsProxy()) {
			InternalEObject oldActuatingblock = (InternalEObject)actuatingblock;
			actuatingblock = (ActuatingBlock)eResolveProxy(oldActuatingblock);
			if (actuatingblock != oldActuatingblock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSystemPackage.COMPUTING_BOARD__ACTUATINGBLOCK, oldActuatingblock, actuatingblock));
			}
		}
		return actuatingblock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatingBlock basicGetActuatingblock() {
		return actuatingblock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuatingblock(ActuatingBlock newActuatingblock) {
		ActuatingBlock oldActuatingblock = actuatingblock;
		actuatingblock = newActuatingblock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.COMPUTING_BOARD__ACTUATINGBLOCK, oldActuatingblock, actuatingblock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorBlock getSensorblock() {
		if (sensorblock != null && sensorblock.eIsProxy()) {
			InternalEObject oldSensorblock = (InternalEObject)sensorblock;
			sensorblock = (SensorBlock)eResolveProxy(oldSensorblock);
			if (sensorblock != oldSensorblock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSystemPackage.COMPUTING_BOARD__SENSORBLOCK, oldSensorblock, sensorblock));
			}
		}
		return sensorblock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorBlock basicGetSensorblock() {
		return sensorblock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSensorblock(SensorBlock newSensorblock, NotificationChain msgs) {
		SensorBlock oldSensorblock = sensorblock;
		sensorblock = newSensorblock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.COMPUTING_BOARD__SENSORBLOCK, oldSensorblock, newSensorblock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensorblock(SensorBlock newSensorblock) {
		if (newSensorblock != sensorblock) {
			NotificationChain msgs = null;
			if (sensorblock != null)
				msgs = ((InternalEObject)sensorblock).eInverseRemove(this, CHESSIoTSystemPackage.SENSOR_BLOCK__COMPUTINGBOARD, SensorBlock.class, msgs);
			if (newSensorblock != null)
				msgs = ((InternalEObject)newSensorblock).eInverseAdd(this, CHESSIoTSystemPackage.SENSOR_BLOCK__COMPUTINGBOARD, SensorBlock.class, msgs);
			msgs = basicSetSensorblock(newSensorblock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.COMPUTING_BOARD__SENSORBLOCK, newSensorblock, newSensorblock));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSystemPackage.COMPUTING_BOARD__PHYSICALENTITY, oldPhysicalentity, physicalentity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.COMPUTING_BOARD__PHYSICALENTITY, oldPhysicalentity, physicalentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CHESSIoTSystemPackage.COMPUTING_BOARD__GATEWAY:
				if (gateway != null)
					msgs = ((InternalEObject)gateway).eInverseRemove(this, CHESSIoTSystemPackage.GATEWAY__COMPUTINGBOARD, Gateway.class, msgs);
				return basicSetGateway((Gateway)otherEnd, msgs);
			case CHESSIoTSystemPackage.COMPUTING_BOARD__SENSORBLOCK:
				if (sensorblock != null)
					msgs = ((InternalEObject)sensorblock).eInverseRemove(this, CHESSIoTSystemPackage.SENSOR_BLOCK__COMPUTINGBOARD, SensorBlock.class, msgs);
				return basicSetSensorblock((SensorBlock)otherEnd, msgs);
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
			case CHESSIoTSystemPackage.COMPUTING_BOARD__GATEWAY:
				return basicSetGateway(null, msgs);
			case CHESSIoTSystemPackage.COMPUTING_BOARD__SENSORBLOCK:
				return basicSetSensorblock(null, msgs);
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
			case CHESSIoTSystemPackage.COMPUTING_BOARD__NODE_MODEL:
				return getNodeModel();
			case CHESSIoTSystemPackage.COMPUTING_BOARD__GATEWAY:
				if (resolve) return getGateway();
				return basicGetGateway();
			case CHESSIoTSystemPackage.COMPUTING_BOARD__ACTUATINGBLOCK:
				if (resolve) return getActuatingblock();
				return basicGetActuatingblock();
			case CHESSIoTSystemPackage.COMPUTING_BOARD__SENSORBLOCK:
				if (resolve) return getSensorblock();
				return basicGetSensorblock();
			case CHESSIoTSystemPackage.COMPUTING_BOARD__PHYSICALENTITY:
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
			case CHESSIoTSystemPackage.COMPUTING_BOARD__NODE_MODEL:
				setNodeModel((NodeModel)newValue);
				return;
			case CHESSIoTSystemPackage.COMPUTING_BOARD__GATEWAY:
				setGateway((Gateway)newValue);
				return;
			case CHESSIoTSystemPackage.COMPUTING_BOARD__ACTUATINGBLOCK:
				setActuatingblock((ActuatingBlock)newValue);
				return;
			case CHESSIoTSystemPackage.COMPUTING_BOARD__SENSORBLOCK:
				setSensorblock((SensorBlock)newValue);
				return;
			case CHESSIoTSystemPackage.COMPUTING_BOARD__PHYSICALENTITY:
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
			case CHESSIoTSystemPackage.COMPUTING_BOARD__NODE_MODEL:
				setNodeModel(NODE_MODEL_EDEFAULT);
				return;
			case CHESSIoTSystemPackage.COMPUTING_BOARD__GATEWAY:
				setGateway((Gateway)null);
				return;
			case CHESSIoTSystemPackage.COMPUTING_BOARD__ACTUATINGBLOCK:
				setActuatingblock((ActuatingBlock)null);
				return;
			case CHESSIoTSystemPackage.COMPUTING_BOARD__SENSORBLOCK:
				setSensorblock((SensorBlock)null);
				return;
			case CHESSIoTSystemPackage.COMPUTING_BOARD__PHYSICALENTITY:
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
			case CHESSIoTSystemPackage.COMPUTING_BOARD__NODE_MODEL:
				return nodeModel != NODE_MODEL_EDEFAULT;
			case CHESSIoTSystemPackage.COMPUTING_BOARD__GATEWAY:
				return gateway != null;
			case CHESSIoTSystemPackage.COMPUTING_BOARD__ACTUATINGBLOCK:
				return actuatingblock != null;
			case CHESSIoTSystemPackage.COMPUTING_BOARD__SENSORBLOCK:
				return sensorblock != null;
			case CHESSIoTSystemPackage.COMPUTING_BOARD__PHYSICALENTITY:
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
		result.append(" (nodeModel: ");
		result.append(nodeModel);
		result.append(')');
		return result.toString();
	}

} //ComputingBoardImpl
