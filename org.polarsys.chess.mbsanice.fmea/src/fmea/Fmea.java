/**
 */
package fmea;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fmea</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fmea.Fmea#getRow <em>Row</em>}</li>
 * </ul>
 *
 * @see fmea.FmeaPackage#getFmea()
 * @model
 * @generated
 */
public interface Fmea extends EObject {
	/**
	 * Returns the value of the '<em><b>Row</b></em>' containment reference list.
	 * The list contents are of type {@link fmea.Row}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' containment reference list.
	 * @see fmea.FmeaPackage#getFmea_Row()
	 * @model containment="true"
	 * @generated
	 */
	EList<Row> getRow();

} // Fmea
