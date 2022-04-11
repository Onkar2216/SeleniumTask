package LogicalPrograms;

public class SortingArrayDesc
{
    public static void sortArray(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        for (int l=0;l<a.length;l++)
            System.out.print(" "+a[l]);
    }
    public static void main(String[] args)
    {
        int[] a={10,55,99,32,85,75};
        sortArray(a);
    }
}
