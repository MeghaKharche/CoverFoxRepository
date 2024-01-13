package useJavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollingByUse 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions copt = new ChromeOptions();
		copt.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver(copt);
		driver.get("https://www.globalsqa.com/");
		Thread.sleep(1000);
	
		//Use Type Cast object i.e driver to javaScriptExecutor(Interface)
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//DownPage
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		
		//downPage
		js.executeScript("window.scrollBy(0,2700)");
		Thread.sleep(2000);
		
		//upPage 
		js.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(2000);
		
		//DownPage
		js.executeScript("window.scrollBy(1000,1000)");
		Thread.sleep(2000);
				
		
	}

}
