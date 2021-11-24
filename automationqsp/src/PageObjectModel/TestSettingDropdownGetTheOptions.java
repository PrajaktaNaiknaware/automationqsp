package PageObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class TestSettingDropdownGetTheOptions extends BaseTest{

	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		WebdriverCommonLib wb = new WebdriverCommonLib();
		wb.verifyTheTitle("actiTIME - Login", " login page ");
		
		Flib flib = new Flib();
		
		LoginPage lp = new LoginPage(driver);
		lp.validLoginActiTime(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		
		wb.waitForThePageToLoad("Enter", 30);
		wb.verifyTheTitle("actiTIME - Enter Time-Track", " Home page ");
		
		SettingPage set = new SettingPage(driver);
		wb.waitForTheWebELement();
		set.clickOnSettings();
		
		WebElement dropdown1Element = set.getDropdown1();
		WebElement dropdown2Element = set.getDropdown2();
		WebElement dropdown3Element = set.getDropdown3();
		
		wb.getAllTheOptionsOfDropdown(dropdown1Element);
		wb.getAllTheOptionsOfDropdown(dropdown2Element);
		wb.getAllTheOptionsOfDropdown(dropdown3Element);
		
		wb.takeTheScreenShotOfTheWebPage("Settings");
	}
	}


