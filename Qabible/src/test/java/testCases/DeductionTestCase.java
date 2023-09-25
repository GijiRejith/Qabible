package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import constant.Constant;
import elementRepository.DeductionPage;
import elementRepository.LoginPage;

public class DeductionTestCase extends BaseClass {
	@Test
	public void verifySelectedValueOfTypeField() {
		LoginPage lp = new LoginPage(driver);
		lp.inputUserName("carol");
		lp.inputPassWord("1q2w3e4r");
		lp.clickLoginButton();
		DeductionPage dp = new DeductionPage(driver);
		dp.deductionTabClick();
		dp.addDeductionTabClick();
		String actual = dp.getValueOfTypeField();
		String expected = "Safety Wear";
		Assert.assertEquals(actual, expected, Constant.ERRORMESSAGEWRONGSELECTEDVALUE);
	}

	public void verifyBackgroundColorOfSaveButton() {
		LoginPage lp = new LoginPage(driver);
		lp.inputUserName("carol");
		lp.inputPassWord("1q2w3e4r");
		lp.clickLoginButton();
		DeductionPage dp = new DeductionPage(driver);
		dp.deductionTabClick();
		dp.addDeductionTabClick();
		String actual = dp.getBackgroundColorOfSaveButton();
		String expected = "rgb(92 ,184, 92)";
		Assert.assertEquals(actual, expected, Constant.ERRORMESSAGEWRONGBACKGROUNDCOLOR);

	}
}
