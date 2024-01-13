package mouseActionUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndMoveToElementUse {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(1000);
		
		//1st we find out the locator of webelement whenever we perform action on webpage
		//& to store one ref. variable of WebElement
		
		WebElement registerButton = driver.findElement(By.id("newTabsBtn"));
		Thread.sleep(1000);
		
		driver.findElement(By.id("registerbtn")).click();
		
		//then we create action class object and inside the action class we pass 
		//parameter as driver
		Actions act = new Actions(driver);
		
		//using one actions class methods perform on action
		act.moveToElement(registerButton).click().perform();
	}

}
