package com.team1.demotesting.PhpTravels;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class AppTest 
{
    public static void main( String[] args )
    {
    		
		   	CrossFunctions crossFunctions = new CrossFunctions();
    	try {
    		
    		System.setProperty("WebDriver.Chrome.driver", "D:/workspace/PhpTravels/chromedriver.exe");
    	
    	
    	//Taking data from the Excel file 
    	
    		FileInputStream in = new FileInputStream("D:\\workspace\\PhpTravels\\src\\test\\java\\com\\team1\\xlImport\\data.xlsx");
    		XSSFWorkbook wb = new XSSFWorkbook(in);
    		XSSFSheet sheet = wb.getSheet("Sheet1");
    		crossFunctions.oBrowser.get("https://www.phptravels.net/admin");
    		Thread.sleep(3000);
    		
    		
    		int i = 1;
    		int m =sheet.getPhysicalNumberOfRows();
    		System.out.println(i);
    		do {
       		
       		
    			System.out.println(i);
    			XSSFCell cell2 = sheet.getRow(i).getCell(0);
    			double str2 = cell2.getRowIndex();
    			int a = (int) Math.round(str2);
    			System.out.println(a);
    
    	//Method calling
    	
    			crossFunctions.returnValue(a);
    			i++;
        
    			}while(i < m);
	                		
    		}catch(Exception e) {
    		e.printStackTrace();
    	}
    
    }
}
