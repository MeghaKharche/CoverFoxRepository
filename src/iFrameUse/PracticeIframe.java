package iFrameUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeIframe {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(1000);
		
		
		driver.switchTo().frame("frame1");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type= 'text']")).sendKeys("Hi Good Morning");
		Thread.sleep(1000);
		
		driver.switchTo().frame("frame3"); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='a']")).click();
		Thread.sleep(1000);
		
		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		driver.switchTo().frame(1);
		Thread.sleep(1000);
		
		WebElement animaldroplist = driver.findElement(By.xpath("//select[@id= 'animals']"));
		Select dropdownanimallist = new Select(animaldroplist);
		dropdownanimallist.selectByIndex(1);
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		driver.switchTo().frame("frame1");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type= 'text']")).clear();
		Thread.sleep(1000);
		
//		driver.switchTo().defaultContent();
//		Thread.sleep(1000);
		
//		driver.switchTo().frame("frame2");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//select[@id= 'animals']")).clear();
//		Thread.sleep(1000);
	
	}

}
