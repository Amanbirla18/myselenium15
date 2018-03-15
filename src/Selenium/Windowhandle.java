package Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowhandle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	
	FirefoxDriver driver = new FirefoxDriver();
	driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://www.mohawkcollege.ca/faq/mymohawk-faq");      
	
	driver.findElement(By.linkText("MyMohawk using your MohawkID")).click();
	
	
	Set <String> allwindows = driver.getWindowHandles();
	System.out.println(allwindows.size());
	
	Iterator <String> iter = allwindows.iterator();
	String MW = iter.next();
	String CW = iter.next();
	
	System.out.println(MW);
	System.out.println(CW);
	driver.switchTo().window(CW);
	System.out.println(driver.getTitle());
	driver.switchTo().window(MW);
	System.out.println(driver.getTitle());
	
	
	
}
}
