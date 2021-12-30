/**
 */
package org.polarsys.chess.mobius.model.SAN;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage
 * @generated
 */
public interface SANModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SANModelFactory eINSTANCE = org.polarsys.chess.mobius.model.SAN.impl.SANModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>SAN Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SAN Model</em>'.
	 * @generated
	 */
	SANModel createSANModel();

	/**
	 * Returns a new object of class '<em>Shared State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shared State</em>'.
	 * @generated
	 */
	SharedState createSharedState();

	/**
	 * Returns a new object of class '<em>Join</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join</em>'.
	 * @generated
	 */
	Join createJoin();

	/**
	 * Returns a new object of class '<em>Rep</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rep</em>'.
	 * @generated
	 */
	Rep createRep();

	/**
	 * Returns a new object of class '<em>Atomic Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Node</em>'.
	 * @generated
	 */
	AtomicNode createAtomicNode();

	/**
	 * Returns a new object of class '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place</em>'.
	 * @generated
	 */
	Place createPlace();

	/**
	 * Returns a new object of class '<em>Timed Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Activity</em>'.
	 * @generated
	 */
	TimedActivity createTimedActivity();

	/**
	 * Returns a new object of class '<em>Instantaneous Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instantaneous Activity</em>'.
	 * @generated
	 */
	InstantaneousActivity createInstantaneousActivity();

	/**
	 * Returns a new object of class '<em>Input Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Gate</em>'.
	 * @generated
	 */
	InputGate createInputGate();

	/**
	 * Returns a new object of class '<em>Output Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Gate</em>'.
	 * @generated
	 */
	OutputGate createOutputGate();

	/**
	 * Returns a new object of class '<em>Global Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Variable</em>'.
	 * @generated
	 */
	GlobalVariable createGlobalVariable();

	/**
	 * Returns a new object of class '<em>Activity Place Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Place Case</em>'.
	 * @generated
	 */
	ActivityPlaceCase createActivityPlaceCase();

	/**
	 * Returns a new object of class '<em>Graphical Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graphical Element</em>'.
	 * @generated
	 */
	GraphicalElement createGraphicalElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SANModelPackage getSANModelPackage();

} //SANModelFactory
