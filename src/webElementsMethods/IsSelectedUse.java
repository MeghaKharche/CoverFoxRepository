package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedUse {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mycards.hdfcbank.com/?lgcode=mktg&?mc_id=website_organic_CC_dropdown&icid=website_organic_CC_dropdown");
		Thread.sleep(500);
		
		driver.findElement(By.className("css-11aywtz")).sendKeys("9876567843");
		//driver.findElement(By.className("css-901oao")).isEnabled();
		//boolean result = driver.findElement(By.xpath("//div[text() = 'Get OTP']")).isEnabled();
		boolean result = driver.findElement(By.className("css-901oao")).isEnabled();
		System.out.println("the result is "+result);
		driver.findElement(By.xpath("//div[text() = 'Get OTP']")).click();
	}

}
