package com.edureka.Utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilities {
	static Workbook wb;
	static Sheet sh;
	public static void SetupExce(String path, String Sheet) throws Exception {
		FileInputStream fis = new FileInputStream(path);
		wb = WorkbookFactory.create(fis);
		sh = wb.getSheet(Sheet);
	
	}
	
	public static String getData(int rownum, int cellnum) {
	String data = sh.getRow(rownum).getCell(cellnum).toString();
	return data;
	}

}
