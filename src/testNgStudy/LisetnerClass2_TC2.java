package testNgStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//we have add listeners for multiple classes so, we create xml file that we create listeners

//@Listeners(testNg_listeners.Listener.class)

public class LisetnerClass2_TC2 
{
  @Test
  public void f() 
  {
	  Reporter.log("Hi f is running", true);
  }
  
  @Test 
  public void g()
  {
	  Reporter.log("Hi g is running ",true);
  }
  
  @Test(dependsOnMethods = {"g"})
  public void h()
  {
	  Assert.fail();
	  Reporter.log("Hi h is running ", true);
  }
  
  @Test
  public void i()
  {
	  Reporter.log("Hi i is running ", true);
  }
}
