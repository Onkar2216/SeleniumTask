package Selenium_4_Features;

import Configuration.LaunchBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class OpeningTabConcept
{
    public static void main(String[] args) {
        WebDriver driver= LaunchBrowser.ChromeBrowser();
        driver.get("http://www.google.co.in");
        System.out.println("Before TAb >> "+driver.getTitle());
        driver.switchTo().newWindow(WindowType.TAB);
        Set<String> windows=driver.getWindowHandles();
        List<String> w=new ArrayList<>(windows);
        System.out.println("After Opening TAb >> "+driver.getTitle());
        driver.get("https://www.facebook.com");
        System.out.println("After Entering URL in TAb >> "+driver.getTitle());
        driver.close();
        driver.switchTo().window(w.get(0));
        System.out.println("Close TAb >> "+driver.getTitle());
    }
}
