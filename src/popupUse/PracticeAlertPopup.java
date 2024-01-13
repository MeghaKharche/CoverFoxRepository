package popupUse;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAlertPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		//click button alert so open alert message
		driver.findElement(By.xpath("//button[text()= 'Alert']")).click();
		Thread.sleep(1000);
		
		//i handle to alert message
		//1st before any action perform alert window we need switchTo() alert window 
		Alert handleAlertMessage = driver.switchTo().alert();
		
		//close alert window using ok button
		handleAlertMessage.accept();
		
		//by gettext inside the alert window
		handleAlertMessage.getText();
		System.out.println(handleAlertMessage);
		

	}

}
