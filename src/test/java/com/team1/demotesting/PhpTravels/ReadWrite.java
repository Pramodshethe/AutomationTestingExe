package com.team1.demotesting.PhpTravels;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWrite {
	
	String filePath = "D:\\workspace\\PhpTravels\\src\\test\\java\\com\\team1\\xlImport\\data.xlsx";
	
	
	public String readExcel(int i,int j) throws Exception{
		
		FileInputStream in = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(in);
       	XSSFSheet sheet = wb.getSheet("Sheet1");     		 	    	
       	XSSFCell cell = sheet.getRow(i).getCell(j);   	
    	String str = cell.getStringCellValue();
    	return str;
	}
	
	
	
	
	public void writeExcel(int i,String name)throws Exception {
		
		FileInputStream in = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(in);
       	XSSFSheet sheet = wb.getSheet("Sheet1");		
		sheet.getRow(i).getCell(3).setCellValue(name);
		FileOutputStream file = new FileOutputStream(filePath);
		wb.write(file);
		System.out.println(name);
	}

	
	
	
}
