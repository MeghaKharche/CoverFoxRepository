package firstSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageTitle {

	public static void main(String[] args) throws InterruptedException
	{
		String expectedResult="Velocity | Best Software Training Center";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		
		Thread.sleep(100);
		
		String actualResult = driver.getTitle();
		
		if(expectedResult.equals(actualResult))
		{
			System.out.println("This is actual result");
		}
		else
		{
			System.out.println("this is expected result");
		}
	}

}
