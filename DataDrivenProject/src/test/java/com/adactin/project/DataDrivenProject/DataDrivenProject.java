package com.adactin.project.DataDrivenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenProject
{
	public void DataDrivenMethod() throws IOException {

	File f=new File("H:\\AutoMation Doc\\Selenium\\Xcel\\dressperchase.xls");
	FileInputStream fis =new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(fis);
	Sheet sheetAt = wb.getSheetAt(0);
	
	for (int i = 0; i <sheetAt.getPhysicalNumberOfRows(); i++) {
		Row r = sheetAt.getRow(i);
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.getCell(j);
			CellType cellT = c.getCellType();
			if (cellT.equals(CellType.STRING)) 
			{
				String stringCellValue = c.getStringCellValue();
				System.out.println(stringCellValue);
			} else if
				(cellT.equals(CellType.NUMERIC)) {
				double numericCellValue = c.getNumericCellValue();
				int value=(int) numericCellValue;
				String numericValue = String.valueOf(value);
				System.out.println(numericValue);
				
						
			}
			}
			
				
			
	}
	}
	
	
		
		
	

	
	}	

