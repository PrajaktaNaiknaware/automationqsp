package Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DescriptionFlag {
  @Test(description = "we are going to test the login feature")
  public void login() 
  {
	  Reporter.log("login test case",true);
  }
}
