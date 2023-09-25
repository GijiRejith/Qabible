package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import elementRepository.LoginPage;
import elementRepository.WorkersPage;

public class WorkersTestCase extends BaseClass {
 

	@Test(groups="smoke")
	public void verifyBorderColorOfSearchButton() {
		LoginPage lp = new LoginPage(driver);
		lp.inputUserName("carol");
		lp.inputPassWord("1q2w3e4r");
		lp.clickLoginButton();
		WorkersPage wp = new WorkersPage(driver);
		wp.clickWorkerTab();
        String actualResult = wp.getBorderColorOfSearchButton();
		String expectedResult = "rgb(46, 109, 164)";
		Assert.assertEquals(actualResult, expectedResult, "border color of search button is not verified");
	}

	@Test
	public void verifyToolTipValueOfDeleteIcon() {
		LoginPage lp = new LoginPage(driver);
		lp.inputUserName("carol");
		lp.inputPassWord("1q2w3e4r");
		lp.clickLoginButton();
		WorkersPage wp = new WorkersPage(driver);
        wp.clickWorkerTab();
		String actualResult = wp.getToolTipValueOfDeleteIcon();
		String expectedResult = "Delete";
		Assert.assertEquals(actualResult, expectedResult, " toolTip Value Of Delete Icon is not verified");
	}

	@Test(groups="smoke")
	public void verifySelectedValueOfWorkerTitleField() {
		LoginPage lp = new LoginPage(driver);
		lp.inputUserName("carol");
		lp.inputPassWord("1q2w3e4r");
		lp.clickLoginButton();
		WorkersPage wp = new WorkersPage(driver);
		wp.clickWorkerTab();
		wp.clickCreateWorkerMenu();
		
		String actual=wp.selectWorkerTitle();
		String expectedResult = "Mr";
		Assert.assertEquals(actual, expectedResult, "selected value of workertitle field is not verified");
	}

}
