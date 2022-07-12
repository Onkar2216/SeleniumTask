package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesConcept
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "D:/Software/Java Softwares/Testing/Browsers Driver/Chrome/Chrome 103/chromedriver.exe"); // To Set Property
        DesiredCapabilities dc=new DesiredCapabilities();
        dc.acceptInsecureCerts();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
      //  options.addArguments("headless");
        options.merge(dc);
        WebDriver driver=new ChromeDriver(options); //launch the browser

        driver.get("https://cocert.com");
    }
}
