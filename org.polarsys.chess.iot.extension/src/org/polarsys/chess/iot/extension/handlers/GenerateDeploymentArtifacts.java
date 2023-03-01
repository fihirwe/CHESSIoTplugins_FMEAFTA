package org.polarsys.chess.iot.extension.handlers;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.polarsys.chess.core.util.CHESSProjectSupport;
import org.polarsys.chess.core.util.uml.ResourceUtils;
import org.polarsys.chess.core.views.DiagramStatus;
import org.polarsys.chess.iot.software.generator.ui.common.GenerateAll;
import org.polarsys.chess.service.gui.utils.CHESSEditorUtils;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.swt.widgets.Shell;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */

public class GenerateDeploymentArtifacts extends AbstractHandler {


private Resource inResource;
private TransactionalEditingDomain transactionalEditingDomain;


	boolean success;
	
	public boolean isSuccess() {
		return success;
	}
	
	public void setSuccess(boolean success) {
		this.success = success;
	}
	//	@Override
//	public Object execute(ExecutionEvent event) throws ExecutionException {
//
//		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
//		MessageDialog.openInformation(
//				window.getShell(),
//				"Extension",
//				"this will be implemented!");
//		return null;
//	}
	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
//		MessageDialog.openInformation(
//				window.getShell(),
//				"Extension",
//				"this will be implemented!");
		
		final IEditorPart editor = HandlerUtil.getActiveEditor(event);

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
						GenerateDeploymentArtifacts.this.execute_(editor, subMonitor.newChild(40),filecopy);
//						return "Success";

					} catch (Exception e) {
						setSuccess(false);
						throw e;
						
					} finally {
						GenerateDeploymentArtifacts.this.getActiveProject(editor).refreshLocal(IResource.DEPTH_INFINITE, subMonitor.newChild(5));
					}
				} catch (Exception e) {
					e.printStackTrace();
					StringWriter sw = new StringWriter();
					PrintWriter pw = new PrintWriter(sw);
					e.printStackTrace(pw);
					CHESSProjectSupport.printlnToCHESSConsole(sw.toString());

					return new Status(Status.ERROR, null, 1,
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
	
	
	
	
	private boolean execute_(IEditorPart editor, IProgressMonitor monitor, IFile inputFile) throws Exception {

		if (!(editor instanceof PapyrusMultiDiagramEditor))
			return false;
		if(GenerateDeploymentArtifacts.performCodeGeneration((PapyrusMultiDiagramEditor)editor, inputFile, monitor)){
			setSuccess(true);
			return true;
		}

		setSuccess(false);
		return false;
	}
	
	public static boolean performCodeGeneration(final PapyrusMultiDiagramEditor editor, IFile model, IProgressMonitor monitor) throws Exception {
		Object modelURI = GenerateDeployment(model, monitor);
		
		if(modelURI!= null){
			return true;
		}
		return false;
	}
	
	public static Object GenerateDeployment(IFile model, IProgressMonitor monitor){
		URI modelURI = URI.createPlatformResourceURI(model.getFullPath().toString(), true);
		try {
			IContainer target = model.getProject().getFolder("Deployment-"+model.getProject().getName()+getMillisecond());
			GenerateAll generator = new GenerateAll(modelURI, target, getArguments());
			try {
				generator.doGenerateDeployment(monitor);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} finally {
			
			try {
				model.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return modelURI;
	}
	
	public static String getMillisecond(){
		Date date = new Date();
		String time = new SimpleDateFormat("-yyyy-MM-dd-HH-mm-ss", Locale.ENGLISH).format(date);
		return String.valueOf(time);

	}

	
	public static IProject getActiveProject(IEditorPart editor) {
		IFileEditorInput input = (IFileEditorInput) editor.getEditorInput();
		IFile file = input.getFile();
		return file.getProject();
	}
	
	protected static List<? extends Object> getArguments() {
		return new ArrayList<String>();
	}
	

}


