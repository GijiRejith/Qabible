package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import elementRepository.Homepage;
import elementRepository.LoginPage;


public class LoginTestCases extends BaseClass {
	@Test(retryAnalyzer = listener.Retry.class)
	public void verifyLoginFeature() {
		LoginPage lp = new LoginPage(driver);
		lp.inputUserName("carol");
		lp.inputPassWord("1q2w3e");
		lp.clickLoginButton();
		Homepage h = new Homepage(driver);
		String actual = h.getTextOfHomePageWelcomeMessage();
		String expectedResult = "Welcome to Payroll Application";
		Assert.assertEquals(actual, expectedResult, "login not succesful");
  }
}
