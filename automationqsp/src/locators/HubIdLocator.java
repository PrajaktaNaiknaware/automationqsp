package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HubIdLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://app.hubspot.com/login/?__cf_chl_jschl_tk__=pmd_A2n_wXVzMJD3F97aKx.vrAXUG1AzdIkHMuwgsC.vpkA-1632756898-0-gqNtZGzNAhCjcnBszQgl");
		driver.findElement(By.id("username")).sendKeys("ss");
		driver.findElement(By.id("password")).sendKeys("fh123");
		driver.findElement(By.id("loginBtn")).click();
		
	}

}
