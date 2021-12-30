package org.polarsys.chess.validator.dinamicConstraints;

import org.eclipse.emf.common.notify.Notification;
import org.polarsys.chess.chessmlprofile.Core.Domain;
import org.polarsys.chess.core.constraint.DynamicConstraint;
import org.polarsys.chess.core.constraint.IConstraint;
import org.polarsys.chess.core.util.uml.ProfileUtils;
import org.polarsys.chess.core.views.DiagramStatus.DesignView;

public class R_S_1 extends DynamicConstraint{

	
	public R_S_1() {
		super("R_S_1", IConstraint.ERROR, "A predefined profile cannot be removed");
	}

	@Override
	public boolean checkConstraint(Notification notification, DesignView currentView, Domain currentDomain) {	

		/** The successfully verified. */
		boolean successfullyVerified;
		
		if ((notification.getEventType() == Notification.SET ||
				notification.getEventType() == Notification.REMOVE) 
				&& ProfileUtils.isPredefinedProfile(notification.getOldValue()))
			successfullyVerified = false;
		else 
			successfullyVerified = true;

		return successfullyVerified;
	}

}