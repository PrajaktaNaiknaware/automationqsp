package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DelayFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(10000);
		driver.close();
	
	}

}
