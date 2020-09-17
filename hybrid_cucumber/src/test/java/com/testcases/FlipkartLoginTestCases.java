package com.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base_class.Library;
import com.pages.FlipkartLoginPage;
import com.selenium_reusablefunction.SeleniumUtility;

public class FlipkartLoginTestCases extends Library {
	FlipkartLoginPage lpage;
	SeleniumUtility seleniumUtil;

	@BeforeTest
	public void launchApp()
	{
		browserSetUp();
		logger.info("Browser launched");
	}
	
	@Test
	public void login() {
		lpage=new FlipkartLoginPage(driver);
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
