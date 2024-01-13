package testCase4_Coverfox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HealthPlan_2ndPage
{
	//declare variables
	@FindBy(className = "next-btn")private WebElement nextButtonClick;
	
	//declare Constructor
	public HealthPlan_2ndPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declare methods
	public void clickOnNextButton()
	{
		nextButtonClick.click();
	}
}
