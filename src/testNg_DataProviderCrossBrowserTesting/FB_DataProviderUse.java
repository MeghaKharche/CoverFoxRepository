package testNg_DataProviderCrossBrowserTesting;

//import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class FB_DataProviderUse 
{
	//method--> data Provider
	// String firstName, String LastName, String MobNum
	
  @DataProvider(name="FBRegression")
  
  public static String[][] fBDataSet() 
  {
	  String allData[][]= {{"Megha","Narkhede","9376567890"}, {"Devansh", "Narkhede", "9876567854"}};
	  return allData;
  }

}
