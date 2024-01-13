package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayUse {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		
		boolean result = driver.findElement(By.name("show-hide")).isDisplayed();
		Thread.sleep(1000);
		System.out.println("the result is "+result);
		driver.findElement(By.name("show-hide")).sendKeys("hello");
		Thread.sleep(1000);
		
		//hide
		driver.findElement(By.id("hide-textbox")).click();
		
		
		
		
	}

}
