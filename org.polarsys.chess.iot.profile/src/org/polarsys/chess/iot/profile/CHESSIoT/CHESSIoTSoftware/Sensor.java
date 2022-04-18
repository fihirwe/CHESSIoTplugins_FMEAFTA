/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Sensor#getComputingnode <em>Computingnode</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends VirtualElement {
	/**
	 * Returns the value of the '<em><b>Computingnode</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computingnode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computingnode</em>' reference.
	 * @see #setComputingnode(VirtualBoard)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getSensor_Computingnode()
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard#getSensor
	 * @model opposite="sensor" required="true" ordered="false"
	 * @generated
	 */
	VirtualBoard getComputingnode();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Sensor#getComputingnode <em>Computingnode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computingnode</em>' reference.
	 * @see #getComputingnode()
	 * @generated
	 */
	void setComputingnode(VirtualBoard value);

} // Sensor
