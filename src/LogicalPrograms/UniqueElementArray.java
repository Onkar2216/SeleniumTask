package LogicalPrograms;

public class UniqueElementArray
{
    public static void main(String[] args) {
        int []a={1,2,3,4,5,4,3,2,1};
        for (int k : a) {
            int count = 0;
            for (int i : a) {
                if (k == i)
                    count++;
            }
            if (count == 1)
                System.out.println("Unique Element is >> " + k);
        }
    }

}
