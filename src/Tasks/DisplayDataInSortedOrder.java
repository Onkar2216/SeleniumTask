package Tasks;

import java.util.ArrayList;
import java.util.List;

import Configuration.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class DisplayDataInSortedOrder 
{
	public static void main(String[] args)
	{
		WebDriver driver= LaunchBrowser.ChromeBrowser();
		driver.get("https://www.noon.com");
		SelectCourossoul(driver);
	}

	private static void SelectCourossoul(WebDriver driver)
	{
		String next="//div[@class='sc-bkkeKt eISOYw']//div[@class='swiper-button-next custom-navigation swiper-nav-1654756886937']";
		WebElement nextButton=driver.findElement(By.xpath(next));
		scrollIntoView(driver,nextButton);
		while(nextButton.isDisplayed())
		{
			String amounts = "//div[@class='sc-bkkeKt eISOYw']//div[@class='sc-2b0dd7f4-0 iWLcwA grid']//div[@class='sc-d3293424-10 eoizYW']//div[@class='sc-ac248257-1 cfjJNJ']/strong";
			List<WebElement> ele=driver.findElements(By.xpath(amounts));
			for(int i=0;i<ele.size();i++)
			{
				String Header= ele.get(i).getText();
				System.out.println(Header);
			}
			nextButton.click();
		}

//		String buttontext="swiper-button-next custom-navigation swiper-nav-1644740934193 swiper-button-disabled";
		
//		ArrayList<WebElement> list=(ArrayList<WebElement>) driver.findElements(By.xpath("//div[@class='sc-biJonm ernndx']//div[@class='sc-e3js0d-9 gCnNfT']//div//div//div//strong"));
		
	}

	private static void scrollIntoView(WebDriver driver, WebElement nextButton)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", nextButton);
	}
}
