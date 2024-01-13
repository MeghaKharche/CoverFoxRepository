package setPositionAndSetDimensionUse;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;
import screenshotuse.RandomMaker;

public class SetDimention {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
	
		//i check window size using getSize() the return type of getSize() is Dimension
		Dimension defaultSize = driver.manage().window().getSize();
		
		System.out.println(defaultSize);
		
		//when we fix the size of window so, we create Dimension object and pass parameter
		//i.e (width, height) using setsize() we have to set size of window
		Dimension d = new Dimension(280, 2000);
		Thread.sleep(1000);
		driver.manage().window().setSize(d);

		Dimension d1 = new Dimension(1000, 600);
		Thread.sleep(1000);
		driver.manage().window().setSize(d1);
		
				
		
	}

}
