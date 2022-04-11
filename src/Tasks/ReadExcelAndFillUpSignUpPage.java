package Tasks;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import Configuration.LaunchBrowser;
import Configuration.configuration;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class ReadExcelAndFillUpSignUpPage 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver= LaunchBrowser.ChromeBrowser();
		driver.get(configuration.FacebookSignUpURL);
		ArrayList<String> signUpData=getExcelData();
		FacebookSignUp(driver,signUpData);
	}

	private static void FacebookSignUp(WebDriver driver, ArrayList<String> signUpData) 
	{
		String FirstName=signUpData.get(0);
		String LastName=signUpData.get(1);
		String Email=signUpData.get(2);
		String Confirm_Email=signUpData.get(2);
		String Password=signUpData.get(3);
		String DOB=signUpData.get(4);
		String[] DateOfBirth=getSplitDate(DOB);
		String Day=DateOfBirth[0];
		String Month=getMonth(DateOfBirth[1]);
		String Year=DateOfBirth[2];
		String Gender=signUpData.get(5);
		
		WebElement firstname=driver.findElement(By.xpath(configuration.FacebookSignUpFirstName));
		firstname.sendKeys(FirstName);
		WebElement lastname=driver.findElement(By.xpath(configuration.FacebookSignUplastName));
			lastname.sendKeys(LastName);
		WebElement email=driver.findElement(By.xpath(configuration.FacebookSignUpEmail));
			email.sendKeys(Email);
		WebElement confirmemail=driver.findElement(By.xpath(configuration.FacebookSignUpConfirmEmail));
			confirmemail.sendKeys(Confirm_Email);
		WebElement password=driver.findElement(By.xpath(configuration.FacebookSignUpPassword));
			password.sendKeys(Password);
		WebElement day=driver.findElement(By.xpath(configuration.FacebookSignUpDay));
			Select select=new Select(day);
				select.selectByVisibleText(Day);
		WebElement month=driver.findElement(By.xpath(configuration.FacebookSignUpMonth));
			Select select1=new Select(month);
				select1.selectByVisibleText(Month);
		WebElement year=driver.findElement(By.xpath(configuration.FacebookSignUpYear));
			Select select2=new Select(year);
				select2.selectByVisibleText(Year);
		if(Gender.equalsIgnoreCase("male"))
			driver.findElement(By.xpath(configuration.FacebookSignUpGenderMale)).click();
		else
			driver.findElement(By.xpath(configuration.FacebookSignUpGenderFemale)).click();
		}

	private static String getMonth(String m) 
	{
		if(m.equals("01") || m.equals("1"))
			return "Jan";
		else if(m.equals("02") || m.equals("2"))
			return "Feb";
		else if(m.equals("03") || m.equals("3"))
			return "Mar";
		else if(m.equals("04") || m.equals("4"))
			return "Apr";
		else if(m.equals("05") || m.equals("5"))
			return "May";
		else if(m.equals("06") || m.equals("6"))
			return "Jun";
		else if(m.equals("07") || m.equals("7"))
			return "Jul";
		else if(m.equals("08") || m.equals("8"))
			return "Aug";
		else if(m.equals("09") || m.equals("9"))
			return "Sep";
		else if(m.equals("10") || m.equals("10"))
			return "Oct";
		else if(m.equals("11") || m.equals("11"))
			return "Nov";
		else if(m.equals("12") || m.equals("12"))
			return "Dec";
		return "Invalid Month";
	}

	private static String[] getSplitDate(String dOB)
	{
		return dOB.split("/");
	}

	public static ArrayList<String> getExcelData() throws IOException
	{
		FileInputStream excel=new  FileInputStream("D:/Study Data/Fill Up Data.xlsx");
		XSSFWorkbook fs= new XSSFWorkbook(excel);
		XSSFSheet sheet=fs.getSheetAt(0);
		int rowValue =sheet.getLastRowNum();
		ArrayList<String> fielddata = new ArrayList<String>() ;
		for(int i=0;i<=rowValue;i++)
		{
			Row row=sheet.getRow(i);
			int colValue=row.getLastCellNum();
			for(int j=0;j<colValue;j++)
			{
				Cell data=row.getCell(j);
				String x=data.getStringCellValue();
				if( i !=0 )
					fielddata.add(x);
			}
		}
		fs.close();
		return fielddata;
	}
}
