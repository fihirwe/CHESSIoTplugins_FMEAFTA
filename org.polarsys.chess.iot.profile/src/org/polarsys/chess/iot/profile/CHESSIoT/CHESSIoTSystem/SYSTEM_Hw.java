/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.sysml.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SYSTEM Hw</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SYSTEM_Hw#getPhysicalentity <em>Physicalentity</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SYSTEM_Hw#getIotport <em>Iotport</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SYSTEM_Hw#getServer <em>Server</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SYSTEM_Hw#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SYSTEM_Hw#getPhysicalelement <em>Physicalelement</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SYSTEM_Hw#getSystem_hw <em>System hw</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getSYSTEM_Hw()
 * @model
 * @generated
 */
public interface SYSTEM_Hw extends Block {
	/**
	 * Returns the value of the '<em><b>Physicalentity</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physicalentity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physicalentity</em>' containment reference list.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getSYSTEM_Hw_Physicalentity()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<PhysicalEntity> getPhysicalentity();

	/**
	 * Returns the value of the '<em><b>Iotport</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.IoTPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iotport</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iotport</em>' containment reference list.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getSYSTEM_Hw_Iotport()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<IoTPort> getIotport();

	/**
	 * Returns the value of the '<em><b>Server</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Server}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' containment reference list.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getSYSTEM_Hw_Server()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Server> getServer();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getSYSTEM_Hw_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SYSTEM_Hw#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Physicalelement</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physicalelement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physicalelement</em>' containment reference list.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getSYSTEM_Hw_Physicalelement()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<PhysicalElement> getPhysicalelement();

	/**
	 * Returns the value of the '<em><b>System hw</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System hw</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System hw</em>' reference.
	 * @see #setSystem_hw(SYSTEM_Hw)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getSYSTEM_Hw_System_hw()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SYSTEM_Hw getSystem_hw();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SYSTEM_Hw#getSystem_hw <em>System hw</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System hw</em>' reference.
	 * @see #getSystem_hw()
	 * @generated
	 */
	void setSystem_hw(SYSTEM_Hw value);

} // SYSTEM_Hw
