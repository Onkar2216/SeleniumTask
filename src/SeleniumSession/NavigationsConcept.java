package SeleniumSession;

import Configuration.LaunchBrowser;
import org.openqa.selenium.WebDriver;

public class NavigationsConcept
{
	public static void main(String[] args) 
	{
		WebDriver driver= LaunchBrowser.ChromeBrowser();
		
		driver.get("https://www.facebook.com");
		
		driver.navigate().to("https://www.amazon.in/");
		
		//Forward And Backword Simulation
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
	}

}
