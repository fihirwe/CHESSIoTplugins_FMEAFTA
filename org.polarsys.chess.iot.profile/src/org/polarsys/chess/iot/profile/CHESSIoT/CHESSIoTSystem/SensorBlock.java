/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock#getSensorType <em>Sensor Type</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock#getPhysicalentity <em>Physicalentity</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock#getComputingboard <em>Computingboard</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getSensorBlock()
 * @model
 * @generated
 */
public interface SensorBlock extends PhysicalElement {
	/**
	 * Returns the value of the '<em><b>Sensor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Type</em>' attribute.
	 * @see #setSensorType(String)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getSensorBlock_SensorType()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getSensorType();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock#getSensorType <em>Sensor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Type</em>' attribute.
	 * @see #getSensorType()
	 * @generated
	 */
	void setSensorType(String value);

	/**
	 * Returns the value of the '<em><b>Physicalentity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physicalentity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physicalentity</em>' reference.
	 * @see #setPhysicalentity(PhysicalEntity)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getSensorBlock_Physicalentity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PhysicalEntity getPhysicalentity();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock#getPhysicalentity <em>Physicalentity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physicalentity</em>' reference.
	 * @see #getPhysicalentity()
	 * @generated
	 */
	void setPhysicalentity(PhysicalEntity value);

	/**
	 * Returns the value of the '<em><b>Computingboard</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalBoard#getSensorblock <em>Sensorblock</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computingboard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computingboard</em>' reference.
	 * @see #setComputingboard(PhysicalBoard)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getSensorBlock_Computingboard()
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalBoard#getSensorblock
	 * @model opposite="sensorblock" required="true" ordered="false"
	 * @generated
	 */
	PhysicalBoard getComputingboard();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock#getComputingboard <em>Computingboard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computingboard</em>' reference.
	 * @see #getComputingboard()
	 * @generated
	 */
	void setComputingboard(PhysicalBoard value);

} // SensorBlock
