package webElementsMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownUse {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		
//find element in the webpage eg.Day,Month,(in that we create findelement reference variable) 
		
		//create object of select class to store in refernece variable
		
		// inspect -->select--> expand--> i have choose months-->march-->

	}

}
