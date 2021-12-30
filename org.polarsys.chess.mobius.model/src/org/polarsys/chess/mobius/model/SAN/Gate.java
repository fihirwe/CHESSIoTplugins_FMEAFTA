/**
 */
package org.polarsys.chess.mobius.model.SAN;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.Gate#getPlace <em>Place</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getGate()
 * @model abstract="true"
 * @generated
 */
public interface Gate extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Place</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.chess.mobius.model.SAN.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' containment reference list.
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getGate_Place()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getPlace();

} // Gate
