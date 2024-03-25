package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {

	public static void main(String[] args) throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver;
	    driver=new ChromeDriver();
	    driver.get("https://google.com");
	    Thread.sleep(3000);
	    driver.quit();
	    
	}

}
