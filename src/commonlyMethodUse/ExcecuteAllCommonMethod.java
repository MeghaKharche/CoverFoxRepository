package commonlyMethodUse;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcecuteAllCommonMethod 
{
	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//immplicitlyWaituse
		UseCommonlyMethod.implicitlywaitsused(driver, 2);
		
		//scrolling
	    WebElement scroll = driver.findElement(By.xpath("//h2[text()='Web Table']"));
		UseCommonlyMethod.scrollingPage(driver, scroll);
		
		//ExcelSheet
		//driver.get("https://testautomationpractice.blogspot.com/");
		WebElement fullName= driver.findElement(By.id("name"));
		WebElement emailId= driver.findElement(By.id("email"));
		WebElement phoneNumber= driver.findElement(By.id("phone"));
		WebElement fullAddress= driver.findElement(By.id("textarea"));
		WebElement genderButton= driver.findElement(By.name("gender"));
		
		//1st row Data in ExcelSheet
//		fullName.sendKeys(UseCommonlyMethod.writeDataFromExcelSheet(1,0));
//		emailId.sendKeys(UseCommonlyMethod.writeDataFromExcelSheet(1,1));
//		phoneNumber.sendKeys(UseCommonlyMethod.writeDataFromExcelSheet(1,2));
//		fullAddress.sendKeys(UseCommonlyMethod.writeDataFromExcelSheet(1,3));
		
		//takesScreenshot
//		UseCommonlyMethod.takeScreenshotPage(driver,"FirstExcelSheetData");
	
		//2nd row Data in ExcelSheet
		fullName.sendKeys(UseCommonlyMethod.writeDataFromExcelSheet(2,0));
		emailId.sendKeys(UseCommonlyMethod.writeDataFromExcelSheet(2,1));
		phoneNumber.sendKeys(UseCommonlyMethod.writeDataFromExcelSheet(2,2));
		fullAddress.sendKeys(UseCommonlyMethod.writeDataFromExcelSheet(2,3));
		genderButton.click();
		//takesScreenshot
		UseCommonlyMethod.takeScreenshotPage(driver,"SecondExcelSheetData");
	
		//3nd row Data in ExcelSheet
//		fullName.sendKeys(UseCommonlyMethod.writeDataFromExcelSheet(3,0));
//		emailId.sendKeys(UseCommonlyMethod.writeDataFromExcelSheet(3,1));
//		phoneNumber.sendKeys(UseCommonlyMethod.writeDataFromExcelSheet(3,2));
//		fullAddress.sendKeys(UseCommonlyMethod.writeDataFromExcelSheet(3,3));
//		genderButton.click();
//		
//		//takesScreenshot
	UseCommonlyMethod.takeScreenshotPage(driver,"ThirdExcelSheetData");
	}

}
