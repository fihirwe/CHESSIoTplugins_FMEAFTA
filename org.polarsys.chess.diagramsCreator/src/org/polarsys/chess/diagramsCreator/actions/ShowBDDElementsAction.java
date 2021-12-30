/*******************************************************************************
 * Copyright (C) 2018 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *  
 * Contributors:
 *     Luca Cristoforetti - initial API and implementation
 *     Alberto Debiasi - small improvements
 ******************************************************************************/
package org.polarsys.chess.diagramsCreator.actions;

import java.util.ArrayList;
import java.util.HashSet;
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
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.core.utils.ServiceUtils;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForResource;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.ServiceUtilsForEditPart;
import org.eclipse.papyrus.infra.gmfdiag.css.CSSShapeImpl;
import org.eclipse.papyrus.sysml.diagram.blockdefinition.BlockDefinitionDiagramCreateCommand;
import org.eclipse.papyrus.sysml.diagram.common.edit.part.AssociationEditPart;
import org.eclipse.papyrus.sysml.diagram.common.edit.part.BlockEditPart;
import org.eclipse.papyrus.uml.diagram.common.actions.ShowHideContentsAction;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.polarsys.chess.contracts.profile.chesscontract.util.ContractEntityUtil;
import org.polarsys.chess.contracts.profile.chesscontract.util.EntityUtil;
import org.polarsys.chess.diagramsCreator.utils.DiagramUtils;

/**
 * This class creates a Block Definition Diagram and populates it with elements.
 * 
 * @author cristofo
 *
 */
public class ShowBDDElementsAction extends ShowHideContentsAction {
	private static final int MIN_WIDTH = 150;
	private static final int MAX_WIDTH = 1500;
	private static final int MIN_HEIGHT = 150;
	private static final int MAX_HEIGHT = 1500;

	private final EntityUtil entityUtil = EntityUtil.getInstance();
	private final ContractEntityUtil contractEntityUtil = ContractEntityUtil.getInstance();
	private final DiagramUtils diagramUtils = DiagramUtils.getInstance();
	/** Selection of all the possible elements. */
	private List<Object> selection;

	/** List of elements that should be visualized in the diagram. */
	private Set<DisplayableElement> elementsToDisplay;

	/** Logger for messages. */
	private static final Logger logger = Logger.getLogger(ShowBDDElementsAction.class);

	/** The instance of this class. */
	private static ShowBDDElementsAction classInstance;

	/** Elements that could be displayed in the diagram. */
	public enum DisplayableElement {
		PORT, OPERATION, DELEGATION_CONSTRAINT, CONTRACT_PROPERTY, PROPERTY, PARAMETER_ASSUMPTION, MACRO_DEFINITION
	}

	/**
	 * Constructor with default setting of which elements should be displayed in
	 * the diagrams.
	 */
	public ShowBDDElementsAction() {
		elementsToDisplay = new HashSet<DisplayableElement>();
		elementsToDisplay.add(DisplayableElement.PORT);
		elementsToDisplay.add(DisplayableElement.DELEGATION_CONSTRAINT);
		elementsToDisplay.add(DisplayableElement.CONTRACT_PROPERTY);
	}

	/**
	 * Gets an instance of the class if already present, or a new one if not.
	 * 
	 * @return the instance of this class
	 */
	public static ShowBDDElementsAction getInstance() {
		if (classInstance == null) {
			classInstance = new ShowBDDElementsAction();
		}
		return classInstance;
	}

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
	/*
	 * private Command showElementIn(EObject elementToShow, DiagramEditor
	 * activeEditor, EditPart editPart, int position) {
	 * 
	 * if (elementToShow instanceof Element) { DropObjectsRequest
	 * dropObjectsRequest = new DropObjectsRequest(); ArrayList<Element> list =
	 * new ArrayList<Element>(); list.add((Element) elementToShow);
	 * dropObjectsRequest.setObjects(list); dropObjectsRequest.setLocation(new
	 * Point(20, 100 * position)); Command cmd =
	 * editPart.getCommand(dropObjectsRequest);
	 * 
	 * if (cmd != null && cmd.canExecute()) { return cmd; } } return null; }
	 */

