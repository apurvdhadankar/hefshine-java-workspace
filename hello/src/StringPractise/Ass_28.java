package StringPractise;

public class Ass_28 
{
	public static void main(String[] args) 
	{
		String s = "abcdeeeeeabcdabbcaba";
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
		int[] ia = new int[unilen];
		int caind = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			boolean flag = true;
			for (int j = 0; j < ca.length; j++)
			{
				if(s.charAt(i) == ca[j])
				{
					flag = false;
				}
			}
			if (flag) 
			{
				ca[caind] = s.charAt(i);
				caind++;
			}
		}
		
		int iaind = 0;
		for (int i = 0; i < ca.length; i++)
		{
			int scnt = 0;
			for (int j = 0; j < s.length(); j++)
			{
				if(ca[i] == s.charAt(j))
				{
					scnt++;
				}
			}
			ia[iaind] = scnt;
			iaind++;
		}
		
		for (int i = 0; i < ia.length; i++)
		{
			for (int j = 0; j < ia.length-1; j++) 
			{
				if(ia[j] > ia[j+1])
				{
					int p = ia[j];
					int q = ia[j+1];
					ia[j] = q;
					ia[j+1] = p;
					
					char a = ca[j];
					char b = ca[j+1];
					ca[j] = b;
					ca[j+1] = a;
				}
			}
		}
		for (int i = 0; i < ca.length; i++)
		{
			System.out.print(ca[i]);
		}
		System.out.println();
		for (int i = 0; i < ia.length; i++)
		{
			System.out.print(ia[i]);
		}
		System.out.println();
		int c = ia[ia.length-1];
		for (int i = ia.length-1; i >= 0 ; i--)
		{
			if (ia[i] != c) 
			{
				System.out.println(ca[i]);
				break;
			}
		}
		
		
		
	}

}
