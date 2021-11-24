package Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledFlag {
	@Test(enabled = false)
	  public void f() {
		  
		  Reporter.log("hiiiii");
	  }
}
