package com.LMS.testcases;

import org.testng.annotations.Test;

import com.LMS.Base.TestBase;
import com.LMS.pages.Homepage;
import com.LMS.pages.Loginpage;
import com.LMS.pages.ViewOrgTermDisciplinepage;

public class ViewOrgTermDisciplinepageTest  extends TestBase{
	
	Loginpage loginpage;
	  Homepage homepage;
	
	  ViewOrgTermDisciplinepage vieworgtermdisciplinepage;
	  
	
	  public ViewOrgTermDisciplinepageTest () {
			 super();
			}
	  
	  
	  @Test(priority=1)
			public void clickoncourse() throws InterruptedException {
			  initialization();
			    loginpage= new Loginpage();
			    homepage = new Homepage();
			    vieworgtermdisciplinepage= new ViewOrgTermDisciplinepage();
				
		 	  homepage= loginpage.login(prop.getProperty("UserName"), prop.getProperty("Password"));
		 	 Thread.sleep(2000);
		 	 
		 	vieworgtermdisciplinepage.clickonorg();
			  driver.quit();
		  }
 

}
