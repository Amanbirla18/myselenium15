package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("testeratibm1234@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("tester@ibm1213"); 
	    driver.findElement(By.id("loginbutton")).click();
	    String actualmessage=driver.findElement(By.xpath("//*[@id='globalContainer']/div[3]/div/div/div")).getText();
	    
	    System.out.println(actualmessage);
		
	}
}
