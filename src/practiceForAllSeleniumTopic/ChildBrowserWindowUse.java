package practiceForAllSeleniumTopic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserWindowUse {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		Thread.sleep(1000);
		
		System.out.println("===========Handle Child Browser Window Popup=========");
		
		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='click']")).click();
		Thread.sleep(1000);
		
		Set<String> allWindowGetId = driver.getWindowHandles();
		System.out.println("Main Page ID & Child Window ID ==> "+allWindowGetId);
		
		Iterator<String> it = allWindowGetId.iterator();
		String mainPageId = it.next();
		String childWindowId = it.next();
		
		driver.switchTo().window(childWindowId);
		Thread.sleep(1000);
		
		System.out.println("==============Using Scrolling============");
		
		WebElement scrollElement = driver.findElement(By.xpath("//h2[text()='Donate to Selenium']"));
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		scroll.executeScript("arguments[0].scrollIntoView();",scrollElement);
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("About Selenium")).click();
		Thread.sleep(1000);
		
		driver.switchTo().window(mainPageId);
		
		
	
	}

}
