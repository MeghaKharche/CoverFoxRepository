package testNg_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutKeywordUse 
{
	@Test(timeOut = 6000)
	public void payment() throws InterruptedException
	{
		Thread.sleep(5000);
	    Reporter.log("Payment done successfully..", true);
	}
}
