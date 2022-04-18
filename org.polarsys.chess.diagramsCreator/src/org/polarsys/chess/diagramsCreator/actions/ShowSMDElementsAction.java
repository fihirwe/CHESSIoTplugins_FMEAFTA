/*******************************************************************************
 * Copyright (C) 2018 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *  
 * Contributors:
 *     Luca Cristoforetti - initial API and implementation
 ******************************************************************************/
package org.polarsys.chess.diagramsCreator.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.diagram.ui.OffscreenEditPartFactory;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.commands.wrappers.GEFtoEMFCommandWrapper;
import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.papyrus.infra.gmfdiag.css.CSSShapeImpl;
import org.eclipse.papyrus.infra.viewpoints.configuration.PapyrusDiagram;
import org.eclipse.papyrus.infra.viewpoints.policy.PolicyChecker;
import org.eclipse.papyrus.infra.viewpoints.policy.ViewPrototype;
import org.eclipse.papyrus.uml.diagram.statemachine.custom.edit.part.CustomStateEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.custom.edit.part.CustomTransitionEditPart;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.FinalState;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Vertex;
import org.polarsys.chess.contracts.profile.chesscontract.util.EntityUtil;
//import org.polarsys.chess.diagram.ui.docGenerators.CHESSBlockDefinitionDiagramModel;
//import org.polarsys.chess.diagram.ui.docGenerators.CHESSInternalBlockDiagramModel;
//import org.polarsys.chess.diagram.ui.services.CHESSDiagramsGeneratorService;
import org.polarsys.chess.diagramsCreator.utils.DiagramUtils;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

/**
 * This class creates an State Machine Diagram and populates it with elements.
 * 
 * @author cristofo
 *
 */
public class ShowSMDElementsAction {
	private static String SMD_LABEL = "StateMachine Diagram";
	private static final int MIN_WIDTH = 100;
	private static final int MAX_WIDTH = 250;
	private static final int HEIGHT = 50;

	private final EntityUtil entityUtil = EntityUtil.getInstance();
	private final DiagramUtils diagramUtils = DiagramUtils.getInstance();
	/** Logger for messages */
	private static final Logger logger = Logger.getLogger(ShowSMDElementsAction.class);

	/** The instance of this class */
	private static ShowSMDElementsAction classInstance;

	/**
	 * Gets an instance of the class if already present, or a new one if not.
	 * 
	 * @return the instance of this class
	 */
	public static ShowSMDElementsAction getInstance() {
		if (classInstance == null) {
			classInstance = new ShowSMDElementsAction();
		}
		return classInstance;
	}

	/**
	 * Returns the list of diagrams in the model.
	 * 
	 * @return the list of diagrams
	 */
	private Set<Diagram> getDiagramsList() {
	//	final CHESSDiagramsGeneratorService chessDiagramsGeneratorService = CHESSDiagramsGeneratorService.getInstance(
	//			CHESSInternalBlockDiagramModel.getInstance(), CHESSBlockDefinitionDiagramModel.getInstance());
		final Set<Diagram> chessDiagrams = (Set<Diagram>) DiagramUtils.getInstance().getDiagrams();
		return chessDiagrams;
	}

	/**
	 * Returns the diagram that is new in the postList.
	 * 
	 * @param preList
	 *            the initial list of diagrams
	 * @param postList
	 *            the updated list of diagrams
	 * @return the newly created diagram
	 */
	private Diagram getNewDiagram(Set<Diagram> preList, Set<Diagram> postList) {
		postList.removeAll(preList);
		if (postList.size() == 1) {
			return postList.iterator().next();
		}
		return null;
	}

