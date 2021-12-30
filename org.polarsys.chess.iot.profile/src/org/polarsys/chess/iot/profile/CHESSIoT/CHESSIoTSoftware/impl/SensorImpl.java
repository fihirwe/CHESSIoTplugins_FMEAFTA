/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Sensor;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VitualComputingNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SensorImpl#getComputingnode <em>Computingnode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorImpl extends VirtualElementImpl implements Sensor {
	/**
	 * The cached value of the '{@link #getComputingnode() <em>Computingnode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputingnode()
	 * @generated
	 * @ordered
	 */
	protected VitualComputingNode computingnode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSoftwarePackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitualComputingNode getComputingnode() {
		if (computingnode != null && computingnode.eIsProxy()) {
			InternalEObject oldComputingnode = (InternalEObject)computingnode;
			computingnode = (VitualComputingNode)eResolveProxy(oldComputingnode);
			if (computingnode != oldComputingnode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.SENSOR__COMPUTINGNODE, oldComputingnode, computingnode));
			}
		}
		return computingnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitualComputingNode basicGetComputingnode() {
		return computingnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComputingnode(VitualComputingNode newComputingnode, NotificationChain msgs) {
		VitualComputingNode oldComputingnode = computingnode;
		computingnode = newComputingnode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.SENSOR__COMPUTINGNODE, oldComputingnode, newComputingnode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputingnode(VitualComputingNode newComputingnode) {
		if (newComputingnode != computingnode) {
			NotificationChain msgs = null;
			if (computingnode != null)
				msgs = ((InternalEObject)computingnode).eInverseRemove(this, CHESSIoTSoftwarePackage.VITUAL_COMPUTING_NODE__SENSOR, VitualComputingNode.class, msgs);
			if (newComputingnode != null)
				msgs = ((InternalEObject)newComputingnode).eInverseAdd(this, CHESSIoTSoftwarePackage.VITUAL_COMPUTING_NODE__SENSOR, VitualComputingNode.class, msgs);
			msgs = basicSetComputingnode(newComputingnode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.SENSOR__COMPUTINGNODE, newComputingnode, newComputingnode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.SENSOR__COMPUTINGNODE:
				if (computingnode != null)
					msgs = ((InternalEObject)computingnode).eInverseRemove(this, CHESSIoTSoftwarePackage.VITUAL_COMPUTING_NODE__SENSOR, VitualComputingNode.class, msgs);
				return basicSetComputingnode((VitualComputingNode)otherEnd, msgs);
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
			case CHESSIoTSoftwarePackage.SENSOR__COMPUTINGNODE:
				return basicSetComputingnode(null, msgs);
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
			case CHESSIoTSoftwarePackage.SENSOR__COMPUTINGNODE:
				if (resolve) return getComputingnode();
				return basicGetComputingnode();
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
			case CHESSIoTSoftwarePackage.SENSOR__COMPUTINGNODE:
				setComputingnode((VitualComputingNode)newValue);
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
			case CHESSIoTSoftwarePackage.SENSOR__COMPUTINGNODE:
				setComputingnode((VitualComputingNode)null);
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
			case CHESSIoTSoftwarePackage.SENSOR__COMPUTINGNODE:
				return computingnode != null;
		}
		return super.eIsSet(featureID);
	}

} //SensorImpl
