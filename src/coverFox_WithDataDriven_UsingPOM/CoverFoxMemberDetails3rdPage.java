package coverFox_WithDataDriven_UsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CoverFoxMemberDetails3rdPage 
{
	//declare variable
	@FindBy(id = "Age-You") private WebElement ageDropDown;
	@FindBy(className = "next-btn") private WebElement nextButton;
	
	//declare constructor
	public CoverFoxMemberDetails3rdPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declare methods
	public void handleAgeDropDown(String age)
	{
		Select s= new Select(ageDropDown);
		s.selectByValue(age+"y");
	}

	public void clickOnNextButton()
	{
		nextButton.click();
	}

}
