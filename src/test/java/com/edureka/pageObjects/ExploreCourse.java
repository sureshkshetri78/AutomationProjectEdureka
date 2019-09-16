package com.edureka.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExploreCourse {
WebDriver driver;
public ExploreCourse(WebDriver driver) {
	// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
}

@FindBy( xpath = "//*[@id=\"navbar\"]/ul/li[3]/a")
@CacheLookup
WebElement Course;

@FindBy( xpath = "//*[@id=\"search-inp\"]")
@CacheLookup
WebElement TypeCourseName;

@FindBy(xpath = "//*[@id=\"remote\"]/span[2]")
@CacheLookup
WebElement ClkOnSearch;

@FindBy(xpath = "//*[@id=\"d_wishlist-icon-814\"]")
@CacheLookup
WebElement AddtoCart;

public void ClkCourse() {
	Course.click();
}
public void SetCourseName(String Coursename) {
	TypeCourseName.sendKeys(Coursename);
}
public void SearchBtn() {
	ClkOnSearch.click();
}
public void AddToWishList() {
	AddtoCart.click();
}

}
