/**
 */
package org.polarsys.chess.mobius.model.SAN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rep</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.Rep#getNumbOfReps <em>Numb Of Reps</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getRep()
 * @model
 * @generated
 */
public interface Rep extends ComposedNode {
	/**
	 * Returns the value of the '<em><b>Numb Of Reps</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numb Of Reps</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numb Of Reps</em>' attribute.
	 * @see #setNumbOfReps(String)
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getRep_NumbOfReps()
	 * @model default=""
	 * @generated
	 */
	String getNumbOfReps();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.mobius.model.SAN.Rep#getNumbOfReps <em>Numb Of Reps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numb Of Reps</em>' attribute.
	 * @see #getNumbOfReps()
	 * @generated
	 */
	void setNumbOfReps(String value);

} // Rep
