package practivceUseAllPaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import webElementsMethods.IsSelectedUse;

public class UsingAllLocators {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		Thread.sleep(1000);
		
		//textarea
		driver.findElement(By.xpath("//textarea[@id= 'ta1']")).sendKeys("Hi good evening");
		//driver.findElement(By.id("ta1")).sendKeys("welcome");
		//syntax id= tagname#id
//cssSelector		
		//driver.findElement(By.cssSelector("textarea#ta1")).sendKeys("Hi to all");
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//textarea[text()= 'The cat was playing in the garden.']")).sendKeys("Hiiiiiiiiiiiiii");
		////driver.findElement(By.xpath("//textarea[contains(text(), 'The cat')]")).sendKeys("hiiiiiiiiiiiii");
		////Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@type= 'text']")).sendKeys("xyz");
		////driver.findElement(By.xpath("//input[@name= 'userid']")).sendKeys("xyz");
		////driver.findElement(By.name("pswrd")).sendKeys("xyz");	
		//driver.findElement(By.xpath("//input[@type= 'password'][2]")).sendKeys("xyz");
		////driver.findElement(By.xpath("//input[@type= 'button'][1]")).click();
		////Thread.sleep(1000);
		//driver.findElement(By.cssSelector("//input[type= button][1]")).click();
		//driver.findElement(By.cssSelector("input[value= Cancel]")).click();
		////Thread.sleep(1000);
		
//isSelected
//		Boolean gender = driver.findElement(By.id("radio2")).isSelected();
//		System.out.println("gender is selected or not "+gender);
//		driver.findElement(By.id("radio2")).click();
//codeoptimization use isSelected	
		WebElement Fgender = driver.findElement(By.id("radio2"));
		//Fgender.click();
		boolean checkFgender = Fgender.isSelected();
		System.out.println("gender is selected or not "+checkFgender);
		Thread.sleep(1000);
		Fgender.click();
		boolean checkF1gender = Fgender.isSelected();
		System.out.println("gender is selected or not "+checkF1gender);
		Thread.sleep(1000);
		
//		WebElement Mgender = driver.findElement(By.id("radio1"));
//		boolean checkMgender = Mgender.isSelected();
//		System.out.println("gender is selected or not "+checkMgender);
//		Fgender.click();
//		System.out.println("gender is selected or not "+checkMgender);
//		Thread.sleep(1000);
		
		
		
	}

}
