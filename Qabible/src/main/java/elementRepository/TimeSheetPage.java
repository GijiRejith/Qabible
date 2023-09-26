package elementRepository;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class TimeSheetPage {
	WebDriver driver;
	GeneralUtilities gu = new GeneralUtilities();
	public  TimeSheetPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='TimeSheet']")
	WebElement timeSheetTab;
	@FindBy(xpath="//a[text()='Create Timesheet']")
	WebElement createTimeSheetTab;
	@FindBy(xpath="//input[@type='file']")
	WebElement browseMenu;
	public void clickTimeSheetTab() {
		timeSheetTab.click();
	}
	public void clickCreateTimeSheetTab() {
		createTimeSheetTab.click();
	}
	public void clickBrowseMenu() {
		gu.mouseActionToMoveToElement(driver,browseMenu);
		
   }
	public void fileUpload() throws Exception {
		gu.toUploadfile("\\src\\main\\resources\\GIJIg.pdf");
	    gu.robotClassForKeyPress(KeyEvent.VK_CONTROL);
	    gu.robotClassForKeyPress(KeyEvent.VK_V);
	    gu.robotClassForKeyRelease(KeyEvent.VK_CONTROL);
	    gu.robotClassForKeyRelease(KeyEvent.VK_V);
	    gu.robotClassForKeyPress(KeyEvent.VK_ENTER);
	    gu.robotClassForKeyRelease(KeyEvent.VK_ENTER);
	}
}
