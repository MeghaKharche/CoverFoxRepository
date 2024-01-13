package testcase3_PolicyBazaar;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteAllTestCasesPage {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.borland.com/InsuranceWebExtJS/#");

		//create object ==> 1St Page
		InsuranceWebExtJS_1stpage signpage = new InsuranceWebExtJS_1stpage(driver);
		signpage.enterEmail();
		signpage.enterPassword();
		signpage.clickOnLoginButton();
		
		//create object ==> 2nd page 
		Indexjsfjsessionid_2ndPage dropdownlist = new Indexjsfjsessionid_2ndPage(driver);
		
		dropdownlist.selectDropdown();
		
		//create object ==> 3rd page
		Quote_auto_3rdPage quoteAuto = new Quote_auto_3rdPage(driver);
		quoteAuto.enterZipCode();
		quoteAuto.enterEmailId();
		quoteAuto.clickOnRadioButton();
		quoteAuto.clickOnNextButton();
		
		quoteAuto.enterAge();
		quoteAuto.clickOnRadioButtonBox();
		quoteAuto.clickOndrivingrecordradiobutton();
		quoteAuto.clicknextButtonClick();
	}

}
