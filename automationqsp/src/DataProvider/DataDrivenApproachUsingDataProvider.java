package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.collections.Objects;

public class DataDrivenApproachUsingDataProvider {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=626v55en0ra37");
	}

	@DataProvider(name="ActiTimeInvalidCredentials")
	public Object[][] dataProvider()
	{
		Object[][] data =new Object[3][2];
		data[0][0]	="admin";
		data[0][1]  ="manager123";
		
		data[1][0]	=" ";
		data[1][1]  ="manager123";
		
		data[2][0]	="admin";
		data[2][1]  ="manager123";
		
		return data;
	}
	@Test(dataProvider = "ActiTimeInvalidCredentials")
	public void testActiTimeLogin(String un,String pwd) throws InterruptedException
	{

		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		
		
	}







	@AfterMethod

	public void tearDown()
	{
		driver.quit();

	}

	

}
