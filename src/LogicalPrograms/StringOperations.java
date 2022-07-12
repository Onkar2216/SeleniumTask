package LogicalPrograms;

import org.python.antlr.ast.Str;

import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class StringOperations
{
    public static void main(String[] args)
    {
        String str="onkar balasaheb nimbalkar";
        System.out.println("The String is >>"+str);

        //Count Character in the string
        System.out.println();
        System.out.println("********* Length Of The String **********");
        CharacterCount(str);

        //Sequence of character in string
        System.out.println();
        System.out.println("********** Separate character in the string **********");
        sequenceOfCharacter(str);

        //FInd the Length of Each String
        System.out.println();System.out.println();
        System.out.println("********** Length Of Ech String Of The Given String **********");
        findLengthOfString(str);

        //FInd the Length of Each String
        System.out.println();System.out.println();
        System.out.println("********** Convert the Each String First Character Capital **********");
        convertFirstCharInCapital(str);

        //Separate the Number and Character of Each String
        System.out.println();System.out.println();
        System.out.println("********** Separate the Number and Character of Each String **********");
        separateNumberAndCharacter("123AM256CD");

        //Separate string in EVEN and Odd Format
        System.out.println();System.out.println();
        System.out.println("********** Separate string in EVEN and Odd Format **********");
        seperateEvenAndOddString("aaa bb cc ee tt aa cc");
    }

    private static void seperateEvenAndOddString(String str)
    {
        String[] s=str.split(" ");
        StringBuffer even=new StringBuffer(),odd=new StringBuffer();
        for (int i=0;i<s.length;i++)
        {
            if (i%2==0)
                even.append(" "+s[i]);
            else
                odd.append(" "+s[i]);
        }
        System.out.println("Even String is >> "+even);
        System.out.println("Odd String is >> "+odd);
    }

    private static void separateNumberAndCharacter(String str)
    {
        String strr=str.replaceAll("[^A-Za-z]","");
        String num=str.replaceAll("[^0-9]","");
        System.out.println("String is >> "+strr);
        System.out.println("Number is >> "+num);
       /* StringBuffer string=new StringBuffer(), numbers=new StringBuffer(),spacial=new StringBuffer();
        for (int i=0;i<str.length();i++)
        {
            if (Character.isAlphabetic(str.charAt(i)))
                string.append(str.charAt(i));
            else if (Character.isDigit(str.charAt(i)))
                numbers.append(str.charAt(i));
            else
                spacial.append(str.charAt(i));
        }
        System.out.println("String is >> "+string);
        System.out.println("Number is >> "+numbers);
        System.out.println("Spacial Character is >> "+spacial); */
    }

    private static void convertFirstCharInCapital(String str)  {
        String[] s=str.split(" ");
        for (int i=0;i<s.length;i++)
        {
            String first=s[i].substring(0,1).toUpperCase(Locale.ROOT);
            String second=s[i].substring(1);
            System.out.print(first.concat(second)+" ");
        }
        throw new ArithmeticException();
    }

    private static void findLengthOfString(String str)
    {
        String[] s=str.split(" ");
        for (int i=0;i<s.length;i++)
            System.out.println("Length Of "+s[i]+" is >> "+s[i].length());
    }

    private static void sequenceOfCharacter(String str)
    {
        char[] count=str.toCharArray();
        for (int i=0;i<count.length;i++)
            System.out.print("'"+count[i]+"' ");
    }

    private static void CharacterCount(String str)
    {
        char[] count=str.toCharArray();
        System.out.println("Character in Count in The String >> "+count.length);
    }


}
