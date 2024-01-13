package practiceForAllSeleniumTopic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertPopupUse {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		System.out.println("=========Handle To Alert Popup==========");
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	
		Alert handleAlertWindow = driver.switchTo().alert();
		
		String alertWindowText= handleAlertWindow.getText(); //for Alert Window getText
		System.out.println(alertWindowText);
		
		//handleAlertWindow.accept();	    //for ok
		
		handleAlertWindow.dismiss();  //for cancel 
		
	
	
	}
	
}
