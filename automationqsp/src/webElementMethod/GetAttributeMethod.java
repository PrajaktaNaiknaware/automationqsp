package webElementMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import webdrivermethod.WebElement;

public class GetAttributeMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/lenovo/Desktop/Html.docs/checkbox.html");
		org.openqa.selenium.WebElement automationCheckBox = driver.findElement(By.id("ch4"));
		String attrvalue = automationCheckBox.getAttribute("name");
		System.out.println(attrvalue);//n4	
	}

}
