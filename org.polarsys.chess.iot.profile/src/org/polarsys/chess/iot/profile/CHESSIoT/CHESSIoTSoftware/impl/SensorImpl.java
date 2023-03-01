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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Sensor;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SensorCategory;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SensorType;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SensorImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SensorImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SensorImpl#getPin <em>Pin</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.SensorImpl#getComputingnode <em>Computingnode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorImpl extends VirtualElementImpl implements Sensor {
	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final SensorCategory CATEGORY_EDEFAULT = SensorCategory.TEMP_HUMIDITY;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected SensorCategory category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final SensorType TYPE_EDEFAULT = SensorType.TEMP_DHT11;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SensorType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPin() <em>Pin</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin()
	 * @generated
	 * @ordered
	 */
	protected EList<String> pin;

	/**
	 * The cached value of the '{@link #getComputingnode() <em>Computingnode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputingnode()
	 * @generated
	 * @ordered
	 */
	protected VirtualBoard computingnode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSoftwarePackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorCategory getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(SensorCategory newCategory) {
		SensorCategory oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.SENSOR__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SensorType newType) {
		SensorType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.SENSOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPin() {
		if (pin == null) {
			pin = new EDataTypeUniqueEList<String>(String.class, this, CHESSIoTSoftwarePackage.SENSOR__PIN);
		}
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualBoard getComputingnode() {
		if (computingnode != null && computingnode.eIsProxy()) {
			InternalEObject oldComputingnode = (InternalEObject)computingnode;
			computingnode = (VirtualBoard)eResolveProxy(oldComputingnode);
			if (computingnode != oldComputingnode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.SENSOR__COMPUTINGNODE, oldComputingnode, computingnode));
			}
		}
		return computingnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualBoard basicGetComputingnode() {
		return computingnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComputingnode(VirtualBoard newComputingnode, NotificationChain msgs) {
		VirtualBoard oldComputingnode = computingnode;
		computingnode = newComputingnode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.SENSOR__COMPUTINGNODE, oldComputingnode, newComputingnode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputingnode(VirtualBoard newComputingnode) {
		if (newComputingnode != computingnode) {
			NotificationChain msgs = null;
			if (computingnode != null)
				msgs = ((InternalEObject)computingnode).eInverseRemove(this, CHESSIoTSoftwarePackage.VIRTUAL_BOARD__SENSOR, VirtualBoard.class, msgs);
			if (newComputingnode != null)
				msgs = ((InternalEObject)newComputingnode).eInverseAdd(this, CHESSIoTSoftwarePackage.VIRTUAL_BOARD__SENSOR, VirtualBoard.class, msgs);
			msgs = basicSetComputingnode(newComputingnode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.SENSOR__COMPUTINGNODE, newComputingnode, newComputingnode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.SENSOR__COMPUTINGNODE:
				if (computingnode != null)
					msgs = ((InternalEObject)computingnode).eInverseRemove(this, CHESSIoTSoftwarePackage.VIRTUAL_BOARD__SENSOR, VirtualBoard.class, msgs);
				return basicSetComputingnode((VirtualBoard)otherEnd, msgs);
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
			case CHESSIoTSoftwarePackage.SENSOR__COMPUTINGNODE:
				return basicSetComputingnode(null, msgs);
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
			case CHESSIoTSoftwarePackage.SENSOR__CATEGORY:
				return getCategory();
			case CHESSIoTSoftwarePackage.SENSOR__TYPE:
				return getType();
			case CHESSIoTSoftwarePackage.SENSOR__PIN:
				return getPin();
			case CHESSIoTSoftwarePackage.SENSOR__COMPUTINGNODE:
				if (resolve) return getComputingnode();
				return basicGetComputingnode();
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
			case CHESSIoTSoftwarePackage.SENSOR__CATEGORY:
				setCategory((SensorCategory)newValue);
				return;
			case CHESSIoTSoftwarePackage.SENSOR__TYPE:
				setType((SensorType)newValue);
				return;
			case CHESSIoTSoftwarePackage.SENSOR__PIN:
				getPin().clear();
				getPin().addAll((Collection<? extends String>)newValue);
				return;
			case CHESSIoTSoftwarePackage.SENSOR__COMPUTINGNODE:
				setComputingnode((VirtualBoard)newValue);
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
			case CHESSIoTSoftwarePackage.SENSOR__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case CHESSIoTSoftwarePackage.SENSOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CHESSIoTSoftwarePackage.SENSOR__PIN:
				getPin().clear();
				return;
			case CHESSIoTSoftwarePackage.SENSOR__COMPUTINGNODE:
				setComputingnode((VirtualBoard)null);
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
			case CHESSIoTSoftwarePackage.SENSOR__CATEGORY:
				return category != CATEGORY_EDEFAULT;
			case CHESSIoTSoftwarePackage.SENSOR__TYPE:
				return type != TYPE_EDEFAULT;
			case CHESSIoTSoftwarePackage.SENSOR__PIN:
				return pin != null && !pin.isEmpty();
			case CHESSIoTSoftwarePackage.SENSOR__COMPUTINGNODE:
				return computingnode != null;
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
		result.append(" (category: ");
		result.append(category);
		result.append(", type: ");
		result.append(type);
		result.append(", pin: ");
		result.append(pin);
		result.append(')');
		return result.toString();
	}

} //SensorImpl
