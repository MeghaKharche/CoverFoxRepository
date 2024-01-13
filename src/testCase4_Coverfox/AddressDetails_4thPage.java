package testCase4_Coverfox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressDetails_4thPage 
{
	//declare variables
	@FindBy(className = "mp-input-text")private WebElement pincodeField;
	@FindBy(xpath = "//input[@id= 'want-expert']") private WebElement mobileNumberFiled;
	@FindBy(xpath ="//div[text()='Continue']") private WebElement continueButton;

	//declare constructor
	public AddressDetails_4thPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declare methods
	
	public void enterPincode()
	{
		pincodeField.sendKeys("412105");
	}
	
	public void enterMobileNumber()
	{
		mobileNumberFiled.sendKeys("9623313110"); 
		
	}
	
	public void clickOnContinueButton()
	{
		continueButton.click();
	}
	
}
