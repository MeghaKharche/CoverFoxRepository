package iFrameUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameUseExample1 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(1000);
		
		//driver.switchTo().frame("singleframe");
		String s = driver.findElement(By.xpath("//h5[text() = 'iFrame Demo']")).getText();
		System.out.println("using getText()--"+s);
		Thread.sleep(1000);

		//driver.switchTo().parentFrame(); // defaultCotent() used to check displyed or not 
		WebElement d = driver.findElement(By.linkText("Iframe with in an Iframe"));
		System.out.println(d.isDisplayed());
		//Thread.sleep(1000);
		
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
//		//we are onmain page -->need to switch focus from main page to outer page
//		
//		driver.switchTo().frame(0);//outer frame
//		Thread.sleep(100);
//		driver.switchTo().frame(1); //inner frame
	}

}
