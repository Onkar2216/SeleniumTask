package LogicalPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Start Number");
		int start=sc.nextInt();
		System.out.println("Enter the Second Number");
		int end=sc.nextInt();
		sc.close();
		System.out.println("********* Prime Numbers From Given Range *********");
		isPrime(start,end);
		System.out.println();
		System.out.println();
		System.out.println("********* Prime Numbers From Array *********");
		isPrimeFromArray();
		System.out.println();
		System.out.println();
		System.out.println("********* Prime Numbers From Given Number *********");
		isPrimeNumber(47);
	}

	private static void isPrimeNumber(int num)
	{
		int count=0;
		for (int i=1;i<=num;i++)
		{
			if (num % i == 0)
				count++;
		}
		if (count == 2)
			System.out.println("Given "+ num + " is Prime ");
		else
			System.out.println("Given "+ num + " is Not Prime ");
	}

	private static void isPrimeFromArray()
	{
		int[] prime={10,11,12,13,14,15,16,17,18,19,20};
		for(int i=0;i<prime.length;i++)
		{
			int count=0;
			for (int j=1;j<=prime[i];j++)
			{
				if (prime[i]%j==0)
					count++;
			}
			if (count == 2)
				System.out.print(prime[i]+" ");
		}
	}

	private static void isPrime(int start,int end)
	{
		for(int i=start;i<=end;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if( i % j == 0 )
					count++;
			}
			if(count == 2)
				System.out.print(i+" ");
		}
	}
}
