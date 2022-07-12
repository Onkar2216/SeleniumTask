package LogicalPrograms;

public class NullObjects
{
    public static void m(Object o)
    {
        System.out.println("I m in Object");
    }
    public static void m(String str)
    {
        System.out.println("I m in String");
    }
    public static void main(String[] args) {
        m(null);
    }
}
