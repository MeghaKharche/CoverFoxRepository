package WebElementsMethodsUse;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdownUsingCollection {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
		
	//	WebElement mullist = driver.findElement(By.id("cars"));
		WebElement mullist = driver.findElement(By.xpath("//select[@id = 'cars']"));
		Select smultiplelist = new Select(mullist);
		System.out.println(smultiplelist.isMultiple());
		Thread.sleep(1000);
		
		smultiplelist.selectByIndex(0);
		smultiplelist.selectByVisibleText("Audi");
		smultiplelist.selectByValue("opel");
		Thread.sleep(1000);
		
		System.out.println(smultiplelist.getFirstSelectedOption().getText());

//usingCollection		
		List<WebElement> list= smultiplelist.getOptions();
		System.out.println("==========For Loop===========");
		
		for(int i=0; i<=list.size()-1; i++)
		{
			System.out.println(list.get(i).getText());
		}
		
		System.out.println("==========For each loop==========");
		
		for(WebElement li :list)
		{
			System.out.println(li.getText());
		}
		
//Traverssing
		
		System.out.println("==========Iterator==========");
		
		Iterator<WebElement> i = list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next().getText());
		}
		
		System.out.println("==========ListIterator==========");
		
		ListIterator<WebElement> li = list.listIterator();
	
		System.out.println("==========ListIterator-->Forward direction==========");
		while(li.hasNext())
		{
			System.out.println(li.next().getText());
		}
		
		System.out.println("==========ListIterator-->Reverse direction==========");
		while(li.hasPrevious())
		{
			System.out.println(li.previous().getText());
		}
	
	}

}
