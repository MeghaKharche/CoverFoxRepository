package practiceForAllSeleniumTopic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdownHandle {

	public static void main(String[] args) 
	{
		
		//i create instance of webDriver OR using new i create object of ChromeDriver 
		WebDriver driver = new ChromeDriver();
				
		//maximize browser window
		driver.manage().window().maximize();
		
		//using get() i open url / aplication
		driver.get("https://testautomationpractice.blogspot.com/");
		
		System.out.println("=============How to handle Multiple Dropdown==============");
		
		WebElement colorMultipleDropdown= driver.findElement(By.id("colors"));
		System.out.println(colorMultipleDropdown);
		
		Select s = new Select(colorMultipleDropdown);
		s.selectByValue("red");
		s.selectByVisibleText("Blue");
		s.selectByIndex(4);
	
		
	}

}
