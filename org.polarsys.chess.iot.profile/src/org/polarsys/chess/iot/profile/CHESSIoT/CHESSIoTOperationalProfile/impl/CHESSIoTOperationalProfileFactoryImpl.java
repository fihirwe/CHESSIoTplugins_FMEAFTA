/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTOperationalProfile.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CHESSIoTOperationalProfileFactoryImpl extends EFactoryImpl implements CHESSIoTOperationalProfileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CHESSIoTOperationalProfileFactory init() {
		try {
			CHESSIoTOperationalProfileFactory theCHESSIoTOperationalProfileFactory = (CHESSIoTOperationalProfileFactory)EPackage.Registry.INSTANCE.getEFactory(CHESSIoTOperationalProfilePackage.eNS_URI);
			if (theCHESSIoTOperationalProfileFactory != null) {
				return theCHESSIoTOperationalProfileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CHESSIoTOperationalProfileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTOperationalProfileFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CHESSIoTOperationalProfilePackage.SERVICE: return createService();
			case CHESSIoTOperationalProfilePackage.RESOURCE: return createResource();
			case CHESSIoTOperationalProfilePackage.API: return createAPI();
			case CHESSIoTOperationalProfilePackage.CLOUD_SERVER: return createCloudServer();
			case CHESSIoTOperationalProfilePackage.NODE: return createNode();
			case CHESSIoTOperationalProfilePackage.DEVICE_RESOURCES: return createDeviceResources();
			case CHESSIoTOperationalProfilePackage.NETWORK_RESOURCES: return createNetworkResources();
			case CHESSIoTOperationalProfilePackage.APPLICATION: return createApplication();
			case CHESSIoTOperationalProfilePackage.USER: return createUser();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public API createAPI() {
		APIImpl api = new APIImpl();
		return api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudServer createCloudServer() {
		CloudServerImpl cloudServer = new CloudServerImpl();
		return cloudServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceResources createDeviceResources() {
		DeviceResourcesImpl deviceResources = new DeviceResourcesImpl();
		return deviceResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkResources createNetworkResources() {
		NetworkResourcesImpl networkResources = new NetworkResourcesImpl();
		return networkResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTOperationalProfilePackage getCHESSIoTOperationalProfilePackage() {
		return (CHESSIoTOperationalProfilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CHESSIoTOperationalProfilePackage getPackage() {
		return CHESSIoTOperationalProfilePackage.eINSTANCE;
	}

} //CHESSIoTOperationalProfileFactoryImpl
