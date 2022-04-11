package Tasks;

import Configuration.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginFunctionalityConcept
{
	public static void main(String[] args) 
	{
		WebDriver driver= LaunchBrowser.ChromeBrowser();
		
		driver.get("https://www.facebook.com/");
		
		WebElement userName=driver.findElement(By.xpath("//input[@name='email']"));
		userName.sendKeys("nimbalkar.onkar@yahoo.com");
		
		WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("Onkar@172205");
		
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
	}

}
