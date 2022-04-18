package org.polarsys.chess.validator.dinamicConstraints;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.ProfileApplication;
import org.polarsys.chess.chessmlprofile.Core.Domain;
import org.polarsys.chess.core.constraint.DynamicConstraint;
import org.polarsys.chess.core.constraint.IConstraint;
import org.polarsys.chess.core.views.DiagramStatus.DesignView;

public class M_A_1 extends DynamicConstraint{

	
	public M_A_1() {
		super("M_A_1",
				IConstraint.ERROR, "Cannot apply further profiles in the model");
	}

	@Override
	public boolean checkConstraint(Notification notification, DesignView currentView, Domain currentDomain) {
		Object notifier = notification.getNotifier();
		if (notifier instanceof Model) {

			if (notification.getEventType() == Notification.ADD
					|| notification.getEventType() == Notification.ADD_MANY)
				if (notification.getNewValue() instanceof ProfileApplication)
					return false;
		}
		return true;
	}

}