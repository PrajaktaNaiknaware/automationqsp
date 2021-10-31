package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingSearchHotelsTeststring {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.goibibo.com/hotels/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h4[.='India']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[.='Udaipur']")).sendKeys("Udaipur");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h4[.='Oct 8, 2021']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h4[.='Oct 9, 2021']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='1 Night']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='5 Guests in 2 Rooms ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//h4[@class='dwebCommonstyles__SmallSectionHeader-sc-112ty3f-7 PaxWidgetstyles__ContentActionValueWrapperSpan-sc-gv3w6r-7 hAEfdZ dkRohM'])[1]")).sendKeys("child");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='Done']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='Search Hotels']")).click();
	}

}
