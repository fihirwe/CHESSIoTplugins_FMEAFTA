/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard#getSensor <em>Sensor</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard#getActuator <em>Actuator</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getVirtualBoard()
 * @model
 * @generated
 */
public interface VirtualBoard extends VirtualElement {
	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Sensor}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Sensor#getComputingnode <em>Computingnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference list.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getVirtualBoard_Sensor()
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Sensor#getComputingnode
	 * @model opposite="computingnode" ordered="false"
	 * @generated
	 */
	EList<Sensor> getSensor();

	/**
	 * Returns the value of the '<em><b>Actuator</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Actuator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuator</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator</em>' reference list.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getVirtualBoard_Actuator()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Actuator> getActuator();

} // VirtualBoard
