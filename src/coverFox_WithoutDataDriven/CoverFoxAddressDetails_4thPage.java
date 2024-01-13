package coverFox_WithoutDataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetails_4thPage 
{
	//declare variable
	@FindBy(xpath = "(//input[@type='number'])[1]") private WebElement pinCodeField;
	@FindBy(xpath = "(//input[@type='number'])[2]") private WebElement mobNumField;
	@FindBy(xpath = "//div[text()='Continue']") private WebElement continueButton;
	
	//declare constructor
	public CoverFoxAddressDetails_4thPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	//declare methods
	public void enterPinCode()
	{
	pinCodeField.sendKeys("412105");
	}
	
	public void enterMobNum()
	{
	mobNumField.sendKeys("9623313110");
	}
	
	public void clickOnContinueButton()
	{
	continueButton.click();
	}

}
