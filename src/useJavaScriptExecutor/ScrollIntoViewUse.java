package useJavaScriptExecutor;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class ScrollIntoViewUse {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		ChromeOptions copt = new ChromeOptions();
		copt.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver(copt);
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		
		
		WebElement breakingNews = driver.findElement(By.xpath("//span[text()='Breaking news']"));
		Thread.sleep(1000);
		
		//Use Type Cast object i.e driver to javaScriptExecutor(Interface)
		JavascriptExecutor js = (JavascriptExecutor)driver;		
		
		//use scrollIntoView()
		js.executeScript("arguments[0].scrollIntoView();", breakingNews);
		Thread.sleep(2000);
		
		//TakeScreenshot ==> only some part(section) of webpage not full page 
		File src = breakingNews.getScreenshotAs(OutputType.FILE);
		File dest= new File("F:\\Screenshot\\breakingNews.png");

		FileHandler.copy(src, dest);
		
		//Element ki value chahiye
		System.out.println(breakingNews.getLocation().y);
	}

}
