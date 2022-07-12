package LogicalPrograms;

public class LengthWithoutFun
{
    public static void main(String[] args) {
        String str="This is java program";
        // By using LastIndex()
        int no=str.lastIndexOf("");
        System.out.println("Count last>> "+no);

        // BY Using Foreach
        char[] ch=str.toCharArray();
        int count = 0;
        for (char c:ch)
        {
            count++;
        }
        System.out.println("Count >> "+count);

        //For exception
        int l=0;
        for(int i=0;;i++)
        {
            try
            {
                String s=String.valueOf(ch[i]);
                l++;
            }catch (Exception e)
            {
                System.out.println("Count Exception >> "+l);
               //System.exit(0);
                break;
            }
        }

    }
}
