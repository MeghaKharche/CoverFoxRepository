package practivceUseAllPaths;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopupUse {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		
		//take= (TakesScreenshot)driver;
		
//		driver.findElement(By.name("NewWindow")).click();
//		
//		Set<String> getId = driver.getWindowHandles();
//		System.out.println("get mainpage ID & Child Window ID "+getId);
//		
//	    Iterator<String> it = getId.iterator();
//	    String mainPageId = it.next();
//	    String childBrowserId= it.next();
//	    
//	    driver.switchTo().window(childBrowserId);
	    
	    
	    
	    
	}

}
