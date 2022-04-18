package org.polarsys.chess.mbsanice.analysis.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.GCM.FlowDirectionKind;
import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.papyrus.sysml.diagram.common.edit.part.BlockCompositeEditPart;
import org.eclipse.papyrus.sysml.diagram.common.edit.part.BlockPropertyCompositeEditPart;
import org.eclipse.papyrus.sysml.diagram.internalblock.InternalBlockDiagramForMultiEditor;
import org.eclipse.papyrus.sysml.diagram.internalblock.edit.part.InternalBlockDiagramEditPart;
import org.eclipse.papyrus.sysml.portandflows.FlowPort;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.UMLFactory;
import org.polarsys.chess.diagramsCreator.actions.ShowIBDElementsAction;
import org.polarsys.chess.service.gui.utils.CHESSEditorUtils;

public class ConnectPartsCommand extends AbstractHandler {

	private static final String TITLE = "CHESS Connect Parts";
	private static final String FLOWPORT = "SysML::PortAndFlows::FlowPort";
	
	private static List<Object> selectedElements = new ArrayList<>();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		PapyrusMultiDiagramEditor editor = CHESSEditorUtils.getCHESSEditor();

		Diagram diagram = CHESSEditorUtils.getDiagram(editor);
		Shell shell = HandlerUtil.getActiveShell(event);
		
		TransactionalEditingDomain editingdomain = (TransactionalEditingDomain) editor.getEditingDomain();
		

