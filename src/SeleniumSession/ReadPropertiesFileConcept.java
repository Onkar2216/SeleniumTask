package SeleniumSession;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFileConcept 
{
	
	public static void main(String[] args) throws IOException 
	{
		Properties pr=new Properties();
		
		FileInputStream ip=new FileInputStream("D:\\WorkSpaces\\Testing\\SeleniumSession\\Files\\Config.properties");
		
		pr.load(ip);
		
		String FirstName=pr.getProperty("fname");
		String LastName=pr.getProperty("lname");
		String email=pr.getProperty("email");
		
		System.out.println("First NAme >> "+FirstName);
		System.out.println("Last Name >> "+LastName);
		System.out.println("Email >> "+email);
	}

}
