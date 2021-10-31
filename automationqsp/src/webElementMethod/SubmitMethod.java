package webElementMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com");
		driver.findElement(By.xpath("//input[contains(@name,'user')]")).sendKeys("surajsurajsuraj");
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("sawantsawantsawant");
		driver.findElement(By.xpath("//button[contains(@class,'L3NKy')]")).submit();	
	}

}
