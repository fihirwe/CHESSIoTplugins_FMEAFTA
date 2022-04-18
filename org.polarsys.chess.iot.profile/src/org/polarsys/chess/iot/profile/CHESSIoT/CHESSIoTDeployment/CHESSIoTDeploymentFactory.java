/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage
 * @generated
 */
public interface CHESSIoTDeploymentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CHESSIoTDeploymentFactory eINSTANCE = org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl.CHESSIoTDeploymentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>MQTT Broker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MQTT Broker</em>'.
	 * @generated
	 */
	MQTTBroker createMQTTBroker();

	/**
	 * Returns a new object of class '<em>Orchestrating Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orchestrating Agent</em>'.
	 * @generated
	 */
	OrchestratingAgent createOrchestratingAgent();

	/**
	 * Returns a new object of class '<em>End User Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End User Application</em>'.
	 * @generated
	 */
	EndUserApplication createEndUserApplication();

	/**
	 * Returns a new object of class '<em>Cloud Orchestrator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Orchestrator</em>'.
	 * @generated
	 */
	CloudOrchestrator createCloudOrchestrator();

	/**
	 * Returns a new object of class '<em>Fog Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fog Node</em>'.
	 * @generated
	 */
	FogNode createFogNode();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Device Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Node</em>'.
	 * @generated
	 */
	DeviceNode createDeviceNode();

	/**
	 * Returns a new object of class '<em>Device Resources</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Resources</em>'.
	 * @generated
	 */
	DeviceResources createDeviceResources();

	/**
	 * Returns a new object of class '<em>Fog Orchestrator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fog Orchestrator</em>'.
	 * @generated
	 */
	FogOrchestrator createFogOrchestrator();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	Container createContainer();

	/**
	 * Returns a new object of class '<em>Cloud Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Node</em>'.
	 * @generated
	 */
	CloudNode createCloudNode();

	/**
	 * Returns a new object of class '<em>External Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Service</em>'.
	 * @generated
	 */
	ExternalService createExternalService();

	/**
	 * Returns a new object of class '<em>Data Distribution Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Distribution Service</em>'.
	 * @generated
	 */
	DataDistributionService createDataDistributionService();

	/**
	 * Returns a new object of class '<em>Storage Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Service</em>'.
	 * @generated
	 */
	StorageService createStorageService();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>Orchestrating Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orchestrating Server</em>'.
	 * @generated
	 */
	OrchestratingServer createOrchestratingServer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CHESSIoTDeploymentPackage getCHESSIoTDeploymentPackage();

} //CHESSIoTDeploymentFactory
