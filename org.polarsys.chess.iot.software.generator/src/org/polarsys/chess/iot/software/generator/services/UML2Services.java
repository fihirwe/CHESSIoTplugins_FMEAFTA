package org.polarsys.chess.iot.software.generator.services;

import java.util.List;

import java.util.Locale;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Port;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Generic;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.IoTPort;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload;

public class UML2Services {

	public static final String IOTPORT = "CHESSIoT::CHESSIoTSoftware::IoTPort";
	private int VEcounter=0;
	private Date date = new Date();
	public boolean hasStereotype(Class clazz, String stereotypeName) {
		List<Stereotype> stereotypes = clazz.getAppliedStereotypes();
		if(stereotypes.size()==0){
			//			System.err.println("NOTHING GENERATED FOR "+clazz.getName());
			//			System.out.println(stereotypes.size());
			return false;
		}
		else{
			for (Stereotype stereotype : stereotypes) {
				if (stereotype.getName().equals(stereotypeName)) {
					return true;
				}
			}
		}


		return false;
	}

	public String getMillisecond(){
		String time = new SimpleDateFormat("yyyyMMddHHmm", Locale.ENGLISH).format(date);
		return String.valueOf(time);

	}

	public String printMe(String a){
		JOptionPane.showMessageDialog(null, "Here we go"+a, "This is it", JOptionPane.INFORMATION_MESSAGE);
		return null;
	}

	//this check if the component we passed contain the stereoptye of the passed name
	public Boolean checkAppliedStereotype(Component component,String name) {
		List<Stereotype> stereotypes = component.getAppliedStereotypes();
		for (Stereotype stereotype : stereotypes) {
			if(stereotype.getName().contains("VirtualEntity")){
				setVEcounter(1);
				return true;
			}
			else if(stereotype.getName().equals(name)){
				return true;
			}
		}
		return false;
	}

	// this method check if we have a virtual component present in the model
	public Boolean checkIfVirtualCompIsThere() {
		if (getVEcounter()==1) {
			return true;
		}
		else{
			JOptionPane.showMessageDialog(null, "Uh-oh! CHESSOIoT model requiremnts not satisfied. No VirtualBoard node found in your model \n Nothing was generated!", "Model incomplete!", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	//counter getter
	public int getVEcounter() {
		return VEcounter;
	}

	public void setVEcounter(int vEcounter) {
		VEcounter = vEcounter;
	}


	public List<String> getSubComNames(Component component) {
		List<String> compNames= new ArrayList<>();
		for(Element elt:component.allOwnedElements()){
			if(elt instanceof Component){
				compNames.add(((Component) elt).getName().toLowerCase());
			}
		}
		return compNames;
	}



	public List<Property> getComponentsProperties(Component component,Package aPackage){
		List<Property> properties= new ArrayList<>();
		List<String> compNames= new ArrayList<>();
		for(Element elt:aPackage.allOwnedElements()){
			if(elt instanceof Component){
				compNames.add(((Component) elt).getName().toLowerCase());
			}
		}
		for(Property co:component.getAllAttributes()){
			if(!properties.contains(co) && !compNames.contains(co.getName().toLowerCase())){
				properties.add(co);
			}

		}
		return properties;
	}

	public List<Component> getSubComponents(Component component,Package aPackage){
		List<Component> components= new ArrayList<>();
		if (component.getAllAttributes().size()>0) {
			for(Property co:component.getAllAttributes()){
				for(Element elt:aPackage.allOwnedElements()){
					if(elt instanceof Component) {
						Component newC= (Component) elt;
						if(co.getType().getName().equalsIgnoreCase(newC.getName())){
							components.add((Component) elt);
						}
					}
				}
			}
		}
		return components;
	}

	public Boolean checkContainThatClass(Component c, String clStereo) {
		for (Element c1 : c.allOwnedElements()) 
		{
			if (c1 instanceof Class) 
			{
				List<Stereotype> stereotypes = c1.getAppliedStereotypes();
				for (Stereotype stereotype : stereotypes) {
					if(stereotype.getName().equalsIgnoreCase(clStereo))
					{
						return true;
					}
				}
			}
		}
		return false;
	}

	public String getActionName(EObject obj) {
		//			printMe(" Got it ... "+obj.toString());

		Class act= (Class) obj;
		printMe(" Got it ... "+act.getName());
		return act.getName();
	}
	
	
	
	//checking if we have DHT11 SENSOR
	
	public boolean checkSensorTypeAndCategory(Component component, String stereo,String categoryName, String typeName) {
		if ((component.getValue(component.getAppliedStereotype(stereo),"category" ).toString().toLowerCase().contains(categoryName.toLowerCase())) && (component.getValue(component.getAppliedStereotype(stereo),"type" ).toString().toLowerCase().contains(typeName.toLowerCase()))) {
			return true;
		}
		else if(component.getValue(component.getAppliedStereotype(stereo),"type" ).toString().toLowerCase().contains(typeName.toLowerCase())){
			return true;
		}
		return false;
	}

}