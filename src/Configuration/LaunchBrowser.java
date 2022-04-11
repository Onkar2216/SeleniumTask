package Configuration;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser 
{
	public static WebDriver ChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:/Software/Java Softwares/Testing/Browsers Driver/Chrome/Chrome 100/chromedriver.exe"); // To Set Property
		WebDriver driver=new ChromeDriver(); //launch the browser
		maximize(driver);
		timeout(driver);
		return driver;
	}
	
	public static WebDriver FirefoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "D:/Software/Java Softwares/Testing/Browsers Driver/FireFox/geckodriver.exe");
		WebDriver driver=new FirefoxDriver(); //launch the browser
		maximize(driver);
		timeout(driver);
		return driver;
	}
	
	public static void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	// Dynamic Wait Concept
	public static void timeout(WebDriver driver)
	{
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
}
