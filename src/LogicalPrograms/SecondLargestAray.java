package LogicalPrograms;
import java.util.Scanner;
import java.io.*;
public class SecondLargestAray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The size of an array....");
		int n=sc.nextInt();
		int a[]= new int[n];
		System.out.println("Enter the elements..");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();

		System.out.println("Input Array Elements are....");
		for(int j=0;j<n;j++)
			System.out.print(" "+a[j]);
		
		int temp,size=a.length;
		for(int l=0;l<size;l++)
		{
			for(int m=l+1;m<size;m++)
			{
				if(a[m]>a[l])
				{
					temp=a[l];
					a[l]=a[m];
					a[m]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Sorted Array..");
		for(int k=0;k<a.length;k++)
			System.out.print(" "+a[k]);
		System.out.println();
		System.out.println("Second Largest Number is >> "+a[1]);
	}

}
