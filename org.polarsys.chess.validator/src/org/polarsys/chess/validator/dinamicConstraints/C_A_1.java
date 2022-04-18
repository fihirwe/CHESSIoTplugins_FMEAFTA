package org.polarsys.chess.validator.dinamicConstraints;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Relationship;
import org.polarsys.chess.chessmlprofile.Core.Domain;
import org.polarsys.chess.core.constraint.DynamicConstraint;
import org.polarsys.chess.core.constraint.IConstraint;
import org.polarsys.chess.core.util.uml.UMLUtils;
import org.polarsys.chess.core.views.ViewUtils;
import org.polarsys.chess.core.views.DiagramStatus.DesignView;

public class C_A_1 extends DynamicConstraint{

	
	public C_A_1() {
		super("C_A_1", IConstraint.ERROR, "Interface realization is not allowed because owned operations does not match.");
	}

	@Override
	public boolean checkConstraint(Notification notification, DesignView currentView, Domain currentDomain) {
		Object notifier = notification.getNotifier();
		if (notifier instanceof Component && notification.getEventType() == Notification.REMOVE) 
		{

			Package view = ViewUtils.getView((Component) notifier);
			// cheks to be verified only in case the current component
			// belongs to the functional view
			if (ViewUtils.isComponentView(view)) {
				if (notification.getOldValue() instanceof Operation) {

					Component comp = (Component) notifier;
					Operation operation = (Operation) notification.getOldValue();
					EList<NamedElement> relationships = null;

					for (Relationship rel : comp.getRelationships()) {
						if (rel instanceof InterfaceRealization) {
							InterfaceRealization intRel = (InterfaceRealization) rel;
							relationships = intRel.getSuppliers();
						}
					}

					if (relationships != null) {
						for (NamedElement item : relationships) {
							if (item instanceof Classifier) {
								Classifier class_comp = (Classifier) item;
								if (UMLUtils.isOperationContained(class_comp, operation)) {
									return false;
								}
							}
						}
					}

				}
			}
		}
		return true;
		

	}

}