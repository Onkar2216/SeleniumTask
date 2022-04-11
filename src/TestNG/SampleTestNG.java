package TestNG;

import org.testng.annotations.*;

public class SampleTestNG
{
    /*
        Flow OF the execution is Following
        1) @BeforeSuite is excute before Only once
        2) @BeforeTest is excute before Only once
        3) @BeforeClass is excute before Only once
        4) @BeforeMethod execute before every test
        5) @Test is execute
        6) @AfterMethod is execute after every test
        7) @AfterClass is execute after test only once
        8) @AfterTest is execute after test only once
     */

    @BeforeSuite
    public void setup()
    {
        System.out.println("Set the Property..");
    }

    @BeforeTest
    public void LaunchBrowser()
    {
        System.out.println("Launch Browser..");
    }

    @BeforeClass
    public void OpenURL()
    {
        System.out.println("Open URL..");
    }

    @BeforeMethod
    public void LoginFromApp()
    {
        System.out.println("Login From App..");
    }

    @Test
    public void AmezonLogoTest()
    {
        System.out.println("Amezon Logo Test..");
    }

    @Test
    public void AmezonTitleTest()
    {
        System.out.println("Amezon Title Test..");
    }

    @AfterMethod
    public void LogoutFromApp()
    {
        System.out.println("Logout From App..");
    }

    @AfterClass
    public void CloseBrowser()
    {
        System.out.println("Close Browser..");
    }

    @AfterTest
    public void GenrateReport()
    {
        System.out.println("Genrate Report..");
    }

}
