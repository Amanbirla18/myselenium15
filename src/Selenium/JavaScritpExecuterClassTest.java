package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScritpExecuterClassTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.ebay.com/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,10000)", "");
		WebElement element = driver.findElement(By.xpath(".//*[@id='rtm_list3']/div/div[1]/div[2]/a/div[2]"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
}
}