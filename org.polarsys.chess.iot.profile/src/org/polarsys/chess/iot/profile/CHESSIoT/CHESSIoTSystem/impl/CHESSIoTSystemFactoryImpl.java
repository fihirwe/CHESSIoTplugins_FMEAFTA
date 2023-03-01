/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ActuatingBlock;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemFactory;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CHESSIoTSystemFactoryImpl extends EFactoryImpl implements CHESSIoTSystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CHESSIoTSystemFactory init() {
		try {
			CHESSIoTSystemFactory theCHESSIoTSystemFactory = (CHESSIoTSystemFactory)EPackage.Registry.INSTANCE.getEFactory(CHESSIoTSystemPackage.eNS_URI);
			if (theCHESSIoTSystemFactory != null) {
				return theCHESSIoTSystemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CHESSIoTSystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTSystemFactoryImpl() {
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
			case CHESSIoTSystemPackage.PHYSICAL_BOARD: return createPhysicalBoard();
			case CHESSIoTSystemPackage.PHYSICAL_ELEMENT: return createPhysicalElement();
			case CHESSIoTSystemPackage.IO_TPORT: return createIoTPort();
			case CHESSIoTSystemPackage.GATEWAY: return createGateway();
			case CHESSIoTSystemPackage.SERVER: return createServer();
			case CHESSIoTSystemPackage.ACTUATING_BLOCK: return createActuatingBlock();
			case CHESSIoTSystemPackage.PHYSICAL_ENTITY: return createPhysicalEntity();
			case CHESSIoTSystemPackage.SENSOR_BLOCK: return createSensorBlock();
			case CHESSIoTSystemPackage.CONNECTION: return createConnection();
			case CHESSIoTSystemPackage.SYSTEM: return createSystem();
			case CHESSIoTSystemPackage.CONSUMER_ENTITY: return createConsumerEntity();
			case CHESSIoTSystemPackage.EXTERNAL_ACTIVE_ENTITY: return createExternalActiveEntity();
			case CHESSIoTSystemPackage.EXTERNAL_PASSIVE_ENTITY: return createExternalPassiveEntity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalBoard createPhysicalBoard() {
		PhysicalBoardImpl physicalBoard = new PhysicalBoardImpl();
		return physicalBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalElement createPhysicalElement() {
		PhysicalElementImpl physicalElement = new PhysicalElementImpl();
		return physicalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTPort createIoTPort() {
		IoTPortImpl ioTPort = new IoTPortImpl();
		return ioTPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gateway createGateway() {
		GatewayImpl gateway = new GatewayImpl();
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server createServer() {
		ServerImpl server = new ServerImpl();
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatingBlock createActuatingBlock() {
		ActuatingBlockImpl actuatingBlock = new ActuatingBlockImpl();
		return actuatingBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalEntity createPhysicalEntity() {
		PhysicalEntityImpl physicalEntity = new PhysicalEntityImpl();
		return physicalEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorBlock createSensorBlock() {
		SensorBlockImpl sensorBlock = new SensorBlockImpl();
		return sensorBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsumerEntity createConsumerEntity() {
		ConsumerEntityImpl consumerEntity = new ConsumerEntityImpl();
		return consumerEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalActiveEntity createExternalActiveEntity() {
		ExternalActiveEntityImpl externalActiveEntity = new ExternalActiveEntityImpl();
		return externalActiveEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalPassiveEntity createExternalPassiveEntity() {
		ExternalPassiveEntityImpl externalPassiveEntity = new ExternalPassiveEntityImpl();
		return externalPassiveEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTSystemPackage getCHESSIoTSystemPackage() {
		return (CHESSIoTSystemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CHESSIoTSystemPackage getPackage() {
		return CHESSIoTSystemPackage.eINSTANCE;
	}

} //CHESSIoTSystemFactoryImpl
