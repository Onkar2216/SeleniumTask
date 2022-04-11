package Tasks;

import Configuration.LaunchBrowser;
import Configuration.configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class SignUpFunctionality 
{
	public static void main(String[] args) 
	{
			WebDriver driver= LaunchBrowser.ChromeBrowser();
			driver.get(configuration.FacebookSignUpURL);
			
			WebElement firstname=driver.findElement(By.xpath(configuration.FacebookSignUpFirstName));
				firstname.sendKeys("Onkar");
			WebElement lastname=driver.findElement(By.xpath(configuration.FacebookSignUplastName));
				lastname.sendKeys("Nimbalkar");
			WebElement email=driver.findElement(By.xpath(configuration.FacebookSignUpEmail));
				email.sendKeys("onkarnimbalkar9@gmail.com");
			WebElement confirmemail=driver.findElement(By.xpath(configuration.FacebookSignUpConfirmEmail));
				confirmemail.sendKeys("onkarnimbalkar9@gmail.com");
			WebElement password=driver.findElement(By.xpath(configuration.FacebookSignUpPassword));
				password.sendKeys("onkar12345");
			WebElement day=driver.findElement(By.xpath(configuration.FacebookSignUpDay));
				Select select=new Select(day);
					select.selectByVisibleText("5");
			WebElement month=driver.findElement(By.xpath(configuration.FacebookSignUpMonth));
				Select select1=new Select(month);
					select1.selectByVisibleText("Mar");
			WebElement year=driver.findElement(By.xpath(configuration.FacebookSignUpYear));
				Select select2=new Select(year);
					select2.selectByVisibleText("1995");
			driver.findElement(By.xpath(configuration.FacebookSignUpGenderMale)).click();
	}
}
