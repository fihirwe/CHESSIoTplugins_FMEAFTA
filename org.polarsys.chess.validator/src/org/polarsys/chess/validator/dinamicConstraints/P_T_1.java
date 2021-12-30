package org.polarsys.chess.validator.dinamicConstraints;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.papyrus.uml.tools.listeners.PapyrusStereotypeListener;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.polarsys.chess.chessmlprofile.Core.Domain;
import org.polarsys.chess.core.constraint.DynamicConstraint;
import org.polarsys.chess.core.constraint.IConstraint;
import org.polarsys.chess.core.views.ViewUtils;
import org.polarsys.chess.core.views.DiagramStatus.DesignView;

public class P_T_1 extends DynamicConstraint{

	
	public P_T_1() {
		super("P_T_1", IConstraint.ERROR,
				"Appling a view stereotype is forbidden.");
	}

	@Override
	public boolean checkConstraint(Notification notification, DesignView currentView, Domain currentDomain) {
		Object notifier = notification.getNotifier();
		if (notifier instanceof Package
				&& notification.getEventType() == PapyrusStereotypeListener.APPLIED_STEREOTYPE) {
			if (notification.getNewValue() instanceof DynamicEObjectImpl) {
				DynamicEObjectImpl d = (DynamicEObjectImpl) notification.getNewValue();
				Stereotype stereo = UMLUtil.getStereotype(d);
				if (ViewUtils.isViewStereotype(stereo)) {
					return false;
				}
			}
		}
		return true;
	}

}