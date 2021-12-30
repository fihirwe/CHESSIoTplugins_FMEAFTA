/**
 */
package org.polarsys.chess.mobius.model.SAN;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.polarsys.chess.mobius.model.SAN.SANModelFactory
 * @model kind="package"
 * @generated
 */
public interface SANModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SAN";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/chess/SAN";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SAN";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SANModelPackage eINSTANCE = org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.chess.mobius.model.SAN.impl.GraphicalElementImpl <em>Graphical Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.mobius.model.SAN.impl.GraphicalElementImpl
	 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getGraphicalElement()
	 * @generated
	 */
	int GRAPHICAL_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT__Y = 1;

	/**
	 * The number of structural features of the '<em>Graphical Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Graphical Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.mobius.model.SAN.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.mobius.model.SAN.impl.NamedElementImpl
	 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__X = GRAPHICAL_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__Y = GRAPHICAL_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.mobius.model.SAN.impl.SANModelImpl <em>SAN Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelImpl
	 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getSANModel()
	 * @generated
	 */
	int SAN_MODEL = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAN_MODEL__X = NAMED_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAN_MODEL__Y = NAMED_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAN_MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAN_MODEL__NODE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SAN Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAN_MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAN_MODEL___VALIDATE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get All Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAN_MODEL___GET_ALL_NODES = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>SAN Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAN_MODEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.mobius.model.SAN.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.mobius.model.SAN.impl.NodeImpl
	 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__X = NAMED_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__Y = NAMED_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Global Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__GLOBAL_VARIABLE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___VALIDATE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.mobius.model.SAN.impl.ComposedNodeImpl <em>Composed Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.mobius.model.SAN.impl.ComposedNodeImpl
	 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getComposedNode()
	 * @generated
	 */
	int COMPOSED_NODE = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_NODE__X = NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_NODE__Y = NODE__Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Global Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_NODE__GLOBAL_VARIABLE = NODE__GLOBAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>State Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_NODE__STATE_VARIABLES = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_NODE__CHILD = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composed Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_NODE___VALIDATE__DIAGNOSTICCHAIN_MAP = NODE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Composed Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.mobius.model.SAN.impl.SharedStateImpl <em>Shared State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.mobius.model.SAN.impl.SharedStateImpl
	 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getSharedState()
	 * @generated
	 */
	int SHARED_STATE = 4;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STATE__X = NAMED_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STATE__Y = NAMED_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STATE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STATE__PLACE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shared States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STATE__SHARED_STATES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shared State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STATE___VALIDATE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Shared State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_STATE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.mobius.model.SAN.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.mobius.model.SAN.impl.JoinImpl
	 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 5;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__X = COMPOSED_NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__Y = COMPOSED_NODE__Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__NAME = COMPOSED_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Global Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__GLOBAL_VARIABLE = COMPOSED_NODE__GLOBAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>State Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__STATE_VARIABLES = COMPOSED_NODE__STATE_VARIABLES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__CHILD = COMPOSED_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = COMPOSED_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN___VALIDATE__DIAGNOSTICCHAIN_MAP = COMPOSED_NODE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_OPERATION_COUNT = COMPOSED_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.mobius.model.SAN.impl.RepImpl <em>Rep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.mobius.model.SAN.impl.RepImpl
	 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getRep()
	 * @generated
	 */
	int REP = 6;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REP__X = COMPOSED_NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REP__Y = COMPOSED_NODE__Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REP__NAME = COMPOSED_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Global Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REP__GLOBAL_VARIABLE = COMPOSED_NODE__GLOBAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>State Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REP__STATE_VARIABLES = COMPOSED_NODE__STATE_VARIABLES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REP__CHILD = COMPOSED_NODE__CHILD;

	/**
	 * The feature id for the '<em><b>Numb Of Reps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REP__NUMB_OF_REPS = COMPOSED_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REP_FEATURE_COUNT = COMPOSED_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REP___VALIDATE__DIAGNOSTICCHAIN_MAP = COMPOSED_NODE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Rep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REP_OPERATION_COUNT = COMPOSED_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.mobius.model.SAN.impl.AtomicNodeImpl <em>Atomic Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.mobius.model.SAN.impl.AtomicNodeImpl
	 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getAtomicNode()
	 * @generated
	 */
	int ATOMIC_NODE = 7;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_NODE__X = NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_NODE__Y = NODE__Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Global Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_NODE__GLOBAL_VARIABLE = NODE__GLOBAL_VARIABLE;

	/**
	 * The feature id for the '<em><b>Place</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_NODE__PLACE = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timed Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_NODE__TIMED_ACTIVITY = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instantaneous Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_NODE__INSTANTANEOUS_ACTIVITY = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_NODE__INPUT_GATE = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_NODE__OUTPUT_GATE = NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_NODE__MODEL = NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Atomic Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_NODE___VALIDATE__DIAGNOSTICCHAIN_MAP = NODE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Atomic Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.mobius.model.SAN.impl.PrimitiveImpl <em>Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.mobius.model.SAN.impl.PrimitiveImpl
	 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getPrimitive()
	 * @generated
	 */
	int PRIMITIVE = 18;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__X = NAMED_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__Y = NAMED_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE___VALIDATE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.mobius.model.SAN.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.mobius.model.SAN.impl.PlaceImpl
	 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 8;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__X = PRIMITIVE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__Y = PRIMITIVE__Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ACTIVITY = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Gate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__INPUT_GATE = PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__INITIAL_STATE = PRIMITIVE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE___VALIDATE__DIAGNOSTICCHAIN_MAP = PRIMITIVE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.mobius.model.SAN.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.mobius.model.SAN.impl.ActivityImpl
	 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 13;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__X = NAMED_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__Y = NAMED_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PLACE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Gate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUTPUT_GATE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Case</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CASE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Placecase</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PLACECASE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___VALIDATE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.mobius.model.SAN.impl.TimedActivityImpl <em>Timed Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.mobius.model.SAN.impl.TimedActivityImpl
	 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getTimedActivity()
	 * @generated
	 */
	int TIMED_ACTIVITY = 9;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY__X = ACTIVITY__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY__Y = ACTIVITY__Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY__PLACE = ACTIVITY__PLACE;

	/**
	 * The feature id for the '<em><b>Output Gate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY__OUTPUT_GATE = ACTIVITY__OUTPUT_GATE;

	/**
	 * The feature id for the '<em><b>Case</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY__CASE = ACTIVITY__CASE;

	/**
	 * The feature id for the '<em><b>Placecase</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY__PLACECASE = ACTIVITY__PLACECASE;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY__RATE = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Distribution Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY__TIME_DISTRIBUTION_FUNCTION = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Timed Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY___VALIDATE__DIAGNOSTICCHAIN_MAP = ACTIVITY___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Timed Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.mobius.model.SAN.impl.InstantaneousActivityImpl <em>Instantaneous Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.mobius.model.SAN.impl.InstantaneousActivityImpl
	 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getInstantaneousActivity()
	 * @generated
	 */
	int INSTANTANEOUS_ACTIVITY = 10;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTANEOUS_ACTIVITY__X = ACTIVITY__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTANEOUS_ACTIVITY__Y = ACTIVITY__Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTANEOUS_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTANEOUS_ACTIVITY__PLACE = ACTIVITY__PLACE;

	/**
	 * The feature id for the '<em><b>Output Gate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTANEOUS_ACTIVITY__OUTPUT_GATE = ACTIVITY__OUTPUT_GATE;

	/**
	 * The feature id for the '<em><b>Case</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTANEOUS_ACTIVITY__CASE = ACTIVITY__CASE;

	/**
	 * The feature id for the '<em><b>Placecase</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTANEOUS_ACTIVITY__PLACECASE = ACTIVITY__PLACECASE;

	/**
	 * The number of structural features of the '<em>Instantaneous Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTANEOUS_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTANEOUS_ACTIVITY___VALIDATE__DIAGNOSTICCHAIN_MAP = ACTIVITY___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Instantaneous Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTANEOUS_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.mobius.model.SAN.impl.InputGateImpl <em>Input Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.mobius.model.SAN.impl.InputGateImpl
	 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getInputGate()
	 * @generated
	 */
	int INPUT_GATE = 11;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GATE__X = PRIMITIVE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GATE__Y = PRIMITIVE__Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GATE__NAME = PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Input Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GATE__INPUT_PREDICATED = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GATE__INPUT_FUNCTION = PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GATE__ACTIVITY = PRIMITIVE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Input Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GATE_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GATE___VALIDATE__DIAGNOSTICCHAIN_MAP = PRIMITIVE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Input Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GATE_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.mobius.model.SAN.impl.OutputGateImpl <em>Output Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.mobius.model.SAN.impl.OutputGateImpl
	 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getOutputGate()
	 * @generated
	 */
	int OUTPUT_GATE = 12;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE__X = INPUT_GATE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE__Y = INPUT_GATE__Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE__NAME = INPUT_GATE__NAME;

	/**
	 * The feature id for the '<em><b>Input Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE__INPUT_PREDICATED = INPUT_GATE__INPUT_PREDICATED;

	/**
	 * The feature id for the '<em><b>Input Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE__INPUT_FUNCTION = INPUT_GATE__INPUT_FUNCTION;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE__ACTIVITY = INPUT_GATE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Output Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE__OUTPUT_FUNCTION = INPUT_GATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE_FEATURE_COUNT = INPUT_GATE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE___VALIDATE__DIAGNOSTICCHAIN_MAP = INPUT_GATE___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Output Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GATE_OPERATION_COUNT = INPUT_GATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.chess.mobius.model.SAN.impl.GateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.mobius.model.SAN.impl.GateImpl
	 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getGate()
	 * @generated
	 */
	int GATE = 14;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__X = NAMED_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__Y = NAMED_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Place</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__PLACE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE___VALIDATE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.polarsys.chess.mobius.model.SAN.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.mobius.model.SAN.impl.GlobalVariableImpl
	 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getGlobalVariable()
	 * @generated
	 */
	int GLOBAL_VARIABLE = 15;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__X = NAMED_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__Y = NAMED_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE___VALIDATE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.polarsys.chess.mobius.model.SAN.impl.ActivityPlaceCaseImpl <em>Activity Place Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.chess.mobius.model.SAN.impl.ActivityPlaceCaseImpl
	 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getActivityPlaceCase()
	 * @generated
	 */
	int ACTIVITY_PLACE_CASE = 16;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PLACE_CASE__X = GRAPHICAL_ELEMENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PLACE_CASE__Y = GRAPHICAL_ELEMENT__Y;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PLACE_CASE__PLACE = GRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PLACE_CASE__CASE = GRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Place Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PLACE_CASE_FEATURE_COUNT = GRAPHICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Activity Place Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PLACE_CASE_OPERATION_COUNT = GRAPHICAL_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.mobius.model.SAN.SANModel <em>SAN Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SAN Model</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.SANModel
	 * @generated
	 */
	EClass getSANModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.chess.mobius.model.SAN.SANModel#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.SANModel#getNode()
	 * @see #getSANModel()
	 * @generated
	 */
	EReference getSANModel_Node();

	/**
	 * Returns the meta object for the '{@link org.polarsys.chess.mobius.model.SAN.SANModel#getAllNodes() <em>Get All Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Nodes</em>' operation.
	 * @see org.polarsys.chess.mobius.model.SAN.SANModel#getAllNodes()
	 * @generated
	 */
	EOperation getSANModel__GetAllNodes();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.mobius.model.SAN.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.mobius.model.SAN.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the '{@link org.polarsys.chess.mobius.model.SAN.NamedElement#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see org.polarsys.chess.mobius.model.SAN.NamedElement#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNamedElement__Validate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.mobius.model.SAN.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.chess.mobius.model.SAN.Node#getGlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Variable</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.Node#getGlobalVariable()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_GlobalVariable();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.mobius.model.SAN.ComposedNode <em>Composed Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composed Node</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.ComposedNode
	 * @generated
	 */
	EClass getComposedNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.chess.mobius.model.SAN.ComposedNode#getStateVariables <em>State Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Variables</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.ComposedNode#getStateVariables()
	 * @see #getComposedNode()
	 * @generated
	 */
	EReference getComposedNode_StateVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.chess.mobius.model.SAN.ComposedNode#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.ComposedNode#getChild()
	 * @see #getComposedNode()
	 * @generated
	 */
	EReference getComposedNode_Child();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.mobius.model.SAN.SharedState <em>Shared State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared State</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.SharedState
	 * @generated
	 */
	EClass getSharedState();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.mobius.model.SAN.SharedState#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Place</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.SharedState#getPlace()
	 * @see #getSharedState()
	 * @generated
	 */
	EReference getSharedState_Place();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.mobius.model.SAN.SharedState#getSharedStates <em>Shared States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shared States</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.SharedState#getSharedStates()
	 * @see #getSharedState()
	 * @generated
	 */
	EReference getSharedState_SharedStates();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.mobius.model.SAN.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.mobius.model.SAN.Rep <em>Rep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rep</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.Rep
	 * @generated
	 */
	EClass getRep();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.mobius.model.SAN.Rep#getNumbOfReps <em>Numb Of Reps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numb Of Reps</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.Rep#getNumbOfReps()
	 * @see #getRep()
	 * @generated
	 */
	EAttribute getRep_NumbOfReps();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.mobius.model.SAN.AtomicNode <em>Atomic Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Node</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.AtomicNode
	 * @generated
	 */
	EClass getAtomicNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.chess.mobius.model.SAN.AtomicNode#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Place</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.AtomicNode#getPlace()
	 * @see #getAtomicNode()
	 * @generated
	 */
	EReference getAtomicNode_Place();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.chess.mobius.model.SAN.AtomicNode#getTimedActivity <em>Timed Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timed Activity</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.AtomicNode#getTimedActivity()
	 * @see #getAtomicNode()
	 * @generated
	 */
	EReference getAtomicNode_TimedActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.chess.mobius.model.SAN.AtomicNode#getInstantaneousActivity <em>Instantaneous Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instantaneous Activity</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.AtomicNode#getInstantaneousActivity()
	 * @see #getAtomicNode()
	 * @generated
	 */
	EReference getAtomicNode_InstantaneousActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.chess.mobius.model.SAN.AtomicNode#getInputGate <em>Input Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Gate</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.AtomicNode#getInputGate()
	 * @see #getAtomicNode()
	 * @generated
	 */
	EReference getAtomicNode_InputGate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.chess.mobius.model.SAN.AtomicNode#getOutputGate <em>Output Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Gate</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.AtomicNode#getOutputGate()
	 * @see #getAtomicNode()
	 * @generated
	 */
	EReference getAtomicNode_OutputGate();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.mobius.model.SAN.AtomicNode#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.AtomicNode#getModel()
	 * @see #getAtomicNode()
	 * @generated
	 */
	EAttribute getAtomicNode_Model();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.mobius.model.SAN.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.mobius.model.SAN.Place#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.Place#getActivity()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Activity();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.mobius.model.SAN.Place#getInputGate <em>Input Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Gate</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.Place#getInputGate()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_InputGate();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.mobius.model.SAN.Place#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial State</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.Place#getInitialState()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_InitialState();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.mobius.model.SAN.TimedActivity <em>Timed Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Activity</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.TimedActivity
	 * @generated
	 */
	EClass getTimedActivity();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.mobius.model.SAN.TimedActivity#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.TimedActivity#getRate()
	 * @see #getTimedActivity()
	 * @generated
	 */
	EAttribute getTimedActivity_Rate();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.mobius.model.SAN.TimedActivity#getTimeDistributionFunction <em>Time Distribution Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Distribution Function</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.TimedActivity#getTimeDistributionFunction()
	 * @see #getTimedActivity()
	 * @generated
	 */
	EAttribute getTimedActivity_TimeDistributionFunction();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.mobius.model.SAN.InstantaneousActivity <em>Instantaneous Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instantaneous Activity</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.InstantaneousActivity
	 * @generated
	 */
	EClass getInstantaneousActivity();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.mobius.model.SAN.InputGate <em>Input Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Gate</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.InputGate
	 * @generated
	 */
	EClass getInputGate();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.mobius.model.SAN.InputGate#getInputPredicated <em>Input Predicated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Predicated</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.InputGate#getInputPredicated()
	 * @see #getInputGate()
	 * @generated
	 */
	EAttribute getInputGate_InputPredicated();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.mobius.model.SAN.InputGate#getInputFunction <em>Input Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Function</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.InputGate#getInputFunction()
	 * @see #getInputGate()
	 * @generated
	 */
	EAttribute getInputGate_InputFunction();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.mobius.model.SAN.InputGate#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.InputGate#getActivity()
	 * @see #getInputGate()
	 * @generated
	 */
	EReference getInputGate_Activity();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.mobius.model.SAN.OutputGate <em>Output Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Gate</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.OutputGate
	 * @generated
	 */
	EClass getOutputGate();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.mobius.model.SAN.OutputGate#getOutputFunction <em>Output Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Function</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.OutputGate#getOutputFunction()
	 * @see #getOutputGate()
	 * @generated
	 */
	EAttribute getOutputGate_OutputFunction();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.mobius.model.SAN.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.mobius.model.SAN.Activity#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Place</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.Activity#getPlace()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Place();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.mobius.model.SAN.Activity#getOutputGate <em>Output Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Gate</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.Activity#getOutputGate()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_OutputGate();

	/**
	 * Returns the meta object for the attribute list '{@link org.polarsys.chess.mobius.model.SAN.Activity#getCase <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Case</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.Activity#getCase()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Case();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.chess.mobius.model.SAN.Activity#getPlacecase <em>Placecase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Placecase</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.Activity#getPlacecase()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Placecase();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.mobius.model.SAN.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.Gate
	 * @generated
	 */
	EClass getGate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.chess.mobius.model.SAN.Gate#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Place</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.Gate#getPlace()
	 * @see #getGate()
	 * @generated
	 */
	EReference getGate_Place();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.mobius.model.SAN.GlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Variable</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.GlobalVariable
	 * @generated
	 */
	EClass getGlobalVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.mobius.model.SAN.GlobalVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.GlobalVariable#getType()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EAttribute getGlobalVariable_Type();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.mobius.model.SAN.ActivityPlaceCase <em>Activity Place Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Place Case</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.ActivityPlaceCase
	 * @generated
	 */
	EClass getActivityPlaceCase();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.chess.mobius.model.SAN.ActivityPlaceCase#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Place</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.ActivityPlaceCase#getPlace()
	 * @see #getActivityPlaceCase()
	 * @generated
	 */
	EReference getActivityPlaceCase_Place();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.mobius.model.SAN.ActivityPlaceCase#getCase <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.ActivityPlaceCase#getCase()
	 * @see #getActivityPlaceCase()
	 * @generated
	 */
	EAttribute getActivityPlaceCase_Case();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.mobius.model.SAN.GraphicalElement <em>Graphical Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphical Element</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.GraphicalElement
	 * @generated
	 */
	EClass getGraphicalElement();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.mobius.model.SAN.GraphicalElement#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.GraphicalElement#getX()
	 * @see #getGraphicalElement()
	 * @generated
	 */
	EAttribute getGraphicalElement_X();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.chess.mobius.model.SAN.GraphicalElement#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.GraphicalElement#getY()
	 * @see #getGraphicalElement()
	 * @generated
	 */
	EAttribute getGraphicalElement_Y();

	/**
	 * Returns the meta object for class '{@link org.polarsys.chess.mobius.model.SAN.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive</em>'.
	 * @see org.polarsys.chess.mobius.model.SAN.Primitive
	 * @generated
	 */
	EClass getPrimitive();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SANModelFactory getSANModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.polarsys.chess.mobius.model.SAN.impl.SANModelImpl <em>SAN Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelImpl
		 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getSANModel()
		 * @generated
		 */
		EClass SAN_MODEL = eINSTANCE.getSANModel();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAN_MODEL__NODE = eINSTANCE.getSANModel_Node();

		/**
		 * The meta object literal for the '<em><b>Get All Nodes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SAN_MODEL___GET_ALL_NODES = eINSTANCE.getSANModel__GetAllNodes();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.mobius.model.SAN.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.mobius.model.SAN.impl.NamedElementImpl
		 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMED_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getNamedElement__Validate__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.mobius.model.SAN.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.mobius.model.SAN.impl.NodeImpl
		 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Global Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__GLOBAL_VARIABLE = eINSTANCE.getNode_GlobalVariable();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.mobius.model.SAN.impl.ComposedNodeImpl <em>Composed Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.mobius.model.SAN.impl.ComposedNodeImpl
		 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getComposedNode()
		 * @generated
		 */
		EClass COMPOSED_NODE = eINSTANCE.getComposedNode();

		/**
		 * The meta object literal for the '<em><b>State Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_NODE__STATE_VARIABLES = eINSTANCE.getComposedNode_StateVariables();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_NODE__CHILD = eINSTANCE.getComposedNode_Child();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.mobius.model.SAN.impl.SharedStateImpl <em>Shared State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.mobius.model.SAN.impl.SharedStateImpl
		 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getSharedState()
		 * @generated
		 */
		EClass SHARED_STATE = eINSTANCE.getSharedState();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_STATE__PLACE = eINSTANCE.getSharedState_Place();

		/**
		 * The meta object literal for the '<em><b>Shared States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_STATE__SHARED_STATES = eINSTANCE.getSharedState_SharedStates();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.mobius.model.SAN.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.mobius.model.SAN.impl.JoinImpl
		 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.mobius.model.SAN.impl.RepImpl <em>Rep</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.mobius.model.SAN.impl.RepImpl
		 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getRep()
		 * @generated
		 */
		EClass REP = eINSTANCE.getRep();

		/**
		 * The meta object literal for the '<em><b>Numb Of Reps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REP__NUMB_OF_REPS = eINSTANCE.getRep_NumbOfReps();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.mobius.model.SAN.impl.AtomicNodeImpl <em>Atomic Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.mobius.model.SAN.impl.AtomicNodeImpl
		 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getAtomicNode()
		 * @generated
		 */
		EClass ATOMIC_NODE = eINSTANCE.getAtomicNode();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_NODE__PLACE = eINSTANCE.getAtomicNode_Place();

		/**
		 * The meta object literal for the '<em><b>Timed Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_NODE__TIMED_ACTIVITY = eINSTANCE.getAtomicNode_TimedActivity();

		/**
		 * The meta object literal for the '<em><b>Instantaneous Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_NODE__INSTANTANEOUS_ACTIVITY = eINSTANCE.getAtomicNode_InstantaneousActivity();

		/**
		 * The meta object literal for the '<em><b>Input Gate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_NODE__INPUT_GATE = eINSTANCE.getAtomicNode_InputGate();

		/**
		 * The meta object literal for the '<em><b>Output Gate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_NODE__OUTPUT_GATE = eINSTANCE.getAtomicNode_OutputGate();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_NODE__MODEL = eINSTANCE.getAtomicNode_Model();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.mobius.model.SAN.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.mobius.model.SAN.impl.PlaceImpl
		 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__ACTIVITY = eINSTANCE.getPlace_Activity();

		/**
		 * The meta object literal for the '<em><b>Input Gate</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__INPUT_GATE = eINSTANCE.getPlace_InputGate();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__INITIAL_STATE = eINSTANCE.getPlace_InitialState();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.mobius.model.SAN.impl.TimedActivityImpl <em>Timed Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.mobius.model.SAN.impl.TimedActivityImpl
		 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getTimedActivity()
		 * @generated
		 */
		EClass TIMED_ACTIVITY = eINSTANCE.getTimedActivity();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_ACTIVITY__RATE = eINSTANCE.getTimedActivity_Rate();

		/**
		 * The meta object literal for the '<em><b>Time Distribution Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_ACTIVITY__TIME_DISTRIBUTION_FUNCTION = eINSTANCE.getTimedActivity_TimeDistributionFunction();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.mobius.model.SAN.impl.InstantaneousActivityImpl <em>Instantaneous Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.mobius.model.SAN.impl.InstantaneousActivityImpl
		 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getInstantaneousActivity()
		 * @generated
		 */
		EClass INSTANTANEOUS_ACTIVITY = eINSTANCE.getInstantaneousActivity();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.mobius.model.SAN.impl.InputGateImpl <em>Input Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.mobius.model.SAN.impl.InputGateImpl
		 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getInputGate()
		 * @generated
		 */
		EClass INPUT_GATE = eINSTANCE.getInputGate();

		/**
		 * The meta object literal for the '<em><b>Input Predicated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_GATE__INPUT_PREDICATED = eINSTANCE.getInputGate_InputPredicated();

		/**
		 * The meta object literal for the '<em><b>Input Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_GATE__INPUT_FUNCTION = eINSTANCE.getInputGate_InputFunction();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_GATE__ACTIVITY = eINSTANCE.getInputGate_Activity();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.mobius.model.SAN.impl.OutputGateImpl <em>Output Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.mobius.model.SAN.impl.OutputGateImpl
		 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getOutputGate()
		 * @generated
		 */
		EClass OUTPUT_GATE = eINSTANCE.getOutputGate();

		/**
		 * The meta object literal for the '<em><b>Output Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_GATE__OUTPUT_FUNCTION = eINSTANCE.getOutputGate_OutputFunction();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.mobius.model.SAN.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.mobius.model.SAN.impl.ActivityImpl
		 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__PLACE = eINSTANCE.getActivity_Place();

		/**
		 * The meta object literal for the '<em><b>Output Gate</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__OUTPUT_GATE = eINSTANCE.getActivity_OutputGate();

		/**
		 * The meta object literal for the '<em><b>Case</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__CASE = eINSTANCE.getActivity_Case();

		/**
		 * The meta object literal for the '<em><b>Placecase</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__PLACECASE = eINSTANCE.getActivity_Placecase();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.mobius.model.SAN.impl.GateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.mobius.model.SAN.impl.GateImpl
		 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getGate()
		 * @generated
		 */
		EClass GATE = eINSTANCE.getGate();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE__PLACE = eINSTANCE.getGate_Place();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.mobius.model.SAN.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.mobius.model.SAN.impl.GlobalVariableImpl
		 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getGlobalVariable()
		 * @generated
		 */
		EClass GLOBAL_VARIABLE = eINSTANCE.getGlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_VARIABLE__TYPE = eINSTANCE.getGlobalVariable_Type();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.mobius.model.SAN.impl.ActivityPlaceCaseImpl <em>Activity Place Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.mobius.model.SAN.impl.ActivityPlaceCaseImpl
		 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getActivityPlaceCase()
		 * @generated
		 */
		EClass ACTIVITY_PLACE_CASE = eINSTANCE.getActivityPlaceCase();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PLACE_CASE__PLACE = eINSTANCE.getActivityPlaceCase_Place();

		/**
		 * The meta object literal for the '<em><b>Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_PLACE_CASE__CASE = eINSTANCE.getActivityPlaceCase_Case();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.mobius.model.SAN.impl.GraphicalElementImpl <em>Graphical Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.mobius.model.SAN.impl.GraphicalElementImpl
		 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getGraphicalElement()
		 * @generated
		 */
		EClass GRAPHICAL_ELEMENT = eINSTANCE.getGraphicalElement();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICAL_ELEMENT__X = eINSTANCE.getGraphicalElement_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICAL_ELEMENT__Y = eINSTANCE.getGraphicalElement_Y();

		/**
		 * The meta object literal for the '{@link org.polarsys.chess.mobius.model.SAN.impl.PrimitiveImpl <em>Primitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.chess.mobius.model.SAN.impl.PrimitiveImpl
		 * @see org.polarsys.chess.mobius.model.SAN.impl.SANModelPackageImpl#getPrimitive()
		 * @generated
		 */
		EClass PRIMITIVE = eINSTANCE.getPrimitive();

	}

} //SANModelPackage
