package SeleniumSession;

import Configuration.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadConcepts
{
	public static void main(String[] args) 
	{
		WebDriver driver= LaunchBrowser.ChromeBrowser();
		
		driver.get("https://html.com/input-type-file/");
		
		//Work Only on File Attrbute
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("F:/Documents/Onkar Document/Onkar Profile Image.jpeg");
	}

}
