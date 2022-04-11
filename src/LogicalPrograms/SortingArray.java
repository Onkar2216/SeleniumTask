package LogicalPrograms;

import java.util.Scanner;

public class SortingArray
{
    public static void main(String[] args)
    {
        int[] array={23,54,1,22,34,29,56};
        ascendingOrder(array);
        System.out.println();
        System.out.println();
        decendingOrder(array);
    }

    private static void decendingOrder(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            for (int j=i+1;j<array.length;j++)
            {
                if (array[i]<array[j])
                {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("************ Dscending Order ************");
        for (int i=0;i<array.length;i++)
            System.out.print(array[i]+"  ");
    }

    private static void ascendingOrder(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            for (int j=i+1;j<array.length;j++)
            {
                if (array[i]>array[j])
                {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("************ Ascending Order ************");
        for (int i=0;i<array.length;i++)
            System.out.print(array[i]+"  ");
    }
}

