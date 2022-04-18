/**
 */
package fmea.impl;

import fmea.FmeaPackage;
import fmea.InterPort;
import fmea.Row;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.chess.fla.flamm.Failure;
import org.polarsys.chess.fla.flamm.Port;
import org.polarsys.chess.fla.flamm.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fmea.impl.RowImpl#getLocalPort <em>Local Port</em>}</li>
 *   <li>{@link fmea.impl.RowImpl#getFailureMode <em>Failure Mode</em>}</li>
 *   <li>{@link fmea.impl.RowImpl#getLocalEffect <em>Local Effect</em>}</li>
 *   <li>{@link fmea.impl.RowImpl#getEndPort <em>End Port</em>}</li>
 *   <li>{@link fmea.impl.RowImpl#getEndEffect <em>End Effect</em>}</li>
 *   <li>{@link fmea.impl.RowImpl#getInterPorts <em>Inter Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RowImpl extends MinimalEObjectImpl.Container implements Row {
	/**
	 * The cached value of the '{@link #getLocalPort() <em>Local Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPort()
	 * @generated
	 * @ordered
	 */
	protected Port localPort;

	/**
	 * The cached value of the '{@link #getFailureMode() <em>Failure Mode</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureMode()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> failureMode;

	/**
	 * The cached value of the '{@link #getLocalEffect() <em>Local Effect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalEffect()
	 * @generated
	 * @ordered
	 */
	protected Failure localEffect;

	/**
	 * The cached value of the '{@link #getEndPort() <em>End Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPort()
	 * @generated
	 * @ordered
	 */
	protected Port endPort;

	/**
	 * The cached value of the '{@link #getEndEffect() <em>End Effect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndEffect()
	 * @generated
	 * @ordered
	 */
	protected Failure endEffect;

	/**
	 * The cached value of the '{@link #getInterPorts() <em>Inter Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<InterPort> interPorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmeaPackage.Literals.ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getLocalPort() {
		if (localPort != null && localPort.eIsProxy()) {
			InternalEObject oldLocalPort = (InternalEObject)localPort;
			localPort = (Port)eResolveProxy(oldLocalPort);
			if (localPort != oldLocalPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FmeaPackage.ROW__LOCAL_PORT, oldLocalPort, localPort));
			}
		}
		return localPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetLocalPort() {
		return localPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalPort(Port newLocalPort) {
		Port oldLocalPort = localPort;
		localPort = newLocalPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmeaPackage.ROW__LOCAL_PORT, oldLocalPort, localPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getFailureMode() {
		if (failureMode == null) {
			failureMode = new EObjectResolvingEList<Rule>(Rule.class, this, FmeaPackage.ROW__FAILURE_MODE);
		}
		return failureMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure getLocalEffect() {
		if (localEffect != null && localEffect.eIsProxy()) {
			InternalEObject oldLocalEffect = (InternalEObject)localEffect;
			localEffect = (Failure)eResolveProxy(oldLocalEffect);
			if (localEffect != oldLocalEffect) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FmeaPackage.ROW__LOCAL_EFFECT, oldLocalEffect, localEffect));
			}
		}
		return localEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure basicGetLocalEffect() {
		return localEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalEffect(Failure newLocalEffect) {
		Failure oldLocalEffect = localEffect;
		localEffect = newLocalEffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmeaPackage.ROW__LOCAL_EFFECT, oldLocalEffect, localEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getEndPort() {
		if (endPort != null && endPort.eIsProxy()) {
			InternalEObject oldEndPort = (InternalEObject)endPort;
			endPort = (Port)eResolveProxy(oldEndPort);
			if (endPort != oldEndPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FmeaPackage.ROW__END_PORT, oldEndPort, endPort));
			}
		}
		return endPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetEndPort() {
		return endPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndPort(Port newEndPort) {
		Port oldEndPort = endPort;
		endPort = newEndPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmeaPackage.ROW__END_PORT, oldEndPort, endPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure getEndEffect() {
		if (endEffect != null && endEffect.eIsProxy()) {
			InternalEObject oldEndEffect = (InternalEObject)endEffect;
			endEffect = (Failure)eResolveProxy(oldEndEffect);
			if (endEffect != oldEndEffect) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FmeaPackage.ROW__END_EFFECT, oldEndEffect, endEffect));
			}
		}
		return endEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure basicGetEndEffect() {
		return endEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndEffect(Failure newEndEffect) {
		Failure oldEndEffect = endEffect;
		endEffect = newEndEffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmeaPackage.ROW__END_EFFECT, oldEndEffect, endEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterPort> getInterPorts() {
		if (interPorts == null) {
			interPorts = new EObjectContainmentEList<InterPort>(InterPort.class, this, FmeaPackage.ROW__INTER_PORTS);
		}
		return interPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FmeaPackage.ROW__INTER_PORTS:
				return ((InternalEList<?>)getInterPorts()).basicRemove(otherEnd, msgs);
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
			case FmeaPackage.ROW__LOCAL_PORT:
				if (resolve) return getLocalPort();
				return basicGetLocalPort();
			case FmeaPackage.ROW__FAILURE_MODE:
				return getFailureMode();
			case FmeaPackage.ROW__LOCAL_EFFECT:
				if (resolve) return getLocalEffect();
				return basicGetLocalEffect();
			case FmeaPackage.ROW__END_PORT:
				if (resolve) return getEndPort();
				return basicGetEndPort();
			case FmeaPackage.ROW__END_EFFECT:
				if (resolve) return getEndEffect();
				return basicGetEndEffect();
			case FmeaPackage.ROW__INTER_PORTS:
				return getInterPorts();
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
			case FmeaPackage.ROW__LOCAL_PORT:
				setLocalPort((Port)newValue);
				return;
			case FmeaPackage.ROW__FAILURE_MODE:
				getFailureMode().clear();
				getFailureMode().addAll((Collection<? extends Rule>)newValue);
				return;
			case FmeaPackage.ROW__LOCAL_EFFECT:
				setLocalEffect((Failure)newValue);
				return;
			case FmeaPackage.ROW__END_PORT:
				setEndPort((Port)newValue);
				return;
			case FmeaPackage.ROW__END_EFFECT:
				setEndEffect((Failure)newValue);
				return;
			case FmeaPackage.ROW__INTER_PORTS:
				getInterPorts().clear();
				getInterPorts().addAll((Collection<? extends InterPort>)newValue);
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
			case FmeaPackage.ROW__LOCAL_PORT:
				setLocalPort((Port)null);
				return;
			case FmeaPackage.ROW__FAILURE_MODE:
				getFailureMode().clear();
				return;
			case FmeaPackage.ROW__LOCAL_EFFECT:
				setLocalEffect((Failure)null);
				return;
			case FmeaPackage.ROW__END_PORT:
				setEndPort((Port)null);
				return;
			case FmeaPackage.ROW__END_EFFECT:
				setEndEffect((Failure)null);
				return;
			case FmeaPackage.ROW__INTER_PORTS:
				getInterPorts().clear();
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
			case FmeaPackage.ROW__LOCAL_PORT:
				return localPort != null;
			case FmeaPackage.ROW__FAILURE_MODE:
				return failureMode != null && !failureMode.isEmpty();
			case FmeaPackage.ROW__LOCAL_EFFECT:
				return localEffect != null;
			case FmeaPackage.ROW__END_PORT:
				return endPort != null;
			case FmeaPackage.ROW__END_EFFECT:
				return endEffect != null;
			case FmeaPackage.ROW__INTER_PORTS:
				return interPorts != null && !interPorts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RowImpl
