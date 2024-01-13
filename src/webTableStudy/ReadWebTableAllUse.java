package webTableStudy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReadWebTableAllUse {

	public static void main(String[] args) 
	{
		ChromeOptions chrmoptn= new ChromeOptions();
		chrmoptn.addArguments("--headless");
		chrmoptn.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver(chrmoptn);
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//Get size
		int rowSize = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Read Rows Size ==> "+rowSize);
		
		System.out.println("========================================================");
		
		int columnSize = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Read Column Size ==> "+columnSize);
		
		System.out.println("========================================================");
		
		//Read one header
		WebElement oneheader = driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]/th[2]"));
		System.out.println("Read Only One Element ==> "+oneheader.getText());
		
		System.out.println("========================================================");
		
		//To Read all header
		List<WebElement> allHeader = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
		for(WebElement wheader:allHeader)
		{
			System.out.println("Read All Header ==> "+wheader.getText());
		}
		
		System.out.println("========================================================");
		
		//Read 1 row only one table data value
		WebElement oneRowData= driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]/td[2]"));
		System.out.println("Read only one Table Data ==> "+oneRowData.getText());
		
		System.out.println("========================================================");
		
		//Read 1 Whole Rows Data
		List<WebElement> wholeOnerowdata = driver.findElements(By.xpath("//table[@name='BookTable']//tr[6]/td"));
		for(WebElement wholeRows:wholeOnerowdata)
		{
			System.out.println("Read Whole 1Rows Data ==> "+wholeRows.getText());
		}
		
		System.out.println("========================================================");
		
		//Read 1 Whole Column ===>Manually 
		for(int i=2;i<=7; i++)
		{
			WebElement wholeOneColumn= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[4]"));
			System.out.println("Read Whole 1 Column ==> "+wholeOneColumn.getText());
		}
		
		System.out.println("========================================================");
		
		//Read Whole WebTable ==> then we use Nested loop
		
		int numberRowSize = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Read Rows Size ==> "+rowSize);
		
		System.out.println("========================================================");
		
		int numberColumnSize = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Read Column Size ==> "+columnSize);
		
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
		
		
		
		
		
		
		
	//	System.out.println("========================================================");
		
		
		
		
		
		
		
	}

}
