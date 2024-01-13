package synchronizationWait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//used only one time implicit wait
public class ImplicitWait
{
	public static void main(String[] args)
	{
		ChromeOptions chrmoptn = new ChromeOptions();
		chrmoptn.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(chrmoptn);
		driver.get("https://upstox.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	}
}
