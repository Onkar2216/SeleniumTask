package SeleniumSession;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import Configuration.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuggetionsSelectionConcepts 
{
	int i;
	public static void main(String[] args) 
	{
		//System.out.println(i);
			WebDriver driver = LaunchBrowser.ChromeBrowser();
			driver.get("http://www.google.com");
			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("testing");

			List<WebElement> options= driver.findElements(By.xpath("//ul//li[@class='sbct']//div//div//div[@class='wM6W7d']//span"));
			
			for(WebElement webElement : options)
			{
					//wait(driver,webElement,10);
					System.out.println(webElement.getText());
					if(webElement.getText().equals("testing techniques"))
					{
						webElement.click();
						break;
					}
			}
	}

	private static void wait(WebDriver driver, WebElement webElement, int i) 
	{
			new WebDriverWait(driver, Duration.ofSeconds(i)).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(webElement));
	}
}