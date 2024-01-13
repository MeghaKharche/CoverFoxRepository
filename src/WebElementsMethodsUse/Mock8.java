package WebElementsMethodsUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock8 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://hotstar.com/in/mypage");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//span[text() = 'Log In']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("7")).sendKeys("9878679876");
		Thread.sleep(1000);
		
		boolean result = driver.findElement(By.xpath("//span[text() = 'Get OTP']")).isDisplayed();
		System.out.println(" the Isdisplaed result is "+result);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text() = 'Get OTP']")).click();
		
	}

}