	/**
	 * Adds a SM diagram to the given block.
	 * 
	 * @param owner
	 *            the selected state machine
	 */
	public Diagram addSMD(Class owner) {

		// Build a list of all the available prototypes
		List<ViewPrototype> data = new ArrayList<ViewPrototype>();
		for (final ViewPrototype proto : PolicyChecker.getCurrent().getPrototypesFor(owner)) {
			if (!(proto.getConfiguration() instanceof PapyrusDiagram)) {
				continue;
			}
			data.add(proto);
		}

		// Loop on the prototypes to find the State Machine Diagram
		ViewPrototype smdViewPrototype = null;
		for (ViewPrototype viewPrototype : data) {
			if (viewPrototype.getLabel().equals(SMD_LABEL)) {
				smdViewPrototype = viewPrototype;
				break;
			}
		}

		// Get the list of diagrams before creating the new one
		final Set<Diagram> preList = getDiagramsList();

		// Instantiate the diagram
		smdViewPrototype.instantiateOn(owner, ((Class) owner.getOwner()).getName() + "_SMD");

		// Get the new list of diagrams
		final Set<Diagram> postList = getDiagramsList();

		// Retrieve the last created diagram
		final Diagram diag = getNewDiagram(preList, postList);

		// // This should work...
		// CreationCommandDescriptor creationCommandDescriptor =
		// getCreation("org.eclipse.papyrus.uml.diagram.statemachine.CreationCommand",
		// data);
		// diag = creationCommandDescriptor.getCommand().createDiagram(modelSet,
		// owner, "myDiag");
		// System.out.println("diag2 = " + diag);
		//
		// // This should work too...
		// final CreateStateMachineDiagramCommand command = new
		// CreateStateMachineDiagramCommand();
		// diag = command.createDiagram(modelSet, owner, owner.getName() +
		// "_SMD2");
		// System.out.println("diag3 = " + diag);

		return diag;
	}

	/**
	 * Computes the ideal size for the element, depending on its features.
	 * 
	 * @param element
	 *            the Element to analyze
	 * @return an array with ideal dimensions
	 */
	private int[] getSize(State state) {
		int width = 0;
		int maxLength = 0;
		final int[] size = new int[2];

		maxLength = state.getName().length();

		// Empirical values
		// width = (int) Math.round(140 + (5.4 * maxLength));
		width = (int) Math.round((10 * maxLength));

		// logger.debug("Element width = " + width);

		if (width < MIN_WIDTH) {
			size[0] = MIN_WIDTH;
		} else if (width > MAX_WIDTH) {
			size[0] = MAX_WIDTH;
		} else {
			size[0] = width;
		}
		size[1] = HEIGHT;
		
		return size;
	}

	/**
	 * Resizes the states.
	 * 
	 * @param diagramEP
	 *            the diagram EditPart
	 * @param displayedStates
	 *            the states already displayed
	 */
	private void resizeStates(IGraphicalEditPart diagramEP, EList<State> displayedStates,TransactionalEditingDomain domain) {

		// Get all the edit parts of the diagram and loop on them
		final List<EditPart> childrenEPs = diagramUtils.findAllChildren(diagramEP);

		//final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(diagramEP.getNotationView());
		domain.getCommandStack().execute(new RecordingCommand(domain) {

			@Override
			protected void doExecute() {
				for (EditPart childEP : childrenEPs) {
					if (childEP instanceof IGraphicalEditPart) {
						View childView = ((IGraphicalEditPart) childEP).getNotationView();
						final Element semanticElement = (Element) childView.getElement();

						if (semanticElement instanceof State && !displayedStates.contains(semanticElement)) {

							// Enlarge the component but don't position it,
							// arrange will do it later
							if (childView instanceof CSSShapeImpl) {
								//logger.debug("resizeState");
								final CSSShapeImpl viewShape = (CSSShapeImpl) childView;
								final Bounds layout = (Bounds) viewShape.getLayoutConstraint();

								final int[] size = getSize((State) semanticElement);
								layout.setWidth(size[0]);
								layout.setHeight(size[1]);
							}
						}
					}
				}
			}
		});
	}

	/**
	 * Tries to create some components in the model. JUST FOR TESTING PURPOSES
	 * 
	 * @param diagram
	 */
	public void addComponents(Diagram diagram) {
		EObject element = diagram.getElement();

		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(diagram);
		domain.getCommandStack().execute(new RecordingCommand(domain) {

			@Override
			protected void doExecute() {
				if (element instanceof StateMachine) {
					StateMachine stateMachine = (StateMachine) element;

					// Get the first region from the StateMachine
					EList<Region> regions = stateMachine.getRegions();
					Region region = regions.get(0);

					// Create a new transition
					final Transition transition = region.createTransition(null);

					// Create the guard
					final String formalPropertyText = "MyGuardBody";
					final String language = "cleanC";
					entityUtil.createTransitionGuard(transition, null, formalPropertyText, language);

					// Create the effect
					final String effectText = "MyEffectBody;";
					entityUtil.createTransitionEffect(transition, null, effectText, language);

					// Create the vertices for the transition
					final Vertex source = region.createSubvertex("myOriginState",
							UMLPackage.eINSTANCE.getPseudostate());
					final Vertex target = region.createSubvertex("myTargetState", UMLPackage.eINSTANCE.getState());

					// Set vertices on the transition
					transition.setSource(source);
					transition.setTarget(target);
				}
			}
		});
	}

