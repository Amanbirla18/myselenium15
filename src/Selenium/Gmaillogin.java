package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmaillogin {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	//FirefoxDriver driver = new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\NewGeckoDriver\\chromedriver.exe");
	DesiredCapabilities cap=DesiredCapabilities.chrome();
	WebDriver driver = new ChromeDriver(cap);
	//System.setProperty("webdriver.gecko.driver", "C:\\NewGeckoDriver\\geckodriver.exe");
    driver.manage().window().maximize();
    String url = "https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession&cid=0&navigationDirection=forward";
    driver.get(url);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
    WebElement email_phone = driver.findElement(By.xpath("//input[@id='identifierId']"));
    email_phone.sendKeys("amanbirla06@gmail.com");
    driver.findElement(By.id("identifierNext")).click();
    WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
    WebDriverWait wait = new WebDriverWait(driver, 20);
    wait.until(ExpectedConditions.elementToBeClickable(password));
    password.sendKeys("tester@ibm");
    driver.findElement(By.id("passwordNext")).click();
    //driver.findElement(By.xpath("//div[@class='z0']")).click();
    driver.findElement(By.xpath("//textarea[@class='vO']")).sendKeys("amasas");
    driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("asasas");
	}
}