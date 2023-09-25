package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import constant.Constant;
import elementRepository.Clientpage;
import elementRepository.LoginPage;

public class ClientTestCase extends BaseClass {
	// @Test
		public void verifyTextOfSearchButton() {
			LoginPage lp = new LoginPage(driver);
			lp.inputUserName("carol");
			lp.inputPassWord("1q2w3e4r");
			lp.clickLoginButton();
			Clientpage cp = new Clientpage(driver);
			cp.clientTabClick();

			String actualResult = cp.getTextOfSearchButton();
			String expectedResult = "Search";
			Assert.assertEquals(actualResult, expectedResult, Constant.ERRORMESSAGEWRONGSEARCHBUTTON);
		}
	// @Test
	 public void verifyCheckboxIsSelected() {
		 LoginPage lp = new LoginPage(driver);
			lp.inputUserName("carol");
			lp.inputPassWord("1q2w3e4r");
			lp.clickLoginButton();
			Clientpage cp = new Clientpage(driver);
			cp.clientTabClick();
			cp.clickCreateClient();

			boolean actualResult = cp.isRequirePoCheckBoxIsSelected();
			boolean expectedResult = true;
			Assert.assertEquals(actualResult, expectedResult, Constant.ERRORMESSAGEWRONGSEARCHBUTTON);
		 
	 }
	 @Test
	 public void verifyFontSizeOfSaveButton() {
		 LoginPage lp = new LoginPage(driver);
			lp.inputUserName("carol");
			lp.inputPassWord("1q2w3e4r");
			lp.clickLoginButton();
			Clientpage cp = new Clientpage(driver);
			cp.clientTabClick();
			cp.clickCreateClient();
			String actual=cp.getFontSizeOfSaveButton();
			String expected="14px";
			Assert.assertEquals(actual, expected);
	 
	}
}
