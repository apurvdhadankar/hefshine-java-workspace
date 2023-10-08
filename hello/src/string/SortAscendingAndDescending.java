package string;

import java.util.Arrays;

public class SortAscendingAndDescending {

	public static void main(String[] args) {
		String[] s = {"abkmv","kmdkd", "dkmfkml", "afknmk"};
		for (int i = 0; i < s.length; i++) 
		{
			for (int j = 0; j < s.length-1; j++) 
			{
				if(s[j].length()>s[j+1].length())
				{
					String p = s[j];
					String q = s[j+1];
					s[i]=q;
					s[j+1]=p;
				}
			}
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
	}

}
