package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		 
					  driver.get("https://www.facebook.com/");
	 WebElement email = driver.findElement(By.id("email"));
	 email.sendKeys("sdsdsd");
	 driver.findElement(By.id("email")).sendKeys("aman.birla");

	}

}