	/**
	 * Adds a BDD diagram to the given block.
	 * 
	 * @param owner
	 *            the selected block
	 * @throws Exception
	 */
	public Diagram addBDD(Package owner) throws Exception {

		// Get the services registry
		final ServicesRegistry servicesRegistry = ServiceUtilsForResource.getInstance()
				.getServiceRegistry(owner.eResource());

		// Get the modelSet
		final ModelSet modelSet = ServiceUtils.getInstance().getModelSet(servicesRegistry);

		// Create a BDD diagram for the selected owner
		final BlockDefinitionDiagramCreateCommand command = new BlockDefinitionDiagramCreateCommand();
		return command.createDiagram(modelSet, owner, owner.getName() + "_BDD");
	}

	/**
	 * Computes the ideal size for the element, depending on its features.
	 * 
	 * @param element
	 *            the Element to analyze
	 * @return an array with ideal dimensions
	 */
	private int[] getSize(Element element) {
		int width = 0;
		int height = 0;
		int maxLength = 0;
		int childrenNumber = 0;
		final int[] size = new int[2];

		// Loop on the children to find interesting elements
		EList<Element> children = element.getOwnedElements();
		for (Element child : children) {
			if (elementsToDisplay.contains(DisplayableElement.PORT)) {
				if (entityUtil.isPort(child)) {
					int textLength = 0;
					childrenNumber++;
					textLength = ((Property) child).getName().length();
					if (((Property) child).getType() != null) {
						textLength += ((Property) child).getType().getName().length();
					}
					maxLength = textLength > maxLength ? textLength : maxLength;
				}
			}
			if (elementsToDisplay.contains(DisplayableElement.CONTRACT_PROPERTY)) {
				if (contractEntityUtil.isContractProperty(child)) {
					int textLength = 0;
					childrenNumber++;
					textLength = ((Property) child).getName().length();
					if (((Property) child).getType() != null) {
						textLength += ((Property) child).getType().getName().length();
					}
					maxLength = textLength > maxLength ? textLength : maxLength;
				}
			}
			if (elementsToDisplay.contains(DisplayableElement.DELEGATION_CONSTRAINT)) {
				if (entityUtil.isDelegationConstraint(child)) {
					int textLength = 0;
					childrenNumber++;
					String constraintText = EntityUtil.getInstance().getConstraintBodyStr((Constraint) child, null);
					if (constraintText != null) {
						textLength = constraintText.length();
					}
					maxLength = textLength > maxLength ? textLength : maxLength;
				}
			}
			if (elementsToDisplay.contains(DisplayableElement.MACRO_DEFINITION)) {
				if (entityUtil.isMacroDefinition(child)) {
					int textLength = 0;
					childrenNumber++;
					String constraintText = EntityUtil.getInstance().getConstraintBodyStr((Constraint) child, null);
					if (constraintText != null) {
						textLength = constraintText.length();
					}
					maxLength = textLength > maxLength ? textLength : maxLength;
				}
			}
			if (elementsToDisplay.contains(DisplayableElement.OPERATION)) {
				if (child instanceof Operation) {
					int textLength = 0;
					childrenNumber++;
					textLength = ((Operation) child).getName().length();
					maxLength = textLength > maxLength ? textLength : maxLength;
				}
			}
			if (elementsToDisplay.contains(DisplayableElement.PARAMETER_ASSUMPTION)) {
				if (entityUtil.isParameterAssumptions(child)) {
					int textLength = 0;
					childrenNumber++;
					String constraintText = EntityUtil.getInstance().getConstraintBodyStr((Constraint) child, null);
					if (constraintText != null) {
						textLength = constraintText.length();
					}
					maxLength = textLength > maxLength ? textLength : maxLength;
				}
			}
			if (elementsToDisplay.contains(DisplayableElement.PROPERTY)) {
				if ((child instanceof Property) && !entityUtil.isPort(child)
						&& !contractEntityUtil.isContractProperty(child)) {
					int textLength = 0;
					childrenNumber++;
					textLength = ((Property) child).getName().length();
					if (((Property) child).getType() != null) {
						textLength += ((Property) child).getType().getName().length();
					}
					maxLength = textLength > maxLength ? textLength : maxLength;
				}
			}
		}

		// Empirical values
		width = (int) Math.round(140 + (5.4 * maxLength));
		height = 132 + (16 * childrenNumber);

		// logger.debug("Element width = " + width);
		// logger.debug("Element height = " + height);

		if (width < MIN_WIDTH) {
			size[0] = MIN_WIDTH;
		} else if (width > MAX_WIDTH) {
			size[0] = MAX_WIDTH;
		} else {
			size[0] = width;
		}

		if (height < MIN_HEIGHT) {
			size[1] = MIN_HEIGHT;
		} else if (height > MAX_HEIGHT) {
			size[1] = MAX_HEIGHT;
		} else {
			size[1] = height;
		}

		return size;
	}

