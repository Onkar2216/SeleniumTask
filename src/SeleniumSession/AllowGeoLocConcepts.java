package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class AllowGeoLocConcepts 
{
	public static final String URL = "https://API_KEY:API_SECRET@hub.testingbot.com/wd/hub";

	public static void main(String[] args) throws Exception
	{
	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browserName", "Chrome");
	    caps.setCapability("version", "latest");
	    caps.setCapability("platform", "WIN10");

	    ChromeOptions options = new ChromeOptions();
	    Map<String, Object> prefs = new HashMap<String, Object>();
	    Map<String, Object> profile = new HashMap<String, Object>();
	    Map<String, Object> contentSettings = new HashMap<String, Object>();

	    // 0 - Default, 1 - Allow, 2 - Block
	    contentSettings.put("geolocation", 1);
	    profile.put("managed_default_content_settings", contentSettings);
	    prefs.put("profile", profile);
	    options.setExperimentalOption("prefs", prefs);

	    caps.setCapability(ChromeOptions.CAPABILITY, options);
	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	    driver.get("https://the-internet.herokuapp.com/geolocation");
	    driver.findElement(By.xpath("//*[@id='content']/div/button")).click();
	    Thread.sleep(5000);
	    driver.quit();
	  }
}
