package com.LMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.LMS.Base.TestBase;

public class AddInstitutionalrolepage  extends TestBase {
	
	
	  public void AddCourse() {
		  PageFactory.initElements(driver, this);
		}
	  
	
	  public AddInstitutionalrolepage clickonInstitutionalrole() throws InterruptedException {
		  
		  
	//Add Institutional role 
		  
		  //Click on Institutional role 
		  driver.findElement(By.xpath("//span[contains(text(),'Institutional Roles')]")).click();
		   Thread.sleep(2000);
					
		  //Click on Add Institutional role 
		   driver.findElement(By.xpath("//a[contains(text(),'Add Institutional Roles')]")).click();
		   Thread.sleep(2000); 
		  
		  //Language
		   driver.findElement(By.xpath("//select[@id='language']")).sendKeys("English");
		   Thread.sleep(2000);
		  
		  //Organisation
		   driver.findElement(By.xpath("//a[@class='small3']")).click();
		   Thread.sleep(2000);
		  
		   //Add button
		   driver.findElement(By.xpath("//tbody[1]//tr[1]//td[6]//button[1]")).click();
		   Thread.sleep(2000);
		  
		  //Role Id 
		   driver.findElement(By.xpath("//input[@id='code']")).sendKeys("IR3");
		   Thread.sleep(2000);
		   
		   //Role Name
		   driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Course-Builder");
		   Thread.sleep(2000);
		  
		   //Effective Date
		   driver.findElement(By.xpath("//input[@id='effectiveDate']")).sendKeys("07/05/2019");
		   Thread.sleep(2000);
		   
		   //End Date
		   driver.findElement(By.xpath("//input[@id='endDate']")).sendKeys("08/31/2019");
		   Thread.sleep(2000);
		   
		   //Submit
		   driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		   Thread.sleep(2000);
		  
			//to accept the alert 
			driver.switchTo().alert().accept();
			 Thread.sleep(2000);
			 
			 
//View Institutional role 
			 
			 //Click on  view Institutional role
			 driver.findElement(By.xpath("//a[contains(text(),'View Institutional Roles')]")).click();
			   Thread.sleep(2000);
			 
			 //Click on Edit 
			   driver.findElement(By.xpath("//tbody[1]//tr[1]//td[6]//button[1]")).click();
			   Thread.sleep(2000);
			 
			 //Role ID
			   driver.findElement(By.xpath("//input[@id='code']")).clear();
			   Thread.sleep(2000);
			 
			   //Role ID
			   driver.findElement(By.xpath("//input[@id='code']")).sendKeys("IR11");
			   Thread.sleep(2000);
			 
			   //Role Name
			   driver.findElement(By.xpath("//input[@id='name']")).clear();
			   Thread.sleep(2000);
			 
			   //Role Name 
			   driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Guest");
			   Thread.sleep(2000);
			   
			   //Submit
			   
			   driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
			   Thread.sleep(2000);
			   
			 //to accept the alert 
				driver.switchTo().alert().accept();
				 Thread.sleep(2000);
			   
				 driver.switchTo().alert().accept();
				 Thread.sleep(2000);
			   
			
//Search Institutional role 
				 
				 //Search Institutional role 
				 
				 driver.findElement(By.xpath("//a[contains(text(),'Search Institutional Roles')]")).click();
				   Thread.sleep(2000);
				 
				 //Name
				   driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Course-Builder");
				   Thread.sleep(2000);
				 
				 //Code
				   driver.findElement(By.xpath("//input[@id='code']")).sendKeys("IR3");
				   Thread.sleep(2000);
				   
				 //Search
				   
				   driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
				   Thread.sleep(2000);
				   
				 
		return new AddInstitutionalrolepage();
		  
	  }

}
