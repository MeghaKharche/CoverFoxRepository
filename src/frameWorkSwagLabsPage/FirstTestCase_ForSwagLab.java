package frameWorkSwagLabsPage;

//Test Cases For SwagLabs WebPage
		//TestScript
		//1. Open Url https://www.saucedemo.com/
		//2. Enter username 
		//3. Enter password
		//4. click on login button
		//5. next page --> add 2 items into  the cart
		//6. find out total no of items in the cart
		//7. check the items are added correct or not
		//8. if added items are correct then click on checkout button
		//9. Enter First name 
		//10. Enter last name
		//11. Enter postal code
		//12. click on continue button
		//13. click on Finish button
		//14. capture the thanku message
		//15. check message is correct then print test case is successful pass 
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase_ForSwagLab {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//1. Open Url https://www.saucedemo.com
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//1st page ==> Login Page
		
		//enter username
		WebElement userName= driver.findElement(By.name("user-name"));
		
		//enter password
		WebElement password= driver.findElement(By.id("password"));
		
		//click on login button
		WebElement loginButton= driver.findElement(By.id("login-button"));
		
		//we take  action on webelement 
		userName.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		loginButton.click();
		
		//2nd page(Inventory) ==> 2 items are add to cart 
		
		//select 1 items
		WebElement addBackpackitem= driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		addBackpackitem.click();
		//select one more items
		WebElement addJacketitem= driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
		addJacketitem.click();
		
		//3rd page(cart) ==> show added items in the cart
		//WebElement cartButton = driver.findElement(By.id("shopping_cart_container"));
		//cartButton.click();		
		
		WebElement cartButton = driver.findElement(By.className("shopping_cart_link"));
		cartButton.click();		
		
		//find out total no of webelement present in cart
		List<WebElement> totalNoOfItmes= driver.findElements(By.className("inventory_item_name"));
		int checkTotalNoAddToCart= totalNoOfItmes.size();
		System.out.println("checkTotalNoAddToCart ==> "+checkTotalNoAddToCart);		
		
		//check the items are added correct or not
		for(WebElement selectedItems:totalNoOfItmes)
		{
			System.out.println(selectedItems.getText());
		}
		
		//compare //1. Sauce Labs Backpack   //2. Sauce Labs Fleece Jacket
		//if added items are correct then click on checkout button
		Iterator<WebElement> it = totalNoOfItmes.iterator();
		WebElement firstItem = it.next();
		WebElement secondItem = it.next();
		
		if(firstItem.getText().equals("Sauce Labs Backpack"))
		{
			System.out.println("First Items is selected");
			
			if(secondItem.getText().equals("Sauce Labs Fleece Jacket"))
			{
				System.out.println("Second item is also selected");
				WebElement checkout= driver.findElement(By.id("checkout"));
				checkout.click();
			}
		}
		else
		{
			System.out.println("No one Items are select");
		}
		
		//4th page open ==> checkout-step-one
		
		//Enter first name
		WebElement firstName= driver.findElement(By.name("firstName"));
		
		//Enter Last Name
		WebElement lastName= driver.findElement(By.name("lastName"));
		
		//Enter postal Code /Zip
		WebElement postalCode= driver.findElement(By.name("postalCode"));
		
		//click on contionue button
		WebElement continuebutton = driver.findElement(By.name("continue"));
		
		//take action on above element 
		firstName.sendKeys("komal");
		lastName.sendKeys("shinde");
		postalCode.sendKeys("411046");
		continuebutton.click();
		
		//go for 5th page ==> checkout-step-two 
		
		WebElement clickFinishbutton =driver.findElement(By.id("finish"));
		clickFinishbutton.click();
	
		WebElement thankuMsg= driver.findElement(By.className("complete-header"));
		String msg= thankuMsg.getText();
		System.out.println(msg);
		
		//compare thanku msg correct or not
		if(thankuMsg.getText().equals("Thank you for your order!"))
		{
			System.out.println("Message is correct");
			
			//go to back home
			WebElement backHomeButton= driver.findElement(By.name("back-to-products"));
			backHomeButton.click();
		}
		else
		{
			System.out.println("Message is wrong");
		}
		
	}

}