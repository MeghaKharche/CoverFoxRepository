package practiceForAllSeleniumTopic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSggestiveDropdownUse {

	public static void main(String[] args)
	{
		//i create instance of webDriver OR using new i create object of ChromeDriver 
		WebDriver driver = new ChromeDriver();
						
		//maximize browser window
		driver.manage().window().maximize();
				
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//using get() i open url / aplication
		driver.get("https://www.google.com/");
		
		//System.out.println("===========How to handle AutoSugestiveDropDown==========");
		
		driver.findElement(By.name("q")).sendKeys("skoda");
		
		List<WebElement> listBox = driver.findElements(By.xpath("(//div[@class= 'OBMEnb'])[1]//ul/li"));
		for(WebElement w : listBox)
		{
			System.out.println(w.getText());
		}
		
	
		String expectedResult= "skoda slavia price";
		
		for(WebElement autosuggestivedropdwon : listBox)
		{
			String actualResult = autosuggestivedropdwon.getText();
			
			if(actualResult.equals(expectedResult))
			{
				System.out.println("===================================");
				System.out.println(autosuggestivedropdwon.getText()); //skoda slavia price
				autosuggestivedropdwon.click();
				break;
			}
			
		}
				
		
	}

}
