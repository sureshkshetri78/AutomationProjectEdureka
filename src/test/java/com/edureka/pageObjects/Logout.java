package com.edureka.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Logout {

	
	public Logout(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"footauto\"]/app-root/app-profile-main/app-header/header/nav/div/div[3]/ul/li[6]/div/button")
	@CacheLookup
	WebElement ClkProfileIcon;
	
	@FindBy(xpath = "//*[@id=\"footauto\"]/app-root/app-profile-main/app-header/header/nav/div/div[3]/ul/li[6]/div/ul/li[10]/a")
	@CacheLookup
	WebElement ClkLogout;
	
	public void setToProfileIcon() {
		ClkProfileIcon.click();
	}
	public void setToLogout() {
		ClkLogout.click();
	}
}
