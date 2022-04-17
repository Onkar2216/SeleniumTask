package Tasks;

import Configuration.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokanLinks {
    public static void main(String[] args) {
        WebDriver driver= LaunchBrowser.ChromeBrowser();
        driver.get("https://www.amezon.com");
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("Total Links is >> "+links.size());
        for (WebElement e: links)
        {
            String url=e.getAttribute("href");
            checkBrokanLinks(url);
        }
    }

    public static void checkBrokanLinks(String linkUrl) {
        try
        {
            URL url=new URL(linkUrl);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() >= 400)
                System.out.println(linkUrl+" "+httpURLConnection.getResponseMessage()+" is Brokan Link");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
