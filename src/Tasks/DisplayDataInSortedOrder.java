package Tasks;

import java.util.ArrayList;
import java.util.List;

import Configuration.LaunchBrowser;
import org.openqa.selenium.By;
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
		List<WebElement> ele=driver.findElements(By.xpath("//div[@class='sc-uxdHp fiDOnB']//div[@class='sc-gtsrHT gfuSqG']//h3[@class='sc-dlnjwi erUAuj']"));
		for(int i=0;i<ele.size();i++)
		{
			String Header= ele.get(i).getText();
			System.out.println(Header);
		}
		String buttontext="swiper-button-next custom-navigation swiper-nav-1644740934193 swiper-button-disabled";
		
		ArrayList<WebElement> list=(ArrayList<WebElement>) driver.findElements(By.xpath("//div[@class='sc-biJonm ernndx']//div[@class='sc-e3js0d-9 gCnNfT']//div//div//div//strong"));
		
	}
}
