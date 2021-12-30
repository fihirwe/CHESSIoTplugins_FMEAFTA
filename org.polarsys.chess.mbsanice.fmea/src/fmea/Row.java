/**
 */
package fmea;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.chess.fla.flamm.Failure;
import org.polarsys.chess.fla.flamm.Port;
import org.polarsys.chess.fla.flamm.Rule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fmea.Row#getLocalPort <em>Local Port</em>}</li>
 *   <li>{@link fmea.Row#getFailureMode <em>Failure Mode</em>}</li>
 *   <li>{@link fmea.Row#getLocalEffect <em>Local Effect</em>}</li>
 *   <li>{@link fmea.Row#getEndPort <em>End Port</em>}</li>
 *   <li>{@link fmea.Row#getEndEffect <em>End Effect</em>}</li>
 *   <li>{@link fmea.Row#getInterPorts <em>Inter Ports</em>}</li>
 * </ul>
 *
 * @see fmea.FmeaPackage#getRow()
 * @model
 * @generated
 */
public interface Row extends EObject {
	/**
	 * Returns the value of the '<em><b>Local Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Port</em>' reference.
	 * @see #setLocalPort(Port)
	 * @see fmea.FmeaPackage#getRow_LocalPort()
	 * @model
	 * @generated
	 */
	Port getLocalPort();

	/**
	 * Sets the value of the '{@link fmea.Row#getLocalPort <em>Local Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Port</em>' reference.
	 * @see #getLocalPort()
	 * @generated
	 */
	void setLocalPort(Port value);

	/**
	 * Returns the value of the '<em><b>Failure Mode</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.chess.fla.flamm.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Mode</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Mode</em>' reference list.
	 * @see fmea.FmeaPackage#getRow_FailureMode()
	 * @model
	 * @generated
	 */
	EList<Rule> getFailureMode();

	/**
	 * Returns the value of the '<em><b>Local Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Effect</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Effect</em>' reference.
	 * @see #setLocalEffect(Failure)
	 * @see fmea.FmeaPackage#getRow_LocalEffect()
	 * @model
	 * @generated
	 */
	Failure getLocalEffect();

	/**
	 * Sets the value of the '{@link fmea.Row#getLocalEffect <em>Local Effect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Effect</em>' reference.
	 * @see #getLocalEffect()
	 * @generated
	 */
	void setLocalEffect(Failure value);

	/**
	 * Returns the value of the '<em><b>End Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Port</em>' reference.
	 * @see #setEndPort(Port)
	 * @see fmea.FmeaPackage#getRow_EndPort()
	 * @model
	 * @generated
	 */
	Port getEndPort();

	/**
	 * Sets the value of the '{@link fmea.Row#getEndPort <em>End Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Port</em>' reference.
	 * @see #getEndPort()
	 * @generated
	 */
	void setEndPort(Port value);

	/**
	 * Returns the value of the '<em><b>End Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Effect</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Effect</em>' reference.
	 * @see #setEndEffect(Failure)
	 * @see fmea.FmeaPackage#getRow_EndEffect()
	 * @model
	 * @generated
	 */
	Failure getEndEffect();

	/**
	 * Sets the value of the '{@link fmea.Row#getEndEffect <em>End Effect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Effect</em>' reference.
	 * @see #getEndEffect()
	 * @generated
	 */
	void setEndEffect(Failure value);

	/**
	 * Returns the value of the '<em><b>Inter Ports</b></em>' containment reference list.
	 * The list contents are of type {@link fmea.InterPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inter Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inter Ports</em>' containment reference list.
	 * @see fmea.FmeaPackage#getRow_InterPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterPort> getInterPorts();

} // Row
