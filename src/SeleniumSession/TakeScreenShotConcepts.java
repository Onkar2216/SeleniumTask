package SeleniumSession;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import Configuration.LaunchBrowser;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class TakeScreenShotConcepts {

	public static void main(String[] args) throws IOException {

		WebDriver driver= LaunchBrowser.ChromeBrowser();
		
		driver.get("https://www.Amazon.com");
		
		//Taking Screen Shot
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// Copy The File To Destination
		FileUtils.copyFile(src, new File("D:/WorkSpaces/SeleniumTasks/Files/amezon.png"));

		driver.close();
	}

}
