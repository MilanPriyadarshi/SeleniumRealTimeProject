package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	public static WebDriver startApplication(WebDriver driver,String browserName,String appUrl)
	{
		
		if(browserName.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions op = new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");
	         driver = new ChromeDriver(op);
		}
		else if(browserName.equals("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
	         driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE"))
		{
			WebDriverManager.edgedriver().setup();
	         driver = new InternetExplorerDriver();
		}
		else
		{
			System.out.println("We do not support this browser "+"Choose Chrome,firefox or IE");
		}

		
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		return driver;

	}
	
//	public static void quitBrowser(WebDriver driver)
//	{
//		driver.quit();
//	}

}
