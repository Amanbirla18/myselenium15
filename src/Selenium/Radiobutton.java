package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		
		WebElement box = driver.findElement(By.xpath("(//*[@class='table5'])[2]"));
		List <WebElement> options = box.findElements(By.name("group1"));
		// Alternative 
		
		//List <WebElement> options = driver.findElements(By.xpath(".//*[@name='group1']"));
		
		
		System.out.println(options.size());
		
		for (int i = 0; i < options.size(); i++){
			System.out.println(options.get(i).getAttribute("value")+ "======" + options.get(i).isSelected());
		}
		
		System.out.println("===================================");
		options.get(2).click();
		
		for (int i = 0; i < options.size(); i++){
			System.out.println(options.get(i).getAttribute("value")+ "======" + options.get(i).isSelected());
		}
		
	
	}
}
