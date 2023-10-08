package NewBooklet;

import java.util.ArrayList;

public class Q3LongestSubsequnceInTwoStrngs {

	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "AC";
		int cnt=0;
		ArrayList<Character> s = new ArrayList<Character>();
		for (int i = 0; i < s1.length(); i++) 
		{
			for (int j = 0; j < s2.length(); j++) 
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					s.add(s2.charAt(j));
					cnt++;
					break;
				}
			}
		}
		System.out.println(s);
		System.out.println(cnt);

	}

}
