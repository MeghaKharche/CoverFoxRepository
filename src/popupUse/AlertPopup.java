package popupUse;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(1000);
		
					//AlertPopup
				
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		Alert alertmsg = driver.switchTo().alert();
		Thread.sleep(1000);
		
		alertmsg.dismiss();
		Thread.sleep(1000);
		driver.findElement(By.name("cusid")).sendKeys("34324");
				

	}

}
