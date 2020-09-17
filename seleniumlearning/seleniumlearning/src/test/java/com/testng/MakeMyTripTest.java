package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTripTest {
WebDriver driver;
	
	@BeforeTest
		public void launchApp() {
		WebDriverManager.edgedriver().setup();
		driver = new ChromeDriver();	  
		driver.manage().window().maximize();
   	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
   	    driver.get("https://www.makemytrip.com/");
	}
	@BeforeMethod
	public void flightSearch() {
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div/div/nav/ul/li[1]/a/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")).sendKeys("Montreal");
		driver.findElement(By.xpath("//*[@id=\"PROMOTIONS\"]/div/div/div/div/div[3]/div/div/div[1]/img")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/p/a")).click();
	}
	@Test
	public void booking() {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/div[2]/div[3]/div/div[3]/div[1]/div[1]/div/div/div/div[4]/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/div[2]/div[3]/div/div[3]/div[3]/div[1]/div[2]/div[2]/div[2]/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div[3]/div/div/div[3]/label[2]/span[2]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[1]/div[6]/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/form/div[4]/div/div/div[1]/div/div/div/div/div[1]")).sendKeys("India");
		driver.findElement(By.xpath("//*[@id=\"Mobile No\"]/div/input")).sendKeys("9989689510");
		driver.findElement(By.xpath("//*[@id=\"Email\"]/div/input")).sendKeys("abhisunny7299@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"wrapper_ADULT\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"MANUAL_304804cc-c75b-4b85-95c9-27c9a7737752\"]/div[2]/div/div/div[1]/div/input")).sendKeys("Abhishek");
		driver.findElement(By.xpath("//*[@id=\"MANUAL_304804cc-c75b-4b85-95c9-27c9a7737752\"]/div[2]/div/div/div[2]/div/input")).sendKeys("Reddy");
		driver.findElement(By.xpath("//*[@id=\"MANUAL_304804cc-c75b-4b85-95c9-27c9a7737752\"]/div[2]/div/div/div[3]/div/div/label[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[5]/div[2]/p[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div[2]/div/div/div[2]/div/div[19]/div[8]/div/div/p")).click();
		driver.findElement(By.xpath("//*[@id=\"ancillary-continue\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[4]/div[2]/div[2]/div/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/p[3]/a]")).click();
		Assert.assertEquals("https://www.makemytrip.com/",driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl());
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
