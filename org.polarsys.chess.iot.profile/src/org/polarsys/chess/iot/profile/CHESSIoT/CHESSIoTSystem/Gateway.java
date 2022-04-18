/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Gateway#getGateway <em>Gateway</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Gateway#getServer <em>Server</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Gateway#getComputingboard <em>Computingboard</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getGateway()
 * @model
 * @generated
 */
public interface Gateway extends PhysicalElement {
	/**
	 * Returns the value of the '<em><b>Gateway</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway</em>' reference.
	 * @see #setGateway(Gateway)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getGateway_Gateway()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Gateway getGateway();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Gateway#getGateway <em>Gateway</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway</em>' reference.
	 * @see #getGateway()
	 * @generated
	 */
	void setGateway(Gateway value);

	/**
	 * Returns the value of the '<em><b>Server</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.Server}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' reference list.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getGateway_Server()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Server> getServer();

	/**
	 * Returns the value of the '<em><b>Computingboard</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalBoard}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalBoard#getGateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computingboard</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computingboard</em>' reference list.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CHESSIoTSystemPackage#getGateway_Computingboard()
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.PhysicalBoard#getGateway
	 * @model opposite="gateway" required="true" ordered="false"
	 * @generated
	 */
	EList<PhysicalBoard> getComputingboard();

} // Gateway
