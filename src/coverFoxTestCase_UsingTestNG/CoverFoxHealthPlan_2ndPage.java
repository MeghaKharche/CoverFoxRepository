package coverFoxTestCase_UsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealthPlan_2ndPage 
{
	//declare Variable
	@FindBy(xpath = "//div[@class='next-btn']") private WebElement nextButton;
	
	//declare Constructor
	public CoverFoxHealthPlan_2ndPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declare Methods
	public void ClickOnNextButton()
	{
		nextButton.click();
	}

}
