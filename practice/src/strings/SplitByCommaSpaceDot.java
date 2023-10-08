package strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SplitByCommaSpaceDot {

	public static void main(String[] args) {
		String s = "hello we are the avengers, we are the most powerful"
				+ " in the whole world, anyone in the world can't defeat us";
		
		String t = "the";
		int cnt=0;
		String[] sa = s.split(" ");
		for (int i = 0; i < sa.length; i++) 
		{
			String m="";
			for (int j = 0; j < sa[i].length(); j++) 
			{
				
				m = m+sa[j];
				
			}
			System.out.println(m);
			if(m.compareTo(t)==0)
			{
				cnt++;
				break;
				
			}
			
		}
		System.out.println(cnt);
		
		LinkedHashSet<String> set = new LinkedHashSet<>();
		for (int i = 0; i < sa.length; i++) 
		{
			set.add(sa[i]);
		}
		
		System.out.println(set);
		
		
	}
}
