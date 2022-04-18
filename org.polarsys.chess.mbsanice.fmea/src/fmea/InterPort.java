/**
 */
package fmea;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.chess.fla.flamm.Failure;
import org.polarsys.chess.fla.flamm.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inter Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fmea.InterPort#getPort <em>Port</em>}</li>
 *   <li>{@link fmea.InterPort#getFailure <em>Failure</em>}</li>
 * </ul>
 *
 * @see fmea.FmeaPackage#getInterPort()
 * @model
 * @generated
 */
public interface InterPort extends EObject {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(Port)
	 * @see fmea.FmeaPackage#getInterPort_Port()
	 * @model
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link fmea.InterPort#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

	/**
	 * Returns the value of the '<em><b>Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure</em>' reference.
	 * @see #setFailure(Failure)
	 * @see fmea.FmeaPackage#getInterPort_Failure()
	 * @model
	 * @generated
	 */
	Failure getFailure();

	/**
	 * Sets the value of the '{@link fmea.InterPort#getFailure <em>Failure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure</em>' reference.
	 * @see #getFailure()
	 * @generated
	 */
	void setFailure(Failure value);

} // InterPort
