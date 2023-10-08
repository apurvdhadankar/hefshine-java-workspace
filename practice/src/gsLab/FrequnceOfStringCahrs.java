package gsLab;

import java.util.Iterator;

public class FrequnceOfStringCahrs {

	public static void main(String[] args) {
		String s = "aaabbcccddg";
		int cnt=0;
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = i+1; j < s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					cnt++;
					break;
				}
			}
		}
//		System.out.println(cnt);
		char[] c = new char[s.length()-cnt];
		int[] a = new int[s.length()-cnt];
		int index=0;
		for (int i = 0; i < s.length(); i++) 
		{
			cnt=0;
			for (int j = 0; j < c.length; j++) 
			{
				if(s.charAt(i)==c[j])
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				c[index++] = s.charAt(i);
			}
		}
		index=1;
		for (int i = 1; i < a.length; i++) 
		{
			a[index++] = i;
		}
		for (int i = 0; i < c.length; i++) 
		{
			cnt=0;
			for (int j = 0; j < s.length(); j++) 
			{
				if(s.charAt(j)==c[i])
				{
					cnt++;
				}
			}
			System.out.println(c[i]+" "+cnt);
		}
	}

}
