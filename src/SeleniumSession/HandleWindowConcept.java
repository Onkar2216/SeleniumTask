package SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import Configuration.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HandleWindowConcept
{
	public static void main(String[] args) 
	{
		WebDriver driver= LaunchBrowser.ChromeBrowser();
		
		driver.get("https://webbrowsertools.com/popup-blocker/");
		
		driver.findElement(By.xpath("//input[@value='Method #3']")).click();
		
		Set<String> WindowId=driver.getWindowHandles();
		System.out.println(WindowId);
		
		Iterator<String> itr=WindowId.iterator();
		String ParentWindow=itr.next();
		String ChildWindow=itr.next();
		
		driver.switchTo().window(ChildWindow);
		
		driver.close();
		
		driver.switchTo().window(ParentWindow);
		
		driver.findElement(By.xpath("//input[@value='Method #4']")).click();
	}

}
