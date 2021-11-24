package TakesScreenshotDynamically;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Customlistner.class)
public class TestScript extends BaseTest {
	@Test
	public void testActiTimeLogin1() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager123");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
		
	}
	
	
	@Test
	public void testActiTimeLogin2() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager123");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
		
	}
	
	
	
	@Test
	public void testActiTimeLogin3() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager123");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
		
	}
	
	
	@Test
	public void testActiTimeLogin4() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
		
	}
	
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	}
	
	
	
	
	
	@AfterMethod
	
	public void tearDown()
	{
		driver.quit();
	}
}
