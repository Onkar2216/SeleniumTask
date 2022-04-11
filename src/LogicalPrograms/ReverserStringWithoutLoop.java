package LogicalPrograms;

import java.util.Scanner;

public class ReverserStringWithoutLoop
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The First String...");
        String first=sc.nextLine();
        System.out.println("Enter The First String...");
        String last=sc.nextLine();
        reverse(first);
        reverse(last);
    }
    //SHUBHAM
    public static void reverse(String str)
    {
        if ((str==null) || (str.length() <= 1))
            System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1)); //M
            reverse(str.substring(0,str.length()-1)); //SHUBHA
        }
    }
}
