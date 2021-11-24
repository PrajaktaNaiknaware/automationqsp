package ParallelExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MethodsParallely {
	@Test
	public void a()
	{
		long idMethod1 = Thread.currentThread().getId();

		Reporter.log("method1"+""+idMethod1,true);

	}

	
	@Test
	public void b()
	{
		long idMethod2 = Thread.currentThread().getId();

		Reporter.log("method2"+""+idMethod2,true);

	}
}
