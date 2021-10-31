package KeyDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

public class UdateActiTimeInvalidLogin extends UpdateBaseTest {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		UpdateBaseTest bt = new UpdateBaseTest();
		Flib flib = new Flib();
		int rc = flib.getTheRowCount(EXCEL_PATH, "invalidcreds");
		bt.setUp();

		for(int i=1;i<=rc;i++)
		{
			String username = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
			String password = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);

			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();

			Thread.sleep(2000);
			driver.navigate().refresh();
			driver.findElement(By.name("username")).clear();
			Thread.sleep(1000);

		}

		bt.tearDown();
	}

}
