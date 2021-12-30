package org.polarsys.chess.validator.dinamicConstraints;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.polarsys.chess.chessmlprofile.Core.Domain;
import org.polarsys.chess.core.constraint.DynamicConstraint;
import org.polarsys.chess.core.constraint.IConstraint;
import org.polarsys.chess.core.util.uml.ProfileUtils;
import org.polarsys.chess.core.views.DiagramStatus.DesignView;

public class S_S_1 extends DynamicConstraint{

	
	public S_S_1() {
		super("S_S_1",
				IConstraint.ERROR, "a predefined stereotype cannot be removed");
	}

	@Override
	public boolean checkConstraint(Notification notification, DesignView currentView, Domain currentDomain) {
		Object notifier = notification.getNotifier();
		// Check for modifications of the stereotype
		if (notifier instanceof DynamicEObjectImpl) {
			DynamicEObjectImpl d = (DynamicEObjectImpl) notifier;
			Stereotype stereo = UMLUtil.getStereotype(d);

			if (notification.getEventType() == Notification.SET
					&& notification.getNewValue() == null) {
				if (ProfileUtils.isPredefinedStereotype(stereo)) {
					return false;
				}
			}
		}
		return true;
	}

}