package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		Actions bulider = new Actions(driver);
		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		bulider.moveToElement(electronics).build().perform();
		
		List <WebElement> Values = driver.findElements(By.xpath(".//*[@id='s0-container']/li[5]/div[2]/div[1]/div[2]/ul/li"));
		System.out.println("Size is :" + Values.size());
		Thread.sleep(3000);
		for (int i = 0; i< Values.size(); i++){
			System.out.println(Values.get(i).getText());
			
		}
				
	}

}
