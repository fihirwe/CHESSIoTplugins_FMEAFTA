package org.polarsys.chess.mbsanice.analysis.commands;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Model;
import org.polarsys.chess.core.util.uml.ResourceUtils;
import org.polarsys.chess.mbsanice.analysis.Activator;
import org.polarsys.chess.mbsanice.analysis.excel.FlaRulesImporter;
import org.polarsys.chess.mbsanice.analysis.report.FlaRulesImportReportDialog;
import org.polarsys.chess.mbsanice.analysis.report.FlaRulesImportReportProvider;
import org.polarsys.chess.service.gui.utils.CHESSEditorUtils;

public class ImportFLARulesCommand extends AbstractHandler {

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
				FileDialog fd = new FileDialog(activeShell);
				fd.setText("Select FLA Rules");
				String[] ext = {"*.xlsx"};
				fd.setFilterExtensions(ext);
				fd.setFilterNames(new String[] { "FLA Rules(*.xlsx)" });

				String selected = fd.open();

				if(selected != null && !selected.isEmpty()){
					TransactionalEditingDomain editordomain = (TransactionalEditingDomain) editor.getEditingDomain();
					FlaRulesImportReportProvider reportProvider = new FlaRulesImportReportProvider();

					ProgressMonitorDialog pmDialog = new ProgressMonitorDialog(activeShell);
					FlaRulesImporter reader = new FlaRulesImporter(selected, chessModel, editordomain, reportProvider);

					try {
						pmDialog.run(true, true, reader);
					} catch (InvocationTargetException | InterruptedException e) {
						IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
						Activator.getDefault().getLog().log(status);
						throw new ExecutionException("Error during Import of FLA Rules from Excel", e);
					}

					FlaRulesImportReportDialog dialog = new FlaRulesImportReportDialog(activeShell,reportProvider);
					dialog.create();
					dialog.open();
				}
			}
			
		}catch (ServiceException e) {
			MessageDialog.openError(activeShell, "Import FLA Rules Error", "Unable to open the CHESS model: " + e.getMessage());
		}catch (Exception e){
			//TODO
			e.printStackTrace();
		}
		
		
		return null;
	}

}
