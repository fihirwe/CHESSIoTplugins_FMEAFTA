/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateMachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.StateMachineImpl#getBase_StateMachine <em>Base State Machine</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.StateMachineImpl#getIotstate <em>Iotstate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends MinimalEObjectImpl.Container implements StateMachine {
	/**
	 * The cached value of the '{@link #getBase_StateMachine() <em>Base State Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_StateMachine()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.StateMachine base_StateMachine;

	/**
	 * The cached value of the '{@link #getIotstate() <em>Iotstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIotstate()
	 * @generated
	 * @ordered
	 */
	protected IoTState iotstate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSoftwarePackage.Literals.STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.StateMachine getBase_StateMachine() {
		if (base_StateMachine != null && base_StateMachine.eIsProxy()) {
			InternalEObject oldBase_StateMachine = (InternalEObject)base_StateMachine;
			base_StateMachine = (org.eclipse.uml2.uml.StateMachine)eResolveProxy(oldBase_StateMachine);
			if (base_StateMachine != oldBase_StateMachine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.STATE_MACHINE__BASE_STATE_MACHINE, oldBase_StateMachine, base_StateMachine));
			}
		}
		return base_StateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.StateMachine basicGetBase_StateMachine() {
		return base_StateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_StateMachine(org.eclipse.uml2.uml.StateMachine newBase_StateMachine) {
		org.eclipse.uml2.uml.StateMachine oldBase_StateMachine = base_StateMachine;
		base_StateMachine = newBase_StateMachine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.STATE_MACHINE__BASE_STATE_MACHINE, oldBase_StateMachine, base_StateMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTState getIotstate() {
		if (iotstate != null && iotstate.eIsProxy()) {
			InternalEObject oldIotstate = (InternalEObject)iotstate;
			iotstate = (IoTState)eResolveProxy(oldIotstate);
			if (iotstate != oldIotstate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.STATE_MACHINE__IOTSTATE, oldIotstate, iotstate));
			}
		}
		return iotstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTState basicGetIotstate() {
		return iotstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIotstate(IoTState newIotstate) {
		IoTState oldIotstate = iotstate;
		iotstate = newIotstate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.STATE_MACHINE__IOTSTATE, oldIotstate, iotstate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.STATE_MACHINE__BASE_STATE_MACHINE:
				if (resolve) return getBase_StateMachine();
				return basicGetBase_StateMachine();
			case CHESSIoTSoftwarePackage.STATE_MACHINE__IOTSTATE:
				if (resolve) return getIotstate();
				return basicGetIotstate();
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
			case CHESSIoTSoftwarePackage.STATE_MACHINE__BASE_STATE_MACHINE:
				setBase_StateMachine((org.eclipse.uml2.uml.StateMachine)newValue);
				return;
			case CHESSIoTSoftwarePackage.STATE_MACHINE__IOTSTATE:
				setIotstate((IoTState)newValue);
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
			case CHESSIoTSoftwarePackage.STATE_MACHINE__BASE_STATE_MACHINE:
				setBase_StateMachine((org.eclipse.uml2.uml.StateMachine)null);
				return;
			case CHESSIoTSoftwarePackage.STATE_MACHINE__IOTSTATE:
				setIotstate((IoTState)null);
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
			case CHESSIoTSoftwarePackage.STATE_MACHINE__BASE_STATE_MACHINE:
				return base_StateMachine != null;
			case CHESSIoTSoftwarePackage.STATE_MACHINE__IOTSTATE:
				return iotstate != null;
		}
		return super.eIsSet(featureID);
	}

} //StateMachineImpl
