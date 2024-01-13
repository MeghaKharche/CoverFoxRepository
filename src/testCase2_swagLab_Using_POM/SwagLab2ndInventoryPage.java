package testCase2_swagLab_Using_POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.devtools.v115.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLab2ndInventoryPage
{
	//2nd InventoryPage
	//variable 
	
	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt") private WebElement addBoltTshirt;
	@FindBy(id = "add-to-cart-sauce-labs-onesie") private WebElement OneSieTshirt;
	@FindBy(id = "add-to-cart-sauce-labs-bike-light") private WebElement addLight;
	//@FindBy(className = "inventory_item_name ") private WebElement addTotalItems;
	@FindBy(className = "shopping_cart_badge") private WebElement clickAddCart;
	
	//contructor
	public SwagLab2ndInventoryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Method
	public void addFirstBoltTshirt() //15line variable
	{
		addBoltTshirt.click();
	}
	
	public void addSecondOneSieTshirt() //16line varible
	{
		OneSieTshirt.click();
	}
	
	public void addThirdLight()
	{
		addLight.click();
	}
	
//	public void checkSelectedItems()  //18line
//	{
//		String selectedItemsName= addTotalItems.getText();
//		System.out.println(selectedItemsName);
//	}
	
	public void clickCart() //19line
	{
		clickAddCart.click();
	}

	 
}
