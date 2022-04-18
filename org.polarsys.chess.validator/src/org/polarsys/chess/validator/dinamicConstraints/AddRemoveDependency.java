package org.polarsys.chess.validator.dinamicConstraints;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.internal.impl.DependencyImpl;
import org.polarsys.chess.chessmlprofile.Core.Domain;
import org.polarsys.chess.core.constraint.DynamicConstraint;
import org.polarsys.chess.core.constraint.IConstraint;
import org.polarsys.chess.core.util.uml.UMLUtils;
import org.polarsys.chess.core.views.DiagramStatus.DesignView;

public class AddRemoveDependency extends DynamicConstraint{

	
	public AddRemoveDependency() {
		super("ADD_REMOVEDependency",
				IConstraint.ERROR, "Cannot modify dependency for ComponentType");
	}

	@Override
	public boolean checkConstraint(Notification notification, DesignView currentView, Domain currentDomain) {
		Object value = null;
		boolean add = false;
		if (notification.getEventType() == Notification.ADD) {
			value = notification.getNewValue();
			add = true;
		}
		if (notification.getEventType() == Notification.REMOVE)
			value = notification.getOldValue();

		if (value != null
				&& (value instanceof InterfaceRealization || value.getClass().equals(DependencyImpl.class))) {
			Dependency dp = (Dependency) value;
			Object el = notification.getNotifier();
			if (el instanceof NamedElement && UMLUtils.isComponentType((NamedElement) el)) {
				getStatus().setMessage(dp.getName(), ((NamedElement) el).getName(), add ? "add" : "remove");
				return false;
			}
		}

		return true;
	}

}