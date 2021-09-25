package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTimePolymorphismLaunch {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter the browser name that you want to open either chrome or Firefox");
		String browserValue = SC.nextLine();
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			Thread.sleep(5000);
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			Thread.sleep(5000);
			driver.close();
		}
		else if(browserValue.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			Thread.sleep(5000);
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			Thread.sleep(5000);
			driver.close();
			
		}
		else
		{
			System.out.println("Enter the valid input");
			
		}
			
	}
			
		
		
		
	}
	


