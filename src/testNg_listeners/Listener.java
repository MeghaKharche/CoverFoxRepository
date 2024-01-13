package testNg_listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

//agar class level ko testNg ko implement karna hai to class ke pahile write @TestListener and path 
 

//inside the testNgStudy package we create one class like ListenerClass1 and him give path this file
public class Listener implements ITestListener 
{
	//onTestSuccess ==> Ctrl+space+enter then already overwrite this method

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		String TCName = result.getName();
		Reporter.log("Test Case "+TCName + " completed successfully", true);
	}
	
	//depend this case so thats why this is skip
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		String testCaseName = result.getName();
		Reporter.log("Test Case "+testCaseName +" is skipped please check dependent method", true);
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("Test Case "+result.getName()+ " is fail Please check again", true);
	}
	
	
	@Override
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("Test Case "+result.getName()+ " execution start", true);
	}
}
