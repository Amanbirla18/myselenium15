package Selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EbayTest {

	public static void main(String[] args) {
		int j = 0;
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		WebElement Dropdown = driver.findElement(By.xpath(".//*[@id='gh-cat']"));
		Select DropSelect = new Select(Dropdown);
		List <WebElement> options = DropSelect.getOptions();		
		System.out.println(options.size());
		
		for (int  i = 0; i < options.size(); i++){
		System.out.println(options.get(i).getText());
		if (options.get(i).isSelected()){
		j=i;
			}
		}
		System.out.println("=============================================================");
		System.out.println(options.get(j).getText());
			
		
		DropSelect.selectByValue("267");
		for (int  i = 0; i < options.size(); i++){
			if (options.get(i).isSelected()) {
				System.out.println(options.get(i).getText() +"=====" +options.get(i).isSelected()); 
		}
		
		}
		
		
	}

}
