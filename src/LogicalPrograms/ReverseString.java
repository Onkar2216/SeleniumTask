package LogicalPrograms;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str,str1="";
		System.out.println("Enter the string...");
		str=sc.next();
		for(int i=str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		System.out.println(str1);
		sc.close();
	}

}
