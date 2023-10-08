package StringPractise;

public class Ass_24 
{
	public static void main(String[] args) 
	{
		String s = "abcdabcaba";
		
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = i+1; j < s.length(); j++) 
			{
				if (s.charAt(i) == s.charAt(j)) 
				{
					cnt++;
					break;
				}
				
			}
			
		}
		
		int unilen = s.length()-cnt;
		char[] ca = new char[unilen];
		int caindex = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			boolean flag = true;
			for (int j = 0; j < ca.length; j++) 
			{
				if(ca[j] == s.charAt(i)) 
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
		
		for (int i = 0; i < ca.length; i++)
		{
			int charcnt = -1;
			for (int j = 0; j < s.length(); j++)
			{
				if(ca[i] == s.charAt(j))
				{
					charcnt++;
				}
				
			}
			if(charcnt != 0)
			{
				System.out.println(ca[i] +" has duplicate "+charcnt);
			}
			
		}
		
	}

}
