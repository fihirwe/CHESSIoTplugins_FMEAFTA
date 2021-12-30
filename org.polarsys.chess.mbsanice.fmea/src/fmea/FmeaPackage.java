/**
 */
package fmea;

import org.eclipse.emf.ecore.EClass;
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
 * @see fmea.FmeaFactory
 * @model kind="package"
 * @generated
 */
public interface FmeaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fmea";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/chess/mbsanice/fmea";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FmeaPackage eINSTANCE = fmea.impl.FmeaPackageImpl.init();

	/**
	 * The meta object id for the '{@link fmea.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fmea.impl.RowImpl
	 * @see fmea.impl.FmeaPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 0;

	/**
	 * The feature id for the '<em><b>Local Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__LOCAL_PORT = 0;

	/**
	 * The feature id for the '<em><b>Failure Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__FAILURE_MODE = 1;

	/**
	 * The feature id for the '<em><b>Local Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__LOCAL_EFFECT = 2;

	/**
	 * The feature id for the '<em><b>End Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__END_PORT = 3;

	/**
	 * The feature id for the '<em><b>End Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__END_EFFECT = 4;

	/**
	 * The feature id for the '<em><b>Inter Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__INTER_PORTS = 5;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fmea.impl.InterPortImpl <em>Inter Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fmea.impl.InterPortImpl
	 * @see fmea.impl.FmeaPackageImpl#getInterPort()
	 * @generated
	 */
	int INTER_PORT = 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PORT__PORT = 0;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PORT__FAILURE = 1;

	/**
	 * The number of structural features of the '<em>Inter Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Inter Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fmea.impl.FmeaImpl <em>Fmea</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fmea.impl.FmeaImpl
	 * @see fmea.impl.FmeaPackageImpl#getFmea()
	 * @generated
	 */
	int FMEA = 2;

	/**
	 * The feature id for the '<em><b>Row</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA__ROW = 0;

	/**
	 * The number of structural features of the '<em>Fmea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Fmea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link fmea.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see fmea.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the reference '{@link fmea.Row#getLocalPort <em>Local Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Local Port</em>'.
	 * @see fmea.Row#getLocalPort()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_LocalPort();

	/**
	 * Returns the meta object for the reference list '{@link fmea.Row#getFailureMode <em>Failure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Failure Mode</em>'.
	 * @see fmea.Row#getFailureMode()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_FailureMode();

	/**
	 * Returns the meta object for the reference '{@link fmea.Row#getLocalEffect <em>Local Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Local Effect</em>'.
	 * @see fmea.Row#getLocalEffect()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_LocalEffect();

	/**
	 * Returns the meta object for the reference '{@link fmea.Row#getEndPort <em>End Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Port</em>'.
	 * @see fmea.Row#getEndPort()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_EndPort();

	/**
	 * Returns the meta object for the reference '{@link fmea.Row#getEndEffect <em>End Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Effect</em>'.
	 * @see fmea.Row#getEndEffect()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_EndEffect();

	/**
	 * Returns the meta object for the containment reference list '{@link fmea.Row#getInterPorts <em>Inter Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inter Ports</em>'.
	 * @see fmea.Row#getInterPorts()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_InterPorts();

	/**
	 * Returns the meta object for class '{@link fmea.InterPort <em>Inter Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inter Port</em>'.
	 * @see fmea.InterPort
	 * @generated
	 */
	EClass getInterPort();

	/**
	 * Returns the meta object for the reference '{@link fmea.InterPort#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see fmea.InterPort#getPort()
	 * @see #getInterPort()
	 * @generated
	 */
	EReference getInterPort_Port();

	/**
	 * Returns the meta object for the reference '{@link fmea.InterPort#getFailure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Failure</em>'.
	 * @see fmea.InterPort#getFailure()
	 * @see #getInterPort()
	 * @generated
	 */
	EReference getInterPort_Failure();

	/**
	 * Returns the meta object for class '{@link fmea.Fmea <em>Fmea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fmea</em>'.
	 * @see fmea.Fmea
	 * @generated
	 */
	EClass getFmea();

	/**
	 * Returns the meta object for the containment reference list '{@link fmea.Fmea#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Row</em>'.
	 * @see fmea.Fmea#getRow()
	 * @see #getFmea()
	 * @generated
	 */
	EReference getFmea_Row();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FmeaFactory getFmeaFactory();

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
		 * The meta object literal for the '{@link fmea.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fmea.impl.RowImpl
		 * @see fmea.impl.FmeaPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Local Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__LOCAL_PORT = eINSTANCE.getRow_LocalPort();

		/**
		 * The meta object literal for the '<em><b>Failure Mode</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__FAILURE_MODE = eINSTANCE.getRow_FailureMode();

		/**
		 * The meta object literal for the '<em><b>Local Effect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__LOCAL_EFFECT = eINSTANCE.getRow_LocalEffect();

		/**
		 * The meta object literal for the '<em><b>End Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__END_PORT = eINSTANCE.getRow_EndPort();

		/**
		 * The meta object literal for the '<em><b>End Effect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__END_EFFECT = eINSTANCE.getRow_EndEffect();

		/**
		 * The meta object literal for the '<em><b>Inter Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__INTER_PORTS = eINSTANCE.getRow_InterPorts();

		/**
		 * The meta object literal for the '{@link fmea.impl.InterPortImpl <em>Inter Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fmea.impl.InterPortImpl
		 * @see fmea.impl.FmeaPackageImpl#getInterPort()
		 * @generated
		 */
		EClass INTER_PORT = eINSTANCE.getInterPort();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTER_PORT__PORT = eINSTANCE.getInterPort_Port();

		/**
		 * The meta object literal for the '<em><b>Failure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTER_PORT__FAILURE = eINSTANCE.getInterPort_Failure();

		/**
		 * The meta object literal for the '{@link fmea.impl.FmeaImpl <em>Fmea</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fmea.impl.FmeaImpl
		 * @see fmea.impl.FmeaPackageImpl#getFmea()
		 * @generated
		 */
		EClass FMEA = eINSTANCE.getFmea();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMEA__ROW = eINSTANCE.getFmea_Row();

	}

} //FmeaPackage
