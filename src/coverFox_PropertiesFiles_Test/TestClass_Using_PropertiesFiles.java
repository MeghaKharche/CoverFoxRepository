package coverFox_PropertiesFiles_Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import coverFox_PropertiesFiles_Base.BaseClass_Using_PropertiesFiles;
import coverFox_PropertiesFiles_POM.CoverFox_AddressDetails_Using_PropertiesFiles;
import coverFox_PropertiesFiles_POM.CoverFox_HealthPlanResults_Using_PropertiesFiles;
import coverFox_PropertiesFiles_POM.CoverFox_HealthPlan_Using_PropertiesFiles;
import coverFox_PropertiesFiles_POM.CoverFox_HomePage_Using_PropertiesFiles;
import coverFox_PropertiesFiles_POM.CoverFox_MemberDetails_Using_PropertiesFiles;

//Read Data Using Properties Files ==>create TestNg class

public class TestClass_Using_PropertiesFiles extends BaseClass_Using_PropertiesFiles
{
	//write all POM classes name and store reference variable
	CoverFox_HomePage_Using_PropertiesFiles homePage;
	CoverFox_HealthPlan_Using_PropertiesFiles healthPlan;
	CoverFox_MemberDetails_Using_PropertiesFiles memberDetails;
	CoverFox_AddressDetails_Using_PropertiesFiles addressDetails;
	CoverFox_HealthPlanResults_Using_PropertiesFiles planResults;
	
	//lauch application Browser we use @BeforeClass 
	@BeforeClass
	public void launchBrowser() throws InterruptedException
	{
		launchCoverFoxApplication();
		
		homePage = new CoverFox_HomePage_Using_PropertiesFiles(driver);
		healthPlan= new CoverFox_HealthPlan_Using_PropertiesFiles(driver);
		memberDetails = new CoverFox_MemberDetails_Using_PropertiesFiles(driver);
		addressDetails = new CoverFox_AddressDetails_Using_PropertiesFiles(driver);
		planResults = new CoverFox_HealthPlanResults_Using_PropertiesFiles(driver);
		
	}
	
	@Test
	public void coverFox()
	{
	  
	}
  
	//close Application Browse we use @AfterClass
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{	
		closeCoverFoxBrowser();
	}
}
