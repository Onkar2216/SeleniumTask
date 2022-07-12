package Tasks;

import Configuration.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoBlaze
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= LaunchBrowser.ChromeBrowser();
        driver.get("https://demoblaze.com/index.html");
        login(driver);
        Thread.sleep(5000);
        AddToCartMobile(driver);
        AddToCartLaptop(driver);
        AddToCartMobitor(driver);
        DislpayOnConsoleInAscending(driver);
    }

    private static void TotalPrice(WebDriver driver,ArrayList<Integer> pl) throws InterruptedException
    {
        int Total = Integer.parseInt(driver.findElement(By.xpath("//h3[@id='totalp']")).getText());
        int sum=0;
        for (int e:pl)
            sum=sum+e;
        if (Total == sum)
        {
            System.out.println("Total Price is Match..");
            PlaceOrder(driver);
        }
        else
            System.out.println("Total Price is NOT Match..");
    }

    private static void PlaceOrder(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Onkar  Nimbalkar");
        driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Pune");
        driver.findElement(By.xpath("//input[@id='card']")).sendKeys("751363591614");
        driver.findElement(By.xpath("//input[@id='month']")).sendKeys("June");
        driver.findElement(By.xpath("//input[@id='year']")).sendKeys("2022");
        driver.findElement(By.xpath("//button[text()='Purchase']")).click();
        Thread.sleep(Long.parseLong("5000"));
        driver.findElement(By.xpath("//button[text()='OK']")).click();
    }

    private static void DislpayOnConsoleInAscending(WebDriver driver) throws InterruptedException {
        List<WebElement> ProductList=driver.findElements(By.xpath("//tr[@class='success']//td[3]"));
        System.out.println("Normal >> ");
        ArrayList<Integer> price=new ArrayList<>();
        for (WebElement e: ProductList)
        {
            System.out.println(e.getText());
            price.add(Integer.parseInt(e.getText()));
        }
        Collections.sort(price);
        System.out.println("Ascending >> ");
        for (Integer e: price)
            System.out.println(e);
        TotalPrice(driver,price);
    }

    private static void AddToCartMobitor(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Home ']")).click();
        driver.findElement(By.xpath("//a[text()='Monitors']")).click();
        driver.findElement(By.xpath("//a[text()='ASUS Full HD']")).click();
        driver.findElement(By.linkText("Add to cart")).click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        driver.findElement(By.linkText("Cart")).click();

    }

    private static void AddToCartLaptop(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Home ']")).click();
        driver.findElement(By.xpath("//a[text()='Laptops']")).click();
        driver.findElement(By.xpath("//a[text()='Dell i7 8gb']")).click();
        driver.findElement(By.linkText("Add to cart")).click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        driver.findElement(By.linkText("Cart")).click();
    }

    private static void AddToCartMobile(WebDriver driver) throws InterruptedException
    {
        driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']")).click();
        driver.findElement(By.linkText("Add to cart")).click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        driver.findElement(By.linkText("Cart")).click();
    }

    private static void wait(WebDriver driver, int i, WebElement ele)
    {
        WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(i));
        wt.until(ExpectedConditions.elementToBeClickable(ele));
    }

    private static void login(WebDriver driver)
    {
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("loginusername")).sendKeys("sctqaautomation@grr.la");
        driver.findElement(By.id("loginpassword")).sendKeys("Spring@123");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    }
}
