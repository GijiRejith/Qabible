package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class Clientpage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();

	public Clientpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Clients']")
	WebElement clientTab;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement searchButton;

	@FindBy(xpath = "//a[text()='Create Client']")
	WebElement createClient;

	@FindBy(id = "client-require_po")
	WebElement requirePoCheckBox;
	
	@FindBy(id = "client-direct_client")
	WebElement directClientCheckBox;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement saveButton;

	public void clientTabClick() {
		clientTab.click();
	}

	public String getTextOfSearchButton() {
		return gu.getElementText(searchButton);
	}

	public void clickCreateClient() {
		createClient.click();
	}

	public boolean isRequirePoCheckBoxIsSelected() {
		requirePoCheckBox.click();
	    return gu.toVerifyCheckBoxIsSelected(requirePoCheckBox);
		
	}
	public String getFontSizeOfSaveButton() {
		gu.scrollDown(driver);
		return gu.getStyleProperty(saveButton,"font-size");
		
	}
}
