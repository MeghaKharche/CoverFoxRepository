package testNg_Assertions_HardAssert;

import org.testng.annotations.Test;
import org.testng.Assert;


public class AssertEqualsUse 
{
	@Test
	public void ChooseEqualCity()
	{
		String a="Pune";
		String b="Pune";
	
		String c="Mumbai";
		
		//Verify a and b are equal
		//Assert.assertEquals(a, b,"A and B are not matching TC is failed");
		
		//Verify b and c are not equal
		
		Assert.assertNotEquals(b, c, "B and C are equal, TC failed");

	}
}
