package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackandForward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		 
		 driver.get("https://www.google.ca/?gfe_rd=cr&dcr=0&ei=-je3WaHODOnOXuCQgXA&gws_rd=ssl");
		 driver.findElement(By.linkText("Advertising")).click();
		 String Actualtitle = driver.getTitle();
		 System.out.println(Actualtitle); 
		 
		 driver.navigate().back();
		 String Actualtitle1 = driver.getTitle();
		 System.out.println(Actualtitle1);
		 
		 driver.navigate().forward();
		 String Actualtitle2 = driver.getTitle();
		 System.out.println(Actualtitle2);
	}

}
