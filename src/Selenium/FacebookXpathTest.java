package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookXpathTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		 
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.xpath("//input[@id='u_0_b']")).sendKeys("Birla");
		 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9024125123");
		 driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[6]")).sendKeys("password");
		 driver.findElement(By.xpath("(//div[@class='clearfix']/button)[1]")).click();

		 String Errormessage = driver.findElement(By.xpath(" (//*[contains(@id,'js_')])[1]")).getText();
		 System.out.println(Errormessage);
		 
		 Thread.sleep(3000);
		 
		 String Expectedmessage = "What’s your name?";
		 if (Errormessage.equals(Expectedmessage)) {
			 System.out.println("testcase passed");
		 } else {
			 System.out.println("testcase failed");
			 	
			 
		 }
}
}