/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CHESSIoTDeploymentFactoryImpl extends EFactoryImpl implements CHESSIoTDeploymentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CHESSIoTDeploymentFactory init() {
		try {
			CHESSIoTDeploymentFactory theCHESSIoTDeploymentFactory = (CHESSIoTDeploymentFactory)EPackage.Registry.INSTANCE.getEFactory(CHESSIoTDeploymentPackage.eNS_URI);
			if (theCHESSIoTDeploymentFactory != null) {
				return theCHESSIoTDeploymentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CHESSIoTDeploymentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHESSIoTDeploymentFactoryImpl() {
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
			case CHESSIoTDeploymentPackage.SENSOR_UNIT: return createSensorUnit();
			case CHESSIoTDeploymentPackage.ACTUATOR_UNIT: return createActuatorUnit();
			case CHESSIoTDeploymentPackage.PHYSICAL_BAORD: return createPhysicalBaord();
			case CHESSIoTDeploymentPackage.SYSTEM_HW: return createSystemHW();
			case CHESSIoTDeploymentPackage.PORT_IN: return createportIn();
			case CHESSIoTDeploymentPackage.IO_TPORT: return createIoTPort();
			case CHESSIoTDeploymentPackage.PORT_OUT: return createportOut();
			case CHESSIoTDeploymentPackage.TAG_UNIT: return createTagUnit();
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
			case CHESSIoTDeploymentPackage.PORT_TYPE:
				return createPortTypeFromString(eDataType, initialValue);
			case CHESSIoTDeploymentPackage.SENSOR_TYPE:
				return createSensorTypeFromString(eDataType, initialValue);
			case CHESSIoTDeploymentPackage.ACTUATOR_TYPE:
				return createActuatorTypeFromString(eDataType, initialValue);
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
			case CHESSIoTDeploymentPackage.PORT_TYPE:
				return convertPortTypeToString(eDataType, instanceValue);
			case CHESSIoTDeploymentPackage.SENSOR_TYPE:
				return convertSensorTypeToString(eDataType, instanceValue);
			case CHESSIoTDeploymentPackage.ACTUATOR_TYPE:
				return convertActuatorTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorUnit createSensorUnit() {
		SensorUnitImpl sensorUnit = new SensorUnitImpl();
		return sensorUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorUnit createActuatorUnit() {
		ActuatorUnitImpl actuatorUnit = new ActuatorUnitImpl();
		return actuatorUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalBaord createPhysicalBaord() {
		PhysicalBaordImpl physicalBaord = new PhysicalBaordImpl();
		return physicalBaord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemHW createSystemHW() {
		SystemHWImpl systemHW = new SystemHWImpl();
		return systemHW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public portIn createportIn() {
		portInImpl portIn = new portInImpl();
		return portIn;
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
	public portOut createportOut() {
		portOutImpl portOut = new portOutImpl();
		return portOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagUnit createTagUnit() {
		TagUnitImpl tagUnit = new TagUnitImpl();
		return tagUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType createPortTypeFromString(EDataType eDataType, String initialValue) {
		PortType result = PortType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortTypeToString(EDataType eDataType, Object instanceValue) {
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
	public CHESSIoTDeploymentPackage getCHESSIoTDeploymentPackage() {
		return (CHESSIoTDeploymentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CHESSIoTDeploymentPackage getPackage() {
		return CHESSIoTDeploymentPackage.eINSTANCE;
	}

} //CHESSIoTDeploymentFactoryImpl
