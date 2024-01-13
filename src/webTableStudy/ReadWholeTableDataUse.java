package webTableStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ReadWholeTableDataUse {

	public static void main(String[] args) 
	{
		ChromeOptions chrmoptn= new ChromeOptions();
		chrmoptn.addArguments("--headless");
		chrmoptn.addArguments("start-maximized");
	
		WebDriver driver= new ChromeDriver(chrmoptn);
		//driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Read Whole WebTable ==> then we use Nested loop
		
		int numberRowSize = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Read Rows Size ==> "+numberRowSize);
		
		System.out.println("========================================================");
		
		int numberColumnSize = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Read Column Size ==> "+numberColumnSize);
		
		System.out.println("======================================================");
		
		//Nested Loop
		for(int i=1; i<=numberRowSize; i++) //inner loop
		{
			for(int j=1; j<=numberColumnSize; j++) //outer loop
			{
				if(i==1)
				{
					WebElement readWholeHeader = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/th["+j+"]"));
					System.out.print(readWholeHeader.getText()+"   ");
				}
				else
				{
					WebElement readWholeTableData= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td["+j+"]"));
					System.out.print(readWholeTableData.getText()+"  ");
				}
			}System.out.println();
			System.out.println("==============================================================");
		}	
	}

}
