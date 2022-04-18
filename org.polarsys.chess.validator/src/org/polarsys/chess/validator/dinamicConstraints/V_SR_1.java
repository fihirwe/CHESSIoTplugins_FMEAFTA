package org.polarsys.chess.validator.dinamicConstraints;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.papyrus.uml.tools.listeners.PapyrusStereotypeListener;
import org.eclipse.uml2.uml.Package;
import org.polarsys.chess.chessmlprofile.Core.Domain;
import org.polarsys.chess.core.constraint.DynamicConstraint;
import org.polarsys.chess.core.constraint.IConstraint;
import org.polarsys.chess.core.profiles.CHESSProfileManager;
import org.polarsys.chess.core.views.DiagramStatus;
import org.polarsys.chess.core.views.ViewUtils;
import org.polarsys.chess.core.views.DiagramStatus.DesignView;
import org.polarsys.chess.service.gui.utils.CHESSEditorUtils;
import org.polarsys.chess.validator.libs.ConstraintsLib;

public class V_SR_1 extends DynamicConstraint{

	
	public V_SR_1() {
		super("V_SR_1", IConstraint.ERROR,
				"A view cannot be modified or removed");
	}

	@Override
	public boolean checkConstraint(Notification notification, DesignView currentView, Domain currentDomain) {
		if (ViewUtils.isViewModifiedOrRemoved((ENotificationImpl) notification)) {
			if (!checkViewStereotype(notification))
				return false;
		}
		return true;
	}

	/**
	 * Check if a stereotype representing a CHESS view has been modified. A
	 * stereotype representing a CHESS must not be modified or removed.
	 * 
	 * @see org.polarsys.chess.validator.libs.ConstraintsLib
	 * 
	 * @param notification
	 *            the EMF notification
	 * @return true, if successful
	 */
	private static boolean checkViewStereotype(Notification notification) {

		// it should be allowed to modify the deployment view in order to
		// add/remove assignment references
		PapyrusMultiDiagramEditor editor = CHESSEditorUtils.getCHESSEditor();
		DiagramStatus ds = CHESSEditorUtils.getDiagramStatus(editor);
		if (ds == null)
			return true;

		DesignView dview = ds.getCurrentView();

		boolean isCurrentPackageDeploymentView = false;
		Object n = notification.getNotifier();
		if (n instanceof Package) {
			Package pkg = (Package) n;
			isCurrentPackageDeploymentView = ViewUtils.isDeploymentView(pkg);
		}

		if (isCurrentPackageDeploymentView
				|| notification.getEventType() == PapyrusStereotypeListener.MODIFIED_STEREOTYPE
						&& dview.getName().equals(CHESSProfileManager.DEPLOYMENT_VIEW)) {
			return true;
		}

		else if (notification.getEventType() == Notification.SET || notification.getEventType() == Notification.REMOVE
				|| notification.getEventType() == PapyrusStereotypeListener.APPLIED_STEREOTYPE
				|| notification.getEventType() == PapyrusStereotypeListener.UNAPPLIED_STEREOTYPE
				|| notification.getEventType() == PapyrusStereotypeListener.MODIFIED_STEREOTYPE) {
			return false;
		}
		return true;
	}
}