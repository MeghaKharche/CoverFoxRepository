package testNg_Include_ExcludeMethods;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class2_HowRunParticularMethod_Include_Exclude {
  @Test
  public void testCase5() 
  {
	  Reporter.log("5th testCase is running", true);
  }
  
  @Test
  public void testCase6()
  {
	  Reporter.log("6th testCase is running", true);
  }
  
  @Test
  public void testCase7()
  {
	  Reporter.log("7th TestCase is running", true);
  }
  
  @Test
  public void testCase8()
  {
	  Reporter.log("8th TestCase is running", true);
  }
  
}
