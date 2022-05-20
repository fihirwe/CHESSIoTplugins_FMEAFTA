package org.polarsys.chess.fla.faultTreeGenerator.handlers;
import java.io.File;  
import java.io.FileInputStream;  
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.jface.dialogs.MessageDialog;

import com.google.common.collect.Iterables;  

public class ParseExcel {


	public static List<FailureData> parse(File file) throws IOException 
	{  
		List<FailureData> excelData= new ArrayList<>();
		//obtaining input bytes from a file  
		FileInputStream fis=new FileInputStream(file);  
		//creating workbook instance that refers to .xls file  
		XSSFWorkbook wb=new XSSFWorkbook(fis);   
		//creating a Sheet object to retrieve the object  
		XSSFSheet sheet=wb.getSheetAt(0);  		
		String name;
		double prob=0;
		String description;

		FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();  

		for(Row row: Iterables.skip(sheet, 1) )     //iteration over row using for each loop  
		{

			Iterator<Cell> cellIterator = row.cellIterator();

			while (cellIterator.hasNext()) {
				name= cellIterator.next().toString();
				String probString=cellIterator.next().toString();
				try{
					prob=Double.parseDouble(probString);
				}
				catch (Exception e){
					prob=0;
					System.out.println("Unaccepted probability value was found..  "+ probString +" A default value (0) was been used instead");
				}

				description=cellIterator.next().toString();
				excelData.add(new FailureData(name,prob,description));
			}

		}
		return excelData;  
	}


	private static String getExactName(String stringCellValue) {
		return stringCellValue.toLowerCase();
	}


	public static String getDescriptionByName(List<FailureData> excelData,String[] name, String basic){
		for (FailureData failureData : excelData) {
			String desc= failureData.getName().toLowerCase();
			if (desc.contains(name[0].toLowerCase()) && desc.contains(name[1].toLowerCase()) && desc.contains(name[2].toLowerCase())) {
				if (failureData.getDescription().replaceAll(" ", "").length()>0) {
						return name[0]+"+"+name[1]+" \n--------------\n "+basic+failureData.getDescription();
				}

			}
		}

		return "NULL";
	}

	public static double getProbabilityByName(List<FailureData> excelData, String[] name){
		for (FailureData failureData : excelData) {
			String desc= failureData.getName().toLowerCase();
			if (desc.contains(name[0].toLowerCase()) && desc.contains(name[1].toLowerCase()) && desc.contains(name[2].toLowerCase())) {
				return failureData.getProbability();
			}
		}

		return 0;
	}


}  


