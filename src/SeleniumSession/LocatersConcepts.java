package SeleniumSession;


import Configuration.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatersConcepts 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= LaunchBrowser.ChromeBrowser(); // To Launch  Chrome Browser
		
		driver.get("https://www.facebook.com/");
		
		String title=driver.getTitle();
		System.out.println("Title >> "+title);
		
		
		//Locaters 
		// 1 Linktext -- Only for Link
		driver.findElement(By.linkText("Create New Account")).click();
		
		// 2 ID
		driver.findElement(By.name("firstname")).sendKeys("Onkar");
		
		// 3 name
		driver.findElement(By.name("lastname")).sendKeys("Nimbalkar");
		
		// 4 css Locater
//		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("onkarnimbalkar97@gmail.com");
//		driver.findElement(By.xpath("//*[@name='reg_email_confirmation__']")).sendKeys("onkarnimbalkar97@gmail.com");
		//driver.findElement(By.cssSelector("#u_2_g_Qt")).sendKeys("onkarnimbalkar97@gmail.com");

		// 5 xpath 
		driver.findElement(By.xpath("//*[@id='password_step_input']")).sendKeys("onkar1995");
		
		// 6 partial Linktext -- Not Useful
		//	driver.findElement(By.partialLinkText("Create a free")).click();
		
		// How to handle Drop Down box 
		Select select=new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("5");
		
		Select select1=new Select(driver.findElement(By.id("month")));
		select1.selectByVisibleText("Mar");
		
		Select select2=new Select(driver.findElement(By.id("year")));
		select2.selectByVisibleText("1995");
		
		// 7 Class name -- Not Useful
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
	}
	
}
