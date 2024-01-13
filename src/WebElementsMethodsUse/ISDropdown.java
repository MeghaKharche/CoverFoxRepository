package WebElementsMethodsUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ISDropdown 
 {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Csign%20in%20to%20facebook%7C&placement&creative=589460569891&keyword=sign%20in%20to%20facebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-11079269337%26loc_physical_ms%3D9301185%26loc_interest_ms%3D%26feedi");
		
	    //1. identify list box to be handle & store in reference variable
		WebElement date= driver.findElement(By.id("day"));
		
		//2. we can create object of select class & pass the args
		Select sdate = new Select(date);
		
		//3.
		sdate.selectByIndex(1);
		Thread.sleep(1000);
		
		//month
		 WebElement month = driver.findElement(By.id("month"));
		 Select smonth = new Select(month);
		 smonth.selectByVisibleText("Apr");
		// smonth.deselectByValue("4");
		 Thread.sleep(1000);
		 
		 //year
		  WebElement year = driver.findElement(By.id("year"));
		  Select syear = new Select(year);
		  syear.selectByValue("4");
	}

}
