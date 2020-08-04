package com.vtiger.generucLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {
	public String getDataFromProperty(String key) throws IOException
	{
		String filePath="E:\\Java Workspace\\Vtiger Framework\\Data Storage\\commonData.properties";
		FileInputStream fis= new FileInputStream(filePath);
		Properties p= new Properties();
		p.load(fis);
		String value=p.getProperty(key);
		return value;
		
	}
	public String getDataFromExcel(String sheetname, int rownum, int cellnum) throws IOException
	{
		String filePath="E:\\Java Workspace\\Vtiger Framework\\Data Storage\\testData.xlsx";
		FileInputStream fis1= new FileInputStream(filePath);
		Workbook book=WorkbookFactory.create(fis1);
        Sheet sh=book.getSheet(sheetname);
		String value=sh.getRow(rownum).getCell(cellnum).getStringCellValue();
		return value;
		
	}

}
                    