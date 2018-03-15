package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Idrivertest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.ie.driver", "C:\\SeleniumJars\\IEDriverServer_x64_3.5.1\\IEDriverServer.exe");
		// ChromeDriver driver = new ChromeDriver();
		 //WebDriver driver = new ChromeDriver();
		 InternetExplorerDriver driver = new InternetExplorerDriver();
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
