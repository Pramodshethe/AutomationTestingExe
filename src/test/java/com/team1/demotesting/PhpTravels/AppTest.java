package com.team1.demotesting.PhpTravels;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class AppTest 
{
    public static void main( String[] args )
    {
    	/*
         * ********************************************************************
         * Method Name                    : 
         * Created By                     : Pramodkumar Shethe
         * Created Date                   : 22th Aug 2018
         * Modified Date                  : 28th Aug 2018
         * Parameters                     : 
         * Purpose                        : open browser, website and giving login credentials and login   
         * ******************************************************************
         */
		   	CrossFunctions crossFunctions = new CrossFunctions();
    	try {
    		System.setProperty("WebDriver.Chrome.driver", "D:/workspace/PhpTravels/chromedriver.exe");
    	
    	
    	//Taking data from the Excel file 
    	
    		FileInputStream in = new FileInputStream("D:\\workspace\\PhpTravels\\src\\test\\java\\com\\team1\\xlImport\\data.xlsx");
    		XSSFWorkbook wb = new XSSFWorkbook(in);
    		XSSFSheet sheet = wb.getSheet("Sheet1");
    		crossFunctions.oBrowser.get("https://www.phptravels.net/admin");
    		Thread.sleep(3000);
        
    		int i =1;
    		do {
       		
       		
    			System.out.println(i);
    			XSSFCell cell2 = sheet.getRow(i).getCell(0);
    			double str2 = cell2.getRowIndex();
    			int a = (int) Math.round(str2);
    			System.out.println(a);
    
    	//Method calling
    	
    			crossFunctions.returnValue(a);
    			i++;
        
    			}while(i<=2);
	            
        
    		}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}