		StructuredSelection selection = (StructuredSelection) HandlerUtil.getCurrentSelection(event);
		selectedElements = Arrays.asList(selection.toArray());
		if(selectedElements.size() < 2){
			MessageDialog.openError(shell, TITLE, "please select 2 elements (SysMl parts and/or the containing Block)");
		}else{
			List<BlockPropertyCompositeEditPart> selectedParts = new ArrayList<>();
			BlockCompositeEditPart selectedBlock = null;
			for(Object obj : selectedElements){
				if(obj instanceof BlockPropertyCompositeEditPart){
					selectedParts.add((BlockPropertyCompositeEditPart) obj);
				}else if (obj instanceof BlockCompositeEditPart){
					selectedBlock = (BlockCompositeEditPart)obj;
				}
			}
			if(selectedParts.size() != selectedElements.size() && selectedBlock == null){
				MessageDialog.openError(shell, TITLE, "please select only SysML parts and/or the containing Block");
			}else{
				Class container = null;
				if(selectedBlock != null){
					container = (Class) selectedBlock.resolveSemanticElement();
				}
				List<PortProperty> allInputs = new ArrayList<>();
				List<PortProperty> allOutputs = new ArrayList<>();
				//get ports from inner parts
				for(BlockPropertyCompositeEditPart editPart : selectedParts){
					EObject elem = ((IGraphicalEditPart) editPart).resolveSemanticElement();
					if(elem instanceof Property){
						Property part = (Property)elem;
						System.out.println("*** PART " + part.getName());
						if(part.getType() instanceof Class){
							if(container == null){
								container = (Class) part.getOwner();
							}
							Class block = (Class)part.getType();
							System.out.println("*** BLOCK " + block.getName());
							for(Port ownedPort : block.getOwnedPorts()){
								Stereotype flowPortStereo = ownedPort.getApplicableStereotype(FLOWPORT) ;
								if(flowPortStereo != null){
									FlowPort flow = (FlowPort) ownedPort.getStereotypeApplication(flowPortStereo);
									System.out.println("***** PORT " + flow.getBase_Port().getName() + " : " + flow.getDirection());
									if(flow.getDirection().toString().equals(FlowDirectionKind.OUT.toString())){
										allOutputs.add(new PortProperty(flow.getBase_Port(), part));
										System.out.println("***** PORT added to allOutputs");
									}else if(flow.getDirection().toString().equals(FlowDirectionKind.IN.toString())){
										allInputs.add(new PortProperty(flow.getBase_Port(), part));
										System.out.println("***** PORT added to allInputs");
									}
								}
							}
						}
					}
				}
				
				//get ports of outer block (container)
				if(selectedBlock != null){
					System.out.println("*** BLOCK (container)" + container.getName());
					for(Port ownedPort : container.getOwnedPorts()){
						Stereotype flowPortStereo = ownedPort.getApplicableStereotype(FLOWPORT) ;
						if(flowPortStereo != null){
							FlowPort flow = (FlowPort) ownedPort.getStereotypeApplication(flowPortStereo);
							System.out.println("***** PORT " + flow.getBase_Port().getName() + " : " + flow.getDirection());
							if(flow.getDirection().toString().equals(FlowDirectionKind.OUT.toString())){
								allOutputs.add(new PortProperty(flow.getBase_Port(), null));
								System.out.println("***** PORT added to allOutputs");
							}else if(flow.getDirection().toString().equals(FlowDirectionKind.IN.toString())){
								allInputs.add(new PortProperty(flow.getBase_Port(), null));
								System.out.println("***** PORT added to allInputs");
							}
						}
					}
				}
				
				List<Connector> connectors = createConnections(allInputs, allOutputs, container, editingdomain);
				
				if(diagram != null){
					showConnectionsInDiagram(connectors, editor, diagram);
				}
			}
		}
		return null;
	}

	private void showConnectionsInDiagram(List<Connector> connectors, PapyrusMultiDiagramEditor editor, Diagram diagram) {
		
		IEditorPart activeEditorPart = editor.getActiveEditor();
		if(activeEditorPart instanceof InternalBlockDiagramForMultiEditor){
			InternalBlockDiagramForMultiEditor diagramEditor = (InternalBlockDiagramForMultiEditor) activeEditorPart;
			InternalBlockDiagramEditPart diagramEditPart = (InternalBlockDiagramEditPart) diagramEditor.getGraphicalViewer().getEditPartRegistry().get(diagram);
			BlockCompositeEditPart blockCompEditPart = (BlockCompositeEditPart) diagramEditPart.getChildren().get(0);
	
//			StructureCompartmentEditPart structCompEditPart = (StructureCompartmentEditPart) blockCompEditPart.getChildren().get(1);
			if(connectors.size() > 0){
				EList<Connector> list = new BasicEList<>(connectors);
				ShowIBDElementsAction.getInstance().setHost(blockCompEditPart);
				ShowIBDElementsAction.getInstance().drawConnectors(blockCompEditPart, list);
//				DropObjectsRequest dropObjectsRequest = new DropObjectsRequest();
//				dropObjectsRequest.setObjects(connectors);
//				dropObjectsRequest.setLocation(new Point(20,100));
//				try{
//					Command commandDrop = structCompEditPart.getCommand(dropObjectsRequest);
//					structCompEditPart.getDiagramEditDomain().getDiagramCommandStack().execute(commandDrop);
//				}catch(Exception e){
//					e.printStackTrace();
//				}
			}
		}
	}

	private List<Connector> createConnections(List<PortProperty> allInputs, List<PortProperty> allOutputs, Element container, TransactionalEditingDomain editingdomain) {
		
		List<Connector> connectors = new ArrayList<>();
		//iterate over output ports and get input ports with same name
		editingdomain.getCommandStack().execute(new RecordingCommand(editingdomain) {
			protected void doExecute() {
				for(PortProperty outPair : allOutputs){
					//connectors between parts
					for (int i = 0; i < allInputs.size(); i++){
						PortProperty inPair = allInputs.get(i);
						if(outPair.getProperty() != null && inPair.getProperty() != null){
							// comparison is between port names 
							// based on assumption that every port name starts with "i" or "o" followed by "_" and then the port name
							if(outPair.getPort().getName().substring(1).equals(inPair.getPort().getName().substring(1))){
								//check if connector already exists
								if(!isAlreadyConnected(outPair, inPair, container)){
									Connector conn = createConnector(outPair, inPair);
									connectors.add(conn);
									((StructuredClassifier) container).getOwnedConnectors().add(conn);
									System.out.println("NEW CONNECTION: " + outPair.getPort().getName() + ":" + outPair.getProperty().getName() + " -> " + inPair.getPort().getName() + ":" + inPair.getProperty().getName());
								}
							}
						}
					}
				}	
				//delegation out
				for(int i = 0; i < allOutputs.size(); i++){
					PortProperty firstPair = allOutputs.get(i);
					for (int j = 0; j < allOutputs.size(); j++){
						PortProperty secondPair = allOutputs.get(j);
						if(i != j){
							if(firstPair.getProperty() == null || secondPair.getProperty() == null){
								if(firstPair.getPort().getName().substring(1).equals(secondPair.getPort().getName().substring(1))){
									//check if connector already exists
									if(!isAlreadyConnected(firstPair, secondPair, container)){
										Connector conn = createConnector(firstPair, secondPair);
										connectors.add(conn);
										((StructuredClassifier) container).getOwnedConnectors().add(conn);
									}
								}
							}
						}
					}
				}
				//delegation in
				for(int i = 0; i < allInputs.size(); i++){
					PortProperty firstPair = allInputs.get(i);
					for (int j = 0; j < allInputs.size(); j++){
						PortProperty secondPair = allInputs.get(j);
						if(i != j){
							if(firstPair.getProperty() == null || secondPair.getProperty() == null){
								if(firstPair.getPort().getName().substring(1).equals(secondPair.getPort().getName().substring(1))){
									//check if connector already exists
									if(!isAlreadyConnected(firstPair, secondPair, container)){
										Connector conn = createConnector(firstPair, secondPair);
										connectors.add(conn);
										((StructuredClassifier) container).getOwnedConnectors().add(conn);
									}
								}
							}
						}
					}
				}
			}
		});
		return connectors;
	}
	

	private Connector createConnector(PortProperty firstPair, PortProperty secondPair) {
		Connector conn = UMLFactory.eINSTANCE.createConnector();   
		ConnectorEnd firstEnd = UMLFactory.eINSTANCE.createConnectorEnd();
		ConnectorEnd secondEnd = UMLFactory.eINSTANCE.createConnectorEnd();
		String connectorName = firstPair.getPort().getName().substring(2);
		firstEnd.setRole(firstPair.getPort());
		if(firstPair.getProperty() != null){
			firstEnd.setPartWithPort(firstPair.getProperty());
			connectorName += "_" + firstPair.getProperty().getName();
		}//else delegation
		conn.getEnds().add(firstEnd);
		secondEnd.setRole(secondPair.getPort());
		if(secondPair.getProperty() != null){
			secondEnd.setPartWithPort(secondPair.getProperty());
			connectorName += "_" + secondPair.getProperty().getName();
		}//else delegation
		conn.getEnds().add(secondEnd);
		//based on assumptions above
		conn.setName(connectorName);
		
		return conn;
	}
	
	private boolean isAlreadyConnected(PortProperty outPair, PortProperty inPair, Element container) {
		// all comparison are between port names 
		// based on assumption that every port name starts with "i" or "o" followed by "_" and then the port name
		boolean result = false;
		String inPort = inPair.getPort().getName().substring(1);
		String inProp = null;
		if(inPair.getProperty() != null){
			inProp = inPair.getProperty().getName();
		}
		String outPort = outPair.getPort().getName().substring(1);
		String outProp = null;
		if(outPair.getProperty() != null){
			outProp = outPair.getProperty().getName();
		}
		EList<Connector> connectors = ((StructuredClassifier) container).getOwnedConnectors();
		for (Connector conn : connectors){
			if(conn.getEnds().size() == 2){
				ConnectorEnd firstEnd = conn.getEnds().get(0);
				ConnectorEnd secondEnd = conn.getEnds().get(1);
				if(firstEnd.getRole() instanceof Port && secondEnd.getRole() instanceof Port){
					String firstPort = firstEnd.getRole().getName().substring(1);
					String firstProp = null;
					if(firstEnd.getPartWithPort() != null){
						firstProp = firstEnd.getPartWithPort().getName();
					}
					String secondPort = secondEnd.getRole().getName().substring(1);
					String secondProp = null;
					if(secondEnd.getPartWithPort() != null){
						secondProp = secondEnd.getPartWithPort().getName();
					}
					if(firstProp != null && secondProp != null){
						if((firstPort.equals(inPort) && firstProp.equals(inProp) && secondPort.equals(outPort) && secondProp.equals(outProp)) ||
								(firstPort.equals(outPort) && firstProp.equals(outProp) && secondPort.equals(inPort) && secondProp.equals(inProp))){
							result = true;
							System.out.println("ALREADY CONNECTED: " + outPort + ":" + outProp + " -> " + inPort + ":" + inProp);
						}
					}else if(firstProp != null && secondProp == null){
						//delegation #1
						if((firstPort.equals(inPort) && firstProp.equals(inProp) && secondPort.equals(outPort)) ||
								 (firstPort.equals(outPort) && firstProp.equals(outProp) && secondPort.equals(inPort))){
							result = true;
						}
					}else if(firstProp == null && secondProp != null){
						//delegation #2
						if((firstPort.equals(inPort) && secondPort.equals(outPort) && secondProp.equals(outProp)) ||
								(firstPort.equals(outPort) && secondPort.equals(inPort) && secondProp.equals(inProp))){
							result = true;
						}
					}
				}
				
			}
		}
		
		return result;
	}

	private class PortProperty{
		private Port port;
		private Property property;
		
		public PortProperty (Port port, Property property){
			setPort(port);
			setProperty(property);
		}
		
		public Port getPort() {
			return port;
		}
		public void setPort(Port port) {
			this.port = port;
		}
		public Property getProperty() {
			return property;
		}
		public void setProperty(Property property) {
			this.property = property;
		}
	}

}
