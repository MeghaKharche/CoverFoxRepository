package coverFox_WithDataDriven_UsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetails4thPage 
{
	//declare variable
	@FindBy(xpath = "(//input[@type='number'])[1]") private WebElement pinCodeField;
	@FindBy(xpath = "(//input[@type='number'])[2]") private WebElement mobNumField;
	@FindBy(xpath = "//div[text()='Continue']") private WebElement continueButton;
	
	//declare constructor
	public CoverFoxAddressDetails4thPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	//declare methods
	public void enterPinCode(String pincode)
	{
		pinCodeField.sendKeys(pincode);
	}
	public void enterMobNum(String mobNum)
	{
		mobNumField.sendKeys(mobNum);
	}
	public void clickOnContinueButton()
	{
		continueButton.click();
	}
}
