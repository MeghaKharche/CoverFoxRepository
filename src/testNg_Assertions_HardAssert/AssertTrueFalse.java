package testNg_Assertions_HardAssert;

import org.testng.annotations.Test;

import org.testng.Assert;

public class AssertTrueFalse 
{
  @Test
  public void f() 
  {
	  boolean a=true;
	  boolean b=true;
	  boolean c=false;

	  //Verify a is true
	  // Assert.assertTrue(a,"a value is false, TC is failed");
	  
	  //Verify b is false
	  //Assert.assertFalse(b, "b is true, TC is failed");
	  
	  //verify c is false
	  Assert.assertFalse(c, "c is true,TC is true");
  }
}
