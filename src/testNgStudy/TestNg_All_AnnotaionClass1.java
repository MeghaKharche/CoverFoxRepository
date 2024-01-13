package testNgStudy;

//Before Suite is running
//Before test is running
//Before class is running
//Before Method is running
//test case 1 is running
//After method is running
//Before Method is running
//Test case 2 is running
//After method is running
//After class is running
//After Test is running

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNg_All_AnnotaionClass1 {
  @Test
  public void testCase1() 
  {
	  Reporter.log("test case 1 is running", true);
  }
  @Test
  public void testCase2()
  {
	  Reporter.log("Test case 2 is running", true);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("Before Method is running", true);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("After method is running", true);
  }

  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("Before class is running", true);
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("After class is running", true);
  }

  @BeforeTest
  public void beforeTest() 
  {
	  Reporter.log("Before test is running", true);
  }

  @AfterTest
  public void afterTest() 
  {
	  Reporter.log("After Test is running", true);
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  Reporter.log("Before Suite is running", true);
  }

  @AfterSuite
  public void afterSuite() 
  {
	  Reporter.log("After Suite is running", true);
  }

}
