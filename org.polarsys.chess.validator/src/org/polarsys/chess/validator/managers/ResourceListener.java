/*
-----------------------------------------------------------------------
--          			CHESS validator plugin					     --
--                                                                   --
--                    Copyright (C) 2011-2012                        --
--                 University of Padova, ITALY                       --
--                                                                   --
-- All rights reserved. This program and the accompanying materials  --
-- are made available under the terms of the Eclipse Public License  --
-- v1.0 which accompanies this distribution, and is available at     --
-- http://www.eclipse.org/legal/epl-v20.html                         --
-----------------------------------------------------------------------
*/

package org.polarsys.chess.validator.managers;

import java.util.List;
import java.util.Map.Entry;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.papyrus.infra.core.sashwindows.di.PageList;
import org.eclipse.papyrus.infra.core.sashwindows.di.PageRef;
import org.eclipse.uml2.uml.Element;
import org.polarsys.chess.core.notifications.ResourceNotification;
import org.polarsys.chess.core.profiles.CHESSProfileManager;
import org.polarsys.chess.core.resourcelistener.ResourceSetListenerExtra;
import org.polarsys.chess.core.util.CHESSProjectSupport;
import org.polarsys.chess.core.util.NotificationManager;
import org.polarsys.chess.core.views.DiagramStatus;
import org.polarsys.chess.service.gui.utils.CHESSEditorUtils;
import org.polarsys.chess.validator.Activator;

/**
 * The listener interface for receiving resource events. The class that is
 * interested in processing a resource event implements this interface, and the
 * object created with that class is registered with a component using the
 * component's <code>addResourceListener<code> method. When the resource event
 * occurs, that object's appropriate method is invoked.
 *
 * @see ResourceEvent
 */
public class ResourceListener extends ResourceSetListenerExtra {

	/** The s. */
	private StringBuffer errorMessage = new StringBuffer();
	// private OCLEvaluator validator = OCLEvaluator.loadEvaluator();
	/** The viewmgr. */
	private DiagramChecker diagramChecker = DiagramChecker.loadDiagramChecker();

	/** The automated action manager. */
	private ModelManager automatedActionManager = null; 
			//FIXME not clear the behavour
			//ModelManager.loadModelManager();

	/** The modelparser. */
	private ModelParser modelparser = null; 
			//FIXME not clear the behavour
			//new ModelParser();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.transaction.ResourceSetListenerImpl#
	 * transactionAboutToCommit(org.eclipse.emf.transaction.
	 * ResourceSetChangeEvent)
	 */
	@Override
	public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
		List<Notification> list = event.getNotifications();
		DiagramStatus ds;
		CompoundCommand command = new CompoundCommand();

		ds = CHESSEditorUtils.getDiagramStatus(sr);
		if (ds == null) {
			return command;
		}

		boolean executeModelParser = true;
		if (!ds.isUserAction()) {
			executeModelParser = false;
		}
		// ds.setUserAction(true);
		for (Notification notif : list) {
			if (notif instanceof ENotificationImpl) {
				ENotificationImpl notification = (ENotificationImpl) notif;
				final Object notifier = notification.getNotifier();
				if (!isNotationElement(notifier) && allowedNotifier(notifier)) {

					initErrorMessage(notification);

					//FIXME not clear the behavour
					//performModelParserChecker(ds, executeModelParser, notification, notifier);

					if (notifier instanceof Element || notifier instanceof DynamicEObjectImpl
							|| canBeStaticStereotype(notifier)) {
						//FIXME not clear the behavour
						//performAutomatedActionChecker(event, list, ds, command, notification, notifier);
					}

					
					else if (notifier instanceof Shape) {
						//addShapeInfoErrorMessage(notifier);
						if (!(notification.getNewValue() instanceof EObject))
							continue;
					}

					// it's needed to avoid the graphical representation of
					// stereotype to be shown
					// used in case of applying the view stereotype
					else if (notifier instanceof EAnnotation) {
						//FIXME not clear the behavour
						//performEAnnotationChecker(notifier);
					}

					else if ((notifier instanceof PageList)&&(notification.getNewValue() instanceof PageRef)) {
						PageRef ref = (PageRef)notification.getNewValue();
						if (ref.getEmfPageIdentifier() instanceof Diagram){
							performDiagramChecker(event, ds, (Diagram)ref.getEmfPageIdentifier());
						}
					}
				}
			} else { // check diagram creation permission
				Object newz = notif.getNewValue();
				if (newz instanceof Diagram) {
					performDiagramChecker(event, ds, (Diagram)newz);
				}
			}
		}

