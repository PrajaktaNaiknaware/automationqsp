package OperationalMethodsOfSelectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionMethodForSingleSelectUsingForEachLoop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/lenovo/Desktop/Html.docs/singleselectdropdown.html");
		Thread.sleep(8000);
		
		WebElement element = driver.findElement(By.id("menu"));
		Select sel = new Select(element);
		List<WebElement> options = sel.getOptions();
		
		
		//using For each Loop
		for(WebElement suraj :options)
		{
			String textOfTheOption = suraj.getText();
			System.out.println(textOfTheOption);
		}	
	}

}
