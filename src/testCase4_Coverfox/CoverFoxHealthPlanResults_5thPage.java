package testCase4_Coverfox;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealthPlanResults_5thPage 
{
	//declare variables
	@FindBy(xpath="//div[text() ='49 matching Health Insurance Plans']") private WebElement resultsInString;;
	
	@FindBy(id = "plans-list") private List<WebElement> planList;
	//declare constructor
	public CoverFoxHealthPlanResults_5thPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declare methods
	
	public void validatePlanListWithResults()
	{
		String planResult= resultsInString.getText();
		
		//49 matching Health Insurance Plans
		//49 is int and other it is string so that why we have to 1st split()
		String[] arr = planResult.split(" ");
		
		String numberOfResultsInString = arr[0];
		
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
