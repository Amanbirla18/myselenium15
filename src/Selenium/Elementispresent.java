package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Elementispresent {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		List <WebElement> link = driver.findElements(By.linkText("Electronicsss"));
		if(link.size()>0){
			System.out.println("Element is present");
		} else {
			System.out.println("Element is not present");
		}

}
}