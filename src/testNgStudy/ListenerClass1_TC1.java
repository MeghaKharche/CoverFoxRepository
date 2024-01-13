package testNgStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//(package name.class name .class)
@Listeners(testNg_listeners.Listener.class)

//this Listener class create inside testNg

public class ListenerClass1_TC1 
{
  @Test
  public void a() 
  {
	  Reporter.log("Hi a is running",true);  
  }
  
  @Test
  public void b()
  {
	  Assert.fail();
	  Reporter.log("Hi b is running", true);
  }
  
  @Test(dependsOnMethods = {"b"})
  public void c()
  {
	  Reporter.log("Hi c is running", true);
  }
  
  @Test
  public void d()
  {
	  Reporter.log("Hi d is running ",true);
  }	
}
