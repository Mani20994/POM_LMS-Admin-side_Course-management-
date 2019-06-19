package com.LMS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.LMS.Base.TestBase;


public class Loginpage extends TestBase {
	@FindBy(xpath="//input[@id='userName']")
	WebElement UserName ;

	@FindBy(xpath="//input[@id='password']")
	WebElement Password;

	@FindBy(xpath="//input[@class='btn btn-primary btn-block btn-lg']")
	WebElement loginbtn ;

	public Loginpage() {
		 PageFactory.initElements(driver, this); 
		 
		}

	public Homepage login(String usernm, String pwd) throws InterruptedException   {
		UserName.sendKeys(usernm);
		Thread.sleep(3000);
		Password.sendKeys(pwd);
		 Thread.sleep(3000);
		 loginbtn.click();
		 
		 return  new Homepage();
		 
		}
}
