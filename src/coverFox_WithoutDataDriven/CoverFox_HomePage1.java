package coverFox_WithoutDataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFox_HomePage1 
{
	//declare vriable
	@FindBy(xpath = "//div[text()='Male']")private WebElement maleButton;
	
	//declare constructor
	public CoverFox_HomePage1(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	//declare method
	public void clickOnMaleButton()
	{
	maleButton.click();
	}

}
