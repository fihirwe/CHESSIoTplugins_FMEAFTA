/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.sysml.blocks.Block;

import org.eclipse.papyrus.sysml.portandflows.FlowPort;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ActuatingBlock;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Connection;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ConsumerEntity;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ExternalActiveEntity;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ExternalPassiveEntity;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Gateway;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTPort;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalBoard;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalElement;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalEntity;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Server;

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
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage
 * @generated
 */
public class CHESSIoTSystemSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CHESSIoTSystemPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTSystemSwitch() {
		if (modelPackage == null) {
			modelPackage = CHESSIoTSystemPackage.eINSTANCE;
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
			case CHESSIoTSystemPackage.PHYSICAL_BOARD: {
				PhysicalBoard physicalBoard = (PhysicalBoard)theEObject;
				T result = casePhysicalBoard(physicalBoard);
				if (result == null) result = casePhysicalElement(physicalBoard);
				if (result == null) result = caseBlock(physicalBoard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSystemPackage.PHYSICAL_ELEMENT: {
				PhysicalElement physicalElement = (PhysicalElement)theEObject;
				T result = casePhysicalElement(physicalElement);
				if (result == null) result = caseBlock(physicalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSystemPackage.IO_TPORT: {
				IoTPort ioTPort = (IoTPort)theEObject;
				T result = caseIoTPort(ioTPort);
				if (result == null) result = caseFlowPort(ioTPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSystemPackage.GATEWAY: {
				Gateway gateway = (Gateway)theEObject;
				T result = caseGateway(gateway);
				if (result == null) result = casePhysicalElement(gateway);
				if (result == null) result = caseBlock(gateway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSystemPackage.SERVER: {
				Server server = (Server)theEObject;
				T result = caseServer(server);
				if (result == null) result = caseBlock(server);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSystemPackage.ACTUATING_BLOCK: {
				ActuatingBlock actuatingBlock = (ActuatingBlock)theEObject;
				T result = caseActuatingBlock(actuatingBlock);
				if (result == null) result = casePhysicalElement(actuatingBlock);
				if (result == null) result = caseBlock(actuatingBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSystemPackage.PHYSICAL_ENTITY: {
				PhysicalEntity physicalEntity = (PhysicalEntity)theEObject;
				T result = casePhysicalEntity(physicalEntity);
				if (result == null) result = casePhysicalElement(physicalEntity);
				if (result == null) result = caseBlock(physicalEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSystemPackage.SENSOR_BLOCK: {
				SensorBlock sensorBlock = (SensorBlock)theEObject;
				T result = caseSensorBlock(sensorBlock);
				if (result == null) result = casePhysicalElement(sensorBlock);
				if (result == null) result = caseBlock(sensorBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSystemPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSystemPackage.SYSTEM: {
				org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.System system = (org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = caseBlock(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSystemPackage.CONSUMER_ENTITY: {
				ConsumerEntity consumerEntity = (ConsumerEntity)theEObject;
				T result = caseConsumerEntity(consumerEntity);
				if (result == null) result = caseBlock(consumerEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSystemPackage.EXTERNAL_ACTIVE_ENTITY: {
				ExternalActiveEntity externalActiveEntity = (ExternalActiveEntity)theEObject;
				T result = caseExternalActiveEntity(externalActiveEntity);
				if (result == null) result = caseConsumerEntity(externalActiveEntity);
				if (result == null) result = caseBlock(externalActiveEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CHESSIoTSystemPackage.EXTERNAL_PASSIVE_ENTITY: {
				ExternalPassiveEntity externalPassiveEntity = (ExternalPassiveEntity)theEObject;
				T result = caseExternalPassiveEntity(externalPassiveEntity);
				if (result == null) result = caseConsumerEntity(externalPassiveEntity);
				if (result == null) result = caseBlock(externalPassiveEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Board</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Board</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalBoard(PhysicalBoard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalElement(PhysicalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Io TPort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Io TPort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIoTPort(IoTPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGateway(Gateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServer(Server object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuating Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuating Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuatingBlock(ActuatingBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalEntity(PhysicalEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensorBlock(SensorBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
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
	public T caseSystem(org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consumer Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consumer Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsumerEntity(ConsumerEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Active Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Active Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalActiveEntity(ExternalActiveEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Passive Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Passive Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalPassiveEntity(ExternalPassiveEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowPort(FlowPort object) {
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

} //CHESSIoTSystemSwitch
