package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(100);
		//driver.findElement(By.xpath("//input[@class='suggestor-input ']"));
		//driver.findElement(By.xpath("//input[@class='suggestor-input ']")).sendKeys("SOFTWARE TESTING");
		//driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys("Womens Clothes");
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("womens cloths");
		//driver.findElement(By.xpath("//a[text()= 'Customer Service']")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Customer')]")).click();
	}
}
