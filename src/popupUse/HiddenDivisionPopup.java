package popupUse;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		
		Thread.sleep(1000);
//HiddenDivisionPopup
		
//		driver.findElement(By.xpath("//button[@data-testid='close-button']")).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//a[text()=' Upcoming Batches']")).click();
		//driver.findElement(By.linkText(" Upcoming Batches")).click();
		
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
