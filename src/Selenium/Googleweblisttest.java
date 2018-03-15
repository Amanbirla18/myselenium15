package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googleweblisttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.ca/?gfe_rd=cr&dcr=0&ei=lnC4WbSRK6LOXuyQgUg&gws_rd=ssl");
		
		
	    // to list all the links on tha page
	   // List <WebElement> LinkText = driver.findElements(By.tagName("a"));
		
		// to find the element from the particular area
	    WebElement Footer = driver.findElement(By.className("fbar"));	 
	    List <WebElement> LinkText = Footer.findElements(By.tagName("a"));
	    
	    // or same by this command 
	    //List <WebElement> LinkText = driver.findElement(By.className("fbar").findElement(By.tagName("a"));
		

	    System.out.println("Number of Links :" +LinkText.size());
	    System.out.println(LinkText.get(0).getText());
	    System.out.println(LinkText.get(1).getText());
	    
	    // print all the links using the for loop
	    
	     for (int i = 0; i<LinkText.size(); i++){
	    	 System.out.println(LinkText.get(i).getText());
	    	 
	    	 
	    
	
	     }
		
	}

}
