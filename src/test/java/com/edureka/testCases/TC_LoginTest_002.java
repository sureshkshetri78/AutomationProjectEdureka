package com.edureka.testCases;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.edureka.pageObjects.LoginPage;



public class TC_LoginTest_002 extends BaseClass {
	WebDriver driver; 
	Workbook wb;
	Sheet sh;
	int norows;
	int nocols;
	
	
	@DataProvider
	public Object[][]testDataFeed() throws Exception{
		
		//to import the Excel file and fetch the data bytes from the file and pass it to the script
		FileInputStream fis = new FileInputStream("D:\\Training QA\\EdurekaProject\\src\\test\\java\\com\\edureka\\testData\\TestCaseEdureka.xlsx");
		
		wb = WorkbookFactory.create(fis);
		
		sh = wb.getSheet("Sheet1");
		
		norows = sh.getLastRowNum();
		System.out.println(norows);
		
		nocols = sh.getRow(0).getLastCellNum();
		System.out.println(nocols);
		
		Object[][] formData = new Object[norows][nocols];
		
		for(int row=1; row<norows; row++) 
		{
			for(int col=0; col<nocols; col++) 
			{
				
				//fetch the data from the excel file and capture those bytes of the cell
				formData[row][col] = sh.getRow(row).getCell(col).toString();
				
			}
			
		}
		
		return formData;
	}
	
	@Test(dataProvider = "testDataFeed")
	public void loginDDT(String uname,String pwd)
	{
		LoginPage lp = new LoginPage(driver);
		lp.clickLog();
		lp.setUsername(uname);
		lp.setPassword(pwd);
		lp.clickSubmit();
	}
		
	

}
	
