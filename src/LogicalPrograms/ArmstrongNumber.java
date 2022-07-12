package LogicalPrograms;

import java.util.Scanner;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        int orignal,input;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number..");
        input=sc.nextInt();
        orignal=input;
        int count=LengthCount(orignal);
        System.out.println("Number of character "+count);
        orignal=input;
        int actual=getActual(input,count);
        if(orignal==actual)
            System.out.println("Number is Armstrong "+orignal);
        else
            System.out.println("Number is Not Armstrong "+orignal);
    }

    private static int getActual(int input, int count)
    {
        int sum=1,reminder,add=0;
        while(input>0)
        {
            reminder=input%10;
            for(int k=0;k<count;k++)
            {
                sum=sum*reminder;
            }
            add=add+sum;
            input=input/10;
            sum=1;
        }
        return add;
    }

    private static int LengthCount(int orignal)
    {
        int count=0;
        while(orignal!=0)
        {
            orignal=orignal/10;
            count++;
        }
        return count;
    }
}
