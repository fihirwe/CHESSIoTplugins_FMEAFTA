/*******************************************************************************
 * Copyright (C) 2020 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 ******************************************************************************/
package org.polarsys.chess.diagramsCreator.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.elk.alg.layered.options.LayeredOptions;
import org.eclipse.elk.alg.layered.options.LayeringStrategy;
import org.eclipse.elk.core.math.KVector;
import org.eclipse.elk.core.options.CoreOptions;
import org.eclipse.elk.core.options.Direction;
import org.eclipse.elk.core.options.HierarchyHandling;
import org.eclipse.elk.core.options.SizeConstraint;
import org.eclipse.elk.core.options.SizeOptions;
import org.eclipse.elk.core.service.DiagramLayoutEngine;
import org.eclipse.elk.core.service.DiagramLayoutEngine.Parameters;
import org.eclipse.elk.graph.ElkNode;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.requests.DropObjectsRequest;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationModel;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationUtils;
import org.eclipse.papyrus.infra.services.openelement.service.OpenElementService;
import org.eclipse.papyrus.infra.ui.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.uml.diagram.statemachine.custom.edit.part.CustomRegionCompartmentEditPart;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.StateMachine;
import org.polarsys.chess.diagramsCreator.actions.ShowBDDElementsAction;
import org.polarsys.chess.diagramsCreator.actions.ShowSMDElementsAction;
import org.polarsys.chess.diagramsCreator.actions.ShowBDDElementsAction.DisplayableElement;



public class DiagramUtils {
	private final static String STMD = "PapyrusUMLStateMachineDiagram";
	private final static String BDD = "BlockDefinition";
	final private static String IBD = "InternalBlock";
	private static final Logger logger = Logger.getLogger(DiagramUtils.class);
	
	private static DiagramUtils diagramUtils;
	
	public static DiagramUtils getInstance(){
		if(diagramUtils == null){
			diagramUtils = new DiagramUtils();
		}
		return diagramUtils;
	}
	
	/**
	 * Tries to show an Element in an EditPart.
	 * @param elementToShow the Element to show
	 * @param activeEditor the editor corresponding to the editPart
	 * @param editPart the EditPart to show the Element in
	 * @param position position is used to try to distribute the drop
	 * @return the Command to display the element
	 */
	/*public static Command showElementIn(EObject elementToShow, DiagramEditor activeEditor, EditPart editPart, int position) {
		
		if (elementToShow instanceof Element) {
			DropObjectsRequest dropObjectsRequest = new DropObjectsRequest();
			ArrayList<Element> list = new ArrayList<Element>();
			list.add((Element) elementToShow);
			dropObjectsRequest.setObjects(list);
			dropObjectsRequest.setLocation(new Point(20, 100 * position));
			Command cmd = editPart.getCommand(dropObjectsRequest);

			if (cmd != null && cmd.canExecute()) {
				return cmd;
			}
		}
		return null;
	}
	*/
	
	/**
	 * Tries to show an Element in an EditPart.
	 * 
	 * @param elementToShow
	 *            the Element to show
	 * @param activeEditor
	 *            the editor corresponding to the editPart
	 * @param editPart
	 *            the EditPart to show the Element in
	 * @param position
	 *            position is used to try to distribute the drop
	 * @return the Command to display the element
	 */
	//FIXME replace this method with showElementsIn
	public Command showElementIn(EObject elementToShow, DiagramEditor activeEditor, EditPart editPart, int position,
			List<EditPart> childrenList) {
		if (elementToShow instanceof Element) {
			DropObjectsRequest dropObjectsRequest = new DropObjectsRequest();
			ArrayList<Element> list = new ArrayList<Element>();
			list.add((Element) elementToShow);
			dropObjectsRequest.setObjects(list);
			dropObjectsRequest.setLocation(new Point(100 * position, 100 * position));
			Command commandDrop = editPart.getCommand(dropObjectsRequest);

			boolean processChildren = false;
			if (commandDrop == null) {
				processChildren = true;
			} else {
				if (commandDrop.canExecute()) {
					return commandDrop;
				} else {
					processChildren = true;
				}
			}

			if (processChildren) {
				// List<EditPart> childrenList = findAllChildren(editPart);
				for (Object child : childrenList) {
					if (child instanceof CustomRegionCompartmentEditPart) {
						Command commandDropChild = ((EditPart) child).getCommand(dropObjectsRequest);
						if (commandDropChild != null) {
							if (commandDropChild.canExecute()) {
								return commandDropChild;
							}
						}
					}
				}
			}
		}
		return null;
	}

