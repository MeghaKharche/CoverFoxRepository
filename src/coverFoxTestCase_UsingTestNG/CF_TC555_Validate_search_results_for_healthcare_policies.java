package coverFoxTestCase_UsingTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import org.testng.Assert;

public class CF_TC555_Validate_search_results_for_healthcare_policies 
{
  
	  WebDriver driver;
	  CoverFoxHomePage_1stPage home;
	  CoverFoxHealthPlan_2ndPage healthPlan;
	  CoverFoxMemberDetails_3rdPage memberDetails;
	  CoverFoxAddressDetails_4thPage addressDetails;
	  CoverFoxHealthPlanResults_5thPage healthPlanResult;
	  
	  @BeforeClass  //Launch browser
	  
	  public void launchBrowser() throws InterruptedException
	  {
		  
		  driver= new ChromeDriver();
		  
		  home=new CoverFoxHomePage_1stPage(driver);
		  healthPlan= new CoverFoxHealthPlan_2ndPage(driver);
		  memberDetails = new CoverFoxMemberDetails_3rdPage(driver);
		  addressDetails = new CoverFoxAddressDetails_4thPage(driver);
		  healthPlanResult= new CoverFoxHealthPlanResults_5thPage(driver);
	  
		  Reporter.log("Opening browser ", true);
		  driver.get("https://www.coverfox.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	  }
	  
	  @BeforeMethod  //Declare all Page Method Name
	  
	  public void enterMemeberDeatils() throws InterruptedException,
	  EncryptedDocumentException, IOException
	 {
		  Reporter.log("clicking on gender button ", true); //methodName 1stPage ==>CoverFoxHomePage_1stPage
		  home.ClickOnFemaleButton();
		  Thread.sleep(1000);
		  
		  Reporter.log("clicking on next button ", true); //methodName 2ndPage ==>CoverFoxHealthPlan_2ndPage
		  healthPlan.ClickOnNextButton();
		  Thread.sleep(1000);
		  
		  Reporter.log("Handeling age drop down ", true);  //methodName 3rdPage ==>CoverFoxMemberDetails_3rdPage
		  memberDetails.selectAgeDropDownList("28");
		 
		  Reporter.log("Clicking on next button ", true);
		  memberDetails.ClickOnNextButton();
		  Thread.sleep(1000);
		  
		  Reporter.log("Entering pin code ",true);
		  addressDetails.enterPinCode("412105");
		  
		  Reporter.log("Entering mobile num ",true);
		  addressDetails.enterMobNumber("9876567897");
		  
		  Reporter.log("Clicking on continue button ", true);
		  addressDetails.clickOnContinueButton();
		  Thread.sleep(1000);
	  }
	  
	  @Test
	  public void validateTestPlansFromTextAndBanners() throws InterruptedException
	  {
		  Thread.sleep(5000);
		  
		  Reporter.log("Fetching number of results from text ", true);
		  int textResult = healthPlanResult.availablePlanNumberFromText();
		  Thread.sleep(7000);
		  
		  Reporter.log("Fetching number of results from Banners ", true);
		  int bannerResult = healthPlanResult.availablePlanNumberFromBanners();
		  Thread.sleep(1000);
		  
		  Assert.assertEquals(textResult, bannerResult,"Text results are not matching with Banner results, TC is failed");
		  Reporter.log("TC is passed ", true);
	  }
	  
	  @AfterMethod     //Close Browser
	 
	  public void closeBrowser() throws InterruptedException
	  {
		  Reporter.log("Closing browser ", true);
		  Thread.sleep(3000);
		  
		  driver.close();
	  }

	
  
}