	/**
	 * Resizes the component blocks.
	 * 
	 * @param diagramEP
	 *            the diagram EditPart
	 * @param displayedBlocks
	 *            a list of already displayed blocks, to avoid resizing
	 */
	private void resizeElements(IGraphicalEditPart diagramEP, EList<Class> displayedBlocks) {

		// Get all the views of the diagram and loop on them
		List<?> childrenView = diagramEP.getNotationView().getChildren();

		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(diagramEP.getNotationView());
		domain.getCommandStack().execute(new RecordingCommand(domain) {

			@Override
			protected void doExecute() {

				for (Object child : childrenView) {
					View childView = (View) child;
					final Element semanticElement = (Element) childView.getElement();

					if (entityUtil.isBlock(semanticElement) && !contractEntityUtil.isContract(semanticElement)
							&& !displayedBlocks.contains(semanticElement)) {

						// Enlarge the component but don't position it, arrange
						// will do it later
						if (childView instanceof CSSShapeImpl) {
							final CSSShapeImpl viewShape = (CSSShapeImpl) childView;
							final Bounds layout = (Bounds) viewShape.getLayoutConstraint();

							final int[] size = getSize(semanticElement);
							layout.setWidth(size[0]);
							layout.setHeight(size[1]);
						}
					}
				}
			}
		});
	}

	/**
	 * Completes the list of selection for the given representation and its
	 * potential children.
	 * 
	 * @param listToComplete
	 *            the list of selected elements to complete
	 * @param representation
	 *            the edit part representation that completes the list
	 */
	private void contributeToSelection(List<Object> listToComplete, EditPartRepresentation representation) {

		// logger.debug("\n\nrepresentation = " + representation);
		// logger.debug("\tlistToComplete.size = " + listToComplete.size());

		listToComplete.addAll(representation.getPossibleElement());

		// logger.debug("\tlistToComplete.size = " + listToComplete.size());

		final List<EditPartRepresentation> children = representation.getPossibleElement();

		// logger.debug("\tChildren di representation size = " +
		// children.size());

		if (children != null) {
			for (EditPartRepresentation child : children) {
				// logger.debug("Working on child " + child);
				contributeToSelection(listToComplete, child);
			}
		}
	}

	/**
	 * Builds the selection with all the possible elements.
	 */
	private void buildSelection() {
		selection = new ArrayList<Object>();
		for (EditPartRepresentation current : representations) {
			contributeToSelection(selection, current);
		}
	}

	/**
	 * Builds a list of elements I'm interested to display.
	 * 
	 * @param results
	 *            the list of all the possible EditPartRepresentation elements
	 */
	// @Override
	protected void buildShowHideElementsList(Object[] results) {

		viewsToCreate = new ArrayList<EditPartRepresentation>();
		viewsToDestroy = new ArrayList<EditPartRepresentation>();

		final List<Object> result = new ArrayList<>();
		for (int i = 0; i < results.length; i++) {
			final EditPartRepresentation editPartRepresentation = (EditPartRepresentation) results[i];

			// logger.debug("\n\n\nWorking on results[" + i + "] = " +
			// editPartRepresentation);

			final Element semanticElement = (Element) editPartRepresentation.getSemanticElement();

			// logger.debug("Semantic Element = " + semanticElement);
			// logger.debug("Label = " + editPartRepresentation.getLabel());
			// logger.debug("Parent = " +
			// editPartRepresentation.getParentRepresentation());

			// Check if the element should be displayed
			for (DisplayableElement elementToDisplay : elementsToDisplay) {
				if (elementToDisplay == DisplayableElement.PORT) {
					if (entityUtil.isPort(semanticElement) && !(editPartRepresentation
							.getParentRepresentation() instanceof AffixedChildrenEditPartRepresentation)) {
						result.add(editPartRepresentation);
					}
				} else if (elementToDisplay == DisplayableElement.CONTRACT_PROPERTY) {
					if (contractEntityUtil.isContractProperty(semanticElement)) {
						result.add(editPartRepresentation);
					}
				} else if (elementToDisplay == DisplayableElement.DELEGATION_CONSTRAINT) {
					if (entityUtil.isDelegationConstraint(semanticElement)) {
						result.add(editPartRepresentation);
					}
				} else if (elementToDisplay == DisplayableElement.OPERATION) {
					if (semanticElement instanceof Operation) {
						result.add(editPartRepresentation);
					}
				} else if (elementToDisplay == DisplayableElement.MACRO_DEFINITION) {
					if (entityUtil.isMacroDefinition(semanticElement)) {
						result.add(editPartRepresentation);
					}
				} else if (elementToDisplay == DisplayableElement.PARAMETER_ASSUMPTION) {
					if (entityUtil.isParameterAssumptions(semanticElement)) {
						result.add(editPartRepresentation);
					}
				} else if (elementToDisplay == DisplayableElement.PROPERTY) {
					if ((semanticElement instanceof Property) && !entityUtil.isPort(semanticElement)
							&& !contractEntityUtil.isContractProperty(semanticElement)) {
						result.add(editPartRepresentation);
					}
				}
			}
		}

		// Add the result to the views to create, but only if not already
		// displayed
		for (Object element : result) {
			if (initialSelection.contains(element)) {

				// we do nothing
				continue;
			} else if (element instanceof EditPartRepresentation) {
				viewsToCreate.add((EditPartRepresentation) element);
			}
		}
	}

