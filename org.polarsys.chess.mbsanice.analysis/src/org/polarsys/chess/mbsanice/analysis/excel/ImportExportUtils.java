package org.polarsys.chess.mbsanice.analysis.excel;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.sysml.portandflows.FlowPort;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.polarsys.chess.core.util.uml.UMLUtils;

public class ImportExportUtils {

	public final static String SystemViewQN = "CHESS::Core::CHESSViews::SystemView";
	public static final String FlaBehaviorQN = "CHESS::Dependability::FailurePropagation::FLABehavior";
	public final static String BlockQN = "SysML::Blocks::Block";
	public final static String FlowPortQN = "SysML::PortAndFlows::FlowPort";
	public final static String FlaRulesCell = "FLA Rules";
	
	public static Class getBlockFromName(Package systemView, String name) {
		
		Class block = null;
		
		EList<Element> elements = systemView.allOwnedElements();
		for(Element elem : elements){
			if (elem instanceof Class){
				if(((Class)elem).getName().equals(name)){
					block = (Class)elem;
				}
			}
		}
		return block;
	}

	public static int getFlaRulesColumn(Row firstRow) {
		int flaRuleCol = -1;
		for(Cell cell: firstRow){
			if(cell.getStringCellValue().equalsIgnoreCase(ImportExportUtils.FlaRulesCell)){
				flaRuleCol = cell.getColumnIndex();
			}
		}
		return flaRuleCol;
	}

	public static Stereotype applyFlaBehavior(Class block, TransactionalEditingDomain editingDomain) {

		Display.getDefault().syncExec(new Runnable() {
		    public void run() {
				editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {

					protected void doExecute() {
						UMLUtils.applyStereotype(block, FlaBehaviorQN);
					}
				});
		    }
		});

		return block.getAppliedStereotype(FlaBehaviorQN);
	}

	public static List<Class> getTerminalBlocks(Package parent) {
//		System.out.println("********* " + parent.getName() + " ********");
		List<Class> terminalBlocks = new ArrayList<>();

		EList<Element> elements = parent.allOwnedElements();
		for(Element elem : elements){
			if(elem instanceof Class){
				Stereotype blockStereo = elem.getAppliedStereotype(ImportExportUtils.BlockQN);
				if(blockStereo != null){
					Class block = (Class)elem;
//					System.out.println("******* " + block.getName());
					boolean isTerminal = true;
					for(Element ownedElem : block.getOwnedElements()){
						if(ownedElem instanceof Property){
							Property prop = (Property) ownedElem;
							if(prop.getType() != null && prop.getType() instanceof Class){
//								System.out.println("**** " + prop.getType().getName());
								isTerminal = false;
							}
						}
					}
//					System.out.println("* " + isTerminal);
					if(isTerminal){
						terminalBlocks.add(block);
					}
				}
			}
		}
		
		return terminalBlocks;
	}
	
	public static List<Port> getFlowPorts(Class block, String direction) {
		List<Port> ports = new ArrayList<>();
		
		for(Port port : block.getOwnedPorts()){
			Stereotype flowPortStereo = port.getAppliedStereotype(ImportExportUtils.FlowPortQN);
			if(flowPortStereo != null){
				FlowPort flowport = (FlowPort) port.getStereotypeApplication(flowPortStereo);
				if(flowport.getDirection().getName().equalsIgnoreCase(direction)){
					ports.add(port);
				}
			}
		}
		return ports;
	}
	

}
