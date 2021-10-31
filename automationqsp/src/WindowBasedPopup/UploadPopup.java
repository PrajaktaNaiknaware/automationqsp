package WindowBasedPopup;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadPopup {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
		driver.findElement(By.id("firstName")).sendKeys("abc");
		driver.findElement(By.id("middleName")).sendKeys("xyz");
		driver.findElement(By.id("lastName")).sendKeys("jkl");
		driver.findElement(By.id("employeeId")).clear();
	
		WebElement target = driver.findElement(By.id("photofile"));
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\lenovo\\git\\repository\\automationqsp\\Autoit\\upload.exe");
	}

}
