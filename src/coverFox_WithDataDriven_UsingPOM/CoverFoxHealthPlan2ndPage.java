package coverFox_WithDataDriven_UsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealthPlan2ndPage

{
	//declare variable
	@FindBy(className = "next-btn") private WebElement nextButton;
	
	//declare constructor
	public CoverFoxHealthPlan2ndPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declare method
	public void clickOnNextButton()
	{
		nextButton.click();
	}

}
