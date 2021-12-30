/**
 */
package org.polarsys.chess.mobius.model.SAN;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.InputGate#getInputPredicated <em>Input Predicated</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.InputGate#getInputFunction <em>Input Function</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.InputGate#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getInputGate()
 * @model
 * @generated
 */
public interface InputGate extends Primitive {
	/**
	 * Returns the value of the '<em><b>Input Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Predicated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Predicated</em>' attribute.
	 * @see #setInputPredicated(String)
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getInputGate_InputPredicated()
	 * @model
	 * @generated
	 */
	String getInputPredicated();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.mobius.model.SAN.InputGate#getInputPredicated <em>Input Predicated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Predicated</em>' attribute.
	 * @see #getInputPredicated()
	 * @generated
	 */
	void setInputPredicated(String value);

	/**
	 * Returns the value of the '<em><b>Input Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Function</em>' attribute.
	 * @see #setInputFunction(String)
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getInputGate_InputFunction()
	 * @model
	 * @generated
	 */
	String getInputFunction();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.mobius.model.SAN.InputGate#getInputFunction <em>Input Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Function</em>' attribute.
	 * @see #getInputFunction()
	 * @generated
	 */
	void setInputFunction(String value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.chess.mobius.model.SAN.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference list.
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getInputGate_Activity()
	 * @model
	 * @generated
	 */
	EList<Activity> getActivity();

} // InputGate
