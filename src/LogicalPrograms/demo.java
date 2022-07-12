package LogicalPrograms;

public class demo
{
    public int ret()
    {
        try
        {
            int c=20/0;
            return 20;
        }catch (Exception e)
        {
            System.out.println("1");
            return 30;
        }
        finally {
            System.out.println("3");
            return 50;
        }
    }
    public static void main(String[] args) {
//        demo d=new demo();
//        int x= d.ret();
//        System.out.println("final >> "+x);
            String s1="Onkar Nimbalkar";
            s1.concat("is Software Tester");
            System.out.println(s1);
            s1=s1.concat(" in Nihilent Technology");
            System.out.println(s1);
    }
}
