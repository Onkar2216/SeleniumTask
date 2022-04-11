package LogicalPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class WordsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Kiran");
		al.add("Kiran");
		al.add("Kiran1");
		al.add("Kiran1");
		al.add("Kiran1");
		al.add("Kiran2");
		
		HashMap<String,Integer> hm=new HashMap<>();
		for(String str2: al)
		{
			if(hm.containsKey(str2))
				hm.put(str2, hm.get(str2)+1);
			else
				hm.put(str2, 1);
		}
		Set<String> keys=hm.keySet();
		for(String key: keys)
			System.out.println(key+" "+hm.get(key));
	}

}
