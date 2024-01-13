package practivceUseAllPaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingAllpaths {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.get("https://www.amazon.in/ap/signin");
		Thread.sleep(1000);
		
		
		

	}

}
