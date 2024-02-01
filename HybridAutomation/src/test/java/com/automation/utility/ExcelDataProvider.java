package com.automation.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
	
public ExcelDataProvider() {
	try {
		File src=new File("C:\\Users\\dell\\eclipse-workspace\\HybridAutomation\\TestData\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(src);
		wb=new XSSFWorkbook(fis);
	} catch (Exception e) {
		System.out.println("unable to read excel file "+e.getMessage());
	}
	
}

public String getStringData(int sheetIndex,int rows,int columns) {
	return wb.getSheetAt(sheetIndex).getRow(rows).getCell(columns).getStringCellValue();
}
public String getStringData(String sheetname,int rows,int columns) {
	return wb.getSheet(sheetname).getRow(rows).getCell(columns).getStringCellValue();
}
}
