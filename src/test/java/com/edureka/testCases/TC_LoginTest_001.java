package com.edureka.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.edureka.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	@Test
	public void loginTest() throws Exception {
		//driver.get(baseURL);
		Logger.info("URL is opened");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		LoginPage lp = new LoginPage(driver);
		lp.clickLog();
		lp.setUsername(Username);
		//Thread.sleep(3000);
		Logger.info("Entered username");
		
		lp.setPassword(Password);
		Logger.info("Entered Password");
		lp.clickSubmit();
		Thread.sleep(3000);
		
		if(driver.getTitle().equals("Instructor-Led Online Training with 24X7 Lifetime Support | Edureka")) {
			Assert.assertTrue(true);
			Logger.info("login test passed");
			}
		else
		{
			Assert.assertTrue(false);
			Logger.info("login test failed");
		}
	}
	
}
