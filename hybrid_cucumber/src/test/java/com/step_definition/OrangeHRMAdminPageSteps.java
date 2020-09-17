package com.step_definition;

import com.base_class.Library;
import com.pages.OrangeHRMAdminPage;
import com.selenium_reusablefunction.SeleniumUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMAdminPageSteps extends Library{
	OrangeHRMAdminPage orangeHrmAdminPage;
	SeleniumUtility seleniumUtility;
	
	@Given("To Open Admin functionlity of OrangeHrm")
	public void to_Open_Admin_functionlity_of_OrangeHrm() {
	   orangeHrmAdminPage = new OrangeHRMAdminPage(driver);
	   orangeHrmAdminPage.clickMenuAdmin();
	   logger.info("menu Admin button is clicked");
	}

	@When("To Enter {string}")
	public void to_Enter(String uName) {
	    orangeHrmAdminPage = new OrangeHRMAdminPage(driver);
		orangeHrmAdminPage.insertUserName(uName);
	    logger.info("Username is Entered");	
	}

	@Then("Select {string}")
	public void select(String uRole) {
	   orangeHrmAdminPage = new OrangeHRMAdminPage(driver);
	   orangeHrmAdminPage.selectUserType(uRole);
	   logger.info("Usertype is selected");
	}

	@Then("To Enter EmployeeName")
	public void to_Enter_EmployeeName() {
		orangeHrmAdminPage = new OrangeHRMAdminPage(driver);
		orangeHrmAdminPage.insertEmployeeName(properties.getProperty("adminEmployeeName"));
		logger.info("Employee Name is Entered");

	}

	@Then("Select Status")
	public void select_Status() {
		orangeHrmAdminPage = new OrangeHRMAdminPage(driver);
		orangeHrmAdminPage.selectStatus(properties.getProperty("adminStatus"));
		logger.info("Status is Selected");
	}

	@Then("Click Search Button")
	public void click_Search_Button() {
		orangeHrmAdminPage = new OrangeHRMAdminPage(driver);
		orangeHrmAdminPage.search();
	    logger.info("Search button is clicked");
	}

	@Then("Take the Screenshot and the Title")
	public void take_the_Screenshot_and_the_Title() {
		seleniumUtility = new SeleniumUtility(driver);
		seleniumUtility.to_take_screenshot("searchAdmin");
		seleniumUtility.getTitle();
		logger.info("Taken Screenshot Of Login Page And Title printed in console");
	}

	@Then("Close the browser")
	public void close_the_browser() {
		tearDown();
		logger.info("Browser is Closed");
	}

}
