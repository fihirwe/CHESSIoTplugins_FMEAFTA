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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.papyrus.sysml.blocks.internal.impl.BlockImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTPort;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalElement;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalEntity;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Server;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SystemImpl#getPhysicalentity <em>Physicalentity</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SystemImpl#getIotport <em>Iotport</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SystemImpl#getServer <em>Server</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SystemImpl#getPhysicalelement <em>Physicalelement</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SystemImpl#getSystem_hw <em>System hw</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends BlockImpl implements org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.System {
	/**
	 * The cached value of the '{@link #getPhysicalentity() <em>Physicalentity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalentity()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalEntity> physicalentity;

	/**
	 * The cached value of the '{@link #getIotport() <em>Iotport</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIotport()
	 * @generated
	 * @ordered
	 */
	protected EList<IoTPort> iotport;

	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected EList<Server> server;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPhysicalelement() <em>Physicalelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalelement()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalElement> physicalelement;

	/**
	 * The cached value of the '{@link #getSystem_hw() <em>System hw</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem_hw()
	 * @generated
	 * @ordered
	 */
	protected org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.System system_hw;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSystemPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalEntity> getPhysicalentity() {
		if (physicalentity == null) {
			physicalentity = new EObjectContainmentEList<PhysicalEntity>(PhysicalEntity.class, this, CHESSIoTSystemPackage.SYSTEM__PHYSICALENTITY);
		}
		return physicalentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IoTPort> getIotport() {
		if (iotport == null) {
			iotport = new EObjectContainmentEList<IoTPort>(IoTPort.class, this, CHESSIoTSystemPackage.SYSTEM__IOTPORT);
		}
		return iotport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Server> getServer() {
		if (server == null) {
			server = new EObjectContainmentEList<Server>(Server.class, this, CHESSIoTSystemPackage.SYSTEM__SERVER);
		}
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalElement> getPhysicalelement() {
		if (physicalelement == null) {
			physicalelement = new EObjectContainmentEList<PhysicalElement>(PhysicalElement.class, this, CHESSIoTSystemPackage.SYSTEM__PHYSICALELEMENT);
		}
		return physicalelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.System getSystem_hw() {
		if (system_hw != null && system_hw.eIsProxy()) {
			InternalEObject oldSystem_hw = (InternalEObject)system_hw;
			system_hw = (org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.System)eResolveProxy(oldSystem_hw);
			if (system_hw != oldSystem_hw) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSystemPackage.SYSTEM__SYSTEM_HW, oldSystem_hw, system_hw));
			}
		}
		return system_hw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.System basicGetSystem_hw() {
		return system_hw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem_hw(org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.System newSystem_hw) {
		org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.System oldSystem_hw = system_hw;
		system_hw = newSystem_hw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.SYSTEM__SYSTEM_HW, oldSystem_hw, system_hw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CHESSIoTSystemPackage.SYSTEM__PHYSICALENTITY:
				return ((InternalEList<?>)getPhysicalentity()).basicRemove(otherEnd, msgs);
			case CHESSIoTSystemPackage.SYSTEM__IOTPORT:
				return ((InternalEList<?>)getIotport()).basicRemove(otherEnd, msgs);
			case CHESSIoTSystemPackage.SYSTEM__SERVER:
				return ((InternalEList<?>)getServer()).basicRemove(otherEnd, msgs);
			case CHESSIoTSystemPackage.SYSTEM__PHYSICALELEMENT:
				return ((InternalEList<?>)getPhysicalelement()).basicRemove(otherEnd, msgs);
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
			case CHESSIoTSystemPackage.SYSTEM__PHYSICALENTITY:
				return getPhysicalentity();
			case CHESSIoTSystemPackage.SYSTEM__IOTPORT:
				return getIotport();
			case CHESSIoTSystemPackage.SYSTEM__SERVER:
				return getServer();
			case CHESSIoTSystemPackage.SYSTEM__NAME:
				return getName();
			case CHESSIoTSystemPackage.SYSTEM__PHYSICALELEMENT:
				return getPhysicalelement();
			case CHESSIoTSystemPackage.SYSTEM__SYSTEM_HW:
				if (resolve) return getSystem_hw();
				return basicGetSystem_hw();
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
			case CHESSIoTSystemPackage.SYSTEM__PHYSICALENTITY:
				getPhysicalentity().clear();
				getPhysicalentity().addAll((Collection<? extends PhysicalEntity>)newValue);
				return;
			case CHESSIoTSystemPackage.SYSTEM__IOTPORT:
				getIotport().clear();
				getIotport().addAll((Collection<? extends IoTPort>)newValue);
				return;
			case CHESSIoTSystemPackage.SYSTEM__SERVER:
				getServer().clear();
				getServer().addAll((Collection<? extends Server>)newValue);
				return;
			case CHESSIoTSystemPackage.SYSTEM__NAME:
				setName((String)newValue);
				return;
			case CHESSIoTSystemPackage.SYSTEM__PHYSICALELEMENT:
				getPhysicalelement().clear();
				getPhysicalelement().addAll((Collection<? extends PhysicalElement>)newValue);
				return;
			case CHESSIoTSystemPackage.SYSTEM__SYSTEM_HW:
				setSystem_hw((org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.System)newValue);
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
			case CHESSIoTSystemPackage.SYSTEM__PHYSICALENTITY:
				getPhysicalentity().clear();
				return;
			case CHESSIoTSystemPackage.SYSTEM__IOTPORT:
				getIotport().clear();
				return;
			case CHESSIoTSystemPackage.SYSTEM__SERVER:
				getServer().clear();
				return;
			case CHESSIoTSystemPackage.SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CHESSIoTSystemPackage.SYSTEM__PHYSICALELEMENT:
				getPhysicalelement().clear();
				return;
			case CHESSIoTSystemPackage.SYSTEM__SYSTEM_HW:
				setSystem_hw((org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.System)null);
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
			case CHESSIoTSystemPackage.SYSTEM__PHYSICALENTITY:
				return physicalentity != null && !physicalentity.isEmpty();
			case CHESSIoTSystemPackage.SYSTEM__IOTPORT:
				return iotport != null && !iotport.isEmpty();
			case CHESSIoTSystemPackage.SYSTEM__SERVER:
				return server != null && !server.isEmpty();
			case CHESSIoTSystemPackage.SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CHESSIoTSystemPackage.SYSTEM__PHYSICALELEMENT:
				return physicalelement != null && !physicalelement.isEmpty();
			case CHESSIoTSystemPackage.SYSTEM__SYSTEM_HW:
				return system_hw != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SystemImpl
