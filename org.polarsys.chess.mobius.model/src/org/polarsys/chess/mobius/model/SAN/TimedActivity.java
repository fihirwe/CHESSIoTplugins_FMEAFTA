/**
 */
package org.polarsys.chess.mobius.model.SAN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.TimedActivity#getRate <em>Rate</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.TimedActivity#getTimeDistributionFunction <em>Time Distribution Function</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getTimedActivity()
 * @model
 * @generated
 */
public interface TimedActivity extends Activity {

	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(String)
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getTimedActivity_Rate()
	 * @model
	 * @generated
	 */
	String getRate();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.mobius.model.SAN.TimedActivity#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(String value);

	/**
	 * Returns the value of the '<em><b>Time Distribution Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Distribution Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Distribution Function</em>' attribute.
	 * @see #setTimeDistributionFunction(String)
	 * @see org.polarsys.chess.mobius.model.SAN.SANModelPackage#getTimedActivity_TimeDistributionFunction()
	 * @model
	 * @generated
	 */
	String getTimeDistributionFunction();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.mobius.model.SAN.TimedActivity#getTimeDistributionFunction <em>Time Distribution Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Distribution Function</em>' attribute.
	 * @see #getTimeDistributionFunction()
	 * @generated
	 */
	void setTimeDistributionFunction(String value);
} // TimedActivity
