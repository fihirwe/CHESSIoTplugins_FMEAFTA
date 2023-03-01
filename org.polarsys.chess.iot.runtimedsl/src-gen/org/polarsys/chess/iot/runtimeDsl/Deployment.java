/**
 * generated by Xtext 2.12.0
 */
package org.polarsys.chess.iot.runtimeDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.runtimeDsl.Deployment#getPlan <em>Plan</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.runtimeDsl.RuntimeDslPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends EObject
{
  /**
   * Returns the value of the '<em><b>Plan</b></em>' containment reference list.
   * The list contents are of type {@link org.polarsys.chess.iot.runtimeDsl.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plan</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plan</em>' containment reference list.
   * @see org.polarsys.chess.iot.runtimeDsl.RuntimeDslPackage#getDeployment_Plan()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getPlan();

} // Deployment