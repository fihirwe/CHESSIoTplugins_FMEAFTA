/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.sysml.blocks.Block;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTPort;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalElement;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalEntity;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SYSTEM_Hw;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Server;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SYSTEM Hw</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SYSTEM_HwImpl#getBase_Block <em>Base Block</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SYSTEM_HwImpl#getPhysicalentity <em>Physicalentity</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SYSTEM_HwImpl#getIotport <em>Iotport</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SYSTEM_HwImpl#getServer <em>Server</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SYSTEM_HwImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SYSTEM_HwImpl#getSystem_hw <em>System hw</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.SYSTEM_HwImpl#getPhysicalelement <em>Physicalelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SYSTEM_HwImpl extends MinimalEObjectImpl.Container implements SYSTEM_Hw {
	/**
	 * The cached value of the '{@link #getBase_Block() <em>Base Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Block()
	 * @generated
	 * @ordered
	 */
	protected Block base_Block;

	/**
	 * The cached value of the '{@link #getPhysicalentity() <em>Physicalentity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalentity()
	 * @generated
	 * @ordered
	 */
	protected PhysicalEntity physicalentity;

	/**
	 * The cached value of the '{@link #getIotport() <em>Iotport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIotport()
	 * @generated
	 * @ordered
	 */
	protected IoTPort iotport;

	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected Server server;

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
	 * The cached value of the '{@link #getSystem_hw() <em>System hw</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem_hw()
	 * @generated
	 * @ordered
	 */
	protected SYSTEM_Hw system_hw;

	/**
	 * The cached value of the '{@link #getPhysicalelement() <em>Physicalelement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalelement()
	 * @generated
	 * @ordered
	 */
	protected PhysicalElement physicalelement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SYSTEM_HwImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSystemPackage.Literals.SYSTEM_HW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBase_Block() {
		if (base_Block != null && base_Block.eIsProxy()) {
			InternalEObject oldBase_Block = (InternalEObject)base_Block;
			base_Block = (Block)eResolveProxy(oldBase_Block);
			if (base_Block != oldBase_Block) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSystemPackage.SYSTEM_HW__BASE_BLOCK, oldBase_Block, base_Block));
			}
		}
		return base_Block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block basicGetBase_Block() {
		return base_Block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Block(Block newBase_Block) {
		Block oldBase_Block = base_Block;
		base_Block = newBase_Block;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.SYSTEM_HW__BASE_BLOCK, oldBase_Block, base_Block));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalEntity getPhysicalentity() {
		return physicalentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysicalentity(PhysicalEntity newPhysicalentity, NotificationChain msgs) {
		PhysicalEntity oldPhysicalentity = physicalentity;
		physicalentity = newPhysicalentity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.SYSTEM_HW__PHYSICALENTITY, oldPhysicalentity, newPhysicalentity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalentity(PhysicalEntity newPhysicalentity) {
		if (newPhysicalentity != physicalentity) {
			NotificationChain msgs = null;
			if (physicalentity != null)
				msgs = ((InternalEObject)physicalentity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CHESSIoTSystemPackage.SYSTEM_HW__PHYSICALENTITY, null, msgs);
			if (newPhysicalentity != null)
				msgs = ((InternalEObject)newPhysicalentity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CHESSIoTSystemPackage.SYSTEM_HW__PHYSICALENTITY, null, msgs);
			msgs = basicSetPhysicalentity(newPhysicalentity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.SYSTEM_HW__PHYSICALENTITY, newPhysicalentity, newPhysicalentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTPort getIotport() {
		return iotport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIotport(IoTPort newIotport, NotificationChain msgs) {
		IoTPort oldIotport = iotport;
		iotport = newIotport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.SYSTEM_HW__IOTPORT, oldIotport, newIotport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIotport(IoTPort newIotport) {
		if (newIotport != iotport) {
			NotificationChain msgs = null;
			if (iotport != null)
				msgs = ((InternalEObject)iotport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CHESSIoTSystemPackage.SYSTEM_HW__IOTPORT, null, msgs);
			if (newIotport != null)
				msgs = ((InternalEObject)newIotport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CHESSIoTSystemPackage.SYSTEM_HW__IOTPORT, null, msgs);
			msgs = basicSetIotport(newIotport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.SYSTEM_HW__IOTPORT, newIotport, newIotport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server getServer() {
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServer(Server newServer, NotificationChain msgs) {
		Server oldServer = server;
		server = newServer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.SYSTEM_HW__SERVER, oldServer, newServer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(Server newServer) {
		if (newServer != server) {
			NotificationChain msgs = null;
			if (server != null)
				msgs = ((InternalEObject)server).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CHESSIoTSystemPackage.SYSTEM_HW__SERVER, null, msgs);
			if (newServer != null)
				msgs = ((InternalEObject)newServer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CHESSIoTSystemPackage.SYSTEM_HW__SERVER, null, msgs);
			msgs = basicSetServer(newServer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.SYSTEM_HW__SERVER, newServer, newServer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.SYSTEM_HW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SYSTEM_Hw getSystem_hw() {
		return system_hw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem_hw(SYSTEM_Hw newSystem_hw, NotificationChain msgs) {
		SYSTEM_Hw oldSystem_hw = system_hw;
		system_hw = newSystem_hw;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.SYSTEM_HW__SYSTEM_HW, oldSystem_hw, newSystem_hw);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem_hw(SYSTEM_Hw newSystem_hw) {
		if (newSystem_hw != system_hw) {
			NotificationChain msgs = null;
			if (system_hw != null)
				msgs = ((InternalEObject)system_hw).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CHESSIoTSystemPackage.SYSTEM_HW__SYSTEM_HW, null, msgs);
			if (newSystem_hw != null)
				msgs = ((InternalEObject)newSystem_hw).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CHESSIoTSystemPackage.SYSTEM_HW__SYSTEM_HW, null, msgs);
			msgs = basicSetSystem_hw(newSystem_hw, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.SYSTEM_HW__SYSTEM_HW, newSystem_hw, newSystem_hw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalElement getPhysicalelement() {
		return physicalelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysicalelement(PhysicalElement newPhysicalelement, NotificationChain msgs) {
		PhysicalElement oldPhysicalelement = physicalelement;
		physicalelement = newPhysicalelement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.SYSTEM_HW__PHYSICALELEMENT, oldPhysicalelement, newPhysicalelement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalelement(PhysicalElement newPhysicalelement) {
		if (newPhysicalelement != physicalelement) {
			NotificationChain msgs = null;
			if (physicalelement != null)
				msgs = ((InternalEObject)physicalelement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CHESSIoTSystemPackage.SYSTEM_HW__PHYSICALELEMENT, null, msgs);
			if (newPhysicalelement != null)
				msgs = ((InternalEObject)newPhysicalelement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CHESSIoTSystemPackage.SYSTEM_HW__PHYSICALELEMENT, null, msgs);
			msgs = basicSetPhysicalelement(newPhysicalelement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.SYSTEM_HW__PHYSICALELEMENT, newPhysicalelement, newPhysicalelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CHESSIoTSystemPackage.SYSTEM_HW__PHYSICALENTITY:
				return basicSetPhysicalentity(null, msgs);
			case CHESSIoTSystemPackage.SYSTEM_HW__IOTPORT:
				return basicSetIotport(null, msgs);
			case CHESSIoTSystemPackage.SYSTEM_HW__SERVER:
				return basicSetServer(null, msgs);
			case CHESSIoTSystemPackage.SYSTEM_HW__SYSTEM_HW:
				return basicSetSystem_hw(null, msgs);
			case CHESSIoTSystemPackage.SYSTEM_HW__PHYSICALELEMENT:
				return basicSetPhysicalelement(null, msgs);
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
			case CHESSIoTSystemPackage.SYSTEM_HW__BASE_BLOCK:
				if (resolve) return getBase_Block();
				return basicGetBase_Block();
			case CHESSIoTSystemPackage.SYSTEM_HW__PHYSICALENTITY:
				return getPhysicalentity();
			case CHESSIoTSystemPackage.SYSTEM_HW__IOTPORT:
				return getIotport();
			case CHESSIoTSystemPackage.SYSTEM_HW__SERVER:
				return getServer();
			case CHESSIoTSystemPackage.SYSTEM_HW__NAME:
				return getName();
			case CHESSIoTSystemPackage.SYSTEM_HW__SYSTEM_HW:
				return getSystem_hw();
			case CHESSIoTSystemPackage.SYSTEM_HW__PHYSICALELEMENT:
				return getPhysicalelement();
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
			case CHESSIoTSystemPackage.SYSTEM_HW__BASE_BLOCK:
				setBase_Block((Block)newValue);
				return;
			case CHESSIoTSystemPackage.SYSTEM_HW__PHYSICALENTITY:
				setPhysicalentity((PhysicalEntity)newValue);
				return;
			case CHESSIoTSystemPackage.SYSTEM_HW__IOTPORT:
				setIotport((IoTPort)newValue);
				return;
			case CHESSIoTSystemPackage.SYSTEM_HW__SERVER:
				setServer((Server)newValue);
				return;
			case CHESSIoTSystemPackage.SYSTEM_HW__NAME:
				setName((String)newValue);
				return;
			case CHESSIoTSystemPackage.SYSTEM_HW__SYSTEM_HW:
				setSystem_hw((SYSTEM_Hw)newValue);
				return;
			case CHESSIoTSystemPackage.SYSTEM_HW__PHYSICALELEMENT:
				setPhysicalelement((PhysicalElement)newValue);
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
			case CHESSIoTSystemPackage.SYSTEM_HW__BASE_BLOCK:
				setBase_Block((Block)null);
				return;
			case CHESSIoTSystemPackage.SYSTEM_HW__PHYSICALENTITY:
				setPhysicalentity((PhysicalEntity)null);
				return;
			case CHESSIoTSystemPackage.SYSTEM_HW__IOTPORT:
				setIotport((IoTPort)null);
				return;
			case CHESSIoTSystemPackage.SYSTEM_HW__SERVER:
				setServer((Server)null);
				return;
			case CHESSIoTSystemPackage.SYSTEM_HW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CHESSIoTSystemPackage.SYSTEM_HW__SYSTEM_HW:
				setSystem_hw((SYSTEM_Hw)null);
				return;
			case CHESSIoTSystemPackage.SYSTEM_HW__PHYSICALELEMENT:
				setPhysicalelement((PhysicalElement)null);
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
			case CHESSIoTSystemPackage.SYSTEM_HW__BASE_BLOCK:
				return base_Block != null;
			case CHESSIoTSystemPackage.SYSTEM_HW__PHYSICALENTITY:
				return physicalentity != null;
			case CHESSIoTSystemPackage.SYSTEM_HW__IOTPORT:
				return iotport != null;
			case CHESSIoTSystemPackage.SYSTEM_HW__SERVER:
				return server != null;
			case CHESSIoTSystemPackage.SYSTEM_HW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CHESSIoTSystemPackage.SYSTEM_HW__SYSTEM_HW:
				return system_hw != null;
			case CHESSIoTSystemPackage.SYSTEM_HW__PHYSICALELEMENT:
				return physicalelement != null;
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

} //SYSTEM_HwImpl
