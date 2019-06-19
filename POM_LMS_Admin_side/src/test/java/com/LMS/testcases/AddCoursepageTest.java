package com.LMS.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LMS.Base.TestBase;
import com.LMS.pages.AddCoursepage;
import com.LMS.pages.Homepage;
import com.LMS.pages.Loginpage;



public class AddCoursepageTest extends TestBase {
	Loginpage loginpage;
	  Homepage homepage;
	AddCoursepage  addcoursepage;
	
	
	  public AddCoursepageTest () {
			 super();
			}
//	  @BeforeMethod
//		 public void setUp() throws InterruptedException {
//		    initialization();
//		    loginpage= new Loginpage();
//		    homepage = new Homepage();
//			addcoursepage= new AddCoursepage();
//			 homepage= loginpage.login(prop.getProperty("UserName"), prop.getProperty("Password"));
//	  }
		    

	  
	  @Test(priority=1)
		public void clickoncourse() throws InterruptedException {
		  initialization();
		    loginpage= new Loginpage();
		    homepage = new Homepage();
			addcoursepage= new AddCoursepage();
			
	 	  homepage= loginpage.login(prop.getProperty("UserName"), prop.getProperty("Password"));
	 	 Thread.sleep(2000);
	 	 
	 	addcoursepage.clickoncourse();
		  driver.quit();
	  }
	
}
