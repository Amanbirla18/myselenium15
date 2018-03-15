package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.ca/?gfe_rd=cr&dcr=0&ei=mXm4WbzxNqPOXqyTgbAG&gws_rd=ssl");
		driver.findElement(By.id("lst-ib")).sendKeys("canada");
		Thread.sleep(3000);
		 List <WebElement> alloptions = driver.findElements(By.xpath(".//*[@class='sbqs_c']"));
		 System.out.println(alloptions.size());
		 
		  for (int  i = 0; i < alloptions.size(); i++){
			  System.out.println(alloptions.get(i).getText());
			  
		  }
		   alloptions.get(1).click();
		 
		
		

	}

}
