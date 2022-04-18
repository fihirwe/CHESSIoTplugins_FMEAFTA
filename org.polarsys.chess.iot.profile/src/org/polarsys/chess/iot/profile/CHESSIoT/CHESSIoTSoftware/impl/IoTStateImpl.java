/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.State;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Action;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.InternalEvent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Io TState</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTStateImpl#getBase_State <em>Base State</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTStateImpl#getOnExit <em>On Exit</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTStateImpl#getInternal <em>Internal</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IoTStateImpl#getOnEntry <em>On Entry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IoTStateImpl extends MinimalEObjectImpl.Container implements IoTState {
	/**
	 * The cached value of the '{@link #getBase_State() <em>Base State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_State()
	 * @generated
	 * @ordered
	 */
	protected State base_State;

	/**
	 * The cached value of the '{@link #getOnExit() <em>On Exit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnExit()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> onExit;

	/**
	 * The cached value of the '{@link #getInternal() <em>Internal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternal()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalEvent> internal;

	/**
	 * The cached value of the '{@link #getOnEntry() <em>On Entry</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> onEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IoTStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSoftwarePackage.Literals.IO_TSTATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getBase_State() {
		if (base_State != null && base_State.eIsProxy()) {
			InternalEObject oldBase_State = (InternalEObject)base_State;
			base_State = (State)eResolveProxy(oldBase_State);
			if (base_State != oldBase_State) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.IO_TSTATE__BASE_STATE, oldBase_State, base_State));
			}
		}
		return base_State;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetBase_State() {
		return base_State;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_State(State newBase_State) {
		State oldBase_State = base_State;
		base_State = newBase_State;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.IO_TSTATE__BASE_STATE, oldBase_State, base_State));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getOnExit() {
		if (onExit == null) {
			onExit = new EObjectResolvingEList<Action>(Action.class, this, CHESSIoTSoftwarePackage.IO_TSTATE__ON_EXIT);
		}
		return onExit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalEvent> getInternal() {
		if (internal == null) {
			internal = new EObjectResolvingEList<InternalEvent>(InternalEvent.class, this, CHESSIoTSoftwarePackage.IO_TSTATE__INTERNAL);
		}
		return internal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getOnEntry() {
		if (onEntry == null) {
			onEntry = new EObjectResolvingEList<Action>(Action.class, this, CHESSIoTSoftwarePackage.IO_TSTATE__ON_ENTRY);
		}
		return onEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.IO_TSTATE__BASE_STATE:
				if (resolve) return getBase_State();
				return basicGetBase_State();
			case CHESSIoTSoftwarePackage.IO_TSTATE__ON_EXIT:
				return getOnExit();
			case CHESSIoTSoftwarePackage.IO_TSTATE__INTERNAL:
				return getInternal();
			case CHESSIoTSoftwarePackage.IO_TSTATE__ON_ENTRY:
				return getOnEntry();
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
			case CHESSIoTSoftwarePackage.IO_TSTATE__BASE_STATE:
				setBase_State((State)newValue);
				return;
			case CHESSIoTSoftwarePackage.IO_TSTATE__ON_EXIT:
				getOnExit().clear();
				getOnExit().addAll((Collection<? extends Action>)newValue);
				return;
			case CHESSIoTSoftwarePackage.IO_TSTATE__INTERNAL:
				getInternal().clear();
				getInternal().addAll((Collection<? extends InternalEvent>)newValue);
				return;
			case CHESSIoTSoftwarePackage.IO_TSTATE__ON_ENTRY:
				getOnEntry().clear();
				getOnEntry().addAll((Collection<? extends Action>)newValue);
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
			case CHESSIoTSoftwarePackage.IO_TSTATE__BASE_STATE:
				setBase_State((State)null);
				return;
			case CHESSIoTSoftwarePackage.IO_TSTATE__ON_EXIT:
				getOnExit().clear();
				return;
			case CHESSIoTSoftwarePackage.IO_TSTATE__INTERNAL:
				getInternal().clear();
				return;
			case CHESSIoTSoftwarePackage.IO_TSTATE__ON_ENTRY:
				getOnEntry().clear();
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
			case CHESSIoTSoftwarePackage.IO_TSTATE__BASE_STATE:
				return base_State != null;
			case CHESSIoTSoftwarePackage.IO_TSTATE__ON_EXIT:
				return onExit != null && !onExit.isEmpty();
			case CHESSIoTSoftwarePackage.IO_TSTATE__INTERNAL:
				return internal != null && !internal.isEmpty();
			case CHESSIoTSoftwarePackage.IO_TSTATE__ON_ENTRY:
				return onEntry != null && !onEntry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IoTStateImpl
