package org.polarsys.chess.validator.dinamicConstraints;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.papyrus.uml.tools.listeners.PapyrusStereotypeListener;
import org.eclipse.uml2.uml.Element;
import org.polarsys.chess.chessmlprofile.Core.Domain;
import org.polarsys.chess.core.constraint.DynamicConstraint;
import org.polarsys.chess.core.constraint.IConstraint;
import org.polarsys.chess.core.util.CHESSProjectSupport;
import org.polarsys.chess.core.util.NotificationManager;
import org.polarsys.chess.core.views.ViewUtils;
import org.polarsys.chess.core.views.DiagramStatus.DesignView;

public class E_S_1_NEW extends DynamicConstraint{

	private Object notifier;
	
	public E_S_1_NEW() {
		super("E_S_1", IConstraint.ERROR,
				"The view \"{0}\" has no write access on the {1} \"{2}\", therefore it cannot be modified.");
	}

	@Override
	public boolean checkConstraint(Notification notification, DesignView currentView, Domain currentDomain) {
		
			CHESSProjectSupport.printlnToCHESSConsole(NotificationManager.printNotification(notification));

			notifier = notification.getNotifier();
			if (notifier instanceof Element || notifier instanceof DynamicEObjectImpl || notifier instanceof EObject) {
				if (notification.getEventType() == Notification.ADD
						|| notification.getEventType() == Notification.ADD_MANY
						|| notification.getEventType() == Notification.REMOVE
						|| notification.getEventType() == Notification.REMOVE_MANY
						|| (notification.getEventType() == Notification.SET && notification.getOldValue() != null
								&& notification.getNewValue() == null)
						|| isBaseElementModification(notification)) {
					if (!ViewUtils.isElementInstantiable((EObject) notifier, notification.getFeature(), currentView,
							currentDomain)) {
						getStatus().setMessage(currentView.getName(), "element",
								((EObject) notifier).eClass().getName());
						return false;
					}
				} else if (notification.getEventType() == Notification.SET) {
					if (!ViewUtils.isElementWritable_((EObject) notifier, notification.getFeature(), currentView,
							currentDomain)) {
						getStatus().setMessage(currentView.getName(), "element",
								((EObject) notifier).eClass().getName());
						return false;
					}
				} else if (notification.getEventType() == PapyrusStereotypeListener.APPLIED_STEREOTYPE
						|| notification.getEventType() == PapyrusStereotypeListener.UNAPPLIED_STEREOTYPE) {
					if (!ViewUtils.isStereotypeInstantiable((EObject) notifier, notification.getFeature(),
							notification.getNewValue(), currentView, currentDomain)) {
						getStatus().setMessage(currentView.getName(), "stereotype",
								((EObject) notification.getNewValue()).eClass().getName());
						return false;
					}
				}
		
			}
			return true;
		}

		private boolean isBaseElementModification(Notification notification) {
			if (notifier instanceof DynamicEObjectImpl && notification.getFeature() instanceof EReference) {
				String name = ((EReference) notification.getFeature()).getName();
				return name.startsWith("base_");
			}
			return false;
		}

}