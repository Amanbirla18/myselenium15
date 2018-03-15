package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_Test {

		public static void main(String[] args) throws InterruptedException{
			
			//System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver.exe")
	        WebDriver driver = new FirefoxDriver();
	        System.out.println("System is opening toolqa website");
	        driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
	        Thread.sleep(10000);
	        WebElement Confirmpopup = driver.findElement(By.xpath("//*[@id='content']/p[8]/button"));
	        Confirmpopup.click();
	        
	        Alert myalert1 = driver.switchTo().alert();
	        String Text1 = myalert1.getText();
	        System.out.println(Text1);
	        //myalert1.accept();
	        myalert1.dismiss();
	        WebElement X = driver.findElement(By.id("ConfirmOption"));
	        System.out.println(X.getText());
	        System.out.println("Confrim pop up is done");
	        
	        WebElement promptOption = driver.findElement(By.xpath("//*[@id='content']/p[11]/button"));
	        promptOption.click();
	        
	        Alert myalert2 = driver.switchTo().alert();
	        String Text2 = myalert2.getText();
	        System.out.println(Text2);
	        myalert2.sendKeys("Yes");
	        myalert2.accept();
	        //myalert2.dismiss()
	        
	        System.out.println("promptOption pop up is done");
	        System.out.println("pass");
	        driver.close();
	

}
}