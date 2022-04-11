package SeleniumSession;

import Configuration.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragOverConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= LaunchBrowser.ChromeBrowser();
		
		driver.get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
		
		String title=driver.getTitle();
		System.out.println("Title >> "+title);
		
	/*	driver.findElement(By.linkText("Mobiles")).click();
		
		Actions action=new Actions(driver);// to perform action
		action.moveToElement(driver.findElement(By.linkText("Mobiles & Accessories"))).build().perform(); // move the cursor to that element
		
		driver.findElement(By.linkText("Cases & Covers")).click();    */
		
		driver.findElement(By.id("nav-hamburger-menu")).click();
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Mobiles, Computers"))).click().perform();
		
		driver.findElement(By.linkText("Laptops")).click();
		
	}

}
