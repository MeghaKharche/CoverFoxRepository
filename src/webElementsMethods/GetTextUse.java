package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextUse 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(500);
		
		//driver.findElement(By.id("email")).sendKeys("devansh@gmail.com");
		//driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");)
	}
}
