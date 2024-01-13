package iFrameUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedUse {

	public static void main(String[] args) throws InterruptedException 
	{
		//create webdriver instance
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//to launch webpage using get()
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(1000);
		
		//main page to frame 1
		
		driver.switchTo().frame("frame1");
		Thread.sleep(1000);
		
		//outer frame
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi good night");
		Thread.sleep(1000);
		
	//	driver.switchTo().defaultContent();
		
		//goto outer frame to inner frame
		driver.switchTo().frame("frame3");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='a']")).click();
		Thread.sleep(1000);
		
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		
		//clear to outer frame -->text field
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		Thread.sleep(1000);
		
		//goto outer page to main page
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		//goto to another frame
		driver.switchTo().frame("frame2");
		Thread.sleep(1000);
		
		WebElement animaldropdown = driver.findElement(By.id("animals"));
		
		Select s = new Select(animaldropdown);
		
		s.selectByVisibleText("Baby Cat");
		Thread.sleep(1000);
		
		driver.quit();

	}

}
