package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.GeneralUtilities;

public class WorkersPage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();

	public WorkersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Workers']")
	WebElement workerTab;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchButton;

	@FindBy(xpath = "//a[@aria-label='Delete']")
	WebElement deleteIcon;

	@FindBy(xpath = "//a[text()='Create Worker']")
	WebElement createWorkerMenu;

	@FindBy(id = "worker-title")
	WebElement workerTitle;

	public void clickWorkerTab() {
		workerTab.click();
	}

	public String getBorderColorOfSearchButton() {
		return gu.getStyleProperty(searchButton,"border-color");
	}

	public String getToolTipValueOfDeleteIcon() {
		return gu.getValueOfAttributeTitle(deleteIcon);
	}

	public void clickCreateWorkerMenu() {
		createWorkerMenu.click();
	}

	public String selectWorkerTitle() {

		return gu.dropdownValueSelect(workerTitle, "Mr");
		
	}
}
