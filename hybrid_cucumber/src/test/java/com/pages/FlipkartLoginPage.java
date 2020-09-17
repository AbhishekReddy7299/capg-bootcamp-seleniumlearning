package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.Library;

public class FlipkartLoginPage extends Library{
	public FlipkartLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="/html/body/div[2]/div")
	WebElement menu_loginButton;
	
	@FindBy(xpath="//div[@class='_1XBjg- row']//form//input[@type='text']")
	WebElement usernameText;
	
	@FindBy(xpath="//div[@class='_1XBjg- row']//form//input[@type='password']")
	WebElement passwordText;
	
	@FindBy(xpath = "//div[@class='_1XBjg- row']//form//button[@type='submit']")
	WebElement loginButton;
	
	public void LoginUser(String username, String password)
	{
		usernameText.sendKeys(username);
		passwordText.sendKeys(password);
		loginButton.click();
	}

}
