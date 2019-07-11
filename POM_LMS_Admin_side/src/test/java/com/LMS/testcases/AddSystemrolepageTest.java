package com.LMS.testcases;

import org.testng.annotations.Test;

import com.LMS.Base.TestBase;
import com.LMS.pages.AddSystemrolepage;
import com.LMS.pages.Homepage;
import com.LMS.pages.Loginpage;

public class AddSystemrolepageTest extends TestBase{
	
	Loginpage loginpage;
	  Homepage homepage;
	  AddSystemrolepage addsystemrolepage;
	
	  public AddSystemrolepageTest () {
			 
			 super();
			}
		
	  @Test(priority=1)
		public void clickoncourse() throws InterruptedException {
		  initialization();
		    loginpage= new Loginpage();
		    homepage = new Homepage();
		    addsystemrolepage= new AddSystemrolepage ();
			
	 	  homepage= loginpage.login(prop.getProperty("UserName"), prop.getProperty("Password"));
	 	 Thread.sleep(2000);
	 	 
	 	addsystemrolepage.clickonSystemrole();
	driver.quit();
	 }

}
