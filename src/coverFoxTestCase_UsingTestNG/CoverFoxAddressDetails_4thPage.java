package coverFoxTestCase_UsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetails_4thPage 
{
	//declare Variable
	@FindBy(xpath = "(//input[@type='number'])[1]") private WebElement pinCodeField;
	@FindBy(xpath = "(//input[@type='number'])[2]") private WebElement mobNumberField;
	@FindBy(xpath = "//div[text()='Continue']") private WebElement continueButton;
	
	//declare Constructor
	public CoverFoxAddressDetails_4thPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declare Methods
	public void enterPinCode(String pincode)
	{
		pinCodeField.sendKeys(pincode);
	}
	
	public void enterMobNumber(String mobNumber)
	{
		mobNumberField.sendKeys(mobNumber);
	}

	public void clickOnContinueButton()
	{
		continueButton.click();
	}
}
