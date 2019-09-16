package com.edureka.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.edureka.pageObjects.CoursesTaken;

public class TC_CourseTaken extends BaseClass{
	
	@Test
	public void CourseTaken() throws Exception {
		Logger.info("Testing Course Taken");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		CoursesTaken taken = new CoursesTaken(driver);
		taken.profile();
		Logger.info("click on profile page");
		Thread.sleep(3000);
		taken.myorder();
		Logger.info("Click on myorder");
		
		
		if(driver.getTitle().equals("My Profile | Edureka")) {
			
			Assert.assertTrue(true);
			Logger.info("Course Taken test Passed");
		}
		else {
			Assert.assertTrue(false);
			Logger.info("Course Taken Test Faileds");
		}
		
	}
	}

