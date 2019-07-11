package com.LMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.LMS.Base.TestBase;

public class AddSystemrolepage extends TestBase{
	
	
	public void AddSystemrole() {
		  PageFactory.initElements(driver, this);
		}
	  
	
	public AddSystemrolepage clickonSystemrole() throws InterruptedException {
		
		
		
//System role
		
		  //Click on system role
		driver.findElement(By.xpath("//span[contains(text(),'System Roles')]")).click();
		   Thread.sleep(2000);
		
		//Click on Add system role
		   driver.findElement(By.xpath("//a[contains(text(),'Add System Roles')]")).click();
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
		   
		//role id
		   driver.findElement(By.xpath("//input[@id='roleId']")).sendKeys("SY2");
		   Thread.sleep(2000); 
		   
		//role Name
		   driver.findElement(By.xpath("//input[@id='roleName']")).sendKeys("Goals-Manager");
		   Thread.sleep(2000); 
		   
		   //Effective date
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
			 
//View System Role
			 
			 //Click on View System Role
			 
			  driver.findElement(By.xpath("//a[contains(text(),'View System Roles')]")).click();
			   Thread.sleep(2000); 
			   
			 //Click on Edit
			   
		      driver.findElement(By.xpath("//tbody[1]//tr[1]//td[6]//button[1]")).click();
			  Thread.sleep(2000); 
			 
			 //roleid
			  driver.findElement(By.xpath("//input[@id='roleId']")).clear();
			  Thread.sleep(2000); 
			 
			  //role id
			  driver.findElement(By.xpath("//input[@id='roleId']")).sendKeys("SY11");
			  Thread.sleep(2000); 
			  
			  
			 //role name
			  driver.findElement(By.xpath("//input[@id='roleName']")).clear();
			  Thread.sleep(2000); 
			  
			 //role name
			  driver.findElement(By.xpath("//input[@id='roleName']")).sendKeys("Observer");
			  Thread.sleep(2000); 
			
		   //Submit
		   driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		   Thread.sleep(2000); 
		   
		   
			 //to accept the alert 
				driver.switchTo().alert().accept();
				 Thread.sleep(2000);
			   
				 driver.switchTo().alert().accept();
				 Thread.sleep(2000);
			   
//Search System Role
				 
				 //Click on Search System Role
				 driver.findElement(By.xpath("//a[contains(text(),'Search System Roles')]")).click();
				   Thread.sleep(2000); 
				 
				  //Name
				   driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Guest");
				   Thread.sleep(2000); 
				   
				   //Code
				   
				   driver.findElement(By.xpath("//input[@id='code']")).sendKeys("SY3");
				   Thread.sleep(2000); 
				   
				   //Search 
				   driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
				   Thread.sleep(2000); 
				   
				   
		return new AddSystemrolepage();
		
	}
	
	

}
