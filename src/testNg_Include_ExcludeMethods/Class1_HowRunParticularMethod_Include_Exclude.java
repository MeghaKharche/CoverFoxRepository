package testNg_Include_ExcludeMethods;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class1_HowRunParticularMethod_Include_Exclude {
  @Test
  public void testCase1() 
  {
	  Reporter.log("1st TestCase is running", true);
  }
  
  @Test
  public void testCase2() 
  {
	  Reporter.log("2nd TestCase is running", true);
  }
  
  @Test
  public void testCase3()
  {
	  Reporter.log("3rd TestCase is running", true);
  }
  
  @Test
  public void testCase4()
  {
	  Reporter.log("4th TestCase is runing", true);
  }
}
