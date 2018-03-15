package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Attribute_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		
		//to get the label when tag has text
		//driver.get("https://www.facebook.com/");
		//WebElement text = driver.findElement(By.id("u_0_r"));
		//String Text1 = text.getText();
		//System.out.println(Text1);
		
		// to get the value of the label when tag doesn't have text
		//driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1505176514&rver=6.7.6643.0&wp=MBI_SSL_SHARED&wreply=https:%2F%2Fmail.live.com%2Fdefault.aspx%3Frru%3Dinbox&lc=1033&id=64855&mkt=en-us&cbcxt=mai");
		//WebElement text = driver.findElement(By.id("idSIButton9"));
		//String Text2 = text.getAttribute("value");
		//System.out.println(Text2);
		
		//WebElement text = driver.findElement(By.xpath("//*[@class='phholder']/div"));
		//String Text2 = text.getText();
		//System.out.println(Text2);
		
		//String Expectedvalue = "Email, phone, or Skype";
		// if (Expectedvalue.equals(Text2)) {
		//	 System.out.println("testcase passed");
		// } else {
		//	 System.out.println("testcase failed");
			
	//}
		//driver.findElement(By.xpath("//*[@id='i0116']")).sendKeys("amanbirla@live.com");
	
	//WebElement text4 = driver.findElement(By.xpath("//*[@id='i0116']"));
		 //String Text3 = text4.getAttribute("value");
		// System.out.println(Text3);
		 
		 // to get the text with get attribute then enter the value then get the entered value
		 
		driver.get("https://www.ebay.com/");
		
		WebElement ebay = driver.findElement(By.id("gh-ac"));
		String Value = ebay.getAttribute("placeholder");
		
		System.out.println(Value);
	
		ebay.sendKeys("ewwewe");
		String Value1 = ebay.getAttribute("value");
		
		System.out.println(Value1);
		
		
		
		 
}
}
