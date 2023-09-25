package testCases;

//import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

import elementRepository.LoginPage;
import elementRepository.TimeSheetPage;

public class TimeSheetTestCase extends BaseClass {
	@Test
	public void verifyfileuploaded() throws Exception {
		LoginPage lp = new LoginPage(driver);
		lp.inputUserName("carol");
		lp.inputPassWord("1q2w3e4r");
		lp.clickLoginButton();
		TimeSheetPage ts = new TimeSheetPage(driver);
		ts.clickTimeSheetTab();
		ts.clickCreateTimeSheetTab();
		ts.clickBrowseMenu();
		ts.fileUpload();
//		String actual=
//	    String expected=
//	    Assert.assertEquals(actual, expected);
	}
}
