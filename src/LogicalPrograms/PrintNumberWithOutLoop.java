package LogicalPrograms;

public class PrintNumberWithOutLoop
{
    public static void print(int n)
    {
        int i=0;
        if(i<=n)
        {
            System.out.print(i+" ");
            i++;
            print(i);
        }
    }
    public static void main(String[] args) {
        print(100);
    }
}
