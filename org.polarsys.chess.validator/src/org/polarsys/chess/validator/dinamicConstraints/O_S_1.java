package org.polarsys.chess.validator.dinamicConstraints;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.polarsys.chess.chessmlprofile.Core.Domain;
import org.polarsys.chess.core.constraint.DynamicConstraint;
import org.polarsys.chess.core.constraint.IConstraint;
import org.polarsys.chess.core.util.uml.UMLUtils;
import org.polarsys.chess.core.views.ViewUtils;
import org.polarsys.chess.core.views.DiagramStatus.DesignView;

public class O_S_1 extends DynamicConstraint{

	
	public O_S_1() {
		super("O_S_1", IConstraint.ERROR, "Interface operations in the Functional View must have public visibility.");
	}

	@Override
	public boolean checkConstraint(Notification notification, DesignView currentView, Domain currentDomain) {
		Object notifier = notification.getNotifier();
		if (notifier instanceof Operation && notification.getEventType() == Notification.SET) {
			Operation op = (Operation) notifier;

			if (op.eContainer() instanceof Interface) {
				Package view = ViewUtils.getView(op.eContainer());
				// we must check whether the classifier belongs to the
				// functional view
				if (ViewUtils.isComponentView(view)) {
					// in this case only public visibility is allowed
					if (!UMLUtils.hasPublicVisibility(op)) {
						return false;
					}
				}
			}

		}
		return true;
	}

}