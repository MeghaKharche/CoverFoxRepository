package testNgStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNg1stClass {
  @Test
  public void f() throws InterruptedException 
  {
	  	WebDriver driver = new ChromeDriver();
	  	driver.manage().window().maximize();
	  	driver.get("https://www.facebook.com/");
	  	Thread.sleep(1000);
  }
}
