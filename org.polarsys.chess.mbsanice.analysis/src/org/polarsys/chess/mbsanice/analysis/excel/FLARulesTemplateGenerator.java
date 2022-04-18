package org.polarsys.chess.mbsanice.analysis.excel;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFDataValidation;
import org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint;
import org.apache.poi.xssf.usermodel.XSSFDataValidationHelper;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Stereotype;
import org.polarsys.chess.mbsanice.analysis.Activator;

public class FLARulesTemplateGenerator implements IRunnableWithProgress{

	private static final String[] FAILURESFORFLA = new String[]{"noFailure", "omission", "commission", "valueCoarse", "valueSubtle", "late", "early"};
	private String excelFilePath;
	private Shell shell;
	private Model chessModel;

	public FLARulesTemplateGenerator(String excelFilePath, Model chessModel, Shell shell) {
		this.excelFilePath = excelFilePath;
		this.shell = shell;
		this.chessModel = chessModel;
	}

	@Override
	public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
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
				// get preferences
				String portOrderStr = Activator.getDefault().getPreferenceStore().getString("PORTORDER");
				List<String> portOrder = Arrays.asList(portOrderStr.split(","));
				XSSFWorkbook wb = new XSSFWorkbook();
				
				List<Class> blocks = ImportExportUtils.getTerminalBlocks(systemView);

				//create a works sheet for each block. Write "FLA rules" in cell A1 
				for (Class block : blocks) {
					XSSFSheet sheet = wb.createSheet(block.getName());
					
					XSSFRow firstRow = sheet.createRow(0); // first row
					int cellCount = 0;
					//get input flowports
					List<Port> inputPorts = ImportExportUtils.getFlowPorts(block, "in");
					//apply port order
					List<Port> orderedInputPorts = applyPortOrder(inputPorts, portOrder);
					for (Port port : orderedInputPorts) {
						XSSFCell cell = firstRow.createCell(cellCount);
						cell.setCellValue(port.getName());
						cellCount++;
					}
					//get output flowports
					List<Port> outputPorts = ImportExportUtils.getFlowPorts(block, "out");
					//apply port order
					List<Port> orderedOutputPorts = applyPortOrder(outputPorts, portOrder);
					for (Port port : orderedOutputPorts) {
						XSSFCell cell = firstRow.createCell(cellCount);
						cell.setCellValue(port.getName());
						cellCount++;
					}
					cellCount++; //skip one column
					XSSFCell cell = firstRow.createCell(cellCount);
					cell.setCellValue("FLA rules");
					
					for(int i = 0; i < cellCount; i++){
						sheet.autoSizeColumn(i);
					}
					sheet.setAutoFilter(new CellRangeAddress(0, 0, 0, cellCount-2));
					
					// set "noFailure" as default
					XSSFRow secondRow = sheet.createRow(1);
					for(int j = 0; j <= cellCount-2; j++){
						XSSFCell currentCell = secondRow.createCell(j);
						currentCell.setCellType(XSSFCell.CELL_TYPE_STRING);
						currentCell.setCellValue("noFailure");
					}
						
					//insert failure drop down list in cells
					XSSFDataValidationHelper validationHelper = new XSSFDataValidationHelper(sheet);
					XSSFDataValidationConstraint validationConstraint = (XSSFDataValidationConstraint)
							validationHelper.createExplicitListConstraint(FAILURESFORFLA);
					CellRangeAddressList addressList = new CellRangeAddressList(1, 1, 0, cellCount-2);
					XSSFDataValidation validation = (XSSFDataValidation)validationHelper.createValidation(
							validationConstraint, addressList);
					sheet.addValidationData(validation);
					
					//insert Excel expression for FLA rules
					XSSFCell flaCell = secondRow.createCell(cellCount);
					flaCell.setCellType(XSSFCell.CELL_TYPE_FORMULA);
					flaCell.setCellFormula(getFlaFormula(cellCount-2, firstRow));
				
				}

				//write to file
				try (OutputStream fileOut = new FileOutputStream(excelFilePath)) {
					wb.write(fileOut);
				}
				wb.close();
				
			} catch (Exception e) {
				shell.getDisplay().asyncExec(new Runnable(){
					
					@Override
					public void run() {
						MessageDialog.openError(shell, "ERROR", "Unexpected Exception while performing the command: " + e.getMessage());
						e.printStackTrace();
					}
				});
			}
		}
	}

	//=CONCATENATE("FLA:",A$1,".",A2,",",B$1,".",B2,"->",C$1,".",C2,";")
	private String getFlaFormula(int columnNum, XSSFRow headerRow) {
		boolean firstOutput = false;
		StringBuilder formula = new StringBuilder();
		formula.append("CONCATENATE(\"FLA:\"");
		
		for(int i = 0; i <= columnNum; i++){
			XSSFCell headerCell = headerRow.getCell(i);
			String header = headerCell.getStringCellValue();
			String columnLetter = CellReference.convertNumToColString(i);
			if(header.startsWith("o") && !firstOutput){
				firstOutput = true;
				formula.append(",\"->\"");
			}else if(i > 0){
				formula.append(",\",\"");
			}
			formula.append("," + columnLetter + "$1");
			formula.append(",\".\"");
			formula.append("," + columnLetter + 2);
			
		}
		
		formula.append(",\";\")");
//		System.out.println(formula.toString());
		return formula.toString();
	}

	private List<Port> applyPortOrder(List<Port> unorderedPorts, List<String> portOrder) {
		List<Port> result = new ArrayList<>();
		
		for(String portname : portOrder){
			Port portFound = null;
			for(Port port : unorderedPorts){
				if(port.getName().equals(portname)){
					result.add(port);
					portFound = port;
				}
			}
			if(portFound != null){
				unorderedPorts.remove(portFound);
			}
		}
		result.addAll(unorderedPorts);
		
		return result;
	}

}
