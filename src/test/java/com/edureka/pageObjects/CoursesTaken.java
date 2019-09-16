package com.edureka.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursesTaken {
	public CoursesTaken(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/a")
	@CacheLookup
	WebElement ClkProfile;
	@FindBy(xpath = "//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/ul/li[2]/a")
	@CacheLookup
	WebElement ClkMyOrder;
	
	public void profile() {
		ClkProfile.click();
	}
	
	public void myorder() {
		ClkMyOrder.click();
	}
	
}
