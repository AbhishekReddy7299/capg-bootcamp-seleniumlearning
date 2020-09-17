package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartLoginTest {
	WebDriver driver;
	
	@BeforeTest
		public void launchApp() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();	  
		driver.manage().window().maximize();
   	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
   	    driver.get("https://www.flipkart.com/");
	}
	@BeforeMethod
	public void loginIn() {
		driver.findElement(By.xpath("/html/body/div[2]/div")).click();
		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='text']")).sendKeys("9989689510");
		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='password']")).sendKeys("navb99pn");
		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//button[@type='submit']")).click();
	}
	@Test
	public void user() {
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("Samsung Mobiles"+Keys.ENTER); 
	}
	@AfterMethod
	public void closeApp() {
		System.out.println(driver.getTitle());
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
