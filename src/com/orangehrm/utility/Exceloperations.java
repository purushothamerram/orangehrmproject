package com.orangehrm.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;




import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceloperations {
public int rowcount(String path,int sheetno) throws IOException
{
	FileInputStream f=new FileInputStream(path);
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet ws=wb.getSheetAt(sheetno);
	int rowcount=ws.getLastRowNum();
	return rowcount;
}
public Row getRow(String path,int sheetno,int rowno) throws IOException
{
	FileInputStream f=new FileInputStream(path);
	XSSFWorkbook wb =new XSSFWorkbook(f);
	XSSFSheet ws=wb.getSheetAt(sheetno);
		Row r =ws.getRow(rowno);
		return r;				
}
public String getcelldata(String path,int sheetno,int rowno,int cellno) throws IOException
{
	FileInputStream f=new FileInputStream(path);
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet ws= wb.getSheetAt(sheetno);
String celldata=ws.getRow(rowno).getCell(cellno).getStringCellValue();	
	return celldata;
	
}
}
