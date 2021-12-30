/*******************************************************************************
 *
 * Copyright (c) 2013, 2015 Intecs SpA 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Nicholas Pacini nicholas.pacini@intecs.it 
 * Stefano Puri stefano.puri@intecs.it
 * Laura Baracchi  laura.baracchi@intecs.it  
 * Initial API and implementation and/or initial documentation
 *******************************************************************************/
package org.polarsys.chess.contracts.transformations.commands;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.papyrus.commands.wrappers.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.services.validation.handler.AbstractCommandHandler;
import org.eclipse.papyrus.infra.services.validation.handler.ValidateModelHandler;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Model;
import org.polarsys.chess.core.util.uml.ResourceUtils;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.AbstractCommand;

public class CHESSContractValidationAndRefinementHandler extends
		ValidateModelHandler {

	private Shell activeShell;
	private PapyrusMultiDiagramEditor editor;
	private CHESSContractValidateAndRefineCommand foreverValidateAndRefineCommand;
	
	
	public CHESSContractValidationAndRefinementHandler(PapyrusMultiDiagramEditor editor,
			Shell activeShell) {
		this.editor = editor;
		this.activeShell = activeShell;
	}

	@Override
	public Command getCommand(){
		try{
			
			
			Resource res = ResourceUtils.getUMLResource(editor.getServicesRegistry());
			Model model =  ResourceUtils.getModel(res);
			String label = "Validate model for NuSMV3-OCRA analysis tool";
			foreverValidateAndRefineCommand = new CHESSContractValidateAndRefineCommand(label, org.polarsys.chess.contracts.validation.Activator.PLUGIN_ID, model);
			foreverValidateAndRefineCommand.setEditor(editor);
			foreverValidateAndRefineCommand.setActiveShell(activeShell);
			return new EMFCommandWrapper(foreverValidateAndRefineCommand);
		}catch(ServiceException e){
			e.printStackTrace();
			return null;
		}
	}

	class EMFCommandWrapper extends AbstractCommand {
		private final ICommand gmfCommand;
		
		public EMFCommandWrapper(ICommand gmfCommand) {
			super(gmfCommand.getLabel());
			this.gmfCommand = gmfCommand;
		}

		public void execute() {
			try {
				gmfCommand.execute(new NullProgressMonitor(), null);
			} catch (ExecutionException e) {
			}
			
		}

		public void redo() {
			try {
				gmfCommand.redo(new NullProgressMonitor(), null);
			} catch (ExecutionException e) {
			}
			
		}
		
	}
	
}


