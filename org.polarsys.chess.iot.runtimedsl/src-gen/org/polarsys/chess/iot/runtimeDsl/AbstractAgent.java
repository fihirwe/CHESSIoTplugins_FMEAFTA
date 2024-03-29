/**
 * generated by Xtext 2.12.0
 */
package org.polarsys.chess.iot.runtimeDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.runtimeDsl.AbstractAgent#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.runtimeDsl.AbstractAgent#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.runtimeDsl.AbstractAgent#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.runtimeDsl.RuntimeDslPackage#getAbstractAgent()
 * @model
 * @generated
 */
public interface AbstractAgent extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.polarsys.chess.iot.runtimeDsl.RuntimeDslPackage#getAbstractAgent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.polarsys.chess.iot.runtimeDsl.AbstractAgent#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(AbstractAgent)
   * @see org.polarsys.chess.iot.runtimeDsl.RuntimeDslPackage#getAbstractAgent_SuperType()
   * @model
   * @generated
   */
  AbstractAgent getSuperType();

  /**
   * Sets the value of the '{@link org.polarsys.chess.iot.runtimeDsl.AbstractAgent#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(AbstractAgent value);

  /**
   * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
   * The list contents are of type {@link org.polarsys.chess.iot.runtimeDsl.rule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' containment reference list.
   * @see org.polarsys.chess.iot.runtimeDsl.RuntimeDslPackage#getAbstractAgent_Rule()
   * @model containment="true"
   * @generated
   */
  EList<rule> getRule();

} // AbstractAgent
