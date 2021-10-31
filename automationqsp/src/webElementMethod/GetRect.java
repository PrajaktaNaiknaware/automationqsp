package webElementMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import webdrivermethod.WebElement;

public class GetRect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		org.openqa.selenium.WebElement logo = driver.findElement(By.xpath("//img[contains(@src,'logo')]"));
		Rectangle rect = logo.getRect();
		int width = rect.getWidth();
		int height = rect.getHeight();
		System.out.println("the height of logo "+height);
		System.out.println("the width  of logo "+width);	
		
		
		
		
		int xaxis = rect.getX();
		int yaxis = rect.getY();
		
		System.out.println("The x axis distance is "+xaxis);
		System.out.println("The y axis distance is "+yaxis);	
	}

}
