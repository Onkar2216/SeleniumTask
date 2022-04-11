package Tasks;

import Configuration.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class youtubeConcepts
{
	public static void main(String[] args) 
	{
			WebDriver driver= LaunchBrowser.ChromeBrowser();
			driver.get("https://www.youtube.com");
			
			WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
			search.sendKeys("share market ka sampurn gyan vivek bindra");
			
			driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
			
			String link="(//a[@id='video-title']//yt-formatted-string[contains(@aria-label, 'Share Market का सम्पूर्ण ज्ञान | Nifty | Share Market | Dr Vivek Bindra')])[1]";
			driver.findElement(By.xpath(link)).click();
	}
}
