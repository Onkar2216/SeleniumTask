package LogicalPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	static void AnagramByFunctions(String str1,String str2)
	{
		char []c1=str1.toCharArray();
		char []c2=str2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2))
			System.out.println("String "+str1+" is Anagram");
		else
			System.out.println("String "+str1+" is Not Anagram");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1,str2;
		System.out.println("Enter the first String..");
		str1=sc.next();
		System.out.println("Enter the Second String..");
		str2=sc.next();
		
		if(str1.length()==str2.length())
			AnagramByFunctions(str1,str2);
		else
			System.out.println("String is not Anagram");
		sc.close();
	}

}
