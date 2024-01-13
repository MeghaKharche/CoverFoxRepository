package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UseAllLocators 
{ 
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		Thread.sleep(500);
		
		driver.findElement(By.name("EmailHomePage")).sendKeys("dev@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.name("EmailHomePage")).clear();	
		Thread.sleep(500);
		
		driver.findElement(By.id("Form_submitForm_EmailHomePage")).sendKeys("sonal@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.name("action_request")).click();
		
		driver.findElement(By.id("Form_getForm_Name")).sendKeys("jojo");
		Thread.sleep(500);
		driver.findElement(By.id("Form_getForm_Contact")).sendKeys("9878674563");
		Thread.sleep(500);
		WebElement dropdown = driver.findElement(By.id("Form_getForm_Country"));
		Thread.sleep(500);
		Select s = new Select(dropdown);
		Thread.sleep(500);
		s.selectByValue("India");
		Thread.sleep(500);
		
		//use contains
		
		driver.navigate().back();
		driver.findElement(By.xpath("//input[text() = 'Supercharge your HR team & empower your people with powerful HR software']"));
		
	
		
		
		
		
		
		
	}

}
