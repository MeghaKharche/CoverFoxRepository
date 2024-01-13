package coverFoxTestCase_UsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHomePage_1stPage 
{
	//declare variable
	@FindBy(xpath = "//div[text()='Female']") private WebElement femaleButton;
	
	//declare Constructor
	public CoverFoxHomePage_1stPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declare methods
	public void ClickOnFemaleButton()
	{
		femaleButton.click();
	}
}
