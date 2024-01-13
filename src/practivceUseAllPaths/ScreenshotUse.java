package practivceUseAllPaths;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenshotUse {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		//we have create webdriver instance
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//i launch browser using get() 
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=678711876615&hvpos=&hvnetw=g&hvrand=15367507498918019430&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9299648&hvtargid=kwd-10573980&hydadcr=14453_2371562");
		Thread.sleep(1000);
		
		//to take screenshot
		//i use getScreenshotAs() this is present in TakesScreenshot interface
		
		
	 
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		RandomString stringimage = new RandomString();
		String s = stringimage.make(1);
		
		File destination = new File("F:\\Screenshot\\amazon__"+s+".png");
		
		FileHandler.copy(source, destination);
	
	}

}
