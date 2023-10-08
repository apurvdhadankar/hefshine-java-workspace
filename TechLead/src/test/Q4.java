package test;

import java.util.*;
public class Q4 {
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5,6};
		int[] b = {1,2,3,4,4,5,6,6,7};
		Arrays.sort(a);
		Arrays.sort(b);
		int acount=0;
		
		for (int i = 0; i < a.length; i++) 
		{
			acount=0;
			for (int j = 0; j < b.length; j++) 
			{
				if(a[i]==b[j])
				{
					acount++;
				}
			}
			if(acount==0)
				System.out.println(a[i]+" "+b[i]);
		}	
	}
}
