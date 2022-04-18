package org.polarsys.chess.mbsanice.analysis.utils;

import java.util.ArrayList;

import org.apache.poi.xssf.streaming.SXSSFCell;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.polarsys.chess.fla.flamm.Component;
import org.polarsys.chess.fla.flamm.CompositeComponent;
import org.polarsys.chess.fla.flamm.SimpleComponent;

public class Utils {
	
	public static ArrayList<SimpleComponent> getSimpleComponents(Component comp){
		ArrayList<SimpleComponent> arr = new ArrayList<SimpleComponent>();
		if (comp instanceof CompositeComponent){
			for (Component c : ((CompositeComponent) comp).getComponents()){
				if (c instanceof SimpleComponent){
					arr.add((SimpleComponent)c);
				}else{
					ArrayList<SimpleComponent> arrtemp = getSimpleComponents(c);
					for (SimpleComponent sc : arrtemp){
						arr.add(sc);
					}
					
				}
			}
		}else if (comp instanceof SimpleComponent){
			arr.add((SimpleComponent) comp);
		}
		return arr;
	}
	
	/**
	 * returns the namespace for the given component
	 * @param comp
	 * @return
	 */
	public static String getNamespace (Component comp){
		String pathname = "";
		Component parent = comp.getParent();
		while (parent != null){
			if (pathname=="")
				pathname = parent.getName();
			else
				pathname = parent.getName()+"."+pathname;
			parent = parent.getParent();
		}
		return pathname;
				
	}
	
	/**
	 * checks inside the CompositeComponent for a SimpleComponent representing the InstanceSpecification.
	 * @param comp : the root component of the FLA model
	 * @param source : The name of the InstanceSpecification should own the path to the root (x.y.instanceName),
	 * 					as derived from the CHESS BuildInstance command.
	 * @param path : empty string
	 * @return
	 */
	public static SimpleComponent getFLAMMComponent(CompositeComponent comp, InstanceSpecification source, String path){
		if (source == null)
			return null;
		path = path + comp.getName();
		String temp="";
		SimpleComponent flammComp = null;
		for (Component child : comp.getComponents()){
			if (child instanceof SimpleComponent){
				temp = path+"."+child.getName();
				if (temp.compareTo(source.getName())==0){
					flammComp = (SimpleComponent) child;
					return flammComp;
				}
			}
			else{
				flammComp = getFLAMMComponent((CompositeComponent)child, source, path+".");
				if (flammComp != null){
					return flammComp;
				}
			}
		}
		return flammComp;
	}
	
	/**
	 * returns the entity on which the given comp is allocated, if any, null otherwise
	 * assumption: allocation are modelled with 1-n sysml Allocate Abstraction. the given comp must be the source of the Allocate.
	 * FLA components correspond to UML InstanceSpecification
	 * @param comp
	 * @return
	 */
	public static NamedElement getAllocation(Component comp, Resource chessResource){
		Model umlModel = (Model) EcoreUtil.getObjectByType(chessResource.getContents(), UMLPackage.Literals.MODEL);
		for (Element elem: umlModel.allOwnedElements()){
			if (elem instanceof Abstraction){
				Stereotype ste = elem.getApplicableStereotype("SysML::Allocations::Allocate");
				Abstraction abs = (Abstraction) elem;
				if (abs.getClients().size()==1 && abs.getSuppliers().size()>1){
					NamedElement client = abs.getClients().get(0);
					//TODO current assumption: client is an InstanceSpecification
					String name = client.getName();
					name = name.substring(name.lastIndexOf(".")+1);
					if (name.equals(comp.getName())){
						//TODO current assumption: supplier is an InstanceSpecification
						for (NamedElement target : abs.getSuppliers()){
							if (target instanceof InstanceSpecification)
								return target;
						}
					}
				}
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @param worksheet
	 * @param rowToCopy
	 * @param rowIndex  the index where new row needs to be created
	 * @param numColumn the number of columns to be copied, from 0 to ...
	 * @return
	 */
	public SXSSFRow copyRow(SXSSFSheet worksheet, SXSSFRow rowToCopy, int rowCopyIndex, int numColumn){
		SXSSFCell cellcopy = null;
		SXSSFRow copyRow = worksheet.createRow(rowCopyIndex);
		for (int i=0; i<numColumn; i++){
			cellcopy = copyRow.createCell(i);
			if (rowToCopy.getCell(i) != null){
				cellcopy.setCellValue(rowToCopy.getCell(i).getStringCellValue());
				cellcopy.setCellStyle(rowToCopy.getCell(i).getCellStyle());
			}
		}
		return copyRow;
	}
	

}
