package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AirCanada {
	public static void main(String[] args) throws InterruptedException {
		int j = 0;
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.airindia.in/");
		
		//List <WebElement> Radio = driver.findElements(By.xpath("//*[@name='_tripType']"));
		//List <WebElement> Radio = driver.findElements(By.xpath(".//*[@class='flightSchedule cf']/ul[3]/li[1]"));
		List <WebElement> Radio = driver.findElements(By.xpath(".//*[@class='radioDate alignLeft']"));
		System.out.println("Radio size is:" + Radio.size());
		 for(int i=0; i<Radio.size(); i++){
			  // System.out.println(Radio.get(i).getAttribute("value"));
			   System.out.println(Radio.get(i).getText());
			   if(Radio.get(i).isSelected()){
			    j=i;
			   }
			  }
		System.out.println("preselected radio button "); 
		//System.out.println(Radio.get(j).getAttribute("id"));
		System.out.println(Radio.get(j).getText());
		Thread.sleep(2000);
		//Radio.get(0).click();
		//driver.findElement(By.xpath(".//*[@id='oneway']"))
		//for(int i=0; i<Radio.size(); i++){
		//	if(Radio.get(i).isSelected()){
		//		System.out.println("Other radio button is selected");
				//System.out.println(Radio.get(i).getAttribute("id")); 
		//	}
	//	}
	   
		
		WebElement from = driver.findElement(By.xpath("//*[@id='from']"));
		System.out.println("default value in from box");
		System.out.println(from.getAttribute("name"));
		
		from.sendKeys("Canada");
		System.out.println("new value in from box");
		System.out.println(from.getAttribute("value"));
		Thread.sleep(3000);
		List <WebElement> options = driver.findElements(By.xpath("//*[@id='ui-id-2']/li"));
		System.out.println("Size of the from location");
	    System.out.println(options.size());
	    for (int i1 = 0; i1 < options.size(); i1++){
	    	Thread.sleep(3000);
			  System.out.println(options.get(i1).getText());
	    }
	    WebElement to = driver.findElement(By.xpath(".//*[@id='to']"));
	    System.out.println("default value from to ");
		System.out.println(to.getAttribute("name"));
		to.sendKeys("japan");
		
		System.out.println("New value in to field");
		System.out.println(to.getAttribute("value"));
		Thread.sleep(3000);
		List <WebElement> tooptions = driver.findElements(By.xpath("//*[@id='ui-id-3']/li"));
		System.out.println("Size of the TO location");
		System.out.println(tooptions.size());
		for (int  i1 = 0; i1 < tooptions.size(); i1++){
			Thread.sleep(3000);
			  System.out.println(tooptions.get(i1).getText());	 
	    }
		
		List <WebElement> radio1 = driver.findElementsByXPath(".//*[@id='divwithjs']/div/ul[4]/li[4]");
		//List <WebElement> radio1 = driver.findElementsByXPath("//*[@name='_depdatewindow']");
		System.out.println("Radio1 size is:" + radio1.size());
		 for(int i=0; i<radio1.size(); i++){
			//System.out.println(radio1.get(i).getAttribute("title"));
			System.out.println(radio1.get(i).getText());
			  if (radio1.get(i).isSelected()){
			    j=i;
			   }
		 }
		System.out.println("preselected radio button "); 
		//String Fixedvalue = radio1.get(j).getAttribute("title");
	    String Fixedvalue = radio1.get(j).getText();
		System.out.println(Fixedvalue);
		
		if(Fixedvalue.equals( "Flexible Dates")){
			System.out.println("Pass");
		}
		else {
			System.out.println("fail");
		}
		
		List <WebElement> radio2 = driver.findElementsByXPath(".//fieldset[@class='alignLeft']");
		System.out.println("Radio2 size is :" + radio2.size());
		for(int i=0; i<radio2.size(); i++){
			//System.out.println(radio1.get(i).getAttribute("Value"));
			System.out.println(radio2.get(i).getText() +"====="+ radio2.get(i).isSelected() );
			  if (radio2.get(i).isSelected()){
			    j=i;
			   }
		 }
		System.out.println("preselected radio button "); 
		//String Yes = radio1.get(j).getAttribute("Value");
	    String Yes = radio2.get(j).getText();
	    System.out.println(Yes);
	    WebElement Text = driver.findElement(By.xpath(".//p[@class='rules']"));
	    String CheckText = Text.getText();
	    String Tag1 = Text.getTagName();
	    System.out.println("Tag1 name is "+ Tag1);
	    
	    System.out.println("CheckText1 is " +CheckText);
	    if (CheckText.equals( "Would you like to avail of Domestic Concession? Eligibility Rules" )){
	    	System.out.println("Passed");
	    	
	    }
	    else {
	    	System.out.println("failed");
	    }
	    
		System.out.println(Yes);
		WebElement Text1 = driver.findElement(By.xpath("//p[@class='rules']/a"));
		String Tag2 = Text1.getTagName();
		//String CheckText1 = Text.getText();
		System.out.println("Tag2 name is "+ Tag2);
		//System.out.println("CheckText2 is " + CheckText1);
		    if (Tag2.equals( "Eligibility Rules" )){
		    	System.out.println("Passed");
		    	
		    }
		    else {
		    	System.out.println("failed");
		    }
		
		Thread.sleep(2000);
		WebElement drop1 = driver.findElement(By.xpath("//*[@id='ddladult1']"));
		Select Drop11 = new Select(drop1);
		System.out.println("Drop is multiple?");
		System.out.println(Drop11.isMultiple());
		System.out.println("=================================");
		List <WebElement> drop1options= Drop11.getOptions();
		System.out.println("Value is:" +  drop1options.size());
		System.out.println("Print the values of the drop down ");
		for (int  i1 = 0; i1 < drop1options.size(); i1++){
			System.out.println(drop1options.get(i1).getText());
			if (drop1options.get(i1).isSelected()){
			 j=i1;
					}
		}
		System.out.println("Print the current selected value of the dropdown");
		System.out.println(drop1options.get(j).getText());
		System.out.println("Print the new selected value");
		Drop11.selectByIndex(2);
		for (int  i1 = 0; i1 < drop1options.size(); i1++){
			if (drop1options.get(i1).isSelected()) {
				System.out.println(drop1options.get(i1).getText()); 
		}
		}
		Thread.sleep(2000);
		WebElement childrentext = driver.findElement(By.xpath(".//*[@class='date alignLeft selectOptionNew']/div[3]"));
		System.out.println("Children text is :" + childrentext.getText());
		WebElement drop2 = driver.findElement(By.id("ddlchildren1"));
		
		Select Children = new Select(drop2);
		System.out.println("Children Drop is multiple?");
		System.out.println(Children.isMultiple());
		System.out.println("=================================");
		List <WebElement> Childrenoptions= Children.getOptions();
		System.out.println("Value is:" +  Childrenoptions.size());
		System.out.println("Print the values of the children drop down ");
		for (int  i = 0; i < Childrenoptions.size(); i++){
			System.out.println(Childrenoptions.get(i).getText());
			if (Childrenoptions.get(i).isSelected()){
			 j=i;
					}
		}
		System.out.println("Print the current selected value of the children dropdown");
		System.out.println(Childrenoptions.get(j).getText());
		System.out.println("Print the new selected value in children dropdown ");
		Children.selectByIndex(2);
		for (int  i1 = 0; i1 < Childrenoptions.size(); i1++){
			if (Childrenoptions.get(i1).isSelected()) {
				System.out.println(Childrenoptions.get(i1).getText()); 
		}
		}
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
				
			
			WebElement drop3 = driver.findElement(By.id("ddlinfants1"));
			
			Select infants = new Select(drop3);
			System.out.println("Infatns Drop is multiple?");
			System.out.println(infants.isMultiple());
			System.out.println("=================================");
			List <WebElement> infantsoptions= infants.getOptions();
			System.out.println("Value is:" +  infantsoptions.size());
			System.out.println("Print the values of the Infants drop down ");
			for ( int i = 0; i < infantsoptions.size(); i++){
				System.out.println(infantsoptions.get(i).getText());
				if (infantsoptions.get(i).isSelected()){
				 j=i;
						}
			}
			System.out.println("Print the current selected value of the Infants dropdown");
			System.out.println(infantsoptions.get(j).getText());
			System.out.println("Print the new selected value in infants dropdown ");
			infants.selectByIndex(2);
			for (int  i1 = 0; i1 < infantsoptions.size(); i1++){
				if (infantsoptions.get(i1).isSelected()) {
					System.out.println(infantsoptions.get(i1).getText()); 
			}
			}
			
			}
			
		}

