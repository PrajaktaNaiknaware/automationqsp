package webdrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/lenovo/Desktop/Html.docs/link.html");
		Thread.sleep(9000);
		String sourceCodeofwebpage= driver.getPageSource();
		System.out.println("sourcecodeofwebpage");
		driver.close();
		
		
	}
		

	
}
