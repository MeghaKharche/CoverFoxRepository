package testCase2_swagLab_Using_POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateSwagLab_LoginPage {

	public static void main(String[] args) 
	{
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// create object for 1st Login Page
		SwagLab_LoginPage loginPage = new SwagLab_LoginPage(driver);
		
		loginPage.enterUserName();
		loginPage.enterPassword();
		loginPage.clickOnLoginButton();
		
		
		SwagLab2ndInventoryPage addcartItems = new SwagLab2ndInventoryPage(driver);
		addcartItems.addFirstBoltTshirt();
		addcartItems.addSecondOneSieTshirt();
		addcartItems.addThirdLight();
		//addcartItems.checkSelectedItems();
		addcartItems.clickCart();
		
		SwagLabCartPage3rd cartPage= new SwagLabCartPage3rd(driver);
		cartPage.removeLightInTheCart();
		cartPage.clickButtonForCheckout();
		
	}

}
