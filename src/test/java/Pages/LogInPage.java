package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends BaseTest {
	WebDriver driver;
	//Constructor
	public LogInPage(WebDriver lDriver)
	{
		this.driver=lDriver;
		
		PageFactory.initElements(driver,this);
	}
	//locating elements
	@FindBy(id="user-name")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="login-button")
	WebElement logIn;
	
	public void LogInAction(String uname,String pass) throws InterruptedException
	{
		username.sendKeys(uname);
		password.sendKeys(pass);
		Thread.sleep(2000);
		logIn.click();
	}

}
