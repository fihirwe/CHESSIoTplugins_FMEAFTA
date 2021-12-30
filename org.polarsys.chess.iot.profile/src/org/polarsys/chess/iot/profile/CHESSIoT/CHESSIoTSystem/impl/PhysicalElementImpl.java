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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PhysicalElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PhysicalElementImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PhysicalElementImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PhysicalElementImpl#getBase_Block <em>Base Block</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.PhysicalElementImpl#getIotport <em>Iotport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalElementImpl extends MinimalEObjectImpl.Container implements PhysicalElement {
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
	 * The default value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final String LATITUDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected String latitude = LATITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final String LONGITUDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected String longitude = LONGITUDE_EDEFAULT;

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
	 * The cached value of the '{@link #getIotport() <em>Iotport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIotport()
	 * @generated
	 * @ordered
	 */
	protected IoTPort iotport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSystemPackage.Literals.PHYSICAL_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.PHYSICAL_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatitude(String newLatitude) {
		String oldLatitude = latitude;
		latitude = newLatitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.PHYSICAL_ELEMENT__LATITUDE, oldLatitude, latitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLongitude() {
		return longitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitude(String newLongitude) {
		String oldLongitude = longitude;
		longitude = newLongitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.PHYSICAL_ELEMENT__LONGITUDE, oldLongitude, longitude));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSystemPackage.PHYSICAL_ELEMENT__BASE_BLOCK, oldBase_Block, base_Block));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.PHYSICAL_ELEMENT__BASE_BLOCK, oldBase_Block, base_Block));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.PHYSICAL_ELEMENT__IOTPORT, oldIotport, newIotport);
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
				msgs = ((InternalEObject)iotport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CHESSIoTSystemPackage.PHYSICAL_ELEMENT__IOTPORT, null, msgs);
			if (newIotport != null)
				msgs = ((InternalEObject)newIotport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CHESSIoTSystemPackage.PHYSICAL_ELEMENT__IOTPORT, null, msgs);
			msgs = basicSetIotport(newIotport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSystemPackage.PHYSICAL_ELEMENT__IOTPORT, newIotport, newIotport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CHESSIoTSystemPackage.PHYSICAL_ELEMENT__IOTPORT:
				return basicSetIotport(null, msgs);
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
			case CHESSIoTSystemPackage.PHYSICAL_ELEMENT__NAME:
				return getName();
			case CHESSIoTSystemPackage.PHYSICAL_ELEMENT__LATITUDE:
				return getLatitude();
			case CHESSIoTSystemPackage.PHYSICAL_ELEMENT__LONGITUDE:
				return getLongitude();
			case CHESSIoTSystemPackage.PHYSICAL_ELEMENT__BASE_BLOCK:
				if (resolve) return getBase_Block();
				return basicGetBase_Block();
			case CHESSIoTSystemPackage.PHYSICAL_ELEMENT__IOTPORT:
				return getIotport();
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
			case CHESSIoTSystemPackage.PHYSICAL_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case CHESSIoTSystemPackage.PHYSICAL_ELEMENT__LATITUDE:
				setLatitude((String)newValue);
				return;
			case CHESSIoTSystemPackage.PHYSICAL_ELEMENT__LONGITUDE:
				setLongitude((String)newValue);
				return;
			case CHESSIoTSystemPackage.PHYSICAL_ELEMENT__BASE_BLOCK:
				setBase_Block((Block)newValue);
				return;
			case CHESSIoTSystemPackage.PHYSICAL_ELEMENT__IOTPORT:
				setIotport((IoTPort)newValue);
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
			case CHESSIoTSystemPackage.PHYSICAL_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CHESSIoTSystemPackage.PHYSICAL_ELEMENT__LATITUDE:
				setLatitude(LATITUDE_EDEFAULT);
				return;
			case CHESSIoTSystemPackage.PHYSICAL_ELEMENT__LONGITUDE:
				setLongitude(LONGITUDE_EDEFAULT);
				return;
			case CHESSIoTSystemPackage.PHYSICAL_ELEMENT__BASE_BLOCK:
				setBase_Block((Block)null);
				return;
			case CHESSIoTSystemPackage.PHYSICAL_ELEMENT__IOTPORT:
				setIotport((IoTPort)null);
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
			case CHESSIoTSystemPackage.PHYSICAL_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CHESSIoTSystemPackage.PHYSICAL_ELEMENT__LATITUDE:
				return LATITUDE_EDEFAULT == null ? latitude != null : !LATITUDE_EDEFAULT.equals(latitude);
			case CHESSIoTSystemPackage.PHYSICAL_ELEMENT__LONGITUDE:
				return LONGITUDE_EDEFAULT == null ? longitude != null : !LONGITUDE_EDEFAULT.equals(longitude);
			case CHESSIoTSystemPackage.PHYSICAL_ELEMENT__BASE_BLOCK:
				return base_Block != null;
			case CHESSIoTSystemPackage.PHYSICAL_ELEMENT__IOTPORT:
				return iotport != null;
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
		result.append(", latitude: ");
		result.append(latitude);
		result.append(", longitude: ");
		result.append(longitude);
		result.append(')');
		return result.toString();
	}

} //PhysicalElementImpl
