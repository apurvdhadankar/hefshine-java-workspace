package strings;

import java.util.Scanner;

public class BobCrushVowel1 {

	public static void main(String[] args) {
		char[] c = {'a','e','i','o','u','A','E','O','I','U'};
		
		 Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] sa = new String[n];
		for (int k = 0; k < sa.length; k++) 
		{
			sa[k] = sc.next();
			char ca[] = sa[k].toCharArray();
			boolean flag=false;
			for (int i = 0; i < ca.length; i++) 
			{
				flag=false;
				for (int j = 0; j < c.length; j++) 
				{
					if(ca[i]==c[j])
					{
						flag=true;
						break;
					}
				}
			}
			if(flag)
				System.out.println("lovely");
			else
				System.out.println("Ugly");
		}
		
	}

}
