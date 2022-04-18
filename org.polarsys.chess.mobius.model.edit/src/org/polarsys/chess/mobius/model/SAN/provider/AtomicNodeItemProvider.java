/**
 */
package org.polarsys.chess.mobius.model.SAN.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.chess.mobius.model.SAN.AtomicNode;
import org.polarsys.chess.mobius.model.SAN.SANModelFactory;
import org.polarsys.chess.mobius.model.SAN.SANModelPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.chess.mobius.model.SAN.AtomicNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AtomicNodeItemProvider extends NodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicNodeItemProvider(AdapterFactory adapterFactory) {
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

			addOutputGatePropertyDescriptor(object);
			addModelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Output Gate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputGatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AtomicNode_outputGate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AtomicNode_outputGate_feature", "_UI_AtomicNode_type"),
				 SANModelPackage.Literals.ATOMIC_NODE__OUTPUT_GATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AtomicNode_model_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AtomicNode_model_feature", "_UI_AtomicNode_type"),
				 SANModelPackage.Literals.ATOMIC_NODE__MODEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(SANModelPackage.Literals.ATOMIC_NODE__PLACE);
			childrenFeatures.add(SANModelPackage.Literals.ATOMIC_NODE__TIMED_ACTIVITY);
			childrenFeatures.add(SANModelPackage.Literals.ATOMIC_NODE__INSTANTANEOUS_ACTIVITY);
			childrenFeatures.add(SANModelPackage.Literals.ATOMIC_NODE__INPUT_GATE);
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
	 * This returns AtomicNode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AtomicNode"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AtomicNode)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AtomicNode_type") :
			getString("_UI_AtomicNode_type") + " " + label;
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

		switch (notification.getFeatureID(AtomicNode.class)) {
			case SANModelPackage.ATOMIC_NODE__MODEL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SANModelPackage.ATOMIC_NODE__PLACE:
			case SANModelPackage.ATOMIC_NODE__TIMED_ACTIVITY:
			case SANModelPackage.ATOMIC_NODE__INSTANTANEOUS_ACTIVITY:
			case SANModelPackage.ATOMIC_NODE__INPUT_GATE:
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
				(SANModelPackage.Literals.ATOMIC_NODE__PLACE,
				 SANModelFactory.eINSTANCE.createPlace()));

		newChildDescriptors.add
			(createChildParameter
				(SANModelPackage.Literals.ATOMIC_NODE__TIMED_ACTIVITY,
				 SANModelFactory.eINSTANCE.createTimedActivity()));

		newChildDescriptors.add
			(createChildParameter
				(SANModelPackage.Literals.ATOMIC_NODE__INSTANTANEOUS_ACTIVITY,
				 SANModelFactory.eINSTANCE.createInstantaneousActivity()));

		newChildDescriptors.add
			(createChildParameter
				(SANModelPackage.Literals.ATOMIC_NODE__INPUT_GATE,
				 SANModelFactory.eINSTANCE.createInputGate()));

		newChildDescriptors.add
			(createChildParameter
				(SANModelPackage.Literals.ATOMIC_NODE__INPUT_GATE,
				 SANModelFactory.eINSTANCE.createOutputGate()));
	}

}
