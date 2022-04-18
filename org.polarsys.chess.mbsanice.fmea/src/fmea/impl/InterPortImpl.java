/**
 */
package fmea.impl;

import fmea.FmeaPackage;
import fmea.InterPort;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.polarsys.chess.fla.flamm.Failure;
import org.polarsys.chess.fla.flamm.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inter Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fmea.impl.InterPortImpl#getPort <em>Port</em>}</li>
 *   <li>{@link fmea.impl.InterPortImpl#getFailure <em>Failure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterPortImpl extends MinimalEObjectImpl.Container implements InterPort {
	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected Port port;

	/**
	 * The cached value of the '{@link #getFailure() <em>Failure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailure()
	 * @generated
	 * @ordered
	 */
	protected Failure failure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmeaPackage.Literals.INTER_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPort() {
		if (port != null && port.eIsProxy()) {
			InternalEObject oldPort = (InternalEObject)port;
			port = (Port)eResolveProxy(oldPort);
			if (port != oldPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FmeaPackage.INTER_PORT__PORT, oldPort, port));
			}
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(Port newPort) {
		Port oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmeaPackage.INTER_PORT__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure getFailure() {
		if (failure != null && failure.eIsProxy()) {
			InternalEObject oldFailure = (InternalEObject)failure;
			failure = (Failure)eResolveProxy(oldFailure);
			if (failure != oldFailure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FmeaPackage.INTER_PORT__FAILURE, oldFailure, failure));
			}
		}
		return failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Failure basicGetFailure() {
		return failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailure(Failure newFailure) {
		Failure oldFailure = failure;
		failure = newFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmeaPackage.INTER_PORT__FAILURE, oldFailure, failure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FmeaPackage.INTER_PORT__PORT:
				if (resolve) return getPort();
				return basicGetPort();
			case FmeaPackage.INTER_PORT__FAILURE:
				if (resolve) return getFailure();
				return basicGetFailure();
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
			case FmeaPackage.INTER_PORT__PORT:
				setPort((Port)newValue);
				return;
			case FmeaPackage.INTER_PORT__FAILURE:
				setFailure((Failure)newValue);
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
			case FmeaPackage.INTER_PORT__PORT:
				setPort((Port)null);
				return;
			case FmeaPackage.INTER_PORT__FAILURE:
				setFailure((Failure)null);
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
			case FmeaPackage.INTER_PORT__PORT:
				return port != null;
			case FmeaPackage.INTER_PORT__FAILURE:
				return failure != null;
		}
		return super.eIsSet(featureID);
	}

} //InterPortImpl
