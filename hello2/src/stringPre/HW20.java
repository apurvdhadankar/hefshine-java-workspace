package stringPre;

public class HW20 {

	public static void main(String[] args) {
		String s = "apurv dhadankar";
		System.out.println("Before : "+s);
		int count=0;
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = i+1; j < s.length(); j++) 
			{
				if(s.charAt(i) == s.charAt(j))
				{
					count++;
					break;
				}
			}
		}
//		System.out.println(count);
		char[] c = new char[s.length()-count];
		int index=0;
		for (int i = 0; i < s.length(); i++) 
		{
			count=0;
			for (int j = 0; j < c.length; j++) 
			{
				if(s.charAt(i)==c[j])
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				c[index++]=s.charAt(i);
			}
		}
//		for (int i = 0; i < c.length; i++) 
//		{
//			System.out.print(c[i]+" ");
//		}
		s = new String(c);
		System.out.println("After Removing Duplicates : "+s);
		

	}

}
