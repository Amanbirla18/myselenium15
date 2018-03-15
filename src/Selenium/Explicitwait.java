package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebDriverWait wait1 = new WebDriverWait(driver, 100);
		WebDriverWait wait2 = new WebDriverWait(driver, 100);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		
		//driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-en&service=mail&dsh=1139854030851837936&flowName=GlifWebSignIn&flowEntry=ServiceLogin#password");
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("test34");  
		driver.findElement(By.xpath(".//*[@id='identifierNext']")).click();   
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		driver.findElement(By.name("password")).sendKeys("safcasfasfasfasfasfa"); 
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='passwordNext']")));
		driver.findElement(By.xpath(".//*[@id='passwordNext']")).click();
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='password']/div[2]/div[2]")));
		System.out.println(driver.findElement(By.xpath(".//*[@id='password']/div[2]/div[2]")).getText());
	
		
	}
}
