package org.polarsys.chess.iot.deployment.util.listeners;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*******************************************************************************
 *
 * Copyright (c) 2013, 2015 Intecs SpA 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Felicien Ihirwe 
 * Initial API and implementation and/or initial documentation
 *******************************************************************************/

import org.eclipse.emf.common.notify.Notification;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.papyrus.infra.core.listenerservice.IPapyrusListener;
import org.eclipse.papyrus.infra.core.sashwindows.di.PageRef;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.DiagramUtils;
import org.eclipse.papyrus.uml.tools.listeners.StereotypeElementListener.StereotypeExtensionNotification;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.internal.Workbench;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;

public class EnvironmentListerner implements IPapyrusListener {

	private final String env_stereotype = "CHESSIoT::CHESSIoTOperationalProfile::Environment";

	//	private static final String ASSUME = "Assume";
	//	private static final String GUARANTEE = "Guarantee";
	//	private static final Object FEATURE_NAME = "name";

	public EnvironmentListerner() {
	}

	@Override
	public void notifyChanged(Notification notification) {
		Object notifier = notification.getNotifier();

		if((Workbench.getInstance() != null) && (PlatformUI.getWorkbench()!=null)&&
				(PlatformUI.getWorkbench().getActiveWorkbenchWindow()!=null)
				&&(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()!=null)
				&&(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().isEditorAreaVisible())
				&&(notifier instanceof Class)){

			Class c = (Class) notifier;

			if(notification.getEventType() == StereotypeExtensionNotification.SET){
				if(c.getAppliedStereotype(env_stereotype) != null){
					IEditorPart editor = null;
					try {
						editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
								.getActivePage().getActiveEditor();
					} catch (Exception e) {
						e.printStackTrace();
					}
					if (editor != null){
						Stereotype objStereo = c.getAppliedStereotype(env_stereotype);
							String result1= c.getName();
							c.setValue(objStereo, "name", result1);
					}
				}
				
				if(c.getAppliedStereotype(env_stereotype) != null){
					
				}


			}
		}

	}
}

	//			System.out.println("GOT SOMETHING"+cblock.getAppliedStereotypes());

	//			if(notification.getEventType() == StereotypeExtensionNotification.STEREOTYPE_APPLIED_TO_ELEMENT){
	//				if(cblock.getAppliedStereotype(ACTION) != null){
	//					
	//					
	//					IEditorPart editor = null;
	//					try {
	//						editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
	//								.getActivePage().getActiveEditor();
	//					} catch (Exception e) {
	//						
	//					}
	//					if (editor != null){
	//						AbstractUIPlugin plugin = Activator.getDefault();
	//						ImageRegistry imageRegistry = plugin.getImageRegistry();
	//						Image chessImage = imageRegistry.get(Activator.PLUGIN_ID);
	//						MessageDialog md = new MessageDialog(editor.getSite().getShell(),
	//								"Create Contract", chessImage, "Do you want to create a contract with predefined empty Assume and Guarantee FormalProperty?", MessageDialog.CONFIRM,
	//								new String[] { "Yes", "No"}, 0);
	//						md.setBlockOnOpen(true);
	//						int res = md.open();
	//						
	//						if (res ==0){ //OK

	//							System.out.println(" ZERO IS SET");
	//										Constraint assumeConst = cblock.createOwnedRule(cblock.getName() + "_" + ASSUME);
	//										Constraint guaranteeConst = cblock.createOwnedRule(cblock.getName() + "_" + GUARANTEE);
	//							
	//							LiteralString assumeValue = UMLFactory.eINSTANCE.createLiteralString();
	//							assumeValue.setName(assumeConst.getName());
	//							assumeConst.setSpecification(assumeValue);
	//							
	//							LiteralString guaranteeValue = UMLFactory.eINSTANCE.createLiteralString();
	//							guaranteeValue.setName(guaranteeConst.getName());
	//							guaranteeConst.setSpecification(guaranteeValue);
	//							
	//							try {
	//								
	//								Stereotype fpStereotype = CHESSContractProfileManager.getFormalProperty(cblock.eResource().getResourceSet());
	//								FormalProperty assume = (FormalProperty) assumeConst.applyStereotype(fpStereotype);
	//								FormalProperty guarantee = (FormalProperty) guaranteeConst.applyStereotype(fpStereotype);
	//								
	//								Stereotype contrStereo = cblock.getAppliedStereotype(ACTION);
	//								cblock.setValue(contrStereo, ASSUME, assume);
	//								cblock.setValue(contrStereo, GUARANTEE, guarantee);
	//							} catch (Exception e) {
	//								// TODO Auto-generated catch block
	//								e.printStackTrace();
	//				//							}
	//			}

	//		PageRef ref = (PageRef) notifier;
	//		Diagram diagram = null;
	//		
	//		
	//		
	//		// check if we are working on a real diagram
	//		if (ref.getEmfPageIdentifier() instanceof Diagram){
	//			diagram = (Diagram) ref.getEmfPageIdentifier();
	//			Object a= DiagramUtils.getOwner(diagram);
	//			if (a instanceof Component) {
	//				Component new_name = (Component) a;
	//				System.out.println(new_name+" Componeennnttttt ");
	//				
	//			}
	//		}
	//			



	//					
	//				}


	//			if(notification.getEventType() == Notification.SET && notification.getFeature() instanceof EAttribute){
	//				if(cblock.getAppliedStereotype(ACTION) != null){
	//					EAttribute attr = (EAttribute) notification.getFeature();
	//					if(attr.getName().equals(FEATURE_NAME)){
	//						EList<Constraint> rules = cblock.getOwnedRules();
	//						for (Constraint constraint : rules) {
	//							if(constraint.getName().contains(ASSUME)){
	//								constraint.setName(notification.getNewStringValue() + "_" + ASSUME);
	//							}
	//							if(constraint.getName().contains(GUARANTEE)){
	//								constraint.setName(notification.getNewStringValue() + "_" + GUARANTEE);
	//							}
	//							constraint.getSpecification().setName(constraint.getName());
	//						}
	//					}
	//				}
	//			}
	//		}
	//	}

	//}
