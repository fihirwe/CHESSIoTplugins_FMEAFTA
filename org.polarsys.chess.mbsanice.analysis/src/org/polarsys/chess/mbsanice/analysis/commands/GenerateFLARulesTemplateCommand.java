package org.polarsys.chess.mbsanice.analysis.commands;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Model;
import org.polarsys.chess.core.util.uml.ResourceUtils;
import org.polarsys.chess.mbsanice.analysis.Activator;
import org.polarsys.chess.mbsanice.analysis.excel.FLARulesTemplateGenerator;
import org.polarsys.chess.service.gui.utils.CHESSEditorUtils;

public class GenerateFLARulesTemplateCommand extends AbstractHandler {
	
	private String recentSelection;
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		final Shell activeShell = window.getShell();

		PapyrusMultiDiagramEditor editor = CHESSEditorUtils.getCHESSEditor();
		Model chessModel = null;
		try {
			Resource chessResource = ResourceUtils.getUMLResource(editor.getServicesRegistry());
			chessModel = (Model) chessResource.getContents().get(0);

			if (chessModel != null){
				
				FileDialog fd = new FileDialog(activeShell, SWT.SAVE);
				fd.setText("Save FLA Rules Template");
				String[] ext = {"*.xlsx"};
				fd.setFilterExtensions(ext);
				fd.setFilterNames(new String[] { "FLA Rules Template(*.xlsx)" });
				fd.setOverwrite(true);
				if(recentSelection != null){
					fd.setFilterPath(recentSelection);
				}

				String selected = fd.open();

				if(selected != null && !selected.isEmpty()){
					recentSelection = new File(selected).getParent();
					ProgressMonitorDialog pmDialog = new ProgressMonitorDialog(activeShell);
					FLARulesTemplateGenerator writer = new FLARulesTemplateGenerator(selected, chessModel, activeShell);

					try {
						pmDialog.run(true, true, writer);
					} catch (InvocationTargetException | InterruptedException e) {
						IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
						Activator.getDefault().getLog().log(status);
						throw new ExecutionException("Error during Generation of FLA Rules Template", e);
					}
					
				}
			}else{
				activeShell.getDisplay().asyncExec(new Runnable(){
					
					@Override
					public void run() {
						MessageDialog.openError(activeShell,"ERROR", "System View not found in model!");
					}
				});
			}

		}catch (ServiceException e) {
			activeShell.getDisplay().asyncExec(new Runnable(){

				@Override
				public void run() {

					MessageDialog.openError(activeShell, "Export FLA Rules Error", "Unable to open the CHESS model: " + e.getMessage());
				}
			});
		}catch (Exception e){
			//TODO
			e.printStackTrace();
		}

		return null;
	}

}
