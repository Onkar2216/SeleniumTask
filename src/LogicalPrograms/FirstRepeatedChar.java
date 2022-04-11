package LogicalPrograms;

import java.util.Scanner;

public class FirstRepeatedChar {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter the string...");
		str=sc.next();
		sc.close();
		char[] ch=str.toCharArray();
		int k=0;
		for(int i=0;i<ch.length;i++)
		{
			int c=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					c++;
				}
			}
			if(c==1)
			{
				k++;
				if(k==1)
				{
					System.out.println("First non repeated charcter '"+ch[i]+"'");
				}
				else
				{
					System.out.println("Second non repeated charcter '"+ch[i]+"'");
					break;	
				}
			}
		}
	}

}
