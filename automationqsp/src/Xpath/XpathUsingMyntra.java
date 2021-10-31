package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class XpathUsingMyntra {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='desktop-query']/input")).sendKeys("jackets");
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[.='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Jackets']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Puma']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Rs. 9799 to Rs. 12649']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Blue']")).click();
		Thread.sleep(3000);
		String price = driver.findElement(By.xpath("(//ul[@class='results-base']/descendant::div[@class='product-price']/span)[1]")).getText();
        System.out.println(price);
	}

}
