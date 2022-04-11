package Tasks;

import java.util.ArrayList;

import Configuration.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class ListOut_Iphones_And_Price_Addition_Task 
{

	public static void main(String[] args)
	{
		WebDriver driver= LaunchBrowser.ChromeBrowser();
		
		driver.get("https://www.amazon.in/");
		
		WebElement searchbar=driver.findElement(By.id("twotabsearchtextbox"));
		searchbar.sendKeys("iphone 12");
		searchbar.submit();
		
		ArrayList<WebElement> list=(ArrayList<WebElement>) driver.findElements(By.xpath("//a[@class='a-size-base a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']//span[@class='a-price-whole']"));
		int TotalPrice=0;
		for (WebElement webElement : list) 
		{
			System.out.println(webElement.getText());
			String pr=webElement.getText();
			int price=Integer.parseInt(pr.replaceAll("[^a-zA-Z0-9]", ""));
			TotalPrice=TotalPrice+price;
		}
		
		System.out.println("Total Price Of Iphones >> "+TotalPrice);
	}

}
