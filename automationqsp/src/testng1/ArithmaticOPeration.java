package testng1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ArithmaticOPeration 
{
WebDriver driver;
	
	@Test(priority = -1)
	public void launchApp()
	{
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("https://www.calculator.net");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Parameters({"plus","operand1","operand2"})
	@Test(priority = 0)
	public void add(String plusOperator,int a,int b) throws InterruptedException
	{
		driver.findElement(By.xpath("//span[.='"+a+"']")).click();
		driver.findElement(By.xpath("//span[.='"+plusOperator+"']")).click();
		driver.findElement(By.xpath("//span[.='"+b+"']")).click();
		String result = driver.findElement(By.id("sciOutPut")).getText();
		Reporter.log("The result of addition is : "+ result+" ",true);
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		

	}

	@Parameters({"sub","operand1","operand2"})
	@Test(priority = 1)
	public void sub(String minusOperator,int a,int b) throws InterruptedException
	{
		driver.findElement(By.xpath("//span[.='"+a+"']")).click();
		driver.findElement(By.xpath("//span[.='"+minusOperator+"']")).click();
		driver.findElement(By.xpath("//span[.='"+b+"']")).click();
		String result = driver.findElement(By.id("sciOutPut")).getText();
		Reporter.log("The result of subtraction is : "+ result+" ",true);
		Thread.sleep(3000);
		driver.navigate().refresh();

	}


	@Parameters({"multiplication","operand1","operand2"})
	@Test(priority = 2)
	public void multiplication(String multiplicationOperator,int a,int b) throws InterruptedException
	{

		driver.findElement(By.xpath("//span[.='"+a+"']")).click();
		driver.findElement(By.xpath("//span[.='"+multiplicationOperator+"']")).click();
		driver.findElement(By.xpath("//span[.='"+b+"']")).click();
		String result = driver.findElement(By.id("sciOutPut")).getText();
		Reporter.log("The result of multiplication is : "+ result+" ",true);
		
		Thread.sleep(3000);
		driver.navigate().refresh();

		
	}


	@Parameters({"division","operand1","operand2"})
	@Test(priority = 3)
	public void division(String divisionOperator,int a,int b) throws InterruptedException
	{

		driver.findElement(By.xpath("//span[.='"+a+"']")).click();
		driver.findElement(By.xpath("//span[.='"+divisionOperator+"']")).click();
		driver.findElement(By.xpath("//span[.='"+b+"']")).click();
		String result = driver.findElement(By.id("sciOutPut")).getText();
		Reporter.log("The result of division is : "+ result+" ",true);
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
}
