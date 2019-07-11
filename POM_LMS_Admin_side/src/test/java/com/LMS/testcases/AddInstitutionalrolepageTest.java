package com.LMS.testcases;

import org.testng.annotations.Test;

import com.LMS.Base.TestBase;
import com.LMS.pages.AddInstitutionalrolepage;
import com.LMS.pages.Homepage;
import com.LMS.pages.Loginpage;

public class AddInstitutionalrolepageTest  extends TestBase{
	Loginpage loginpage;
	  Homepage homepage;
	AddInstitutionalrolepage addinstitutionalrolepage;
	

	 public AddInstitutionalrolepageTest () {
		 
		 super();
		}
	
	
	 @Test(priority=1)
		public void clickoncourse() throws InterruptedException {
		  initialization();
		    loginpage= new Loginpage();
		    homepage = new Homepage();
		    addinstitutionalrolepage= new AddInstitutionalrolepage ();
			
	 	  homepage= loginpage.login(prop.getProperty("UserName"), prop.getProperty("Password"));
	 	 Thread.sleep(2000);
	 	 
	 	addinstitutionalrolepage.clickonInstitutionalrole();
		  driver.quit();
	 }

}
