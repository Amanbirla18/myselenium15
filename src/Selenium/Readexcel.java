package Selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Readexcel {
	
	//** hard coded method		 
	//public static void main(String[] args) throws IOException {
		
		 
		//**     FileInputStream file = new FileInputStream("C:\\Excel\\MCSS Workitems with resouorces as of Oct 5, 2017v2.xlsx");
		//         XSSFWorkbook workbook = new XSSFWorkbook(file);
		//         XSSFSheet Sheet = workbook.getSheet("Workitem");
		//         XSSFRow row =Sheet.getRow(1);
		//         XSSFCell cell = row.getCell(0);
		//        String value = cell.getStringCellValue();
		//        System.out.println(value);  
		
		// create e method to read the excel
	
		 public static XSSFWorkbook workbook;
		 public static XSSFSheet Sheet;
		 public static XSSFRow row;        
		 public static XSSFCell cell;
		 public static FileInputStream file;
		 public static FileOutputStream file1;
		 
		 
	public static void main(String[] args) throws IOException {
			 
			 String value = getcelldata(2,2);
			 System.out.println(value);
			 String value1 = getcelldata(0,2);
			 System.out.println(value1);
			 String Value2 = setcelldata("Aman" ,10, 10);
			 System.out.println(Value2);
			// setcelldata("Hello", 1, 1);
			 
			 
			 
				 }
	public static String getcelldata ( int rownum , int cellnum) throws IOException{
			 		 file = new FileInputStream("C:\\Excel\\MCSS Workitems with resouorces as of Oct 5, 2017v2.xlsx");
					 workbook = new XSSFWorkbook(file);
					 Sheet = workbook.getSheet("Workitem");
					 row =Sheet.getRow(rownum);
					 cell = row.getCell(cellnum);
					 return cell.getStringCellValue();
					 
				 } 
		 // writing to excel sheet
	 public static String setcelldata (String Result ,int rownum , int cellnum) throws IOException{
//	 public static void setcelldata (String Result ,int rownum , int cellnum) throws IOException{
	 		file = new FileInputStream("C:\\Excel\\MCSS Workitems with resouorces as of Oct 5, 2017v2.xlsx");
	 		 //String filename = "C:\\Excel\\MCSS Workitems with resouorces as of Oct 5, 2017v2.xlsx";
			 workbook = new XSSFWorkbook(file);
			 Sheet = workbook.getSheet("Workitem");
			 row =Sheet.getRow(rownum);
			 /*cell = row.getCell(cellnum);
			 cell.setCellValue("hello"); */
			
			 cell = row.getCell(cellnum);
				if (cell == null) {
					cell = row.createCell(cellnum);
					cell.setCellValue(Result);
					System.out.println("created new cell");
				} else {
					cell.setCellValue(Result);
					System.out.println("cell is already created");
					
				} 
				file1 = new FileOutputStream("C:\\Excel\\MCSS Workitems with resouorces as of Oct 5, 2017v2.xlsx");
				workbook.write(file1);
				file1.flush();
				file1.close();
				return cell.getStringCellValue();
		 }
		    }
		 
		
	


