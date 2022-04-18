/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.VirtualBoard;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceNode#getDeviceresources <em>Deviceresources</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceNode#getPysicalDevice <em>Pysical Device</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage#getDeviceNode()
 * @model
 * @generated
 */
public interface DeviceNode extends Node {
	/**
	 * Returns the value of the '<em><b>Deviceresources</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deviceresources</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deviceresources</em>' reference.
	 * @see #setDeviceresources(DeviceResources)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage#getDeviceNode_Deviceresources()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DeviceResources getDeviceresources();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceNode#getDeviceresources <em>Deviceresources</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deviceresources</em>' reference.
	 * @see #getDeviceresources()
	 * @generated
	 */
	void setDeviceresources(DeviceResources value);

	/**
	 * Returns the value of the '<em><b>Pysical Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pysical Device</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pysical Device</em>' reference.
	 * @see #setPysicalDevice(VirtualBoard)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage#getDeviceNode_PysicalDevice()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VirtualBoard getPysicalDevice();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceNode#getPysicalDevice <em>Pysical Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pysical Device</em>' reference.
	 * @see #getPysicalDevice()
	 * @generated
	 */
	void setPysicalDevice(VirtualBoard value);

} // DeviceNode
