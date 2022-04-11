package LogicalPrograms;

import java.util.Scanner;

public class PalindromeString {

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
		if(str.equals(str1))
			System.out.println("String is Palindrome "+str);
		else
			System.out.println("String is not Palindrome "+str);
		sc.close();
	}

}
