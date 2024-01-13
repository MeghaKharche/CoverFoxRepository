package crossBrowserTestingFB;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

public class CrossBrowser_FBAccountPage 
{
	@Parameters("browserNameXmlFile")
	
  @Test
 
  public void crossBrowser(String browserName) throws InterruptedException 
  {
		WebDriver driver =null;
		if(browserName.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		
		else if (browserName.equals("fireFox"))
		{
			driver= new FirefoxDriver();
		}
		
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.name("firstname")).sendKeys("Sonal");
		driver.findElement(By.name("lastname")).sendKeys("Warade");
		driver.findElement(By.name("reg_email__")).sendKeys("7588474638");
		Thread.sleep(4500);
		driver.close();
  }
}