	public Command showElementsIn(ArrayList<EObject> elementsToDisplay, DiagramEditor activeEditor, EditPart editPart,
			List<EditPart> childrenList, Point pos) {

		DropObjectsRequest dropObjectsRequest = new DropObjectsRequest();
		ArrayList<Element> list = new ArrayList<Element>();

		for (EObject elementToShow : elementsToDisplay) {

			if (elementToShow instanceof Element) {

				list.add((Element) elementToShow);

			}
		}

		dropObjectsRequest.setObjects(list);
		dropObjectsRequest.setLocation(pos);
		Command commandDrop = editPart.getCommand(dropObjectsRequest);

		boolean processChildren = false;
		if (commandDrop == null) {
			processChildren = true;
		} else {
			if (commandDrop.canExecute()) {
				return commandDrop;
			} else {
				processChildren = true;
			}
		}

		if (processChildren) {
			// List<EditPart> childrenList = findAllChildren(editPart);
			for (Object child : childrenList) {
				if (child instanceof EditPart) {
					Command commandDropChild = ((EditPart) child).getCommand(dropObjectsRequest);
					if (commandDropChild != null) {
						if (commandDropChild.canExecute()) {
							return commandDropChild;
						}
					}
				}
			}
		}

		return null;
	}
	
	/**
	 * Util method used to find all the children of a certain editpart.
	 * 
	 * @param list
	 *            the children found recursively
	 * @param root
	 *            the root editpart to start the search from
	 */
	@SuppressWarnings("unchecked")
	public List<EditPart> findAllChildren(EditPart root) {
		List<EditPart> list = new ArrayList<EditPart>();
		list.addAll(root.getChildren());
		for (Object editPart : root.getChildren()) {
			if (editPart instanceof EditPart) {
				list.addAll(findAllChildren((EditPart) editPart));
			}
		}
		return list;
	}
	public void createOrRefreshStateMachineDiagram(Diagram stateMachineDiagram,StateMachine stateMachine,
			boolean rearrangeDiagramLayout, ExecutionEvent event) {

		// Switch to the Papyrus perspective
		final IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		final IPerspectiveDescriptor descriptor = window.getWorkbench().getPerspectiveRegistry()
				.findPerspectiveWithId("org.eclipse.papyrus.infra.core.perspective");
		window.getActivePage().setPerspective(descriptor);

		

		final ShowSMDElementsAction smdAction = ShowSMDElementsAction.getInstance();
		if (stateMachineDiagram != null) {
			smdAction.refreshDiagram(stateMachineDiagram);
		} else {
			stateMachineDiagram = smdAction.addSMD(stateMachine);
			smdAction.populateDiagram(stateMachineDiagram);
		}

		if (rearrangeDiagramLayout) {
			rearrangeDiagramLayout(event);
		}

	}

	public void createOrRefreshBDDDiagramByReferenceWithEmptyBlocks(Diagram blockDefinitionDiagram, Package pkg, ExecutionEvent event,
			EList<Element> elementsByRef, boolean rearrangeDiagramLayout) throws Exception {

		// Creation of an action to handle the BDD diagrams
		final ShowBDDElementsAction bddAction = ShowBDDElementsAction.getInstance();
		
		// Disable the visualization of inner elements
		bddAction.setDisplayableElement(new HashSet<DisplayableElement>());

		if (blockDefinitionDiagram != null) {
			bddAction.refreshDiagram(blockDefinitionDiagram);
		} else {
			try {
				blockDefinitionDiagram = bddAction.addBDD(pkg);
			} catch (Exception e) {
				e.printStackTrace();
			}
			bddAction.populateDiagramByReference(blockDefinitionDiagram, elementsByRef);
		}

		if (rearrangeDiagramLayout) {
			rearrangeDiagramLayout(event, getParams());
		}
	}
	
