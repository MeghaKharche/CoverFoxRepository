package popupUse;

import java.util.ArrayList;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenMultipleTabsUse {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		
		//open multiple tab same browser
		
		driver.findElement(By.xpath("//span[text()='Remote']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='MNC']")).click();
		Thread.sleep(1000);
		
	//	driver.findElement(By.xpath("//span[text()='HR']")).click();
		Thread.sleep(1000);
		
		//to get title of multiple tabs using getWindowHandles()
		//using set we cann't use index 
		Set<String> allTabGetId = driver.getWindowHandles();
		System.out.println("To get all tab id "+allTabGetId);
		Thread.sleep(1000);
		
		//using iterator
		java.util.Iterator<String> it = allTabGetId.iterator();
		//String sGetId= it.next();
		//System.out.println(sGetId);
		System.out.println(it.next());
		System.out.println(it.next());
		
		
		//we use ArrayList(collection)this is present inside the List<Interface>
		//we object of ArrayList<> & pass the parameter
		ArrayList<String> als = new ArrayList<>(allTabGetId);//as a parameter we will set<String> object
		
				//forLoop
		for(int i=0;i<=als.size()-1;i++)
		{
			driver.switchTo().window(als.get(i));
		
			//System.out.println(als.get(0));
		}
		}

}
