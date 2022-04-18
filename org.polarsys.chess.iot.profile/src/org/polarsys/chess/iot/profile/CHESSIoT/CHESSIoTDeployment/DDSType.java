/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DDS Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage#getDDSType()
 * @model
 * @generated
 */
public enum DDSType implements Enumerator {
	/**
	 * The '<em><b>KAFKA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KAFKA_VALUE
	 * @generated
	 * @ordered
	 */
	KAFKA(0, "KAFKA", "KAFKA"),

	/**
	 * The '<em><b>Rabbit MQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RABBIT_MQ_VALUE
	 * @generated
	 * @ordered
	 */
	RABBIT_MQ(1, "RabbitMQ", "RabbitMQ"),

	/**
	 * The '<em><b>Apache Spark</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APACHE_SPARK_VALUE
	 * @generated
	 * @ordered
	 */
	APACHE_SPARK(2, "ApacheSpark", "ApacheSpark");

	/**
	 * The '<em><b>KAFKA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KAFKA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KAFKA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KAFKA_VALUE = 0;

	/**
	 * The '<em><b>Rabbit MQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rabbit MQ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RABBIT_MQ
	 * @model name="RabbitMQ"
	 * @generated
	 * @ordered
	 */
	public static final int RABBIT_MQ_VALUE = 1;

	/**
	 * The '<em><b>Apache Spark</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Apache Spark</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APACHE_SPARK
	 * @model name="ApacheSpark"
	 * @generated
	 * @ordered
	 */
	public static final int APACHE_SPARK_VALUE = 2;

	/**
	 * An array of all the '<em><b>DDS Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DDSType[] VALUES_ARRAY =
		new DDSType[] {
			KAFKA,
			RABBIT_MQ,
			APACHE_SPARK,
		};

	/**
	 * A public read-only list of all the '<em><b>DDS Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DDSType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DDS Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DDSType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DDSType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DDS Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DDSType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DDSType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DDS Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DDSType get(int value) {
		switch (value) {
			case KAFKA_VALUE: return KAFKA;
			case RABBIT_MQ_VALUE: return RABBIT_MQ;
			case APACHE_SPARK_VALUE: return APACHE_SPARK;
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
	private DDSType(int value, String name, String literal) {
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
	
} //DDSType
