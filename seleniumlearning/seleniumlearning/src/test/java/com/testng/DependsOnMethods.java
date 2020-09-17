package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test
	  public void login() {
		  System.out.println("TestCase1 : Login");
	  }
	  
	  @Test(dependsOnMethods="login")
	  public void search() {
		  Assert.assertEquals("xyz", "abc");
		  System.out.println("TestCase2 : Search");
	  }
	  
	  @Test(dependsOnMethods="search",alwaysRun=true)
	  public void logout() {
		  System.out.println("TestCase3 : Logout");
	  }

}
