package LogicalPrograms;

import java.util.Scanner;

public class DublicateNumberFromArray
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
        int DublicateNumber[]=new int[limit];
        for (int i=0;i<a.length;i++)
        {
            int count=0;
            for (int j=i+1;j<a.length;j++)
            {
                if (a[i]==a[j])
                    count++;
            }
            if (count>0)
                System.out.println(a[i]+"Count is >> "+count);
               // DublicateNumber[i]=a[i];
        }
//        for (int i = 0; i < DublicateNumber.length; i++)
//        {
//            if (DublicateNumber[i] != 0)
//                System.out.print(DublicateNumber[i]+" ");
//        }

    }
}
