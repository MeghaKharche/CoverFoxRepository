package practiceForAllSeleniumTopic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxUse {

	public static void main(String[] args) 
	{
		//i create instance of webDriver OR using new i create object of ChromeDriver 
		WebDriver driver = new ChromeDriver();
				
		//maximize browser window
		driver.manage().window().maximize();
		
		//using get() i open url / aplication
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//System.out.println("=============Select Only One CheckBox=============");
		
//		driver.findElement(By.id("monday")).click();		
		
		//System.out.println("=======Select All CheckBox Using filter xpath=======");     
		
//		List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id, 'day')]"));
//		for(WebElement chkbox: checkBox)
//		{
//			chkbox.click();
//		}
		
		//System.out.println("=============Select CheckBox by Our Choice=============");
		
		List<WebElement> checkBoxDay = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id, 'day')]"));
		for(WebElement chkBox1: checkBoxDay)
		{
			String chkBoxName = chkBox1.getAttribute("id");
			if(chkBoxName.equals("sunday") || chkBoxName.equals("tuesday")||chkBoxName.equals("friday"))
			{
				chkBox1.click();
			}
		}
	
	
	
	}

}
