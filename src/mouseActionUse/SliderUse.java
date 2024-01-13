package mouseActionUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SliderUse {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(1000);
		
		//1st we find out the locator of webelement whenever we perform action on webpage
		//& to store one ref. variable of WebElement
		
	//	driver.findElement(By)

	}

}
