package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String args[]) {
		
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://jqueryui.com/droppable/");
	
	Actions bulider = new Actions(driver);
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	
	WebElement draggable = driver.findElement(By.id("draggable"));
	WebElement droppable = driver.findElement(By.id("droppable"));
	
	bulider.dragAndDrop(draggable, droppable).build().perform();
	bulider.dragAndDropBy(draggable, 100, 100).build().perform();
	
}

}
