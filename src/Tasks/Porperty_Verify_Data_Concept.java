package Tasks;

import java.time.Duration;
import java.util.ArrayList;

import Configuration.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Porperty_Verify_Data_Concept 
{
	public static void main(String[] args) 
	{
		WebDriver driver= LaunchBrowser.ChromeBrowser();
		driver.get("https://www.zoopla.co.uk");
		searchProperty(driver);
		selectProperty(driver);
		VerifyData(driver);
	}

	private static void VerifyData(WebDriver driver) 
	{
		String agName=getAgentName(driver);		
		String agName1=getAgentData(driver);
		if(agName.equals(agName1))
			System.out.println("Both Agent Name is Matched...");
		else
			System.out.println("Both Agent Name is not Matched...");
	}

	private static String getAgentData(WebDriver driver) 
	{
		String agDetails="//div[@data-testid='agent-details']//a[@data-testid='agent-image-link']";
		driver.findElement(By.xpath(agDetails)).click();
		String AgentDetail=driver.findElement(By.xpath("//div[@id='content']//div//h1//b")).getText();
		return AgentDetail;
	}

	private static String getAgentName(WebDriver driver)
	{
		String propAgent="//div[@data-testid='agent-details']";
		String ag=driver.findElement(By.xpath(propAgent)).getText();
		String[] AgentList=ag.split("\\r?\\n");
		String AgentName=AgentList[0];
		return AgentName;
	}

	private static void selectProperty(WebDriver driver) 
	{
		String propertyList="//div[@data-testid='extended-search-result']//div[@class='css-mww4lt-StyledContent e2uk8e21']//a[@data-testid='listing-details-link']";
		ArrayList<WebElement> propList=(ArrayList<WebElement>) driver.findElements(By.xpath(propertyList));
		propList.get(5).click();
	}

	private static void searchProperty(WebDriver driver) 
	{
		driver.findElement(By.id("header-location")).sendKeys("Oxford, Oxfordshire");
		
		driver.findElement(By.id("AnyBeds_testId")).click();
			WebElement minBeds=driver.findElement(By.id("beds_min"));
			Select min=new Select(minBeds);
			min.selectByVisibleText("2");
		
		WebElement maxBeds=driver.findElement(By.id("beds_max"));
			Select max=new Select(maxBeds);
			max.selectByVisibleText("2");
		
		driver.findElement(By.xpath("//button[@data-testid='any_price']")).click();
			WebElement minPrice=driver.findElement(By.xpath("//select[@id='price_min']"));
			waitForSecond(driver,minPrice,20);
			Select minP=new Select(minPrice);
			minP.selectByVisibleText("�30,000");
		
		WebElement maxPrice=driver.findElement(By.id("price_max"));
			waitForSecond(driver,maxPrice,20);
			Select maxP=new Select(maxPrice);
			maxP.selectByVisibleText("�150,000");
		
		driver.findElement(By.xpath("//button[@data-testid='PropertyType_testId']")).click();
		
		WebElement property =driver.findElement(By.xpath("//div[@data-testid='dropdown_container']//label[@for='desktop_subheader_property_type_option_houses']"));
			waitForSecond(driver, property, 20);
			property.click();
		
		driver.findElement(By.xpath("//button[@data-testid='search-button']")).click();
		
	}

	private static void waitForSecond(WebDriver driver, WebElement minPrice, int i) 
	{
		new WebDriverWait(driver,Duration.ofSeconds(i)).until(ExpectedConditions.elementToBeClickable(minPrice));
	}

}
