package screenshotuse;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.print.attribute.standard.Destination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class TakeScreenShotUse {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sbicard.com/creditcards/app/user/login");
		//driver.get("https://www.bacci.com/en/our-clients/");
		Thread.sleep(1000);
		
		//File myfile = ((TakeScreenshot)driver).getScreenshotAs();
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

//RandomString
		
		RandomString rs = new RandomString();
		
		System.out.println(rs.make(3));
		String s = rs.make(3);

		//usingDate
		
		Date d = new Date();
		
		System.out.println(d);
		
		System.out.println(source);
		File destination = new File("F:\\Screenshot\\myscreenshot__"+s+".png");
		
		FileHandler.copy(source,destination);
		
	}

}
