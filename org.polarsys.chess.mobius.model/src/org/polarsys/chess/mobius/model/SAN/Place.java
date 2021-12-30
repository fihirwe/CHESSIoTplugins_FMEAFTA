/**
 */
package org.polarsys.chess.mobius.model.SAN;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.Place#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.Place#getInputGate <em>Input Gate</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.Place#getInitialState <em>Initial State</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends Primitive {
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
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getPlace_Activity()
	 * @model
	 * @generated
	 */
	EList<Activity> getActivity();

	/**
	 * Returns the value of the '<em><b>Input Gate</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.chess.mobius.model.SAN.InputGate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Gate</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Gate</em>' reference list.
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getPlace_InputGate()
	 * @model
	 * @generated
	 */
	EList<InputGate> getInputGate();

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' attribute.
	 * @see #setInitialState(int)
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getPlace_InitialState()
	 * @model
	 * @generated
	 */
	int getInitialState();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.mobius.model.SAN.Place#getInitialState <em>Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' attribute.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(int value);

} // Place
