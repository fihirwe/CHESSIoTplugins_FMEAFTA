/*******************************************************************************
 * Copyright (C) 2018 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *  
 * Contributors:
 *     Luca Cristoforetti - initial API and implementation
 *     Alberto Debiasi - some updates
 ******************************************************************************/
package org.polarsys.chess.OSSImporter.commands;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.diagram.ui.OffscreenEditPartFactory;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.polarsys.chess.OSSImporter.core.actions.ImportOSSFileAction;
import org.polarsys.chess.contracts.profile.chesscontract.util.EntityUtil;
import org.polarsys.chess.diagram.ui.docGenerators.CHESSBlockDefinitionDiagramModel;
import org.polarsys.chess.diagram.ui.docGenerators.CHESSInternalBlockDiagramModel;
import org.polarsys.chess.diagram.ui.services.CHESSDiagramsGeneratorService;
import org.polarsys.chess.diagramsCreator.actions.ShowBDDElementsAction;
import org.polarsys.chess.diagramsCreator.actions.ShowIBDElementsAction;
import org.polarsys.chess.service.gui.utils.SelectionUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Class;
import eu.fbk.eclipse.standardtools.utils.ui.commands.AbstractJobCommand;
import eu.fbk.eclipse.standardtools.utils.ui.utils.DialogUtil;
import eu.fbk.eclipse.standardtools.xtextService.ui.services.RuntimeErrorService;

/**
 * Class that starts the parsing of a file in OCRA format. It is triggered by
 * the contextual menu item on an entire package.
 * 
 * @author cristofo
 *
 */
public class ImportOSSFileCommand extends AbstractJobCommand implements IHandler {
	private static String pluginID = "org.polarsys.chess.OSSImporter";

	private static final Logger logger = Logger.getLogger(ImportOSSFileCommand.class);

	private static final String DIALOG_TITLE = "OSS parser";
	private static final String IBD = "InternalBlock";
	private static final String BDD = "BlockDefinition";

	final DialogUtil dialogUtil = DialogUtil.getInstance();

	/**
	 * Constructor.
	 */
	public ImportOSSFileCommand() {
		super("Add content from OSS file");
	}

	/**
	 * Shows a message with a report of the import action.
	 * @param message the message to display
	 * @param addedElements the  list of added elements
	 * @param removedElements the list of removed elements
	 */
	private void showImportMessage(List<String> addedElements, List<String> removedElements) {
		final Display defaultDisplay = Display.getDefault();
		final List<String> items = new ArrayList<String>(addedElements.size() + removedElements.size());
		
		String message = "Import done!";
		if (addedElements.size() > 0 || removedElements.size() > 0) {
			final String messageAdded = "Added/modified " + addedElements.size() + " elements";
			final String messageRemoved = "Removed " + removedElements.size() + " elements";
			message += "\n\n\t" + messageAdded + "\n\t" + messageRemoved;
		} else {
			message += "\n\n\tNo changes from the previous model were found.";
		}

		final String inportOutcome = message;
		
		for (String added : addedElements) {
			items.add("ADDED " + added);
		}
		for (String removed : removedElements) {
			items.add("REMOVED " + removed);
		}
		
		if (items != null && items.size() > 0) {
			final MultiStatus info = 
					new MultiStatus(pluginID, 1, "Click on \"Details\" to see the list of changes.", null);
			for (String item : items) {
				info.add(new Status(IStatus.INFO, pluginID, 1, item, null));
			}

			defaultDisplay.syncExec(new Runnable() {
				@Override
				public void run() {
					final Shell currShell = defaultDisplay.getActiveShell();
					ImportDialog.openError(currShell, DIALOG_TITLE, inportOutcome, info);
				}
			});
		} else {
			defaultDisplay.syncExec(new Runnable() {
				@Override
				public void run() {
					Shell currShell = defaultDisplay.getActiveShell();
					MessageDialog.openInformation(currShell, "Info", inportOutcome);
				}
			});
		}
	}
	
