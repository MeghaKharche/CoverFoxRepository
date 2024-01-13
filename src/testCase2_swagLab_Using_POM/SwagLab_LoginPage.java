package testCase2_swagLab_Using_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLab_LoginPage 
{
	// Using POM =>page object model it is design pattern which represents
			// 1st we declare variable then Constructor  then Method 
			
			//1st Login page
			
			//declare variable //private int a = 10
			@FindBy(id= "user-name") private WebElement userName;
			@FindBy(id="password") private WebElement passwordd;
			@FindBy(name = "login-button") private WebElement loginButton;
			
			//Contructor 
			public SwagLab_LoginPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//Method ==> perform action on variable(WebElement)
			
			// for enter Username
			public void enterUserName()
			{
				userName.sendKeys("standard_user");
			}
			
			//for enter password
			public void enterPassword()
			{
				passwordd.sendKeys("secret_sauce");
			}
			
			public void clickOnLoginButton()
			{
				loginButton.click();
			}

}
