/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Distribution Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DataDistributionService#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage#getDataDistributionService()
 * @model
 * @generated
 */
public interface DataDistributionService extends Service {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DDSType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DDSType
	 * @see #setType(DDSType)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage#getDataDistributionService_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DDSType getType();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DataDistributionService#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.DDSType
	 * @see #getType()
	 * @generated
	 */
	void setType(DDSType value);

} // DataDistributionService
