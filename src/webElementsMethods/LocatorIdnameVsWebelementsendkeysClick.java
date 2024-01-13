package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorIdnameVsWebelementsendkeysClick
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(100);
		
		//using navigator
		/*driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(100);
		driver.navigate().forward();
		Thread.sleep(100);
		
		driver.navigate().refresh();
		Thread.sleep(100);
		driver.navigate().back();*/
		
		//using locator id and name
		driver.findElement(By.id("email")).sendKeys("devansh@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.name("pass")).sendKeys("dev@1234");
		Thread.sleep(500);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.name("pass")).clear();
		Thread.sleep(500);
		driver.findElement(By.id("email")).sendKeys("devansh@gmail.com");
		driver.findElement(By.className("_97w4")).click();
		Thread.sleep(500);
		driver.findElement(By.name("email")).sendKeys("devansh@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.id("did_submit")).click();
	}
}
