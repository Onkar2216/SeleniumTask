package SeleniumSession;

import Configuration.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalenderHandleConcept 
{
	public static void main(String[] args) 
	{
		WebDriver driver= LaunchBrowser.ChromeBrowser();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		selectDate(27,"January","2024", driver);
	}

	private static void selectDate(int expDay, String expMonth, String expYear, WebDriver driver) 
	{
		String MonthAndYearVal=driver.findElement(By.className("ui-datepicker-title")).getText();	
//		String month=getMonthANdYear(MonthAndYearVal)[0];
//		int year=Integer.parseInt(getMonthANdYear(MonthAndYearVal)[1]);
		if((expDay>31) && (expMonth.equals("January"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>28) && (expMonth.equals("February"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>31) && (expMonth.equals("March"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>30) && (expMonth.equals("April"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>31) && (expMonth.equals("May"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>30) && (expMonth.equals("June"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>31) && (expMonth.equals("Julay"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>31) && (expMonth.equals("August"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>30) && (expMonth.equals("September"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>31) && (expMonth.equals("October"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>30) && (expMonth.equals("November"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}
		if((expDay>31) && (expMonth.equals("December"))) { System.out.println("Invalid Date " + expDay + " :: " + expMonth + " :: "+expYear); return;}

		int year ;
		int expdYear;
		while(!(getMonthANdYear(MonthAndYearVal)[0].equalsIgnoreCase(expMonth) && getMonthANdYear(MonthAndYearVal)[1].equals(expYear)))
		{
			year = Integer.parseInt(getMonthANdYear(MonthAndYearVal)[1]);
			expdYear=Integer.parseInt(expYear);
			if( (year > expdYear) || (year == expdYear))
			{
					driver.findElement(By.xpath("//a[@title='Prev']")).click();
					MonthAndYearVal=driver.findElement(By.className("ui-datepicker-title")).getText();
			}
			else if( (year < expdYear) || (year == expdYear))
			{
					driver.findElement(By.xpath("//a[@title='Next']")).click();
					MonthAndYearVal=driver.findElement(By.className("ui-datepicker-title")).getText();
			}
		}
		driver.findElement(By.xpath("//a[text()='"+expDay+"']")).click();
	}

	private static String[] getMonthANdYear(String monthAndYearVal) 
	{
		return monthAndYearVal.split(" ");
	}
	
	
}
