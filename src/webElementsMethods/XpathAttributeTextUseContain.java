package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAttributeTextUseContain 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(100);
		
		//using xpath attribute
		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("Womens Clothes");
		Thread.sleep(500);
		
		//using xpath attribute
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		Thread.sleep(100);
		
		//using xpath text
		driver.findElement(By.xpath("//a[text()= 'Customer Service']")).click();
		Thread.sleep(500);
		
		//using xpath text contains
		driver.findElement(By.xpath("//a[contains(text(), 'Deals')]")).click();
	}

}
