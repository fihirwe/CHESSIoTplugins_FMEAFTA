package org.polarsys.chess.iot.extension.listerners;



import java.util.Arrays;

import java.util.List;

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
import org.eclipse.papyrus.sysml.blocks.Block;
import org.eclipse.papyrus.uml.tools.listeners.StereotypeElementListener.StereotypeExtensionNotification;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.internal.Workbench;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.polarsys.chess.iot.extension.dialogs.MyCustomDialog;
import org.polarsys.chess.iot.extension.managers.CHESSIoTProfileManager;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Sensor;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSystem.SensorBlock;

import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Property;


public class SystemProfileListerner implements IPapyrusListener {

	private static final String sensor_stereotype = "CHESSIoT::CHESSIoTSystem::SensorBlock";
	private static final String systemhw_stereotype = "CHESSIoT::CHESSIoTSystem::SYSTEM_Hw";
	private static final String actuator_stereotype = "CHESSIoT::CHESSIoTSystem::ActuatingBlock";
	private static final String physical_elt_stereotype = "CHESSIoT::CHESSIoTSystem::PhysicalElement";



	public SystemProfileListerner() {
	}

	@Override
	public void notifyChanged(Notification notification) {
		Object notifier = notification.getNotifier();

		if((Workbench.getInstance() != null) && (PlatformUI.getWorkbench()!=null)&&
				(PlatformUI.getWorkbench().getActiveWorkbenchWindow()!=null)
				&&(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()!=null)
				&&(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().isEditorAreaVisible())
				&&(notifier instanceof Class)){
			Class obj = (Class) notifier;


			if(notification.getEventType() == StereotypeExtensionNotification.SET){
				if(obj.getAppliedStereotype("CHESSIoT::CHESSIoTSoftware::Payload") != null){
					Stereotype objStereo = obj.getAppliedStereotype("CHESSIoT::CHESSIoTSoftware::Payload");
					System.out.println("Got one -------------------");
				}

			}

			if(notification.getEventType() == StereotypeExtensionNotification.SET){
				if(obj.getAppliedStereotype("CHESSIoT::CHESSIoTSoftware::Payload") != null){
					IEditorPart editor = null;
					try {
						editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
								.getActivePage().getActiveEditor();
					} catch (Exception e) {

					}
					if (editor != null){
						System.out.println("Got one twoooo -------------------");
//						Stereotype fpStereotype = CHESSIoTProfileManager.getPayload(obj.eResource().getResourceSet());
						
						obj.eResource().getResourceSet().getPackageRegistry().put(CHESSIoTSoftwarePackage.eNS_URI, CHESSIoTSoftwarePackage.eINSTANCE );
						
//						System.out.println(fpStereotype);
						CHESSIoTSoftwarePackage.eINSTANCE.getClass();
						Stereotype objStereo = obj.getAppliedStereotype("CHESSIoT::CHESSIoTSoftware::Payload");
						Payload assume = (Payload) obj.getStereotypeApplication(objStereo);
						
//						test ghdgd = (test) obj.getStereotypeApplication(objStereo);
						
						
						Property param= obj.createOwnedAttribute("params", objStereo);
						
						
						System.out.println(objStereo);
						obj.setValue(objStereo, "have", param);
//						FormalProperty guarantee = (FormalProperty) guaranteeConst.applyStereotype(fpStereotype);
//
//						
//						SensorBlock sens= (SensorBlock) obj.getStereotypeApplication(objStereo);
//						obj.setValue(objStereo, "sensorType", "OTHER");
//						obj.setValue(objStereo, "name", obj.getName());
//						obj.setValue(objStereo, "latitude", "0");
//						obj.setValue(objStereo, "longitude", "0");




//						List<String> list = Arrays.asList("HUMIDITY", "TEMPERATURE","GAZ","MOTION","ULTRASONIC","OTHER");
//						MyCustomDialog dialog1 = new MyCustomDialog(editor.getSite().getShell(),list,obj.getName());
//						dialog1.create();
//						if (dialog1.open() == Window.OK) {
//							obj.setValue(objStereo, "sensorType", dialog1.getSelected());
//							obj.setValue(objStereo, "latitude", dialog1.getLatitude());
//							obj.setValue(objStereo, "longitude", dialog1.getLongitude());
//						}
//						else{
//							MessageDialog md = new MessageDialog(editor.getSite().getShell(),
//									"ERROR", null,"No type selected!, OTHER sensor type was set by default", MessageDialog.ERROR,
//									null, 0);
//						}


					}

				}
				else if(obj.getAppliedStereotype(systemhw_stereotype) != null){
					IEditorPart editor = null;
					try {
						editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
								.getActivePage().getActiveEditor();
					} catch (Exception e) {

					}
					if (editor != null){
						Stereotype objStereo = obj.getAppliedStereotype(systemhw_stereotype);
						obj.setValue(objStereo, "name", obj.getName());
					}
				}
				else if(obj.getAppliedStereotype(actuator_stereotype) != null){
					IEditorPart editor = null;
					try {
						editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
								.getActivePage().getActiveEditor();
					} catch (Exception e) {

					}
					if (editor != null){

						Stereotype objStereo = obj.getAppliedStereotype(actuator_stereotype);
						obj.setValue(objStereo, "actuationType", "OTHER");
						obj.setValue(objStereo, "name", obj.getName());
						obj.setValue(objStereo, "latitude", "0");
						obj.setValue(objStereo, "longitude", "0");


						List<String> list2 = Arrays.asList("LED", "SOUND","SERVO","RELAY","OTHER");
						MyCustomDialog dialog12 = new MyCustomDialog(editor.getSite().getShell(),list2,obj.getName());
						dialog12.create();
						if (dialog12.open() == Window.OK) {
							obj.setValue(objStereo, "actuationType", dialog12.getSelected());
							obj.setValue(objStereo, "latitude", dialog12.getLatitude());
							obj.setValue(objStereo, "longitude", dialog12.getLongitude());
						}

						else{
							MessageDialog md = new MessageDialog(editor.getSite().getShell(),
									"ERROR", null,"No type selected!, OTHER actuator type was set by default", MessageDialog.ERROR,
									null, 0);
						}


					}

				}
				else if(obj.getAppliedStereotype(physical_elt_stereotype) != null){
					IEditorPart editor = null;
					try {
						editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
								.getActivePage().getActiveEditor();
					} catch (Exception e) {

					}
					if (editor != null){

						Stereotype objStereo = obj.getAppliedStereotype(physical_elt_stereotype);
						obj.setValue(objStereo, "name", obj.getName());
						obj.setValue(objStereo, "latitude", "0");
						obj.setValue(objStereo, "longitude", "0");

					}

				}
			}
		}
	}
}

