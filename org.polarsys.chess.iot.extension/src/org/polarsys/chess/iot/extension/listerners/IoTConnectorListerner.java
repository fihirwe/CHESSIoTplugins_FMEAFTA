package org.polarsys.chess.iot.extension.listerners;



/*******************************************************************************
 *
 * Copyright (c) 2021 Intecs SpA 
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
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.papyrus.infra.core.listenerservice.IPapyrusListener;
import org.eclipse.papyrus.uml.tools.listeners.StereotypeElementListener.StereotypeExtensionNotification;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.internal.Workbench;
import org.eclipse.uml2.uml.Connector;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.CommunicationMode;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.impl.ConnectionImpl;


public class IoTConnectorListerner implements IPapyrusListener {

	private static final String stereotype = "CHESSIoT::CHESSIoTSystem::Connection";
	//	private static final String ASSUME = "Assume";
	//	private static final String GUARANTEE = "Guarantee";
	//	private static final Object FEATURE_NAME = "name";

	private int notified= 1;

	public IoTConnectorListerner() {
	}

	@Override
	public void notifyChanged(Notification notification) {
		Object notifier = notification.getNotifier();
		
		if((Workbench.getInstance() != null) && (PlatformUI.getWorkbench()!=null)&&
				(PlatformUI.getWorkbench().getActiveWorkbenchWindow()!=null)
				&&(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()!=null)
				&&(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().isEditorAreaVisible())
				&&(notifier instanceof Connector)){
			Connector obj = (Connector) notifier;

			if(notification.getEventType() == StereotypeExtensionNotification.SET){
				if(obj.getAppliedStereotype(stereotype) != null){
					IEditorPart editor = null;
					try {
						editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
								.getActivePage().getActiveEditor();
					} catch (Exception e) {

					}
					if (editor != null && notified%2==1){

						
						String result=null;
						ElementListSelectionDialog dialog =
								new ElementListSelectionDialog(editor.getSite().getShell(), new LabelProvider());
						dialog.setSize(70, 8);
						dialog.setElements(new String[] {"WIRELESS", "WIRED"});
						dialog.setTitle("Which connection type is this?");
						// user pressed cancel
						if (dialog.open() == Window.OK) {
							result = (String) dialog.getResult()[0];
							System.out.println(result);
							if(result.equals("WIRELESS")){
//								Stereotype str = obj.getApplicableStereotype("CHESSIoT::CHESSIoTSystem::CommunicationMode::WIRELESS");
//								ConnectionImpl o= (ConnectionImpl) obj;
//								o.setCommMode(CommunicationMode.WIRELESS);
//								obj=(Connector) o;
//								obj.applyStereotype(str);
							}
							else if(result.equals("WIRED")){
//								ConnectionImpl o= (ConnectionImpl) obj;
//								o.setCommMode(CommunicationMode.WIRED);
//								obj=(Connector) o;
							}


						}
						else{
							MessageDialog md = new MessageDialog(editor.getSite().getShell(),
									"ERROR", null,"No event type selected!, a generic event was used by default", MessageDialog.ERROR,
									null, 0);
						}
						
						
					}
					notified++;
				}
			}
		}
	}
}