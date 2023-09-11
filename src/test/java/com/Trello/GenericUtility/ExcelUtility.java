package com.Trello.GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public String  StringDataFromExcel(String sheetname,int rownum, int cellnum) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String value =cell.getStringCellValue();
		return value;
		
	}
	
	public double numericDataFromExcel(String sheetname,int rownum, int cellnum) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		double value = cell.getNumericCellValue();
		return value;
		
	}
}
