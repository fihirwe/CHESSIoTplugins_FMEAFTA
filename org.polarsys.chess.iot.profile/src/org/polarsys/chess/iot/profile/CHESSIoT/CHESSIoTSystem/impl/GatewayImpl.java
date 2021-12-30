/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ComputingBoard;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Gateway;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Server;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.GatewayImpl#getGateway <em>Gateway</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.GatewayImpl#getServer <em>Server</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.GatewayImpl#getComputingboard <em>Computingboard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GatewayImpl extends PhysicalElementImpl implements Gateway {
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
	 * The cached value of the '{@link #getServer() <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected Server server;

	/**
	 * The cached value of the '{@link #getComputingboard() <em>Computingboard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputingboard()
	 * @generated
	 * @ordered
	 */
	protected ComputingBoard computingboard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSystemPackage.Literals.GATEWAY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSystemPackage.GATEWAY__GATEWAY, oldGateway, gateway));
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
	public void setGateway(Gateway newGateway) {
		Gateway oldGateway = gateway;
		gateway = newGateway;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.GATEWAY__GATEWAY, oldGateway, gateway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server getServer() {
		if (server != null && server.eIsProxy()) {
			InternalEObject oldServer = (InternalEObject)server;
			server = (Server)eResolveProxy(oldServer);
			if (server != oldServer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSystemPackage.GATEWAY__SERVER, oldServer, server));
			}
		}
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server basicGetServer() {
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(Server newServer) {
		Server oldServer = server;
		server = newServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.GATEWAY__SERVER, oldServer, server));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputingBoard getComputingboard() {
		if (computingboard != null && computingboard.eIsProxy()) {
			InternalEObject oldComputingboard = (InternalEObject)computingboard;
			computingboard = (ComputingBoard)eResolveProxy(oldComputingboard);
			if (computingboard != oldComputingboard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSystemPackage.GATEWAY__COMPUTINGBOARD, oldComputingboard, computingboard));
			}
		}
		return computingboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputingBoard basicGetComputingboard() {
		return computingboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComputingboard(ComputingBoard newComputingboard, NotificationChain msgs) {
		ComputingBoard oldComputingboard = computingboard;
		computingboard = newComputingboard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.GATEWAY__COMPUTINGBOARD, oldComputingboard, newComputingboard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputingboard(ComputingBoard newComputingboard) {
		if (newComputingboard != computingboard) {
			NotificationChain msgs = null;
			if (computingboard != null)
				msgs = ((InternalEObject)computingboard).eInverseRemove(this, CHESSIoTSystemPackage.COMPUTING_BOARD__GATEWAY, ComputingBoard.class, msgs);
			if (newComputingboard != null)
				msgs = ((InternalEObject)newComputingboard).eInverseAdd(this, CHESSIoTSystemPackage.COMPUTING_BOARD__GATEWAY, ComputingBoard.class, msgs);
			msgs = basicSetComputingboard(newComputingboard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.GATEWAY__COMPUTINGBOARD, newComputingboard, newComputingboard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CHESSIoTSystemPackage.GATEWAY__COMPUTINGBOARD:
				if (computingboard != null)
					msgs = ((InternalEObject)computingboard).eInverseRemove(this, CHESSIoTSystemPackage.COMPUTING_BOARD__GATEWAY, ComputingBoard.class, msgs);
				return basicSetComputingboard((ComputingBoard)otherEnd, msgs);
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
			case CHESSIoTSystemPackage.GATEWAY__COMPUTINGBOARD:
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
			case CHESSIoTSystemPackage.GATEWAY__GATEWAY:
				if (resolve) return getGateway();
				return basicGetGateway();
			case CHESSIoTSystemPackage.GATEWAY__SERVER:
				if (resolve) return getServer();
				return basicGetServer();
			case CHESSIoTSystemPackage.GATEWAY__COMPUTINGBOARD:
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
			case CHESSIoTSystemPackage.GATEWAY__GATEWAY:
				setGateway((Gateway)newValue);
				return;
			case CHESSIoTSystemPackage.GATEWAY__SERVER:
				setServer((Server)newValue);
				return;
			case CHESSIoTSystemPackage.GATEWAY__COMPUTINGBOARD:
				setComputingboard((ComputingBoard)newValue);
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
			case CHESSIoTSystemPackage.GATEWAY__GATEWAY:
				setGateway((Gateway)null);
				return;
			case CHESSIoTSystemPackage.GATEWAY__SERVER:
				setServer((Server)null);
				return;
			case CHESSIoTSystemPackage.GATEWAY__COMPUTINGBOARD:
				setComputingboard((ComputingBoard)null);
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
			case CHESSIoTSystemPackage.GATEWAY__GATEWAY:
				return gateway != null;
			case CHESSIoTSystemPackage.GATEWAY__SERVER:
				return server != null;
			case CHESSIoTSystemPackage.GATEWAY__COMPUTINGBOARD:
				return computingboard != null;
		}
		return super.eIsSet(featureID);
	}

} //GatewayImpl
