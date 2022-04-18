/*****************************************************************************
 * Copyright (c) 2021 Intecs Solutions.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *  Felicien Ihirwe
 *
 *****************************************************************************/

package org.polarsys.chess.iot.generator.ui.thingml;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import org.polarsys.chess.core.profiles.CHESSProfileManager;
import org.polarsys.chess.core.util.CHESSProjectSupport;
import org.polarsys.chess.core.util.uml.ModelError;
import org.polarsys.chess.core.util.uml.ResourceUtils;
import org.polarsys.chess.core.util.uml.UMLUtils;
import org.polarsys.chess.core.views.DiagramStatus;
import org.polarsys.chess.iot.generator.ui.transformations.CHESSTransformation;
import org.polarsys.chess.iot.generator.ui.util.ThingMLGenUtil;
import org.polarsys.chess.m2m.Activator;
import org.polarsys.chess.m2m.transformations.PIMPSMTransformationVERDE;
import org.polarsys.chess.service.gui.utils.CHESSEditorUtils;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaResourcesPlatform;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.SAM.SaAnalysisContext;
import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Stereotype;

/**
 * The Class ThingMLGenUIHandler is the handler of the ThingML code generation command (org.polarsys.chess.codegen.ThingML.ThingML.id)
 * registered through the org.eclipse.ui.commands extension point
 */
public class GenerateThingML extends AbstractHandler {

	boolean success;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	Resource inResource = null;
	private TransactionalEditingDomain transactionalEditingDomain;

	/**
	 *  implementation of the ThingML code generation command as an Eclipse Job.
	 *  Calls the internal implementation, refreshes the active project and prints messages to the CHESS console
	 *
	 * @param event the execution event
	 * @return the object (always null)
	 * @throws ExecutionException the execution exception
	 */
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final IEditorPart editor = HandlerUtil.getActiveEditor(event);
		final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		final Shell shell = window.getShell();

		if (!(CHESSEditorUtils.isCHESSProject(editor)))
			return null;


		if (editor.isDirty()){
			if (!MessageDialog.openQuestion(shell, "CHESS code generation", "Model must be saved first, do you want to continue?"))
				return null;

		}

		try {
			inResource = ResourceUtils.getUMLResource(((PapyrusMultiDiagramEditor) editor).getServicesRegistry());
			ModelSet x = ((ModelSet)inResource.getResourceSet());
			transactionalEditingDomain = x.getTransactionalEditingDomain();

		} catch (ServiceException e) {
			MessageDialog.openError(shell, "CHESS", "Unable to load the model");
			return null;
		}

		final Model model = (Model) inResource.getContents().get(0);

		final DiagramStatus diagramStatus = CHESSEditorUtils.getDiagramStatus((PapyrusMultiDiagramEditor) editor);

		final Job job = new Job("Transforming") {
			protected IStatus run(IProgressMonitor monitor) {
				try {

					SubMonitor subMonitor = SubMonitor.convert(monitor);
					subMonitor.beginTask("Transforming", 100);

					if (diagramStatus == null)
						return null;

					boolean oldSuperUserStatus = diagramStatus.isSuperuser();
					diagramStatus.setSuperuser(true);

					IFile filecopy = CHESSProjectSupport.resourceToFile(inResource);
					subMonitor.subTask("Generating ThingMl intermediate model");
					//now generate the code
					Thread.sleep(1000);
					try {
						GenerateThingML.this.execute_(editor, subMonitor.newChild(40),filecopy);
//						return "Success";

					} catch (Exception e) {
						setSuccess(false);
						throw e;
						
					} finally {
						ThingMLGenUtil.getActiveProject(editor).refreshLocal(IResource.DEPTH_INFINITE, subMonitor.newChild(5));
					}
				} catch (Exception e) {
					e.printStackTrace();
					StringWriter sw = new StringWriter();
					PrintWriter pw = new PrintWriter(sw);
					e.printStackTrace(pw);
					CHESSProjectSupport.printlnToCHESSConsole(sw.toString());

					return new Status(Status.ERROR, Activator.PLUGIN_ID, 1,
							"Error in transformation "+ e.getMessage(), null);
				}
				if (monitor.isCanceled())
					return Status.CANCEL_STATUS;
				return Status.OK_STATUS;
			}


		};
		job.addJobChangeListener(new JobChangeAdapter() {
			public void done(IJobChangeEvent event) {
				if (event.getResult().isOK()){
					CHESSProjectSupport.printlnToCHESSConsole("Job completed successfully");

				}
				else{
					CHESSProjectSupport.printlnToCHESSConsole("Job did not complete successfully");

				}
			}
		});

		job.setUser(true);
		job.setPriority(Job.SHORT);
		job.schedule();
		if(isSuccess()){
			return "Success";
		}
		return null;
	}

	/**
	 * Internal implementation of the ThingML code generation command.
	 * Loads the UML model and calls the code generation
	 *
	 * @param editor the active editor
	 * @param monitor the progress monitor
	 * @throws Exception if unable to load the UML model
	 */
	private boolean execute_(IEditorPart editor, IProgressMonitor monitor, IFile inputFile) throws Exception {

		if (!(editor instanceof PapyrusMultiDiagramEditor))
			return false;
		if(CHESSTransformation.performCodeGeneration((PapyrusMultiDiagramEditor)editor, inputFile, monitor)){
			setSuccess(true);
			return true;
		}

		setSuccess(false);
		return false;
	}
}