	public void createOrRefreshBDDDiagramByReference(Diagram blockDefinitionDiagram, Package pkg, ExecutionEvent event,
			EList<Element> elementsByRef, boolean rearrangeDiagramLayout, Set<DisplayableElement> displayableElements) {

		// Creation of an action to handle the BDD diagrams
		final ShowBDDElementsAction bddAction = ShowBDDElementsAction.getInstance();
		
		// Set the visualization of inner elements
		bddAction.setDisplayableElement(displayableElements);

		if (blockDefinitionDiagram != null) {
			bddAction.refreshDiagram(blockDefinitionDiagram);
		} else {
			try {
				blockDefinitionDiagram = bddAction.addBDD(pkg);
			} catch (Exception e) {
				e.printStackTrace();
			}
			bddAction.populateDiagramByReference(blockDefinitionDiagram, elementsByRef);
		}

		if (rearrangeDiagramLayout) {
			rearrangeDiagramLayout(event, getParams());
		}
	}
	
	public void createOrRefreshBDDDiagram(Diagram blockDefinitionDiagram, Package pkg, ExecutionEvent event,
			boolean rearrangeDiagramLayout) throws Exception {

		createOrRefreshBDD(blockDefinitionDiagram, pkg);

		if (rearrangeDiagramLayout) {
			rearrangeDiagramLayout(event);
		}
	}

	public void createOrRefreshBDDDiagram(Diagram blockDefinitionDiagram, Package pkg, ExecutionEvent event,
		boolean rearrangeDiagramLayout, Parameters param) throws Exception {

		createOrRefreshBDD(blockDefinitionDiagram, pkg);
		
		if (rearrangeDiagramLayout) {
			rearrangeDiagramLayout(event, param);
		}
	}
	
	private void createOrRefreshBDD(Diagram blockDefinitionDiagram, Package pkg) {
		// Creation of an action to handle the BDD diagrams
		final ShowBDDElementsAction bddAction = ShowBDDElementsAction.getInstance();

		// Define which elements should be displayed in the diagram
		final Set<DisplayableElement> elementsToDisplay = new HashSet<DisplayableElement>();
		elementsToDisplay.add(DisplayableElement.OPERATION);
		elementsToDisplay.add(DisplayableElement.PROPERTY);
		bddAction.setDisplayableElement(elementsToDisplay);

		if (blockDefinitionDiagram != null) {
			bddAction.refreshDiagram(blockDefinitionDiagram);
		} else {
			try {
				logger.debug("pkg.eResource(): "+pkg.eResource());
				blockDefinitionDiagram = bddAction.addBDD(pkg);
			} catch (Exception e) {
				e.printStackTrace();
			}
			bddAction.populateDiagram(blockDefinitionDiagram);
		}

	}
	
	public void rearrangeDiagramLayout(ExecutionEvent event) {	
		rearrangeDiagramLayout(event, null);		
	}
	
