/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CloudNode#getContainer <em>Container</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CloudNode#getCloudresources <em>Cloudresources</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage#getCloudNode()
 * @model
 * @generated
 */
public interface CloudNode extends Node {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.Container}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference list.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage#getCloudNode_Container()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Container> getContainer();

	/**
	 * Returns the value of the '<em><b>Cloudresources</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CloudOrchestrator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloudresources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloudresources</em>' reference list.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage#getCloudNode_Cloudresources()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<CloudOrchestrator> getCloudresources();

} // CloudNode
