package popupUse;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionClassUse {

	public static void main(String[] args) throws InterruptedException
	{
		//1) we have to create object of ChromeOptions class
		ChromeOptions copt = new ChromeOptions();
							//1st way
		//2) then we use addArguments() method we pass parameter as a whatever we have to use -->--headless,start-maximized
		
		//copt.addArguments("")
		//copt.addArguments("--headless");
		//copt.addArguments("incognito");
		//copt.addArguments("-disable-notifications");
		//copt.addArguments("start-maximized");
		
							//2nd way
		//we have to create object of ArrayList<String> 
		ArrayList<String> al= new ArrayList<String>();
		al.add("incognito");
		al.add("-disable-notifications");
		al.add("start-maximized");
		
		copt.addArguments(al);
		//3) we pass parameter(copt) inside the chromeDriver contructor 
		
		WebDriver driver = new ChromeDriver(copt);
		//driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(1000);
		
	    System.out.println(driver.getTitle());	
		
	}

}
