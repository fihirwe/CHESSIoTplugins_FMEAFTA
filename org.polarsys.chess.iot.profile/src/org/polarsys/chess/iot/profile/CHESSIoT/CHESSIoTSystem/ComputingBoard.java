/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computing Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ComputingBoard#getNodeModel <em>Node Model</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ComputingBoard#getGateway <em>Gateway</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ComputingBoard#getActuatingblock <em>Actuatingblock</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ComputingBoard#getSensorblock <em>Sensorblock</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ComputingBoard#getPhysicalentity <em>Physicalentity</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getComputingBoard()
 * @model
 * @generated
 */
public interface ComputingBoard extends PhysicalElement {
	/**
	 * Returns the value of the '<em><b>Node Model</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.NodeModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Model</em>' attribute.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.NodeModel
	 * @see #setNodeModel(NodeModel)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getComputingBoard_NodeModel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NodeModel getNodeModel();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ComputingBoard#getNodeModel <em>Node Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Model</em>' attribute.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.NodeModel
	 * @see #getNodeModel()
	 * @generated
	 */
	void setNodeModel(NodeModel value);

	/**
	 * Returns the value of the '<em><b>Gateway</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Gateway#getComputingboard <em>Computingboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway</em>' reference.
	 * @see #setGateway(Gateway)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getComputingBoard_Gateway()
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Gateway#getComputingboard
	 * @model opposite="computingboard" required="true" ordered="false"
	 * @generated
	 */
	Gateway getGateway();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ComputingBoard#getGateway <em>Gateway</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway</em>' reference.
	 * @see #getGateway()
	 * @generated
	 */
	void setGateway(Gateway value);

	/**
	 * Returns the value of the '<em><b>Actuatingblock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuatingblock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuatingblock</em>' reference.
	 * @see #setActuatingblock(ActuatingBlock)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getComputingBoard_Actuatingblock()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ActuatingBlock getActuatingblock();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ComputingBoard#getActuatingblock <em>Actuatingblock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuatingblock</em>' reference.
	 * @see #getActuatingblock()
	 * @generated
	 */
	void setActuatingblock(ActuatingBlock value);

	/**
	 * Returns the value of the '<em><b>Sensorblock</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock#getComputingboard <em>Computingboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensorblock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensorblock</em>' reference.
	 * @see #setSensorblock(SensorBlock)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getComputingBoard_Sensorblock()
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock#getComputingboard
	 * @model opposite="computingboard" required="true" ordered="false"
	 * @generated
	 */
	SensorBlock getSensorblock();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ComputingBoard#getSensorblock <em>Sensorblock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensorblock</em>' reference.
	 * @see #getSensorblock()
	 * @generated
	 */
	void setSensorblock(SensorBlock value);

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
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getComputingBoard_Physicalentity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PhysicalEntity getPhysicalentity();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.ComputingBoard#getPhysicalentity <em>Physicalentity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physicalentity</em>' reference.
	 * @see #getPhysicalentity()
	 * @generated
	 */
	void setPhysicalentity(PhysicalEntity value);

} // ComputingBoard
