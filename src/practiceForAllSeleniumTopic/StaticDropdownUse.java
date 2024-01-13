package practiceForAllSeleniumTopic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdownUse {

	public static void main(String[] args) 
	{
		//i create instance of webDriver OR using new i create object of ChromeDriver 
		WebDriver driver = new ChromeDriver();
				
		//maximize browser window
		driver.manage().window().maximize();
		
		//using get() i open url / aplication
		//driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.get("https://testautomationpractice.blogspot.com/");
		
		System.out.println("==============How to handle static dropdown===============");
		
		WebElement CountryDropdwonList= driver.findElement(By.id("country"));
	
		//i create select class object & pass WebElement ref. variable as a parameter
		Select s = new Select(CountryDropdwonList);
		
		// 3 methods present in select class 
		//i using one of the select class method i get the value of dropdown list
		
		s.selectByVisibleText("India");
		//s.selectByValue("india");
		//s.selectByIndex(9);
	}

}
