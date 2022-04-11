package SeleniumSession;

import Configuration.LaunchBrowser;
import Configuration.configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandleIframeConcepts
{
    public static void main(String[] args)
    {
        WebDriver driver= LaunchBrowser.ChromeBrowser();
        driver.get(configuration.IframeURL);
        WebElement element=driver.findElement(By.xpath(configuration.Iframe));
        driver.switchTo().frame(element);
        WebElement element1=driver.findElement(By.xpath(configuration.iframe1));
        driver.switchTo().frame(element1);
        driver.findElement(By.xpath(configuration.menu)).click();
    }
}
