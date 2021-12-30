/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Actuator;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Sensor;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VitualComputingNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vitual Computing Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VitualComputingNodeImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VitualComputingNodeImpl#getActuator <em>Actuator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VitualComputingNodeImpl extends VirtualElementImpl implements VitualComputingNode {
	/**
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> sensor;

	/**
	 * The cached value of the '{@link #getActuator() <em>Actuator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuator()
	 * @generated
	 * @ordered
	 */
	protected EList<Actuator> actuator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VitualComputingNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSoftwarePackage.Literals.VITUAL_COMPUTING_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getSensor() {
		if (sensor == null) {
			sensor = new EObjectWithInverseResolvingEList<Sensor>(Sensor.class, this, CHESSIoTSoftwarePackage.VITUAL_COMPUTING_NODE__SENSOR, CHESSIoTSoftwarePackage.SENSOR__COMPUTINGNODE);
		}
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actuator> getActuator() {
		if (actuator == null) {
			actuator = new EObjectResolvingEList<Actuator>(Actuator.class, this, CHESSIoTSoftwarePackage.VITUAL_COMPUTING_NODE__ACTUATOR);
		}
		return actuator;
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
			case CHESSIoTSoftwarePackage.VITUAL_COMPUTING_NODE__SENSOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSensor()).basicAdd(otherEnd, msgs);
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
			case CHESSIoTSoftwarePackage.VITUAL_COMPUTING_NODE__SENSOR:
				return ((InternalEList<?>)getSensor()).basicRemove(otherEnd, msgs);
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
			case CHESSIoTSoftwarePackage.VITUAL_COMPUTING_NODE__SENSOR:
				return getSensor();
			case CHESSIoTSoftwarePackage.VITUAL_COMPUTING_NODE__ACTUATOR:
				return getActuator();
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
			case CHESSIoTSoftwarePackage.VITUAL_COMPUTING_NODE__SENSOR:
				getSensor().clear();
				getSensor().addAll((Collection<? extends Sensor>)newValue);
				return;
			case CHESSIoTSoftwarePackage.VITUAL_COMPUTING_NODE__ACTUATOR:
				getActuator().clear();
				getActuator().addAll((Collection<? extends Actuator>)newValue);
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
			case CHESSIoTSoftwarePackage.VITUAL_COMPUTING_NODE__SENSOR:
				getSensor().clear();
				return;
			case CHESSIoTSoftwarePackage.VITUAL_COMPUTING_NODE__ACTUATOR:
				getActuator().clear();
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
			case CHESSIoTSoftwarePackage.VITUAL_COMPUTING_NODE__SENSOR:
				return sensor != null && !sensor.isEmpty();
			case CHESSIoTSoftwarePackage.VITUAL_COMPUTING_NODE__ACTUATOR:
				return actuator != null && !actuator.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VitualComputingNodeImpl
