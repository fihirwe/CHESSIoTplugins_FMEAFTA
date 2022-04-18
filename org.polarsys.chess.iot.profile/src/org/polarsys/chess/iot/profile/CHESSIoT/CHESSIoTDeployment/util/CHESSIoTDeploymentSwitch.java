/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CloudNode;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CloudOrchestrator;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Container;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DataDistributionService;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceNode;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceResources;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.EndUserApplication;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.ExternalService;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.FogNode;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.FogOrchestrator;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.MQTTBroker;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Node;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.OrchestratingAgent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.OrchestratingServer;
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
			case CHESSIoTDeploymentPackage.ORCHESTRATING_AGENT: {
				OrchestratingAgent orchestratingAgent = (OrchestratingAgent)theEObject;
				T result = caseOrchestratingAgent(orchestratingAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTDeploymentPackage.END_USER_APPLICATION: {
				EndUserApplication endUserApplication = (EndUserApplication)theEObject;
				T result = caseEndUserApplication(endUserApplication);
				if (result == null) result = caseService(endUserApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTDeploymentPackage.CLOUD_ORCHESTRATOR: {
				CloudOrchestrator cloudOrchestrator = (CloudOrchestrator)theEObject;
				T result = caseCloudOrchestrator(cloudOrchestrator);
				if (result == null) result = caseOrchestratingAgent(cloudOrchestrator);
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
			case CHESSIoTDeploymentPackage.DEVICE_NODE: {
				DeviceNode deviceNode = (DeviceNode)theEObject;
				T result = caseDeviceNode(deviceNode);
				if (result == null) result = caseNode(deviceNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTDeploymentPackage.DEVICE_RESOURCES: {
				DeviceResources deviceResources = (DeviceResources)theEObject;
				T result = caseDeviceResources(deviceResources);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTDeploymentPackage.FOG_ORCHESTRATOR: {
				FogOrchestrator fogOrchestrator = (FogOrchestrator)theEObject;
				T result = caseFogOrchestrator(fogOrchestrator);
				if (result == null) result = caseOrchestratingAgent(fogOrchestrator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTDeploymentPackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
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
			case CHESSIoTDeploymentPackage.ORCHESTRATING_SERVER: {
				OrchestratingServer orchestratingServer = (OrchestratingServer)theEObject;
				T result = caseOrchestratingServer(orchestratingServer);
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
	 * Returns the result of interpreting the object as an instance of '<em>Orchestrating Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orchestrating Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrchestratingAgent(OrchestratingAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End User Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End User Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndUserApplication(EndUserApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Orchestrator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Orchestrator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudOrchestrator(CloudOrchestrator object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Device Resources</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Resources</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceResources(DeviceResources object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fog Orchestrator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fog Orchestrator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFogOrchestrator(FogOrchestrator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Orchestrating Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orchestrating Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrchestratingServer(OrchestratingServer object) {
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
