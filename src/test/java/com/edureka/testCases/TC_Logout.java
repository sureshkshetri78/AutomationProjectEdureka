package com.edureka.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.edureka.pageObjects.Logout;

public class TC_Logout extends BaseClass {
	
	@Test
	public void LogOut() {
		Logger.info("Test Logout Started");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Logout logOff = new Logout(driver);
		logOff.setToProfileIcon();
		Logger.info("Navigate to profile icon");
		logOff.setToLogout();
		Logger.info("Log out Successfully");
	}
	

	
	
}