		return command.getCommandList().isEmpty() ? super.transactionAboutToCommit(event) : command;
	}

	private void performEAnnotationChecker(final Object notifier) throws RollbackException {
		EAnnotation annotation = (EAnnotation) notifier;
		System.out.println("ANN: " + annotation);
		EMap<String, String> details = annotation.getDetails();
		for (Entry<String, String> entry : details) {
			if (entry.getValue().indexOf(CHESSProfileManager.DEPLOYMENT_VIEW) > 0
					|| entry.getValue().indexOf(CHESSProfileManager.COMPONENT_VIEW) > 0
					// ||
					// entry.getValue().indexOf(CHESSProfileManager.EXTRAFUNCTIONAL_VIEW)
					// > 0
					|| entry.getValue().indexOf(CHESSProfileManager.ANALYSIS_VIEW) > 0
					|| entry.getValue().indexOf(CHESSProfileManager.DEPENDABILITY_ANALYSIS_VIEW) > 0
					|| entry.getValue().indexOf(CHESSProfileManager.RT_ANALYSIS_VIEW) > 0
					|| entry.getValue().indexOf(CHESSProfileManager.TIMING_DATAFLOW_VIEW) > 0) {
				errorMessage.delete(0, errorMessage.length());
				errorMessage.append("Can't apply view stereotype!");
				CHESSProjectSupport.printlnToCHESSConsole(errorMessage.toString());
				ResourceNotification.showError(errorMessage.toString());
				throw new RollbackException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, errorMessage.toString()));
			}
		}
	}

	private void addShapeInfoErrorMessage(final Object notifier) {
		Shape shape = (Shape) notifier;
		errorMessage.append(" shape modified: ");
		errorMessage.append(" for the element: ");
		errorMessage.append(shape.getElement());
		if (shape.getElement() != null) {
			errorMessage.append(" that belong to the view: ");
			errorMessage.append(shape.getElement().eContainer());
		}

		if (shape.getDiagram() != null) {
			errorMessage.append(" in the diagram: ");
			errorMessage.append(shape.getDiagram().getName());
			errorMessage.append(" in the view: ");
			errorMessage.append(shape.getDiagram().getElement());
		}
	}

	private void initErrorMessage(ENotificationImpl notification) {
		errorMessage.delete(0, errorMessage.length());
		errorMessage.append("R.");
		errorMessage.append(NotificationManager.printEventType(notification));
	}

	private void performDiagramChecker(ResourceSetChangeEvent event, DiagramStatus ds, Diagram diagram)
			throws RollbackException {
		//try {
			diagramChecker.check(diagram, errorMessage, ds.getCurrentView(), event.getEditingDomain());
		//} catch (RollbackException e) {
			//ResourceNotification.showInfo(e.getStatus().getMessage());
		//	throw e;
		//}
	}

	private void performAutomatedActionChecker(ResourceSetChangeEvent event, List<Notification> list, DiagramStatus ds,
			CompoundCommand command, ENotificationImpl notification, final Object notifier) throws RollbackException {
		try {
			Command comm = automatedActionManager.check(list, notification, notifier, errorMessage, ds,
					event.getEditingDomain());
			if (comm != null) {
				ds.setUserAction(false);
				command.append(comm);

				System.out.println("COMMAND: " + comm.getLabel());
				System.out.println("SUPERUSER set to true");
			}
		} catch (RollbackException e) {
			errorMessage.delete(0, errorMessage.length());
			errorMessage.append(e.getStatus().getMessage());
			ResourceNotification.showInfo(e.getStatus().getMessage());
			throw e;
		}
	}

	private void performModelParserChecker(DiagramStatus ds, boolean executeModelParser, ENotificationImpl notification,
			final Object notifier) throws RollbackException {
		try {
			// do not check any constraint in case of automated actions
			if (executeModelParser) {
				modelparser.check(notification, notifier, ds.getCurrentView(), ds.isSuperuser());
			}
		} catch (RollbackException e) {
			ResourceNotification.showInfo(e.getStatus().getMessage());
			throw e;
		}
	}

	/**
	 * Prints the list. Test
	 *
	 * @param list
	 *            the List to be printed
	 */
	private void printList(List<Notification> list) {
		System.out.println("----------------------------------");
		int j = 0;
		for (Notification notif1 : list) {
			j++;
			if (notif1 instanceof ENotificationImpl) {
				ENotificationImpl notification = (ENotificationImpl) notif1;
				final Object notifier = notification.getNotifier();
				if (isNotationElement(notifier))
					continue;

				System.out.println("ACTION " + j + " OF " + list.size());
				System.out.println("TYPE: " + NotificationManager.printEventType(notification));
				System.out.println("NOTIFIER: " + notifier);
				System.out.println("FEATURE: " + notification.getFeature());
				if (notification.getEventType() == Notification.REMOVE)
					System.out.println("OLDVALUE: " + notification.getOldValue());
				else if (notification.getEventType() == Notification.ADD)
					System.out.println("NEWVALUE: " + notification.getNewValue());
				else {
					System.out.println("OLDVALUE: " + notification.getOldValue());
					System.out.println("NEWVALUE: " + notification.getNewValue());
				}
			}
		}
		System.out.println("----------------------------------");
	}

	/**
	 * Checks if is the notifier notation element.
	 *
	 * @param notifier
	 *            the notifier
	 * @return true, if is notation element
	 */
	private boolean isNotationElement(Object notifier) {
		if (notifier instanceof EObject) {
			String pkgName = notifier.getClass().getPackage().getName();
			if (pkgName.startsWith("org.eclipse.gmf.runtime.notation"))
				return true;
		}
		return false;

	}

	/**
	 * Chek if the notifier can be a static stereotype.
	 *
	 * @param notifier
	 *            the notifier
	 * @return true, if successful
	 */
	private boolean canBeStaticStereotype(Object notifier) {
		if (notifier instanceof EObject) {
			String pkgName = notifier.getClass().getPackage().getName();
			if (pkgName.startsWith("org.eclipse.papyrus.MARTE")
					|| pkgName.startsWith("org.polarsys.chess.chessmlprofile"))
				return true;
			if (notifier instanceof EAnnotation || notifier instanceof Shape) {
				return false;
			}
			return true;
		}
		return false;
	}

	/** The allowed notifier types. */
	private static Class[] allowedNotifierTypes = { Element.class, DynamicEObjectImpl.class, Diagram.class,
			PageList.class, Shape.class, EAnnotation.class, EObject.class };

	/**
	 * Allowed notifier.
	 *
	 * @param notifier
	 *            the notifier
	 * @return true, if successful
	 */
	private boolean allowedNotifier(Object notifier) {
		for (Class<?> allowedType : allowedNotifierTypes) {
			if (allowedType.isInstance(notifier))
				return true;
		}
		return false;
	}

}
