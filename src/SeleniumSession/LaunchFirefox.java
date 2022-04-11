package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox 
{
	public static void main(String[] args) 
	{
		// To launch Firefox
		
			// To set Property 
			// System.setProperty("webdriver.gecko.driver", "D:/Software/Java Softwares/Testing/geckodriver-v0.30.0-win64/geckodriver.exe");
			
			//Create Object Of Firefox Driver
			//WebDriver driver=new FirefoxDriver();
			
			// To launch Site 
			//driver.get("http://youtube.com");
		
		
		// To launch chrome
		
			// To set Property 
			System.setProperty("webdriver.chrome.driver", "D:/Software/Java Softwares/Testing/Browsers Driver/Chrome/chromedriver.exe");
			
			//Create Object Of chromeDriver
			WebDriver driver1=new ChromeDriver(); //launch the browser
					
			// To launch Site 
			driver1.get("http://youtube.com");  //ENter the URL
			
		// To launch Safari Browser
			
			
		
		
	}

}
