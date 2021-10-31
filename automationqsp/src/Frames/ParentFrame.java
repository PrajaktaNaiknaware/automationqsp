package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/HP/Desktop/htmldocswcsm5a/username.html");
		driver.findElement(By.id("un")).sendKeys("suraj");
		Thread.sleep(5000);
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("pwd")).sendKeys("sawant");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.findElement(By.id("un")).clear();
	}

}
