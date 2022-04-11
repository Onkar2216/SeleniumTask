package Configuration;

public class configuration 
{
	//Facebook Sign Up Functionality
		public static String FacebookSignUpURL="https://www.facebook.com/signup/";
		public static String FacebookSignUpFirstName="//input[@name='firstname']";
		public static String FacebookSignUplastName="//input[@name='lastname']";
		public static String FacebookSignUpEmail="//input[@name='reg_email__']";
		public static String FacebookSignUpConfirmEmail="//input[@name='reg_email_confirmation__']";
		public static String FacebookSignUpPassword="//input[@name='reg_passwd__']";
		public static String FacebookSignUpDay="//select[@id='day']";
		public static String FacebookSignUpMonth="//select[@id='month']";
		public static String FacebookSignUpYear="//select[@id='year']";
		public static String FacebookSignUpGenderMale="//input[@value='2']";
		public static String FacebookSignUpGenderFemale="//input[@value='1']";
		
	// Facebook Login Functionality
		public static String FacebookLoginURL="https://www.facebook.com/";
		public static String FacebookLoginUserName="//input[@name='email']";
		public static String FacebookLoginPassword="//input[@name='pass']";
		public static String FacebookLoginButton="//button[@name='login']";
		public static String FacebookLogoutPartialButton ="(//div[@aria-label='Account'])[1]";
		public static String FacebookLogoutButton ="//div[@role='button']//span[text()='Log Out']";
		public static String FacebookLoginUsernameError ="//div[@class='_9ay7']//a[text()='Find your account and log in.']";
		public static String FacebookLoginPasswordError ="//div[@class='_9ay7']//a[text()='Forgotten password?']";


	// Excel File
		public static String ExcelFilePath="D:/Study Data/Fill Up Data.xlsx";
		public static String StatusExcelFilePath="D:/Study Data/Fill Up Data status.xlsx";

	// Iframe Handle
		public static String IframeURL="https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe";
		public static String Iframe="//iframe[@name='iframeResult']";
		public static String iframe1="//iframe[@title='W3Schools Free Online Web Tutorials']";
		public static String menu="//a[@class='w3-bar-item w3-button bar-item-hover w3-padding-24']";
}
