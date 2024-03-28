package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.BaseTest;
import Pages.LogInPage;
public class Test1 extends BaseTest  {
	WebDriver driver;
	@Test
	public void verifyLogin() throws InterruptedException {
		LogInPage lg=new LogInPage(driver);
		String username="locked_out_user";
		String password="secret_sauce";
		lg.LogInAction(username,password);
		
	}
	

	

}
