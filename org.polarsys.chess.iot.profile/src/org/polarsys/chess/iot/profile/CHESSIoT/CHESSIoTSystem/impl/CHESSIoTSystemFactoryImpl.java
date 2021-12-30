/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.*;

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
			case CHESSIoTSystemPackage.COMPUTING_BOARD: return createComputingBoard();
			case CHESSIoTSystemPackage.PHYSICAL_ELEMENT: return createPhysicalElement();
			case CHESSIoTSystemPackage.IO_TPORT: return createIoTPort();
			case CHESSIoTSystemPackage.GATEWAY: return createGateway();
			case CHESSIoTSystemPackage.SERVER: return createServer();
			case CHESSIoTSystemPackage.ACTUATING_BLOCK: return createActuatingBlock();
			case CHESSIoTSystemPackage.PHYSICAL_ENTITY: return createPhysicalEntity();
			case CHESSIoTSystemPackage.SENSOR_BLOCK: return createSensorBlock();
			case CHESSIoTSystemPackage.CONNECTION: return createConnection();
			case CHESSIoTSystemPackage.SYSTEM_HW: return createSYSTEM_Hw();
			case CHESSIoTSystemPackage.CONSUMER_ENTITY: return createConsumerEntity();
			case CHESSIoTSystemPackage.ACTIVE: return createActive();
			case CHESSIoTSystemPackage.PASSIVE: return createPassive();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CHESSIoTSystemPackage.NODE_MODEL:
				return createNodeModelFromString(eDataType, initialValue);
			case CHESSIoTSystemPackage.ACTUATOR_TYPE:
				return createActuatorTypeFromString(eDataType, initialValue);
			case CHESSIoTSystemPackage.SENSOR_TYPE:
				return createSensorTypeFromString(eDataType, initialValue);
			case CHESSIoTSystemPackage.COMMUNICATION_MODE:
				return createCommunicationModeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CHESSIoTSystemPackage.NODE_MODEL:
				return convertNodeModelToString(eDataType, instanceValue);
			case CHESSIoTSystemPackage.ACTUATOR_TYPE:
				return convertActuatorTypeToString(eDataType, instanceValue);
			case CHESSIoTSystemPackage.SENSOR_TYPE:
				return convertSensorTypeToString(eDataType, instanceValue);
			case CHESSIoTSystemPackage.COMMUNICATION_MODE:
				return convertCommunicationModeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputingBoard createComputingBoard() {
		ComputingBoardImpl computingBoard = new ComputingBoardImpl();
		return computingBoard;
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
	public SYSTEM_Hw createSYSTEM_Hw() {
		SYSTEM_HwImpl systeM_Hw = new SYSTEM_HwImpl();
		return systeM_Hw;
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
	public Active createActive() {
		ActiveImpl active = new ActiveImpl();
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Passive createPassive() {
		PassiveImpl passive = new PassiveImpl();
		return passive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeModel createNodeModelFromString(EDataType eDataType, String initialValue) {
		NodeModel result = NodeModel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeModelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorType createActuatorTypeFromString(EDataType eDataType, String initialValue) {
		ActuatorType result = ActuatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActuatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorType createSensorTypeFromString(EDataType eDataType, String initialValue) {
		SensorType result = SensorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSensorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationMode createCommunicationModeFromString(EDataType eDataType, String initialValue) {
		CommunicationMode result = CommunicationMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
