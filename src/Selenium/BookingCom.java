package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BookingCom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.booking.com/");
		driver.findElement(By.id("ss")).sendKeys("Canada");
		Thread.sleep(2000);
		List <WebElement> alloptions = driver.findElements(By.xpath(".//*[@id='frm']/div[2]/div/div[1]/ul[1]/li"));
		System.out.println(alloptions.size());
		 
		  for (int  i = 0; i < alloptions.size(); i++){
			  System.out.println(alloptions.get(i).getText());
			  
		  }
		 //  alloptions.get(1).click();
		 
		
		
		
		

	}

}
