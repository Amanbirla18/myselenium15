package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobutton1 {

	public static void main(String[] args) {
	  int j=0;
	  
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://www.echoecho.com/htmlforms10.htm");
	  
	  List<WebElement> allRadioButton = driver.findElements(By.name("group1"));
	  System.out.println(allRadioButton.size());
	  
	  for(int i=0; i<allRadioButton.size(); i++){
	   System.out.println(allRadioButton.get(i).getAttribute("value"));
	   if(allRadioButton.get(i).isSelected()){
	    j=i;
	   }
	  }
	  
	  System.out.println("=============================================================");
	  System.out.println(allRadioButton.get(j).getAttribute("value"));
	  
	  allRadioButton.get(2).click();
	  System.out.println("=================================================================================");
	  
	  for(int i=0; i<allRadioButton.size(); i++){
	   System.out.println(allRadioButton.get(i).getAttribute("value")+"======="+allRadioButton.get(i).isSelected());
	   if(allRadioButton.get(i).isSelected()){
	    j=i;
	   }
	  }
	  
	  System.out.println("=============================================================");
	  System.out.println(allRadioButton.get(j).getAttribute("value"));
	  
	 }
}