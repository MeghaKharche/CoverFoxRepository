package iFrameUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedUseIndex {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(1000);
		
		driver.switchTo().frame(0);
		
		Thread.sleep(1000);
		
		//outer frame
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi good night");
		Thread.sleep(1000);
		
		//switchto.frame()-->by using webelement
		driver.switchTo().frame(driver.findElement(By.id("frame3")));
		
		driver.findElement(By.xpath("//input[@id='a']")).click();
		//Thread.sleep(1000);
		
//		driver.get("https://demo.automationtesting.in/Frames.html");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
//		
//		driver.switchTo().frame(2);
//		String text= driver.findElement(By.xpath("//h5[text()='Nested iFrames']")).getText();
//		System.out.println(text);
	}

}
