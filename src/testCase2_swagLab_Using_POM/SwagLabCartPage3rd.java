package testCase2_swagLab_Using_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v115.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabCartPage3rd 
{
	//variable
	@FindBy(id = "remove-sauce-labs-bike-light") private WebElement removelight;
	@FindBy(name = "checkout") private WebElement clickOnCheckoutButton;
	
	//Constructor
	
	public SwagLabCartPage3rd(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//method
	public void removeLightInTheCart()
	{
		removelight.click();
	}
	
	public void clickButtonForCheckout()
	{
		clickOnCheckoutButton.click();
	}
	
	


}
