/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IncomingEvent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.OutgoingEvent;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.SendPayload;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outgoing Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.OutgoingEventImpl#isPeriodic <em>Is Periodic</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.OutgoingEventImpl#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.OutgoingEventImpl#getSendpayload <em>Sendpayload</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.OutgoingEventImpl#getIncomingevent <em>Incomingevent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutgoingEventImpl extends IoTEventImpl implements OutgoingEvent {
	/**
	 * The default value of the '{@link #isPeriodic() <em>Is Periodic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPeriodic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PERIODIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPeriodic() <em>Is Periodic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPeriodic()
	 * @generated
	 * @ordered
	 */
	protected boolean isPeriodic = IS_PERIODIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeInterval() <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_INTERVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeInterval() <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected int timeInterval = TIME_INTERVAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSendpayload() <em>Sendpayload</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendpayload()
	 * @generated
	 * @ordered
	 */
	protected EList<SendPayload> sendpayload;

	/**
	 * The cached value of the '{@link #getIncomingevent() <em>Incomingevent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingevent()
	 * @generated
	 * @ordered
	 */
	protected IncomingEvent incomingevent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutgoingEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSoftwarePackage.Literals.OUTGOING_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPeriodic() {
		return isPeriodic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPeriodic(boolean newIsPeriodic) {
		boolean oldIsPeriodic = isPeriodic;
		isPeriodic = newIsPeriodic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.OUTGOING_EVENT__IS_PERIODIC, oldIsPeriodic, isPeriodic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimeInterval() {
		return timeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeInterval(int newTimeInterval) {
		int oldTimeInterval = timeInterval;
		timeInterval = newTimeInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.OUTGOING_EVENT__TIME_INTERVAL, oldTimeInterval, timeInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SendPayload> getSendpayload() {
		if (sendpayload == null) {
			sendpayload = new EObjectResolvingEList<SendPayload>(SendPayload.class, this, CHESSIoTSoftwarePackage.OUTGOING_EVENT__SENDPAYLOAD);
		}
		return sendpayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncomingEvent getIncomingevent() {
		if (incomingevent != null && incomingevent.eIsProxy()) {
			InternalEObject oldIncomingevent = (InternalEObject)incomingevent;
			incomingevent = (IncomingEvent)eResolveProxy(oldIncomingevent);
			if (incomingevent != oldIncomingevent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.OUTGOING_EVENT__INCOMINGEVENT, oldIncomingevent, incomingevent));
			}
		}
		return incomingevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncomingEvent basicGetIncomingevent() {
		return incomingevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingevent(IncomingEvent newIncomingevent, NotificationChain msgs) {
		IncomingEvent oldIncomingevent = incomingevent;
		incomingevent = newIncomingevent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.OUTGOING_EVENT__INCOMINGEVENT, oldIncomingevent, newIncomingevent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncomingevent(IncomingEvent newIncomingevent) {
		if (newIncomingevent != incomingevent) {
			NotificationChain msgs = null;
			if (incomingevent != null)
				msgs = ((InternalEObject)incomingevent).eInverseRemove(this, CHESSIoTSoftwarePackage.INCOMING_EVENT__OUTGOINGEVENT, IncomingEvent.class, msgs);
			if (newIncomingevent != null)
				msgs = ((InternalEObject)newIncomingevent).eInverseAdd(this, CHESSIoTSoftwarePackage.INCOMING_EVENT__OUTGOINGEVENT, IncomingEvent.class, msgs);
			msgs = basicSetIncomingevent(newIncomingevent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.OUTGOING_EVENT__INCOMINGEVENT, newIncomingevent, newIncomingevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__INCOMINGEVENT:
				if (incomingevent != null)
					msgs = ((InternalEObject)incomingevent).eInverseRemove(this, CHESSIoTSoftwarePackage.INCOMING_EVENT__OUTGOINGEVENT, IncomingEvent.class, msgs);
				return basicSetIncomingevent((IncomingEvent)otherEnd, msgs);
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
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__INCOMINGEVENT:
				return basicSetIncomingevent(null, msgs);
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
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__IS_PERIODIC:
				return isPeriodic();
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__TIME_INTERVAL:
				return getTimeInterval();
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__SENDPAYLOAD:
				return getSendpayload();
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__INCOMINGEVENT:
				if (resolve) return getIncomingevent();
				return basicGetIncomingevent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__IS_PERIODIC:
				setIsPeriodic((Boolean)newValue);
				return;
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__TIME_INTERVAL:
				setTimeInterval((Integer)newValue);
				return;
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__SENDPAYLOAD:
				getSendpayload().clear();
				getSendpayload().addAll((Collection<? extends SendPayload>)newValue);
				return;
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__INCOMINGEVENT:
				setIncomingevent((IncomingEvent)newValue);
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
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__IS_PERIODIC:
				setIsPeriodic(IS_PERIODIC_EDEFAULT);
				return;
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__TIME_INTERVAL:
				setTimeInterval(TIME_INTERVAL_EDEFAULT);
				return;
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__SENDPAYLOAD:
				getSendpayload().clear();
				return;
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__INCOMINGEVENT:
				setIncomingevent((IncomingEvent)null);
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
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__IS_PERIODIC:
				return isPeriodic != IS_PERIODIC_EDEFAULT;
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__TIME_INTERVAL:
				return timeInterval != TIME_INTERVAL_EDEFAULT;
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__SENDPAYLOAD:
				return sendpayload != null && !sendpayload.isEmpty();
			case CHESSIoTSoftwarePackage.OUTGOING_EVENT__INCOMINGEVENT:
				return incomingevent != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isPeriodic: ");
		result.append(isPeriodic);
		result.append(", timeInterval: ");
		result.append(timeInterval);
		result.append(')');
		return result.toString();
	}

} //OutgoingEventImpl
