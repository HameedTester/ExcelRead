package com.testng.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelRead {
	
	
	@Test
	public void excelRead() throws IOException
	{
		
		String file ="C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumMavenProject\\Excel\\ExcelREad.xlsx";
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheetAt = wb.getSheetAt(0);
		XSSFRow row = sheetAt.getRow(0);
		
		System.out.println(row);
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		System.out.println(physicalNumberOfCells);
		
		
		XSSFCell cell = sheetAt.getRow(0).getCell(physicalNumberOfCells);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
