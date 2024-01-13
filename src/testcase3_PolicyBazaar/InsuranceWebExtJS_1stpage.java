package testcase3_PolicyBazaar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuranceWebExtJS_1stpage 
{	
	//InsuranceWebExtJS ==> 1st Page
	
	//variable
	//Enter email
	@FindBy(id= "login-form:email") private WebElement emailfield;
	
	//Enter password
	@FindBy(name = "login-form:password") private WebElement passwordfield;
	
	//click on login button
	@FindBy(name = "login-form:login") private WebElement loginButton;

	//contructor
	public InsuranceWebExtJS_1stpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	public void enterEmail()  //email
	{
		emailfield.sendKeys("john.smith@gmail.com");
	}
	
	public void enterPassword()  //password
	{
		passwordfield.sendKeys("john");
	}
	
	public void clickOnLoginButton()  //login
	{
		loginButton.click();
	}
	
	
}
