/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Component;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Application;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.OnDeviceApp;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>On Device App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.OnDeviceAppImpl#getLangauge <em>Langauge</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.OnDeviceAppImpl#getBoard <em>Board</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.OnDeviceAppImpl#getOnDeviceResources <em>On Device Resources</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.OnDeviceAppImpl#getBase_Component <em>Base Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OnDeviceAppImpl extends MinimalEObjectImpl.Container implements OnDeviceApp {
	/**
	 * The default value of the '{@link #getLangauge() <em>Langauge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangauge()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGAUGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLangauge() <em>Langauge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangauge()
	 * @generated
	 * @ordered
	 */
	protected String langauge = LANGAUGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBoard() <em>Board</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoard()
	 * @generated
	 * @ordered
	 */
	protected VirtualBoard board;

	/**
	 * The cached value of the '{@link #getOnDeviceResources() <em>On Device Resources</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDeviceResources()
	 * @generated
	 * @ordered
	 */
	protected Application onDeviceResources;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnDeviceAppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTDeploymentPackage.Literals.ON_DEVICE_APP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLangauge() {
		return langauge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLangauge(String newLangauge) {
		String oldLangauge = langauge;
		langauge = newLangauge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTDeploymentPackage.ON_DEVICE_APP__LANGAUGE, oldLangauge, langauge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualBoard getBoard() {
		if (board != null && board.eIsProxy()) {
			InternalEObject oldBoard = (InternalEObject)board;
			board = (VirtualBoard)eResolveProxy(oldBoard);
			if (board != oldBoard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTDeploymentPackage.ON_DEVICE_APP__BOARD, oldBoard, board));
			}
		}
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualBoard basicGetBoard() {
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoard(VirtualBoard newBoard) {
		VirtualBoard oldBoard = board;
		board = newBoard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTDeploymentPackage.ON_DEVICE_APP__BOARD, oldBoard, board));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getOnDeviceResources() {
		if (onDeviceResources != null && onDeviceResources.eIsProxy()) {
			InternalEObject oldOnDeviceResources = (InternalEObject)onDeviceResources;
			onDeviceResources = (Application)eResolveProxy(oldOnDeviceResources);
			if (onDeviceResources != oldOnDeviceResources) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTDeploymentPackage.ON_DEVICE_APP__ON_DEVICE_RESOURCES, oldOnDeviceResources, onDeviceResources));
			}
		}
		return onDeviceResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application basicGetOnDeviceResources() {
		return onDeviceResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnDeviceResources(Application newOnDeviceResources) {
		Application oldOnDeviceResources = onDeviceResources;
		onDeviceResources = newOnDeviceResources;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTDeploymentPackage.ON_DEVICE_APP__ON_DEVICE_RESOURCES, oldOnDeviceResources, onDeviceResources));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTDeploymentPackage.ON_DEVICE_APP__BASE_COMPONENT, oldBase_Component, base_Component));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTDeploymentPackage.ON_DEVICE_APP__BASE_COMPONENT, oldBase_Component, base_Component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTDeploymentPackage.ON_DEVICE_APP__LANGAUGE:
				return getLangauge();
			case CHESSIoTDeploymentPackage.ON_DEVICE_APP__BOARD:
				if (resolve) return getBoard();
				return basicGetBoard();
			case CHESSIoTDeploymentPackage.ON_DEVICE_APP__ON_DEVICE_RESOURCES:
				if (resolve) return getOnDeviceResources();
				return basicGetOnDeviceResources();
			case CHESSIoTDeploymentPackage.ON_DEVICE_APP__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
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
			case CHESSIoTDeploymentPackage.ON_DEVICE_APP__LANGAUGE:
				setLangauge((String)newValue);
				return;
			case CHESSIoTDeploymentPackage.ON_DEVICE_APP__BOARD:
				setBoard((VirtualBoard)newValue);
				return;
			case CHESSIoTDeploymentPackage.ON_DEVICE_APP__ON_DEVICE_RESOURCES:
				setOnDeviceResources((Application)newValue);
				return;
			case CHESSIoTDeploymentPackage.ON_DEVICE_APP__BASE_COMPONENT:
				setBase_Component((Component)newValue);
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
			case CHESSIoTDeploymentPackage.ON_DEVICE_APP__LANGAUGE:
				setLangauge(LANGAUGE_EDEFAULT);
				return;
			case CHESSIoTDeploymentPackage.ON_DEVICE_APP__BOARD:
				setBoard((VirtualBoard)null);
				return;
			case CHESSIoTDeploymentPackage.ON_DEVICE_APP__ON_DEVICE_RESOURCES:
				setOnDeviceResources((Application)null);
				return;
			case CHESSIoTDeploymentPackage.ON_DEVICE_APP__BASE_COMPONENT:
				setBase_Component((Component)null);
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
			case CHESSIoTDeploymentPackage.ON_DEVICE_APP__LANGAUGE:
				return LANGAUGE_EDEFAULT == null ? langauge != null : !LANGAUGE_EDEFAULT.equals(langauge);
			case CHESSIoTDeploymentPackage.ON_DEVICE_APP__BOARD:
				return board != null;
			case CHESSIoTDeploymentPackage.ON_DEVICE_APP__ON_DEVICE_RESOURCES:
				return onDeviceResources != null;
			case CHESSIoTDeploymentPackage.ON_DEVICE_APP__BASE_COMPONENT:
				return base_Component != null;
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
		result.append(" (langauge: ");
		result.append(langauge);
		result.append(')');
		return result.toString();
	}

} //OnDeviceAppImpl
