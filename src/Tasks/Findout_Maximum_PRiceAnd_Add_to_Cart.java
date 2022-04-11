package Tasks;

import java.util.ArrayList;
import java.util.Collections;

import Configuration.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Findout_Maximum_PRiceAnd_Add_to_Cart 
{
	public static void main(String[] args) 
	{
		WebDriver driver= LaunchBrowser.ChromeBrowser();
		
		driver.get("https://www.saucedemo.com");
		
		login(driver);
		
//		driver.quit();
	}

	private static void login(WebDriver driver) 
	{
		WebElement uname=driver.findElement(By.id("user-name"));
		uname.sendKeys("standard_user");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		Find_maximum_product_price_java8(driver);
		//Findout_Minimum_Product_And_Add_To_Cart_Product(driver);
		Findout_Maximum_Product_And_Add_To_Cart_Product(driver);
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		
	}

	private static void Find_maximum_product_price_java8(WebDriver driver) 
	{
		ArrayList<WebElement> prices=(ArrayList<WebElement>) driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
		Double maxprice=prices
					.stream()
						.mapToDouble(e -> Double.parseDouble(e.getText().trim().replace("$", "")))
							.max()
								.getAsDouble();
		System.out.println(maxprice);
		String xpath="//div[normalize-space()='$"+maxprice+"']/following-sibling::button[text='Add to cart']";
		driver.findElement(By.xpath(xpath)).click();
	}

	private static void Findout_Maximum_Product_And_Add_To_Cart_Product(WebDriver driver) 
	{
		ArrayList<WebElement> prices=(ArrayList<WebElement>) driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
		ArrayList<Double> pricelist=new ArrayList<Double>();
		for (WebElement price : prices) 
		{
			String pr=price.getText();
			double p=Double.parseDouble(pr.replace("$", ""));
			pricelist.add(p);
		}
		Collections.sort(pricelist);
		double max=pricelist.get(pricelist.size()-1);
		String price="$"+max;
		ArrayList<WebElement> dis=(ArrayList<WebElement>) driver.findElements(By.xpath("//div[@class='inventory_item_description']"));
		for (WebElement find : dis) 
		{
			String txt=find.getText();
			if(txt.contains(price))
			{
				String[] str=txt.split("\\r?\\n");
				String addToCartPath="add-to-cart-"+str[0].replaceAll(" ", "-").toLowerCase();
				driver.findElement(By.id(addToCartPath)).click();
			}
		}
	}
	
	private static void Findout_Minimum_Product_And_Add_To_Cart_Product(WebDriver driver) 
	{
		ArrayList<WebElement> prices=(ArrayList<WebElement>) driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
		ArrayList<Double> pricelist=new ArrayList<Double>();
		for (WebElement price : prices) 
		{
			String pr=price.getText();
			double p=Double.parseDouble(pr.replace("$", ""));
			pricelist.add(p);
		}
		Collections.sort(pricelist);
		double min = pricelist.get(0);
		String value="$"+min;
		ArrayList<WebElement> dis=(ArrayList<WebElement>) driver.findElements(By.xpath("//div[@class='inventory_item_description']"));
		for (WebElement find : dis) 
		{
			String txt=find.getText();
			if(txt.contains(value))
			{
				String[] str=txt.split("\\r?\\n");
				String addToCartPath="add-to-cart-"+str[0].replaceAll(" ", "-").toLowerCase();
				driver.findElement(By.id(addToCartPath)).click();
			}
		}
	}
}
