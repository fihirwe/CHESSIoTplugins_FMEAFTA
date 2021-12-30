/**
 */
package org.polarsys.chess.mobius.model.SAN;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composed Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.ComposedNode#getStateVariables <em>State Variables</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.ComposedNode#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getComposedNode()
 * @model abstract="true"
 * @generated
 */
public interface ComposedNode extends Node {
	/**
	 * Returns the value of the '<em><b>State Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.chess.mobius.model.SAN.SharedState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Variables</em>' containment reference list.
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getComposedNode_StateVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<SharedState> getStateVariables();

	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.chess.mobius.model.SAN.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference list.
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getComposedNode_Child()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Node> getChild();

} // ComposedNode
