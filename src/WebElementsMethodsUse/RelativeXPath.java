package WebElementsMethodsUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPath {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://www.facebook.com/");
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type = 'text'][3]")).sendKeys("dasda");
		//absolute xpath
		//driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/input")).sendKeys("meg@gmail.com");

		//relative xpath
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc@1234");
	}

}
