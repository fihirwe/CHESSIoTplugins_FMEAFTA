/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl;

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

import org.eclipse.uml2.uml.Component;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTPort;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.StateMachine;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualElement;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualElementImpl#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualElementImpl#getVirtualelement <em>Virtualelement</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualElementImpl#getVirtualentity <em>Virtualentity</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualElementImpl#getIotport <em>Iotport</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.VirtualElementImpl#getStatemachine <em>Statemachine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualElementImpl extends MinimalEObjectImpl.Container implements VirtualElement {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

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
	 * The cached value of the '{@link #getBase_Component() <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Component()
	 * @generated
	 * @ordered
	 */
	protected Component base_Component;

	/**
	 * The cached value of the '{@link #getVirtualelement() <em>Virtualelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualelement()
	 * @generated
	 * @ordered
	 */
	protected VirtualElement virtualelement;

	/**
	 * The cached value of the '{@link #getVirtualentity() <em>Virtualentity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualentity()
	 * @generated
	 * @ordered
	 */
	protected VirtualEntity virtualentity;

	/**
	 * The cached value of the '{@link #getIotport() <em>Iotport</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIotport()
	 * @generated
	 * @ordered
	 */
	protected EList<IoTPort> iotport;

	/**
	 * The cached value of the '{@link #getStatemachine() <em>Statemachine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatemachine()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachine> statemachine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSoftwarePackage.Literals.VIRTUAL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getBase_Component() {
		if (base_Component != null && base_Component.eIsProxy()) {
			InternalEObject oldBase_Component = (InternalEObject)base_Component;
			base_Component = (Component)eResolveProxy(oldBase_Component);
			if (base_Component != oldBase_Component) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__BASE_COMPONENT, oldBase_Component, base_Component));
			}
		}
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetBase_Component() {
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Component(Component newBase_Component) {
		Component oldBase_Component = base_Component;
		base_Component = newBase_Component;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__BASE_COMPONENT, oldBase_Component, base_Component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualElement getVirtualelement() {
		if (virtualelement != null && virtualelement.eIsProxy()) {
			InternalEObject oldVirtualelement = (InternalEObject)virtualelement;
			virtualelement = (VirtualElement)eResolveProxy(oldVirtualelement);
			if (virtualelement != oldVirtualelement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__VIRTUALELEMENT, oldVirtualelement, virtualelement));
			}
		}
		return virtualelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualElement basicGetVirtualelement() {
		return virtualelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualelement(VirtualElement newVirtualelement) {
		VirtualElement oldVirtualelement = virtualelement;
		virtualelement = newVirtualelement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__VIRTUALELEMENT, oldVirtualelement, virtualelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualEntity getVirtualentity() {
		if (virtualentity != null && virtualentity.eIsProxy()) {
			InternalEObject oldVirtualentity = (InternalEObject)virtualentity;
			virtualentity = (VirtualEntity)eResolveProxy(oldVirtualentity);
			if (virtualentity != oldVirtualentity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__VIRTUALENTITY, oldVirtualentity, virtualentity));
			}
		}
		return virtualentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualEntity basicGetVirtualentity() {
		return virtualentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualentity(VirtualEntity newVirtualentity) {
		VirtualEntity oldVirtualentity = virtualentity;
		virtualentity = newVirtualentity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__VIRTUALENTITY, oldVirtualentity, virtualentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IoTPort> getIotport() {
		if (iotport == null) {
			iotport = new EObjectResolvingEList<IoTPort>(IoTPort.class, this, CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__IOTPORT);
		}
		return iotport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachine> getStatemachine() {
		if (statemachine == null) {
			statemachine = new EObjectContainmentEList<StateMachine>(StateMachine.class, this, CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__STATEMACHINE);
		}
		return statemachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__STATEMACHINE:
				return ((InternalEList<?>)getStatemachine()).basicRemove(otherEnd, msgs);
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
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__ID:
				return getId();
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__NAME:
				return getName();
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__VIRTUALELEMENT:
				if (resolve) return getVirtualelement();
				return basicGetVirtualelement();
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__VIRTUALENTITY:
				if (resolve) return getVirtualentity();
				return basicGetVirtualentity();
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__IOTPORT:
				return getIotport();
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__STATEMACHINE:
				return getStatemachine();
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
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__ID:
				setId((Integer)newValue);
				return;
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__BASE_COMPONENT:
				setBase_Component((Component)newValue);
				return;
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__VIRTUALELEMENT:
				setVirtualelement((VirtualElement)newValue);
				return;
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__VIRTUALENTITY:
				setVirtualentity((VirtualEntity)newValue);
				return;
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__IOTPORT:
				getIotport().clear();
				getIotport().addAll((Collection<? extends IoTPort>)newValue);
				return;
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__STATEMACHINE:
				getStatemachine().clear();
				getStatemachine().addAll((Collection<? extends StateMachine>)newValue);
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
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__BASE_COMPONENT:
				setBase_Component((Component)null);
				return;
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__VIRTUALELEMENT:
				setVirtualelement((VirtualElement)null);
				return;
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__VIRTUALENTITY:
				setVirtualentity((VirtualEntity)null);
				return;
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__IOTPORT:
				getIotport().clear();
				return;
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__STATEMACHINE:
				getStatemachine().clear();
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
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__ID:
				return id != ID_EDEFAULT;
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__BASE_COMPONENT:
				return base_Component != null;
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__VIRTUALELEMENT:
				return virtualelement != null;
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__VIRTUALENTITY:
				return virtualentity != null;
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__IOTPORT:
				return iotport != null && !iotport.isEmpty();
			case CHESSIoTSoftwarePackage.VIRTUAL_ELEMENT__STATEMACHINE:
				return statemachine != null && !statemachine.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //VirtualElementImpl
