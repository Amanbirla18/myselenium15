package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmaillogin {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-en&service=mail&dsh=1139854030851837936&flowName=GlifWebSignIn&flowEntry=ServiceLogin#password");
	driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("test34");  
	driver.findElement(By.xpath(".//*[@id='identifierNext']")).click();    
	Thread.sleep(2000);    driver.findElement(By.name("password")).sendKeys("safcasfasfasfasfasfa");  
	driver.findElement(By.xpath(".//*[@id='passwordNext']")).click();    
	Thread.sleep(2000);    
	System.out.println(driver.findElement(By.xpath(".//*[@id='password']/div[2]/div[2]")).getText());
	}
}