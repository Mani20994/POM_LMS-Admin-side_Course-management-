package com.LMS.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.LMS.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

	 public TestBase() {
	  
	try {
	 prop = new Properties();
	 FileInputStream ip = new FileInputStream("C:\\Users\\Nxt\\eclipse-workspace\\POM_LMS_Admin_side\\src\\main\\java\\com\\LMS\\config\\config.properties");
	prop.load(ip);

	} catch (FileNotFoundException e) {
	 e.printStackTrace();
	  
	} catch (IOException e) { 
	 e.printStackTrace();
	}
	   
	 }

	public static void initialization() {
	 String browserName = prop.getProperty("browser");
	 
	 if(browserName.equals("chrome")) {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	  driver=new ChromeDriver();
	 }else if (browserName.equalsIgnoreCase("firefox")) {
	  System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe "); 
	  driver=new FirefoxDriver();
	 }
	   
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	 
	 driver.get(prop.getProperty("url"));


	}
	 
	}

	