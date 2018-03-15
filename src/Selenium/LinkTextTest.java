package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		 
		 driver.get("https://www.google.ca/?gfe_rd=cr&dcr=0&ei=-je3WaHODOnOXuCQgXA&gws_rd=ssl");
		 driver.findElement(By.linkText("Advertising")).click();
		 
		 String Actualtitle = driver.getTitle();
		 System.out.println(Actualtitle); 
		 String Expectedtitle = "Google Ads - Create Online Ads for Your Business – Google";
		 if (Actualtitle.equals(Expectedtitle)){
			 System.out.println("Testcase passed");
		 }
			 else {
				 System.out.println("Testcase failed"); 
			 }
		 String ActualURl = driver.getCurrentUrl();
		 System.out.println(ActualURl);
		 String CurrentURL = "https://www.google.ca/intl/en/ads/?fg=";
		 if (ActualURl.equals(CurrentURL)){
			 System.out.println("Testcase passed");
		 }
			 else {
				 System.out.println("Testcase failed"); 
			 }
		 }
	}


