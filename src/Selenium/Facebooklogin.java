package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebooklogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 FirefoxDriver driver = new FirefoxDriver();
		 
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.id("email")).clear();
		 driver.findElement(By.id("email")).sendKeys("aman.birla");
		 driver.findElement(By.id("pass")).clear();
		 driver.findElement(By.id("pass")).sendKeys("Rds");
		 driver.findElement(By.id("u_0_0")).click();

	}

}
