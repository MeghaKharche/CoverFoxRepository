package commonlyMethodUse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class UseCommonlyMethod 
{
	//without creating object we use only static Method and pass parameter
	//ExcelSheet
	//TakeScreenshot
	//scrolling 
	//waiting
	
	
	//immlicitlywait
	
	public static void implicitlywaitsused(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	public static void takeScreenshotPage(WebDriver driver , String fileName) throws IOException
	{
		//TakesScreenShot
		
		TakesScreenshot js = (TakesScreenshot)driver;
		File source = js.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("F:\\Screenshot\\"+fileName+".png");
		FileHandler.copy(source, destination);
	}
	
	
	//scrolling ==>javScriptExecutor
	
	public static void scrollingPage(WebDriver driver, WebElement Result)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		implicitlywaitsused(driver, 10);
		js.executeScript("arguments[0].scrollIntoView();",Result);
	}
	
	
	//write Data From ExcelSheet in webpage 
	
	public static String writeDataFromExcelSheet(int row, int col) throws EncryptedDocumentException, IOException
	{
		FileInputStream myFile = new FileInputStream("F:\\ExcelSheetEclilpse\\PracticeAutomation.xlsx");
		Workbook myExcelSheet = WorkbookFactory.create(myFile);
		String value = myExcelSheet.getSheet("sheet1").getRow(row).getCell(col).getStringCellValue();
		return value;
	}
	

	
	
	

}
