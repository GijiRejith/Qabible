package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class LoginPage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();
	public  LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "loginform-username")
	WebElement userName;
	
	@FindBy(id = "loginform-password")
	WebElement passWord;
	
	@FindBy(name = "login-button")
	WebElement loginButton;
	
	@FindBy(xpath = "//p[text()='Incorrect username or password.']")
	WebElement errorMessage;
	
	public void inputUserName(String username) {
		userName.sendKeys(username);
    }

	public void inputPassWord(String password) {
		passWord.sendKeys(password);
	}

	public void clickLoginButton() {
		loginButton.click();
	}
	
	public String  getErrorMessage() {
		return gu.getElementText(errorMessage);
	}

}
