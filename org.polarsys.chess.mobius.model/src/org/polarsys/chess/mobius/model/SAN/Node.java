/**
 */
package org.polarsys.chess.mobius.model.SAN;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.Node#getGlobalVariable <em>Global Variable</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Global Variable</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.chess.mobius.model.SAN.GlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Variable</em>' containment reference list.
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getNode_GlobalVariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<GlobalVariable> getGlobalVariable();
} // Node
