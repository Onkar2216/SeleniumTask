package LogicalPrograms;

public class ReverserString {
    public static void main(String[] args) {
        String str = "Onkar Balasaheb Nimbalkar";
        String[] str1=str.split(" ");
        for(int i=0;i<str1.length;i++)
        {
            reverse(str1[i]);
            System.out.print(" ");
        }
    }
    public static void reverse(String str)
    {
        for(int i=str.length()-1;i>=0;i--)
            System.out.print(str.charAt(i));
    }
}
