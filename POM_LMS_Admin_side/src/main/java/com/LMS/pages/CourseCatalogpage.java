package com.LMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import com.LMS.Base.TestBase;

public class CourseCatalogpage extends TestBase{
	
	 public void AddCourseCatalog() {
		  PageFactory.initElements(driver, this);
		}
	  
	
	 public CourseCatalogpage clickoncatalog() throws InterruptedException {
		 
		 
//Course Catalog
		 
		 //Click on Course catalog
		  driver.findElement(By.xpath("//span[contains(text(),'Course Catalog')]")).click();
		   Thread.sleep(2000);
		 
		 //Search course catalog
		   driver.findElement(By.xpath("//a[contains(text(),'Search Catalog')]")).click();
		   Thread.sleep(2000);
		 
		   //Keyword
		   driver.findElement(By.xpath("//input[@id='keyword']")).sendKeys("Networking");
		   Thread.sleep(2000);
		 
		   //Course code
		 
		   driver.findElement(By.xpath("//input[@id='code']")).sendKeys("66");
		   Thread.sleep(2000);
		 
		 //Discipline
		   driver.findElement(By.xpath("//select[@id='major']")).sendKeys("Discipline1");
		   Thread.sleep(2000);
		 
		 //Delivery method
		   driver.findElement(By.xpath("//select[@id='deliveryMethod']")).sendKeys("eLearning");
		   Thread.sleep(2000);
		 
		   //Status
		   driver.findElement(By.xpath("//div[@class='form-horizontal']//div[contains(@class,'col-sm-8')]//div[1]//label[1]")).click();
		   Thread.sleep(2000);
		 
		 //Apply filter
		   driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		   Thread.sleep(2000);
		 
		 
//View Catalog
		   
		   //Click on view catalog 
		   driver.findElement(By.xpath("//a[contains(text(),'View Catalog')]")).click();
		   Thread.sleep(2000);
		 
		 //Click on view details button
		   driver.findElement(By.xpath("//tbody[2]//tr[1]//td[6]//button[1]")).click();
		   Thread.sleep(2000);
		 

			JavascriptExecutor js=(JavascriptExecutor)driver;
			

			js.executeScript("window.scrollBy(0,2500)");
			System.out.println("scrolled Down");
			Thread.sleep(5000);
			
			js.executeScript("window.scrollBy(2500,-2500)");
			System.out.println("scrolled up");

		
		return new CourseCatalogpage();	
		
}
}