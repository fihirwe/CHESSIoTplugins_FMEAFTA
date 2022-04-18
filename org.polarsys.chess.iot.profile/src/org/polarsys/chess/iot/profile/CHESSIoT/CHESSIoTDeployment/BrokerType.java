/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Broker Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage#getBrokerType()
 * @model
 * @generated
 */
public enum BrokerType implements Enumerator {
	/**
	 * The '<em><b>MOSQUITTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOSQUITTO_VALUE
	 * @generated
	 * @ordered
	 */
	MOSQUITTO(0, "MOSQUITTO", "MOSQUITTO"),

	/**
	 * The '<em><b>HIVEMQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIVEMQ_VALUE
	 * @generated
	 * @ordered
	 */
	HIVEMQ(1, "HIVEMQ", "HIVEMQ"),

	/**
	 * The '<em><b>MOQUETTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOQUETTE_VALUE
	 * @generated
	 * @ordered
	 */
	MOQUETTE(2, "MOQUETTE", "MOQUETTE");

	/**
	 * The '<em><b>MOSQUITTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOSQUITTO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOSQUITTO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOSQUITTO_VALUE = 0;

	/**
	 * The '<em><b>HIVEMQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HIVEMQ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIVEMQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIVEMQ_VALUE = 1;

	/**
	 * The '<em><b>MOQUETTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOQUETTE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOQUETTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOQUETTE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Broker Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BrokerType[] VALUES_ARRAY =
		new BrokerType[] {
			MOSQUITTO,
			HIVEMQ,
			MOQUETTE,
		};

	/**
	 * A public read-only list of all the '<em><b>Broker Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BrokerType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Broker Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BrokerType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BrokerType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Broker Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BrokerType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BrokerType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Broker Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BrokerType get(int value) {
		switch (value) {
			case MOSQUITTO_VALUE: return MOSQUITTO;
			case HIVEMQ_VALUE: return HIVEMQ;
			case MOQUETTE_VALUE: return MOQUETTE;
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
	private BrokerType(int value, String name, String literal) {
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
	
} //BrokerType