	/**
	 * Shows a message with a report of the modified diagrams.
	 * @param message the message to display
	 * @param removedElements the list of modified diagrams
	 */
	private void showDiagramMessage(Set<String> modifiedDiagrams) {
		final Display defaultDisplay = Display.getDefault();		
		if (modifiedDiagrams != null && modifiedDiagrams.size() > 0) {
			final MultiStatus info = 
					new MultiStatus(pluginID, 1, 
							"Click on \"Details\" to see the list of modified/removed diagrams.", null);
			for (String item : modifiedDiagrams) {
				info.add(new Status(IStatus.INFO, pluginID, 1, item, null));
			}

			defaultDisplay.syncExec(new Runnable() {
				@Override
				public void run() {
					final Shell currShell = defaultDisplay.getActiveShell();
					ImportDialog.openError(currShell, DIALOG_TITLE, "Diagrams updated!", info);
				}
			});
		} else {
			dialogUtil.showMessage_GenericMessage(DIALOG_TITLE, "\nNo diagrams needed changes");
		}
	}
	
	@Override
	public void execPreJobOperations(ExecutionEvent event, IProgressMonitor monitor) throws Exception {

		final EntityUtil entityUtil = EntityUtil.getInstance();
		final SelectionUtil selectionUtil = SelectionUtil.getInstance();

		// get the parameters
		final String packageURI = event.getParameter("packageURI");	
		final String ossFilePath = event.getParameter("ossFilePath");

		logger.debug("packageURI: " + packageURI);
		logger.debug("ossFilePath: " + ossFilePath);

		final Object umlPackage;
		final Resource resource;

		// if parameters == null then take them from current CHESS session
		if (packageURI == null) {
			umlPackage = selectionUtil.getUmlSelectedObject(event);
			resource = selectionUtil.getSelectedUmlModel().getResource();
		} else {
			final Resource modelRes = SelectionUtil.getInstance().getSelectedModelResource();
			final Model model = (org.eclipse.uml2.uml.Model) modelRes.getContents().get(0);
			umlPackage = (Package) EntityUtil.getInstance().getElement(model, packageURI);
			logger.debug("umlPackage: " + umlPackage);

			resource = ((Package) umlPackage).eResource();
		}

		if (entityUtil.isSystemViewPackage((Element) umlPackage)) {

			final File ossFile;

			if (ossFilePath != null) {
				ossFile = new File(ossFilePath);
			} else {
				ossFile = getOSSFileFromDialog();
			}

			if (ossFile != null) {
				// Check if there are errors in the OSS file
				final boolean isValid = RuntimeErrorService.getInstance().showOSSRuntimeErrors(ossFile, resource, true,
						false, monitor);

				monitor.beginTask("Importing elements from OSS file", 1);

				final ImportOSSFileAction action = ImportOSSFileAction.getInstance();

				if (isValid && action != null) {

					// Hide the active page in order to avoid popups appearing
					final IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
							.getActivePage();
					activePage.setEditorAreaVisible(false);
					//Resource resource = SelectionUtil.getInstance().getSelectedModelResource();
					
					Package sysViewPkg = EntityUtil.getInstance().getCurrentSystemView();
					TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(umlPackage);
					
					// Parse the file and retrieve results
					final StringBuffer importErrors = action.startParsing((Package) umlPackage, ossFile,domain);
					if (importErrors.length() != 0) {
						dialogUtil.showMessage_GenericMessage(DIALOG_TITLE, importErrors.toString());
					}
					
					// Restore the active page
					activePage.setEditorAreaVisible(true);

					final List<String> addedElements = action.getAddedElements();
					final List<String> removedElements = action.getRemovedElements();
					showImportMessage(addedElements, removedElements);
					
					final Set<String> modifiedDiagrams = action.getModifiedDiagrams();					
					modifiedDiagrams.addAll(updateDiagrams((Package) umlPackage));
					showDiagramMessage(modifiedDiagrams);
				}
			}
			monitor.done();
			return;
		}
		dialogUtil.showMessage_GenericMessage(DIALOG_TITLE, "Please select a package from <<SystemView>>");
	}

