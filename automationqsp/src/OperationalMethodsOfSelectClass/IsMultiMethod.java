package OperationalMethodsOfSelectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/lenovo/Desktop/Html.docs/Multiselectdropdown.html");
		Thread.sleep(8000);


		WebElement element = driver.findElement(By.id("menu"));
		Select sel = new Select(element);
		boolean status = sel.isMultiple();
		
		System.out.println(status);//true because we are using multiselect dropdown

	
	}

}