	/**
	 * Gets the editing domain.
	 *
	 * @return the editing domain the editing domain to use
	 */
	protected final TransactionalEditingDomain getEditingDomain(EditPart host) {
		try {
			return ServiceUtilsForEditPart.getInstance().getTransactionalEditingDomain(host);
		} catch (ServiceException e) {
		}
		return null;
	}

	/**
	 * Fills the diagram with graphical components in the list.
	 * 
	 * @param diagram
	 * @param elementsByRef
	 *            list of elements that should be displayed
	 */
	public void populateDiagramByReference(Diagram diagram, EList<Element> elementsByRef) {
		populateDiagram(diagram, elementsByRef, true);
	}

	/**
	 * Fills the diagram with graphical components.
	 * 
	 * @param diagram
	 */
	public void populateDiagram(Diagram diagram) {
		populateDiagram(diagram, null, false);
	}

	private void populateDiagram(Diagram diagram, EList<Element> elements, boolean useElements) {
		final Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

		// Get the EditPart associated to the diagram
		final IGraphicalEditPart diagramEP = OffscreenEditPartFactory.getInstance().createDiagramEditPart(diagram,
				shell);
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(diagram);
		// Get the EditorPart and the active editor
		IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		IEditorPart activeEditor = ((PapyrusMultiDiagramEditor) editorPart).getActiveEditor();
		logger.debug("activeEditor = " + activeEditor);

		Package pkg = (Package) diagramEP.resolveSemanticElement();
		EList<Element> packageChildren = pkg.getOwnedElements();

		// if is wanted to use blocks from different packages overwrite the
		// local elements
		if (useElements) {
			packageChildren = elements;
		}

		List<EditPart> childrenList = diagramUtils.findAllChildren(diagramEP);

		// CompoundCommand completeCmd = new CompoundCommand("Show Elements
		// Command");

		ArrayList<EObject> blocksToDisplay = new ArrayList<EObject>();

		// First loop to draw Block elements and contracts
		for (Element element : packageChildren) {
			if (entityUtil.isBlock(element) || element instanceof Package) {
				logger.debug("calling showElementIn for element = " + element);
				blocksToDisplay.add(element);
				// Command cmd = showElementIn(element, (DiagramEditor)
				// activeEditor, diagramEP, 1);
				// completeCmd.add(cmd);
			}
		}

		if (!blocksToDisplay.isEmpty()) {
			Command showBlocksCmd = diagramUtils.showElementsIn(blocksToDisplay, (DiagramEditor) activeEditor,
					diagramEP, childrenList, new Point(100, 100));
			// completeCmd.add(showBlocksCmd);
			// Execute the commands

			domain.getCommandStack().execute(new GEFtoEMFCommandWrapper(showBlocksCmd));
		}
		// Resize the graphical elements, passing a void list of blocks to avoid
		resizeElements(diagramEP, new BasicEList<Class>());

		// Select all the blocks avoiding contracts and add them to the list to
		// be enriched
		selectedElements = new ArrayList<IGraphicalEditPart>();
		List<?> editPartChildren = diagramEP.getChildren();
		for (Object editPartChild : editPartChildren) {
			Element element = (Element) ((IGraphicalEditPart) editPartChild).resolveSemanticElement();
			if (entityUtil.isBlock(element) && !contractEntityUtil.isContract(element)) {
				selectedElements.add((IGraphicalEditPart) editPartChild);
			}
		}

		// Call superclass methods to setup the action
		initAction();
		buildInitialSelection();

		// Get a selection with all the possible elements
		buildSelection();

		// Draw the inner attributes
		if (selection.size() > 0) {

			// Filter the list to extract only the elements I'm interested in
			buildShowHideElementsList(selection.toArray());

			// Create the list of commands to display the elements
			final Command command = getActionCommand();

			// Execute the commands
			domain.getCommandStack().execute(new GEFtoEMFCommandWrapper(command));
		}

		// Create a new command, dispose doesn't work...
		// completeCmd.dispose();
		// completeCmd = new CompoundCommand("Show Elements Command");

		ArrayList<EObject> associationsToDisplay = new ArrayList<EObject>();
		// Second loop to draw Associations
		for (Element element : packageChildren) {
			if (element instanceof Association || element instanceof Dependency) {
				logger.debug("calling showElementIn for Association = " + element);
				associationsToDisplay.add(element);
				/*
				 * final Command cmd = showElementIn(element, (DiagramEditor)
				 * activeEditor, diagramEP, 1); if (cmd != null &&
				 * cmd.canExecute()) { completeCmd.add(cmd); }
				 */
			}
		}

		if (!associationsToDisplay.isEmpty()) {
			Command showAssociationsCmd = diagramUtils.showElementsIn(associationsToDisplay,
					(DiagramEditor) activeEditor, diagramEP, childrenList, new Point(100, 100));
			// completeCmd.add(showAssociationsCmd);

			// Execute the commands
			domain.getCommandStack().execute(new GEFtoEMFCommandWrapper(showAssociationsCmd));
		}
	}

