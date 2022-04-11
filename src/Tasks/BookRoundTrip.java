package Tasks;

import java.time.Duration;
import java.util.List;

import Configuration.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BookRoundTrip
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= LaunchBrowser.ChromeBrowser();
		
		// lauch the site 
		driver.get("https://www.goindigo.in/");
		WebElement tooltip=driver.findElement(By.xpath("//i[@class='icon-close close-pass-tooltip']"));
		waitForSeconds(driver,tooltip,20);
		clickOn(driver, tooltip);
		SearchFlight(driver);
		Book_A_Round_Trip(driver);
	}

	private static void Book_A_Round_Trip(WebDriver driver) throws InterruptedException
	{
		String tripDetails="//div[@class='col col-12 trip-wrap trip-0 col-lg-6 round-way-flights column-numbers-2 order-3']//div//div//input[@type='radio']";
		List<WebElement> tripDetailsList=driver.findElements(By.xpath(tripDetails));
		for(int i=0;i<tripDetailsList.size();i++)
		{
			if(i==2)
			{
				System.out.println("Count >> "+i);
				WebElement trip=tripDetailsList.get(i);
				trip.click();
			}
		}
	}
	
	private static void SearchFlight(WebDriver driver)
	{
		String roundTrip="//label[@for='roundTrip']";
		//String fromTo="//input[@name='or-src']";
		String destTo="//input[@name='or-dest']";
		String search="//button[@class='btn btn-primary block bold ig-search-btn ig-common-cta addLoader']";
		//String goDate="//input[@class='form-control or-depart igInitCalendar']";
		//String returnDate="//input[@class='form-control or-return igInitCalendar']";
//		String passengerCont="//input[@name='passenger']";
//		String currency="//select[@class='form-control bw-currency-list']";
		
		driver.findElement(By.xpath(roundTrip)).click(); //select rout trip radio button

//		WebElement from=driver.findElement(By.xpath(fromTo)); // select from text field
//		from.clear();
//		clickOn(driver, from);
//		waitForSeconds(driver,from,20);
//		selectPlace(driver,"Bengaluru");

		WebElement dest=driver.findElement(By.xpath(destTo));
		dest.clear();
		dest.click();
		waitForSeconds(driver,dest,20);
		selectPlace(driver,"Hyderabad");		

		selectDispatureDate(12, "February","2022", driver); // Dispature Date
		selectReturnDate(19, "February","2022", driver); // Return Date
		
		WebElement searchm=driver.findElement(By.xpath(search));
		searchm.sendKeys(Keys.ENTER);;
	
	}

	private static void selectPlace(WebDriver driver, String expPlace) 
	{
		String list="//div[@class='autocomplete-results autocomplete-main station-results']//div[@class='wrap']//div//div[@class='airport-city']";
		List<WebElement> searchlist=driver.findElements(By.xpath(list));
		for (WebElement searchElement : searchlist) 
		{
			if(!(searchElement.getText().isEmpty()))
			{
				System.out.println("Going >> "+searchElement.getText());
				if(searchElement.getText().contains(expPlace))
				{
					System.out.println(searchElement.getText());
					clickOn(driver, searchElement);
					break;
				}
			}
		}		
	}

	private static void waitForSeconds(WebDriver driver, WebElement from, int i) 
	{
		new WebDriverWait(driver, Duration.ofSeconds(i)).until(ExpectedConditions.elementToBeClickable(from));
	}
//    
	private static void selectReturnDate(int expDay, String expMonth, String expYear, WebDriver driver)
	{
		List<WebElement> MonthAndYearVal=driver.findElements(By.xpath("//div[@class='initCalendar or-initCalendar hasDatepicker left-pos']//div//div//div[@class='ui-datepicker-title']"));	

		if((expDay>31) && (expMonth.equals("January"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>28) && (expMonth.equals("February"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>31) && (expMonth.equals("March"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>30) && (expMonth.equals("April"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>31) && (expMonth.equals("May"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>30) && (expMonth.equals("June"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>31) && (expMonth.equals("July"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>31) && (expMonth.equals("August"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>30) && (expMonth.equals("September"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>31) && (expMonth.equals("October"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>30) && (expMonth.equals("November"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>31) && (expMonth.equals("December"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		
		for (WebElement monthYear : MonthAndYearVal) 
		{
			String my =monthYear.getText();
			while(!(getMonthAndYear(my)[0].equalsIgnoreCase(expMonth) && getMonthAndYear(my)[1].equals(expYear)))
			{
				WebElement next=driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']//span[text()='Next']"));
				clickOn(driver,next);
				my=driver.findElement(By.xpath("//div[@class='initCalendar or-initCalendar hasDatepicker left-pos']//div//div//div[@class='ui-datepicker-title']")).getText();
			}
			driver.findElement(By.xpath("//a[text()='"+expDay+"']")).click();
			break;
		}
	}
	
	private static void selectDispatureDate(int expDay, String expMonth, String expYear, WebDriver driver) 
	{
		List<WebElement> MonthAndYearVal=driver.findElements(By.xpath("//div[@class='initCalendar or-initCalendar hasDatepicker']//div//div//div[@class='ui-datepicker-title']"));	
		
		if((expDay>31) && (expMonth.equals("January"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>28) && (expMonth.equals("February"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>31) && (expMonth.equals("March"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>30) && (expMonth.equals("April"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>31) && (expMonth.equals("May"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>30) && (expMonth.equals("June"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>31) && (expMonth.equals("July"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>31) && (expMonth.equals("August"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>30) && (expMonth.equals("September"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>31) && (expMonth.equals("October"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>30) && (expMonth.equals("November"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>31) && (expMonth.equals("December"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		
		for (WebElement monthYear : MonthAndYearVal) 
		{
			String my =monthYear.getText();
			System.out.println("Month >> "+my);
			while(!(getMonthAndYear(my)[0].equalsIgnoreCase(expMonth) && getMonthAndYear(my)[1].equals(expYear)))
			{
				WebElement next=driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']//span[text()='Next']"));
				clickOn(driver,next);
				my=driver.findElement(By.xpath("//div[@class='initCalendar or-initCalendar hasDatepicker']//div//div//div[@class='ui-datepicker-title']")).getText();
			}
			driver.findElement(By.xpath("//a[text()='"+expDay+"']")).click();
			break;
		}
	}

	private static void clickOn(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click()",ele);		
	}

	private static String[] getMonthAndYear(String monthAndYear) 
	{
		return monthAndYear.split(" ");
	}
}
