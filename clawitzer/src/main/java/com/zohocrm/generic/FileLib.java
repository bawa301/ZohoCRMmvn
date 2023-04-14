package com.zohocrm.generic;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
	public String zohoData(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream("./src\\test\\resources/data/ZohoCRM.property");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	
	public String zohoExcelData(String sheet, int row, int cell) throws Throwable
	{
		FileInputStream fis =new FileInputStream("./src\\test\\resources/data/ZohoEx.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}

	
}
