package com.LMS.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LMS.Base.TestBase;
import com.LMS.pages.Homepage;
import com.LMS.pages.Loginpage;
import com.LMS.util.TestUtil;



public class LoginpageTest extends TestBase {
	
	Loginpage loginpage;
	  Homepage homepage;
	  TestUtil testutil;
		public LoginpageTest() {
		 super();
		}

		 @BeforeMethod
		public void setUp() {
		   initialization();
		 loginpage = new Loginpage();
		 homepage = new Homepage();
		 testutil = new TestUtil();
		}
	
		 @Test(priority=1)
		 public void loginTest() throws InterruptedException {
		 homepage= loginpage.login(prop.getProperty("UserName"), prop.getProperty("Password"));
		 }
}
