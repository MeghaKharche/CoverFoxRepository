package testNgStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoExample1 {
  @Test
  public void displayMessage() 
  {
	  	System.out.println("Hi by printing statement message");
	  	Reporter.log("Hi by reporter  without boolean ");
	  	Reporter.log("Hi using reporter with boolean", false);
	  	Reporter.log("Hi using reporter with boolean", true);
  }
}
