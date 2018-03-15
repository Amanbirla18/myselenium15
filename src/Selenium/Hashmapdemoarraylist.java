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
public class Hashmapdemoarraylist {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filename = "C:\\Excel\\Hashmap1.xlsx";
		//Creating a Excel File
		XSSFWorkbook workbook = new XSSFWorkbook();
    	//Creating the Sheet in Excel file
    	XSSFSheet Sheet = workbook.createSheet("Hashmap data");
    	int iRow = 0;
    	XSSFRow rowheader = Sheet.createRow(iRow);
    	rowheader.createCell(0).setCellValue("Key");
    	rowheader.createCell(1).setCellValue("Value");
    	
		HashMap<String, ArrayList<String >> map = new HashMap<String, ArrayList<String>>();
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("Aman1");
		arraylist.add("Aman2");
		arraylist.add("Aman3");
		arraylist.add("Aman4");
		arraylist.add("Aman5");
		arraylist.add("Aman6");
		
		map.put("1", arraylist);
		map.put("2", arraylist);
		map.put("3", arraylist);
		map.put("4", arraylist);
		map.put("5", arraylist);
		map.put("6", arraylist);
	    System.out.println("Values in the hashmap :" +map);
    
    System.out.println("Print the hashmap :" + map.size());
    
    for (Entry<String, ArrayList<String>> entry : map.entrySet()) {
    	iRow = iRow + 1;
    	XSSFRow rowdetail = Sheet.createRow(iRow);
    	rowdetail.createCell(0).setCellValue(entry.getKey());
    	for (int i = 0; i<=arraylist.size(); i++ ){
    	System.out.println(arraylist.get(i));
    	}
    	//rowdetail.createCell(iRow).setCellValue(entry.getValue());
    	
        //System.out.println("Key: " + key + "Value :" +value);
        
    }
    FileOutputStream file = new FileOutputStream(filename);
	 workbook.write(file);
	 file.close();
	 System.out.println("file is generated");
	//map.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));
}
	}

    
 
