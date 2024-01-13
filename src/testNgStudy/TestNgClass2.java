package testNgStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgClass2 
{
  @Test
  public void fbLaunch()
  {
	  WebDriver driver = new ChromeDriver();
	  //driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  Reporter.log("FB launching", true);
  }
  
  @Test
  public void instaLaunch()
  {
	  WebDriver driver= new ChromeDriver();
	  //driver.manage().window().maximize();
	  driver.get("https://www.instagram.com/");
	  Reporter.log("Insta launching", true);
  }
  
  @Test
  public void amazonLaunch()
  {
	  WebDriver driver= new ChromeDriver();
	  //driver.manage().window().maximize();
	  driver.get("https://www.amazon.in/");
	  Reporter.log("Amazon launching", true);
  }
}