	/**
	 * Displays missing elements in the given diagram.
	 * 
	 * @param diagramEditPart
	 *            the diagram editpart
	 */
	public boolean refreshDiagram(IGraphicalEditPart diagramEditPart) {
		boolean isDiagramChanged = false; // Indicates whether the diagram has
											// been modified

		// Get the EditorPart and the active editor
		final IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getActiveEditor();
		final IEditorPart activeEditor = ((PapyrusMultiDiagramEditor) editorPart).getActiveEditor();

		// Get all the EditParts of the diagram
		final Map<?, ?> elements = diagramEditPart.getViewer().getEditPartRegistry();
		final Object[] editParts = elements.values().toArray();

		final EList<Class> displayedBlocks = new BasicEList<Class>();
		final EList<Association> displayedAssociations = new BasicEList<Association>();

		// Loop on all the editparts to collect the displayed elements
		for (int i = 0; i < editParts.length; i++) {
			if (editParts[i] instanceof BlockEditPart) {
				displayedBlocks.add((Class) ((BlockEditPart) editParts[i]).resolveSemanticElement());
			} else if (editParts[i] instanceof AssociationEditPart) {
				displayedAssociations.add((Association) ((AssociationEditPart) editParts[i]).resolveSemanticElement());
			}
		}

		// Get the package containing the model
		final EObject semanticElement = diagramEditPart.resolveSemanticElement();
		Package pkg = null;
		if (semanticElement instanceof Package) {
			pkg = (Package) semanticElement;
		} else {
			if (displayedBlocks.size() == 0) {
				return isDiagramChanged;
			} else {
				pkg = displayedBlocks.get(0).getNearestPackage();
			}
		}

		List<EditPart> childrenList = diagramUtils.findAllChildren(diagramEditPart);

		// All the existing elements in the package
		final EList<Element> existingElements = pkg.getOwnedElements();

		// All the blocks and associations that are not displayed
		final EList<Element> missingBlocks = new BasicEList<Element>();
		final EList<Element> missingAssociations = new BasicEList<Element>();

		// Loop on the elements to find those not displayed
		for (Element element : existingElements) {
			if (entityUtil.isBlock(element) && !contractEntityUtil.isContract(element)) {
				if (displayedBlocks.contains(element)) {
					logger.debug("block already present in diagram");
				} else {
					logger.debug("block is not present in diagram");
					missingBlocks.add(element);
				}
			} else if (element instanceof Association || element instanceof Dependency) {
				if (displayedAssociations.contains(element)) {
					logger.debug("association already present in diagram");
				} else {
					logger.debug("association is not present in diagram");
					missingAssociations.add(element);
				}
			}
		}

		ArrayList<EObject> blocksToDisplay = new ArrayList<EObject>();
		// Create a compound command to display missing blocks
		// CompoundCommand completeCmd = new CompoundCommand("Show Blocks
		// Command");
		// int index = 0;
		for (Element element : missingBlocks) {
			logger.debug("block missing in the diagram = " + element);
			blocksToDisplay.add(element);
		}

		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(editorPart);
		if (!blocksToDisplay.isEmpty()) {
			Command showBlocksCmd = diagramUtils.showElementsIn(blocksToDisplay, (DiagramEditor) activeEditor,
					diagramEditPart, childrenList, new Point(100, 100));
			// completeCmd.add(showBlocksCmd);
			domain.getCommandStack().execute(new GEFtoEMFCommandWrapper(showBlocksCmd));
		}

		// Execute the commands to display blocks
		/*
		 * if (completeCmd.size() > 0) { isDiagramChanged = true;
		 * completeCmd.execute(); }
		 */

		// Resize the blocks, only if not already displayed
		resizeElements(diagramEditPart, displayedBlocks);

		// Select all the blocks avoiding contracts and add them to the list to
		// be enriched
		selectedElements = new ArrayList<IGraphicalEditPart>();
		List<?> editPartChildren = diagramEditPart.getChildren();
		for (Object editPartChild : editPartChildren) {
			Element element = (Element) ((IGraphicalEditPart) editPartChild).resolveSemanticElement();
			if (entityUtil.isBlock(element) && !contractEntityUtil.isContract(element)) {
				selectedElements.add((IGraphicalEditPart) editPartChild);
			}
		}

		// Call superclass methods to setup the action
		initAction();
		buildInitialSelection();

		// Get a selection with all the possible elements
		buildSelection();

		// Draw the inner attributes
		if (selection.size() > 0) {

			// Filter the list to extract only the elements I'm interested in
			buildShowHideElementsList(selection.toArray());

			// Create the list of commands to display the elements
			final CompoundCommand command = (CompoundCommand) getActionCommand();

			// Execute the commands
			if (command.size() > 0) {
				isDiagramChanged = true;
				final TransactionalEditingDomain notationDomain = TransactionUtil
						.getEditingDomain(diagramEditPart.getNotationView());
				notationDomain.getCommandStack().execute(new GEFtoEMFCommandWrapper(command));
			}
		}

		ArrayList<EObject> associationsToDisplay = new ArrayList<EObject>();
		// Create a compound command to display missing associations
		// completeCmd = new CompoundCommand("Show Associations Command");
		for (Element element : missingAssociations) {
			logger.debug("association missing in the diagram = " + element);
			associationsToDisplay.add(element);
		}

		if (!associationsToDisplay.isEmpty()) {
			Command showAssociationsCmd = diagramUtils.showElementsIn(associationsToDisplay,
					(DiagramEditor) activeEditor, diagramEditPart, childrenList, new Point(100, 100));
			// final TransactionalEditingDomain domain =
			// TransactionUtil.getEditingDomain(diagramEditPart);
			domain.getCommandStack().execute(new GEFtoEMFCommandWrapper(showAssociationsCmd));
			// completeCmd.add(showAssociationsCmd);
		}
		// Execute the commands to display associations
		/*
		 * if (completeCmd.size() > 0) { isDiagramChanged = true;
		 * completeCmd.execute(); }
		 */
		return isDiagramChanged;
	}

	/**
	 * Displays missing elements in the given diagram.
	 * 
	 * @param diagram
	 *            the diagram
	 */
	public void refreshDiagram(Diagram diagram) {
		final Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		final IGraphicalEditPart diagramEditPart = OffscreenEditPartFactory.getInstance().createDiagramEditPart(diagram,
				shell);

		refreshDiagram(diagramEditPart);
	}

	/**
	 * Sets the elements that should be visualized.
	 * 
	 * @param elements
	 *            the elements to display
	 */
	public void setDisplayableElement(Set<DisplayableElement> elements) {
		elementsToDisplay = elements;
	}
}
