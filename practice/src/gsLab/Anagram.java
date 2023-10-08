package gsLab;

import java.util.Arrays;

public class Anagram {
	public static boolean angramOrNot(char[] c1, char[] c2)
	{
		int n1 = c1.length;
		int n2 = c2.length;
		if(n1!=n2)
			return false;
//		for (int i = 0; i < n1; i++) 
//		{
//			for (int j = i+1; j < n1; j++) 
//			{
//				if(c1[i]>c1[j])
//				{
//					char temp1 = c1[i];
//					c1[i] = c1[j];
//					c1[j] = temp1;
//					
//					char temp2 = c2[i];
//					c2[i] = c2[j];
//					c2[j] = temp2;
//				}
//			}
//		}
		Arrays.sort(c1);
		Arrays.sort(c2);
		for (int i = 0; i < n1; i++) 
		{
			if(c1[i]!=c2[i])
				return false;
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		 char c1[] = { 'l', 'i', 's', 't', 'e', 'n' };
	     char c2[] = { 's', 'i', 'l', 'e', 'n', 't' };
	     
	     if(angramOrNot(c1, c2)) 
	     {
	    	 System.out.println("Two strings are anagram");
	     }
	     else
	     {
	    	 System.out.println("Two strings are not anagram");
	     }
	     
	     
	     for (int i = 0; i < c1.length; i++) 
	 		{
	 			for (int j = i+1; j < c2.length; j++) 
	 			{
	 				if(c1[i]>c1[j])
	 				{
	 					char temp1 = c1[i];
	 					c1[i] = c1[j];
	 					c1[j] = temp1;
	 					
	 					char temp2 = c2[i];
	 					c2[i] = c2[j];
	 					c2[j] = temp2;
	 				}
	 			}
	 		}
	     
	     System.out.println(c1);
	     System.out.println(c2);

	}

}
