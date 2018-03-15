package Selenium;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AirIndiaLabeltest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.airindia.in/");
		int count = 0;
		String Labelss[] = {"Adults:", "Children:","Infants:" };
		List <WebElement> Labels = driver.findElements(By.xpath("//*[@class='selectBox width55 oneline']/label"));
		for (int i = 0; i <Labels.size(); i++ )
		{
			System.out.println(Labels.get(i).getText());
		
		}
		for (WebElement Label : Labels){
			System.out.println(Label.getText());
			for(int i = 0 ; i < Labelss.length; i++ ){
				System.out.println("in for loop value of i :" +i);
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