	@Override
	public void execJobCommand(ExecutionEvent event, IProgressMonitor monitor) throws Exception {
	}

	/**
	 * Updates the diagrams in the given package.
	 * @param pkg the package containing the diagrams
	 * @return
	 */
	private Set<String> updateDiagrams(Package pkg) {
		
		final Set<String> modifiedDiagrams = new HashSet<String>(); 

		// Update all the diagrams of the model
		final CHESSDiagramsGeneratorService chessDiagramsGeneratorService = CHESSDiagramsGeneratorService.getInstance();//CHESSInternalBlockDiagramModel.getInstance(), CHESSBlockDefinitionDiagramModel.getInstance()
		final Collection<Diagram> chessDiagrams = chessDiagramsGeneratorService.getDiagrams();
		final Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

		for (Diagram diagram : chessDiagrams) {

			// Get the package owner of the diagram
			Package activePackage = null;
			final EObject diagramElement = diagram.getElement();
			if (diagramElement instanceof Package) {
				activePackage = (Package) diagramElement;
			} else if (diagramElement instanceof Class) {
				activePackage = ((Class) diagramElement).getPackage();
			}

			// Check to see if the diagram is of the same package
			if (activePackage != pkg) {
				continue;
			}

			if (diagram.getType().equals(BDD)) {

				// Get the EditPart associated to the diagram and refresh the diagram
				final IGraphicalEditPart diagramEP = OffscreenEditPartFactory.getInstance()
						.createDiagramEditPart(diagram, shell);
				if (ShowBDDElementsAction.getInstance().refreshDiagram(diagramEP)) {
					modifiedDiagrams.add(diagram.getName());
				}
				
			} else if (diagram.getType().equals(IBD)) {

				// Get the EditPart associated to the diagram and refresh the diagram
				final IGraphicalEditPart diagramEP = OffscreenEditPartFactory.getInstance()
						.createDiagramEditPart(diagram, shell);
				if (ShowIBDElementsAction.getInstance().refreshDiagram(diagramEP)) {
					modifiedDiagrams.add(diagram.getName());
				}
			}
		}
		return modifiedDiagrams;
	}

	/**
	 * Displays a file dialog to select the OSS file.
	 * 
	 * @return the selected File
	 * @throws Exception
	 */
	private File getOSSFileFromDialog() throws Exception {
		File ossFile = null;

		final FileDialog dialog = 
				new FileDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), SWT.OPEN);
		dialog.setFilterExtensions(new String[] { "*.oss", "*.OSS" });
		final String result = dialog.open();

		if (result != null) {
			try {
				ossFile = new File(result);
			} catch (NullPointerException e) {
				throw new Exception("File not valid!");
			}
		}
		return ossFile;
	}

	@Override
	public void execPostJobOperations(ExecutionEvent event, NullProgressMonitor nullProgressMonitor) throws Exception {
		// TODO Auto-generated method stub
		
	}
}

/**
 * A small class derived from the ErrorDialog, in order to have a Details button.
 * @author cristofo
 *
 */
class ImportDialog extends ErrorDialog {
	public ImportDialog(Shell parentShell, String dialogTitle, String message, IStatus status, int displayMask) {
		super(parentShell, dialogTitle, message, status, displayMask);
		this.message = message == null ? status.getMessage() : message + "\n\n" +  status.getMessage();
	}	
	
	public static int openError(Shell parent, String dialogTitle, String message, IStatus status) {
		return openError(parent, dialogTitle, message, status, IStatus.OK | 
				IStatus.INFO | IStatus.WARNING | IStatus.ERROR);
	}

	public static int openError(Shell parentShell, String title, String message, IStatus status, int displayMask) {
		ErrorDialog dialog = new ImportDialog(parentShell, title, message, status, displayMask);
		return dialog.open();
	}
}
