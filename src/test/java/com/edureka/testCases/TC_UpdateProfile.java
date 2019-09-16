package com.edureka.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.edureka.pageObjects.UpdateProfile;

public class TC_UpdateProfile extends BaseClass {
	@Test
	public void editProfile() throws Exception {
	Logger.info("Testing updating profile started");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	UpdateProfile edit = new UpdateProfile(driver);
	edit.NavToProfile();
	Logger.info("Navigate to profile");
	Thread.sleep(3000);
	edit.EditProfile();
	Logger.info("Click on edit profile");
	Thread.sleep(3000);
	
	edit.setName(Name);
	Logger.info("Edit name");
	Thread.sleep(3000);
	edit.setRole(Role);
	Logger.info("Edit current role");
	Thread.sleep(3000);
	edit.ClkVerifyContinue();
	Logger.info("Verify and continue");
	edit.goback();
	
	//driver.navigate().back();
	Logger.info("Back to previous page");
	
	
	//edit.ClkProfessionalDetails();
//	Logger.info("Click on professional details");
//	edit.setCompanyName(CompanyName);
//	Logger.info("update company name");
//	edit.setJobLevel();
//	Logger.info("Current job level is entry level");
	
	
	
	}
}
