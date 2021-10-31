package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='PIM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='Add Employee']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("abc123");
		driver.findElement(By.id("middleName")).sendKeys("xyz123");
		driver.findElement(By.id("lastName")).sendKeys("jkl123");
		Thread.sleep(3000);
		//use of clear to clear the text present in the textbox
		driver.findElement(By.id("employeeId")).clear();
		
		driver.findElement(By.id("employeeId")).sendKeys("18");
		driver.findElement(By.id("btnSave")).click();
			
	}

}
