package popupUse;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Set;
import java.util.Iterator;
//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;
import screenshotuse.RandomMaker;
import screenshotuse.TakeScreenShotUse;

public class ChildWindowPopup 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		
		WebElement mainPageElement = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']"));
		System.out.println("this text available on main page ==> "+mainPageElement.getText());
		Thread.sleep(1000);
		
		
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		
		String mainPageId= driver.getWindowHandle();
		System.out.println("This is a Main page id==> "+mainPageId);
		
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println("get id MainPage and ChildWindow==>"+allWindowsId);
		
		Iterator<String> it = allWindowsId.iterator();
		String mainPageId1= it.next();
		String childWindowId= it.next();
		
		System.out.println("This is a Main page id==> "+mainPageId1);
		System.out.println("This is a ChildWindow id==> "+childWindowId);

		driver.switchTo().window(childWindowId);
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		//driver.close();
		
		driver.findElement(By.id("the7-search")).sendKeys("Hiiiiiiiiiii");
		Thread.sleep(1000);
		
		driver.switchTo().window(mainPageId1);
		Thread.sleep(1000);
		
		driver.findElement(By.name("NewTab")).click();
		
		//driver.findElement(By.xpath("(//span[text()='Selenium'])[1]")).click();
		
		 							//TakesScreenShot	
		//1st i create object of file class & use getScreenshotAs() & in that i pass arguments as OutputType.file
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String sequence = RandomString.make(3);
		
		Date d = new Date();
		 
		//screenshot image by date Wed_Nov_22_00_32_46_IST_2023.png
		String fileName = d.toString().replace(":", "_")+".png";
		System.out.println("screenshot image by date "+fileName);
		
		//but this image save to temprarory memory so i want to save desired location(own) so i use
		//using file class to save image in desired location and in that we pass desired path of image
		File destination = new File("F:\\Screenshot\\childwindowimage "+fileName);
		 
		//i want to copy this image particular location so i use .copy() this is present in 
		//the filehandler class inside the copy() we pass argument as a source to destination
		FileHandler.copy(source, destination);
		 
	}

}