	public void rearrangeDiagramLayout(ExecutionEvent event, Parameters params) {
		// Call the Eclipse Layout Kernel engine
		final IEditorPart editorPart = HandlerUtil.getActiveEditor(event);
		IEditorPart nestedEditor = null;
		if (editorPart instanceof IMultiDiagramEditor) {
			nestedEditor = ((IMultiDiagramEditor) editorPart).getActiveEditor();
		}

		if (nestedEditor instanceof DiagramEditor) {
			final Object diagramPart = null;
	        if (params == null)
	        {
				final boolean zoomToFit = false;
				DiagramLayoutEngine.invokeLayout(nestedEditor, diagramPart, false, false, false, zoomToFit);
	        }
	        else
	        {
	        	DiagramLayoutEngine.invokeLayout(editorPart, diagramPart, params);
	        }

		}
	}
	
	
	/**
	 * Returns the parameters to apply to the auto layout function
	 * @return
	 */
	private Parameters getParams(){
		DiagramLayoutEngine.Parameters params = new DiagramLayoutEngine.Parameters();

		params.getGlobalSettings()

		.setProperty(CoreOptions.ANIMATE, true)
		.setProperty(CoreOptions.LAYOUT_ANCESTORS, false)
		.setProperty(CoreOptions.NODE_SIZE_MINIMUM, new KVector(300d, 300d))
		.setProperty(CoreOptions.NODE_SIZE_CONSTRAINTS, SizeConstraint.minimumSize())
		.setProperty(CoreOptions.HIERARCHY_HANDLING, HierarchyHandling.INCLUDE_CHILDREN)
		.setProperty(CoreOptions.NODE_SIZE_OPTIONS, EnumSet.of(SizeOptions.DEFAULT_MINIMUM_SIZE))
		.setProperty(CoreOptions.PROGRESS_BAR, false)
		//.setProperty(CoreOptions.ZOOM_TO_FIT, true)
		.setProperty(CoreOptions.ALGORITHM, "org.eclipse.elk.layered.layered")
		;

		params.addLayoutRun().configure(ElkNode.class)


		.setProperty(LayeredOptions.SPACING_NODE_NODE, 10d)
		.setProperty(LayeredOptions.DIRECTION, Direction.DOWN)
		.setProperty(LayeredOptions.EDGE_THICKNESS, 10d)
		.setProperty(LayeredOptions.LAYERING_STRATEGY, LayeringStrategy.NETWORK_SIMPLEX)
		.setProperty(LayeredOptions.NODE_SIZE_MINIMUM, new KVector(150d, 150d))
		.setProperty(LayeredOptions.NODE_SIZE_CONSTRAINTS, SizeConstraint.minimumSize())
		.setProperty(LayeredOptions.NODE_SIZE_OPTIONS, EnumSet.of(SizeOptions.DEFAULT_MINIMUM_SIZE));
		
		return params;
	}
			
	public void createOrUpdateBDDClassesAndTypesDiagrams(ExecutionEvent event, Package classesPkg, Package typesPkg, boolean arrangeLayout) throws Exception{
	
		// Retrieve the block definition diagrams, if already present
		final Collection<Diagram> diagrams = getDiagrams();
		Diagram classesBlockDefinitionDiagram = getBDD(diagrams, classesPkg);
		Diagram typesBlockDefinitionDiagram = getBDD(diagrams, typesPkg);

		createOrRefreshBDDDiagram(classesBlockDefinitionDiagram, classesPkg, event, arrangeLayout);
		createOrRefreshBDDDiagram(typesBlockDefinitionDiagram, typesPkg, event, arrangeLayout);
	}
	
	/**
	 * Creates or updates the BDD diagrams for the given packages, with the given reference elements.
	 * @param event the event
	 * @param packages the packages that need a diagram
	 * @param elementsByRefList the list of elements to display
	 * @param displayableElements the inner elements to display
	 * @param arrangeLayout if true, rearrange the diagram
	 */
	public void createOrUpdateBDDDiagramsByReference(ExecutionEvent event, List<Package> packages, 
			List<EList<Element>> elementsByRefList,	Set<DisplayableElement> displayableElements, boolean arrangeLayout) {

		// Retrieve the block definition diagrams, if already present
		final Collection<Diagram> diagrams = getDiagrams();
		
		for (int i = 0; i < packages.size(); i++) {
			final Package pkg = packages.get(i);
			final Diagram diagram = getBDD(diagrams, pkg);
			
			// Create the diagram only if there are some elements to display
			if (elementsByRefList.get(i).size() != 0) {
				createOrRefreshBDDDiagramByReference(diagram, pkg, event, elementsByRefList.get(i), arrangeLayout, displayableElements);
			}
		}
	}
	
