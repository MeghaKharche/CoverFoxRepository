package webTableStudy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReadWholeWebTableUsingTheadAndTbody {

	public static void main(String[] args) 
	{
		ChromeOptions chrmoptn= new ChromeOptions();
		chrmoptn.addArguments("--headless");
		chrmoptn.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver(chrmoptn);
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//Read Whole Web Table Use Thead And Tbody(Table head ,table body)
		
		//1st get size to row

	
		
		//Nested For Loop --> compulsory aisa hi karna hai when we read whole tableData
		
		
		
		//get size to column
	}

}
