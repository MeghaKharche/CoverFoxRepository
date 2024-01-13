package testNgStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UseAllAnnotations {
  @Test
  public void userName() 
  {
	  Reporter.log("Enter Username", true);
  }
  
  @Test
  public void password()
  {
	  Reporter.log("Enter password", true);
  }
  
  @BeforeClass
  public void registration()
  {
	  Reporter.log("Open Browser", true);
  }
  
  @BeforeMethod
  public void Signin()
  {
	  Reporter.log("Before method ==> SignUpPage Successful", true);
  }
  
  @BeforeMethod
  public void Login()
  {
	  Reporter.log("Before method ==> Login Successful", true);
  }
  
  @AfterMethod
  public void logout()
  {
	  Reporter.log("After method ==> Logout Successful", true);
  }
}
