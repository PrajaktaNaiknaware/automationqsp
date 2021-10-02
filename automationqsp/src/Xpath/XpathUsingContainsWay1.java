package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingContainsWay1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.instagram.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@name,'user')]")).sendKeys("praju");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("praju15");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@class,'L3NKy')]")).click();

	}

}
