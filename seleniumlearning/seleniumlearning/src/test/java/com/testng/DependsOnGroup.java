package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup {
	
	@Test(groups= {"smoke_testing","sanity_testing"})
	  public void login() {
		  System.out.println("TestCase1 : Login");
	  }
	  
	  @Test(groups= {"functional_testing","smoke_testing"})
	  public void search() {
		 // Assert.assertEquals("xyz", "abc");
		  System.out.println("TestCase2 : Search");
	  }
	  
	  @Test(groups= {"re_testing","smoke_testing"})
	  public void logout() {
		  System.out.println("TestCase3 : Logout");
	  }


}
