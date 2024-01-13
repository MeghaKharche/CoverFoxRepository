package practivceUseAllPaths;

import java.util.List;
import java.util.Iterator;

import org.openqa.selenium.Alert;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import popupUse.ChromeOptionClassUse;

public class UseAllSelenium {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions chrmopt = new ChromeOptions();
		//chrmopt.addArguments("--headless"); 
		chrmopt.addArguments("start-maximized");
		//chrmopt.addArguments("incognito");
		
		WebDriver driver = new ChromeDriver(chrmopt);	
	
		driver.get("https://testautomationpractice.blogspot.com/");
		
 		Thread.sleep(1000);
 		
// 		JavascriptExecutor js = (JavascriptExecutor)driver;
// 		//js.executeScript("window.scrollBy(0,700)");
//		Thread.sleep(2000);
//		
// 		WebElement nameTextBox= driver.findElement(By.id("name"));
// 		
// 		js.executeScript("arguments[0].value='megha';",nameTextBox);
// 		
// 		driver.findElement(By.id("email")).sendKeys("meghkharche10@gmail.com");
// 		driver.findElement(By.id("phone")).sendKeys("9678547383");
// 		Thread.sleep(1000);
 		
 		
		
 	//	Boolean genderButton= driver.findElement(By.xpath("//input[@id='female']")).isSelected();
 		
 		//System.out.println(genderButton);
 	
 		//driver.findElement(By.xpath("//input[@id='female']")).click();

 		//Using scroll (go the particular element)
 		
 		
 		//js.executeScript("arguments[0].click();",);
 		
// 	List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox']")); 		
// 		for(int i =0; i<checkBox.size(); i++)
// 		{
// 			 checkbox = checkBox.size().click();
// 		}
 		
 		//dropdown
 		
 		//WebElement countryDropDown = driver.findElement(By.id("country"));
 		
 		//Select s = new Select(countryDropDown);
 		
 		//s.selectByIndex(9);
 		//Thread.sleep(1000);
 		//System.out.println(s.getFirstSelectedOption().getText());
 		
 		//List<WebElement> multipleList = driver.findElements(By.id("colors"));
 		//Select mullist1 = new Select(multipleList);
 		
 		
 		//multipleList.deselectByValue("yellow");
 		
// 		Iterator<WebElement> mulist = multipleList.iterator();
// 		
// 		while(mulist.hasNext())
// 		{
// 			System.out.println(mulist.next().);
// 		}
// 		
 		//System.out.println(s.isMultiple());
 		
 		
// 		List<WebElement> multipleList = s.getOptions();
// 		
// 		for(WebElement list: multipleList)
// 		{
// 			 lis
//		}
 		
 		//JavascriptExecutor js = (JavascriptExecutor)driver;
// 		js.executeScript("window.scrollBy(0,700)");
//		Thread.sleep(2000);
	
 		//WebElement webTable = driver.findElemswitchent(By.xpath("//h2[text()='Web Table']"));
 		
 		//js.excuteScript("arguments[0].scollIntoView();",webTable);
	
 		//popup
 		
 		driver.findElement(By.xpath("//button[text()='Alert']")).click();
 		Thread.sleep(1000);
 
 		Alert alert1 = driver.switchTo().alert();
 		String alertText= alert1.getText();
 		
 		System.out.println("alert get text use==> "+alertText);
 		
 		alert1.accept();
 		
 		driver.findElement(By.xpath("//button[text()='Confirm Box'")).click();
 		
// 		Alert confirmBox = driver.switchTo().alert();
// 		
// 		String text1= confirmBox.getText();
// 		
// 		System.out.println("ConfirmBox get text ==> "+text1);
//
// 		confirmBox.dismiss();
	}

}
