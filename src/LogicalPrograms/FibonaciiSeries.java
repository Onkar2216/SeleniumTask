package LogicalPrograms;

import java.util.Scanner;

public class FibonaciiSeries
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number ");
        int fab=sc.nextInt();
        fibonacieeSeriesss(fab);
        sc.close();
    }
    private static void fibonacieeSeriesss(int fab)
    {
        int first=0,second=1,sum=0;
        for(int i=0;i<=fab;i++)
        {
            sum=first+second;
            System.out.println(sum+" ");
            first=second;
            second=sum;
        }
    }
}
