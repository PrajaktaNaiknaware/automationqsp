package webElementMethod;

import java.awt.Point;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import webdrivermethod.WebElement;

public class GetLocationMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		org.openqa.selenium.WebElement logo = driver.findElement(By.xpath("//img[contains(@src,'logo')]"));
		org.openqa.selenium.Point loc = logo.getLocation();
		int xaxis = (int) loc.getX();
		int yaxis = (int) loc.getY();
		
		System.out.println("The x axis distance is "+xaxis);
		System.out.println("The y axis distance is "+yaxis);	
	}

}
