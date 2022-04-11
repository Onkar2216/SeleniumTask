package LogicalPrograms;

import java.util.Scanner;

public class EvenAndOddNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The limit..");
        int limit=sc.nextInt();
        sc.close();
        System.out.println("Even Number..");
        even(limit);
        System.out.println();
        System.out.println("Odd Number..");
        odd(limit);
    }

    private static void even(int limit)
    {
        for (int i=0;i<=limit;i++)
        {
            if(i%2==0)
                System.out.print(i+" ");
        }
    }

    private static void odd(int limit)
    {
        for (int i=0;i<=limit;i++)
        {
            if(i%2!=0)
                System.out.print(i+" ");
        }
    }
}
