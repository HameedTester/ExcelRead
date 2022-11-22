package com.testng.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataDrivenFramework {

	@Test
	public void excelRead() throws IOException
	{

		// provide the path of the excel file

		String file = "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumMavenProject\\DataDriven\\Data.xlsx";
		FileInputStream fis = new FileInputStream(file);

		// Need to create the Object for Excel File

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheetAt = wb.getSheetAt(0);

		//XSSFRow row = sheetAt.getRow(0);
		//XSSFCell cell = row.getCell(1);
//		String stringCellValue = cell.getStringCellValue();
//		System.out.println(stringCellValue);

		int lastRowNum = sheetAt.getLastRowNum();
		System.out.println(lastRowNum);

		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);

		short lastCellNum = sheetAt.getRow(0).getLastCellNum();

		// to get the all rows and columns in console

		for(int i=0;i<physicalNumberOfRows;i++)
		{

			XSSFRow row1 = sheetAt.getRow(i);


			for(int j=0;j<lastCellNum;j++)
			{

				XSSFCell cell1 = row1.getCell(j);
//				String value = cell1.getStringCellValue();
//				System.out.println(value);

				DataFormatter d = new DataFormatter(); // It is used to convert numbers into string format
				String value = d.formatCellValue(cell1);
				System.out.println(value);
				
				
			}

		}
























	}

}
