/**
 */
package org.polarsys.chess.mobius.model.SAN.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.chess.mobius.model.SAN.ComposedNode;
import org.polarsys.chess.mobius.model.SAN.Node;
import org.polarsys.chess.mobius.model.SAN.SANModelPackage;
import org.polarsys.chess.mobius.model.SAN.SharedState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composed Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.impl.ComposedNodeImpl#getStateVariables <em>State Variables</em>}</li>
 *   <li>{@link org.polarsys.chess.mobius.model.SAN.impl.ComposedNodeImpl#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComposedNodeImpl extends NodeImpl implements ComposedNode {
	/**
	 * The cached value of the '{@link #getStateVariables() <em>State Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<SharedState> stateVariables;

	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> child;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANModelPackage.Literals.COMPOSED_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SharedState> getStateVariables() {
		if (stateVariables == null) {
			stateVariables = new EObjectContainmentEList<SharedState>(SharedState.class, this, SANModelPackage.COMPOSED_NODE__STATE_VARIABLES);
		}
		return stateVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getChild() {
		if (child == null) {
			child = new EObjectContainmentEList<Node>(Node.class, this, SANModelPackage.COMPOSED_NODE__CHILD);
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SANModelPackage.COMPOSED_NODE__STATE_VARIABLES:
				return ((InternalEList<?>)getStateVariables()).basicRemove(otherEnd, msgs);
			case SANModelPackage.COMPOSED_NODE__CHILD:
				return ((InternalEList<?>)getChild()).basicRemove(otherEnd, msgs);
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
			case SANModelPackage.COMPOSED_NODE__STATE_VARIABLES:
				return getStateVariables();
			case SANModelPackage.COMPOSED_NODE__CHILD:
				return getChild();
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
			case SANModelPackage.COMPOSED_NODE__STATE_VARIABLES:
				getStateVariables().clear();
				getStateVariables().addAll((Collection<? extends SharedState>)newValue);
				return;
			case SANModelPackage.COMPOSED_NODE__CHILD:
				getChild().clear();
				getChild().addAll((Collection<? extends Node>)newValue);
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
			case SANModelPackage.COMPOSED_NODE__STATE_VARIABLES:
				getStateVariables().clear();
				return;
			case SANModelPackage.COMPOSED_NODE__CHILD:
				getChild().clear();
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
			case SANModelPackage.COMPOSED_NODE__STATE_VARIABLES:
				return stateVariables != null && !stateVariables.isEmpty();
			case SANModelPackage.COMPOSED_NODE__CHILD:
				return child != null && !child.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComposedNodeImpl
