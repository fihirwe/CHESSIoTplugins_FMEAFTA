/**
 */
package org.polarsys.chess.mobius.model.SAN.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.chess.mobius.model.SAN.ComposedNode;
import org.polarsys.chess.mobius.model.SAN.SANModelFactory;
import org.polarsys.chess.mobius.model.SAN.SANModelPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.chess.mobius.model.SAN.ComposedNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComposedNodeItemProvider extends NodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedNodeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SANModelPackage.Literals.COMPOSED_NODE__STATE_VARIABLES);
			childrenFeatures.add(SANModelPackage.Literals.COMPOSED_NODE__CHILD);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ComposedNode)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ComposedNode_type") :
			getString("_UI_ComposedNode_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ComposedNode.class)) {
			case SANModelPackage.COMPOSED_NODE__STATE_VARIABLES:
			case SANModelPackage.COMPOSED_NODE__CHILD:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SANModelPackage.Literals.COMPOSED_NODE__STATE_VARIABLES,
				 SANModelFactory.eINSTANCE.createSharedState()));

		newChildDescriptors.add
			(createChildParameter
				(SANModelPackage.Literals.COMPOSED_NODE__CHILD,
				 SANModelFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add
			(createChildParameter
				(SANModelPackage.Literals.COMPOSED_NODE__CHILD,
				 SANModelFactory.eINSTANCE.createRep()));

		newChildDescriptors.add
			(createChildParameter
				(SANModelPackage.Literals.COMPOSED_NODE__CHILD,
				 SANModelFactory.eINSTANCE.createAtomicNode()));
	}

}
