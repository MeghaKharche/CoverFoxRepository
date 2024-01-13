package testcase3_PolicyBazaar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quote_auto_3rdPage 
{
	//3rd page
	
	//declare variable
	@FindBy(id="autoquote:zipcode") private WebElement zipCodefield;
	@FindBy(id="autoquote:e-mail") private WebElement emailFieldBox;
	@FindBy(name ="autoquote:vehicle") private WebElement radioButton;
	@FindBy(name ="autoquote:next") private WebElement nextButton;
	
	//same page change webelement
	
	@FindBy(id = "autoquote:age")private WebElement agefiled;
	@FindBy(id = "autoquote:gender:1")private WebElement radiobuttonfield;
	@FindBy(xpath = "//label[contains(text(), 'Good - I')]")private WebElement drivingrecordradiobutton;
	@FindBy(name="autoquote:next") private WebElement nextButtonClick;
	
	//contructor
	public Quote_auto_3rdPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//method
	
	public void enterZipCode()
	{
		zipCodefield.sendKeys("412105");
	}
	
	public void enterEmailId()
	{
		emailFieldBox.sendKeys("john.smith@gmail.com");
	}
	
	public void clickOnRadioButton()
	{
		radioButton.click();
	}
	
	public void clickOnNextButton() 
	{
		nextButton.click();
	}
	
	//same page change method
	
	public void enterAge()
	{
		agefiled.sendKeys("30");
	}
	
	public void clickOnRadioButtonBox()
	{
		radiobuttonfield.click();
	}
	
	public void clickOndrivingrecordradiobutton()
	{
		drivingrecordradiobutton.click();
	}
	
	public void clicknextButtonClick()
	{
		nextButtonClick.click();
	}
}