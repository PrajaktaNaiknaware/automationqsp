package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  
	@Test
  public void login() {
		Reporter.log("login to the app");
		
  }
	@Test
	public void logout()
	{
		Reporter.log("Logout from app");
	}
}
