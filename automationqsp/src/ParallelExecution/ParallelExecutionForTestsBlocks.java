package ParallelExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecutionForTestsBlocks {
	WebDriver driver;
	@Parameters({"username","password","browser"})
	@Test
	public void testValidLogin(String un,String pwd,String browserValue) throws InterruptedException
	{
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.get("http://127.0.0.1/login.do;jsessionid=2l9j4jj1q8gsb");
			driver.findElement(By.name("username")).sendKeys(un);
			driver.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(3000);
			driver.findElement(By.id("loginButton")).click();
			
		}
		
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.get("http://127.0.0.1/login.do;jsessionid=2l9j4jj1q8gsb");
			driver.findElement(By.name("username")).sendKeys(un);
			driver.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(3000);
			driver.findElement(By.id("loginButton")).click();
		}
		
		else
		{
			Reporter.log("invalid i/p",true);
		}
	
		
	}
}
