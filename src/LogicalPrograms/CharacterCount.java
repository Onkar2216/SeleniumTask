package LogicalPrograms;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount
{
    public static void main(String[] args) {
        String str="Onkar Balasaheb Nimbalkar";
        char[] ch=str.toCharArray();
        Map<Character,Integer> CharCount=new HashMap<>();
        for(int i=0;i<ch.length;i++)
        {
            if (CharCount.containsKey(ch[i]))
                CharCount.put(ch[i],CharCount.get(ch[i])+1);
            else
                CharCount.put(ch[i],1);
        }
        System.out.println(CharCount);
    }

}
