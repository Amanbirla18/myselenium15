package Selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcel {

	 
	 public static void main(String[] args) throws IOException {
		 
		 String filename = "C:\\Excel\\Creatingexcel.xlsx";
		 XSSFWorkbook excel = new XSSFWorkbook();
		 XSSFSheet sheet = excel.createSheet("FirstSheet");
		 XSSFRow rowheader = sheet.createRow(0);
		 rowheader.createCell(0).setCellValue("Serial No.");
		 rowheader.createCell(1).setCellValue("First Name");
		 rowheader.createCell(2).setCellValue("Last Name");
		 rowheader.createCell(3).setCellValue("Role");
		 XSSFRow row1 = sheet.createRow(1);
		 row1.createCell(0).setCellValue("1");
		 row1.createCell(1).setCellValue("Aman");
		 row1.createCell(2).setCellValue("Birla");
		 row1.createCell(3).setCellValue("Tester");
		 
		 FileOutputStream file = new FileOutputStream(filename);
		 excel.write(file);
		 file.close();
		 System.out.println("file is generated");
	 }
	 
	 

}
