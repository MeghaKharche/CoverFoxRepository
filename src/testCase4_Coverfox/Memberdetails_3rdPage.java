package testCase4_Coverfox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Memberdetails_3rdPage 
{	
	//declare variables
	@FindBy(id="Age-You")private WebElement ageDropdownList;
	@FindBy(className = "next-btn") private WebElement nextClickButton;
	
	//declare constructor
	public Memberdetails_3rdPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declare method
	public void selectAgeDropdowmList()
	{
		Select s = new Select(ageDropdownList);
		s.selectByValue("30y");
	}
	
	public void clickOnNextButton() 
	{
		nextClickButton.click();
	}
}
