package org.polarsys.chess.mbsanice.analysis.excel;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellUtil;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Stereotype;
import org.polarsys.chess.mbsanice.analysis.report.FlaRulesImportReportProvider;
import org.polarsys.chess.mbsanice.analysis.report.ImportReport;

public class FlaRulesImporter implements IRunnableWithProgress{
	
	private String excelFilePath;
	private Model chessModel;
	private TransactionalEditingDomain editingDomain;
	private FlaRulesImportReportProvider reportProvider;
	
	public FlaRulesImporter (String excelFilePath, Model chessModel, TransactionalEditingDomain editingDomain, FlaRulesImportReportProvider reportProvider){
		this.excelFilePath = excelFilePath;
		this.chessModel = chessModel;
		this.editingDomain = editingDomain;
		this.reportProvider = reportProvider;
	}
	
	@Override
	public void run(IProgressMonitor monitor) throws InvocationTargetException,
			InterruptedException {
		
		org.eclipse.uml2.uml.Package systemView = null;
		EList<Package> views = chessModel.getNestedPackages();
		for(Package view : views){
			Stereotype stereo = view.getAppliedStereotype(ImportExportUtils.SystemViewQN);
			if(stereo != null){
				systemView = view;
			}
		}
		if(systemView != null){
				
			try {
				Workbook wb = WorkbookFactory.create(new File(excelFilePath));
			
				int sheetsNum = wb.getNumberOfSheets();
				for (int i = 0; i < sheetsNum; i++) {
					Sheet currentSheet = wb.getSheetAt(i);
					String name = currentSheet.getSheetName();
					Class block = ImportExportUtils.getBlockFromName(systemView, name);
					if(block != null){
//						System.out.println(name + " FOUND!");
						Stereotype stereo = block.getAppliedStereotype(ImportExportUtils.FlaBehaviorQN);
						if(stereo == null){
//							System.out.println("apply FLABehavior to: " + name);
							reportProvider.addReport(new ImportReport("INFO", block, "applied FLABehavior to: " + name));
							stereo = ImportExportUtils.applyFlaBehavior(block, editingDomain);
						}
						final Stereotype flaBehaviorStereo = stereo;

						//searching for right column
						Row firstRow = CellUtil.getRow(0, currentSheet);
						int flaRuleCol = ImportExportUtils.getFlaRulesColumn(firstRow);
						if(flaRuleCol >= 0){
//							System.out.println("FLA rules FOUND!");
							String tmp = "";
							//iterate over FLA rules
							for (Row row : currentSheet){
								Cell cell = CellUtil.getCell(row, flaRuleCol);
								String cellValue = cell.getStringCellValue();
								if(cellValue != null && !cellValue.isEmpty() && cellValue.startsWith("FLA:")){
//									System.out.println("FLA rule: " + cellValue);
									tmp += (cellValue + System.lineSeparator());
								}
							}
							final String FLAexpr = tmp;
							reportProvider.addReport(new ImportReport("INFO", block, "FLA Expression written to: " + name));
							
							Display.getDefault().syncExec(new Runnable() {
							    public void run() {
									editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {

										protected void doExecute() {
											block.setValue(flaBehaviorStereo, "fptc", FLAexpr);
										}
									});
							    }
							});

						}else{
							//add to warnings: no rules for block in excel file
							reportProvider.addReport(new ImportReport("WARNING", block, "No rules for block " + name + " in Excel file"));
						}

					}else{
						//add to warnings: block not found in model
						reportProvider.addReport(new ImportReport("WARNING", "block not found for Excel sheet: " + name));
					}
				}

			} catch (Exception e) {
				reportProvider.addReport(new ImportReport("ERROR", "Unexpected Exception while performing the Import FLA Rules command: " + e.getMessage()));
			}

		}else{
			reportProvider.addReport(new ImportReport("ERROR", "System View not found in model!"));
		}
	}
}
