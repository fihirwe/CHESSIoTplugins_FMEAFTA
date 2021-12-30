/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.ReceivePayload;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Incoming Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IncomingEventImpl#getReceivepayload <em>Receivepayload</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.IncomingEventImpl#getOutgoingevent <em>Outgoingevent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncomingEventImpl extends IoTEventImpl implements IncomingEvent {
	/**
	 * The cached value of the '{@link #getReceivepayload() <em>Receivepayload</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivepayload()
	 * @generated
	 * @ordered
	 */
	protected ReceivePayload receivepayload;

	/**
	 * The cached value of the '{@link #getOutgoingevent() <em>Outgoingevent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingevent()
	 * @generated
	 * @ordered
	 */
	protected OutgoingEvent outgoingevent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncomingEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSoftwarePackage.Literals.INCOMING_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceivePayload getReceivepayload() {
		if (receivepayload != null && receivepayload.eIsProxy()) {
			InternalEObject oldReceivepayload = (InternalEObject)receivepayload;
			receivepayload = (ReceivePayload)eResolveProxy(oldReceivepayload);
			if (receivepayload != oldReceivepayload) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.INCOMING_EVENT__RECEIVEPAYLOAD, oldReceivepayload, receivepayload));
			}
		}
		return receivepayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceivePayload basicGetReceivepayload() {
		return receivepayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivepayload(ReceivePayload newReceivepayload) {
		ReceivePayload oldReceivepayload = receivepayload;
		receivepayload = newReceivepayload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.INCOMING_EVENT__RECEIVEPAYLOAD, oldReceivepayload, receivepayload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutgoingEvent getOutgoingevent() {
		if (outgoingevent != null && outgoingevent.eIsProxy()) {
			InternalEObject oldOutgoingevent = (InternalEObject)outgoingevent;
			outgoingevent = (OutgoingEvent)eResolveProxy(oldOutgoingevent);
			if (outgoingevent != oldOutgoingevent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.INCOMING_EVENT__OUTGOINGEVENT, oldOutgoingevent, outgoingevent));
			}
		}
		return outgoingevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutgoingEvent basicGetOutgoingevent() {
		return outgoingevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutgoingevent(OutgoingEvent newOutgoingevent, NotificationChain msgs) {
		OutgoingEvent oldOutgoingevent = outgoingevent;
		outgoingevent = newOutgoingevent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.INCOMING_EVENT__OUTGOINGEVENT, oldOutgoingevent, newOutgoingevent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutgoingevent(OutgoingEvent newOutgoingevent) {
		if (newOutgoingevent != outgoingevent) {
			NotificationChain msgs = null;
			if (outgoingevent != null)
				msgs = ((InternalEObject)outgoingevent).eInverseRemove(this, CHESSIoTSoftwarePackage.OUTGOING_EVENT__INCOMINGEVENT, OutgoingEvent.class, msgs);
			if (newOutgoingevent != null)
				msgs = ((InternalEObject)newOutgoingevent).eInverseAdd(this, CHESSIoTSoftwarePackage.OUTGOING_EVENT__INCOMINGEVENT, OutgoingEvent.class, msgs);
			msgs = basicSetOutgoingevent(newOutgoingevent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.INCOMING_EVENT__OUTGOINGEVENT, newOutgoingevent, newOutgoingevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.INCOMING_EVENT__OUTGOINGEVENT:
				if (outgoingevent != null)
					msgs = ((InternalEObject)outgoingevent).eInverseRemove(this, CHESSIoTSoftwarePackage.OUTGOING_EVENT__INCOMINGEVENT, OutgoingEvent.class, msgs);
				return basicSetOutgoingevent((OutgoingEvent)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.INCOMING_EVENT__OUTGOINGEVENT:
				return basicSetOutgoingevent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.INCOMING_EVENT__RECEIVEPAYLOAD:
				if (resolve) return getReceivepayload();
				return basicGetReceivepayload();
			case CHESSIoTSoftwarePackage.INCOMING_EVENT__OUTGOINGEVENT:
				if (resolve) return getOutgoingevent();
				return basicGetOutgoingevent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.INCOMING_EVENT__RECEIVEPAYLOAD:
				setReceivepayload((ReceivePayload)newValue);
				return;
			case CHESSIoTSoftwarePackage.INCOMING_EVENT__OUTGOINGEVENT:
				setOutgoingevent((OutgoingEvent)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.INCOMING_EVENT__RECEIVEPAYLOAD:
				setReceivepayload((ReceivePayload)null);
				return;
			case CHESSIoTSoftwarePackage.INCOMING_EVENT__OUTGOINGEVENT:
				setOutgoingevent((OutgoingEvent)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.INCOMING_EVENT__RECEIVEPAYLOAD:
				return receivepayload != null;
			case CHESSIoTSoftwarePackage.INCOMING_EVENT__OUTGOINGEVENT:
				return outgoingevent != null;
		}
		return super.eIsSet(featureID);
	}

} //IncomingEventImpl
