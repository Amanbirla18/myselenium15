package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Multiplebrowser {
	public static void main(String[] args){
		
		WebDriver driver=null;
		
		
		String browser = "FF"; //Chrome, IE
		
		if (browser.equals("FF")) {
			driver = new  FirefoxDriver();
		}
		else if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
			driver = new  ChromeDriver();
		}
		else if (browser.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\SeleniumJars\\IEDriverServer_x64_3.5.1\\IEDriverServer.exe");
			 driver = new  InternetExplorerDriver();
		}
	
	 driver.get("https://www.facebook.com/");
	 driver.findElement(By.xpath("//input[@id='u_0_b']")).sendKeys("Birla");
	 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9024125123");
	 driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[6]")).sendKeys("password");
	 driver.findElement(By.xpath("(//div[@class='clearfix']/button)[1]")).click();

	}
}
