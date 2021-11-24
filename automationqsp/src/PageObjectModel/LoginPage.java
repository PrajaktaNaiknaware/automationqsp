package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    
	//Declaration
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(xpath="//img[contains(@src,'timer')]") private WebElement logo;
	@FindBy(id="keepLoggedInCheckBox") private WebElement checkBox;
	
	//Initialization
	 public LoginPage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
			
		}
	 //Utilization

	public WebElement getUsn() {
		return usn;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getLogo() {
		return logo;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}
	
	//generic reusable method/Buisiness method to login with valid creds
		public void validLoginActiTime(String validusername,String validpassword)
		{
			usn.sendKeys(validusername);
			pass.sendKeys(validpassword);
			loginButton.click();
			
		}
		
		//generic reusable method/Buisiness method to login with invalid creds
			public void invalidLoginActiTime(String invalidusername,String invalidpassword) throws InterruptedException
			{
				usn.sendKeys(invalidusername);
				pass.sendKeys(invalidpassword);
				loginButton.click();
				Thread.sleep(3000);
				usn.clear();
				
			}
		
		public void delayofFiveSeconds() throws InterruptedException
		{
			Thread.sleep(5000);
		}
		
	
}
