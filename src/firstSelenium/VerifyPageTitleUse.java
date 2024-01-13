package firstSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageTitleUse {

	public static void main(String[] args) throws InterruptedException
	{
		String expectedResult="📊 India's No.1 IT Training Center 📈";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(100);
		
		String actualResult= driver.getTitle();
	
		//System.out.println("actual result "+actualResult);
		
		if(expectedResult.equals(actualResult))
		{
			System.out.println(" this condition is pass");
		}
		else 
		{
			System.out.println("this is condition is fail");
		}
	}

}
