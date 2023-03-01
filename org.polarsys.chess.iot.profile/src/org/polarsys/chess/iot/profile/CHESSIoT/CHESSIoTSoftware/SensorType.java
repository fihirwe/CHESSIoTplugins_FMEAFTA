/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sensor Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getSensorType()
 * @model
 * @generated
 */
public enum SensorType implements Enumerator {
	/**
	 * The '<em><b>Temp DHT11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMP_DHT11_VALUE
	 * @generated
	 * @ordered
	 */
	TEMP_DHT11(0, "temp_DHT11", "temp_DHT11"),

	/**
	 * The '<em><b>Temp DHT22</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMP_DHT22_VALUE
	 * @generated
	 * @ordered
	 */
	TEMP_DHT22(1, "temp_DHT22", "temp_DHT22"),

	/**
	 * The '<em><b>Gaz MQ2 Methane Butane LPG smoke</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAZ_MQ2_METHANE_BUTANE_LPG_SMOKE_VALUE
	 * @generated
	 * @ordered
	 */
	GAZ_MQ2_METHANE_BUTANE_LPG_SMOKE(2, "gaz_MQ2_Methane_Butane_LPG_smoke", "gaz_MQ2_Methane_Butane_LPG_smoke"),

	/**
	 * The '<em><b>Gaz MQ3 Alcohol Ethanol smoke</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAZ_MQ3_ALCOHOL_ETHANOL_SMOKE_VALUE
	 * @generated
	 * @ordered
	 */
	GAZ_MQ3_ALCOHOL_ETHANOL_SMOKE(3, "gaz_MQ3_Alcohol_Ethanol_smoke", "gaz_MQ3_Alcohol_Ethanol_smoke"),

	/**
	 * The '<em><b>Gaz MQ4 Methane CNG Gas</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAZ_MQ4_METHANE_CNG_GAS_VALUE
	 * @generated
	 * @ordered
	 */
	GAZ_MQ4_METHANE_CNG_GAS(4, "gaz_MQ4_Methane_CNG_Gas", "gaz_MQ4_Methane_CNG_Gas"),

	/**
	 * The '<em><b>Gaz MQ5 Natural gas LPG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAZ_MQ5_NATURAL_GAS_LPG_VALUE
	 * @generated
	 * @ordered
	 */
	GAZ_MQ5_NATURAL_GAS_LPG(5, "gaz_MQ5_Natural_gas_LPG", "gaz_MQ5_Natural_gas_LPG"),

	/**
	 * The '<em><b>Gaz MQ6 LPG butane gas</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAZ_MQ6_LPG_BUTANE_GAS_VALUE
	 * @generated
	 * @ordered
	 */
	GAZ_MQ6_LPG_BUTANE_GAS(6, "gaz_MQ6_LPG_butane_gas", "gaz_MQ6_LPG_butane_gas"),

	/**
	 * The '<em><b>Gaz MQ7 Carbon Monoxide</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAZ_MQ7_CARBON_MONOXIDE_VALUE
	 * @generated
	 * @ordered
	 */
	GAZ_MQ7_CARBON_MONOXIDE(7, "gaz_MQ7_Carbon_Monoxide", "gaz_MQ7_Carbon_Monoxide"),

	/**
	 * The '<em><b>Gaz MQ8 Hydrogen Gas</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAZ_MQ8_HYDROGEN_GAS_VALUE
	 * @generated
	 * @ordered
	 */
	GAZ_MQ8_HYDROGEN_GAS(8, "gaz_MQ8_Hydrogen_Gas", "gaz_MQ8_Hydrogen_Gas"),

	/**
	 * The '<em><b>Gaz MQ9 Carbon Monoxide flammable gasses</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAZ_MQ9_CARBON_MONOXIDE_FLAMMABLE_GASSES_VALUE
	 * @generated
	 * @ordered
	 */
	GAZ_MQ9_CARBON_MONOXIDE_FLAMMABLE_GASSES(9, "gaz_MQ9_Carbon_Monoxide_flammable_gasses", "gaz_MQ9_Carbon_Monoxide_flammable_gasses"),

	/**
	 * The '<em><b>Pressure BMP280</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESSURE_BMP280_VALUE
	 * @generated
	 * @ordered
	 */
	PRESSURE_BMP280(10, "pressure_BMP280", "pressure_BMP280"),

	/**
	 * The '<em><b>Pressure Dps310 Barometric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESSURE_DPS310_BAROMETRIC_VALUE
	 * @generated
	 * @ordered
	 */
	PRESSURE_DPS310_BAROMETRIC(11, "pressure_Dps310_Barometric", "pressure_Dps310_Barometric"),

	/**
	 * The '<em><b>Motion HCSR501 PIR sensor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTION_HCSR501_PIR_SENSOR_VALUE
	 * @generated
	 * @ordered
	 */
	MOTION_HCSR501_PIR_SENSOR(12, "motion_HCSR501_PIR_sensor", "motion_HCSR501_PIR_sensor"),

