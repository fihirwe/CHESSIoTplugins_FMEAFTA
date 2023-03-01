/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sensor Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getSensorCategory()
 * @model
 * @generated
 */
public enum SensorCategory implements Enumerator {
	/**
	 * The '<em><b>Temp Humidity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMP_HUMIDITY_VALUE
	 * @generated
	 * @ordered
	 */
	TEMP_HUMIDITY(0, "TempHumidity", "TempHumidity"),

	/**
	 * The '<em><b>Gaz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAZ_VALUE
	 * @generated
	 * @ordered
	 */
	GAZ(1, "Gaz", "Gaz"),

	/**
	 * The '<em><b>Pressure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESSURE_VALUE
	 * @generated
	 * @ordered
	 */
	PRESSURE(2, "Pressure", "Pressure"),

	/**
	 * The '<em><b>Motion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTION_VALUE
	 * @generated
	 * @ordered
	 */
	MOTION(3, "Motion", "Motion"),

	/**
	 * The '<em><b>Ultrasonic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ULTRASONIC_VALUE
	 * @generated
	 * @ordered
	 */
	ULTRASONIC(4, "Ultrasonic", "Ultrasonic"),

	/**
	 * The '<em><b>Light</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHT(5, "Light", "Light");

	/**
	 * The '<em><b>Temp Humidity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Temp Humidity</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMP_HUMIDITY
	 * @model name="TempHumidity"
	 * @generated
	 * @ordered
	 */
	public static final int TEMP_HUMIDITY_VALUE = 0;

	/**
	 * The '<em><b>Gaz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gaz</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GAZ
	 * @model name="Gaz"
	 * @generated
	 * @ordered
	 */
	public static final int GAZ_VALUE = 1;

	/**
	 * The '<em><b>Pressure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pressure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESSURE
	 * @model name="Pressure"
	 * @generated
	 * @ordered
	 */
	public static final int PRESSURE_VALUE = 2;

	/**
	 * The '<em><b>Motion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Motion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOTION
	 * @model name="Motion"
	 * @generated
	 * @ordered
	 */
	public static final int MOTION_VALUE = 3;

	/**
	 * The '<em><b>Ultrasonic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ultrasonic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ULTRASONIC
	 * @model name="Ultrasonic"
	 * @generated
	 * @ordered
	 */
	public static final int ULTRASONIC_VALUE = 4;

	/**
	 * The '<em><b>Light</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Light</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIGHT
	 * @model name="Light"
	 * @generated
	 * @ordered
	 */
	public static final int LIGHT_VALUE = 5;

	/**
	 * An array of all the '<em><b>Sensor Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SensorCategory[] VALUES_ARRAY =
		new SensorCategory[] {
			TEMP_HUMIDITY,
			GAZ,
			PRESSURE,
			MOTION,
			ULTRASONIC,
			LIGHT,
		};

	/**
	 * A public read-only list of all the '<em><b>Sensor Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SensorCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sensor Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SensorCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SensorCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sensor Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SensorCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SensorCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sensor Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SensorCategory get(int value) {
		switch (value) {
			case TEMP_HUMIDITY_VALUE: return TEMP_HUMIDITY;
			case GAZ_VALUE: return GAZ;
			case PRESSURE_VALUE: return PRESSURE;
			case MOTION_VALUE: return MOTION;
			case ULTRASONIC_VALUE: return ULTRASONIC;
			case LIGHT_VALUE: return LIGHT;
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
	private SensorCategory(int value, String name, String literal) {
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
	
} //SensorCategory