	/**
	 * Fills the diagram with graphical components.
	 * 
	 * @param diagram
	 */
	public void populateDiagram(Diagram diagram) {

		final Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

		// The EditPart associated to the diagram
		final IGraphicalEditPart diagramEP = OffscreenEditPartFactory.getInstance().createDiagramEditPart(diagram,
				shell);

		// Get the EditorPart and the active editor
		final IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getActiveEditor();
		final IEditorPart activeEditor = ((PapyrusMultiDiagramEditor) editorPart).getActiveEditor();
		logger.debug("activeEditor = " + activeEditor);

		// Get the main EditPart
		final IGraphicalEditPart selectedElementEP = (IGraphicalEditPart) diagramEP.getChildren().get(0);
		logger.debug("\n\nselectedElement EditPart = " + selectedElementEP + "\n\n");

		// Get the state machine and its elements
		final StateMachine stateMachine = (StateMachine) selectedElementEP.resolveSemanticElement();
		EList<Element> stateMachineElements = stateMachine.allOwnedElements();

		List<EditPart> childrenList = diagramUtils.findAllChildren(diagramEP);
		ArrayList<EObject> statesToDisplay = new ArrayList<EObject>();
		ArrayList<EObject> transitionsToDisplay = new ArrayList<EObject>();
		// First loop to draw states
		// CompoundCommand completeCmd = new CompoundCommand("Show Elements
		// Command");
		// int index = 0;
		for (Element element : stateMachineElements) {
			if (element instanceof State || element instanceof Pseudostate || element instanceof FinalState) {
				//logger.debug("calling showElementIn for state = " + element);
				// Command cmd = showElementIn(element, (DiagramEditor)
				// activeEditor, diagramEP, ++index,childrenList);
				// completeCmd.add(cmd);
				statesToDisplay.add(element);
			} else if (element instanceof Transition) {
				transitionsToDisplay.add(element);
			}
		}

		Command showStatesCmd = diagramUtils.showElementsIn(statesToDisplay, (DiagramEditor) activeEditor, diagramEP, childrenList,
				new Point(100, 100));
		// completeCmd.add(showStatesCmd);

		// Execute the commands
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(diagram);
		domain.getCommandStack().execute(new GEFtoEMFCommandWrapper(showStatesCmd));
		//diagramEP.getDiagramEditDomain().getDiagramCommandStack().execute(showStatesCmd);
		// Resize the states, passing an empty list of states to avoid
		resizeStates(diagramEP, new BasicEList<State>(),domain);
		Command showTransitionsCmd = diagramUtils.showElementsIn(transitionsToDisplay, (DiagramEditor) activeEditor, diagramEP,
				childrenList, new Point(200, 200));
		domain.getCommandStack().execute(new GEFtoEMFCommandWrapper(showTransitionsCmd));

		//resizeStates(diagramEP, new BasicEList<State>(),domain);
		//diagramEP.getDiagramEditDomain().getDiagramCommandStack()
		//.execute(showTransitionsCmd);
	}

	/*private void test(Diagram diagram, ArrayList<EObject> elementsToDisplay, IGraphicalEditPart diagramEP) {
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(diagram);
		DiagramDragDropEditPolicy dragCommand = new DiagramDragDropEditPolicy();
		DropObjectsRequest dropRequest = new DropObjectsRequest();
		ArrayList<Element> list = new ArrayList<Element>();
		list.add((Element) elementsToDisplay.get(0));
		dropRequest.setObjects(list);
		dropRequest.setLocation(new Point(100, 100));
		dragCommand.setHost(diagramEP);
		Command drCmd = dragCommand.getDropObjectsCommand(dropRequest);
		domain.getCommandStack().execute(new GEFtoEMFCommandWrapper(drCmd));
	}*/

