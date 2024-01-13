package coverFox_WithoutDataDriven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateCoverFoxTestCases 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.coverfox.com/");
		
		CoverFox_HomePage1 homePage = new CoverFox_HomePage1(driver);
		homePage.clickOnMaleButton();
		
		CoverFoxHealthPlan_2ndPage healthPlan = new CoverFoxHealthPlan_2ndPage(driver);
		healthPlan.clickOnNextButton();
		
		CoverFoxMemberDetails_3rdPage memberDetails = new CoverFoxMemberDetails_3rdPage(driver);
		memberDetails.handleAgeDropDown();
		memberDetails.clickOnNextButton();
		
		CoverFoxAddressDetails_4thPage addressDetails=new CoverFoxAddressDetails_4thPage(driver);
		addressDetails.enterPinCode();
		addressDetails.enterMobNum();
		addressDetails.clickOnContinueButton();
		
		CoverFoxHealthPlanResults_5thPage planResults = new CoverFoxHealthPlanResults_5thPage(driver);
		planResults.validatePlanListWithResults();
	
		
		
	
	}

}
