package StringPractise;

public class Ass_20 
{
	public static void main(String[] args) 
	{
		String s = "Welcome to Java World";
		char[] ca = s.toCharArray();
		int cnt = 0;
		for (int i = 0; i < ca.length; i++)
		{
			if(ca[i] == 'a')
			{
				cnt++;
			}
			
		}
		System.out.println(cnt);
		char[] nca = new char[ca.length-cnt];
		int ncai = 0;
		for (int i = 0; i < ca.length; i++) 
		{
			if(ca[i] != 'a')
			{
				nca[ncai] = ca[i];
				ncai++;
			}
			
		}
		s = new String(nca);
		System.out.println(s);

		
	}

}
