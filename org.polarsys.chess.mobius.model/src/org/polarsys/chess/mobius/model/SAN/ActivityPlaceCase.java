/**
 */
package org.polarsys.chess.mobius.model.SAN;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Place Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.ActivityPlaceCase#getPlace <em>Place</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.ActivityPlaceCase#getCase <em>Case</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getActivityPlaceCase()
 * @model
 * @generated
 */
public interface ActivityPlaceCase extends GraphicalElement {
	/**
	 * Returns the value of the '<em><b>Place</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.chess.mobius.model.SAN.Primitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' reference list.
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getActivityPlaceCase_Place()
	 * @model
	 * @generated
	 */
	EList<Primitive> getPlace();

	/**
	 * Returns the value of the '<em><b>Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case</em>' attribute.
	 * @see #setCase(int)
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getActivityPlaceCase_Case()
	 * @model
	 * @generated
	 */
	int getCase();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.mobius.model.SAN.ActivityPlaceCase#getCase <em>Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case</em>' attribute.
	 * @see #getCase()
	 * @generated
	 */
	void setCase(int value);

} // ActivityPlaceCase
