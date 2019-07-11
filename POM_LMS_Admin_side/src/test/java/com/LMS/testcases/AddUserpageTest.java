package com.LMS.testcases;

import org.testng.annotations.Test;

import com.LMS.Base.TestBase;
import com.LMS.pages.AddUserpage;
import com.LMS.pages.Homepage;
import com.LMS.pages.Loginpage;

public class AddUserpageTest extends TestBase {
	
	Loginpage loginpage;
	  Homepage homepage;
	  AddUserpage adduserpage;
	
	
	  public AddUserpageTest() {
			 
			 super();
			}
		
		
	  @Test(priority=1)
		public void clickoncourse() throws InterruptedException {
		  initialization();
		    loginpage= new Loginpage();
		    homepage = new Homepage();
		    adduserpage= new AddUserpage ();
			
	 	  homepage= loginpage.login(prop.getProperty("UserName"), prop.getProperty("Password"));
	 	 Thread.sleep(2000);
	 	 
	 	adduserpage.clickonuserpage();
		  driver.quit();
	 }


}
