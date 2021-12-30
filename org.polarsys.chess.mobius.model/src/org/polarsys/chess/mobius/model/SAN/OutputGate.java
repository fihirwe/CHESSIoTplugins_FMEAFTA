/**
 */
package org.polarsys.chess.mobius.model.SAN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.OutputGate#getOutputFunction <em>Output Function</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getOutputGate()
 * @model
 * @generated
 */
public interface OutputGate extends InputGate {
	/**
	 * Returns the value of the '<em><b>Output Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Function</em>' attribute.
	 * @see #setOutputFunction(String)
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getOutputGate_OutputFunction()
	 * @model
	 * @generated
	 */
	String getOutputFunction();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.mobius.model.SAN.OutputGate#getOutputFunction <em>Output Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Function</em>' attribute.
	 * @see #getOutputFunction()
	 * @generated
	 */
	void setOutputFunction(String value);

} // OutputGate
