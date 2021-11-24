package PageObjectModel;

import java.io.IOException;

public class TestActiTimeLogout extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		LoginPage lp = new LoginPage(driver);//page class
		Flib flib = new Flib();
		String username = flib.readPropertyData(PROP_PATH, "username");
		String password = flib.readPropertyData(PROP_PATH, "password");
		
		lp.validLoginActiTime(username,password);
		
		lp.delayofFiveSeconds();
		HomePage hp = new HomePage(driver);
		hp.logoutActiTime();
	}

}
