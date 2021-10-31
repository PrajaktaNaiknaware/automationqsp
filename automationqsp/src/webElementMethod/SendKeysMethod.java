package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("http://laptop-smc8hiai/login.jsp");
		
		WebElement usernameTextBox = driver.findElement(By.xpath("//input[@name='username']"));
		usernameTextBox.sendKeys("admin");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(),'Log')]"));
		loginButton.click();
	}

}
