package LogicalPrograms;

import java.util.Scanner;

public class SecondLargestNumberFromArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The size of an array....");
		n=sc.nextInt();
		int a[]= new int[n];
		System.out.println("Enter the elements..");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Input Array Elements are....");
		for(int j=0;j<n;j++)
		{
			System.out.print(" "+a[j]);
		}
		int first=0,second=0;
		for(int l=0;l<a.length;l++)
		{
			if(a[l]>a[l++])
				first=a[l];
			else if(a[l]<a[l++])
				second=a[l];
		}
		System.out.println();
		System.out.println("First Element "+first);
		System.out.println("Second Element "+second);
		
	}

}
