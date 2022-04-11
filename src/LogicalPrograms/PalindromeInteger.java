package LogicalPrograms;
import java.util.Scanner;
public class PalindromeInteger 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,a,b;
		System.out.println("Enter the Number ");
		n=sc.nextInt();
		a=n;
		String s="";
		while(n>0)
		{
			b=n%10;
			s=s+b;
			n=n/10;
		}
		if (a==Integer.parseInt(s))
			System.out.println("Number is Palindrome >> "+a);
		else
			System.out.println("Number is Not Palindrome >> "+a);
	}
}
