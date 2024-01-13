package testcase3_PolicyBazaar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Indexjsfjsessionid_2ndPage 
{
	//2nd Page
	
	//declare variable
	@FindBy(name ="quick-link:jump-menu") private WebElement dropdownList;
	
	//contructor
	public Indexjsfjsessionid_2ndPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declare methods
	
	public void selectDropdown()
	{
		Select s = new Select(dropdownList);
		//choose one select method
		s.selectByValue("quote_auto.jsf");
	}
	
	
}
