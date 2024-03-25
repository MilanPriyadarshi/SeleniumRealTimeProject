package Pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utilities.BrowserFactory;
import Utilities.ConfigDataProvider;

public class BaseTest {
	WebDriver driver;
	ConfigDataProvider config=new ConfigDataProvider();
	@BeforeClass
	public void setUp() {
		BrowserFactory.startApplication(driver, config.getBrowser(), config.getUrl());
	}
	@AfterClass
	public void teardown()
	{
		BrowserFactory.quitBrowser(driver);
	}
}
