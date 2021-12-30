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
	 * The literals are from the enumeration {@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Type</em>' attribute.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorType
	 * @see #setSensorType(SensorType)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getSensorBlock_SensorType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SensorType getSensorType();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock#getSensorType <em>Sensor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Type</em>' attribute.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorType
	 * @see #getSensorType()
	 * @generated
	 */
	void setSensorType(SensorType value);

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
	 * It is bidirectional and its opposite is '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ComputingBoard#getSensorblock <em>Sensorblock</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computingboard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computingboard</em>' reference.
	 * @see #setComputingboard(ComputingBoard)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getSensorBlock_Computingboard()
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ComputingBoard#getSensorblock
	 * @model opposite="sensorblock" required="true" ordered="false"
	 * @generated
	 */
	ComputingBoard getComputingboard();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock#getComputingboard <em>Computingboard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computingboard</em>' reference.
	 * @see #getComputingboard()
	 * @generated
	 */
	void setComputingboard(ComputingBoard value);

} // SensorBlock
