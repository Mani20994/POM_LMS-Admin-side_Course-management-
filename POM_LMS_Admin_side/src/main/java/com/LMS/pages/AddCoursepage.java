package com.LMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.LMS.Base.TestBase;

public class AddCoursepage extends TestBase{
	
	  public void AddCourse() {
		  PageFactory.initElements(driver, this);
		}
	  
	  public AddCoursepage clickoncourse() throws InterruptedException {
		  
	  
	//click on course
		  driver.findElement(By.xpath("//nav[@id='sidebar']//li[3]//a[1]//span[1]")).click();
			Thread.sleep(2000);
	  
	//click on Addcourse
		driver.findElement(By.xpath("//a[contains(text(),'Add Course')]")).click();
		Thread.sleep(2000);
				
	//click on organization
		driver.findElement(By.xpath("//a[contains(text(),'Choose Organizations')]")).click();
		Thread.sleep(2000);
					
	//click on add button
		  driver.findElement(By.xpath("//button[@class='btn-primary']")).click();
		Thread.sleep(2000);
	
		
		//click on code
		  driver.findElement(By.xpath("//input[@id='code']")).sendKeys("CSE6");
		Thread.sleep(2000);
		
		//click on name
		  driver.findElement(By.xpath("//input[@id='name']")).sendKeys("General-Knowledge");
		Thread.sleep(2000);
		  
		//click on description
		  driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("Its General Knowledge sub");
		Thread.sleep(2000);
		  
		//click on Discipline
		  driver.findElement(By.xpath("//select[@id='major']")).sendKeys("Discipline1");
		Thread.sleep(2000);
		  
		//click on Delivery Method
		  driver.findElement(By.xpath("//select[@id='deliveryMethod']")).sendKeys("eLearning");
		Thread.sleep(2000);
		  
		//click on Content type
		  driver.findElement(By.xpath("//select[@id='contentType']")).sendKeys("Resource");
		Thread.sleep(2000);
		  
		
		//click on status
		driver.findElement(By.xpath("//div[15]//div[1]//div[1]//label[1]")).click();
		Thread.sleep(2000);
		  
		//click on Language
		  driver.findElement(By.xpath("//select[@id='language']")).sendKeys("English");
		Thread.sleep(2000);
		
		//click on course display date
		  driver.findElement(By.xpath("//input[@id='courseDisplayDate']")).sendKeys("06/13/2019");
		Thread.sleep(2000);
		
		
		//click on enrollment open date
		  driver.findElement(By.xpath("//input[@id='enrollmentOpenDate']")).sendKeys("06/13/2019");
		Thread.sleep(2000);
		  
		
		//click on enrollment close date 
		  driver.findElement(By.xpath("//input[@id='enrollmentCloseDate']")).sendKeys("07/31/2019");
		Thread.sleep(2000);
		  
		//click on Course hide date
		  driver.findElement(By.xpath("//input[@id='courseHideDate']")).sendKeys("07/31/2019");
		Thread.sleep(2000);
		  
		
		//click on days to complete
		  driver.findElement(By.xpath("//input[@id='daysStdToCompl']")).sendKeys("5");
		Thread.sleep(2000);
		  
		
		
		//click on days before to complete
		  driver.findElement(By.xpath("//input[@id='daysBeforeStdToCompl']")).sendKeys("5");
		Thread.sleep(2000);
		  
		
		//click on expire days
		  driver.findElement(By.xpath("//input[@id='expireDays']")).sendKeys("5");
		Thread.sleep(2000);
		  
		//click on enrollment restriction
		  driver.findElement(By.xpath("//select[@id='enrollmentRestriction']")).sendKeys("Once only");
		Thread.sleep(2000);
		  
		//click on instructional Language
		  driver.findElement(By.xpath("//select[@id='instructionalLanguages']")).sendKeys("English");
		Thread.sleep(2000);
		  
		  
		//click on version
		  driver.findElement(By.xpath("//input[@id='version']")).sendKeys("1.0");
		Thread.sleep(2000);
		
		
		//click on submit
		  driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(2000);
		
		//to accept the alert 
		driver.switchTo().alert().accept();
		 Thread.sleep(2000);
			
		
		// click on View Course
	    driver.findElement(By.xpath("//a[contains(text(),'View Course')]")).click();
	    Thread.sleep(2000);
			
	//click on edit button
		driver.findElement(By.xpath("//tbody[3]//tr[1]//td[6]//button[1]")).click();
		Thread.sleep(2000);
			
		//click on code(edit code value)
		driver.findElement(By.xpath("//input[@id='code']")).clear();
		Thread.sleep(2000);
		
		
	//click on code(edit code value)
		driver.findElement(By.xpath("//input[@id='code']")).sendKeys("CSE7");
		Thread.sleep(3000);
		
	//click on name(clear name value)
	   driver.findElement(By.xpath("//input[@id='name']")).clear();
		Thread.sleep(2000);
				
		//click on name(clear name value)
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Software Testing");
			Thread.sleep(2000);
		

	//click on submit
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(2000);
			
	//click on alert to accept
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		//Click on search course
		 driver.findElement(By.xpath("//a[contains(text(),'Search Courses')]")).click();
			Thread.sleep(2000);
			
			//click keyword
			driver.findElement(By.xpath("//input[@id='keyword']")).sendKeys("Networking");
			Thread.sleep(2000);
		
			//click on course code
			driver.findElement(By.xpath("//input[@id='code']")).sendKeys("66");
			Thread.sleep(2000);
			
			//click on discipline
			driver.findElement(By.xpath("//select[@id='major']")).sendKeys("Discipline1");
			Thread.sleep(2000);
			
			//click on deleivery method
			driver.findElement(By.xpath("//select[@id='deliveryMethod']")).sendKeys("eLearning");
			Thread.sleep(2000);
			
			//click on status
			driver.findElement(By.xpath("//div[@class='form-horizontal']//div[contains(@class,'col-sm-8')]//div[1]//label[1]")).click();
			Thread.sleep(2000);
			
			//click on apply filter button
			driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
			Thread.sleep(2000);
			
//			
//			driver.findElement(By.xpath("")).click();
//			Thread.sleep(2000);
//			
		return new AddCoursepage();
				
	  }
	  
}
