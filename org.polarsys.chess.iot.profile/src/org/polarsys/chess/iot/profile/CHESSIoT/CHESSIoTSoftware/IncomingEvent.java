/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incoming Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent#getReceivepayload <em>Receivepayload</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent#getOutgoingevent <em>Outgoingevent</em>}</li>
 * </ul>
 *
 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getIncomingEvent()
 * @model
 * @generated
 */
public interface IncomingEvent extends IoTEvent {
	/**
	 * Returns the value of the '<em><b>Receivepayload</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receivepayload</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receivepayload</em>' reference.
	 * @see #setReceivepayload(ReceivePayload)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getIncomingEvent_Receivepayload()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ReceivePayload getReceivepayload();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent#getReceivepayload <em>Receivepayload</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receivepayload</em>' reference.
	 * @see #getReceivepayload()
	 * @generated
	 */
	void setReceivepayload(ReceivePayload value);

	/**
	 * Returns the value of the '<em><b>Outgoingevent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent#getIncomingevent <em>Incomingevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoingevent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoingevent</em>' reference.
	 * @see #setOutgoingevent(OutgoingEvent)
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage#getIncomingEvent_Outgoingevent()
	 * @see org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent#getIncomingevent
	 * @model opposite="incomingevent" required="true" ordered="false"
	 * @generated
	 */
	OutgoingEvent getOutgoingevent();

	/**
	 * Sets the value of the '{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent#getOutgoingevent <em>Outgoingevent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoingevent</em>' reference.
	 * @see #getOutgoingevent()
	 * @generated
	 */
	void setOutgoingevent(OutgoingEvent value);

} // IncomingEvent
