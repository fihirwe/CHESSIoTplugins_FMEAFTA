/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage
 * @generated
 */
public class CHESSIoTDeploymentSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CHESSIoTDeploymentPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTDeploymentSwitch() {
		if (modelPackage == null) {
			modelPackage = CHESSIoTDeploymentPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CHESSIoTDeploymentPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTDeploymentPackage.MQTT_BROKER: {
				MQTTBroker mqttBroker = (MQTTBroker)theEObject;
				T result = caseMQTTBroker(mqttBroker);
				if (result == null) result = caseService(mqttBroker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTDeploymentPackage.DEPLOYMENT_AGENT: {
				DeploymentAgent deploymentAgent = (DeploymentAgent)theEObject;
				T result = caseDeploymentAgent(deploymentAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTDeploymentPackage.APPLICATION: {
				Application application = (Application)theEObject;
				T result = caseApplication(application);
				if (result == null) result = caseService(application);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTDeploymentPackage.CLOUD_DEP_AGENT: {
				CloudDepAgent cloudDepAgent = (CloudDepAgent)theEObject;
				T result = caseCloudDepAgent(cloudDepAgent);
				if (result == null) result = caseDeploymentAgent(cloudDepAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTDeploymentPackage.FOG_NODE: {
				FogNode fogNode = (FogNode)theEObject;
				T result = caseFogNode(fogNode);
				if (result == null) result = caseNode(fogNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTDeploymentPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTDeploymentPackage.MACHINE: {
				Machine machine = (Machine)theEObject;
				T result = caseMachine(machine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTDeploymentPackage.DEVICE_NODE: {
				DeviceNode deviceNode = (DeviceNode)theEObject;
				T result = caseDeviceNode(deviceNode);
				if (result == null) result = caseNode(deviceNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTDeploymentPackage.ON_DEVICE_APP: {
				OnDeviceApp onDeviceApp = (OnDeviceApp)theEObject;
				T result = caseOnDeviceApp(onDeviceApp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTDeploymentPackage.CLOUD_NODE: {
				CloudNode cloudNode = (CloudNode)theEObject;
				T result = caseCloudNode(cloudNode);
				if (result == null) result = caseNode(cloudNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTDeploymentPackage.FOG_DEP_AGENT: {
				FogDepAgent fogDepAgent = (FogDepAgent)theEObject;
				T result = caseFogDepAgent(fogDepAgent);
				if (result == null) result = caseDeploymentAgent(fogDepAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTDeploymentPackage.EXTERNAL_SERVICE: {
				ExternalService externalService = (ExternalService)theEObject;
				T result = caseExternalService(externalService);
				if (result == null) result = caseService(externalService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTDeploymentPackage.DATA_DISTRIBUTION_SERVICE: {
				DataDistributionService dataDistributionService = (DataDistributionService)theEObject;
				T result = caseDataDistributionService(dataDistributionService);
				if (result == null) result = caseService(dataDistributionService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTDeploymentPackage.STORAGE_SERVICE: {
				StorageService storageService = (StorageService)theEObject;
				T result = caseStorageService(storageService);
				if (result == null) result = caseService(storageService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTDeploymentPackage.SYSTEM: {
				org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.System system = (org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTDeploymentPackage.DEPLOYMENT_SERVER: {
				DeploymentServer deploymentServer = (DeploymentServer)theEObject;
				T result = caseDeploymentServer(deploymentServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTDeploymentPackage.DEVICE_DEP_AGENT: {
				DeviceDepAgent deviceDepAgent = (DeviceDepAgent)theEObject;
				T result = caseDeviceDepAgent(deviceDepAgent);
				if (result == null) result = caseDeploymentAgent(deviceDepAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MQTT Broker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MQTT Broker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMQTTBroker(MQTTBroker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentAgent(DeploymentAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplication(Application object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Dep Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Dep Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudDepAgent(CloudDepAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fog Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fog Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFogNode(FogNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine(Machine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceNode(DeviceNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Device App</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Device App</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnDeviceApp(OnDeviceApp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudNode(CloudNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fog Dep Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fog Dep Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFogDepAgent(FogDepAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalService(ExternalService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Distribution Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Distribution Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataDistributionService(DataDistributionService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageService(StorageService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentServer(DeploymentServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Dep Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Dep Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceDepAgent(DeviceDepAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CHESSIoTDeploymentSwitch
