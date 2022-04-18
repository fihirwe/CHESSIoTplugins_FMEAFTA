/**
 */
package org.polarsys.chess.mobius.model.SAN.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.chess.mobius.model.SAN.Join;
import org.polarsys.chess.mobius.model.SAN.Node;
import org.polarsys.chess.mobius.model.SAN.Rep;
import org.polarsys.chess.mobius.model.SAN.SANModel;
import org.polarsys.chess.mobius.model.SAN.SANModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SAN Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.impl.SANModelImpl#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SANModelImpl extends NamedElementImpl implements SANModel {
	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected Node node;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SANModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANModelPackage.Literals.SAN_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNode(Node newNode, NotificationChain msgs) {
		Node oldNode = node;
		node = newNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANModelPackage.SAN_MODEL__NODE, oldNode, newNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(Node newNode) {
		if (newNode != node) {
			NotificationChain msgs = null;
			if (node != null)
				msgs = ((InternalEObject)node).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANModelPackage.SAN_MODEL__NODE, null, msgs);
			if (newNode != null)
				msgs = ((InternalEObject)newNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANModelPackage.SAN_MODEL__NODE, null, msgs);
			msgs = basicSetNode(newNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANModelPackage.SAN_MODEL__NODE, newNode, newNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Node> getAllNodes() {
		Node node = this.getNode();
		EList<Node> nodes = getAllNodes(node);
		nodes.add(node);
		return nodes;
	}
	
	private EList<Node> getAllNodes(Node node){
		EList<Node> nodes = new BasicEList<Node>();
		if (node instanceof Join){
			Join join = (Join) node;
			EList<Node> children = join.getChild();
			for (Node child : children){
				EList<Node> nodes2= getAllNodes(child);
				nodes.addAll(nodes2);
				nodes.add(child);
			}
		}
		else if (node instanceof Rep){
			Node child = ((Rep) node).getChild().get(0);
			EList<Node> nodes2= getAllNodes(child);
			nodes.addAll(nodes2);
			nodes.add(child);
			
		}
		//if it is an atomic model just return an empty list
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SANModelPackage.SAN_MODEL__NODE:
				return basicSetNode(null, msgs);
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
			case SANModelPackage.SAN_MODEL__NODE:
				return getNode();
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
			case SANModelPackage.SAN_MODEL__NODE:
				setNode((Node)newValue);
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
			case SANModelPackage.SAN_MODEL__NODE:
				setNode((Node)null);
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
			case SANModelPackage.SAN_MODEL__NODE:
				return node != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SANModelPackage.SAN_MODEL___GET_ALL_NODES:
				return getAllNodes();
		}
		return super.eInvoke(operationID, arguments);
	}

} //SANModelImpl
