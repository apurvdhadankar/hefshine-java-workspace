package StringPractise;

public class Ass_26 
{
	public static void main(String[] args) 
	{
		String s = "auuskjkshkjhfgkjkfkjgkhdfkhkjdhgkhdfkhj";
		int count = 0;
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
		System.out.println(count);
		int unilen = s.length()-count;
		System.out.println(unilen);
		char[] ca = new char[unilen];
		int caindex = 0;
		
		for (int i = 0; i < s.length(); i++) 
		{
			boolean flag = true;
			for (int j = 0; j < ca.length; j++)
			{
				
				if (ca[j] == s.charAt(i))
				{
					flag = false;
				}
			}
			if (flag) 
			{
				ca[caindex] = s.charAt(i);
				caindex++;
			}
			
		}
		s = new String(ca);
		System.out.println(s);
		
	}

}
