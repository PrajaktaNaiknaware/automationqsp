package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import webdrivermethod.WebElement;
public class GetTextMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.selenium.dev");
		WebElement downloadLink = (WebElement) driver.findElement(By.xpath("//a[.='Downloads']"));
		String textOfTheLink = ((org.openqa.selenium.WebElement) downloadLink).getText();
		System.out.println(textOfTheLink);
		
	}

}
