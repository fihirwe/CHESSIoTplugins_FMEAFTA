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

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Gateway;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalBoard;
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
	 * The cached value of the '{@link #getServer() <em>Server</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected EList<Server> server;

	/**
	 * The cached value of the '{@link #getComputingboard() <em>Computingboard</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputingboard()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalBoard> computingboard;

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
	public EList<Server> getServer() {
		if (server == null) {
			server = new EObjectResolvingEList<Server>(Server.class, this, CHESSIoTSystemPackage.GATEWAY__SERVER);
		}
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalBoard> getComputingboard() {
		if (computingboard == null) {
			computingboard = new EObjectWithInverseResolvingEList.ManyInverse<PhysicalBoard>(PhysicalBoard.class, this, CHESSIoTSystemPackage.GATEWAY__COMPUTINGBOARD, CHESSIoTSystemPackage.PHYSICAL_BOARD__GATEWAY);
		}
		return computingboard;
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
			case CHESSIoTSystemPackage.GATEWAY__COMPUTINGBOARD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComputingboard()).basicAdd(otherEnd, msgs);
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
				return ((InternalEList<?>)getComputingboard()).basicRemove(otherEnd, msgs);
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
				return getServer();
			case CHESSIoTSystemPackage.GATEWAY__COMPUTINGBOARD:
				return getComputingboard();
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
			case CHESSIoTSystemPackage.GATEWAY__GATEWAY:
				setGateway((Gateway)newValue);
				return;
			case CHESSIoTSystemPackage.GATEWAY__SERVER:
				getServer().clear();
				getServer().addAll((Collection<? extends Server>)newValue);
				return;
			case CHESSIoTSystemPackage.GATEWAY__COMPUTINGBOARD:
				getComputingboard().clear();
				getComputingboard().addAll((Collection<? extends PhysicalBoard>)newValue);
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
				getServer().clear();
				return;
			case CHESSIoTSystemPackage.GATEWAY__COMPUTINGBOARD:
				getComputingboard().clear();
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
				return server != null && !server.isEmpty();
			case CHESSIoTSystemPackage.GATEWAY__COMPUTINGBOARD:
				return computingboard != null && !computingboard.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GatewayImpl
