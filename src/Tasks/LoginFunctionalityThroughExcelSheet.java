package Tasks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Configuration.LaunchBrowser;
import Configuration.configuration;
import org.openqa.selenium.WebElement;

public class LoginFunctionalityThroughExcelSheet
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver1=LaunchBrowser.ChromeBrowser();
		WebDriver driver=openBrowser(driver1);
		ArrayList<ArrayList<String>> data=getExcelData();
		data.remove(0);
		System.out.println(data);
		 for (int i=0;i<data.size();i++)
		 {
			 ArrayList<String> LoginDate=data.get(i);
			 boolean status=LoginFunctionality(driver,LoginDate);
			 if(status)
			 {
			 	System.out.println("Test case pass for >> "+LoginDate+" >> PASS");
				addStatus("PASS",i);
				driver.findElement(By.xpath(configuration.FacebookLogoutPartialButton)).click();
				driver.findElement(By.xpath(configuration.FacebookLogoutButton)).click();
			 }
			 else
			 {
			 	System.out.println("Test Case FAil for >> "+ LoginDate+ " >> FAIL");
				addStatus("FAIL",i);
				openBrowser(driver);
			 }
		 }
	}

	public static void addStatus(String status,int i) throws IOException
	{
		FileInputStream excel = new FileInputStream(configuration.ExcelFilePath);
		Workbook fs = WorkbookFactory.create(excel);
		Sheet sheet = fs.getSheet("ONKAR");
		Row row = sheet.getRow(i + 1);
		Cell cell = row.createCell(2, CellType.STRING);
		cell.setCellValue(status);
		FileOutputStream fos = new FileOutputStream(configuration.ExcelFilePath);
		fs.write(fos);
		fos.close();
	}
	public static WebDriver openBrowser(WebDriver driver)
	{
		 driver.get("https://www.facebook.com");
		 return driver;
	}
	private static boolean LoginFunctionality(WebDriver driver, ArrayList<String> loginDate) 
	{
		System.out.println("Login >> "+loginDate);
		String uname=loginDate.get(0);
		String pass=loginDate.get(1);
		driver.findElement(By.xpath(configuration.FacebookLoginUserName)).sendKeys(uname);
		driver.findElement(By.xpath(configuration.FacebookLoginPassword)).sendKeys(pass);
		driver.findElement(By.xpath(configuration.FacebookLoginButton)).click();
		try 
		{
			driver.findElement(By.xpath(configuration.FacebookLogoutPartialButton)).isDisplayed();
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}

	public static ArrayList<ArrayList<String>> getExcelData() throws IOException
	{
		FileInputStream excel=new  FileInputStream(configuration.ExcelFilePath);
		Workbook fs=WorkbookFactory.create(excel);
		Sheet sheet = fs.getSheet("ONKAR");
		int rowValue =sheet.getLastRowNum();
		ArrayList<ArrayList<String>> fielddata = new ArrayList<>() ;
		for(int i=0;i<=rowValue;i++)
		{
			ArrayList<String> logindata=new ArrayList<>();
			Row row=sheet.getRow(i);
			int colValue=row.getLastCellNum();
			for(int j=0;j<colValue;j++)
			{
				Cell data=row.getCell(j);
				String x=data.getStringCellValue();
				if( i != 0)
					logindata.add(x);
			}
			fielddata.add(logindata);
		}
		fs.close();
		excel.close();
		return fielddata;
	}
}