	public void createOrUpdateBDDClassesAndTypesDiagrams2(ExecutionEvent event, Package classesPkg, Package typesPkg){
		// Retrieve the classes and types packages built before
		//final Package classesPkg = rfiAccEntityUtil.createOrReturnClassesPackage(systemViewPkg);
		//final Package typesPkg = rfiAccEntityUtil.createOrReturnTypesPackage(systemViewPkg);

		// Creation of an action to handle the BDD diagrams
		final ShowBDDElementsAction bddAction = ShowBDDElementsAction.getInstance();

		// Retrieve the block definition diagrams, if already present
		final Collection<Diagram> diagrams = getDiagrams();
		Diagram classesBlockDefinitionDiagram = getBDD(diagrams, classesPkg);
		Diagram typesBlockDefinitionDiagram = getBDD(diagrams, typesPkg);

		// Define which elements should be displayed in the diagrams
		final Set<DisplayableElement> elementsToDisplay = new HashSet<DisplayableElement>();
		elementsToDisplay.add(DisplayableElement.OPERATION);
		elementsToDisplay.add(DisplayableElement.PROPERTY);
		bddAction.setDisplayableElement(elementsToDisplay);

//		
//		try {
//			IPageManager manager = ServiceUtilsForHandlers.getInstance().getIPageManager(event);
//			
//			System.out.println("page manager = " + manager);
//			for (Object obj : manager.allPages()) {
//				System.out.println("all page = " + obj);
//			}
//			
//		} catch (ServiceException e1) {
//			e1.printStackTrace();
//		}
//		
//		
//		
//		
//		
//		IWorkbenchPage page;
//		IEditorPart editor;
//		page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
//		System.out.println("\n1 active page = " + page);
//		
//		for(IEditorReference ref : page.getEditorReferences()) {
//			System.out.println("IEditorReference name = " + ref.getName());
//			System.out.println("IEditorReference editor = " + ref.getEditor(false));
//		}
//		
//		editor = page.getActiveEditor();
//		System.out.println("\n1 active editor = " + editor);
//		if (editor instanceof IMultiDiagramEditor) {
//			editor = ((IMultiDiagramEditor) editor).getActiveEditor();
//			System.out.println("\n1 editor = " + editor);
//		}
//
//		try {
//			IPageManager manager = ServiceUtilsForEObject.getInstance().getIPageManager(classesPkg);
//			
//			System.out.println("page manager = " + manager);
//			for (Object obj : manager.allPages()) {
//				System.out.println("all page = " + obj);
//			}
//
//			
//		} catch (ServiceException e1) {
//			e1.printStackTrace();
//		}

		
		

		
		
		{

			// Create the types BDD if needed, or refresh it
			if (typesBlockDefinitionDiagram != null) {
				bddAction.refreshDiagram(typesBlockDefinitionDiagram);
			} else {					
				try {
					typesBlockDefinitionDiagram = bddAction.addBDD(typesPkg);
				} catch (Exception e) {
					e.printStackTrace();
				}
				bddAction.populateDiagram(typesBlockDefinitionDiagram);
			}

			// Run a thread to layout the diagram
			(new LayoutThread(event)).start();
		}

//		page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
//		System.out.println("\n2 active page = " + page);
//		editor = page.getActiveEditor();
//		System.out.println("\n2 active editor = " + editor);
//		if (editor instanceof IMultiDiagramEditor) {
//			editor = ((IMultiDiagramEditor) editor).getActiveEditor();
//			System.out.println("\n2 editor = " + editor);
//			System.out.println("\n2 editor title = " + ((IMultiDiagramEditor) editor).getTitle());
//		}
//
//		//TODO: continuare nel guardare quali sono gli editor disponibili e vedere se riesco ad attivarne altri
//		
//		
		{
			// Create the classes BDD if needed, or refresh it
			if (classesBlockDefinitionDiagram != null) {
				bddAction.refreshDiagram(classesBlockDefinitionDiagram);
			} else {					
				try {
					classesBlockDefinitionDiagram = bddAction.addBDD(classesPkg);
				} catch (Exception e) {
					e.printStackTrace();
				}
				bddAction.populateDiagram(classesBlockDefinitionDiagram);
			}
			
			// Run a thread to layout the diagram
			(new LayoutThread(event)).start();
			
		}
//
//		page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
//		System.out.println("\n3 active page = " + page);
//		editor = page.getActiveEditor();
//		System.out.println("\n3 active editor = " + editor);
//		if (editor instanceof IMultiDiagramEditor) {
//			editor = ((IMultiDiagramEditor) editor).getActiveEditor();
//			System.out.println("\n3 editor = " + editor);
//			System.out.println("\n3 editor title = " + ((IMultiDiagramEditor) editor).getTitle());
//		}
	}
	

