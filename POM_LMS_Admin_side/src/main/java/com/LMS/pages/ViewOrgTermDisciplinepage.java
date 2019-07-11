package com.LMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.LMS.Base.TestBase;

public class ViewOrgTermDisciplinepage extends TestBase {
	
	
	 public void ViewOrgTermDiscipline() {
		  PageFactory.initElements(driver, this);
		}
	  
	  
	  public ViewOrgTermDisciplinepage clickonorg() throws InterruptedException {
		  
		  
		  
 //View Organisation
		  
		    //Click on organisation
		   driver.findElement(By.xpath("//span[contains(text(),'Organization')]")).click();
		   Thread.sleep(2000);
						  
		  //Click on view organisation
		   driver.findElement(By.xpath("//a[contains(text(),'View Organisations')]")).click();
		   Thread.sleep(2000);
		  
		  //Click on edit
		   driver.findElement(By.xpath("//tbody[1]//tr[1]//td[5]//button[1]")).click();
		   Thread.sleep(2000);
		  
		   //Org Code
		   driver.findElement(By.xpath("//input[@id='orgCode']")).clear();
		   Thread.sleep(2000);
		  
		  //Org code
		   driver.findElement(By.xpath("//input[@id='orgCode']")).sendKeys("222");
		   Thread.sleep(2000);
		  
		   //Org name
		   driver.findElement(By.xpath("//input[@id='orgName']")).clear();
		   Thread.sleep(2000);
		  
		   //Org name
		   driver.findElement(By.xpath("//input[@id='orgName']")).sendKeys("MindsNXT1");
		   Thread.sleep(2000);
		  
		  
		   //submit
		   driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		   Thread.sleep(2000);
		  
		  
			//to accept the alert 
			driver.switchTo().alert().accept();
			 Thread.sleep(2000);
			 
		  
				//to accept the alert 
				driver.switchTo().alert().accept();
				 Thread.sleep(2000);
				  
		   
		   
//Search organization
		   
		   
		   //Clik on Search organization 
			driver.findElement(By.xpath("//a[contains(text(),'Search Organisations')]")).click();
			 Thread.sleep(2000);
		   
			 //Name 
			 driver.findElement(By.xpath("//input[@id='orgName']")).sendKeys("MindsNXT");
			 Thread.sleep(2000);
		   
			 //Code
			  driver.findElement(By.xpath("//input[@id='orgCode']")).sendKeys("111");
			  Thread.sleep(2000);
		   
			  //Type
			   driver.findElement(By.xpath("//select[@id='type']")).sendKeys("Business Unit");
			   Thread.sleep(2000);

			   //Search
				driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
				 Thread.sleep(2000);
			   
			   
			   
//View Term
				 
				 //Click on Course Support
				 driver.findElement(By.xpath("//span[contains(text(),'Course Support')]")).click();
				 Thread.sleep(2000);
			   
			   //View Term
				 
				 driver.findElement(By.xpath("//a[contains(text(),'View Term')]")).click();
				 Thread.sleep(2000);
			   
				 //Click on edit
				 driver.findElement(By.xpath("//tbody[1]//tr[1]//td[4]//button[1]")).click();
				 Thread.sleep(2000);
			   
				 //Name
				 driver.findElement(By.xpath("//input[@id='termName']")).clear();
				 Thread.sleep(2000);
			   
			   //Name
				 driver.findElement(By.xpath("//input[@id='termName']")).sendKeys("Term2");
				 Thread.sleep(2000);
			   
				 //Description
				 driver.findElement(By.xpath("//textarea[@id='termDescription']")).clear();
				 Thread.sleep(2000);
			   
				 //Description
				 driver.findElement(By.xpath("//textarea[@id='termDescription']")).sendKeys("It is Term2");
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
				 
				 
				 
//Search Term
				 
				 //Click on Search Term
				 
				 driver.findElement(By.xpath("//a[contains(text(),'Search Term')]")).click();
				 Thread.sleep(2000);
				 
				 //Name
				 driver.findElement(By.xpath("//input[@id='termName']")).sendKeys("Term1");
				 Thread.sleep(2000);
				 
				 //Start date
				 
				 driver.findElement(By.xpath("//input[@id='startDate']")).sendKeys("07-01-2019");
				 Thread.sleep(2000);
				  
				 //End Date
				 driver.findElement(By.xpath("//input[@id='endDate']")).sendKeys("08-31-2019");
				 Thread.sleep(2000);
				 
				 //Search
				 driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
				 Thread.sleep(2000);
				 
//View Discipline
				 
				 //Click on view discipline
				 driver.findElement(By.xpath("//a[contains(text(),'View Discipline')]")).click();
				 Thread.sleep(2000);
				 
				 //Click on edit
				 driver.findElement(By.xpath("//tbody[2]//tr[1]//td[4]//button[1]")).click();
				 Thread.sleep(2000);
				 
				 //Name
				 driver.findElement(By.xpath("//input[@id='name']")).clear();
				 Thread.sleep(2000);
				 
				 //Name
				 driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Discipline11");
				 Thread.sleep(2000);
				 
				 //Description
				 driver.findElement(By.xpath("//textarea[@id='description']")).clear();
				 Thread.sleep(2000);
				 

				 //Description
				 driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys(" It is Discipline11");
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
				 
//Search Discipline
				 
				 
				 //Click on search discipline
				 
				 driver.findElement(By.xpath("//a[contains(text(),'Search Discipline')]")).click();
				 Thread.sleep(2000);
				 
                //Name
				 driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Discipline1");
				 Thread.sleep(2000);
				 
				 //Status
				 driver.findElement(By.xpath("//div[contains(@class,'col-sm-8')]//div[1]//label[1]")).click();
				 Thread.sleep(2000);
				 
				 //Search 
				 driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
				 Thread.sleep(2000);
				 
				
		return new ViewOrgTermDisciplinepage();
	

	  }

}
