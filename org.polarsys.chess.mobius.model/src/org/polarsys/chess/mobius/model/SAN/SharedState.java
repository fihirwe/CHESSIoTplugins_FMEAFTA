/**
 */
package org.polarsys.chess.mobius.model.SAN;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shared State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.SharedState#getPlace <em>Place</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.SharedState#getSharedStates <em>Shared States</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getSharedState()
 * @model
 * @generated
 */
public interface SharedState extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Place</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.chess.mobius.model.SAN.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' reference list.
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getSharedState_Place()
	 * @model
	 * @generated
	 */
	EList<Place> getPlace();

	/**
	 * Returns the value of the '<em><b>Shared States</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.chess.mobius.model.SAN.SharedState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared States</em>' reference list.
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getSharedState_SharedStates()
	 * @model
	 * @generated
	 */
	EList<SharedState> getSharedStates();

} // SharedState
