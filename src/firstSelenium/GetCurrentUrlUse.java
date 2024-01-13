package firstSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlUse {

	public static void main(String[] args) throws InterruptedException
	{
		String expectedResult="Velocity | Best Software Training Center";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://javagoal.com/");
		
		Thread.sleep(1000);
		
		String url = driver.getCurrentUrl();
		
		System.out.println("url-->"+url);
		
		if(expectedResult.equals(url))
		{
			System.out.println("");
		}
	}

}
