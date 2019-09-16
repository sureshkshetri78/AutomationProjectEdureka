package com.edureka.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		//ldriver= rdriver;
		PageFactory.initElements(driver, this);
	}
@FindBy( xpath = "//*[@id=\"header-II\"]/section/nav/div/a[2]")
@CacheLookup
WebElement ClkLogIn;

@FindBy(xpath = "//*[@id=\'si_popup_email\']")
@CacheLookup
WebElement username;

@FindBy(id = "si_popup_passwd")
@CacheLookup
WebElement password;

@FindBy(xpath ="//*[@id=\'new_sign_up_mode\']/div/div/div[2]/div[3]/form/button")
@CacheLookup
WebElement btnLogin;

public void clickLog() {
	ClkLogIn.click();
}

public void setUsername(String uname)
{
	username.sendKeys(uname);
}
public void setPassword(String pwd)
{
	password.sendKeys(pwd);
}
public void clickSubmit()
{
	btnLogin.click();
}



}
