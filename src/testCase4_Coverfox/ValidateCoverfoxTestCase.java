package testCase4_Coverfox;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ValidateCoverfoxTestCase {

	public static void main(String[] args) 
	{
		ChromeOptions coptn = new ChromeOptions();
		coptn.addArguments("--disabled-notification");
		coptn.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver(coptn);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.coverfox.com/");
		
		CoverfoxHomePage_1stPage homePage = new CoverfoxHomePage_1stPage(driver);
		homePage.clickOnFemaleButton();
											
		HealthPlan_2ndPage healthPlanPage = new HealthPlan_2ndPage(driver);
		healthPlanPage.clickOnNextButton();
		
		Memberdetails_3rdPage  memberDetailsAgePage = new Memberdetails_3rdPage(driver);
		memberDetailsAgePage.selectAgeDropdowmList();
		memberDetailsAgePage.clickOnNextButton();
		
		AddressDetails_4thPage addressDetailsPage = new AddressDetails_4thPage(driver);
		addressDetailsPage.enterPincode();
		addressDetailsPage.enterMobileNumber();
		addressDetailsPage.clickOnContinueButton();
		
		CoverFoxHealthPlanResults_5thPage planresult = new CoverFoxHealthPlanResults_5thPage (driver);
		planresult.validatePlanListWithResults();
		
	}

}
