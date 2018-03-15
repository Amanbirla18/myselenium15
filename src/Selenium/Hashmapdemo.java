package Selenium;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Hashmapdemo {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filename = "C:\\Excel\\Hashmap2.xlsx";
		//Creating a Excel File
		XSSFWorkbook workbook = new XSSFWorkbook();
    	//Creating the Sheet in Excel file
    	XSSFSheet Sheet = workbook.createSheet("Hashmap data");
    	int iRow = 0;
    	XSSFRow rowheader = Sheet.createRow(iRow);
    	rowheader.createCell(0).setCellValue("Key");
    	rowheader.createCell(1).setCellValue("Value");
    	
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "Z");
		map.put("2", "aman");
		map.put("3", "birla");
		map.put("4", "ibm");
		map.put("5", "tester");
		map.put("6", "10");
	    System.out.println("Values in the hashmap :" +map);
    
    System.out.println("Print the hashmap :" + map.size());
    
    for (Entry<String, String> entry : map.entrySet()) {
    	iRow = iRow + 1;
    	XSSFRow rowdetail = Sheet.createRow(iRow);
    	rowdetail.createCell(0).setCellValue(entry.getKey());
    	rowdetail.createCell(1).setCellValue(entry.getValue());
    	
        //System.out.println("Key: " + key + "Value :" +value);
        
    }
    FileOutputStream file = new FileOutputStream(filename);
	 workbook.write(file);
	 file.close();
	 System.out.println("file is generated");
	//map.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));
}
	}

    
 
