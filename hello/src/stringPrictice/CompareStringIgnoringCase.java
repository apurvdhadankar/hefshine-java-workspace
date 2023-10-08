package stringPrictice;

import java.util.Arrays;

public class CompareStringIgnoringCase {

	public static void main(String[] args) {
		String s1 = "apurv";
		String s2 = "Apurv";
		s1.toLowerCase();
		System.out.println(s1);
		s2.toLowerCase();
		System.out.println(s1.compareToIgnoreCase(s2));
//		for (int i = 0; i < s1.length(); i++) 
//		{
//			if(s1.charAt(i)>'a && )
//		}
		int a[] = {2,5,8,9};
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		

	}

}
