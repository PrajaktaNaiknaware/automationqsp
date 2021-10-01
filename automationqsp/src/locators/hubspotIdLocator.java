package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hubspotIdLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.instagram.com/");
		driver.findElement(By.id("email")).sendKeys("Abss");
		driver.findElement(By.id("pass")).sendKeys("jeejfh123");
		driver.findElement(By.id("u_0_d_SD")).click();
		
			}

}
