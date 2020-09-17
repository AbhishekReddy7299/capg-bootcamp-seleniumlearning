package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Parameterized_Dataprovider {
WebDriver driver;
	
	@Test(dataProvider="Amazonlogin")
	public void loginToAmazon(String username,String password) throws Exception {
		
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();       
	
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[1]/input[1]")).sendKeys(username+Keys.ENTER);
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div/form/div/div[1]/input")).sendKeys(password+Keys.ENTER);
	Thread.sleep(2000);
	//driver.findElement(By.id("btnLogin")).click();
	
	Assert.assertEquals("https://www.amazon.in/?ref_=nav_ya_signin&",driver.getCurrentUrl());
	System.out.println(driver.getCurrentUrl());
	System.out.println("User is able to login sucessfully");
	
	}

	@DataProvider(name="Amazonlogin")
	public Object[][] passData() {

	Object[][] data=new Object[3][2];
	 		//username
			data[0][0]="frank";
			//password
			data[0][1]="demo1";

			data[1][0]="joshi";
			data[1][1]="demo123";

			data[2][0]="9989689510";
			data[2][1]="navb99pn@sunny";

			return data;

	}
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}

}
