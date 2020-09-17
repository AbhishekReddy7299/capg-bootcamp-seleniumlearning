package com.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base_class.Library;
import com.pages.OrangeHRMLoginpage;
import com.selenium_reusablefunction.SeleniumUtility;

public class OrangeHRMLoginTestCases extends Library{
	OrangeHRMLoginpage lpage;
	SeleniumUtility seleniumUtil;
	
//	@BeforeTest
//	public void launchApp()
//	{
//		launchApplication("chrome", "https://opensource-demo.orangehrmlive.com/");
//	}
//	
//	@Test
//	public void login() {
//		lpage=new OrangeHRMLoginpage(driver);
//		lpage.LoginUser("Admin", "admin123");
//	}
//	
//	
//	@AfterTest
//	public void close() {
//		
//		seleniumUtil = new SeleniumUtility(driver);   
//		seleniumUtil.getTitle();
//		seleniumUtil.to_take_screenshot("loginPage");
//		quit();
//	}
	@BeforeTest
	public void launchApp()
	{
		browserSetUp();
		logger.info("Browser launched");
		//launchApplication("chrome", "https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void login() {
		lpage=new OrangeHRMLoginpage(driver);
		lpage.LoginUser(properties.getProperty("username"),properties.getProperty("password"));
	    logger.info("Browser login successfully");
	}
	
	
	
	@AfterTest
	public void close() {
		
		seleniumUtil = new SeleniumUtility(driver);   
		seleniumUtil.getTitle();
		seleniumUtil.to_take_screenshot("loginPage");
		tearDown();
		logger.info("Closing Browser");
	}
	

}
