package testNg_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationKeywords
{
	@Test
	public void a()
	{
		Reporter.log("Test Case a is running", true);
	}

	@Test(invocationCount = 5)
	public void b()
	{
		Reporter.log("Test Case b is running", true);
	}
	
	@Test
	public void c()
	{
		Reporter.log("Test Case c is running", true);
	}

}
