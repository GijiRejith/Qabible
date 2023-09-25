package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class DeductionPage {
	WebDriver driver;
	GeneralUtilities gu=new GeneralUtilities();

	public DeductionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Deduction']")
	WebElement deductionTab;

	@FindBy(xpath = "//a[text()='Add Deduction']")
	WebElement addDeductionTab;
	
	@FindBy(id="deduction-type")
	WebElement selecttype;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement saveButton;

	public void deductionTabClick() {
		deductionTab.click();
	}
	
	public void addDeductionTabClick() {
		addDeductionTab.click();
	}
	public String getValueOfTypeField() {
		return gu.dropdownValueSelect(selecttype,"Safety Wear");
	}
	public String getBackgroundColorOfSaveButton() {
		return gu.getStyleProperty(saveButton, "background-color");
		
	}
}
