package LogicalPrograms;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount
{
    public static void main(String[] args) {
        String str="Onkar Balasaheb Nimbalkar";
        char[] ch=str.toCharArray();
        Map<Character,Integer> CharCount=new HashMap<>();
        for (char c : ch) {
            if (CharCount.containsKey(c))
                CharCount.put(c, CharCount.get(c) + 1);
            else
                CharCount.put(c, 1);
        }
        System.out.println(CharCount);
    }

}
