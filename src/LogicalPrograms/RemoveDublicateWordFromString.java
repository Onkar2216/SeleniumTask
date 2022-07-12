package LogicalPrograms;

import java.util.HashSet;

public class RemoveDublicateWordFromString
{
    public static void main(String[] args) {
        String str = "This is is Java Program Java";
        ByUsingForLoop(str);
        System.out.println();
        ByUsingHashSet(str);
    }

    private static void ByUsingHashSet(String str)
    {
        String[] s=str.split(" ");
        HashSet<String> removableString=new HashSet<>();
        for(int i=0;i<s.length;i++)
        {
            removableString.add(s[i]);
        }
        System.out.println("Removable String By Using HashSet >> "+removableString);
    }

    private static void ByUsingForLoop(String str) {
        String[] s=str.split(" ");
        String str1="";
        for (int i=0;i<s.length;i++)
        {
            int count=0;
            for (int j=i+1;j<s.length;j++)
            {
                if(s[i].equals(s[j]))
                    count++;
            }
            if (count == 0)
                str1=str1 + " "+s[i];
        }
        System.out.print("Removable String By Using For loop >> "+str1);
    }


}
