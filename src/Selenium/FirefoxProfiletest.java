package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FirefoxProfiletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProfilesIni pi = new ProfilesIni();
		FirefoxProfile profile = pi.getProfile("FFox_Profile");
		
		/*FirefoxDriver driver = new FirefoxDriver(profile);
		// driver.get("https://www.facebook.com/");
		 driver.findElement(By.xpath("//input[@id='u_0_b']")).sendKeys("Birla");
		 driver.findElement(By.sxpath("//input[@name='reg_email__']")).sendKeys("9024125123");
		 driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[6]")).sendKeys("password");
		 driver.findElement(By.xpath("(//div[@class='clearfix']/button)[1]")).click();
		*/
		

	}

}
