/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End User Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.EndUserApplication#getCustomConf <em>Custom Conf</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage#getEndUserApplication()
 * @model
 * @generated
 */
public interface EndUserApplication extends Service {
	/**
	 * Returns the value of the '<em><b>Custom Conf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Conf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Conf</em>' attribute.
	 * @see #setCustomConf(String)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.CHESSIoTDeploymentPackage#getEndUserApplication_CustomConf()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCustomConf();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTDeployment.EndUserApplication#getCustomConf <em>Custom Conf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Conf</em>' attribute.
	 * @see #getCustomConf()
	 * @generated
	 */
	void setCustomConf(String value);

} // EndUserApplication
