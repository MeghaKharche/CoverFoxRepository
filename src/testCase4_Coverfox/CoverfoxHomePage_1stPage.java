package testCase4_Coverfox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverfoxHomePage_1stPage
{
	//declare variables
	@FindBy(xpath = "//div[text()='Female']")private WebElement femaleButtonClickfield ;
	
	
	//declare Constructor
	public CoverfoxHomePage_1stPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//declare Method
	
	public void clickOnFemaleButton()
	{
		femaleButtonClickfield.click();
	}
}
