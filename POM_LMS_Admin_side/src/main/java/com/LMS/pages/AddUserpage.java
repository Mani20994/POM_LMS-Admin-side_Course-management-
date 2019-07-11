package com.LMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.LMS.Base.TestBase;

public class AddUserpage extends TestBase{
	
	
	 public void AddUser() {
		  PageFactory.initElements(driver, this);
		}
	  
	
	  public AddUserpage clickonuserpage() throws InterruptedException {
		  
		  
//Add Users
		  
		  //Click on Users
		  driver.findElement(By.xpath("//span[contains(text(),'User')]")).click();
		   Thread.sleep(2000);
		  
		  //Add User
		   driver.findElement(By.xpath("//a[contains(text(),'Add User')]")).click();
		   Thread.sleep(2000);
		  
		   
		   //User Name
		   driver.findElement(By.xpath("//input[@id='userName']")).clear();
		   Thread.sleep(2000);
		  
		   //Uesr Name
		   driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Admin");
		   Thread.sleep(2000);
		   
		  //First Name
		   driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Roopa");
		   Thread.sleep(2000);
		  
		  
		  //Last name
		   driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Dasare");
		   Thread.sleep(2000);
		  
		 // email
		   driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz@gmail.com");
		   Thread.sleep(2000);
		  
		  //Language
		   driver.findElement(By.xpath("//select[@id='language']")).sendKeys("English");
		   Thread.sleep(2000);
		  
		  //Organisation
		   driver.findElement(By.xpath("//a[contains(text(),'Choose Organizations')]")).click();
		   Thread.sleep(2000);
		   
		   //Add
		   driver.findElement(By.xpath("//tbody[1]//tr[1]//td[5]//button[1]")).click();
		   Thread.sleep(2000);
		   
		   //Institutional role
		   driver.findElement(By.xpath("//a[contains(text(),'Choose Institutional Roles')]")).click();
		   Thread.sleep(2000);
		   
		   //Add
		   driver.findElement(By.xpath("//div[@class='modal fade bd-example-modal-xl show']//tbody[1]//tr[1]//td[3]//button[1]")).click();
		   Thread.sleep(2000);
		   
		   
		   //System role
		   driver.findElement(By.xpath("//a[contains(text(),'Choose System Roles')]")).click();
		   Thread.sleep(2000);
		   
		   //Add
		   driver.findElement(By.xpath("//div[@class='modal fade bd-example-modal-xl2 show']//tbody[1]//tr[1]//td[3]//button[1]")).click();
		   Thread.sleep(2000);
		   
		   
		   //Password
		   driver.findElement(By.xpath("//input[@id='password']")).clear();
		   Thread.sleep(2000);
		   
		   //Password
		   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin");
		   Thread.sleep(2000);
		   
		   //Effective date
		   driver.findElement(By.xpath("//input[@id='startDate']")).sendKeys("07/05/2019");
		   Thread.sleep(2000);
		   
		   //end date
		   driver.findElement(By.xpath("//input[@id='endDate']")).sendKeys("08/31/2019");
		   Thread.sleep(2000);
		   
		   //Mobile
		   driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9876543210");
		   Thread.sleep(2000);
		   
		   
		   //Fax
		   driver.findElement(By.xpath("//input[@id='fax']")).sendKeys("1234");
		   Thread.sleep(2000);
		   
		   //Street
		   driver.findElement(By.xpath("//textarea[@id='street']")).sendKeys("3rd cross");
		   Thread.sleep(2000);
		   
		   //City
		   driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Pune");
		   Thread.sleep(2000);
		   
		   //Country
		   driver.findElement(By.xpath("//select[@id='country']")).sendKeys("india");
		   Thread.sleep(2000);
		   
		   //State
		   driver.findElement(By.xpath("//select[@id='state']")).sendKeys("Karnataka");
		   Thread.sleep(2000);
		   
		   //Postal code
		   driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys("98000");
		   Thread.sleep(2000);
		   
		   //Submit
		   driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		   Thread.sleep(2000);
		  
		   
			//to accept the alert 
			driver.switchTo().alert().accept();
			 Thread.sleep(2000);
			 
			 
//View Users
			 
			 //Click on view users
			 driver.findElement(By.xpath("//a[contains(text(),'View User')]")).click();
			   Thread.sleep(2000);
			  
			 
			 //Click on Edit
			   driver.findElement(By.xpath("//tbody[1]//tr[1]//td[6]//button[1]")).click();
			   Thread.sleep(2000);
			  
			 
			 //First Name
			   driver.findElement(By.xpath("//input[@id='firstName']")).clear();
			   Thread.sleep(2000);
			 
			 
			 //First name
			   driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Pooja");
			   Thread.sleep(2000);
			 
			 
			//Last name
			   driver.findElement(By.xpath("//input[@id='lastName']")).clear();
			   Thread.sleep(2000);
			 
			 //Last name
			   driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kulkarni");
			   Thread.sleep(2000);
			 
             //Email
			   driver.findElement(By.xpath("//input[@id='email']")).clear();
			   Thread.sleep(2000);
			 
			 //Email
			   driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pqr@gmail.com");
			   Thread.sleep(2000); 
			 
		     //Submit
			   driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
			   Thread.sleep(2000); 
			    
				//to accept the alert 
				driver.switchTo().alert().accept();
				 Thread.sleep(2000);
			   
				//to accept the alert 
				driver.switchTo().alert().accept();
				 Thread.sleep(2000);
			   
//Search Users
				 
			   //Search users
			
			   driver.findElement(By.xpath("//a[contains(text(),'Search User')]")).click();
			   Thread.sleep(2000); 
			   
			   //Keyword
			   driver.findElement(By.xpath("//input[@id='keywords']")).sendKeys("Admin");
			   
			   Thread.sleep(2000); 
			   
			   //Search
	          driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
			   Thread.sleep(2000); 
			   
			   
			   
		return new AddUserpage();
		  
	  }
	


}
