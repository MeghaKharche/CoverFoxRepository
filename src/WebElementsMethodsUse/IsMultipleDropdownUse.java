package WebElementsMethodsUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleDropdownUse
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
		
		WebElement muldropdown = driver.findElement(By.name("name"));
		Select smuldropdown = new Select(muldropdown);
		smuldropdown.selectByVisibleText("Volvo");
		smuldropdown.selectByIndex(2);
	}
}
