package com.edureka.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.edureka.Utilities.ReadConfig;


public class BaseClass {
	ReadConfig readconfig = new ReadConfig();
	
	 public String baseURL= readconfig.getApplicationURL();
	 public String Username = readconfig.getUsername();
	 public String Password = readconfig.getPassword();
	 public String Coursename= readconfig.getCoursename();
	 public String Name = readconfig.getEditName();
	 public String Role = readconfig.getCurrentRole();
	 public String CompanyName = readconfig.getCompanyName();
	public static WebDriver driver;
	public static Logger Logger;
	
	@Parameters("browser")
	@BeforeTest
	public void setup(String br) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//Drivers//chromedriver.exe");
		
		Logger =Logger.getLogger("edureka");
		PropertyConfigurator.configure("log4j.properties");
		if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
		driver = new ChromeDriver();
		}
		
		else if (br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readconfig.getFirefox());
			driver = new FirefoxDriver();	
		}
		else if (br.equals("ie")) {
			System.setProperty("webdriver.ie.driver", readconfig.getIePath());
			driver = new InternetExplorerDriver();
		}
		driver.get(baseURL);
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
