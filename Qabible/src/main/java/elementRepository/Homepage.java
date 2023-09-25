package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class Homepage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();

	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='Welcome to Payroll Application']")
	WebElement welcomePageText;

	public String getTextOfHomePageWelcomeMessage() {
		return gu.getElementText(welcomePageText);

	}
}