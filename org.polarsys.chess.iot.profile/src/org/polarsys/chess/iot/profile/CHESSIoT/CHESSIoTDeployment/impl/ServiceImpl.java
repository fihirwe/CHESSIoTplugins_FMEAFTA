/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.ServiceImpl#getImageURL <em>Image URL</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.ServiceImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.ServiceImpl#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.ServiceImpl#getDepends <em>Depends</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.ServiceImpl#getServicePriority <em>Service Priority</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.ServiceImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.ServiceImpl#getService <em>Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service {
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
	 * The default value of the '{@link #getImageURL() <em>Image URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageURL()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageURL() <em>Image URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageURL()
	 * @generated
	 * @ordered
	 */
	protected String imageURL = IMAGE_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ports;

	/**
	 * The cached value of the '{@link #getVolumes() <em>Volumes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> volumes;

	/**
	 * The cached value of the '{@link #getDepends() <em>Depends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepends()
	 * @generated
	 * @ordered
	 */
	protected Service depends;

	/**
	 * The default value of the '{@link #getServicePriority() <em>Service Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePriority()
	 * @generated
	 * @ordered
	 */
	protected static final int SERVICE_PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getServicePriority() <em>Service Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePriority()
	 * @generated
	 * @ordered
	 */
	protected int servicePriority = SERVICE_PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected Service service;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTDeploymentPackage.Literals.SERVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTDeploymentPackage.SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageURL() {
		return imageURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageURL(String newImageURL) {
		String oldImageURL = imageURL;
		imageURL = newImageURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTDeploymentPackage.SERVICE__IMAGE_URL, oldImageURL, imageURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPorts() {
		if (ports == null) {
			ports = new EDataTypeUniqueEList<String>(String.class, this, CHESSIoTDeploymentPackage.SERVICE__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVolumes() {
		if (volumes == null) {
			volumes = new EDataTypeUniqueEList<String>(String.class, this, CHESSIoTDeploymentPackage.SERVICE__VOLUMES);
		}
		return volumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getDepends() {
		if (depends != null && depends.eIsProxy()) {
			InternalEObject oldDepends = (InternalEObject)depends;
			depends = (Service)eResolveProxy(oldDepends);
			if (depends != oldDepends) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTDeploymentPackage.SERVICE__DEPENDS, oldDepends, depends));
			}
		}
		return depends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetDepends() {
		return depends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepends(Service newDepends) {
		Service oldDepends = depends;
		depends = newDepends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTDeploymentPackage.SERVICE__DEPENDS, oldDepends, depends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getServicePriority() {
		return servicePriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicePriority(int newServicePriority) {
		int oldServicePriority = servicePriority;
		servicePriority = newServicePriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTDeploymentPackage.SERVICE__SERVICE_PRIORITY, oldServicePriority, servicePriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTDeploymentPackage.SERVICE__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTDeploymentPackage.SERVICE__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getService() {
		if (service != null && service.eIsProxy()) {
			InternalEObject oldService = (InternalEObject)service;
			service = (Service)eResolveProxy(oldService);
			if (service != oldService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTDeploymentPackage.SERVICE__SERVICE, oldService, service));
			}
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Service newService) {
		Service oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTDeploymentPackage.SERVICE__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTDeploymentPackage.SERVICE__NAME:
				return getName();
			case CHESSIoTDeploymentPackage.SERVICE__IMAGE_URL:
				return getImageURL();
			case CHESSIoTDeploymentPackage.SERVICE__PORTS:
				return getPorts();
			case CHESSIoTDeploymentPackage.SERVICE__VOLUMES:
				return getVolumes();
			case CHESSIoTDeploymentPackage.SERVICE__DEPENDS:
				if (resolve) return getDepends();
				return basicGetDepends();
			case CHESSIoTDeploymentPackage.SERVICE__SERVICE_PRIORITY:
				return getServicePriority();
			case CHESSIoTDeploymentPackage.SERVICE__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case CHESSIoTDeploymentPackage.SERVICE__SERVICE:
				if (resolve) return getService();
				return basicGetService();
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
			case CHESSIoTDeploymentPackage.SERVICE__NAME:
				setName((String)newValue);
				return;
			case CHESSIoTDeploymentPackage.SERVICE__IMAGE_URL:
				setImageURL((String)newValue);
				return;
			case CHESSIoTDeploymentPackage.SERVICE__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends String>)newValue);
				return;
			case CHESSIoTDeploymentPackage.SERVICE__VOLUMES:
				getVolumes().clear();
				getVolumes().addAll((Collection<? extends String>)newValue);
				return;
			case CHESSIoTDeploymentPackage.SERVICE__DEPENDS:
				setDepends((Service)newValue);
				return;
			case CHESSIoTDeploymentPackage.SERVICE__SERVICE_PRIORITY:
				setServicePriority((Integer)newValue);
				return;
			case CHESSIoTDeploymentPackage.SERVICE__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case CHESSIoTDeploymentPackage.SERVICE__SERVICE:
				setService((Service)newValue);
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
			case CHESSIoTDeploymentPackage.SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CHESSIoTDeploymentPackage.SERVICE__IMAGE_URL:
				setImageURL(IMAGE_URL_EDEFAULT);
				return;
			case CHESSIoTDeploymentPackage.SERVICE__PORTS:
				getPorts().clear();
				return;
			case CHESSIoTDeploymentPackage.SERVICE__VOLUMES:
				getVolumes().clear();
				return;
			case CHESSIoTDeploymentPackage.SERVICE__DEPENDS:
				setDepends((Service)null);
				return;
			case CHESSIoTDeploymentPackage.SERVICE__SERVICE_PRIORITY:
				setServicePriority(SERVICE_PRIORITY_EDEFAULT);
				return;
			case CHESSIoTDeploymentPackage.SERVICE__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case CHESSIoTDeploymentPackage.SERVICE__SERVICE:
				setService((Service)null);
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
			case CHESSIoTDeploymentPackage.SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CHESSIoTDeploymentPackage.SERVICE__IMAGE_URL:
				return IMAGE_URL_EDEFAULT == null ? imageURL != null : !IMAGE_URL_EDEFAULT.equals(imageURL);
			case CHESSIoTDeploymentPackage.SERVICE__PORTS:
				return ports != null && !ports.isEmpty();
			case CHESSIoTDeploymentPackage.SERVICE__VOLUMES:
				return volumes != null && !volumes.isEmpty();
			case CHESSIoTDeploymentPackage.SERVICE__DEPENDS:
				return depends != null;
			case CHESSIoTDeploymentPackage.SERVICE__SERVICE_PRIORITY:
				return servicePriority != SERVICE_PRIORITY_EDEFAULT;
			case CHESSIoTDeploymentPackage.SERVICE__BASE_CLASS:
				return base_Class != null;
			case CHESSIoTDeploymentPackage.SERVICE__SERVICE:
				return service != null;
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
		result.append(", imageURL: ");
		result.append(imageURL);
		result.append(", ports: ");
		result.append(ports);
		result.append(", volumes: ");
		result.append(volumes);
		result.append(", servicePriority: ");
		result.append(servicePriority);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
