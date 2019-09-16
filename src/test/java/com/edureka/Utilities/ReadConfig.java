package com.edureka.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	public ReadConfig() {
		File src = new File("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
					pro = new Properties();
			pro.load(fis);
			
		}
		catch(Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	public String getApplicationURL() {
		String url= pro.getProperty("baseURL");
		return url;
	}

	public String getUsername() {
		String username= pro.getProperty("Username");
		return username;
	}
	
	public String getPassword() {
		String password= pro.getProperty("Password");
		return password;
	}
	public String getCoursename() {
		String coursename = pro.getProperty("Coursename");
		return coursename;
	}
	
	public String getEditName() {
		String editname = pro.getProperty("Name");
		return editname;
	}
	
	public String getCurrentRole() {
		String editrole = pro.getProperty("Role");
		return editrole;
	}
	public String getCompanyName() {
		String EditCompany = pro.getProperty("CompanyName");
		return EditCompany;
	}
	public String getChromePath() {
		String chrome= pro.getProperty("chromepath");
		return chrome;
	}
	public String getIePath() {
		String ie= pro.getProperty("iepath");
		return ie;
	}
	
	public String getFirefox() {
		String firefox= pro.getProperty("firefoxpath");
		return firefox;
	}
	
}
