package coverFox_WithoutDataDriven;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealthPlanResults_5thPage 
{
	//declare variable
	@FindBy(xpath = "//div[contains(text(),'matching Health')]") private WebElement resultsInString;
	@FindBy(id = "plans-list") private List<WebElement> planList;
	
	//declare constructor
	public CoverFoxHealthPlanResults_5thPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declare methods
	public void validatePlanListWithResults()
	{
		String result = resultsInString.getText();
	
		//49 matching Health Insurance Plans
		String ar[]=result.split(" ");
		
		//ar[]={"49" "matching" "Health" "Insurance" "Plans"}
		String numberOfResultsInString = ar[0];//49-->String
		
		//convert String to integer
		int numberOfResultsInInt = Integer.parseInt(numberOfResultsInString);//49-->in number(int)
	
		int totalNumberOfPlans = planList.size();
		
		if(totalNumberOfPlans==numberOfResultsInInt)
		{
			System.out.println("Plans number matching with plans List,TC is passed");
		}
		
		else 
		{
			System.out.println("Plans number is not matching with plans List, TC is failed");
		}
	}
}