	/**
	 * Simple thread to call the layout of the diagram.
	 */
	private class LayoutThread extends Thread {
		IEditorPart editorPart;
		public LayoutThread(ExecutionEvent event) {
			editorPart = HandlerUtil.getActiveEditor(event);
		}
		
		@Override
		public void run() {

			// Call the Eclipse Layout Kernel engine        			
			if (editorPart instanceof IMultiDiagramEditor) {
				editorPart = ((IMultiDiagramEditor) editorPart).getActiveEditor();
			}
			
			if (editorPart instanceof DiagramEditor) {
				final Object diagramPart = null;
				final boolean zoomToFit = false;

				// Call the layout, twice for better results
				DiagramLayoutEngine.invokeLayout(editorPart, diagramPart, false, false, false, zoomToFit);
				DiagramLayoutEngine.invokeLayout(editorPart, diagramPart, false, false, false, zoomToFit);
			}
		}
	}

	
	
	/**
	 * Returns the block definition diagram associated to the given element, if
	 * any.
	 * 
	 * @param diagrams
	 *            the list of diagrams
	 * @param element
	 *            the owning element
	 * @return the diagram, if any
	 */
	public Diagram getBDD(Collection<Diagram> diagrams, EObject element) {
		for (Diagram diagram : diagrams) {
			if (isBDD(diagram) && diagram.getElement() == element) {
				return diagram;
			}
		}
		return null;
	}
	
	
	public boolean isBDD(Diagram diagram){
		return diagram.getType().equals(BDD);
	}
	/**
	 * Returns the state machine diagram associated to the given element, if
	 * any.
	 * 
	 * @param diagrams
	 *            the list of diagrams
	 * @param element
	 *            the owning element
	 * @return the diagram, if any
	 */
	public Diagram getSMD(Collection<Diagram> diagrams, EObject element) {
		for (Diagram diagram : diagrams) {
			if (diagram.getType().equals(STMD) && diagram.getElement() == element) {
				return diagram;
			}
		}
		return null;
	}
	
	public void openAndLayoutDiagram(ExecutionEvent event, Diagram diagram) throws Exception{
		IEditorPart editorPart = HandlerUtil.getActiveEditor(event);

		OpenElementService openService = ((IMultiDiagramEditor) editorPart).getServicesRegistry()
				.getService(OpenElementService.class);
		openService.openElement(diagram);
		Object diagramPart = null;
		final boolean zoomToFit = false;
		DiagramLayoutEngine.invokeLayout(editorPart, diagramPart, false, false, false, zoomToFit);
	}
	
	public Collection<Diagram> getDiagrams() {

		NotationModel notationModel = NotationUtils.getNotationModel();
		Set<Diagram> diagrams = getChessDiagrams(notationModel.getResources());
//		System.out.println("diagrams");
//		for (Diagram c : diagrams) {
//			System.out.println(c);
//		}
		return diagrams;

	}

	public Set<Diagram> getDiagrams(Set<Resource> resources) {

		Set<Diagram> diagrams = new HashSet<Diagram>();

		for (Resource current : resources) {
			for (EObject element : current.getContents()) {
				if (element instanceof Diagram) {
					diagrams.add((Diagram) element);
				}
			}
		}

		return diagrams;
	}

	private Set<Diagram> getChessDiagrams(Set<Resource> resources) {
		Set<Diagram> diagrams = new HashSet<Diagram>();

		for (Resource current : resources) {
			for (EObject element : current.getContents()) {
				if (element instanceof Diagram) {
					Diagram diagram = (Diagram) element;
//					System.out.println("diagram type: " + diagram.getType());

					if (isBDD(diagram) || 
							isIBD(diagram) ||
							isSMD(diagram)) {
						diagrams.add((Diagram) element);
					}
				}
			}
		}

		return diagrams;
	}
	
	
	public boolean isIBD(Diagram diagram) {
		if (diagram.getType().compareTo(IBD) == 0) {
			return true;
		}
		return false;
	}

	public boolean isSMD(Diagram diagram) {
		if (diagram.getType().compareTo(STMD) == 0) {
			return true;
		}
		return false;
	}
}
