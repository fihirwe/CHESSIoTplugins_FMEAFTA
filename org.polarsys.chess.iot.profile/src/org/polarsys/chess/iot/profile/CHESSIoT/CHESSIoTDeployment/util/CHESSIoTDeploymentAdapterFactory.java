/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Application;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CloudDepAgent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CloudNode;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DataDistributionService;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeploymentAgent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeploymentServer;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceDepAgent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceNode;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.ExternalService;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.FogDepAgent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.FogNode;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.MQTTBroker;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Machine;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Node;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.OnDeviceApp;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Service;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.StorageService;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage
 * @generated
 */
public class CHESSIoTDeploymentAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CHESSIoTDeploymentPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTDeploymentAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CHESSIoTDeploymentPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CHESSIoTDeploymentSwitch<Adapter> modelSwitch =
		new CHESSIoTDeploymentSwitch<Adapter>() {
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseMQTTBroker(MQTTBroker object) {
				return createMQTTBrokerAdapter();
			}
			@Override
			public Adapter caseDeploymentAgent(DeploymentAgent object) {
				return createDeploymentAgentAdapter();
			}
			@Override
			public Adapter caseApplication(Application object) {
				return createApplicationAdapter();
			}
			@Override
			public Adapter caseCloudDepAgent(CloudDepAgent object) {
				return createCloudDepAgentAdapter();
			}
			@Override
			public Adapter caseFogNode(FogNode object) {
				return createFogNodeAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseMachine(Machine object) {
				return createMachineAdapter();
			}
			@Override
			public Adapter caseDeviceNode(DeviceNode object) {
				return createDeviceNodeAdapter();
			}
			@Override
			public Adapter caseOnDeviceApp(OnDeviceApp object) {
				return createOnDeviceAppAdapter();
			}
			@Override
			public Adapter caseCloudNode(CloudNode object) {
				return createCloudNodeAdapter();
			}
			@Override
			public Adapter caseFogDepAgent(FogDepAgent object) {
				return createFogDepAgentAdapter();
			}
			@Override
			public Adapter caseExternalService(ExternalService object) {
				return createExternalServiceAdapter();
			}
			@Override
			public Adapter caseDataDistributionService(DataDistributionService object) {
				return createDataDistributionServiceAdapter();
			}
			@Override
			public Adapter caseStorageService(StorageService object) {
				return createStorageServiceAdapter();
			}
			@Override
			public Adapter caseSystem(org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseDeploymentServer(DeploymentServer object) {
				return createDeploymentServerAdapter();
			}
			@Override
			public Adapter caseDeviceDepAgent(DeviceDepAgent object) {
				return createDeviceDepAgentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.MQTTBroker <em>MQTT Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.MQTTBroker
	 * @generated
	 */
	public Adapter createMQTTBrokerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeploymentAgent <em>Deployment Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeploymentAgent
	 * @generated
	 */
	public Adapter createDeploymentAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CloudDepAgent <em>Cloud Dep Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CloudDepAgent
	 * @generated
	 */
	public Adapter createCloudDepAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.FogNode <em>Fog Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.FogNode
	 * @generated
	 */
	public Adapter createFogNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Machine
	 * @generated
	 */
	public Adapter createMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceNode <em>Device Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceNode
	 * @generated
	 */
	public Adapter createDeviceNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.OnDeviceApp <em>On Device App</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.OnDeviceApp
	 * @generated
	 */
	public Adapter createOnDeviceAppAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CloudNode <em>Cloud Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CloudNode
	 * @generated
	 */
	public Adapter createCloudNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.FogDepAgent <em>Fog Dep Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.FogDepAgent
	 * @generated
	 */
	public Adapter createFogDepAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.ExternalService <em>External Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.ExternalService
	 * @generated
	 */
	public Adapter createExternalServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DataDistributionService <em>Data Distribution Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DataDistributionService
	 * @generated
	 */
	public Adapter createDataDistributionServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.StorageService <em>Storage Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.StorageService
	 * @generated
	 */
	public Adapter createStorageServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeploymentServer <em>Deployment Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeploymentServer
	 * @generated
	 */
	public Adapter createDeploymentServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceDepAgent <em>Device Dep Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceDepAgent
	 * @generated
	 */
	public Adapter createDeviceDepAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CHESSIoTDeploymentAdapterFactory