	/**
	 * Refreshes the given diagram, adding components present in the model but
	 * not yet visualized.
	 * 
	 * @param diagram
	 *            the diagram to refresh
	 */
	public void refreshDiagram(Diagram diagram) {
		logger.debug("refreshDiagram " + diagram.getName());

		final Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		final IGraphicalEditPart diagramEditPart = OffscreenEditPartFactory.getInstance().createDiagramEditPart(diagram,
				shell);

		// Get the EditorPart and the active editor
		final IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getActiveEditor();
		final IEditorPart activeEditor = ((PapyrusMultiDiagramEditor) editorPart).getActiveEditor();

		// Get all the EditParts of the diagram
		final Map<?, ?> elements = diagramEditPart.getViewer().getEditPartRegistry();
		final Object[] editParts = elements.values().toArray();

		final EList<State> displayedStates = new BasicEList<State>();
		final EList<Transition> displayedTransitions = new BasicEList<Transition>();

		// EList<EObject> elementsToDisplay = new BasicEList<EObject>();

		// Loop on all the editparts to collect the displayed elements
		for (int i = 0; i < editParts.length; i++) {
			if (editParts[i] instanceof CustomStateEditPart) {
				displayedStates.add((State) ((CustomStateEditPart) editParts[i]).resolveSemanticElement());
			} else if (editParts[i] instanceof CustomTransitionEditPart) {
				displayedTransitions
						.add((Transition) ((CustomTransitionEditPart) editParts[i]).resolveSemanticElement());
			}
		}

		// Get the main EditPart
		final IGraphicalEditPart selectedElementEP = (IGraphicalEditPart) diagramEditPart.getChildren().get(0);
		logger.debug("\n\nselectedElement EditPart = " + selectedElementEP + "\n\n");

		// Get the state machine and its elements
		final StateMachine stateMachine = (StateMachine) selectedElementEP.resolveSemanticElement();
		EList<Element> stateMachineElements = stateMachine.allOwnedElements();

		// All the blocks and associations that are not displayed
		final EList<Element> missingStates = new BasicEList<Element>();
		final EList<Element> missingTransitions = new BasicEList<Element>();

		// Loop on the elements to find those not displayed
		for (Element element : stateMachineElements) {
			if (element instanceof State) {
				if (displayedStates.contains(element)) {
					logger.debug("state already present in diagram: " + element);
				} else {
					logger.debug("state is not present in diagram: " + element);
					missingStates.add(element);
				}
			} else if (element instanceof Transition) {
				if (displayedTransitions.contains(element)) {
					logger.debug("transition already present in diagram: " + element);
				} else {
					logger.debug("transition is not present in diagram:  " + element);
					missingTransitions.add(element);
				}
			}
		}

		List<EditPart> childrenList = diagramUtils.findAllChildren(diagramEditPart);

		// First loop to draw states
		CompoundCommand completeCmd = new CompoundCommand("Show Elements Command");
		int index = 0;
		for (Element element : missingStates) {
			logger.debug("calling showElementIn for element = " + element);

			Command cmd = diagramUtils.showElementIn(element, (DiagramEditor) activeEditor, diagramEditPart, ++index, childrenList);
			// elementsToDisplay.add(element);
			completeCmd.add(cmd);
		}

		// Execute the commands
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(diagram);
		domain.getCommandStack().execute(new GEFtoEMFCommandWrapper(completeCmd));

		// Resize the states
		resizeStates(diagramEditPart, displayedStates,domain);

		// Second loop to draw other elements
		completeCmd = new CompoundCommand("Show Transitions Command");
		for (Element element : missingTransitions) {
			logger.debug("calling showElementIn for element = " + element);
			Command cmd = diagramUtils.showElementIn(element, (DiagramEditor) activeEditor, diagramEditPart, 1, childrenList);
			// elementsToDisplay.add(element);
			completeCmd.add(cmd);
		}

		/*
		 * Command cmd = showElementsIn(elementsToDisplay, (DiagramEditor)
		 * activeEditor, diagramEditPart); logger.debug("cmd: "+cmd);
		 * CompoundCommand completeCmd = new
		 * CompoundCommand("Show Elements Command"); completeCmd.add(cmd);
		 */
		// Execute the commands
		domain.getCommandStack().execute(new GEFtoEMFCommandWrapper(completeCmd));

		// Resize the states, passing an empty list of states to avoid
		// resizeStates(diagramEditPart, new BasicEList<State>());
	}

	// The following code has been inspired by
	// org.eclipse.papyrus.diagramtemplate.launcher.DiagramTemplateLauncher
	
	
}
