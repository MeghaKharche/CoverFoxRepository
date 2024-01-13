package WebElementsMethodsUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class webElementsMethods 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(500);
		//isDisplayed
		 boolean resultdisplay= driver.findElement(By.id("hide-textbox")).isDisplayed();
		System.out.println("using isdisplayed "+resultdisplay);
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("show-textbox")).click();
		driver.findElement(By.className("inputs displayed-class")).sendKeys("ISdisplays");		
		
		//IsSelected
		
		boolean result = driver.findElement(By.id("dropdown-class-example")).isSelected();
		System.out.println("using IsSelected " +result);
		driver.findElement(By.id("dropdown-class-example")).click();
		Thread.sleep(500);
	
	}

}
