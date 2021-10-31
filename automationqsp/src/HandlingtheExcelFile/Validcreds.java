package HandlingtheExcelFile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validcreds {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=8pfpp0kh1199s");

		Flib flib = new Flib();
		int rc = flib.rowcount("./Data/TestData.xlsx", "invalidcreds");
		
		for(int i=1;i<rc;i++) 
		{
			String username = flib.readExcelData("./Data/TestData.xlsx", "invalidcreds", i, 0);
			String password = flib.readExcelData("./Data/TestData.xlsx", "invalidcreds", i, 1);

			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			WebElement result = driver.findElement(By.xpath("//span[.='Username or Password is invalid. Please try again.']"));
			if(result.isEnabled())
			{
				flib.writeExcelData("./Data/TestData.xlsx", "invalidcreds", i, 2, "Fail");
			}
			else
			{
				
			}
			driver.navigate().refresh();
			driver.findElement(By.name("username")).clear();
			Thread.sleep(1000);
		}
		
	}

}
