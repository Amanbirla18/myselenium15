package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frametest {
	
	public static void main(String args[]) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
	/*	List <WebElement> Links = driver.findElements(By.xpath(".//*[@id='sidebar']/aside[1]/ul/li"));
		if(Links.size() >0){
			for (int i = 0; i <Links.size(); i++ )
			{
				System.out.println(Links.get(i).getText());
			
			}
			for (WebElement Link : Links){
				
				if (Link.getText().equals("Sortable")){
					System.out.println("System has link");
				}
				else {
					System.out.println("Element not found");
				}
				} */
		
		List <WebElement> Sortable = driver.findElements(By.linkText("Sortable"));
		if (Sortable.size()>0){
			System.out.println("Sortable is present");
		}
		else {
				System.out.println("Sortable is not present");
			}
		
		List <WebElement> dragable = driver.findElements(By.xpath(".//*[@id='draggable']"));
		if (dragable.size()>0){
			System.out.println("Dragablee is present");
		}
		else {
				System.out.println("Dragablee is not present");
			}
		
		
	//	driver.switchTo().frame(0);
	//	driver.switchTo().frame("demo-frame") //Id is used in string
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		System.out.println("===========After Switching o frame =========================");
		
		
		Sortable = driver.findElements(By.linkText("Sortable"));
		if (Sortable.size()>0){
			System.out.println("Sortable is present");
		}
		else {
				System.out.println("Sortable is not present");
			}
		
		dragable = driver.findElements(By.xpath(".//*[@id='draggable']"));
		if (dragable.size()>0){
			System.out.println("Dragablee is present");
		}
		else {
				System.out.println("Dragablee is not present");
			}
		driver.switchTo().defaultContent();
		
		System.out.println("===========After Switching to default frame =========================");
		Sortable = driver.findElements(By.linkText("Sortable"));
		if (Sortable.size()>0){
			System.out.println("Sortable is present");
		}
		else {
				System.out.println("Sortable is not present");
			}
		
		dragable = driver.findElements(By.xpath(".//*[@id='draggable']"));
		if (dragable.size()>0){
			System.out.println("Dragablee is present");
		}
		else {
				System.out.println("Dragablee is not present");
			}
		
		
		}
		
		
	}
	

