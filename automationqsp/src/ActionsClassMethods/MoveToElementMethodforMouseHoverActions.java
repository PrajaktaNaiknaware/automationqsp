package ActionsClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethodforMouseHoverActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		Thread.sleep(4000);
		
		WebElement Ringstarget = driver.findElement(By.xpath("//a[@title='Rings' and .='Rings ']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(Ringstarget).perform();
		Thread.sleep(3000);
		//this engagement option is now interactable
		driver.findElement(By.xpath("//a[.='Engagement']")).click();	
	}

}
