package coverFox_WithDataDriven_UsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHome_1stPage 
{
	//declare variable
	@FindBy(xpath = "//div[text()='Male']")private WebElement maleButton;
	
	//declare constructor
	public CoverFoxHome_1stPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declare methods
	public void clickOnMaleButton()
	{
		maleButton.click();
	}
}
