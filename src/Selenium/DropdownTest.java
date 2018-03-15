package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
		
		//driver.findElement(By.id("searchDropdownBox"));
		//WebElement box = driver.findElement(By.id("searchDropdownBox"));
		//List <WebElement> options = box.findElements(By.tagName("option"));
		
		List <WebElement> options = driver.findElement(By.id("searchDropdownBox")).findElements(By.tagName("option"));
		System.out.println(options.size());
		for (int  i = 0; i < options.size(); i++){
			 System.out.println(options.get(i).getText());
		}
			  // to print the slected options in boolean
		//for (int  i = 0; i < options.size(); i++){
		//System.out.println(options.get(i).getText() +"=====" +options.get(i).isSelected());
		//}
		
		// to select other value	
		
		//for (int  i = 0; i < options.size(); i++){
		//	System.out.println(options.get(i).getText() +"=====" +options.get(i).isSelected());
		
	//}
		
		// using selenium class
		//Select s = new Select(box);
		//s.selectByIndex(4);
		//System.out.print(s.getAllSelectedOptions());
		
		//List <WebElement> List = s.getOptions();
		//System.out.println(List.size());
		//for (int  i = 0; i < List.size(); i++){
			//  System.out.println(List.get(i).getText());
		//}
		//s.selectByValue("search-alias=hpc");
		//s.selectByVisibleText("Apps & Games");

		
		
		
	}
}

