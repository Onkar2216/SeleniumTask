package SeleniumSession;

import java.time.Duration;

import Configuration.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicTableHandleConcept
{
	public static void main(String[] args) 
	{
			WebDriver driver= LaunchBrowser.ChromeBrowser();
			driver.get("http://www.freecrm.com");
			Actions action=new Actions(driver);
			Login(driver,action);
			WebElement contact=driver.findElement(By.xpath("//a//span[contains(text(),'Contacts')]"));
				wait(contact,20,driver);
				action.click(contact).build().perform();
			
			String name="Saurabh Sudhir Randhive";
			ClickOnContact(driver,name,action);
		}
	private static void ClickOnContact(WebDriver driver, String name, Actions action) 
	{
		driver.navigate().refresh();
		String click="//a[contains(text(),'"+name+"')]/parent::td/preceding-sibling::td//div//input[@name='id']";
		WebElement check=driver.findElement(By.xpath(click));
		action.click(check).build().perform();
	}
	private static void Login(WebDriver driver, Actions action) 
	{
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("onkarnimbalkar97@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Onkar@1995");
		WebElement login =driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		action.click(login).build().perform();
	}
	private static void wait(WebElement contact, int i, WebDriver driver)
	{
			new WebDriverWait(driver, Duration.ofSeconds(i)).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(contact));
	}
}
