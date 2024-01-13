package coverFox_PropertiesFiles_Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

//Read Data Using Properties Files

public class BaseClass_Using_PropertiesFiles 
{
	static protected WebDriver driver;
	
	//Launch coverFox Apllication
	public void launchCoverFoxApplication() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Reporter.log("Launch coverFox Application", true);
		driver.get("https://www.coverfox.com/");
		Thread.sleep(2000);
	}
	
	public void closeCoverFoxBrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		Reporter.log("Close CoverFox Application", true);
		driver.close();
	}
}
