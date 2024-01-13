package practiceForAllSeleniumTopic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopupUse 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.get("https://vctcpune.com/");
		
		System.out.println("===========Handle Hidden Division Popup============");
		
		String hiddenPopupGetText= driver.findElement(By.xpath("//h2[contains(text(), 'Get in touch ')]")).getText();
	    System.out.println("Hidden Division by text ==> "+hiddenPopupGetText);
	    
	    driver.findElement(By.xpath("//button[@data-testid='close-button']")).click();
	}
}
