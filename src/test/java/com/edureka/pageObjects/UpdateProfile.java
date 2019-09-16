package com.edureka.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateProfile {
	public UpdateProfile(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"footauto\"]/app-root/app-profile-main/div/div/div[1]/app-profile-leftnav-pro/div/ul/li[1]/a")
	@CacheLookup
	WebElement NavigateToProfile;
	
	@FindBy(xpath="//*[@id=\"professional_details\"]")
	@CacheLookup
	WebElement ClkEditProfile;
	
	@FindBy(xpath = "//*[@id=\"collapseOne\"]/div/div/form/div[1]/input")
	@CacheLookup
	WebElement EditName;
	
	@FindBy(xpath = "//*[@id=\"collapseOne\"]/div/div/form/div[4]/input")
	@CacheLookup
	WebElement CurrentRole;
	
	
	@FindBy(xpath = "//*[@id=\"collapseOne\"]/div/div/form/button")
	WebElement VerifyContinue;
	
	@FindBy(xpath = "//*[@id=\"onboarding\"]/div/div[1]/div[1]/app-onboarding-leftnav/ul/li[4]/a")
	@CacheLookup
	WebElement ProfessionalDetails;
	
	@FindBy(xpath = "//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-professional-details/accordion/accordion-group/div/div[2]/div/form/div[1]/input")
	@CacheLookup
	WebElement CompanyName;
	
	@FindBy(xpath = "//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-professional-details/accordion/accordion-group/div/div[2]/div/form/div[2]/select/option[5]")
	@CacheLookup
	WebElement CurrentJobLevel;
	
	@FindBy(xpath = "//*[@id=\"onboarding\"]/div/div[1]/div[1]/app-onboarding-leftnav/ul/li[1]/a[1]/i")
	@CacheLookup
	WebElement GoBack;
	
	public void NavToProfile() {
		NavigateToProfile.click();
	}
	public void EditProfile() {
		ClkEditProfile.click();
	}
	public void setName(String name) throws Exception {
		EditName.clear();
		EditName.sendKeys(name);
		Thread.sleep(3000);
	}
	
	public void setRole(String role) throws Exception {
		CurrentRole.clear();
		CurrentRole.sendKeys(role);
		Thread.sleep(3000);
	}
	public void ClkVerifyContinue() throws Exception {
		VerifyContinue.click();
		Thread.sleep(3000);
	}
	public void goback() {
		GoBack.click();
	}
	public void ClkProfessionalDetails() {
		ProfessionalDetails.click();
	}
	public void setCompanyName(String Company) {
		CompanyName.clear();
		CompanyName.sendKeys(Company);
	}
	
	public void setJobLevel() {
		CurrentJobLevel.click();
	}
	
}
