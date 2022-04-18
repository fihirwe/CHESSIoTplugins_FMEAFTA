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

import org.eclipse.uml2.uml.Transition;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.ConditionEvent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Guard;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTState;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateTransition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.StateTransitionImpl#getBase_Transition <em>Base Transition</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.StateTransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.StateTransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.StateTransitionImpl#getConditionalevent <em>Conditionalevent</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.StateTransitionImpl#getGuard <em>Guard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateTransitionImpl extends MinimalEObjectImpl.Container implements StateTransition {
	/**
	 * The cached value of the '{@link #getBase_Transition() <em>Base Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Transition()
	 * @generated
	 * @ordered
	 */
	protected Transition base_Transition;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected IoTState target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected IoTState source;

	/**
	 * The cached value of the '{@link #getConditionalevent() <em>Conditionalevent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalevent()
	 * @generated
	 * @ordered
	 */
	protected ConditionEvent conditionalevent;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected EList<Guard> guard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSoftwarePackage.Literals.STATE_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getBase_Transition() {
		if (base_Transition != null && base_Transition.eIsProxy()) {
			InternalEObject oldBase_Transition = (InternalEObject)base_Transition;
			base_Transition = (Transition)eResolveProxy(oldBase_Transition);
			if (base_Transition != oldBase_Transition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.STATE_TRANSITION__BASE_TRANSITION, oldBase_Transition, base_Transition));
			}
		}
		return base_Transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetBase_Transition() {
		return base_Transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Transition(Transition newBase_Transition) {
		Transition oldBase_Transition = base_Transition;
		base_Transition = newBase_Transition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.STATE_TRANSITION__BASE_TRANSITION, oldBase_Transition, base_Transition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTState getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (IoTState)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.STATE_TRANSITION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTState basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(IoTState newTarget) {
		IoTState oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.STATE_TRANSITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTState getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (IoTState)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.STATE_TRANSITION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTState basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(IoTState newSource) {
		IoTState oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.STATE_TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionEvent getConditionalevent() {
		if (conditionalevent != null && conditionalevent.eIsProxy()) {
			InternalEObject oldConditionalevent = (InternalEObject)conditionalevent;
			conditionalevent = (ConditionEvent)eResolveProxy(oldConditionalevent);
			if (conditionalevent != oldConditionalevent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.STATE_TRANSITION__CONDITIONALEVENT, oldConditionalevent, conditionalevent));
			}
		}
		return conditionalevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionEvent basicGetConditionalevent() {
		return conditionalevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionalevent(ConditionEvent newConditionalevent) {
		ConditionEvent oldConditionalevent = conditionalevent;
		conditionalevent = newConditionalevent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.STATE_TRANSITION__CONDITIONALEVENT, oldConditionalevent, conditionalevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guard> getGuard() {
		if (guard == null) {
			guard = new EObjectResolvingEList<Guard>(Guard.class, this, CHESSIoTSoftwarePackage.STATE_TRANSITION__GUARD);
		}
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__BASE_TRANSITION:
				if (resolve) return getBase_Transition();
				return basicGetBase_Transition();
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__CONDITIONALEVENT:
				if (resolve) return getConditionalevent();
				return basicGetConditionalevent();
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__GUARD:
				return getGuard();
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
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__BASE_TRANSITION:
				setBase_Transition((Transition)newValue);
				return;
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__TARGET:
				setTarget((IoTState)newValue);
				return;
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__SOURCE:
				setSource((IoTState)newValue);
				return;
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__CONDITIONALEVENT:
				setConditionalevent((ConditionEvent)newValue);
				return;
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__GUARD:
				getGuard().clear();
				getGuard().addAll((Collection<? extends Guard>)newValue);
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
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__BASE_TRANSITION:
				setBase_Transition((Transition)null);
				return;
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__TARGET:
				setTarget((IoTState)null);
				return;
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__SOURCE:
				setSource((IoTState)null);
				return;
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__CONDITIONALEVENT:
				setConditionalevent((ConditionEvent)null);
				return;
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__GUARD:
				getGuard().clear();
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
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__BASE_TRANSITION:
				return base_Transition != null;
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__TARGET:
				return target != null;
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__SOURCE:
				return source != null;
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__CONDITIONALEVENT:
				return conditionalevent != null;
			case CHESSIoTSoftwarePackage.STATE_TRANSITION__GUARD:
				return guard != null && !guard.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateTransitionImpl
