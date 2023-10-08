package last_pree;

import java.util.Iterator;

public class InterLeaving {

	public static void main(String[] args) {
		char[] s1 = {'a','b','c','d'};
		char[] s2 = {'w','x','y','z','e','f','g'};
		char[] s3 = new char[s1.length+s2.length];
		
		int minLengh=0;
		int index=0;
		if(s1.length<s2.length)
		{
			minLengh = s1.length;
			for (int i = 0; i < minLengh; i++) 
			{
				s3[index++]=s1[i];
				s3[index++]=s2[i];
			}
			for (int i = minLengh; i < s2.length; i++) 
			{
				s3[index++] = s2[i];
			}
		}
		if(s1.length>s2.length)
		{
			minLengh = s2.length;
			for (int i = 0; i < minLengh; i++) 
			{
				s3[index++]=s1[i];
				s3[index++]=s2[i];
			}
			for (int i = minLengh; i < s1.length; i++) 
			{
				s3[index++] = s1[i];
			}
		}
		
		System.out.println(s3);

	}

}
