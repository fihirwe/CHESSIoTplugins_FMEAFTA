package org.polarsys.chess.validator.dinamicConstraints;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Package;
import org.polarsys.chess.chessmlprofile.Core.Domain;
import org.polarsys.chess.core.constraint.DynamicConstraint;
import org.polarsys.chess.core.constraint.IConstraint;
import org.polarsys.chess.core.views.ViewUtils;
import org.polarsys.chess.core.views.DiagramStatus.DesignView;

public class P_A_1 extends DynamicConstraint{

	
	public P_A_1() {
		super("P_A_1", IConstraint.ERROR,
				"Creation of interfaces is only allowed in the Functional View and Deployment View.");
	}

	@Override
	public boolean checkConstraint(Notification notification, DesignView currentView, Domain currentDomain) {
		Object notifier = notification.getNotifier();
		if (notifier instanceof Package && notification.getEventType() == Notification.ADD
				&& notification.getNewValue() instanceof Interface) {
			Package view = ViewUtils.getView((Package) notifier);
			if (!ViewUtils.isComponentView(view) && !ViewUtils.isDeploymentView(view)) {
				return false;
			}
		}
		return true;
	}

}