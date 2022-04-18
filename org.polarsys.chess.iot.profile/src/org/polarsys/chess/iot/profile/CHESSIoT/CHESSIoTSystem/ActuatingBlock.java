/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuating Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ActuatingBlock#getActuationType <em>Actuation Type</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ActuatingBlock#getPhysicalentity <em>Physicalentity</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getActuatingBlock()
 * @model
 * @generated
 */
public interface ActuatingBlock extends PhysicalElement {
	/**
	 * Returns the value of the '<em><b>Actuation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuation Type</em>' attribute.
	 * @see #setActuationType(String)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getActuatingBlock_ActuationType()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getActuationType();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ActuatingBlock#getActuationType <em>Actuation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuation Type</em>' attribute.
	 * @see #getActuationType()
	 * @generated
	 */
	void setActuationType(String value);

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
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getActuatingBlock_Physicalentity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PhysicalEntity getPhysicalentity();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ActuatingBlock#getPhysicalentity <em>Physicalentity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physicalentity</em>' reference.
	 * @see #getPhysicalentity()
	 * @generated
	 */
	void setPhysicalentity(PhysicalEntity value);

} // ActuatingBlock