	/**
	 * The '<em><b>Ultrasonic HCSR04 ultrasonic sensor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ULTRASONIC_HCSR04_ULTRASONIC_SENSOR_VALUE
	 * @generated
	 * @ordered
	 */
	ULTRASONIC_HCSR04_ULTRASONIC_SENSOR(13, "ultrasonic_HCSR04_ultrasonic_sensor", "ultrasonic_HCSR04_ultrasonic_sensor"),

	/**
	 * The '<em><b>Light LDR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHT_LDR_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHT_LDR(14, "light_LDR", "light_LDR"),

	/**
	 * The '<em><b>Light TSL235R</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHT_TSL235R_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHT_TSL235R(15, "light_TSL235R", "light_TSL235R");

	/**
	 * The '<em><b>Temp DHT11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Temp DHT11</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMP_DHT11
	 * @model name="temp_DHT11"
	 * @generated
	 * @ordered
	 */
	public static final int TEMP_DHT11_VALUE = 0;

	/**
	 * The '<em><b>Temp DHT22</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Temp DHT22</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMP_DHT22
	 * @model name="temp_DHT22"
	 * @generated
	 * @ordered
	 */
	public static final int TEMP_DHT22_VALUE = 1;

	/**
	 * The '<em><b>Gaz MQ2 Methane Butane LPG smoke</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gaz MQ2 Methane Butane LPG smoke</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GAZ_MQ2_METHANE_BUTANE_LPG_SMOKE
	 * @model name="gaz_MQ2_Methane_Butane_LPG_smoke"
	 * @generated
	 * @ordered
	 */
	public static final int GAZ_MQ2_METHANE_BUTANE_LPG_SMOKE_VALUE = 2;

	/**
	 * The '<em><b>Gaz MQ3 Alcohol Ethanol smoke</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gaz MQ3 Alcohol Ethanol smoke</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GAZ_MQ3_ALCOHOL_ETHANOL_SMOKE
	 * @model name="gaz_MQ3_Alcohol_Ethanol_smoke"
	 * @generated
	 * @ordered
	 */
	public static final int GAZ_MQ3_ALCOHOL_ETHANOL_SMOKE_VALUE = 3;

	/**
	 * The '<em><b>Gaz MQ4 Methane CNG Gas</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gaz MQ4 Methane CNG Gas</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GAZ_MQ4_METHANE_CNG_GAS
	 * @model name="gaz_MQ4_Methane_CNG_Gas"
	 * @generated
	 * @ordered
	 */
	public static final int GAZ_MQ4_METHANE_CNG_GAS_VALUE = 4;

	/**
	 * The '<em><b>Gaz MQ5 Natural gas LPG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gaz MQ5 Natural gas LPG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GAZ_MQ5_NATURAL_GAS_LPG
	 * @model name="gaz_MQ5_Natural_gas_LPG"
	 * @generated
	 * @ordered
	 */
	public static final int GAZ_MQ5_NATURAL_GAS_LPG_VALUE = 5;

	/**
	 * The '<em><b>Gaz MQ6 LPG butane gas</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gaz MQ6 LPG butane gas</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GAZ_MQ6_LPG_BUTANE_GAS
	 * @model name="gaz_MQ6_LPG_butane_gas"
	 * @generated
	 * @ordered
	 */
	public static final int GAZ_MQ6_LPG_BUTANE_GAS_VALUE = 6;

	/**
	 * The '<em><b>Gaz MQ7 Carbon Monoxide</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gaz MQ7 Carbon Monoxide</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GAZ_MQ7_CARBON_MONOXIDE
	 * @model name="gaz_MQ7_Carbon_Monoxide"
	 * @generated
	 * @ordered
	 */
	public static final int GAZ_MQ7_CARBON_MONOXIDE_VALUE = 7;

	/**
	 * The '<em><b>Gaz MQ8 Hydrogen Gas</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gaz MQ8 Hydrogen Gas</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GAZ_MQ8_HYDROGEN_GAS
	 * @model name="gaz_MQ8_Hydrogen_Gas"
	 * @generated
	 * @ordered
	 */
	public static final int GAZ_MQ8_HYDROGEN_GAS_VALUE = 8;

	/**
	 * The '<em><b>Gaz MQ9 Carbon Monoxide flammable gasses</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gaz MQ9 Carbon Monoxide flammable gasses</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GAZ_MQ9_CARBON_MONOXIDE_FLAMMABLE_GASSES
	 * @model name="gaz_MQ9_Carbon_Monoxide_flammable_gasses"
	 * @generated
	 * @ordered
	 */
	public static final int GAZ_MQ9_CARBON_MONOXIDE_FLAMMABLE_GASSES_VALUE = 9;

	/**
	 * The '<em><b>Pressure BMP280</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pressure BMP280</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESSURE_BMP280
	 * @model name="pressure_BMP280"
	 * @generated
	 * @ordered
	 */
	public static final int PRESSURE_BMP280_VALUE = 10;

