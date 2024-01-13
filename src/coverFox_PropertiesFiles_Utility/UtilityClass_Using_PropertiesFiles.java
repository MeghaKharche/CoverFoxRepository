package coverFox_PropertiesFiles_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import screenshotuse.TakeScreenShotUse;

//Read Data Using Properties Files

public class UtilityClass_Using_PropertiesFiles
{
	private static final String TakesScreenShot = null;

	public String readDataUsingPropertiesFiles() throws IOException
	{
		//create object of properties files
		Properties prop = new Properties();
		
		//create object of FileInputStream
		FileInputStream myFile = new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\first_page\\seleniumMegha\\CoverFoxReadDataUsingPropertyFiles.properties");
		
		//using properties object name load this
		prop.load(myFile);;
		
		// using getProperty() that we write property file key 
		Reporter.log("Select Age From Properties Files", true);
		String age = prop.getProperty("age");
		return age;
	}
	
	public void takeScreenShotTimestamp(WebDriver driver ,String TCID) throws IOException
	{
		//using timestamp
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		
		//TakescreenShot 
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File Destination = new File("F:\\Screenshot\\coverFoxusingPropertiesFiles"+TCID+"_"+timeStamp+".png");
		
		Reporter.log("TakeScreenShot with timeStamp using properties files", true);
		FileHandler.copy(source, Destination);
		
	}

}
