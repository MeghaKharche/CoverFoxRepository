package coverFox_WithDataDriven_UsingPOM;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import coverFox_WithoutDataDriven.CoverFoxAddressDetails_3rdPage;
//import coverFox_WithoutDataDriven.CoverFoxHealthPlanResults_5thPage;
//import coverFox_WithoutDataDriven.CoverFoxHealthPlan_2ndPage;
//import coverFox_WithoutDataDriven.CoverFoxMemberDetails_4thPage;
//import coverFox_WithoutDataDriven.CoverFox_HomePage1;

public class ValidateCoverFoxAllTestCases {

	public static void main(String[] args) throws InterruptedException,EncryptedDocumentException, IOException
	{
		FileInputStream myfile= new FileInputStream("F:\\ExcelSheetEclilpse\\ExcelSheetEclilpse.xlsx");

		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("CoverFoxData");
		//String ageData = mySheet.getRow(0).getCell(0).getStringCellValue();
		String pinCodeData = mySheet.getRow(0).getCell(1).getStringCellValue();
		String mobNumData = mySheet.getRow(0).getCell(2).getStringCellValue();
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		CoverFoxHome_1stPage home= new CoverFoxHome_1stPage(driver);
		Thread.sleep(500);
		home.clickOnMaleButton();
		
		CoverFoxHealthPlan2ndPage healthPlan= new CoverFoxHealthPlan2ndPage(driver);
		Thread.sleep(500);
		healthPlan.clickOnNextButton();
		
//		CoverFoxMemberDetails3rdPage membersDetails= new CoverFoxMemberDetails3rdPage(driver);
//		Thread.sleep(1000);
//		membersDetails.handleAgeDropDown(ageData);
//		Thread.sleep(1500);
//		membersDetails.clickOnNextButton();

		CoverFoxMemberDetails3rdPage membersDetails= new CoverFoxMemberDetails3rdPage(driver);
		Thread.sleep(1000);
//		membersDetails.handleAgeDropDown(CommonlyUsedMethod.readDataFromExcel("CoverFoxData", 1, 0));

		Thread.sleep(1500);
		membersDetails.clickOnNextButton();
				
		CoverFoxAddressDetails4thPage addressDetails= new CoverFoxAddressDetails4thPage(driver);
		Thread.sleep(1500);
		addressDetails.enterPinCode(pinCodeData);
		Thread.sleep(1500);
		addressDetails.enterMobNum(mobNumData);
		Thread.sleep(1500);
		addressDetails.clickOnContinueButton();
		
		CoverFoxHealthPlanResults5thPage planResults= new CoverFoxHealthPlanResults5thPage(driver);
		Thread.sleep(7000);
		planResults.validatePlanListWithResults();
		Thread.sleep(2000);

		driver.close();
	
	}

}
