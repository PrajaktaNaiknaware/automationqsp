package HandlingtheExcelFile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=6sm0sdjc9o7c0");
		
		WebElement usn = driver.findElement(By.name("username"));
		WebElement pass = driver.findElement(By.name("pwd"));
		WebElement loginBtn = driver.findElement(By.id("loginButton"));
		
		Flib flib = new Flib();
		String username = flib.readExcelData("./Data/TestData.xlsx", "validcreds", 1, 0);
		String password = flib.readExcelData("./Data/TestData.xlsx", "validcreds", 1, 1);
		
		usn.sendKeys(username);
		Thread.sleep(1000);
		pass.sendKeys(password);
		Thread.sleep(1000);
		loginBtn.click();
	}
	

}
