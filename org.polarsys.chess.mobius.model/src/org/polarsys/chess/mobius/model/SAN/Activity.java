/**
 */
package org.polarsys.chess.mobius.model.SAN;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.Activity#getPlace <em>Place</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.Activity#getOutputGate <em>Output Gate</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.Activity#getCase <em>Case</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.Activity#getPlacecase <em>Placecase</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getActivity()
 * @model abstract="true"
 * @generated
 */
public interface Activity extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Place</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.chess.mobius.model.SAN.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' reference list.
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getActivity_Place()
	 * @model
	 * @generated
	 */
	EList<Place> getPlace();

	/**
	 * Returns the value of the '<em><b>Output Gate</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.chess.mobius.model.SAN.OutputGate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Gate</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Gate</em>' reference list.
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getActivity_OutputGate()
	 * @model
	 * @generated
	 */
	EList<OutputGate> getOutputGate();

	/**
	 * Returns the value of the '<em><b>Case</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case</em>' attribute list.
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getActivity_Case()
	 * @model
	 * @generated
	 */
	EList<String> getCase();

	/**
	 * Returns the value of the '<em><b>Placecase</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.chess.mobius.model.SAN.ActivityPlaceCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placecase</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placecase</em>' containment reference list.
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getActivity_Placecase()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityPlaceCase> getPlacecase();

} // Activity
