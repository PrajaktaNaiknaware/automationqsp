package KeyDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class UpdateActiTimeValidLogin extends UpdateBaseTest{

	public static void main(String[] args) throws IOException {
		UpdateBaseTest bt = new UpdateBaseTest();
		Flib flib = new Flib();
		String username = flib.readPropertyData(PROP_PATH,"username");
		String password = flib.readPropertyData(PROP_PATH,"password");
		bt.setUp();
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
		bt.tearDown();
	}

}
