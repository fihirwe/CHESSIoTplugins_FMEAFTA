/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DeviceNode#getIotdevice <em>Iotdevice</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage#getDeviceNode()
 * @model
 * @generated
 */
public interface DeviceNode extends Node {
	/**
	 * Returns the value of the '<em><b>Iotdevice</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.OnDeviceApp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iotdevice</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iotdevice</em>' reference list.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage#getDeviceNode_Iotdevice()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<OnDeviceApp> getIotdevice();

} // DeviceNode
