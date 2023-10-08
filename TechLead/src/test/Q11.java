package test;

public class Q11 {

	public static void main(String[] args) {
		String s = "ABBBBBBBBAAAAAADEEEEEF";
		int count=0;
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = i+1; j < s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					break;
				}
			}
		}
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
				}
			}
			if(count==0)
			{
				c[index++]=s.charAt(i);
			}
		}
		for (int i = 0; i < c.length; i++) 
		{
			count=0;
			for (int j = 0; j < s.length(); j++) 
			{
				if(c[i]==s.charAt(j))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println("First Not Repeated Char is "+c[i]);
				break;
			}
		}
		
	}

}
