package webTableStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IdentifyWebTable {

	public static void main(String[] args)
	{
		
		//Identify WebTable
		
		ChromeOptions chrmoptn = new ChromeOptions();
		chrmoptn.addArguments("start-maximized");
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//WebElement webTable= driver.findElement(By.xpath("//table[@name='BookTable']"));
		System.out.println("================how many rows in table=================");
		
		//how many rows in table
		
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(rows);   //7
		
		List<WebElement> rows1 = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		int numberOfRows= rows1.size();
		System.out.println(numberOfRows);  //7
		System.out.println("================how many column in table=================");
		
		
		//how many column in table
		
		int columns = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th")).size();
		System.out.println(columns);   //4
		
		List<WebElement> columns1 = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
		int numberOfColumns= columns1.size();
		System.out.println(numberOfColumns);   //4
		System.out.println("=================only one header reading====================");
		
		
		//only one header reading
		
		String readSingleHeader= driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]/th[3]")).getText();
		System.out.println(readSingleHeader); //subject
		System.out.println("===============whole row of header=====================");

		
		//whole row of header ==>use forEach Loop(findElments() use)
			
	    List<WebElement> tableHeader = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
		
		for(WebElement tableth :tableHeader)
		{
			System.out.print(tableth.getText()+"     ");
		}    //BookName  Author    Subject  Price

		System.out.println();
		System.out.println("==================print only one data form table===================");
		
		
		//print only one data form table
		
		String readSingleTableData = driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]/td[2]")).getText();
		System.out.println(readSingleTableData);
		System.out.println("=========how to read complete row from table===========");
		
		
		//how to read complete row from table 
		
		List<WebElement> readWholeTableData= driver.findElements(By.xpath("//table[@name='BookTable']//tr[6]/td"));
		for( WebElement rowTableData:readWholeTableData)
		{
			System.out.print(rowTableData.getText()+"      ");
		}
		System.out.println();
		System.out.println("=================read complete single column=========================");
		
		//read complete single column
		//List<WebElement> readWholeColumnTableData= driver.findElements(By.xpath("//table[@name='BookTable']//tr[7]/td[3]"));
		for(int i=2; i<=6; i++)
		{
			WebElement singleColmnData =

			driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[4]"));

			System.out.println(singleColmnData.getText());
		}
		
			
	}

}

