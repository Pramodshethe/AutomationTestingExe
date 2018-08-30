package com.team1.demotesting.PhpTravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class CrossFunctions extends ReadWrite {
	
	WebDriver oBrowser = new ChromeDriver();
	
	/*
     * ********************************************************************
     * Method Name                    : 
     * Created By                     : Team1
     * Created Date                   : 26th Aug 2018
     * Modified Date                  : 30th Aug 2018
     * Parameters                     : 
     * Purpose                        : it carries out the entire operations 
     * **********************************************************************
     */
	
	public void returnValue(int i) throws Exception {
		
		ReadWrite readwrite = new ReadWrite();
		
		try {
			String got_title = oBrowser.getTitle();
			System.out.println("First: "+got_title);
	    	String check = "DASHBOARD";
	    	
			if(got_title.equals(check)) {
				oBrowser.findElement(By.xpath("/html/body/div[2]/aside/div/div[2]/div/div[2]/div/a")).click();
				Thread.sleep(1000);
								} 
			
			String mytitle = oBrowser.getTitle();
			String expected = "Administator Login";
			System.out.println("second: "+mytitle);
			if(mytitle.equals(expected))
			{		
    	
				String str = readwrite.readExcel(i,1);
				String str1 = readwrite.readExcel(i,2);
				System.out.println(str);
				System.out.println(str1);
    	
    	    	
				System.out.println("1:Entering to login");
        
				oBrowser.findElement(By.xpath("/html/body/div/form[1]/div[1]/input[1]")).sendKeys(str);
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("/html/body/div/form[1]/div[1]/input[2]")).sendKeys(str1);
				Thread.sleep(2000);
				System.out.println("2:Login Credentials Entered");
        
    	                
				oBrowser.findElement(By.xpath("/html/body/div/form[1]/button/span[1]")).click();
				Thread.sleep(3000);
				
		
				
				String mytitle1 = oBrowser.getTitle();
				String expected1 = "Dashboard";
				System.out.println("third: "+mytitle1);
				
				if(mytitle1.equals (expected1))
				{	
					System.out.println("3:Loged in and Navigating to main page");
					Thread.sleep(1000);
					
   					oBrowser.findElement(By.xpath("//*[@id=\"social-sidebar-menu\"]/li[5]/a")).click();
					Thread.sleep(2000);
					System.out.println("4:Accounts dropdown clicked");
        
					oBrowser.findElement(By.xpath("//*[@id=\"ACCOUNTS\"]/li[1]/a")).click();
					Thread.sleep(3000);
					System.out.println("5:admin button clicked and entering to new page");
        
					oBrowser.findElement(By.xpath("//*[@id=\"content\"]/div/form/button")).click();
					Thread.sleep(2000);
					System.out.println("6:Add button clicked");
        
        
    		/*---------------ENTERING DATA (Static)-----------------*/
        
					oBrowser.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[1]/div/input")).sendKeys("Sunil");
					Thread.sleep(1000);
    		
					oBrowser.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[2]/div/input")).sendKeys("Lokie");
					Thread.sleep(1000);
    		
					oBrowser.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[3]/div/input")).sendKeys("sunil.lokie@gmail.com");
					Thread.sleep(1000);
    		
					oBrowser.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[4]/div/input")).sendKeys("12345678");
					Thread.sleep(1000);
        
					oBrowser.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[5]/div/input")).sendKeys("9988776655");
					Thread.sleep(1000);
        
					oBrowser.findElement(By.xpath("//*[@id=\"s2id_autogen1\"]/a/span[1]")).click();
					Thread.sleep(1000);
        
					oBrowser.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[80]")).click();
					Thread.sleep(1000);
        
					oBrowser.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[8]/div/input")).sendKeys("Mumbai");
					Thread.sleep(1000);
        
              
					oBrowser.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/div/div[9]/div/input")).sendKeys("Borivali");
					Thread.sleep(1000);
        
					oBrowser.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[3]/button")).click();
					Thread.sleep(2000);
       
					oBrowser.findElement(By.xpath("/html/body/div[2]/aside/div/div[2]/div/div[2]/div/a")).click();
					Thread.sleep(1000);
    									  
    		//Entering passed TC back to the Excel file
					
					readwrite.writeExcel(i,"Passed");     
					
				}else {
					
					readwrite.writeExcel(i, "failed");
					
					  }	
				}
		    		
			}catch(Exception e){
				e.printStackTrace();
				}     	
	}
}
