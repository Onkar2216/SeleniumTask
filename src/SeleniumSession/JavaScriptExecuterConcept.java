package SeleniumSession;

import java.io.File;
import java.io.IOException;

import Configuration.LaunchBrowser;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecuterConcept 
{
	
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver= LaunchBrowser.ChromeBrowser();
		
		driver.get("https://freecrm.com/");
		
		//loginFunction(driver);
		
		WebElement login=driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']//li//a[text()='Sign Up']"));

		//Flash(driver,login);

		drawBorder(driver,login);

		//genrateAleart(driver,"There Is problem with Login Button Finctionality..");

//		takeSceenshot(driver);
		
	}

	private static void Flash(WebDriver driver, WebElement login) 
	{
		String color=login.getCssValue("backgroundColor");
		
		System.out.println(color);
		
		for(int i=0;i<100;i++)
		{
			changeColor("rgba(0, 200, 200, 0)",driver,login);
			changeColor(color,driver,login);
		}
	}

	private static void changeColor(String color, WebDriver driver, WebElement login)
	{
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'",login);
		
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void takeSceenshot(WebDriver driver) throws IOException 
	{
		File img=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(img, new File("D:/WorkSpaces/Testing/SeleniumSession/Images/Login.png"));
	}

	private static void genrateAleart(WebDriver driver, String msg)
	{
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("alert('"+msg+"');");
		driver.switchTo().alert().accept();
	}

	private static void drawBorder(WebDriver driver, WebElement div) 
	{
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='5px solid red'", div);
	}

	private static void loginFunction(WebDriver driver)
	{
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("onkarnimbalkar97@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Onkar@1995");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	}
	
	

}
