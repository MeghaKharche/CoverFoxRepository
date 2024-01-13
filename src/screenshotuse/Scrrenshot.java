package screenshotuse;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Scrrenshot {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(1000);
		
	//File source= ((TakeScreenShotUse)driver).getScreenshotAs(OutputType.FILE);
				
		//File destination = new File(""));
		//FileHandler(source,destination);
	}

}
