package com.LMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.LMS.Base.TestBase;

public class AddCoursepage extends TestBase{
	
	  public void AddCourse() {
		  PageFactory.initElements(driver, this);
		}
	  
	  
	  public AddCoursepage clickoncourse() throws InterruptedException {
		  
	  
 //Add Organisation
		  
		  
	    //Click on organisation
	   driver.findElement(By.xpath("//span[contains(text(),'Organization')]")).click();
	   Thread.sleep(2000);
				
	  //Click on Add organisation
		driver.findElement(By.xpath("//a[contains(text(),'Add Organisations')]")).click();
		Thread.sleep(2000);
		  
       //Language
		driver.findElement(By.xpath("//select[@id='languagev']")).sendKeys("English");
		Thread.sleep(2000);
			
	 //Organisation code
			  
		driver.findElement(By.xpath("//input[@id='orgCode']")).sendKeys("111");
		Thread.sleep(2000);
		  
	 //Organisation Name
				  
	 driver.findElement(By.xpath("//input[@id='orgName']")).sendKeys("MindsNXT");
	Thread.sleep(2000);
		  
      //Effective date				  
      driver.findElement(By.xpath("//input[@id='startDate']")).sendKeys("06/27/2019");
	   Thread.sleep(2000);
		 
	 // Start date
		 driver.findElement(By.xpath("//input[@id='endDate']")).sendKeys("08/31/2019");
		Thread.sleep(2000);  
		  
		
		  //Type
		driver.findElement(By.xpath("//select[@id='type']")).sendKeys("Business Unit");
		Thread.sleep(2000);  
			  
		  //submit
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(5000);  
			  
		//to accept the alert 
		driver.switchTo().alert().accept();
		 Thread.sleep(2000);
		  
		  
//Add Term
		 
		 //Click on Course Support
		 driver.findElement(By.xpath("//span[contains(text(),'Course Support')]")).click();
		Thread.sleep(2000);  
			
		//Click on Add term
		
		driver.findElement(By.xpath("//a[contains(text(),'Add Term')]")).click();
		Thread.sleep(2000);  
			
		//Name
		driver.findElement(By.xpath("//input[@id='termName']")).sendKeys("Term1");
		Thread.sleep(2000);  
			
		//Description
		driver.findElement(By.xpath("//textarea[@id='termDescription']")).sendKeys("Its Term1");
		Thread.sleep(2000);  
			
		//Start Date
		driver.findElement(By.xpath("//input[@id='startDate']")).sendKeys("07/01/2019");
		Thread.sleep(2000);  
			
		//End date
		driver.findElement(By.xpath("//input[@id='endDate']")).sendKeys("08/31/2019");
		Thread.sleep(2000);  
			
		//submit
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(2000);  
			
		
		//to accept the alert 
		driver.switchTo().alert().accept();
		 Thread.sleep(2000);
		
		 
//Add Discipline

		 //Click on Add Discipline
			
		driver.findElement(By.xpath("//a[contains(text(),'Add Discipline')]")).click();
		Thread.sleep(2000);  

       
		//Choose organisation
		driver.findElement(By.xpath("//a[@class='small3']")).click();
		Thread.sleep(2000);  
		
		//Click on Add button
		driver.findElement(By.xpath("//tbody[1]//tr[1]//td[6]//button[1]")).click();
		Thread.sleep(2000);  
		
		//Add code
		driver.findElement(By.xpath("//input[@id='code']")).sendKeys("11");
		Thread.sleep(2000);
		
		//Add Language
		driver.findElement(By.xpath("//select[@id='language']")).sendKeys("English");
		Thread.sleep(2000);
		
		//Add Discipline name 
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Discipline1");
		Thread.sleep(2000);
		
		//Description
		driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("It is discipline");
		Thread.sleep(2000);
		
		//Ordinal
		driver.findElement(By.xpath("//input[@id='ordinal']")).sendKeys("10");
		Thread.sleep(2000);
		
		
		//Status
		driver.findElement(By.xpath("//div[contains(@class,'col-sm-8')]//div[1]//label[1]")).click();
		Thread.sleep(2000);
		
		
		//submit
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(2000);
		
		//to accept the alert 
		driver.switchTo().alert().accept();
		 Thread.sleep(2000);
		
//Add Content
		
		
		//Click on Content
		driver.findElement(By.xpath("//span[contains(text(),'Content')]")).click();
		Thread.sleep(2000);
		
		//Click on Add content
		driver.findElement(By.xpath("//a[contains(text(),'Add Content')]")).click();
		Thread.sleep(2000);
		
		//Click on Language
		driver.findElement(By.xpath("//select[@id='language']")).sendKeys("English");
		Thread.sleep(2000);
		
		//Click on Organisation 
		driver.findElement(By.xpath("//a[@class='small3']")).click();
		Thread.sleep(2000);
		
		
		//Click on Add button
		driver.findElement(By.xpath("//tbody[1]//tr[1]//td[6]//button[1]")).click();
		Thread.sleep(2000);
		
		//Name
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Content");
		Thread.sleep(2000);
		
		//Type
		driver.findElement(By.xpath("//select[@id='type']")).sendKeys("File");
		Thread.sleep(2000);
		
		//Description
		driver.findElement(By.xpath("//textarea[@id='discription']")).sendKeys("Content");
		Thread.sleep(2000);
		
		  //Start Date
		driver.findElement(By.xpath("//input[@id='startDate']")).sendKeys("06/28/2019");
		Thread.sleep(2000);
		
		
		//End Date 
		driver.findElement(By.xpath("//input[@id='endDate']")).sendKeys("08/29/2019");
		Thread.sleep(2000);
		
		//Status
		driver.findElement(By.xpath("//div[contains(@class,'col-sm-8')]//div[1]//label[1]")).click();
		Thread.sleep(2000);
		
		
		//Upload file 
		WebElement upload=driver.findElement(By.xpath("//input[@id='pic']"));
		upload.sendKeys("E:\\Flipkart Requirements (1).docx");
		Thread.sleep(5000);
		
		//Submit
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(2000);
		
		//to accept the alert 
		driver.switchTo().alert().accept();
		 Thread.sleep(2000);
		 
		
//View Content
		 
		 //Click on View Content
		 
			driver.findElement(By.xpath("//a[contains(text(),'View Content')]")).click();
			Thread.sleep(2000);
		 
			//Click on edit
			driver.findElement(By.xpath("//tbody[1]//tr[1]//td[4]//button[1]")).click();
			Thread.sleep(2000);
		 
			//Name
			driver.findElement(By.xpath("//input[@id='name']")).clear();
			Thread.sleep(2000);
		 
			//Name
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Content1");
			Thread.sleep(2000);
		 
		 //Description
			driver.findElement(By.xpath("//textarea[@id='discription']")).clear();
			Thread.sleep(2000);
		 
			//Description
			driver.findElement(By.xpath("//textarea[@id='discription']")).sendKeys("Content1");
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
			
		
//Search Content
			 
			 //Click on search content
			 driver.findElement(By.xpath("//a[contains(text(),'Search Content')]")).click();
				Thread.sleep(2000);
			
				//Content Name
				driver.findElement(By.xpath("//input[@id='contentName']")).sendKeys("Content");
				Thread.sleep(2000);
		 
				//Status
				 driver.findElement(By.xpath("//div[contains(@class,'col-sm-8')]//div[1]//label[1]")).click();
				Thread.sleep(2000);
				
				//Type
				driver.findElement(By.xpath("//select[@id='type']")).sendKeys("File");
				Thread.sleep(2000);
				
				//Search 
				 driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
				 Thread.sleep(2000);
				
				
		
//Add category
		 //Click on Add Category
		 
			driver.findElement(By.xpath("//a[contains(text(),'Add Categories')]")).click();
			Thread.sleep(2000);
		 
		 //Language
			driver.findElement(By.xpath("//select[@id='language']")).sendKeys("English");
			Thread.sleep(2000);
		 
			//LMS
			driver.findElement(By.xpath("//input[@id='lms']")).sendKeys("MindsNXT");
			Thread.sleep(2000);
		 
		 //Name
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Cate-2");
			Thread.sleep(2000);
		 
			//Description
			driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("It is cate-2");
			Thread.sleep(2000);
		 
		 //Start date 
			driver.findElement(By.xpath("//input[@id='startDate']")).sendKeys("07/09/2019");
			Thread.sleep(2000);
		 
		 //End date 
			driver.findElement(By.xpath("//input[@id='endDate']")).sendKeys("08/31/2019");
			Thread.sleep(2000);
		 
			//Searchable 
			driver.findElement(By.xpath("//div[@class='col-sm-8 form-inline']//div[1]//label[1]")).click();
			Thread.sleep(2000);
		 
		 //Status
			driver.findElement(By.xpath("//div[8]//div[1]//div[1]//label[1]")).click();
			Thread.sleep(2000);
		 
		//Choose content
			driver.findElement(By.xpath("//a[@class='small3']")).click();
			Thread.sleep(2000);
		 
			driver.findElement(By.xpath("//tbody[1]//tr[1]//td[4]//button[1]")).click();
			Thread.sleep(2000); 
		 
          //Submit
			driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
			Thread.sleep(2000); 
		 
			//to accept the alert 
			driver.switchTo().alert().accept();
			 Thread.sleep(2000);
			 
			 
//View Categories
			 
			 //Click on view categories
			 
			 driver.findElement(By.xpath("//a[contains(text(),'View Categories')]")).click();
				Thread.sleep(2000); 
			   
			     //Click on edit
				 driver.findElement(By.xpath("//tbody[1]//tr[1]//td[5]//button[1]")).click();
				Thread.sleep(2000); 
			 
				  //LMS
				driver.findElement(By.xpath("//input[@id='lms']")).clear();
				Thread.sleep(2000); 
				
			     //LMS
				driver.findElement(By.xpath("//input[@id='lms']")).sendKeys("MindsNXT");
				Thread.sleep(2000); 
				
				//Name
				driver.findElement(By.xpath("//input[@id='name']")).clear();
				Thread.sleep(2000); 
			 
				//Name
				driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Cate-11");
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
						 
				
//Search Categories
				
			//Click on search cateegories
			 driver.findElement(By.xpath("//a[contains(text(),'Search Categories')]")).click();
			Thread.sleep(2000); 	 
						 
			//Name
			 driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Cate-2");
				Thread.sleep(2000); 
						 
			//Searchable		 
						 
			driver.findElement(By.xpath("//div[@class='ibox-body']//div[2]//div[1]//div[1]//label[1]")).click();
			Thread.sleep(2000); 		 
						
			//Status
			 driver.findElement(By.xpath("//div[3]//div[1]//div[1]//label[1]")).click();
			Thread.sleep(2000); 	 
					 
			//Search button
		
			driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
			Thread.sleep(2000); 	 
						 
				 
		 
//Add Course
		
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
		
		return new AddCoursepage();
				
	  }  
}
