package utilities;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GeneralUtilities {

	public String getElementText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public String getStyleProperty(WebElement element, String propertyType) {
		String getStyleValue = element.getCssValue(propertyType);
		return getStyleValue;
	}

	public String getValueOfAttributeTitle(WebElement element) {
		String title = element.getAttribute("title");
		return title;
	}

	public String dropdownValueSelect(WebElement element, String valueToSelect) {
		Select s = new Select(element);
		s.selectByValue(valueToSelect);
		String selectedValueText = s.getFirstSelectedOption().getText();
		return selectedValueText;
	}

	public void mouseActionToMoveToElement(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
	}

	public void toUploadfile(String filepath) {
		StringSelection ss = new StringSelection(System.getProperty("user.dir")+filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	}

	public void robotClassForKeyPress(int keyValue) throws Exception {
		Robot r = new Robot();
		r.delay(250);
		r.keyPress(keyValue);
	}

	public void robotClassForKeyRelease(int keyValue) throws Exception {
		Robot r = new Robot();
		r.delay(250);
		r.keyRelease(keyValue);
	}
	public boolean toVerifyCheckBoxIsSelected(WebElement element) {
		return element.isSelected();
	}
	public void scrollDown(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,400)", "");
	}
}