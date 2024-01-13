package testNg_SerialParallelExcecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenAjio 
{
  @Test
  public void ajioTest() 
  {
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.ajio.com/");
  }
}
