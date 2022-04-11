package LogicalPrograms;

import java.util.Scanner;

public class LargestNumberFromArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Limit of Array..");
        int limit=sc.nextInt();
        System.out.println("Enter the array elements of Array..");
        int[] a=new int[limit];
        for (int i=0;i<a.length;i++)
            a[i]= sc.nextInt();
        int largestNumber=0;
        for (int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if (a[i]>a[j])
                    largestNumber=a[i];
            }
        }
        System.out.println("Largest Number is >> "+largestNumber);
    }
}
