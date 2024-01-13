package firstSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://javagoal.com/");
		
		Thread.sleep(100);
		
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(100);
		
		driver.navigate().back();
		
		
	}

}