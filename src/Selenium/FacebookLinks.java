package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//WebElement LinkText = driver.findElement(By.xpath("//*[@id='pageFooter']/div[2]/table/tbody"));
		
		//or
		
		WebElement LinkText = driver.findElement(By.xpath(".//*[@class = 'uiGrid _51mz navigationGrid']"));
		
		List <WebElement> LinkText1 = LinkText.findElements(By.tagName("a"));
		
		System.out.println("Number of Links :" +LinkText1.size());
	   
	    
	    // print all the links using the for loop
	    
	     for (int i = 0; i<LinkText1.size(); i++){
	    	 System.out.println(LinkText1.get(i).getText());
	    	 
	    	 
	}
	}
}
