package unorderedListUse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedListRandomList 
{

	public static void main(String[] args) throws InterruptedException
	{
//we have to create webdriver instance(driver) and launch chrome browser
		WebDriver driver = new ChromeDriver();
		
//maximize the window --> multiple methods means-->method chaining
		driver.manage().window().maximize();

//we have to launch application using get()	
		driver.get("https://www.google.com");
		Thread.sleep(1000);
				
//WebElement searchdropdownlist = driver.findElement(By.xpath("//textarea[@name = 'q']"));//.sendKeys("honda");
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(1000);
				
		List<WebElement> searchlistresult = driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]/ul/li"));
				
				for(WebElement dropdownlist:searchlistresult)
				{
					System.out.println(dropdownlist.getText());
				}
				
				String expectedresult = "honda city";
				for(WebElement dropdownlist1 : searchlistresult )
				{
					String actualresult = dropdownlist1.getText();
					if(actualresult.equals(expectedresult))
					{
						dropdownlist1.click();
						break;
					}
				}
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//a[text()='Images']")).click();
				Thread.sleep(1000);
				
				driver.navigate().back();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//a[text()='News']")).click();
				driver.close();
			}

	

}
