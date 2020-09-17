package com.seleniumtest;

import java.io.IOException;

public class FlipkartWrapper {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FlipkartWrapperMethods fwm = new FlipkartWrapperMethods();
		  
		  fwm.insertapp("https://www.flipkart.com/");
		  
		  fwm.enterbyxpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input", "9989689510");
		  
		  fwm.enterbyxpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input", "navb99pn");
		  
		  fwm.clickbyxpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button");
		  
		  fwm.searchbyxpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input", "Samsung s series");
		  
		  fwm.takesnap("src/test/resources/screenshots/flipkart.png");
		  
		  fwm.getdetailsoffirstmobilebyxpath("/html/body/div/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]");
		  
		  //fwm.closeapp();

	}

}
