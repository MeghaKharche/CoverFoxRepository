package testNg_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityKeywords {
	@Test
	public void a()
	{
		Reporter.log("Test Case a is running", true);
	}
	
	
	@Test(dependsOnMethods = {"c"})
	public void b()
	{
		Reporter.log("Test Case b is running", true);
	}
	
	@Test
	public void c()
	{
		Reporter.log("Test Case c is running", true);
	}
	
	@Test
	public void d()
	{
		Reporter.log("Test Case d is running", true);
	}
}
