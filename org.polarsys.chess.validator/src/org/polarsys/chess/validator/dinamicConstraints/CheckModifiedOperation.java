package org.polarsys.chess.validator.dinamicConstraints;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Relationship;
import org.polarsys.chess.chessmlprofile.Core.Domain;
import org.polarsys.chess.core.constraint.DynamicConstraint;
import org.polarsys.chess.core.constraint.IConstraint;
import org.polarsys.chess.core.views.ViewUtils;
import org.polarsys.chess.core.views.DiagramStatus.DesignView;

public class CheckModifiedOperation extends DynamicConstraint{

	
	public CheckModifiedOperation() {
		super("ModifiedOperation",
				IConstraint.WARNING, "Cannot modify inherited operations.");
	}

	@Override
	public boolean checkConstraint(Notification notification, DesignView currentView, Domain currentDomain) {

		Object notifier = notification.getNotifier();
		
		if (notifier instanceof Operation) {
			// in case of addition
			boolean b = (notification.getEventType() == Notification.SET)
					|| (notification.getEventType() == Notification.REMOVE
							&& notification.getOldValue() instanceof Parameter)
					|| (notification.getEventType() == Notification.ADD
							&& notification.getNewValue() instanceof Parameter);
			if (b) {
				return !checkModifiedOperation(notification);
			}
		}
		return true;
	}

	private boolean checkModifiedOperation(Notification notification) {
		if (!(notification.getNotifier() instanceof Operation))
			return false;
		Operation op = (Operation) notification.getNotifier();
		EObject opCont = op.eContainer();
		if (opCont instanceof Component) {
			Package view = ViewUtils.getView(opCont);
			// we must check whether the classifier belongs to the
			// functional view
			if (ViewUtils.isComponentView(view)) {
				if (isOperationContained(op, notification)) {
					return true;
				}
			}
		}
		return false;
	}
	
	private boolean isOperationContained(Operation op, Notification notification) {
		// if nothing is changed
		EStructuralFeature feature = (EStructuralFeature) notification.getFeature();
		if (op.eGet(feature).equals(notification.getOldValue()))
			return false;

		// this case cannot happen
		if (feature.getName().equalsIgnoreCase("name") && notification.getOldStringValue() == null)
			return false;

		String opName = getNotifiedOperationName(op, notification);

		EList<Classifier> relationships = collectSuppliers((Classifier) op.eContainer());

		for (Classifier comp : relationships) {
			// for each operation belonging to the supplier
			// interface
			for (Operation cOp : comp.getOperations()) {

				// check the name
				boolean isEqual = cOp.getName().equals(opName) && o(feature, notification, op, cOp);

				if (isEqual) {
					return true;
				}
			}
		}
		return false;
	}
	
	private String getNotifiedOperationName(Operation op, Notification notification) {
		String opName = op.getName();
		if (((EStructuralFeature) notification.getFeature()).getName().equalsIgnoreCase("name")) {
			if (notification.getOldStringValue() != null)
				opName = notification.getOldStringValue();
		}
		return opName;
	}
	
	private EList<Classifier> collectSuppliers(Classifier container) {
		EList<Classifier> relationships = new BasicEList<Classifier>();
		for (Relationship rel : container.getRelationships()) {
			if (rel instanceof InterfaceRealization) {
				InterfaceRealization r = (InterfaceRealization) rel;
				relationships.addAll(collectClassifiers(r.getSuppliers()));
			}
		}
		return relationships;
	}
	
	private EList<Classifier> collectClassifiers(EList<NamedElement> eList) {
		EList<Classifier> classifiers = new BasicEList<Classifier>();
		for (NamedElement namedElement : classifiers) {
			if (namedElement instanceof Classifier) {
				Classifier e = (Classifier) namedElement;
				if (ViewUtils.isComponentView(ViewUtils.getView(e))) {
					classifiers.add(e);
				}
			}
		}
		return classifiers;
	}

	

	private boolean o(EStructuralFeature feature, Notification notification, Operation op, Operation cOp) {

		String f = feature.getName().toLowerCase();
		// if the modification regards the parameter
		if (f.equals("ownedParameter")) {
			int cOpS = cOp.getOwnedParameters().size();
			int opS = op.getOwnedParameters().size();
			// user is trying to adding a parameter
			if (notification.getOldValue() == null) {
				if (cOpS != opS - 1)
					return false;
			} else if (cOpS != opS + 1)
				return false;
		}

		if (cOp.getOwnedParameters().size() != op.getOwnedParameters().size())
			return false;

		if (f.equals("visibility")) {
			if (!cOp.getVisibility().equals(notification.getOldValue()))
				return false;
		}

		if (cOp.getVisibility().getValue() != op.getVisibility().getValue())
			return false;

		if (f.equals("isAbstract")) {
			if (cOp.isAbstract() != notification.getOldBooleanValue())
				return false;
		}

		if (cOp.isAbstract() != op.isAbstract())
			return false;

		if (f.equals("isQuery")) {
			if (cOp.isQuery() != notification.getOldBooleanValue())
				return false;
		} else if (cOp.isQuery() != op.isQuery())
			return false;

		if (f.equals("isLeaf")) {
			if (cOp.isLeaf() != notification.getOldBooleanValue())
				return false;
		}

		if (cOp.isLeaf() != op.isLeaf())
			return false;

		if (f.equals("isStatic")) {
			if (cOp.isStatic() != notification.getOldBooleanValue())
				return false;
		}

		if (cOp.isStatic() != op.isStatic())
			return false;

		if (f.equals("concurrency")) {
			if (!cOp.getConcurrency().equals(notification.getOldValue()))
				return false;
		}

		if (cOp.getConcurrency().getValue() != op.getConcurrency().getValue())
			return false;

		return true;
	}
}