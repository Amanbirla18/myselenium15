package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicXpathGoogle {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.ca");
	driver.findElement(By.id("lst-ib")).sendKeys("Testing");
	Thread.sleep(3000);
	List <WebElement> Values =driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
	Thread.sleep(3000);
	System.out.println("Size is :" + Values.size());
	
	for (int i = 0; i< Values.size(); i++){
		System.out.println(Values.get(i).getText());
		if(Values.get(i).getText().contains("testing internet speed")){
			Values.get(i).click();
			break;
		}
		
	}

}

}	
	

