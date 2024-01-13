package WebElementsMethodsUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSeleniumLocatorsUse {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		//cssSelector
		driver.findElement(By.cssSelector("input#email")).sendKeys("dev@gmail.com");
		driver.findElement(By.cssSelector("input[name=pass]")).sendKeys("dev@1234");
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.get("https://www.facebook.com/signup");
		//using contain (id)half value
		driver.findElement(By.xpath("//input[contains(@id ,'u_0_b')]")).sendKeys("Sonal");
		driver.findElement(By.xpath("//input[contains(@id ,'u_0_d')]")).sendKeys("warade");
		
		//use cssSelector
		driver.findElement(By.cssSelector("input[name = reg_email__]")).sendKeys("9876567845");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#password_step_input")).sendKeys("dev@2333");
		
		//dropdown - select list 
		WebElement day = driver.findElement(By.id("day"));
		Select sday = new Select(day);
		sday.selectByIndex(2);
		
		WebElement month = driver.findElement(By.id("month"));
		Select smonth = new Select(month);
		smonth.selectByVisibleText("Mar");
		
		WebElement year = driver.findElement(By.id("year"));
		Select syear = new Select(year);
		syear.selectByValue("2021");
		Thread.sleep(1000);
		
		//radio button
	//	WebElement femalegender = driver.findElement(By.xpath("//label[text()='Female']"));
		WebElement femalegender = driver.findElement(By.cssSelector("label._58mt"));
		boolean genderresult = femalegender.isSelected();
		System.out.println("gender result is "+genderresult);
		femalegender.click();
		Thread.sleep(1000);
		
			//radio button
			driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice");
			WebElement radiobutton = driver.findElement(By.xpath("//input[@class='radioButton']"));
			boolean buttonresult = radiobutton.isSelected();
			System.out.println(" radio button "+buttonresult);
			radiobutton.click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("autocomplete")).sendKeys("India");
			Thread.sleep(1000);
			
			//dropdown
			WebElement optionlist = driver.findElement(By.id("dropdown-class-example"));
			Select optionlistresult = new Select(optionlist);
			optionlistresult.selectByIndex(2);
			Thread.sleep(1000);
			
			//multiple checkbox
			WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
			boolean checkboxresult = checkbox.isSelected();
			System.out.println("checkbox is pass or not "+ checkboxresult);
			checkbox.click();
			
			WebElement checkbox1 = driver.findElement(By.id("checkBoxOption2"));
			boolean checkboxresult1 = checkbox1.isSelected();
			System.out.println("checkbox1 is pass or not "+ checkboxresult1);
			checkbox1.click();
			Thread.sleep(1000);
			
			//display hide&show
			driver.findElement(By.id("displayed-text")).sendKeys("Hello");
			Thread.sleep(1000);
			driver.findElement(By.id("displayed-text")).clear();
			Thread.sleep(1000);
			
			boolean hide = driver.findElement(By.id("hide-textbox")).isDisplayed();
			System.out.println("The window is hide "+hide);
			driver.findElement(By.id("hide-textbox")).click();
			Thread.sleep(1000);
			
			driver.navigate().back();		
		
	}

}
