package com.LMS.testcases;

import org.testng.annotations.Test;

import com.LMS.Base.TestBase;
import com.LMS.pages.CourseCatalogpage;
import com.LMS.pages.Homepage;
import com.LMS.pages.Loginpage;

public class CourseCatalogpageTest extends TestBase {
	Loginpage loginpage;
	  Homepage homepage;
	  CourseCatalogpage coursecatalogpage;
		
	  public CourseCatalogpageTest () {
		  
			 super();
			}
	  
	 
	  @Test(priority=1)
		public void clickoncourse() throws InterruptedException {
		  initialization();
		    loginpage= new Loginpage();
		    homepage = new Homepage();
		    coursecatalogpage= new CourseCatalogpage();
			
	 	  homepage= loginpage.login(prop.getProperty("UserName"), prop.getProperty("Password"));
	 	 Thread.sleep(2000);
	 	 
	 	coursecatalogpage.clickoncatalog();
		  driver.quit();
	  }
}
