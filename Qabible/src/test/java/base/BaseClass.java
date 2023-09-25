package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ScreenshotCapture;

public class BaseClass {
	public WebDriver driver;
	public static Properties properties;
	public static void testBase() throws Exception {
		properties=new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "//src//main//resources//config.properties");
		properties.load(ip);
	}

	@BeforeMethod(alwaysRun = true)
	  @Parameters("browser")
	public void beforeMethod(String browserName) throws Exception {
		testBase();
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(properties.getProperty("baseUrl"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod(ITestResult iTestResult) throws Exception {
		if (iTestResult.getStatus() == iTestResult.FAILURE) {
			ScreenshotCapture sc = new ScreenshotCapture();
			sc.captureScrrenshotOnFailure(driver, iTestResult.getName());
		}
	  driver.close();
  }

}
