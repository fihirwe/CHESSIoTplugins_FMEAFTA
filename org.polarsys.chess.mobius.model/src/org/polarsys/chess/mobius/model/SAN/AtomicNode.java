/**
 */
package org.polarsys.chess.mobius.model.SAN;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.AtomicNode#getPlace <em>Place</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.AtomicNode#getTimedActivity <em>Timed Activity</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.AtomicNode#getInstantaneousActivity <em>Instantaneous Activity</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.AtomicNode#getInputGate <em>Input Gate</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.AtomicNode#getOutputGate <em>Output Gate</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.AtomicNode#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getAtomicNode()
 * @model
 * @generated
 */
public interface AtomicNode extends Node {
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
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getAtomicNode_Place()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getPlace();

	/**
	 * Returns the value of the '<em><b>Timed Activity</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.chess.mobius.model.SAN.TimedActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timed Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timed Activity</em>' containment reference list.
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getAtomicNode_TimedActivity()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimedActivity> getTimedActivity();

	/**
	 * Returns the value of the '<em><b>Instantaneous Activity</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.chess.mobius.model.SAN.InstantaneousActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantaneous Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantaneous Activity</em>' containment reference list.
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getAtomicNode_InstantaneousActivity()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstantaneousActivity> getInstantaneousActivity();

	/**
	 * Returns the value of the '<em><b>Input Gate</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.chess.mobius.model.SAN.InputGate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Gate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Gate</em>' containment reference list.
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getAtomicNode_InputGate()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputGate> getInputGate();

	/**
	 * Returns the value of the '<em><b>Output Gate</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.chess.mobius.model.SAN.OutputGate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Gate</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Gate</em>' containment reference list.
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getAtomicNode_OutputGate()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputGate> getOutputGate();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getAtomicNode_Model()
	 * @model
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.mobius.model.SAN.AtomicNode#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

} // AtomicNode
