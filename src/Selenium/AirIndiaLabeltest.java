package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//import org.apache.log4j.Logger;

public class AirIndiaLabeltest {
	public static void main(String[] args) throws InterruptedException {
		int j = 0;
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
	//	Logger log = Logger.getLogger(AirIndiaLabeltest.class);
		driver.get("http://www.airindia.in/");
	///	log.debug("opening the webisite");
		
		List <WebElement> Labels = driver.findElements(By.xpath("//*[@class='selectBox width55 oneline']/label"));
		int count = 0;
	//	log.debug("Count has started");
		String Labelss[] = {"Adults:", "Children:","Infants:" };
		//List <WebElement> Labels = driver.findElements(By.xpath("//*[@class='selectBox width55 oneline']/label"));
		for (int i = 0; i <Labels.size(); i++ )
		{
			System.out.println(Labels.get(i).getText());
		
		}
		for (WebElement Label : Labels){
			System.out.println(Label.getText());
			for(int i = 0 ; i < Labelss.length; i++ ){
			if (Label.getText().equals(Labelss[i])){
				System.out.println("value of i :" +i);
				System.out.println("Value of count:"+count);
				System.out.println(Label.getText());
				count++;
				System.out.println("New Value of count:"+count);
			}
			}
		}
		if (count== Labelss.length){
			System.out.println("Matched");
		} else {
			System.out.println("not matched");
		}
			
		
}
}