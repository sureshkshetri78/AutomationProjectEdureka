package com.edureka.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.edureka.pageObjects.ExploreCourse;

public class TC_SearchCourse extends BaseClass{
	
	@Test
	public void SearchCourse() throws Exception {
		Logger.info(" Test of Search course started");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ExploreCourse course = new ExploreCourse(driver);
		course.ClkCourse();
		Logger.info("click on course link");
		Thread.sleep(3000);
		course.SetCourseName(Coursename);
		Logger.info("search for selenium");
		Thread.sleep(3000);
		course.SearchBtn();
		Logger.info("click on search button");
		Thread.sleep(3000);
		course.AddToWishList();
		Logger.info("Course added to Wish List");
		
		if(driver.getTitle().equals("Instructor-Led Online Training with 24X7 Lifetime Support | Edureka")) {
			Assert.assertTrue(true);
			Logger.info("Test Searching Course Passed");
		}
		else {
			Assert.assertTrue(false);
			Logger.info("Test Searching course failed");
		}
	}

}
