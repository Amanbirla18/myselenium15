package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
	
		driver.findElement(By.cssSelector("input[name ='firstname']")).sendKeys("Aman");
		driver.findElement(By.cssSelector("input[name ='lastname']")).sendKeys("birla");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("99999999");
		driver.findElement(By.cssSelector("input[autocomplete*='new']")).sendKeys("Ssdsewr");
		
		
		driver.findElement(By.cssSelector("input[value='2']")).click();
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[id^='js_2']")).getText());
	}

}