	/**
	 * The '<em><b>Pressure Dps310 Barometric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pressure Dps310 Barometric</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESSURE_DPS310_BAROMETRIC
	 * @model name="pressure_Dps310_Barometric"
	 * @generated
	 * @ordered
	 */
	public static final int PRESSURE_DPS310_BAROMETRIC_VALUE = 11;

	/**
	 * The '<em><b>Motion HCSR501 PIR sensor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Motion HCSR501 PIR sensor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOTION_HCSR501_PIR_SENSOR
	 * @model name="motion_HCSR501_PIR_sensor"
	 * @generated
	 * @ordered
	 */
	public static final int MOTION_HCSR501_PIR_SENSOR_VALUE = 12;

	/**
	 * The '<em><b>Ultrasonic HCSR04 ultrasonic sensor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ultrasonic HCSR04 ultrasonic sensor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ULTRASONIC_HCSR04_ULTRASONIC_SENSOR
	 * @model name="ultrasonic_HCSR04_ultrasonic_sensor"
	 * @generated
	 * @ordered
	 */
	public static final int ULTRASONIC_HCSR04_ULTRASONIC_SENSOR_VALUE = 13;

	/**
	 * The '<em><b>Light LDR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Light LDR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIGHT_LDR
	 * @model name="light_LDR"
	 * @generated
	 * @ordered
	 */
	public static final int LIGHT_LDR_VALUE = 14;

	/**
	 * The '<em><b>Light TSL235R</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Light TSL235R</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIGHT_TSL235R
	 * @model name="light_TSL235R"
	 * @generated
	 * @ordered
	 */
	public static final int LIGHT_TSL235R_VALUE = 15;

	/**
	 * An array of all the '<em><b>Sensor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SensorType[] VALUES_ARRAY =
		new SensorType[] {
			TEMP_DHT11,
			TEMP_DHT22,
			GAZ_MQ2_METHANE_BUTANE_LPG_SMOKE,
			GAZ_MQ3_ALCOHOL_ETHANOL_SMOKE,
			GAZ_MQ4_METHANE_CNG_GAS,
			GAZ_MQ5_NATURAL_GAS_LPG,
			GAZ_MQ6_LPG_BUTANE_GAS,
			GAZ_MQ7_CARBON_MONOXIDE,
			GAZ_MQ8_HYDROGEN_GAS,
			GAZ_MQ9_CARBON_MONOXIDE_FLAMMABLE_GASSES,
			PRESSURE_BMP280,
			PRESSURE_DPS310_BAROMETRIC,
			MOTION_HCSR501_PIR_SENSOR,
			ULTRASONIC_HCSR04_ULTRASONIC_SENSOR,
			LIGHT_LDR,
			LIGHT_TSL235R,
		};

	/**
	 * A public read-only list of all the '<em><b>Sensor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SensorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sensor Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SensorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SensorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sensor Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SensorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SensorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sensor Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SensorType get(int value) {
		switch (value) {
			case TEMP_DHT11_VALUE: return TEMP_DHT11;
			case TEMP_DHT22_VALUE: return TEMP_DHT22;
			case GAZ_MQ2_METHANE_BUTANE_LPG_SMOKE_VALUE: return GAZ_MQ2_METHANE_BUTANE_LPG_SMOKE;
			case GAZ_MQ3_ALCOHOL_ETHANOL_SMOKE_VALUE: return GAZ_MQ3_ALCOHOL_ETHANOL_SMOKE;
			case GAZ_MQ4_METHANE_CNG_GAS_VALUE: return GAZ_MQ4_METHANE_CNG_GAS;
			case GAZ_MQ5_NATURAL_GAS_LPG_VALUE: return GAZ_MQ5_NATURAL_GAS_LPG;
			case GAZ_MQ6_LPG_BUTANE_GAS_VALUE: return GAZ_MQ6_LPG_BUTANE_GAS;
			case GAZ_MQ7_CARBON_MONOXIDE_VALUE: return GAZ_MQ7_CARBON_MONOXIDE;
			case GAZ_MQ8_HYDROGEN_GAS_VALUE: return GAZ_MQ8_HYDROGEN_GAS;
			case GAZ_MQ9_CARBON_MONOXIDE_FLAMMABLE_GASSES_VALUE: return GAZ_MQ9_CARBON_MONOXIDE_FLAMMABLE_GASSES;
			case PRESSURE_BMP280_VALUE: return PRESSURE_BMP280;
			case PRESSURE_DPS310_BAROMETRIC_VALUE: return PRESSURE_DPS310_BAROMETRIC;
			case MOTION_HCSR501_PIR_SENSOR_VALUE: return MOTION_HCSR501_PIR_SENSOR;
			case ULTRASONIC_HCSR04_ULTRASONIC_SENSOR_VALUE: return ULTRASONIC_HCSR04_ULTRASONIC_SENSOR;
			case LIGHT_LDR_VALUE: return LIGHT_LDR;
			case LIGHT_TSL235R_VALUE: return LIGHT_TSL235R;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SensorType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SensorType
