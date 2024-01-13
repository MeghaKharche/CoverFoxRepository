package coverFox_WithoutDataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealthPlan_2ndPage
{
	//declare Variable
	@FindBy(className = "next-btn") private WebElement nextButton;
	
	//declare constructor
	public CoverFoxHealthPlan_2ndPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	//declare methods
	public void clickOnNextButton()
	{
	nextButton.click();
	}
}
