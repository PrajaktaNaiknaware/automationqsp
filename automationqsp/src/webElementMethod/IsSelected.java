package webElementMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/lenovo/Desktop/Html.docs/checkbox.html");
		WebElement automationCheck = driver.findElement(By.xpath("//input[@id='ch4']"));
		automationCheck.click();
		boolean statusOfAUtomationCheckbox = automationCheck.isSelected();
		System.out.println(statusOfAUtomationCheckbox);	
	}

}
