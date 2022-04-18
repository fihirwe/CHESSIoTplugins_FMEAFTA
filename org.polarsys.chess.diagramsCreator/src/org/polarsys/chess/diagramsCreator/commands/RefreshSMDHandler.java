/*******************************************************************************
 * Copyright (C) 2018 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *  
 * Contributors:
 *   Luca Cristoforetti - initial API and implementation
 ******************************************************************************/
package org.polarsys.chess.diagramsCreator.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.elk.core.service.DiagramLayoutEngine;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.papyrus.infra.ui.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.uml.diagram.statemachine.custom.edit.part.CustomPackageEditPart;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.polarsys.chess.diagramsCreator.actions.ShowSMDElementsAction;
import org.polarsys.chess.service.gui.utils.SelectionUtil;

import eu.fbk.eclipse.standardtools.utils.ui.utils.DialogUtil;

/**
 * This class is to refresh a State Machine Diagram.
 * It is triggered by the contextual menu item on a diagram.
 * @author cristofo
 *
 */
public class RefreshSMDHandler extends AbstractHandler {

	private static final String DIALOG_TITLE = "SMD refresher";
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IGraphicalEditPart selectedEditPart = SelectionUtil.getInstance().getSelectedGraphicalObject(event);
		
		if (selectedEditPart instanceof CustomPackageEditPart) {
			final ShowSMDElementsAction action = ShowSMDElementsAction.getInstance();
			action.refreshDiagram(((CustomPackageEditPart) selectedEditPart).getDiagramView());
			
			// Call the Eclipse Layout Kernel engine        			
			// Get the active editor, which is expected to contain the diagram for applying layout
			IEditorPart editorPart = HandlerUtil.getActiveEditor(event);        

			if (editorPart instanceof IMultiDiagramEditor) {
				editorPart = ((IMultiDiagramEditor) editorPart).getActiveEditor();
			}

			if (editorPart instanceof DiagramEditor) {
				Object diagramPart = null;
				final boolean zoomToFit = false;

				// Call the layout, twice for better results
				DiagramLayoutEngine.invokeLayout(editorPart, diagramPart, false, false, false, zoomToFit);
				DiagramLayoutEngine.invokeLayout(editorPart, diagramPart, false, false, false, zoomToFit);
			}
		} else {
			DialogUtil.getInstance().showMessage_GenericMessage(DIALOG_TITLE, "Please select a State Machine Diagram");
		}
		return null;
	}
}
